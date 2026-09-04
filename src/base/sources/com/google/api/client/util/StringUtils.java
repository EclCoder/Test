package com.google.api.client.util;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class StringUtils {
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    private StringUtils() {
    }

    public static byte[] getBytesUtf8(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static String newStringUtf8(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
