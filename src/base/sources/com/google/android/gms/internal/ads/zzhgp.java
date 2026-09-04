package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgp {
    public static final /* synthetic */ int zza = 0;
    private static final zzhnf zzb = zzhnf.zzd(zzhgo.zza, zzhgu.class, zzhdi.class);
    private static final zzhdr zzc = zzhlw.zze("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzhdi.class, zzhsp.REMOTE, zzhtf.zze());
    private static final zzhln zzd = zzhgn.zza;

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhkr.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i10 = zzhhb.zza;
        zzhhb.zza(zzhmr.zza());
        zzhmo.zza().zzb(zzb);
        zzhmi.zza().zzb(zzd, zzhgw.class);
        zzhlo.zza().zzb(zzc, true);
    }
}
