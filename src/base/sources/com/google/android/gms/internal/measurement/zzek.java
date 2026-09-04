package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzek extends zzeo {
    final /* synthetic */ Intent zza;
    final /* synthetic */ zzez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzek(zzez zzezVar, Intent intent) {
        super(zzezVar, true);
        this.zza = intent;
        Objects.requireNonNull(zzezVar);
        this.zzb = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzb.zzS())).setSgtmDebugInfo(this.zza);
    }
}
