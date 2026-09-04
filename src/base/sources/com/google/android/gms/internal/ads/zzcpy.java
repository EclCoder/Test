package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpy implements zzfjz {
    final zzind zza;
    final zzind zzb;
    final zzind zzc;
    final zzind zzd;
    final zzind zze;
    final zzind zzf;
    final zzind zzg;
    final zzind zzh;
    private final zzcox zzi;

    zzcpy(zzcox zzcoxVar, Context context, String str) {
        this.zzi = zzcoxVar;
        zzimu zzimuVarZza = zzimv.zza(context);
        this.zza = zzimuVarZza;
        zzind zzindVar = zzcoxVar.zzby;
        zzfhz zzfhzVarZzc = zzfhz.zzc(zzimuVarZza, zzindVar, zzcoxVar.zzbz);
        this.zzb = zzfhzVarZzc;
        zzind zzindVarZza = zzimt.zza(zzfjk.zza(zzindVar));
        this.zzc = zzindVarZza;
        zzind zzindVarZza2 = zzimt.zza(zzfkw.zza());
        this.zzd = zzindVarZza2;
        zzind zzindVarZza3 = zzimt.zza(zzfjt.zza(zzimuVarZza, zzcoxVar.zza, zzcoxVar.zzaf, zzfhzVarZzc, zzindVarZza, zzfla.zza(), zzindVarZza2));
        this.zze = zzindVarZza3;
        this.zzf = zzimt.zza(zzfkd.zza(zzindVarZza3, zzindVarZza, zzindVarZza2));
        zzimu zzimuVarZzc = zzimv.zzc(str);
        this.zzg = zzimuVarZzc;
        this.zzh = zzimt.zza(zzfjx.zza(zzimuVarZzc, zzindVarZza3, zzimuVarZza, zzindVarZza, zzindVarZza2, zzcoxVar.zzi, zzcoxVar.zzai, zzcoxVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfkc zza() {
        return (zzfkc) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfjw zzb() {
        return (zzfjw) this.zzh.zzb();
    }
}
