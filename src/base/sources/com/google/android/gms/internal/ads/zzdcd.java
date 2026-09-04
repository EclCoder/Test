package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdcd implements zzimu {
    private final zzdcb zza;
    private final zzind zzb;

    private zzdcd(zzdcb zzdcbVar, zzind zzindVar) {
        this.zza = zzdcbVar;
        this.zzb = zzindVar;
    }

    public static zzdcd zza(zzdcb zzdcbVar, zzind zzindVar) {
        return new zzdcd(zzdcbVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzf = this.zza.zzf(((zzcns) this.zzb).zza());
        zzinc.zzb(contextZzf);
        return contextZzf;
    }
}
