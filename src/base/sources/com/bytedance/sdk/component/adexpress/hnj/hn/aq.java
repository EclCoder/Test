package com.bytedance.sdk.component.adexpress.hnj.hn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    private static com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnj;

    public static void gjv() {
        qor.hn(sk.aq(), hn(), "temp_pkg_info.json");
        hnj = null;
    }

    public static synchronized com.bytedance.sdk.component.adexpress.hnj.qor.hnj hn() {
        return hnj;
    }

    public static void hnj() {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(sk.aq(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarHnj = com.bytedance.sdk.component.adexpress.hnj.qor.hnj.hnj(new JSONObject(new String(bArr, "utf-8")));
                        if (hnjVarHnj != null) {
                            hnj = hnjVarHnj;
                            hnj.qor();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
        }
    }

    public static void qor() {
        qor.hnj(sk.aq(), hn(), "temp_pkg_info.json");
    }

    public static boolean hn(com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar) {
        return qor.qor(hn(), hnjVar);
    }

    public static synchronized void hnj(com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar) {
        if (hnjVar != null) {
            if (hnjVar.aq()) {
                hnj = hnjVar;
            }
        }
    }

    public static boolean hnj(String str) {
        return qor.hnj(hn(), str);
    }
}
