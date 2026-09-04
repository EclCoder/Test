package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcdt implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzcdt(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzcdt zzc(zzind zzindVar, zzind zzindVar2) {
        return new zzcdt(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcds zzb() {
        return new zzcds((Clock) this.zza.zzb(), (zzcdq) this.zzb.zzb());
    }
}
