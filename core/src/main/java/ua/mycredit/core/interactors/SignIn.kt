package ua.mycredit.core.interactors

import io.reactivex.Completable
import io.reactivex.Single
import ua.mycredit.core.*
import java.net.SocketTimeoutException
import javax.inject.Inject


class SignInUseCase @Inject constructor(
        private val profileRepo: ProfileRepo
) : CompletableUseCase.ParametrizedUseCase<SignInUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            with(networkFacade) {
                with(localStorage) {
                    with(params) {
                        when (mode) {

                            Params.Mode.LOGIN -> login(phone.toLocalPhone(), password)
                                    .toSingleDefault(Unit)
                                    .flatMap { profileRepo.get() }
                                    .doOnSuccess {
                                        profile = it.copy(phone = phone)
                                        dataProcessAllowed = profile.dataProcessAllowed
                                    }
                                    .toCompletable()

                            Params.Mode.SIGN_UP -> signUp(phone.toLocalPhone(), password)
                        }
                    }
                }
            }


    data class Params(
            val phone: String,
            val password: String,
            val mode: Mode
    ) {
        enum class Mode {
            LOGIN, SIGN_UP
        }
    }
}


class RequestSmsIfPhoneValidUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<RequestSmsIfPhoneValidUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            networkFacade
                    .checkPhoneRegistered(params.phone)
                    .flatMapCompletable { registered ->
                        when {
                            registered -> Completable.error(PhoneInDbException())

                            else -> networkFacade.requestSms(params.phone)
                                    .onErrorComplete { e -> e is SocketTimeoutException } // SMS service issues
                        }
                    }

    class Params(val phone: String)

    class PhoneInDbException : Exception()
}


class CheckTinUseCase @Inject constructor()
    : SingleUseCase.ParametrizedUseCase<CheckTinUseCase.Params, Boolean>() {

    override fun buildSingle(params: Params): Single<Boolean> =
            networkFacade.checkTINIsInBd(params.tin)
                    .flatMap {
                        when {
                            it -> Single.error(TinInDbException())
                            else -> Single.just(it)
                        }
                    }

    class Params(val tin: String)

    class TinInDbException : Exception()
}


class VerifySmsCodeUseCase @Inject constructor()
    : SingleUseCase.ParametrizedUseCase<VerifySmsCodeUseCase.Params, Boolean>() {

    override fun buildSingle(params: Params): Single<Boolean> =
            networkFacade.verifySmsCode(params.phone.toLocalPhone(), params.code)

    class Params(
            val phone: String,
            val code: String
    )
}


class RequestResetPasswordSmsUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<RequestResetPasswordSmsUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            networkFacade.requestResetPasswordSms(params.phone.toLocalPhone())

    class Params(val phone: String)
}

class PhoneOptionsUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<PhoneOptionsUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            networkFacade.sendPhoneOptions(params.phoneOptions)

    class Params(val phoneOptions: PhoneOptions)
}


class PhoneContactsUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<PhoneContactsUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            networkFacade.sendPhoneContacts(params.contacts)

    class Params(val contacts: ArrayList<Contacts>)
}


class ResetPasswordUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<ResetPasswordUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            with(params) {
                networkFacade.resetPassword(phone.toLocalPhone(), code, newPassword)
            }

    data class Params(
            val phone: String,
            val code: String,
            val newPassword: String
    )
}
