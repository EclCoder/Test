package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeym implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzeym(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzeym zza(zzind zzindVar, zzind zzindVar2) {
        return new zzeym(zzindVar, zzindVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgww zzgwwVarZzh;
        zzezk zzezkVarZzb = ((zzezm) this.zza).zzb();
        Context contextZza = ((zzcns) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmN)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(contextZza)) {
                zzgwwVarZzh = zzgww.zzi(zzezkVarZzb);
            } else {
                zzgwwVarZzh = zzgww.zzh();
            }
        } else {
            zzgwwVarZzh = zzgww.zzh();
        }
        zzinc.zzb(zzgwwVarZzh);
        return zzgwwVarZzh;
    }
}
