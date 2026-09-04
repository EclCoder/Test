package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbda extends zzbdf {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbda(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        super(zzbbsVar, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", zzaxmVar, i10, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzs(zzh.longValue());
        }
    }
}
