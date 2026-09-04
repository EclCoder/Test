package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhsl extends zziee implements zzifq {
    private static final zzhsl zze;
    private static volatile zzifx zzf;
    private int zza;
    private zzhsn zzb;
    private int zzc;
    private int zzd;

    static {
        zzhsl zzhslVar = new zzhsl();
        zze = zzhslVar;
        zziee.zzbu(zzhsl.class, zzhslVar);
    }

    private zzhsl() {
    }

    public static zzhsl zzd(zzida zzidaVar, zzido zzidoVar) {
        return (zzhsl) zziee.zzbT(zze, zzidaVar, zzidoVar);
    }

    public static zzhsk zze() {
        return (zzhsk) zze.zzbn();
    }

    public static zzhsl zzg() {
        return zze;
    }

    public final zzhsn zza() {
        zzhsn zzhsnVar = this.zzb;
        return zzhsnVar == null ? zzhsn.zzd() : zzhsnVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhsl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsk(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzf;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzhsl.class) {
            try {
                zzidzVar = zzf;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zze);
                    zzf = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }

    final /* synthetic */ void zzh(zzhsn zzhsnVar) {
        zzhsnVar.getClass();
        this.zzb = zzhsnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zzc = i10;
    }
}
