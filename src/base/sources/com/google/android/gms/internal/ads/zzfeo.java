package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfeo implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzfeo(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar2;
        this.zzb = zzindVar3;
    }

    public static zzfeo zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzfeo(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfem zzb() {
        return new zzfem(zzcrk.zza(), (ScheduledExecutorService) this.zza.zzb(), ((zzcns) this.zzb).zza());
    }
}
