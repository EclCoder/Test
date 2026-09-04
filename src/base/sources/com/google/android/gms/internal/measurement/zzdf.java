package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdf extends zzeo {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdf(zzez zzezVar, String str, String str2, Object obj, boolean z10) {
        super(zzezVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z10;
        Objects.requireNonNull(zzezVar);
        this.zze = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zze.zzS())).setUserProperty(this.zza, this.zzb, ObjectWrapper.wrap(this.zzc), this.zzd, this.zzi);
    }
}
