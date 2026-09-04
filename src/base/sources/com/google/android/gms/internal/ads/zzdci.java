package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdci implements zzimu {
    private final zzdcb zza;

    private zzdci(zzdcb zzdcbVar) {
        this.zza = zzdcbVar;
    }

    public static zzdci zzc(zzdcb zzdcbVar) {
        return new zzdci(zzdcbVar);
    }

    public static zzfky zzd(zzdcb zzdcbVar) {
        zzfky zzfkyVarZzb = zzdcbVar.zzb();
        zzinc.zzb(zzfkyVarZzb);
        return zzfkyVarZzb;
    }

    public final zzfky zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
