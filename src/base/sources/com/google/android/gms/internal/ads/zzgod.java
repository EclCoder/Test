package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgod implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzgod(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzgod zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzgod(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgoc((zzgkz) this.zza.zzb(), (ExecutorService) this.zzb.zzb(), (zzgqh) this.zzc.zzb());
    }
}
