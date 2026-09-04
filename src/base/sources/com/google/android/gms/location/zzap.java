package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzap implements RemoteCall<com.google.android.gms.internal.location.zzaz, TaskCompletionSource<Boolean>> {
    private boolean zza = true;

    protected zzap() {
    }

    protected final boolean zza() {
        return this.zza;
    }

    final void zzb(boolean z10) {
        this.zza = false;
    }
}
