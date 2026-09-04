package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzexn implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzexn(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar4;
    }

    public static zzexn zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        return new zzexn(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewy(((zzewk) this.zza).zzb(), ((Long) zzbkf.zzb.zze()).longValue(), (Clock) this.zzb.zzb(), zzfoa.zzc(), (zzdzl) this.zzc.zzb());
    }
}
