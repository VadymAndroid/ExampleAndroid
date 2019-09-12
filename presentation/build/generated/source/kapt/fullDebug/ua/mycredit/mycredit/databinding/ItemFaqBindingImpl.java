package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemFaqBindingImpl extends ItemFaqBinding implements ua.mycredit.mycredit.generated.callback.OnClickListener.Listener, ua.mycredit.mycredit.generated.callback.OnExpansionUpdateListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final net.cachapa.expandablelayout.ExpandableLayout mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final net.cachapa.expandablelayout.ExpandableLayout.OnExpansionUpdateListener mCallback46;
    // values
    // listeners
    private OnPhoneClickImpl mViewModelOnPhoneClickUaMycreditMycreditUiOnPhoneClick;
    // Inverse Binding Event Handlers

    public ItemFaqBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemFaqBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (net.cachapa.expandablelayout.ExpandableLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.question.setTag(null);
        setRootTag(root);
        // listeners
        mCallback45 = new ua.mycredit.mycredit.generated.callback.OnClickListener(this, 1);
        mCallback46 = new ua.mycredit.mycredit.generated.callback.OnExpansionUpdateListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity.FaqAdapter.FaqViewHolder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity.FaqAdapter.FaqViewHolder ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelExpanded((android.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelQuestion((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelAnswer((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelExpanded(android.databinding.ObservableBoolean ViewModelExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelQuestion(android.databinding.ObservableField<java.lang.String> ViewModelQuestion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAnswer(android.databinding.ObservableField<java.lang.String> ViewModelAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.databinding.ObservableBoolean viewModelExpanded = null;
        ua.mycredit.mycredit.ui.OnPhoneClick viewModelOnPhoneClickUaMycreditMycreditUiOnPhoneClick = null;
        android.databinding.ObservableField<java.lang.String> viewModelQuestion = null;
        java.lang.String viewModelQuestionGet = null;
        int viewModelExpandedInt180Int0 = 0;
        java.lang.String viewModelAnswerGet = null;
        boolean viewModelExpandedGet = false;
        android.databinding.ObservableField<java.lang.String> viewModelAnswer = null;
        ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity.FaqAdapter.FaqViewHolder viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.expanded
                        viewModelExpanded = viewModel.getExpanded();
                    }
                    updateRegistration(0, viewModelExpanded);


                    if (viewModelExpanded != null) {
                        // read viewModel.expanded.get()
                        viewModelExpandedGet = viewModelExpanded.get();
                    }
                if((dirtyFlags & 0x19L) != 0) {
                    if(viewModelExpandedGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.expanded.get() ? 180 : 0
                    viewModelExpandedInt180Int0 = ((viewModelExpandedGet) ? (180) : (0));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onPhoneClick
                        viewModelOnPhoneClickUaMycreditMycreditUiOnPhoneClick = (((mViewModelOnPhoneClickUaMycreditMycreditUiOnPhoneClick == null) ? (mViewModelOnPhoneClickUaMycreditMycreditUiOnPhoneClick = new OnPhoneClickImpl()) : mViewModelOnPhoneClickUaMycreditMycreditUiOnPhoneClick).setValue(viewModel));
                        // read viewModel.answer
                        viewModelAnswer = viewModel.getAnswer();
                    }
                    updateRegistration(2, viewModelAnswer);


                    if (viewModelAnswer != null) {
                        // read viewModel.answer.get()
                        viewModelAnswerGet = viewModelAnswer.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.question
                        viewModelQuestion = viewModel.getQuestion();
                    }
                    updateRegistration(1, viewModelQuestion);


                    if (viewModelQuestion != null) {
                        // read viewModel.question.get()
                        viewModelQuestionGet = viewModelQuestion.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback45);
            this.mboundView3.setOnExpansionUpdateListener(mCallback46);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.mboundView2.setRotation(viewModelExpandedInt180Int0);
            }
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.doSetExpanded(this.mboundView3, viewModelExpandedGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            ua.mycredit.mycredit.ui.BindingAdaptersKt.setFaq(this.mboundView4, viewModelAnswerGet, (ua.mycredit.mycredit.ui.OnPhoneClick)viewModelOnPhoneClickUaMycreditMycreditUiOnPhoneClick);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.question, viewModelQuestionGet);
        }
    }
    // Listener Stub Implementations
    public static class OnPhoneClickImpl implements ua.mycredit.mycredit.ui.OnPhoneClick{
        private ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity.FaqAdapter.FaqViewHolder value;
        public OnPhoneClickImpl setValue(ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity.FaqAdapter.FaqViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(java.lang.String arg0) {
            this.value.onPhoneClick(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity.FaqAdapter.FaqViewHolder viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onQuestion();
        }
    }
    public final void _internalCallbackOnExpansionUpdate(int sourceId , float callbackArg_0, int callbackArg_1) {
        // localize variables for thread safety
        // viewModel
        ua.mycredit.mycredit.ui.profile.profile.faq.FaqActivity.FaqAdapter.FaqViewHolder viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.onExpansion(callbackArg_1);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.expanded
        flag 1 (0x2L): viewModel.question
        flag 2 (0x3L): viewModel.answer
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.expanded.get() ? 180 : 0
        flag 6 (0x7L): viewModel.expanded.get() ? 180 : 0
    flag mapping end*/
    //end
}