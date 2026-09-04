package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzal extends com.google.android.gms.internal.location.zzah {
    final /* synthetic */ TaskCompletionSource zza;

    zzal(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) {
        Status status = zzaaVar.getStatus();
        if (status == null) {
            this.zza.trySetException(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.getStatusCode() == 0) {
            this.zza.setResult(Boolean.TRUE);
        } else {
            this.zza.trySetException(ApiExceptionUtil.fromStatus(status));
        }
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
