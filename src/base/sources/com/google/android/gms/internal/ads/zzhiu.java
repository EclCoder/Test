package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhiu {
    private static final ThreadLocal zza = new zzhit();

    public static Cipher zza() {
        return (Cipher) zza.get();
    }

    public static SecretKey zzb(byte[] bArr) throws InvalidAlgorithmParameterException {
        zziax.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec zzc(byte[] bArr, int i10, int i11) {
        zzhnz.zzd();
        return new GCMParameterSpec(128, bArr, i10, 12);
    }
}
