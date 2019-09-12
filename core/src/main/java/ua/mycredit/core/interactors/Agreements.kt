package ua.mycredit.core.interactors

import io.reactivex.Completable
import io.reactivex.Single
import ua.mycredit.core.AgreementType
import ua.mycredit.core.CompletableUseCase
import ua.mycredit.core.SingleUseCase
import java.io.File
import javax.inject.Inject


class GetAgreementUseCase @Inject constructor()
    : SingleUseCase.ParametrizedUseCase<AgreementType, File>() {

    override fun buildSingle(params: AgreementType): Single<File> =
            when (params) {

                is AgreementType.Prolongation -> networkFacade.prolongationAgreement(
                        params.prolongationId,
                        params.creditId
                )

                is AgreementType.PendingCredit -> networkFacade.creditAgreement(
                        params.creditId
                )

                is AgreementType.RestructuringAgreement ->
                    networkFacade.restructuringAgreement(
                            params.restructuringId,
                            params.creditId
                    )
            }
}


class AcceptAgreementUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<AgreementType>() {

    override fun buildCompletable(params: AgreementType): Completable =
            networkFacade.acceptAgreement(params.creditId)
}


class CPAUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<CPAUseCase.Params>() {

    override fun buildCompletable(params: Params): Completable =
            networkFacade.sendCPAData(params.cpa, params.creditId, localStorage.history.value.size.toString(),params.operation , params.promo)

    class Params(
            val cpa: String,
            val creditId: String,
            val promo: String,
            val operation: String
    )
}
