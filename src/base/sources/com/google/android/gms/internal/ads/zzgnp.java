package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgnp implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzgnp(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzgnp zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzgnp(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzgfc zzgfcVar = (zzgfc) this.zzb.zzb();
        final zzgqh zzgqhVar = (zzgqh) this.zzc.zzb();
        return zzgfcVar.zzb(file, new byte[0], new zzgta() { // from class: com.google.android.gms.internal.ads.zzgnh
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                zzgqhVar.zzd(15309, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
