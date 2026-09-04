package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgjh implements zzimu {
    private final zzind zza;

    private zzgjh(zzgjg zzgjgVar, zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzgjh zza(zzgjg zzgjgVar, zzind zzindVar) {
        return new zzgjh(zzgjgVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgfr zzgfrVarZza = ((zzggi) this.zza.zzb()).zza().zza();
        zzinc.zzb(zzgfrVarZza);
        return zzgfrVarZza;
    }
}
