package com.mbridge.msdk.config.component.load.downloader.resource;

import com.mbridge.msdk.config.component.load.downloader.resource.stream.b;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f28949a;

    private a() {
    }

    public static a a() {
        if (f28949a == null) {
            synchronized (a.class) {
                try {
                    if (f28949a == null) {
                        f28949a = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f28949a;
    }

    public com.mbridge.msdk.config.component.load.downloader.resource.stream.a b(File file) throws IOException {
        if (file == null) {
            throw new IOException("file is null");
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        return new b(file);
    }

    public long c(File file) {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            try {
                return file.length();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }

    public String a(String str) {
        try {
            URL url = new URL(str);
            String str2 = url.getProtocol() + "://" + url.getHost() + url.getPath();
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(str2.getBytes(C.UTF8_NAME));
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }
}
