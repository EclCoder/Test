package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzecg implements zzimu {
    private final zzind zza;

    private zzecg(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static zzecg zza(zzind zzindVar, zzind zzindVar2) {
        return new zzecg(zzindVar, zzindVar2);
    }

    public static zzdkq zzc(zzecf zzecfVar, Executor executor) {
        return new zzdkq(zzecfVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzecf) this.zza.zzb(), zzfoa.zzc());
    }
}
