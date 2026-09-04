package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f24433e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f24434f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        PackageManager packageManager;
        byte b10 = 2;
        f24434f = (byte) 2;
        Context context = Xi.f26021a;
        String strValueOf = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(context.getPackageName(), 128) : null;
        if (applicationInfo != null) {
            String str = applicationInfo.packageName;
            f24429a = str;
            f24432d = applicationInfo.loadLabel(packageManager).toString();
            kotlin.jvm.internal.s.e(str);
            f24430b = packageManager.getInstallerPackageName(str);
        }
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 128) : null;
        if (packageInfo != null && ((strValueOf = packageInfo.versionName) == null || strValueOf.length() == 0)) {
            strValueOf = Build.VERSION.SDK_INT < 28 ? String.valueOf(packageInfo.versionCode) : String.valueOf(packageInfo.getLongVersionCode());
        }
        if (J3.a(strValueOf)) {
            f24431c = strValueOf;
        }
        try {
            B5.f24500a.getClass();
            b10 = B5.y() ? !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : 0;
        } catch (Error | Exception unused2) {
        }
        f24434f = b10;
        a();
    }

    public static void a() {
        String str = f24429a;
        if (str != null) {
            f24433e.put("u-appbid", str);
        }
        String str2 = f24432d;
        if (str2 != null) {
            f24433e.put("u-appdnm", str2);
        }
        String str3 = f24431c;
        if (str3 != null) {
            f24433e.put("u-appver", str3);
        }
        HashMap map = f24433e;
        map.put("u-appsecure", String.valueOf((int) f24434f));
        kotlin.jvm.internal.s.g("A1", "TAG");
        map.toString();
    }
}
