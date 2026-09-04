package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeok implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzeok(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzeok zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzeok(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeoj((Context) this.zza.zzb(), (zzdoc) this.zzb.zzb(), ((zzcoi) this.zzc).zza());
    }
}
