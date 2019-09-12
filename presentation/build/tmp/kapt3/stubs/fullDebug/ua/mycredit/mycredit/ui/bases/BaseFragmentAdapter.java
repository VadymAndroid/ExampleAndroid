package ua.mycredit.mycredit.ui.bases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lua/mycredit/mycredit/ui/bases/BaseFragmentAdapter;", "Landroid/support/v4/app/FragmentStatePagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "(Landroid/support/v4/app/FragmentManager;)V", "currentFragment", "Landroid/support/v4/app/Fragment;", "getCurrentFragment", "()Landroid/support/v4/app/Fragment;", "setCurrentFragment", "(Landroid/support/v4/app/Fragment;)V", "onCurrentFragmentChanged", "", "position", "", "setPrimaryItem", "container", "Landroid/view/ViewGroup;", "obj", "", "presentation_fullDebug"})
public abstract class BaseFragmentAdapter extends android.support.v4.app.FragmentStatePagerAdapter {
    @org.jetbrains.annotations.Nullable()
    private android.support.v4.app.Fragment currentFragment;
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v4.app.Fragment getCurrentFragment() {
        return null;
    }
    
    public final void setCurrentFragment(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.Fragment p0) {
    }
    
    public void onCurrentFragmentChanged(int position) {
    }
    
    @java.lang.Override()
    public void setPrimaryItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object obj) {
    }
    
    public BaseFragmentAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.FragmentManager fm) {
        super(null);
    }
}