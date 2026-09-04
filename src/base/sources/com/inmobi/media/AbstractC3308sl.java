package com.inmobi.media;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.inmobi.media.sl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3308sl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f27479a = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f27480b = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);

    public static String a(InputStreamReader inputStreamReader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i10);
            }
        } finally {
            inputStreamReader.close();
        }
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
