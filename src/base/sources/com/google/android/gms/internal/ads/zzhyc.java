package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhyc implements zzhek {
    private static final byte[] zza = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    private final PublicKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final Provider zze;

    private zzhyc(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!zzhkr.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.zzb = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(zzhzl.zza(zza, bArr)));
        this.zzc = bArr2;
        this.zzd = bArr3;
        this.zze = provider;
    }

    public static zzhek zzb(zzhvl zzhvlVar) throws GeneralSecurityException {
        Provider providerZza = zzhkv.zza();
        if (providerZza == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (zzhkr.zza(1)) {
            return new zzhyc(zzhvlVar.zzd().zzc(), zzhvlVar.zze().zzc(), zzhvlVar.zzf().zzc().equals(zzhvd.zzc) ? new byte[]{0} : new byte[0], providerZza);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            throw new GeneralSecurityException(String.format("Invalid signature length: %s", 64));
        }
        if (!zzhnz.zze(bArr3, bArr)) {
            throw new GeneralSecurityException(QGbBllacZSmHKn.iYXUUioebGAgiO);
        }
        Provider provider = this.zze;
        PublicKey publicKey = this.zzb;
        Signature signature = Signature.getInstance("Ed25519", provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        signature.update(this.zzd);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException(PAFNPq.MpwVDxEZHfaVen);
    }
}
