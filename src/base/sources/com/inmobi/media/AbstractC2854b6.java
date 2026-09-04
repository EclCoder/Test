package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.inmobi.media.b6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2854b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26248a = 0;

    public static byte[] a(String str) {
        int i10;
        if (str != null) {
            int length = str.length() % 4;
            i10 = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i10 = 0;
        }
        String strValueOf = String.valueOf(str != null ? bm.r.c1(str).toString() : null);
        for (int i11 = 0; i11 < i10; i11++) {
            strValueOf = ((Object) strValueOf) + "=";
        }
        byte[] bytes = strValueOf.getBytes(bm.d.f9079b);
        kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
        return Base64.decode(bytes, 2);
    }

    public static String a(String data, byte[] bArr) {
        byte[] bArrDoFinal;
        kotlin.jvm.internal.s.h(data, "data");
        kotlin.jvm.internal.s.g("b6", "TAG");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            kotlin.jvm.internal.s.g(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = data.getBytes(bm.d.f9079b);
            kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Throwable th2) {
            Log.d("b6", "SDK encountered unexpected error in getting encrypted AES bytes; " + th2.getMessage());
            bArrDoFinal = null;
        }
        byte[] bArrEncode = Base64.encode(bArrDoFinal, 2);
        kotlin.jvm.internal.s.g(bArrEncode, "encode(...)");
        String str = new String(bArrEncode, bm.d.f9079b);
        kotlin.jvm.internal.s.g("b6", "TAG");
        return str;
    }
}
