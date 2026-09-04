package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzv extends com.google.android.gms.internal.fido.zzf {
    final /* synthetic */ TaskCompletionSource zza;

    zzv(Fido2PrivilegedApiClient fido2PrivilegedApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void zzb(List list) {
        this.zza.setResult(list);
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void zzc(Status status) {
        this.zza.trySetException(new ApiException(status));
    }
}
