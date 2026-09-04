package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdk extends zzeo {
    final /* synthetic */ zzdd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzez zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdk(zzez zzezVar, zzdd zzddVar, String str, String str2) {
        super(zzezVar, true);
        this.zza = zzddVar;
        this.zzb = str;
        this.zzc = str2;
        Objects.requireNonNull(zzezVar);
        this.zzd = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzd.zzS())).setCurrentScreenByScionActivityInfo(this.zza, this.zzb, this.zzc, this.zzi);
    }
}
