package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfh extends zzadu implements zzafd {
    private static final zzfh zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzfr zze;
    private zzfl zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzfh zzfhVar = new zzfh();
        zzi = zzfhVar;
        zzadu.zzcs(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    public static zzfh zzj() {
        return zzi;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final zzfr zzb() {
        zzfr zzfrVar = this.zze;
        return zzfrVar == null ? zzfr.zzi() : zzfrVar;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final zzfl zzd() {
        zzfl zzflVar = this.zzf;
        return zzflVar == null ? zzfl.zzk() : zzflVar;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzfh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfg(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfh.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final boolean zzh() {
        return (this.zzb & 8) != 0;
    }

    public final String zzi() {
        return this.zzh;
    }

    final /* synthetic */ void zzk(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }
}
