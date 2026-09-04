package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdx extends zzgp implements zzhs {
    private static final zzdx zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzdx zzdxVar = new zzdx();
        zzb = zzdxVar;
        zzgp.zzB(zzdx.class, zzdxVar);
    }

    private zzdx() {
    }

    public static zzdx zzb(byte[] bArr) {
        return (zzdx) zzgp.zzt(zzb, bArr);
    }

    public final zzeg zzc() {
        return this.zzd == 2 ? (zzeg) this.zze : zzeg.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzeg.class});
        }
        if (i11 == 3) {
            return new zzdx();
        }
        zzdw zzdwVar = null;
        if (i11 == 4) {
            return new zzdv(zzdwVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
