package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfpv extends zziee implements zzifq {
    private static final zzfpv zzc;
    private static volatile zzifx zzd;
    private int zza;
    private long zzb;

    static {
        zzfpv zzfpvVar = new zzfpv();
        zzc = zzfpvVar;
        zziee.zzbu(zzfpv.class, zzfpvVar);
    }

    private zzfpv() {
    }

    public static zzfpu zza() {
        return (zzfpu) zzc.zzbn();
    }

    final /* synthetic */ void zzb(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ void zzd(int i10) {
        this.zza = i10 - 2;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfpv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpu(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzd;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzfpv.class) {
            try {
                zzidzVar = zzd;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzc);
                    zzd = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }
}
