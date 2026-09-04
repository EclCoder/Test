package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.sdk.InMobiSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.zl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3488zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final em.o0 f28033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bm.o f28034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f28035c;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.s.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f28033a = em.p0.a(em.r1.b(executorServiceNewSingleThreadExecutor).plus(em.u2.b(null, 1, null)));
        f28034b = new bm.o("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        kotlin.jvm.internal.s.g(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        f28035c = gl.r.N0(arrayList);
    }

    public static final String a(Thread thread, Throwable error) {
        String string;
        kotlin.jvm.internal.s.h(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            StackTraceElement[] stackTrace = error.getStackTrace();
            kotlin.jvm.internal.s.e(stackTrace);
            boolean zB = b(stackTrace);
            if (!zB) {
                string = "";
            } else if (stackTrace.length >= W9.a().getCrashConfig().getMaxLengthOfStackTrace()) {
                string = "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
            } else {
                StackTraceElement[] stackTrace2 = error.getStackTrace();
                kotlin.jvm.internal.s.g(stackTrace2, "getStackTrace(...)");
                kotlin.jvm.internal.s.h(stackTrace2, "<this>");
                StringBuilder sb2 = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace2) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append('\n');
                }
                string = sb2.toString();
                kotlin.jvm.internal.s.g(string, "toString(...)");
            }
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, error.getMessage());
            jSONObject.put("stack", string);
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            W9.a(jSONObject, zB, jCurrentTimeMillis);
            AbstractC3225pf.a(jSONObject, error instanceof OutOfMemoryError, zB, jCurrentTimeMillis);
            String string2 = jSONObject.toString();
            kotlin.jvm.internal.s.g(string2, "toString(...)");
            return string2;
        } catch (OutOfMemoryError unused) {
            return "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
        } catch (JSONException e10) {
            e10.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.s.h(stackTraceElementArr, "<this>");
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i10], Pc.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class.getSuperclass()) && (!kotlin.jvm.internal.s.c(stackTraceElementArr[i10].getClassName(), InMobiSdk.class.getName()) || !kotlin.jvm.internal.s.c(stackTraceElementArr[i10].getMethodName(), "fireListener")); i10++) {
            String className = stackTraceElementArr[i10].getClassName();
            kotlin.jvm.internal.s.g(className, "getClassName(...)");
            String name = W4.class.getName();
            kotlin.jvm.internal.s.g(name, "getName(...)");
            if (bm.r.T(className, name, false, 2, null)) {
                break;
            }
            String className2 = stackTraceElementArr[i10].getClassName();
            kotlin.jvm.internal.s.g(className2, "getClassName(...)");
            if (f28034b.a(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(String message, String trace) {
        kotlin.jvm.internal.s.h("AppExitEvent", "name");
        kotlin.jvm.internal.s.h(message, "message");
        kotlin.jvm.internal.s.h(trace, "trace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, message);
            jSONObject.put("stack", trace);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public static final String a(StackTraceElement[] stackTrace) {
        kotlin.jvm.internal.s.h("Blocked", "name");
        kotlin.jvm.internal.s.h("MainThreadBlocked", PglCryptUtils.KEY_MESSAGE);
        kotlin.jvm.internal.s.h(stackTrace, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "MainThreadBlocked");
            kotlin.jvm.internal.s.h(stackTrace, "<this>");
            StringBuilder sb2 = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb2.append(stackTraceElement.toString());
                sb2.append('\n');
            }
            String string = sb2.toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            jSONObject.put("stack", string);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string2 = jSONObject.toString();
        kotlin.jvm.internal.s.g(string2, "toString(...)");
        return string2;
    }

    public static final boolean a(X9 x10) {
        kotlin.jvm.internal.s.h(x10, "<this>");
        if (x10 instanceof X4) {
            StackTraceElement[] stackTraceElementArr = ((X4) x10).f25995g;
            if (stackTraceElementArr == null) {
                kotlin.jvm.internal.s.w("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (x10 instanceof C3468z1) {
            C3468z1 c3468z1 = (C3468z1) x10;
            if (c3468z1.f27967g != 6) {
                return false;
            }
            return f28034b.a(c3468z1.f27968h);
        }
        if (x10 instanceof C3208oo) {
            return b(((C3208oo) x10).f27150g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        kotlin.jvm.internal.s.h(stackTraceElement, "<this>");
        return cls != null && kotlin.jvm.internal.s.c(stackTraceElement.getClassName(), cls.getName()) && f28035c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(Function1 runnable) {
        kotlin.jvm.internal.s.h(runnable, "runnable");
        em.k.d(f28033a, null, null, new C3386vl(runnable, null), 3, null);
    }
}
