package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzjy extends zzkp {
    final /* synthetic */ TaskCompletionSource zza;

    zzjy(zzkk zzkkVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzkkVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zzb(Status status, byte[] bArr) {
        if (!status.isSuccess()) {
            TaskUtil.setResultOrApiException(status, null, this.zza);
            return;
        }
        try {
            TaskUtil.setResultOrApiException(status, zzno.zzc(bArr, zzadf.zza()), this.zza);
        } catch (zzaeh e10) {
            this.zza.setException(e10);
        }
    }
}
