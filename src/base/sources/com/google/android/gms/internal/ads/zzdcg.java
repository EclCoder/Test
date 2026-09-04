package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdcg implements zzimu {
    private final zzind zza;

    private zzdcg(zzdcb zzdcbVar, zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzdcg zzc(zzdcb zzdcbVar, zzind zzindVar) {
        return new zzdcg(zzdcbVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strZzp = ((zzczj) this.zza.zzb()).zzp();
        zzinc.zzb(strZzp);
        return strZzp;
    }
}
