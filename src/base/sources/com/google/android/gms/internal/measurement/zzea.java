package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzea extends zzeo {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzea(zzez zzezVar, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(zzezVar, false);
        this.zza = str;
        this.zzb = obj;
        Objects.requireNonNull(zzezVar);
        this.zzc = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzc.zzS())).logHealthData(5, this.zza, ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
