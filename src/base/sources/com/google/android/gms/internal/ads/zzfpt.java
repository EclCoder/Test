package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfpt extends zziee implements zzifq {
    private static final zzfpt zzg;
    private static volatile zzifx zzh;
    private long zza;
    private zziem zzb = zziee.zzbC();
    private zzieq zzc = zziee.zzbM();
    private zzieq zzd = zziee.zzbM();
    private zzieq zze = zziee.zzbM();
    private zzieq zzf = zziee.zzbM();

    static {
        zzfpt zzfptVar = new zzfpt();
        zzg = zzfptVar;
        zziee.zzbu(zzfpt.class, zzfptVar);
    }

    private zzfpt() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzfpt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfps(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzh;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzfpt.class) {
            try {
                zzidzVar = zzh;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzg);
                    zzh = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }
}
