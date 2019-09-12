package ua.mycredit.mycredit.generated.callback;
public final class OnFocusChangeListener implements android.view.View.OnFocusChangeListener {
    final Listener mListener;
    final int mSourceId;
    public OnFocusChangeListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void onFocusChange(android.view.View callbackArg_0, boolean callbackArg_1) {
        mListener._internalCallbackOnFocusChange(mSourceId , callbackArg_0, callbackArg_1);
    }
    public interface Listener {
        void _internalCallbackOnFocusChange(int sourceId , android.view.View callbackArg_0, boolean callbackArg_1);
    }
}