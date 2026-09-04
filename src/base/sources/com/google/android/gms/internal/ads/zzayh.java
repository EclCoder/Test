package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzayh extends zziee implements zzifq {
    private static final zzayh zzd;
    private static volatile zzifx zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;

    static {
        zzayh zzayhVar = new zzayh();
        zzd = zzayhVar;
        zziee.zzbu(zzayh.class, zzayhVar);
    }

    private zzayh() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzayw.zza});
        }
        if (iOrdinal == 3) {
            return new zzayh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayg(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zze;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzayh.class) {
            try {
                zzidzVar = zze;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzd);
                    zze = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }
}
