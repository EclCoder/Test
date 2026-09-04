package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzikd extends zziee implements zzifq {
    private static final zzikd zzf;
    private static volatile zzifx zzg;
    private int zza;
    private String zzb = "";
    private zzieq zzc = zziee.zzbM();
    private zzieq zzd = zziee.zzbM();
    private String zze = "";

    static {
        zzikd zzikdVar = new zzikd();
        zzf = zzikdVar;
        zziee.zzbu(zzikd.class, zzikdVar);
    }

    private zzikd() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzikd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzikc(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzg;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzikd.class) {
            try {
                zzidzVar = zzg;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzf);
                    zzg = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }
}
