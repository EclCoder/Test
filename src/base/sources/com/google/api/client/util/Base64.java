package com.google.api.client.util;

import com.google.common.io.BaseEncoding;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Base64 {
    private Base64() {
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return decodeBase64(StringUtils.newStringUtf8(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return StringUtils.getBytesUtf8(encodeBase64String(bArr));
    }

    public static String encodeBase64String(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return BaseEncoding.a().f(bArr);
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return StringUtils.getBytesUtf8(encodeBase64URLSafeString(bArr));
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return BaseEncoding.b().l().f(bArr);
    }

    public static byte[] decodeBase64(String str) {
        if (str == null) {
            return null;
        }
        try {
            return BaseEncoding.a().c(str);
        } catch (IllegalArgumentException e10) {
            if (e10.getCause() instanceof BaseEncoding.DecodingException) {
                return BaseEncoding.b().c(str.trim());
            }
            throw e10;
        }
    }
}
