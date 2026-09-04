package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvu implements zzimu {
    private final zzcvs zza;

    private zzcvu(zzcvs zzcvsVar) {
        this.zza = zzcvsVar;
    }

    public static zzcvu zzc(zzcvs zzcvsVar) {
        return new zzcvu(zzcvsVar);
    }

    public static View zzd(zzcvs zzcvsVar) {
        View viewZzb = zzcvsVar.zzb();
        zzinc.zzb(viewZzb);
        return viewZzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
