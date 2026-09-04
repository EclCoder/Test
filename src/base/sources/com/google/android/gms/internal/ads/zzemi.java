package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzemi implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzemi(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzemi zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzemi(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemh((Context) this.zza.zzb(), (zzcuz) this.zzb.zzb(), zzfoa.zzc());
    }
}
