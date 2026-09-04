package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzddg implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzddg(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar4;
    }

    public static zzddg zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        return new zzddg(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdde(((zzddf) this.zza).zzb(), ((zzing) this.zzb).zzb(), zzfoa.zzc(), (ScheduledExecutorService) this.zzc.zzb());
    }
}
