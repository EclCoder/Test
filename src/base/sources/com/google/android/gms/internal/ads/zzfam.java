package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfam implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzfam(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        this.zza = zzindVar2;
        this.zzb = zzindVar3;
        this.zzc = zzindVar4;
    }

    public static zzfam zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        return new zzfam(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfak(zzfoa.zzc(), ((zzdci) this.zza).zza(), (PackageInfo) this.zzb.zzb(), ((zzcnm) this.zzc).zzb());
    }
}
