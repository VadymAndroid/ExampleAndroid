package ua.mycredit.mycredit.ui.bases.input;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\r\u0010\t\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH$J\b\u0010\r\u001a\u00020\fH\u0015R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/SimpleFormViewModel;", "P", "", "Lua/mycredit/mycredit/ui/bases/input/FormViewModel;", "()V", "sendForm", "Lua/mycredit/core/CompletableUseCase$ParametrizedUseCase;", "getSendForm", "()Lua/mycredit/core/CompletableUseCase$ParametrizedUseCase;", "collectFields", "()Ljava/lang/Object;", "onFormSent", "", "onReadyToSend", "FormSendingObserver", "presentation_fullRelease"})
public abstract class SimpleFormViewModel<P extends java.lang.Object> extends ua.mycredit.mycredit.ui.bases.input.FormViewModel {
    
    @org.jetbrains.annotations.NotNull()
    protected abstract ua.mycredit.core.CompletableUseCase.ParametrizedUseCase<P> getSendForm();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract P collectFields();
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    protected void onReadyToSend() {
    }
    
    protected abstract void onFormSent();
    
    public SimpleFormViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lua/mycredit/mycredit/ui/bases/input/SimpleFormViewModel$FormSendingObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel$BaseCompletableObserver;", "Lua/mycredit/mycredit/ui/bases/BaseViewModel;", "(Lua/mycredit/mycredit/ui/bases/input/SimpleFormViewModel;)V", "onComplete", "", "presentation_fullRelease"})
    final class FormSendingObserver extends ua.mycredit.mycredit.ui.bases.BaseViewModel.BaseCompletableObserver {
        
        @java.lang.Override()
        public void onComplete() {
        }
        
        public FormSendingObserver() {
            super(0, false);
        }
    }
}