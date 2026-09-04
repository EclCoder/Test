package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.orp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static String hnj;

    public static String dkl() {
        return com.bytedance.sdk.component.utils.oj.dse(com.bytedance.sdk.openadsdk.core.oj.hnj());
    }

    public static String dse() {
        try {
            if (!TextUtils.isEmpty(hnj)) {
                return hnj;
            }
            String strHnj = com.bytedance.sdk.openadsdk.core.ta.hnj("sdk_app_sha1", 259200000L);
            hnj = strHnj;
            if (hnj(strHnj)) {
                return hnj;
            }
            String strHnj2 = com.bytedance.sdk.component.utils.qor.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj());
            hnj = strHnj2;
            if (!hnj(strHnj2)) {
                return "";
            }
            String upperCase = hnj.toUpperCase();
            hnj = upperCase;
            com.bytedance.sdk.openadsdk.core.ta.hnj("sdk_app_sha1", upperCase);
            return hnj;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String gjv() {
        return orp.aq();
    }

    public static String hn() {
        return "1371";
    }

    public static String hnj() {
        return "open_news";
    }

    public static String qor() {
        return BuildConfig.VERSION_NAME;
    }

    public static String sk() {
        return com.bytedance.sdk.openadsdk.core.ta.hn().aq();
    }

    public static String hnj(Context context) {
        return com.bytedance.sdk.openadsdk.core.orl.hnj(context);
    }

    private static boolean hnj(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(":")) != null && strArrSplit.length >= 20) {
            for (String str2 : strArrSplit) {
                if (!"00".equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
