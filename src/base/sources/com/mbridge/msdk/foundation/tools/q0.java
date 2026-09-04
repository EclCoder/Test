package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f30935a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30936b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f30937c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f30938d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f30939e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f30940f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f30941g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f30942h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f30941g = false;
        f30935a = false;
        f30937c = false;
        f30942h = false;
        f30936b = false;
        f30940f = false;
        f30939e = false;
        f30938d = false;
    }

    public static void a(String str, String str2) {
        if (!f30935a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f30936b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f30937c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f30942h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        if (!f30936b || str2 == null || th2 == null) {
            return;
        }
        Log.e(a(str), str2, th2);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f30942h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th2);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (!f30935a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th2);
    }

    public static void a(String str, Throwable th2) {
        if (!f30942h || th2 == null) {
            return;
        }
        Log.w(a(str), th2);
    }
}
