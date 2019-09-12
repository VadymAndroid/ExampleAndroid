package ua.mycredit.mycredit.generated.callback;
public final class OnTabSelectedListener implements com.aurelhubert.ahbottomnavigation.AHBottomNavigation.OnTabSelectedListener {
    final Listener mListener;
    final int mSourceId;
    public OnTabSelectedListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public boolean onTabSelected(int callbackArg_0, boolean callbackArg_1) {
        return mListener._internalCallbackOnTabSelected(mSourceId , callbackArg_0, callbackArg_1);
    }
    public interface Listener {
        boolean _internalCallbackOnTabSelected(int sourceId , int callbackArg_0, boolean callbackArg_1);
    }
}