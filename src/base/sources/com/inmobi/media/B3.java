package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24496a = 0;

    public static int a(Context context, String url, ResolveInfo resolveInfo, InterfaceC3408wh redirectionValidator, String api) throws URISyntaxException {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.s.h(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        Intent uri = Intent.parseUri(url, 3);
        kotlin.jvm.internal.s.g(uri, "parseUri(...)");
        B5.f24500a.getClass();
        if (B5.v() && uri.getAction() == null) {
            uri.setAction("android.intent.action.VIEW");
        }
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if ((activityInfo != null ? activityInfo.packageName : null) != null) {
                if ((activityInfo != null ? activityInfo.name : null) != null) {
                    uri.setClassName(activityInfo.packageName, activityInfo.name);
                }
            }
        }
        uri.setFlags(268435456);
        context.startActivity(uri);
        return 0;
    }

    public static int a(Context context, String url, InterfaceC3408wh redirectionValidator, String api) throws URISyntaxException {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.s.h(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        try {
            Intent uri = Intent.parseUri(url, 0);
            uri.setFlags(268435456);
            B5.f24500a.getClass();
            if (B5.v() && uri.getAction() == null) {
                uri.setAction("android.intent.action.VIEW");
            }
            context.startActivity(uri);
            return 0;
        } catch (ActivityNotFoundException e10) {
            Uri uri2 = Uri.parse(url);
            kotlin.jvm.internal.s.g(uri2, "Uri.parse(this)");
            String strA = a(url);
            if (kotlin.jvm.internal.s.c("intent", uri2.getScheme()) && strA != null && strA.length() != 0) {
                return a(context, strA, redirectionValidator, api);
            }
            throw e10;
        } catch (NullPointerException e11) {
            Uri uri3 = Uri.parse(url);
            kotlin.jvm.internal.s.g(uri3, "Uri.parse(this)");
            String strA2 = a(url);
            if (kotlin.jvm.internal.s.c("intent", uri3.getScheme()) && strA2 != null && strA2.length() != 0) {
                return a(context, strA2, redirectionValidator, api);
            }
            throw e11;
        }
    }

    public static int a(Za validationResult, InterfaceC3408wh redirectionValidator, String api) {
        PackageManager packageManager;
        kotlin.jvm.internal.s.h(validationResult, "validationResult");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.s.h(api, "api");
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        Activity activity = validationResult.f26134a;
        String str = validationResult.f26135b;
        boolean z10 = validationResult.f26137d;
        String str2 = validationResult.f26136c;
        if (bm.r.h0(str)) {
            return 2;
        }
        kotlin.jvm.internal.s.g("B3", "TAG");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse(str));
        intent.putExtra("overlay", z10);
        intent.putExtra("callerId", str2);
        try {
            packageManager = activity.getPackageManager();
        } catch (Exception unused) {
            packageManager = null;
        }
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            return 6;
        }
        try {
            activity.startActivityForResult(intent, 0);
            kotlin.jvm.internal.s.g("B3", "TAG");
            intent.toString();
            return 0;
        } catch (ActivityNotFoundException unused2) {
            return 6;
        } catch (NullPointerException unused3) {
            return 13;
        } catch (SecurityException unused4) {
            return 12;
        } catch (URISyntaxException unused5) {
            return 5;
        } catch (Exception unused6) {
            return 9;
        }
    }

    public static String a(String str) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            B5.f24500a.getClass();
            if (B5.v() && uri.getAction() == null) {
                uri.setAction("android.intent.action.VIEW");
            }
            return uri.getStringExtra(qnwOeeQSSWa.uikeWbsKAQU);
        } catch (URISyntaxException e10) {
            kotlin.jvm.internal.s.g("B3", "TAG");
            e10.getMessage();
            return null;
        }
    }

    public static boolean a(Uri uri) {
        kotlin.jvm.internal.s.h(uri, "uri");
        return kotlin.jvm.internal.s.c("http", uri.getScheme()) || kotlin.jvm.internal.s.c("https", uri.getScheme());
    }

    public static List a(Context context, String url) throws URISyntaxException {
        kotlin.jvm.internal.s.h(url, "url");
        if (url.length() == 0 || context == null) {
            return gl.r.l();
        }
        Intent uri = Intent.parseUri(url, 3);
        kotlin.jvm.internal.s.g(uri, "parseUri(...)");
        B5.f24500a.getClass();
        if (B5.v() && uri.getAction() == null) {
            uri.setAction("android.intent.action.VIEW");
        }
        List<ResolveInfo> listQueryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, uri, 0);
        kotlin.jvm.internal.s.g(listQueryIntentActivityOptions, "queryIntentActivityOptions(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivityOptions) {
            if (((ResolveInfo) obj).activityInfo.exported) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
