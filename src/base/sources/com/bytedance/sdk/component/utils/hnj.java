package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0196hnj {
        static final Random hnj = hnj.qor();
    }

    public static String hn(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strHnj = hnj();
        String strHnj2 = hnj(strHnj, 32);
        String strHn = hn();
        return 3 + strHnj + strHn + ((strHnj2 == null || strHn == null) ? null : com.bytedance.sdk.component.gjv.hnj.hnj(str, strHn, strHnj2));
    }

    public static JSONObject hnj(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : hnj(jSONObject.toString());
    }

    public static String qor(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strHnj = hnj(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strHnj == null) ? str : com.bytedance.sdk.component.gjv.hnj.hn(str.substring(49), strSubstring, strHnj);
    }

    public static JSONObject hnj(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strHn = hn(str);
                    if (!TextUtils.isEmpty(strHn)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strHn);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static Random qor() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String hn() {
        String strHnj = hnj(8);
        if (strHnj == null || strHnj.length() != 16) {
            return null;
        }
        return strHnj;
    }

    public static String hnj() {
        String strHnj = hnj(16);
        if (strHnj == null || strHnj.length() != 32) {
            return null;
        }
        return strHnj;
    }

    public static String hnj(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String hnj(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0196hnj.hnj.nextBytes(bArr);
            return sk.hnj(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
