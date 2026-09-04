package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeft implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;
    private final zzind zzd;
    private final zzind zze;
    private final zzind zzf;
    private final zzind zzg;
    private final zzind zzh;
    private final zzind zzi;
    private final zzind zzj;

    private zzeft(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7, zzind zzindVar8, zzind zzindVar9, zzind zzindVar10, zzind zzindVar11, zzind zzindVar12, zzind zzindVar13) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
        this.zze = zzindVar6;
        this.zzf = zzindVar7;
        this.zzg = zzindVar8;
        this.zzh = zzindVar11;
        this.zzi = zzindVar12;
        this.zzj = zzindVar13;
    }

    public static zzeft zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7, zzind zzindVar8, zzind zzindVar9, zzind zzindVar10, zzind zzindVar11, zzind zzindVar12, zzind zzindVar13) {
        return new zzeft(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5, zzindVar6, zzindVar7, zzindVar8, zzindVar9, zzindVar10, zzindVar11, zzindVar12, zzindVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefs zzb() {
        return new zzefs((zzcnj) this.zza.zzb(), ((zzcns) this.zzb).zza(), ((zzcoi) this.zzc).zza(), ((zzdci) this.zzd).zza(), zzfoa.zzc(), (String) this.zze.zzb(), (zzfqg) this.zzf.zzb(), (zzdzg) this.zzg.zzb(), zzcos.zza(), zzcop.zza(), (ScheduledExecutorService) this.zzh.zzb(), (zzfsc) this.zzi.zzb(), ((zzdfw) this.zzj).zzb());
    }
}
