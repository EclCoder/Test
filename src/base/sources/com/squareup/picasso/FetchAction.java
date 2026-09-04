package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class FetchAction extends Action<Object> {
    private Callback callback;
    private final Object target;

    FetchAction(Picasso picasso, Request request, int i10, int i11, Object obj, String str, Callback callback) {
        super(picasso, null, request, i10, i11, 0, null, str, obj, false);
        this.target = new Object();
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    void cancel() {
        super.cancel();
        this.callback = null;
    }

    @Override // com.squareup.picasso.Action
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.Action
    void error(Exception exc) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    @Override // com.squareup.picasso.Action
    Object getTarget() {
        return this.target;
    }
}
