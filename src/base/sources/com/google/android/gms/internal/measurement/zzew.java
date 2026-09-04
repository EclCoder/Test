package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzew extends zzeo {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzcm zzb;
    final /* synthetic */ zzey zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzew(zzey zzeyVar, Activity activity, zzcm zzcmVar) {
        super(zzeyVar.zza, true);
        this.zza = activity;
        this.zzb = zzcmVar;
        Objects.requireNonNull(zzeyVar);
        this.zzc = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        ((zzcp) Preconditions.checkNotNull(this.zzc.zza.zzS())).onActivitySaveInstanceStateByScionActivityInfo(zzdd.zza(this.zza), this.zzb, this.zzj);
    }
}
