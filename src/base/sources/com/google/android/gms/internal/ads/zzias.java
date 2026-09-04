package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzias implements zzhej {
    /* synthetic */ zzias(RSAPrivateCrtKey rSAPrivateCrtKey, zziai zziaiVar, zziai zziaiVar2, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhks.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zziax.zzb(zziaiVar);
        if (!zziaiVar.equals(zziaiVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zziax.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zziax.zzd(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) {
        throw null;
    }
}
