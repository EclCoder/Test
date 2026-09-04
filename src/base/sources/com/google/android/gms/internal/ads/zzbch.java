package com.google.android.gms.internal.ads;

import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbch extends zzbdf {
    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        zzaxm zzaxmVar = this.zzd;
        zzaxmVar.zzd(-1L);
        zzaxmVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzaxmVar) {
            try {
                zzaxmVar.zzd(iArr[0]);
                zzaxmVar.zze(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    zzaxmVar.zzO(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzbch(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        super(zzbbsVar, YSHErhbVu.prybASovFrBF, "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", zzaxmVar, i10, 5);
    }
}
