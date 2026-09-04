package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzetl implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;
    private final zzind zzd;
    private final zzind zze;
    private final zzind zzf;
    private final zzind zzg;
    private final zzind zzh;
    private final zzind zzi;

    private zzetl(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7, zzind zzindVar8, zzind zzindVar9) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
        this.zze = zzindVar5;
        this.zzf = zzindVar6;
        this.zzg = zzindVar7;
        this.zzh = zzindVar8;
        this.zzi = zzindVar9;
    }

    public static zzetl zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7, zzind zzindVar8, zzind zzindVar9) {
        return new zzetl(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5, zzindVar6, zzindVar7, zzindVar8, zzindVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetk((Context) this.zza.zzb(), (com.google.android.gms.ads.internal.client.zzr) this.zzb.zzb(), (String) this.zzc.zzb(), (zzfii) this.zzd.zzb(), (zzetc) this.zze.zzb(), (zzfjj) this.zzf.zzb(), ((zzcoi) this.zzg).zza(), (zzbap) this.zzh.zzb(), (zzdzl) this.zzi.zzb());
    }
}
