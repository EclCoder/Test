package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqk extends zziee implements zzifq {
    private static final zzhqk zze;
    private static volatile zzifx zzf;
    private int zza;
    private int zzb;
    private zzida zzc = zzida.zza;
    private zzhqo zzd;

    static {
        zzhqk zzhqkVar = new zzhqk();
        zze = zzhqkVar;
        zziee.zzbu(zzhqk.class, zzhqkVar);
    }

    private zzhqk() {
    }

    public static zzhqk zzd(zzida zzidaVar, zzido zzidoVar) {
        return (zzhqk) zziee.zzbT(zze, zzidaVar, zzidoVar);
    }

    public static zzhqj zze() {
        return (zzhqj) zze.zzbn();
    }

    public static zzifx zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzida zzb() {
        return this.zzc;
    }

    public final zzhqo zzc() {
        zzhqo zzhqoVar = this.zzd;
        return zzhqoVar == null ? zzhqo.zzc() : zzhqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhqk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqj(bArr);
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
        synchronized (zzhqk.class) {
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

    final /* synthetic */ void zzh(zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzc = zzidaVar;
    }

    final /* synthetic */ void zzi(zzhqo zzhqoVar) {
        zzhqoVar.getClass();
        this.zzd = zzhqoVar;
        this.zza |= 1;
    }
}
