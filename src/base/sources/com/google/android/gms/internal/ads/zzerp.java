package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzerp {
    private final zzdng zza;

    public zzerp(zzdng zzdngVar) {
        this.zza = zzdngVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfkq zzfkqVar, zzfkf zzfkfVar, View view, zzerl zzerlVar) {
        zzern zzernVar = new zzern(this, new zzerm(this, zzfkfVar));
        zzdma zzdmaVarZzd = this.zza.zzd(new zzcyj(zzfkqVar, zzfkfVar, null), zzernVar);
        zzerlVar.zzd(new zzero(this, zzdmaVarZzd));
        return zzdmaVarZzd.zzh();
    }
}
