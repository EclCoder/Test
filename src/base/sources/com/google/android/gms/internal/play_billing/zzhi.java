package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhi extends zzgp implements zzhs {
    private static final zzhi zzb;
    private zzgu zzd = zzhz.zze();

    static {
        zzhi zzhiVar = new zzhi();
        zzb = zzhiVar;
        zzgp.zzB(zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzia(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzjf.class});
        }
        if (i11 == 3) {
            return new zzhi();
        }
        zzhh zzhhVar = null;
        if (i11 == 4) {
            return new zzhg(zzhhVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
