package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepg implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzepg(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzepg zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzepg(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzepf zzb() {
        return new zzepf((zzflr) this.zza.zzb(), (zzdwz) this.zzb.zzb(), (zzdzl) this.zzc.zzb());
    }
}
