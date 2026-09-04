package com.google.android.gms.internal.ads;

import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcp extends zzbdf {
    private final zzbbk zzh;

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzaj(zzaya.zza(iIntValue));
        }
    }

    public zzbcp(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11, zzbbk zzbbkVar) {
        super(zzbbsVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", QGbBllacZSmHKn.YRnVx, zzaxmVar, i10, 94);
        this.zzh = zzbbkVar;
    }
}
