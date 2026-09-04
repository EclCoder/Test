package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfaq implements zzimu {
    private final zzind zza;

    private zzfaq(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar2;
    }

    public static zzfaq zzc(zzind zzindVar, zzind zzindVar2) {
        return new zzfaq(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfao zzb() {
        return new zzfao(zzfoa.zzc(), ((zzcns) this.zza).zza());
    }
}
