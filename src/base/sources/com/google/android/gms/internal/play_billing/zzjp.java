package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjp extends zzgp implements zzhs {
    private static final zzjp zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        zzjp zzjpVar = new zzjp();
        zzb = zzjpVar;
        zzgp.zzB(zzjp.class, zzjpVar);
    }

    private zzjp() {
    }

    static /* synthetic */ void zzG(zzjp zzjpVar, int i10) {
        zzjpVar.zzg = i10 - 1;
        zzjpVar.zzd |= 1;
    }

    public static zzjn zza() {
        return (zzjn) zzb.zzp();
    }

    static /* synthetic */ void zze(zzjp zzjpVar, zzjz zzjzVar) {
        zzjpVar.zzh = zzjzVar.zza();
        zzjpVar.zzd |= 2;
    }

    static /* synthetic */ void zzf(zzjp zzjpVar, zzkn zzknVar) {
        zzknVar.getClass();
        zzjpVar.zzf = zzknVar;
        zzjpVar.zze = 2;
    }

    static /* synthetic */ void zzg(zzjp zzjpVar, zzkt zzktVar) {
        zzktVar.getClass();
        zzjpVar.zzf = zzktVar;
        zzjpVar.zze = 4;
    }

    static /* synthetic */ void zzh(zzjp zzjpVar, zzln zzlnVar) {
        zzlnVar.getClass();
        zzjpVar.zzf = zzlnVar;
        zzjpVar.zze = 3;
    }

    public final zzkt zzc() {
        return this.zze == 4 ? (zzkt) this.zzf : zzkt.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", zzjm.zza, zzkn.class, zzln.class, zzkt.class, "zzh", zzjy.zza});
        }
        if (i11 == 3) {
            return new zzjp();
        }
        zzjo zzjoVar = null;
        if (i11 == 4) {
            return new zzjn(zzjoVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
