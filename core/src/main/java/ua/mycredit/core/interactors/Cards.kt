package ua.mycredit.core.interactors

import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import ua.mycredit.core.*
import javax.inject.Inject

class LoadCardsUseCase @Inject constructor()
    : UseCase.ParametrizedUseCase<BaseUseCase.ReloadCriteria, List<Card>>() {

    override fun buildObservable(params: ReloadCriteria): Observable<List<Card>> =
            lazyRepo(LocalStorage::cards) { facade ->
                facade.getCards()
                        .map { cards ->
                            cards.sortedByDescending(Card::verified)
                                    .sortedByDescending(Card::main)
                        }
            }.get(params)
}


class MarkAsMainUseCase @Inject constructor() : CompletableUseCase.ParametrizedUseCase<Card>() {

    override fun buildCompletable(params: Card): Completable =
            networkFacade.markAsMain(params)
}


class VerifyCardUseCase @Inject constructor() : SingleUseCase.ParametrizedUseCase<Card, CardVerificationType>() {

    override fun buildSingle(params: Card): Single<CardVerificationType> =
            when {
                params.id.isEmpty() -> networkFacade.addCard(params)
                else -> Single.just(params)
            }.flatMap(networkFacade::getCardVerificationResult)
}


class DeleteCardUseCase @Inject constructor() : CompletableUseCase.ParametrizedUseCase<Card>() {

    override fun buildCompletable(params: Card): Completable =
            networkFacade.deleteCard(params)
                    .flatMapCompletable {
                        when (it.number) {
                            params.number -> Completable.complete()
                            else -> Completable.error(Exception("card not removed"))
                        }
                    }
}
