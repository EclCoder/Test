package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f15217a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f15218b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private g() {
    }

    public static final String a() {
        if (x7.a.c(g.class)) {
            return null;
        }
        try {
            Context contextM = com.facebook.h0.m();
            List<ResolveInfo> listQueryIntentServices = contextM.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            kotlin.jvm.internal.s.g(listQueryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
            HashSet hashSetT0 = gl.j.t0(f15218b);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSetT0.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
            return null;
        }
    }

    public static final String b() {
        if (x7.a.c(g.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + com.facebook.h0.m().getPackageName();
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (x7.a.c(g.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.s.h(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            if (f1.e(com.facebook.h0.m(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return f1.e(com.facebook.h0.m(), b()) ? b() : "";
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
            return null;
        }
    }
}
