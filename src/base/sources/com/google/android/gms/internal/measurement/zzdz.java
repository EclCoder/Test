package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdz extends zzeo {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzcm zzd;
    final /* synthetic */ zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdz(zzez zzezVar, String str, String str2, boolean z10, zzcm zzcmVar) {
        super(zzezVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.zze = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zze.zzS())).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    protected final void zzb() {
        this.zzd.zzb(null);
    }
}
