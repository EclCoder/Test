package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zznp extends zzqm implements zzrr {
    private static final zznp zzb;
    private int zzd;
    private zznl zze;
    private zznn zzf;
    private zznh zzg;
    private int zzh;

    static {
        zznp zznpVar = new zznp();
        zzb = zznpVar;
        zzqm.zzz(zznp.class, zznpVar);
    }

    private zznp() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000\u0005᠌\u0003", new Object[]{"zzd", "zzf", "zzg", "zze", "zzh", zzoy.zza()});
        }
        if (i11 == 3) {
            return new zznp();
        }
        zzno zznoVar = null;
        if (i11 == 4) {
            return new zznc(zznoVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
