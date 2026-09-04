package com.inmobi.media;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.iab.omid.library.inmobi.Omid;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.pl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3231pl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f27279b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3231pl f27278a = new C3231pl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3075jl f27280c = new C3075jl();

    public static boolean a() {
        int i10;
        try {
            kotlin.jvm.internal.l0.b(gn.b0.class).k();
            i10 = 0;
        } catch (NoClassDefFoundError e10) {
            Log.d("pl", "Missing required dependency: com.squareup.okhttp3:okhttp (OkHttpClient)", e10);
            i10 = 1;
        }
        try {
            kotlin.jvm.internal.l0.b(xn.g.class).k();
        } catch (NoClassDefFoundError e11) {
            i10++;
            Log.d("pl", "Missing required dependency: com.squareup.okio:okio (BufferedSource)", e11);
        }
        try {
            kotlin.jvm.internal.l0.b(em.o0.class).k();
        } catch (NoClassDefFoundError e12) {
            i10++;
            Log.d("pl", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (CoroutineScope)", e12);
        }
        try {
            kotlin.jvm.internal.l0.b(em.c1.class).k();
        } catch (NoClassDefFoundError e13) {
            i10++;
            Log.d("pl", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (Dispatchers)", e13);
        }
        try {
            kotlin.jvm.internal.l0.b(AdvertisingIdClient.class).k();
        } catch (NoClassDefFoundError e14) {
            i10++;
            Log.d("pl", "Missing required dependency: com.google.android.gms:play-services-ads-identifier (AdvertisingIdClient)", e14);
        }
        try {
            kotlin.jvm.internal.l0.b(androidx.core.content.a.class).k();
        } catch (NoClassDefFoundError e15) {
            i10++;
            Log.d("pl", "Missing required dependency: androidx.core:core-ktx (ContextCompat)", e15);
        }
        try {
            kotlin.jvm.internal.l0.b(ml.a.class).k();
        } catch (NoClassDefFoundError e16) {
            i10++;
            Log.d("pl", "Missing required dependency: Kotlin stdlib (EnumEntries) - upgrade Kotlin version", e16);
        }
        try {
            kotlin.jvm.internal.l0.b(androidx.browser.customtabs.c.class).k();
        } catch (NoClassDefFoundError e17) {
            i10++;
            Log.d("pl", "Missing required dependency: androidx.browser:browser (CustomTabsClient)", e17);
        }
        try {
            kotlin.jvm.internal.l0.b(Omid.class).k();
        } catch (NoClassDefFoundError e18) {
            i10++;
            Log.d("pl", "Missing required dependency: com.iab.omid.library.inmobi:omsdk-android (Omid)", e18);
        }
        if (i10 > 0) {
            Log.d("pl", "Total no missing dependencies = " + i10);
        }
        return i10 > 0;
    }

    public static boolean b(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "sdk_version_store");
        kotlin.jvm.internal.s.h("sdk_version", "key");
        if (laA.f25198a.getString("sdk_version", null) == null) {
            return true;
        }
        kotlin.jvm.internal.s.h(context, "context");
        La laA2 = Ka.a(context, "sdk_version_store");
        kotlin.jvm.internal.s.h("sdk_version", "key");
        return !kotlin.jvm.internal.s.c(laA2.f25198a.getString("sdk_version", null), "11.2.0");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r8.a(r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3231pl.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static void a(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        try {
            if (b(context)) {
                X6.a(context);
                kotlin.jvm.internal.s.h(context, "context");
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La.a(Ka.a(context, "sdk_version_store"), "db_deletion_failed", true);
                Context context2 = Xi.f26021a;
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
                Xi.a(applicationContext);
            }
        } catch (Exception e10) {
            Log.d("pl", "Error in cleaning cache directory", e10);
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r7.b(r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.coroutines.jvm.internal.d r7) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3231pl.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
