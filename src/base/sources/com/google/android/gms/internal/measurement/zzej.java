package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzej extends zzeo {
    final /* synthetic */ zzep zza;
    final /* synthetic */ zzez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzej(zzez zzezVar, zzep zzepVar) {
        super(zzezVar, true);
        this.zza = zzepVar;
        Objects.requireNonNull(zzezVar);
        this.zzb = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzb.zzS())).setEventInterceptor(this.zza);
    }
}
