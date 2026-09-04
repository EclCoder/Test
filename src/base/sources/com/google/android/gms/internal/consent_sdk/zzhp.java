package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhp extends zzqm implements zzrr {
    private static final zzhp zzb;

    static {
        zzhp zzhpVar = new zzhp();
        zzb = zzhpVar;
        zzqm.zzz(zzhp.class, zzhpVar);
    }

    private zzhp() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzib zzibVar = null;
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new zzhp();
        }
        if (i11 == 4) {
            return new zzho(zzibVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
