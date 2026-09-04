package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeai implements zzimu {
    private final zzind zza;

    private zzeai(zzeaa zzeaaVar, zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static zzeai zza(zzeaa zzeaaVar, zzind zzindVar, zzind zzindVar2) {
        return new zzeai(zzeaaVar, zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzh = zzeaa.zzh((zzeak) this.zza.zzb(), zzfoa.zzc());
        zzinc.zzb(setZzh);
        return setZzh;
    }
}
