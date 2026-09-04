package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgn extends zzadu implements zzafd {
    private static final zzgn zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzadu.zzcy();

    static {
        zzgn zzgnVar = new zzgn();
        zze = zzgnVar;
        zzadu.zzcs(zzgn.class, zzgnVar);
    }

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new zzgn();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzgm(bArr);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzf;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzgn.class) {
            try {
                zzadqVar = zzf;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zze);
                    zzf = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
