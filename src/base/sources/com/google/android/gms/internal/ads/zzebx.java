package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzebx implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;
    private final zzind zzd;
    private final zzind zze;
    private final zzind zzf;
    private final zzind zzg;
    private final zzind zzh;
    private final zzind zzi;

    private zzebx(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7, zzind zzindVar8, zzind zzindVar9, zzind zzindVar10) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar5;
        this.zze = zzindVar6;
        this.zzf = zzindVar7;
        this.zzg = zzindVar8;
        this.zzh = zzindVar9;
        this.zzi = zzindVar10;
    }

    public static zzebx zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7, zzind zzindVar8, zzind zzindVar9, zzind zzindVar10) {
        return new zzebx(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5, zzindVar6, zzindVar7, zzindVar8, zzindVar9, zzindVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebw((Executor) this.zza.zzb(), ((zzcns) this.zzb).zza(), ((zzcnt) this.zzc).zza(), zzfoa.zzc(), (zzdxc) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdzw) this.zzf.zzb(), ((zzcoi) this.zzg).zza(), ((zzdjy) this.zzh).zzb(), (zzfqj) this.zzi.zzb());
    }
}
