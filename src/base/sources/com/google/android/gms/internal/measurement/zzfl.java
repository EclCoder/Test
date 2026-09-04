package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfl extends zzadu implements zzafd {
    private static final zzfl zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfl zzflVar = new zzfl();
        zzj = zzflVar;
        zzadu.zzcs(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static zzfl zzk() {
        return zzj;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", zzfj.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzfl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfi(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzk;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfl.class) {
            try {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final boolean zzi() {
        return (this.zzb & 16) != 0;
    }

    public final String zzj() {
        return this.zzi;
    }

    public final int zzm() {
        int iZza = zzfk.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
