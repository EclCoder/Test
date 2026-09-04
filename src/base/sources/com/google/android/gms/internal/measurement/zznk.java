package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zznk extends zzadu implements zzafd {
    private static final zznk zzo;
    private static volatile zzafj zzp;
    private int zzb;
    private boolean zzf;
    private zznm zzk;
    private boolean zzl;
    private boolean zzm;
    private zznf zzn;
    private zzacr zze = zzacr.zza;
    private String zzg = "";
    private zzaef zzh = zzadu.zzcy();
    private zzaef zzi = zzadu.zzcy();
    private zzaeb zzj = zzadu.zzcv();

    static {
        zznk zznkVar = new zznk();
        zzo = zznkVar;
        zzadu.zzcs(zznk.class, zznkVar);
    }

    private zznk() {
    }

    public static zznk zza() {
        return zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzabz.zzc(), "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new zznk();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zznj(bArr);
        }
        if (i11 == 5) {
            return zzo;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzp;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznk.class) {
            try {
                zzadqVar = zzp;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzo);
                    zzp = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
