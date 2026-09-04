package com.bytedance.sdk.component.hnj;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class xn {
    private static boolean hnj;

    static String hnj(Throwable th2) {
        StringBuilder sb2 = new StringBuilder("{\"code\":");
        sb2.append(th2 instanceof jip ? ((jip) th2).hnj : 0);
        sb2.append("}");
        return sb2.toString();
    }

    static String hnj(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = (!hnj || z10) ? "" : str.substring(1, str.length() - 1);
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (strSubstring.isEmpty()) {
            return strConcat + "}";
        }
        return strConcat + "," + strSubstring + "}";
    }

    static String hnj() {
        return "";
    }

    static void hnj(boolean z10) {
        hnj = z10;
    }
}
