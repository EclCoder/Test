package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zbag extends zbt {
    final /* synthetic */ TaskCompletionSource zba;

    zbag(zbaj zbajVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p001authapi.zbu
    public final void zbb(Status status, SavePasswordResult savePasswordResult) {
        TaskUtil.setResultOrApiException(status, savePasswordResult, this.zba);
    }
}
