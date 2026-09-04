package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhpo implements zzhoj {
    public zzhpo(zzhob zzhobVar) {
    }

    public static zzhoj zza(zzhob zzhobVar) throws GeneralSecurityException {
        if (!zzhkr.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerZza = zzhkv.zza();
        if (providerZza != null) {
            try {
                return zzhpn.zza(zzhobVar, providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhpo(zzhobVar);
    }
}
