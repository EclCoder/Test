package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdl implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;
    private final zzind zzd;
    private final zzind zze;

    private zzfdl(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7) {
        this.zza = zzindVar2;
        this.zzb = zzindVar3;
        this.zzc = zzindVar5;
        this.zzd = zzindVar6;
        this.zze = zzindVar7;
    }

    public static zzfdl zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7) {
        return new zzfdl(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5, zzindVar6, zzindVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdj zzb() {
        return new zzfdj(zzcrm.zza(), ((zzcns) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfoa.zzc(), ((zzfer) this.zzc).zzb().intValue(), ((zzfes) this.zzd).zzb().booleanValue(), ((zzfet) this.zze).zzb().booleanValue());
    }
}
