package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzihr extends zziee implements zzifq {
    private static final zzihr zzd;
    private static volatile zzifx zze;
    private int zza;
    private String zzb = "";
    private zziem zzc = zziee.zzbC();

    static {
        zzihr zzihrVar = new zzihr();
        zzd = zzihrVar;
        zziee.zzbu(zzihr.class, zzihrVar);
    }

    private zzihr() {
    }

    public static zzihq zzc() {
        return (zzihq) zzd.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzihr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzihq(bArr);
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
        synchronized (zzihr.class) {
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

    final /* synthetic */ void zze(int i10) {
        this.zza = 15;
    }
}
