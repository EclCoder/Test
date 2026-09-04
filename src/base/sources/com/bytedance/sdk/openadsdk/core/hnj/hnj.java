package com.bytedance.sdk.openadsdk.core.hnj;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.d;
import com.bytedance.sdk.component.utils.apu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Boolean f13773hn;
    private static String hnj;

    public static int hn(Context context) {
        try {
            return !TextUtils.isEmpty(hnj(context)) ? 1 : 0;
        } catch (Throwable unused) {
        }
    }

    public static String hnj(Context context) {
        String str = hnj;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                hnj = null;
            } else if (TextUtils.isEmpty(str2) || hnj(context, intent) || !arrayList.contains(str2)) {
                hnj = (String) arrayList.get(0);
            } else {
                hnj = str2;
            }
        } catch (Throwable th2) {
            apu.qor("CustomTabsHelper", th2.getMessage());
        }
        return hnj;
    }

    private static boolean hnj(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        return false;
    }

    public static int hnj() {
        Boolean bool = f13773hn;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void hnj(Context context, String str, d dVar, Uri uri) {
        dVar.f1834a.setPackage(str);
        dVar.a(context, uri);
    }
}
