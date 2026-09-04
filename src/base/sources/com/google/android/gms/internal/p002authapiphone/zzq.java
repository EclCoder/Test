package com.google.android.gms.internal.p002authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzq extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002authapiphone.zzg
    public final void zzb(Status status, boolean z10) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z10), this.zza);
    }
}
