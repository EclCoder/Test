package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpn implements zzebd {
    final zzind zza;
    final zzind zzb;
    final zzind zzc;
    final zzind zzd;
    private final Context zze;
    private final zzbqq zzf;
    private final zzcox zzg;
    private final zzcpn zzh = this;

    zzcpn(zzcox zzcoxVar, Context context, zzbqq zzbqqVar) {
        this.zzg = zzcoxVar;
        this.zze = context;
        this.zzf = zzbqqVar;
        zzimu zzimuVarZza = zzimv.zza(this);
        this.zza = zzimuVarZza;
        zzimu zzimuVarZza2 = zzimv.zza(zzbqqVar);
        this.zzb = zzimuVarZza2;
        zzeaz zzeazVarZzc = zzeaz.zzc(zzimuVarZza2);
        this.zzc = zzeazVarZzc;
        this.zzd = zzimt.zza(zzebb.zza(zzimuVarZza, zzeazVarZzc));
    }

    final zzeay zza() {
        return zzeaz.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzebd
    public final zzeba zzb() {
        return (zzeba) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebd
    public final zzeav zzc() {
        return new zzcpk(this.zzg, this.zzh, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
