package ua.mycredit.mycredit.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ItemDetailSectionBinding extends ViewDataBinding {
  @Bindable
  protected int mTitleRes;

  @Bindable
  protected boolean mIsValid;

  @Bindable
  protected View.OnClickListener mOnClick;

  protected ItemDetailSectionBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTitleRes(int titleRes);

  public int getTitleRes() {
    return mTitleRes;
  }

  public abstract void setIsValid(boolean isValid);

  public boolean getIsValid() {
    return mIsValid;
  }

  public abstract void setOnClick(@Nullable View.OnClickListener onClick);

  @Nullable
  public View.OnClickListener getOnClick() {
    return mOnClick;
  }

  @NonNull
  public static ItemDetailSectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemDetailSectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemDetailSectionBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_detail_section, root, attachToRoot, component);
  }

  @NonNull
  public static ItemDetailSectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemDetailSectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemDetailSectionBinding>inflate(inflater, ua.mycredit.mycredit.R.layout.item_detail_section, null, false, component);
  }

  public static ItemDetailSectionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemDetailSectionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemDetailSectionBinding)bind(component, view, ua.mycredit.mycredit.R.layout.item_detail_section);
  }
}
