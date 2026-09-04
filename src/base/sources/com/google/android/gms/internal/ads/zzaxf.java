package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaxf extends zziee implements zzifq {
    private static final zzaxf zzg;
    private static volatile zzifx zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzaxf zzaxfVar = new zzaxf();
        zzg = zzaxfVar;
        zziee.zzbu(zzaxf.class, zzaxfVar);
    }

    private zzaxf() {
    }

    public static zzaxf zzd() {
        return zzg;
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzaxf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxe(bArr);
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
        synchronized (zzaxf.class) {
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
