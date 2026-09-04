package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfeh implements zzimu {
    private final zzind zza;

    private zzfeh(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar3;
    }

    public static zzfeh zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzfeh(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfef zzb() {
        return new zzfef(zzcri.zza(), zzfoa.zzc(), ((zzfeq) this.zza).zza());
    }
}
