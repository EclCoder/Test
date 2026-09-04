package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegp implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzegp(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar3;
    }

    public static zzegp zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzegp(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzego zzb() {
        return new zzego(((zzinb) this.zza).zzd(), zzfoa.zzc(), ((zzdfw) this.zzb).zzb());
    }
}
