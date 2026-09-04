package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdce implements zzimu {
    private final zzdcb zza;

    private zzdce(zzdcb zzdcbVar) {
        this.zza = zzdcbVar;
    }

    public static zzdce zzc(zzdcb zzdcbVar) {
        return new zzdce(zzdcbVar);
    }

    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
