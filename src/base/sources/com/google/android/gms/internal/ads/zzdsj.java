package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdsj implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzdsj(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzdsj zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzdsj(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsi((com.google.android.gms.ads.internal.util.zzbl) this.zza.zzb(), (Clock) this.zzb.zzb(), zzfoa.zzc());
    }
}
