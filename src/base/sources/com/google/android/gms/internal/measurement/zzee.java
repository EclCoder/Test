package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzee extends zzeo {
    final /* synthetic */ zzcm zza;
    final /* synthetic */ zzez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzee(zzez zzezVar, zzcm zzcmVar) {
        super(zzezVar, true);
        this.zza = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.zzb = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzb.zzS())).getAppInstanceId(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    protected final void zzb() {
        this.zza.zzb(null);
    }
}
