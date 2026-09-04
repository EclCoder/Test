package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzno extends zzadu implements zzafd {
    private static final zzno zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzni zze;
    private zznk zzf;

    static {
        zzno zznoVar = new zzno();
        zzg = zznoVar;
        zzadu.zzcs(zzno.class, zznoVar);
    }

    private zzno() {
    }

    public static zzno zzc(byte[] bArr, zzadf zzadfVar) {
        return (zzno) zzadu.zzcA(zzg, bArr, zzadfVar);
    }

    public static zznn zzd() {
        return (zznn) zzg.zzcn();
    }

    public final zzni zza() {
        zzni zzniVar = this.zze;
        return zzniVar == null ? zzni.zzp() : zzniVar;
    }

    public final zznk zzb() {
        zznk zznkVar = this.zzf;
        return zznkVar == null ? zznk.zza() : zznkVar;
    }

    final /* synthetic */ void zze(zzni zzniVar) {
        zzniVar.getClass();
        this.zze = zzniVar;
        this.zzb |= 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzno();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zznn(bArr);
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
        synchronized (zzno.class) {
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
}
