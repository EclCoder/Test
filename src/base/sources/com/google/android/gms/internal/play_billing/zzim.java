package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzim extends zzgp implements zzhs {
    private static final zzim zzb;
    private zzhm zzd = zzhm.zza();

    static {
        zzim zzimVar = new zzim();
        zzb = zzimVar;
        zzgp.zzB(zzim.class, zzimVar);
    }

    private zzim() {
    }

    public static zzij zza() {
        return (zzij) zzb.zzp();
    }

    static /* synthetic */ Map zzc(zzim zzimVar) {
        if (!zzimVar.zzd.zze()) {
            zzimVar.zzd = zzimVar.zzd.zzb();
        }
        return zzimVar.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzia(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzd", zzik.zza});
        }
        if (i11 == 3) {
            return new zzim();
        }
        zzil zzilVar = null;
        if (i11 == 4) {
            return new zzij(zzilVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
