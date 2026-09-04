package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzftc implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzftc(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzftc zza(zzind zzindVar, zzind zzindVar2) {
        return new zzftc(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzftb((zzfth) this.zza.zzb(), (zzfss) this.zzb.zzb());
    }
}
