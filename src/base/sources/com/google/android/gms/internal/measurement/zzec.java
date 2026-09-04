package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzec extends zzeo {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzcm zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzec(zzez zzezVar, Bundle bundle, zzcm zzcmVar) {
        super(zzezVar, true);
        this.zza = bundle;
        this.zzb = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.zzc = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzc.zzS())).performAction(this.zza, this.zzb, this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    protected final void zzb() {
        this.zzb.zzb(null);
    }
}
