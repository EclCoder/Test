package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhkn implements zzhdi {
    private static final ThreadLocal zza = new zzhkl();

    public static zzhdi zzb(zzhfz zzhfzVar) {
        return zzhjb.zzc(zzhfzVar, zzhkm.zza);
    }

    static /* synthetic */ Cipher zzc() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
