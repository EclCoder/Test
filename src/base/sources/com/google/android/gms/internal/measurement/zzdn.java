package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdn extends zzeo {
    final /* synthetic */ zzez zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdn(zzez zzezVar) {
        super(zzezVar, true);
        Objects.requireNonNull(zzezVar);
        this.zza = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        zzez zzezVar = this.zza;
        if (zzezVar.zzP()) {
            ((zzcp) Preconditions.checkNotNull(zzezVar.zzS())).resetAnalyticsDataWithElapsedTime(this.zzi, this.zzj);
        } else {
            ((zzcp) Preconditions.checkNotNull(zzezVar.zzS())).resetAnalyticsData(this.zzi);
        }
    }
}
