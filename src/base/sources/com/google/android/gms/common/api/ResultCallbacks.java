package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r10) {
        Status status = r10.getStatus();
        if (status.isSuccess()) {
            onSuccess(r10);
            return;
        }
        onFailure(status);
        if (r10 instanceof Releasable) {
            try {
                ((Releasable) r10).release();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e10);
            }
        }
    }

    public abstract void onSuccess(R r10);
}
