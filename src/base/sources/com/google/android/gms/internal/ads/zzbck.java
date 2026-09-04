package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbck extends zzbdf {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzbck(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        super(zzbbsVar, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", zzaxmVar, i10, 82);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzV(zzh);
        }
    }
}
