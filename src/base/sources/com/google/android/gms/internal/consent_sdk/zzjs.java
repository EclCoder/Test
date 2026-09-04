package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjs extends zzqm implements zzrr {
    private static final zzjs zzb;

    static {
        zzjs zzjsVar = new zzjs();
        zzb = zzjsVar;
        zzqm.zzz(zzjs.class, zzjsVar);
    }

    private zzjs() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzkb zzkbVar = null;
        if (i11 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new zzjs();
        }
        if (i11 == 4) {
            return new zzjr(zzkbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
