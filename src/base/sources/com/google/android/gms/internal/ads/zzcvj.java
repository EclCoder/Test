package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvj implements zzimu {
    private final zzcvi zza;

    private zzcvj(zzcvi zzcviVar) {
        this.zza = zzcviVar;
    }

    public static zzcvj zzc(zzcvi zzcviVar) {
        return new zzcvj(zzcviVar);
    }

    public final ViewGroup zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
