package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzayy extends zziee implements zzifq {
    private static final zzayy zzh;
    private static volatile zzifx zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        zzayy zzayyVar = new zzayy();
        zzh = zzayyVar;
        zziee.zzbu(zzayy.class, zzayyVar);
    }

    private zzayy() {
    }

    public static zzayx zza() {
        return (zzayx) zzh.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzayy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayx(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzi;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzayy.class) {
            try {
                zzidzVar = zzi;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzh);
                    zzi = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    final /* synthetic */ void zzh(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }
}
