package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfr extends zzadu implements zzafd {
    private static final zzfr zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zzaef zzh = zzadu.zzcy();

    static {
        zzfr zzfrVar = new zzfr();
        zzi = zzfrVar;
        zzadu.zzcs(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfr zzi() {
        return zzi;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", zzfp.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzfr();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzfo(bArr);
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
        synchronized (zzfr.class) {
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

    public final int zzh() {
        return this.zzh.size();
    }

    public final int zzk() {
        int iZza = zzfq.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
