package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static String f12996hn = "";
    private static boolean hnj = false;

    public static void hn() {
        hnj = false;
    }

    public static void hnj() {
        hnj = true;
    }

    public static void qor(String str, String str2) {
        if (hnj && str2 != null) {
            Log.e(hn(str), str2);
        }
    }

    public static void hn(String str, String str2) {
        if (hnj && str2 != null) {
            Log.i(hn(str), str2);
        }
    }

    public static void hnj(String str, String str2) {
        if (hnj && str2 != null) {
            Log.d(hn(str), str2);
        }
    }

    public static void qor(String str, Object... objArr) {
        if (hnj && objArr != null) {
            Log.e(hn(str), hnj(objArr));
        }
    }

    public static void hn(String str, Object... objArr) {
        if (hnj && objArr != null) {
            Log.i(hn(str), hnj(objArr));
        }
    }

    public static void hnj(String str, Object... objArr) {
        if (hnj && objArr != null) {
            Log.d(hn(str), hnj(objArr));
        }
    }

    private static String hn(String str) {
        if (TextUtils.isEmpty(f12996hn)) {
            return str;
        }
        return hnj("[" + f12996hn + "]-[" + str + "]");
    }

    public static void hnj(String str, String str2, Throwable th2) {
        if (hnj) {
            if (str2 == null && th2 == null) {
                return;
            }
            Log.e(hn(str), str2, th2);
        }
    }

    public static void hnj(String str) {
        f12996hn = str;
    }

    private static String hnj(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb2.append(obj.toString());
                } else {
                    sb2.append(" null ");
                }
                sb2.append(" ");
            }
            return sb2.toString();
        }
        return "";
    }
}
