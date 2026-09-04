package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhq extends zzadu implements zzafd {
    private static final zzhq zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        zzhq zzhqVar = new zzhq();
        zzg = zzhqVar;
        zzadu.zzcs(zzhq.class, zzhqVar);
    }

    private zzhq() {
    }

    public static zzhp zze() {
        return (zzhp) zzg.zzcn();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final long zzd() {
        return this.zzf;
    }

    final /* synthetic */ void zzf(int i10) {
        this.zzb |= 1;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzhq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhp(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhq.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }

    final /* synthetic */ void zzh(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }
}
