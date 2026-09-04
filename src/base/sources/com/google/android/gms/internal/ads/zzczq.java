package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzczq implements zzimu {
    private final zzind zza;

    private zzczq(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static zzczq zza(zzind zzindVar, zzind zzindVar2) {
        return new zzczq(zzindVar, zzindVar2);
    }

    public static zzdkq zzc(zzctv zzctvVar, Executor executor) {
        return new zzdkq(zzctvVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzctv) this.zza.zzb(), zzfoa.zzc());
    }
}
