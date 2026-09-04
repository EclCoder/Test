package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ul {
    private static String hnj;

    public static String hn() {
        if (TextUtils.isEmpty(hnj)) {
            hnj = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return hnj;
    }

    public static boolean hnj() {
        return com.bytedance.sdk.component.utils.fc.qor() && com.bytedance.sdk.openadsdk.core.ta.hn().fc() && com.bytedance.sdk.openadsdk.core.ta.hn().uua();
    }

    public static boolean qor() {
        return false;
    }

    public static String hnj(String str) {
        try {
            if (!hnj()) {
                return str;
            }
            String strOj = com.bytedance.sdk.openadsdk.core.ta.hn().oj();
            if (TextUtils.isEmpty(strOj)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strOj)));
            return Uri.parse(str).buildUpon().appendQueryParameter(hn(), strOj).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
