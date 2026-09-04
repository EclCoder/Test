package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnr implements zzimu {
    private final zzind zza;

    private zzcnr(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzcnr zza(zzind zzindVar) {
        return new zzcnr(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcns) this.zza).zza().getApplicationInfo();
        zzinc.zzb(applicationInfo);
        return applicationInfo;
    }
}
