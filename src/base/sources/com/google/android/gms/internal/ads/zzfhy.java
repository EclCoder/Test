package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfhy implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzfhy(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzfhy zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzfhy(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfhw zzb() {
        Context context = (Context) this.zza.zzb();
        zzfmj zzfmjVar = (zzfmj) this.zzb.zzb();
        zzfnb zzfnbVar = (zzfnb) this.zzc.zzb();
        zzcey zzceyVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhm)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z10 = false;
        if (zzceyVarZzi != null && zzceyVarZzi.zzi()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhC)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhl)).booleanValue() || z10) {
                zzfna zzfnaVarZza = zzfnbVar.zza(zzfmr.AppOpen, context, zzfmjVar, new zzfgz(new zzfgy()));
                zzfhn zzfhnVar = new zzfhn(new zzfhm());
                zzfmn zzfmnVar = zzfnaVarZza.zza;
                zzhcg zzhcgVar = zzcfr.zza;
                return new zzfhd(zzfhnVar, new zzfhj(zzfmnVar, zzhcgVar), zzfnaVarZza.zzb, zzfmnVar.zze().zzf, zzhcgVar);
            }
        }
        return new zzfhm();
    }
}
