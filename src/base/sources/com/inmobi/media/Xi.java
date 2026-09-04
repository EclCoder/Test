package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import com.inmobi.media.Xi;
import f8.Ygx.FuoITeVPeXAj;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f26021a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f26022b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f26023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f26024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fl.k f26025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f26026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f26027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final em.o0 f26028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f26029i;

    static {
        String name = Xi.class.getSimpleName();
        f26024d = new AtomicBoolean();
        f26025e = fl.l.b(new tl.a() { // from class: yh.m6
            @Override // tl.a
            public final Object invoke() {
                return Xi.a();
            }
        });
        kotlin.jvm.internal.s.g(name, "TAG");
        kotlin.jvm.internal.s.h(name, "name");
        ExecutorService COMPONENT_SERVICE = Executors.newSingleThreadExecutor(new I9(name, false));
        f26027g = COMPONENT_SERVICE;
        kotlin.jvm.internal.s.g(COMPONENT_SERVICE, "COMPONENT_SERVICE");
        f26028h = em.p0.a(em.r1.b(COMPONENT_SERVICE));
    }

    public static final Fc a() {
        return new Fc();
    }

    public static String b(Context context) {
        Context applicationContext;
        String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e10) {
                try {
                    throw new C3257ql(e10.getMessage());
                } catch (C3257ql e11) {
                    kotlin.jvm.internal.s.g("Xi", "TAG");
                    e11.getMessage();
                    fl.k kVar = W9.f25935a;
                    W9.a(new M2(e11));
                    try {
                        String property = System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        kotlin.jvm.internal.s.g("Xi", "TAG");
                    } catch (Exception e12) {
                        kotlin.jvm.internal.s.g("Xi", "TAG");
                        e12.getMessage();
                        kotlin.jvm.internal.s.g("Xi", "TAG");
                        fl.k kVar2 = W9.f25935a;
                        AbstractC3219p9.a(e12);
                    }
                    return str;
                } catch (Exception e13) {
                    kotlin.jvm.internal.s.g("Xi", "TAG");
                    e13.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        kotlin.jvm.internal.s.e(defaultUserAgent);
        return defaultUserAgent;
    }

    public static boolean c(Context context) {
        return true;
    }

    public static final boolean d() {
        return f26029i == 2;
    }

    public static void a(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        try {
            X6.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("Xi", "TAG");
            e10.getMessage();
        }
    }

    public static final String c() {
        if (f26022b.length() == 0) {
            f26022b = b(f26021a);
        }
        return f26022b;
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        kotlin.jvm.internal.s.h(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public static String b() {
        Context context = f26021a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "coppa_store");
        kotlin.jvm.internal.s.h("im_accid", FuoITeVPeXAj.EZxFozEe);
        return laA.f25198a.getString("im_accid", null);
    }
}
