package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcs extends zzbdf {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzbcs(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        super(zzbbsVar, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", zzaxmVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        this.zzd.zza("E");
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
            zzaxmVar.zza(zzh);
        }
    }
}
