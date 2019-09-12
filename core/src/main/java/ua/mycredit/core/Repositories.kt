package ua.mycredit.core

import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.reflect.KMutableProperty1


class LazyRepo<T>(
        private val storage: LocalStorage,
        private val facade: NetworkFacade,
        private val cache: KMutableProperty1<LocalStorage, LocalStorage.ExpirableValue<T>>,
        private val update: (NetworkFacade) -> Single<T>) {

    fun get(criteria: BaseUseCase.ReloadCriteria): Observable<T> =
            cache.get(storage).let { cached ->
                when {
                    criteria == BaseUseCase.ReloadCriteria.FORCED || cached.expired ->
                        update(facade)
                                .doOnSuccess { cache.set(storage, LocalStorage.ExpirableValue(it)) }
                                .toObservable()
                                .startWith(cached.value)

                    else -> Observable.just(cached.value)
                }
            }
}


@Singleton
class ProductRepo @Inject constructor(
        private val facade: NetworkFacade,
        private val storage: LocalStorage
) {

    @Suppress("DEPRECATION")
    fun get(): Single<Product> =
            with(storage.creditProduct) {
                when {
                    expired || value == null || value.promoCode != storage.promoCode -> reload()
                    else -> Single.just(value)
                }
            }

    private fun reload(): Single<Product> = storage.promoCode.let { promoCode ->
        when {
            promoCode.isEmpty() -> Single.just(true)
            else -> facade.validatePromoCode(promoCode)
        }.flatMap { valid ->
            when {
                valid -> facade.getCreditProducts(promoCode)
                else -> {
                    storage.promoCode = ""
                    Single.error(WrongPromoCodeException())
                }
            }
        }.retry { e ->
            e !is RuntimeException && e !is WrongPromoCodeException
        }.flatMap { products ->
            when (products.size) {
                0 -> Single.error(ProductNotFoundException())
                1 -> Single.just(products[0])
                else -> Single.just(products.first { it.default || it.usePromo })
            }
        }.doOnSuccess {
            storage.creditProduct = LocalStorage.ExpirableValue(it)
        }
    }


    class WrongPromoCodeException : Exception()
    class ProductNotFoundException : Exception()
}


@Suppress("DEPRECATION")
@Singleton
class ProfileRepo @Inject constructor(
        private val facade: NetworkFacade,
        private val storage: LocalStorage) {

    fun get(): Single<Profile> =
            facade.profile()
                    .doOnSuccess { profile ->
                        storage.profile =
                                profile.copy(
                                        synched = true,
                                        phone = profile.phone.takeIf { it.isNotEmpty() }
                                                ?: storage.profile.phone // backend issues
                                )
                    }

    fun update(profile: Profile = storage.profile): Single<Profile> =
            facade.update(
                    profile,
                    dataProcessAllowed = storage.dataProcessAllowed,
                    mailSubscription = storage.mailSubscription
            ).toSingleDefault(Unit)
                    .flatMap { get() }
}
