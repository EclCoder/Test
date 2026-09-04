package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmi implements zzimu {
    private final zzdmd zza;

    private zzdmi(zzdmd zzdmdVar) {
        this.zza = zzdmdVar;
    }

    public static zzdmi zzc(zzdmd zzdmdVar) {
        return new zzdmi(zzdmdVar);
    }

    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
