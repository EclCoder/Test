package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzev extends zzgp implements zzhs {
    private static final zzev zzb;
    private int zzd;
    private String zze = "";

    static {
        zzev zzevVar = new zzev();
        zzb = zzevVar;
        zzgp.zzB(zzev.class, zzevVar);
    }

    private zzev() {
    }

    public static zzeu zza() {
        return (zzeu) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzev zzevVar, String str) {
        zzevVar.zzd |= 1;
        zzevVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzev();
        }
        zzew zzewVar = null;
        if (i11 == 4) {
            return new zzeu(zzewVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
