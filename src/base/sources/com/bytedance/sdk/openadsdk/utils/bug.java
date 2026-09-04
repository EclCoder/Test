package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug {
    private static String hn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn((String) null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void hnj(String str) {
        hnj("any_door_id", str);
    }

    public static String hnj() {
        return hn("any_door_id", null);
    }

    private static void hnj(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
