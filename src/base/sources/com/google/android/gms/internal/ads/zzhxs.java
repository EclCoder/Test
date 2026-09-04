package com.google.android.gms.internal.ads;

import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhxs implements zzhej {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhxs(ECPrivateKey eCPrivateKey, zziai zziaiVar, zzhzs zzhzsVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhkr.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        zziaw.zza(zziaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) {
        throw null;
    }

    public static zzhej zzb(zzhuw zzhuwVar) throws NoSuchAlgorithmException {
        KeyFactory keyFactory;
        byte[] bArr;
        Provider providerZza = zzhkv.zza();
        zziai zziaiVar = (zziai) zzhxt.zza.zzb(zzhuwVar.zzd().zze());
        zzhzs zzhzsVar = (zzhzs) zzhxt.zzb.zzb(zzhuwVar.zzd().zzc());
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(zzhuwVar.zzf().zzb(zzhdo.zza()), zzhzt.zzb((zzhzr) zzhxt.zzc.zzb(zzhuwVar.zzd().zzd())));
        String str = QGbBllacZSmHKn.cPkp;
        if (providerZza != null) {
            keyFactory = KeyFactory.getInstance(str, providerZza);
        } else {
            keyFactory = (KeyFactory) zzhzz.zzf.zzb(str);
        }
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyFactory.generatePrivate(eCPrivateKeySpec);
        byte[] bArrZzc = zzhuwVar.zze().zze().zzc();
        if (zzhuwVar.zzd().zzf().equals(zzhut.zzc)) {
            bArr = zzb;
        } else {
            bArr = zza;
        }
        return new zzhxs(eCPrivateKey, zziaiVar, zzhzsVar, bArrZzc, bArr, providerZza);
    }
}
