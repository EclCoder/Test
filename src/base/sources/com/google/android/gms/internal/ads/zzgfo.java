package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgfo extends zziee implements zzifq {
    private static final zzgfo zzf;
    private static volatile zzifx zzg;
    private int zza;
    private zzgfq zzb;
    private zzida zzc;
    private zzida zzd;
    private int zze;

    static {
        zzgfo zzgfoVar = new zzgfo();
        zzf = zzgfoVar;
        zziee.zzbu(zzgfo.class, zzgfoVar);
    }

    private zzgfo() {
        zzida zzidaVar = zzida.zza;
        this.zzc = zzidaVar;
        this.zzd = zzidaVar;
    }

    public static zzgfn zzd() {
        return (zzgfn) zzf.zzbn();
    }

    public final zzgfq zza() {
        zzgfq zzgfqVar = this.zzb;
        return zzgfqVar == null ? zzgfq.zzh() : zzgfqVar;
    }

    public final zzida zzb() {
        return this.zzc;
    }

    public final zzida zzc() {
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
            return zziee.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzgge.zza});
        }
        if (iOrdinal == 3) {
            return new zzgfo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgfn(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzg;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzgfo.class) {
            try {
                zzidzVar = zzg;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzf);
                    zzg = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }

    final /* synthetic */ void zze(zzgfq zzgfqVar) {
        zzgfqVar.getClass();
        this.zzb = zzgfqVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 2;
        this.zzc = zzidaVar;
    }

    final /* synthetic */ void zzh(zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 4;
        this.zzd = zzidaVar;
    }

    public final int zzj() {
        int iZza = zzggf.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    final /* synthetic */ void zzk(int i10) {
        this.zze = i10 - 1;
        this.zza |= 8;
    }
}
