package ua.mycredit.core.interactors

import io.reactivex.Completable
import io.reactivex.Observable
import ua.mycredit.core.*
import javax.inject.Inject


class LoadHistoryUseCase @Inject constructor()
    : UseCase.ParametrizedUseCase<BaseUseCase.ReloadCriteria, List<Credit>>() {

    override fun buildObservable(params: ReloadCriteria): Observable<List<Credit>> =
            lazyRepo(LocalStorage::history) { facade ->
                facade.history().map { it.reversed() }
            }.get(params)
}


class EditPasswordUseCase @Inject constructor()
    : CompletableUseCase.ParametrizedUseCase<EditPasswordUseCase.Params>() {

    override fun buildCompletable(params: Params) =
            networkFacade.editPassword(params.current, params.new)

    class Params(val current: String, val new: String)
}


class LoadProfileUseCase @Inject constructor(
        private val profileRepo: ProfileRepo
) : SingleUseCase.SimpleUseCase<Profile>() {
    override fun buildSingle(params: Nothing?) = profileRepo.get()
}


class UpdateProfileUseCase @Inject constructor(
        private val profileRepo: ProfileRepo
) : CompletableUseCase.SimpleUseCase() {

    override fun buildCompletable(params: Nothing?): Completable =
            profileRepo.update().toCompletable()
}
