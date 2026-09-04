package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhpn implements zzhoj {
    private zzhpn(zzhob zzhobVar, Provider provider) throws GeneralSecurityException {
        if (!zzhkr.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhobVar.zze().zzc();
            zzhobVar.zzf();
            new SecretKeySpec(zzhobVar.zzd().zzc(zzhdo.zza()), "AES");
        } catch (NoSuchAlgorithmException e10) {
            throw new GeneralSecurityException("AES-CMAC not available.", e10);
        }
    }

    public static zzhoj zza(zzhob zzhobVar, Provider provider) {
        return new zzhpn(zzhobVar, provider);
    }
}
