package com.mbridge.msdk.tracker.network;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f33771a = "TrackManager_Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33772b = "com.mbridge.msdk.tracker.network.c0";

    public static void a(Throwable th2, String str, Object... objArr) {
        Log.e(f33771a, a(str, objArr), th2);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f33771a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f33771a, a(str, objArr));
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClassName().equals(f33772b)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void d(String str, Object... objArr) {
    }
}
