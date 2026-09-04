package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwc implements zzimu {
    private final zzcvs zza;
    private final zzind zzb;

    private zzcwc(zzcvs zzcvsVar, zzind zzindVar) {
        this.zza = zzcvsVar;
        this.zzb = zzindVar;
    }

    public static zzcwc zza(zzcvs zzcvsVar, zzind zzindVar) {
        return new zzcwc(zzcvsVar, zzindVar);
    }

    public static Set zzc(zzcvs zzcvsVar, zzcxi zzcxiVar) {
        Set setSingleton = Collections.singleton(new zzdkq(zzcxiVar, zzcfr.zzh));
        zzinc.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcxi) this.zzb.zzb());
    }
}
