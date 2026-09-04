package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwt implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzcwt(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar2;
        this.zzb = zzindVar3;
    }

    public static zzcwt zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzcwt(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return true == Boolean.valueOf(zzcwr.zza()).booleanValue() ? ((zzeow) this.zza).zzb() : ((zzeqv) this.zzb).zzb();
    }
}
