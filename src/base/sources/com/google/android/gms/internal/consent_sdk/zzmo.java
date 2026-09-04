package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmo extends zzqm implements zzrr {
    private static final zzmo zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzte zzg;
    private zzte zzh;
    private int zzi;

    static {
        zzmo zzmoVar = new zzmo();
        zzb = zzmoVar;
        zzqm.zzz(zzmo.class, zzmoVar);
    }

    private zzmo() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u00047\u0000\u0005<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", zzmn.zza, zzqa.class});
        }
        if (i11 == 3) {
            return new zzmo();
        }
        zzmw zzmwVar = null;
        if (i11 == 4) {
            return new zzmm(zzmwVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
