package com.mbridge.msdk.foundation.tools;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f30832a = new byte[32];

    static {
        a(k0.a("HkzwDFeD4QuyLdx5igfZYcu9xTM9NN=="));
    }

    private static void a(String str) {
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-384").digest(str.getBytes()), 0, f30832a, 0, 32);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String b(String str, byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
    }

    public static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr2));
            return new String(cipher.doFinal(bArrDecode), C.UTF8_NAME);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
