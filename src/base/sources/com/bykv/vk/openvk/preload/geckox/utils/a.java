package com.bykv.vk.openvk.preload.geckox.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f11894a;

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            GeckoLogger.w("gecko-debug-tag", "getVersion:", e10);
            return "null";
        }
    }

    public static String b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return applicationInfo == null ? "" : applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th2) {
            GeckoLogger.w("gecko-debug-tag", "getApplicationName:", th2);
            return "";
        }
    }

    private static String c() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static String a() {
        if (!TextUtils.isEmpty(f11894a)) {
            return f11894a;
        }
        String strB = b();
        f11894a = strB;
        if (!TextUtils.isEmpty(strB)) {
            return f11894a;
        }
        String strC = c();
        f11894a = strC;
        if (!TextUtils.isEmpty(strC)) {
            return f11894a;
        }
        return f11894a;
    }

    private static String b() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void a(Throwable th2) {
        GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", th2);
    }
}
