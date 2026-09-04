package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqs extends zziee implements zzifq {
    private static final zzhqs zzd;
    private static volatile zzifx zze;
    private int zza;
    private zzhqw zzb;
    private zzhsl zzc;

    static {
        zzhqs zzhqsVar = new zzhqs();
        zzd = zzhqsVar;
        zziee.zzbu(zzhqs.class, zzhqsVar);
    }

    private zzhqs() {
    }

    public static zzhqs zzc(zzida zzidaVar, zzido zzidoVar) {
        return (zzhqs) zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static zzhqr zzd() {
        return (zzhqr) zzd.zzbn();
    }

    public final zzhqw zza() {
        zzhqw zzhqwVar = this.zzb;
        return zzhqwVar == null ? zzhqw.zzd() : zzhqwVar;
    }

    public final zzhsl zzb() {
        zzhsl zzhslVar = this.zzc;
        return zzhslVar == null ? zzhsl.zzg() : zzhslVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqr(bArr);
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
        synchronized (zzhqs.class) {
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

    final /* synthetic */ void zze(zzhqw zzhqwVar) {
        zzhqwVar.getClass();
        this.zzb = zzhqwVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhsl zzhslVar) {
        zzhslVar.getClass();
        this.zzc = zzhslVar;
        this.zza |= 2;
    }
}
