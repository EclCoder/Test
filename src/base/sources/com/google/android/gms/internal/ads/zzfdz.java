package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdz implements zzimu {
    private final zzind zza;

    private zzfdz(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar3;
    }

    public static zzfdz zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzfdz(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdx zzb() {
        return new zzfdx(zzcrg.zza(), zzfoa.zzc(), ((zzcns) this.zza).zza());
    }
}
