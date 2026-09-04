package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeij implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;
    private final zzind zzd;
    private final zzind zze;

    private zzeij(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7, zzind zzindVar8) {
        this.zza = zzindVar;
        this.zzb = zzindVar4;
        this.zzc = zzindVar5;
        this.zzd = zzindVar6;
        this.zze = zzindVar8;
    }

    public static zzeij zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4, zzind zzindVar5, zzind zzindVar6, zzind zzindVar7, zzind zzindVar8) {
        return new zzeij(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5, zzindVar6, zzindVar7, zzindVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeii(((zzcns) this.zza).zza(), zzfoa.zzc(), zzcos.zza(), ((zzcoe) this.zzb).zzb(), ((zzeir) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), zzcop.zza(), (zzfqj) this.zze.zzb());
    }
}
