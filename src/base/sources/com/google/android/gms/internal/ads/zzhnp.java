package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnp {
    private static final ThreadLocal zza = new zzhno();

    public static byte[] zza(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    static /* synthetic */ SecureRandom zzb() {
        SecureRandom secureRandomZzc = zzc();
        secureRandomZzc.nextLong();
        return secureRandomZzc;
    }

    private static SecureRandom zzc() {
        Provider providerZza = zzhkv.zza();
        if (providerZza != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (Throwable unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
