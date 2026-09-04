package com.google.android.gms.internal.ads;

import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzilu extends zziee implements zzifq {
    private static final zzilu zzf;
    private static volatile zzifx zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private zzieq zze = zziee.zzbM();

    static {
        zzilu zziluVar = new zzilu();
        zzf = zziluVar;
        zziee.zzbu(zzilu.class, zziluVar);
    }

    private zzilu() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzifx zzifxVar = zzg;
                                if (zzifxVar == null) {
                                    synchronized (zzilu.class) {
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
                                return zzifxVar;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new zzilt(bArr);
                }
                return new zzilu();
            }
            return zziee.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", SVWsZyNSAChGIA.fzqW, "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
