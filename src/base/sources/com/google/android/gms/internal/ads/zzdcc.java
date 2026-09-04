package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdcc implements zzimu {
    private final zzdcb zza;
    private final zzind zzb;

    private zzdcc(zzdcb zzdcbVar, zzind zzindVar) {
        this.zza = zzdcbVar;
        this.zzb = zzindVar;
    }

    public static zzdcc zza(zzdcb zzdcbVar, zzind zzindVar) {
        return new zzdcc(zzdcbVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zzg((String) this.zzb.zzb());
    }
}
