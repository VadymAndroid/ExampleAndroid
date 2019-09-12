package ua.mycredit.mycredit.databinding;
import ua.mycredit.mycredit.R;
import ua.mycredit.mycredit.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPersonalDataBindingImpl extends FragmentPersonalDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"input_field_hint_static", "input_field_hint_static", "input_field_hint_static", "input_field", "input_field"},
            new int[] {1, 2, 3, 4, 5},
            new int[] {R.layout.input_field_hint_static, R.layout.input_field_hint_static, R.layout.input_field_hint_static, R.layout.input_field, R.layout.input_field});
        sViewsWithIds = null;
    }
    // views
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldHintStaticBinding mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView01;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldHintStaticBinding mboundView02;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldHintStaticBinding mboundView03;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView04;
    @Nullable
    private final ua.mycredit.mycredit.databinding.InputFieldBinding mboundView05;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPersonalDataBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentPersonalDataBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (ua.mycredit.mycredit.databinding.InputFieldHintStaticBinding) bindings[1];
        setContainedBinding(this.mboundView0);
        this.mboundView01 = (android.widget.LinearLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.mboundView02 = (ua.mycredit.mycredit.databinding.InputFieldHintStaticBinding) bindings[2];
        setContainedBinding(this.mboundView02);
        this.mboundView03 = (ua.mycredit.mycredit.databinding.InputFieldHintStaticBinding) bindings[3];
        setContainedBinding(this.mboundView03);
        this.mboundView04 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[4];
        setContainedBinding(this.mboundView04);
        this.mboundView05 = (ua.mycredit.mycredit.databinding.InputFieldBinding) bindings[5];
        setContainedBinding(this.mboundView05);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        mboundView0.invalidateAll();
        mboundView02.invalidateAll();
        mboundView03.invalidateAll();
        mboundView04.invalidateAll();
        mboundView05.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        if (mboundView02.hasPendingBindings()) {
            return true;
        }
        if (mboundView03.hasPendingBindings()) {
            return true;
        }
        if (mboundView04.hasPendingBindings()) {
            return true;
        }
        if (mboundView05.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView0.setLifecycleOwner(lifecycleOwner);
        mboundView02.setLifecycleOwner(lifecycleOwner);
        mboundView03.setLifecycleOwner(lifecycleOwner);
        mboundView04.setLifecycleOwner(lifecycleOwner);
        mboundView05.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelSurname = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelPatronymic = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelTin = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelBirthDay = null;
        ua.mycredit.mycredit.ui.bases.input.FieldViewModel viewModelName = null;
        ua.mycredit.mycredit.ui.authentication.registration.passport.personal.PersonalDataViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.surname
                    viewModelSurname = viewModel.getSurname();
                    // read viewModel.patronymic
                    viewModelPatronymic = viewModel.getPatronymic();
                    // read viewModel.tin
                    viewModelTin = viewModel.getTin();
                    // read viewModel.birthDay
                    viewModelBirthDay = viewModel.getBirthDay();
                    // read viewModel.name
                    viewModelName = viewModel.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView0.setHintStatic(getRoot().getResources().getString(R.string.hint_surname));
            this.mboundView02.setHintStatic(getRoot().getResources().getString(R.string.hint_name));
            this.mboundView03.setHintStatic(getRoot().getResources().getString(R.string.hint_patronymic));
            this.mboundView04.setDrawableEnd(getDrawableFromResource(getRoot(), R.drawable.ic_arrow_drop_down_selector));
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setViewModel(viewModelSurname);
            this.mboundView02.setViewModel(viewModelName);
            this.mboundView03.setViewModel(viewModelPatronymic);
            this.mboundView04.setViewModel(viewModelBirthDay);
            this.mboundView05.setViewModel(viewModelTin);
        }
        executeBindingsOn(mboundView0);
        executeBindingsOn(mboundView02);
        executeBindingsOn(mboundView03);
        executeBindingsOn(mboundView04);
        executeBindingsOn(mboundView05);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}