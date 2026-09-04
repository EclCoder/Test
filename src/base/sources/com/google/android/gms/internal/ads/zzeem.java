package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeem implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzeem(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        this.zza = zzindVar3;
        this.zzb = zzindVar4;
    }

    public static zzeem zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        return new zzeem(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeel zzb() {
        return new zzeel(zzfog.zzc(), zzfoa.zzc(), ((zzeez) this.zza).zzb(), zzimt.zzc(this.zzb));
    }
}
