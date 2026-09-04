package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzflo {
    public zzflo() {
        try {
            zzhep.zza();
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzheb zzhebVarZzg = zzheb.zzg(zzhdt.zzb(zzhmn.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzhdm.zzb(zzhebVarZzg, zzhdl.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdzg zzdzgVar) {
        zzheb zzhebVarZzc;
        if (str != null && (zzhebVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzhdi) zzhebVarZzc.zzh(zzhkt.zza(), zzhdi.class)).zza(bArr, bArr2);
                zzdzgVar.zzc().put("ds", "1");
                return new String(bArrZza, StandardCharsets.UTF_8);
            } catch (UnsupportedOperationException | GeneralSecurityException e10) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e10.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.decrypt");
                zzdzgVar.zzc().put("dsf", e10.toString());
            }
        }
        return null;
    }

    private static final zzheb zzc(String str) {
        try {
            try {
                return zzhdm.zza(zzhdk.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
