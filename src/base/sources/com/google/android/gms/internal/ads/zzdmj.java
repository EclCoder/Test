package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmj implements zzimu {
    private final zzind zza;

    private zzdmj(zzdmd zzdmdVar, zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzdmj zza(zzdmd zzdmdVar, zzind zzindVar) {
        return new zzdmj(zzdmdVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdkq((zzdbk) this.zza.zzb(), zzcfr.zzh));
        zzinc.zzb(setSingleton);
        return setSingleton;
    }
}
