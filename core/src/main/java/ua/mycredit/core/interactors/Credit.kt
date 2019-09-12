package ua.mycredit.core.interactors

import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single
import io.reactivex.functions.BiFunction
import org.joda.time.LocalDate
import ua.mycredit.core.*
import ua.mycredit.core.Prolongation.State.*
import javax.inject.Inject
import kotlin.math.abs


class ApplyForCreditUseCase @Inject constructor(
        private val productRepo: ProductRepo
) : SingleUseCase.ParametrizedUseCase<ApplyForCreditUseCase, String>() {

    override fun buildSingle(params: ApplyForCreditUseCase): Single<String> =
            productRepo.get().flatMap { product ->
                networkFacade.applyForLoan(
                        localStorage.creditPreferences.loan.toFloat(),
                        product.amount.endInclusive.toFloat(),
                        localStorage.creditPreferences.days,
                        product.name,
                        localStorage.promoCode
                )

            }.doOnSuccess {
                localStorage.creditProduct = LocalStorage.ExpirableValue(null)
            }
}



class GetProductByPromoCodeUseCase @Inject constructor(
        private val productRepo: ProductRepo
) : SingleUseCase.SimpleUseCase<Product>() {

    override fun buildSingle(params: Nothing?): Single<Product> =
            productRepo.get()
}


class GetPaymentUrlUseCase @Inject constructor()
    : SingleUseCase.ParametrizedUseCase<GetPaymentUrlUseCase.Params, String>() {

    override fun buildSingle(params: Params): Single<String> =
            networkFacade.getPaymentUrl(params.card, params.amount)

    class Params(
            val card: Card,
            val amount: Double
    )
}


class ProlongUseCase @Inject constructor() : CompletableUseCase.ParametrizedUseCase<ProlongUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            networkFacade.currentCredit()
                    .flatMapCompletable {
                        networkFacade.prolong(it, params.date)
                    }

    class Params(val date: LocalDate)
}


class GetContractAdditionsUseCase @Inject constructor()
    : SingleUseCase.ParametrizedUseCase<Credit, List<ContractAddition>>() {

    override fun buildSingle(params: Credit): Single<List<ContractAddition>> =
            Single.zip(
                    networkFacade.restructurings(params),
                    networkFacade.getProlongations(params),
                    BiFunction { restructurings, prolongations -> prolongations + restructurings }
            )

    private fun NetworkFacade.getProlongations(credit: Credit): Single<List<Prolongation>> =
            prolongationIfLoanRolloverAvailable(credit.id)
                    .flatMap { prolongation -> detectProlongationState(credit, prolongation) }
                    .map { listOf(it) }
                    .toSingle(emptyList())

    private fun NetworkFacade.detectProlongationState(
            credit: Credit,
            prolongation: Prolongation,
            checkLastPayment: Boolean = true
    ): Maybe<Prolongation> =
            when {

                credit.prolongationAmount == 0.0 ->
                    isLoanCanBeFrontRolloved(credit.id, prolongation.lastDayIso)
                            .flatMapMaybe { canBeFrontRolloved ->

                                when {

                                    canBeFrontRolloved ->
                                        Maybe.just(
                                                prolongation.copy(state = DATE_SELECTABLE)
                                        )

                                    else -> Maybe.empty<Prolongation>()
                                }
                            }

                !checkLastPayment -> Maybe.just(
                        prolongation.copy(state = INTEREST_PAYMENT_WAITING)
                )

                else -> getLastPayment(credit.id)
                        .flatMap { payment ->
                            if (abs(payment.amount - credit.prolongationAmount) < 0.01) {
                                detectProlongationStateByPayment(prolongation, payment)
                            } else {
                                Maybe.empty()
                            }
                        }
                        .defaultIfEmpty(prolongation.copy(state = INTEREST_PAYMENT_WAITING))
            }

    private fun NetworkFacade.detectProlongationStateByPayment(
            prolongation: Prolongation,
            payment: Payment
    ): Maybe<Prolongation> =
            when (payment.state) {

                PaymentState.Successful -> currentCredit().flatMap { refreshedCredit ->
                    detectProlongationState(
                            refreshedCredit,
                            prolongation,
                            checkLastPayment = false
                    )
                }

                PaymentState.Fail -> Maybe.just(prolongation.copy(state = INTEREST_PAYMENT_WAITING))
                PaymentState.InProgress -> Maybe.just(
                        prolongation.copy(state = PAYMENT_IN_PROGRESS)
                )
            }
}


class RestructureCreditUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<RestructureCreditUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            networkFacade.restructure(params.credit, params.restructuring)

    data class Params(
            val credit: Credit,
            val restructuring: Restructuring
    )
}
