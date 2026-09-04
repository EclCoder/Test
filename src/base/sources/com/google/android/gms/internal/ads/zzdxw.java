package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdxw implements zzimu {
    private final zzind zza;

    private zzdxw(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar2;
    }

    public static zzdxw zza(zzind zzindVar, zzind zzindVar2) {
        return new zzdxw(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhcg zzhcgVarZzc = zzfoa.zzc();
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzge)).booleanValue() ? Collections.singleton(new zzdkq(((zzdyp) this.zza).zzb(), zzhcgVarZzc)) : Collections.EMPTY_SET;
        zzinc.zzb(setSingleton);
        return setSingleton;
    }
}
