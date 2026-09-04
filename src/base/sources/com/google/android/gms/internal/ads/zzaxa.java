package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaxa extends zziee implements zzifq {
    private static final zzaxa zzc;
    private static volatile zzifx zzd;
    private int zza;
    private int zzb = 2;

    static {
        zzaxa zzaxaVar = new zzaxa();
        zzc = zzaxaVar;
        zziee.zzbu(zzaxa.class, zzaxaVar);
    }

    private zzaxa() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", zzaxb.zza});
        }
        if (iOrdinal == 3) {
            return new zzaxa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawz(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzd;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzaxa.class) {
            try {
                zzidzVar = zzd;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzc);
                    zzd = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }
}
