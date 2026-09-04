package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaxd extends zziee implements zzifq {
    private static final zzaxd zzh;
    private static volatile zzifx zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzaxd zzaxdVar = new zzaxd();
        zzh = zzaxdVar;
        zziee.zzbu(zzaxd.class, zzaxdVar);
    }

    private zzaxd() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzaxd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxc(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzi;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzaxd.class) {
            try {
                zzidzVar = zzi;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzh);
                    zzi = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }
}
