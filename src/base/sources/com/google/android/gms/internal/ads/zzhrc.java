package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhrc extends zziee implements zzifq {
    private static final zzhrc zzd;
    private static volatile zzifx zze;
    private int zza;
    private zzhre zzb;
    private int zzc;

    static {
        zzhrc zzhrcVar = new zzhrc();
        zzd = zzhrcVar;
        zziee.zzbu(zzhrc.class, zzhrcVar);
    }

    private zzhrc() {
    }

    public static zzhrc zzc(zzida zzidaVar, zzido zzidoVar) {
        return (zzhrc) zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static zzhrb zzd() {
        return (zzhrb) zzd.zzbn();
    }

    public final zzhre zza() {
        zzhre zzhreVar = this.zzb;
        return zzhreVar == null ? zzhre.zzc() : zzhreVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrb(bArr);
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
        synchronized (zzhrc.class) {
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

    final /* synthetic */ void zze(zzhre zzhreVar) {
        zzhreVar.getClass();
        this.zzb = zzhreVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i10) {
        this.zzc = i10;
    }
}
