package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3085k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f26839a;

    public static final String a(Context context) {
        B5.f24500a.getClass();
        if (!B5.w()) {
            return null;
        }
        if (context == null || f26839a != null) {
            return f26839a;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            kotlin.jvm.internal.s.g(listQueryIntentActivities, "queryIntentActivities(...)");
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    String packageName = resolveInfo.activityInfo.packageName;
                    kotlin.jvm.internal.s.g(packageName, "packageName");
                    arrayList.add(packageName);
                }
            }
            if (arrayList.isEmpty()) {
                f26839a = null;
            } else if (arrayList.size() == 1) {
                f26839a = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str) && !a(context, intent) && gl.r.U(arrayList, str)) {
                f26839a = str;
            } else if (arrayList.contains("com.android.chrome")) {
                f26839a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f26839a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f26839a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f26839a = "com.google.android.apps.chrome";
            }
        } catch (Exception unused) {
        }
        return f26839a;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            kotlin.jvm.internal.s.g(listQueryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e("k5", "Runtime exception while getting specialized handlers");
            return false;
        }
    }
}
