package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.coremedia.iso.boxes.UserBox;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl {
    private static boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static String f14091hn;
    private static String hnj;
    private static String qor;

    private static void dkl(Context context) {
        if (gjv(context) == null) {
            return;
        }
        String strHn = qor.hnj().hn("abcd", (String) null);
        if (TextUtils.isEmpty(strHn)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strHn);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            if (iOptInt == 3) {
                String strQor = com.bytedance.sdk.component.utils.hnj.qor(strOptString);
                if (TextUtils.isEmpty(strQor)) {
                    return;
                }
                hnj = new JSONObject(strQor).optString("abcd");
                hnj();
            }
        } catch (Throwable unused) {
        }
    }

    private static Context gjv(Context context) {
        return context == null ? oj.hnj() : context;
    }

    public static String hn(Context context) {
        if (f14091hn == null && !gjv) {
            synchronized (orl.class) {
                try {
                    if (!gjv) {
                        sk(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f14091hn;
    }

    public static String hnj(Context context) {
        if (!TextUtils.isEmpty(hnj)) {
            return hnj;
        }
        dkl(context);
        return hnj;
    }

    private static void sk(Context context) {
        if (gjv || gjv(context) == null) {
            return;
        }
        f14091hn = String.valueOf(Build.TIME);
        qor = qor.hnj().hn(UserBox.TYPE, (String) null);
        gjv = true;
    }

    public static String qor(Context context) {
        if (TextUtils.isEmpty(qor) && !gjv) {
            synchronized (orl.class) {
                try {
                    if (!gjv) {
                        sk(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qor;
    }

    public static void hnj(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(hnj)) {
                hnj = str;
            }
            hnj();
        }
        if (TextUtils.isEmpty(hnj)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.dnm.qor.hn(hnj);
        bug.hnj(hnj);
    }

    public static String hn() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(string)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void hnj() {
        if (TextUtils.isEmpty(hnj)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("update_did") { // from class: com.bytedance.sdk.openadsdk.core.orl.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", orl.hnj);
                    qor.hnj().hnj("abcd", com.bytedance.sdk.component.utils.hnj.hnj(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
