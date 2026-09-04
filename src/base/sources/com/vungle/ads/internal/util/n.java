package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public static final n INSTANCE = new n();

    private n() {
    }

    public final String convertForSending(String stringToConvert) throws IOException {
        kotlin.jvm.internal.s.h(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = stringToConvert.getBytes(bm.d.f9079b);
                kotlin.jvm.internal.s.g(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                kotlin.jvm.internal.s.g(strEncodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                ql.b.a(gZIPOutputStream, null);
                ql.b.a(byteArrayOutputStream, null);
                return strEncodeToString;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(gZIPOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ql.b.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }
}
