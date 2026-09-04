package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfco implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzfco(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar3;
        this.zzc = zzindVar4;
    }

    public static zzfco zzc(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        return new zzfco(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfcn zzb() {
        return new zzfcn(((zzcns) this.zza).zza(), zzfoa.zzc(), ((zzing) this.zzb).zzb(), (zzfqg) this.zzc.zzb());
    }
}
