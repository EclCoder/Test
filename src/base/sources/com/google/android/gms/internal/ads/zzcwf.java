package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwf implements zzimu {
    private final zzind zza;

    private zzcwf(zzcvs zzcvsVar, zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzcwf zza(zzcvs zzcvsVar, zzind zzindVar) {
        return new zzcwf(zzcvsVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdkq((zzcxi) this.zza.zzb(), zzcfr.zzh));
        zzinc.zzb(setSingleton);
        return setSingleton;
    }
}
