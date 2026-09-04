package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdi extends zzeo {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcm zzc;
    final /* synthetic */ zzez zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdi(zzez zzezVar, String str, String str2, zzcm zzcmVar) {
        super(zzezVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.zzd = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzd.zzS())).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    protected final void zzb() {
        this.zzc.zzb(null);
    }
}
