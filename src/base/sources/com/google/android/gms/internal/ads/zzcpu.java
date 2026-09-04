package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpu implements zzehj {
    final zzind zza;
    final zzind zzb;
    private final zzcox zzc;
    private final zzcpu zzd = this;

    zzcpu(zzcox zzcoxVar, Context context) {
        this.zzc = zzcoxVar;
        zzeir zzeirVarZzc = zzeir.zzc(zzcoxVar.zzaG);
        this.zza = zzeirVarZzc;
        this.zzb = zzeij.zza(zzcoxVar.zzf, zzfoa.zza(), zzcor.zza, zzcoxVar.zzaF, zzeirVarZzc, zzcoxVar.zzaH, zzcoo.zza, zzcoxVar.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final zzehn zza() {
        zzcox zzcoxVar = this.zzc;
        zzind zzindVar = zzcoxVar.zzp;
        zzcnl zzcnlVarZzI = zzcoxVar.zzI();
        return zzeho.zza(zzcns.zzd(zzcoxVar.zzI()), zzfog.zzc(), zzfoa.zzc(), zzimt.zzc(this.zzb), zzcoi.zzd(zzcnlVarZzI), this, (zzdzl) zzindVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final zzehp zzb() {
        return new zzcpv(this.zzc, this.zzd, null);
    }
}
