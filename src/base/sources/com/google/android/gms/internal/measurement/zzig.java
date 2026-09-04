package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzig extends zzadu implements zzafd {
    private static final zzig zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze = 1;
    private zzaef zzf = zzadu.zzcy();

    static {
        zzig zzigVar = new zzig();
        zzg = zzigVar;
        zzadu.zzcs(zzig.class, zzigVar);
    }

    private zzig() {
    }

    public static zzie zza() {
        return (zzie) zzg.zzcn();
    }

    final /* synthetic */ void zzb(zzhu zzhuVar) {
        zzhuVar.getClass();
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = zzadu.zzcz(zzaefVar);
        }
        this.zzf.add(zzhuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", zzif.zza, "zzf", zzhu.class});
        }
        if (i11 == 3) {
            return new zzig();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzie(bArr);
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
        synchronized (zzig.class) {
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
