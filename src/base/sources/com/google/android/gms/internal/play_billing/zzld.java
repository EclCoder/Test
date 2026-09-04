package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzld extends zzgp implements zzhs {
    private static final zzld zzb;
    private int zzd;
    private int zze;

    static {
        zzld zzldVar = new zzld();
        zzb = zzldVar;
        zzgp.zzB(zzld.class, zzldVar);
    }

    private zzld() {
    }

    public static zzla zza() {
        return (zzla) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzld zzldVar, int i10) {
        zzldVar.zze = i10 - 1;
        zzldVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzlb.zza});
        }
        if (i11 == 3) {
            return new zzld();
        }
        zzlc zzlcVar = null;
        if (i11 == 4) {
            return new zzla(zzlcVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
