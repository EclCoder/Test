package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgnq implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzgnq(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzgnq zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzgnq(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzgfc zzgfcVar = (zzgfc) this.zzb.zzb();
        final zzgqh zzgqhVar = (zzgqh) this.zzc.zzb();
        return zzgfcVar.zza(file, zzgfq.zzh(), new zzgta() { // from class: com.google.android.gms.internal.ads.zzgni
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                zzgqhVar.zzd(15308, (Throwable) obj);
                return zzgfq.zzh();
            }
        });
    }
}
