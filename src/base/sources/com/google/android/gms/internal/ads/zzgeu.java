package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgeu implements zzimu {
    private final zzind zza;

    private zzgeu(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzgeu zza(zzind zzindVar) {
        return new zzgeu(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgfc((ExecutorService) this.zza.zzb());
    }
}
