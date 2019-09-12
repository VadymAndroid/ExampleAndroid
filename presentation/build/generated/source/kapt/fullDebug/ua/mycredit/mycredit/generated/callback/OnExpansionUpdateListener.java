package ua.mycredit.mycredit.generated.callback;
public final class OnExpansionUpdateListener implements net.cachapa.expandablelayout.ExpandableLayout.OnExpansionUpdateListener {
    final Listener mListener;
    final int mSourceId;
    public OnExpansionUpdateListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void onExpansionUpdate(float callbackArg_0, int callbackArg_1) {
        mListener._internalCallbackOnExpansionUpdate(mSourceId , callbackArg_0, callbackArg_1);
    }
    public interface Listener {
        void _internalCallbackOnExpansionUpdate(int sourceId , float callbackArg_0, int callbackArg_1);
    }
}