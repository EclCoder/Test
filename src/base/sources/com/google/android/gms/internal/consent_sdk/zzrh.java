package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzrh implements zzsb {
    private static final zzro zza = new zzrf();
    private final zzro zzb;

    public zzrh() {
        zzqi zzqiVarZza = zzqi.zza();
        int i10 = zzpc.zza;
        zzrg zzrgVar = new zzrg(zzqiVarZza, zza);
        byte[] bArr = zzqs.zzb;
        this.zzb = zzrgVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsb
    public final zzsa zza(Class cls) {
        int i10 = zzsc.zza;
        if (!zzqm.class.isAssignableFrom(cls)) {
            int i11 = zzpc.zza;
        }
        zzrn zzrnVarZzb = this.zzb.zzb(cls);
        if (zzrnVarZzb.zzb()) {
            int i12 = zzpc.zza;
            return zzru.zzi(zzsc.zzn(), zzqd.zza(), zzrnVarZzb.zza());
        }
        int i13 = zzpc.zza;
        return zzrt.zzi(cls, zzrnVarZzb, zzrw.zza(), zzrd.zza(), zzsc.zzn(), zzrnVarZzb.zzc() + (-1) != 1 ? zzqd.zza() : null, zzrm.zza());
    }
}
