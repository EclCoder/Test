package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgh extends zzadu implements zzafd {
    private static final zzgh zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private String zze = "";
    private zzaef zzf = zzadu.zzcy();
    private boolean zzg;

    static {
        zzgh zzghVar = new zzgh();
        zzh = zzghVar;
        zzadu.zzcs(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public final String zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", zzgr.class, "zzg"});
        }
        if (i11 == 3) {
            return new zzgh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzgg(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzgh.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
