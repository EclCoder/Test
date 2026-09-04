package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class StatusCallback extends IStatusCallback.Stub {
    private final BaseImplementation.ResultHolder<Status> resultHolder;

    public StatusCallback(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.resultHolder = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        this.resultHolder.setResult(status);
    }
}
