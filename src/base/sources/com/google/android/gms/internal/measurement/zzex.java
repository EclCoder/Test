package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzex extends zzeo {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzey zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzex(zzey zzeyVar, Activity activity) {
        super(zzeyVar.zza, true);
        this.zza = activity;
        Objects.requireNonNull(zzeyVar);
        this.zzb = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzb.zza.zzS())).onActivityDestroyedByScionActivityInfo(zzdd.zza(this.zza), this.zzj);
    }
}
