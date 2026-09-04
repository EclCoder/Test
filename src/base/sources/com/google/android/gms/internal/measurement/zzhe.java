package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhe extends zzadu implements zzafd {
    private static final zzhe zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzhe zzheVar = new zzhe();
        zzl = zzheVar;
        zzadu.zzcs(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    public static zzhd zzi() {
        return (zzhd) zzl.zzcn();
    }

    public static zzhe zzj() {
        return zzl;
    }

    public final boolean zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zzg;
    }

    public final boolean zzd() {
        return this.zzh;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzhe();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhd(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzm;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhe.class) {
            try {
                zzadqVar = zzm;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzl);
                    zzm = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final boolean zzh() {
        return this.zzk;
    }

    final /* synthetic */ void zzk(boolean z10) {
        this.zzb |= 1;
        this.zze = z10;
    }

    final /* synthetic */ void zzl(boolean z10) {
        this.zzb |= 2;
        this.zzf = z10;
    }

    final /* synthetic */ void zzm(boolean z10) {
        this.zzb |= 4;
        this.zzg = z10;
    }

    final /* synthetic */ void zzn(boolean z10) {
        this.zzb |= 8;
        this.zzh = z10;
    }

    final /* synthetic */ void zzo(boolean z10) {
        this.zzb |= 16;
        this.zzi = z10;
    }

    final /* synthetic */ void zzp(boolean z10) {
        this.zzb |= 32;
        this.zzj = z10;
    }

    final /* synthetic */ void zzq(boolean z10) {
        this.zzb |= 64;
        this.zzk = z10;
    }
}
