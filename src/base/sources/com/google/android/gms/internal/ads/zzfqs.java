package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfqs extends zziee implements zzifq {
    private static final zzfqs zzb;
    private static volatile zzifx zzc;
    private String zza = "";

    static {
        zzfqs zzfqsVar = new zzfqs();
        zzb = zzfqsVar;
        zziee.zzbu(zzfqs.class, zzfqsVar);
    }

    private zzfqs() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzfqs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqr(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzc;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzfqs.class) {
            try {
                zzidzVar = zzc;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzb);
                    zzc = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }
}
