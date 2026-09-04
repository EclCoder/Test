package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzj extends com.google.android.gms.internal.fido.zzd {
    final /* synthetic */ TaskCompletionSource zza;

    zzj(Fido2ApiClient fido2ApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzb(boolean z10) {
        this.zza.setResult(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzc(Status status) {
        this.zza.trySetException(new ApiException(status));
    }
}
