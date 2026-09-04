package n7;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import bm.r;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.r0;
import com.facebook.internal.w;
import fl.g0;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f46871a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f46872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f46873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ScheduledExecutorService f46874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile ScheduledFuture f46875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f46876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicInteger f46877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile n f46878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicBoolean f46879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f46880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f46881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f46882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static WeakReference f46883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f46884n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            s.h(activity, "activity");
            r0.f15352e.b(com.facebook.r0.APP_EVENTS, g.f46872b, "onActivityCreated");
            h.a();
            g.q(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            s.h(activity, "activity");
            r0.f15352e.b(com.facebook.r0.APP_EVENTS, g.f46872b, "onActivityDestroyed");
            g.f46871a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            s.h(activity, "activity");
            r0.f15352e.b(com.facebook.r0.APP_EVENTS, g.f46872b, "onActivityPaused");
            h.a();
            g.f46871a.t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            s.h(activity, "activity");
            r0.f15352e.b(com.facebook.r0.APP_EVENTS, g.f46872b, "onActivityResumed");
            h.a();
            g.w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            s.h(activity, "activity");
            s.h(outState, "outState");
            r0.f15352e.b(com.facebook.r0.APP_EVENTS, g.f46872b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            s.h(activity, "activity");
            g.f46882l++;
            r0.f15352e.b(com.facebook.r0.APP_EVENTS, g.f46872b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            s.h(activity, "activity");
            r0.f15352e.b(com.facebook.r0.APP_EVENTS, g.f46872b, "onActivityStopped");
            com.facebook.appevents.o.f14964b.g();
            g.f46882l--;
        }
    }

    static {
        String canonicalName = g.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f46872b = canonicalName;
        f46873c = Executors.newSingleThreadScheduledExecutor();
        f46874d = Executors.newSingleThreadScheduledExecutor();
        f46876f = new Object();
        f46877g = new AtomicInteger(0);
        f46879i = new AtomicBoolean(false);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(boolean z10) {
        if (z10) {
            e7.e.f();
        } else {
            e7.e.e();
        }
    }

    private final void l() {
        ScheduledFuture scheduledFuture;
        synchronized (f46876f) {
            try {
                if (f46875e != null && (scheduledFuture = f46875e) != null) {
                    scheduledFuture.cancel(false);
                }
                f46875e = null;
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final Activity m() {
        WeakReference weakReference = f46883m;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final UUID n() {
        n nVar;
        if (f46878h == null || (nVar = f46878h) == null) {
            return null;
        }
        return nVar.d();
    }

    private final int o() {
        w wVarF = a0.f(h0.n());
        return wVarF == null ? l.a() : wVarF.w();
    }

    public static final boolean p() {
        return f46882l == 0;
    }

    public static final void q(Activity activity) {
        f46873c.execute(new Runnable() { // from class: n7.e
            @Override // java.lang.Runnable
            public final void run() {
                g.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r() {
        if (f46878h == null) {
            f46878h = n.f46906g.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Activity activity) {
        e7.e.j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Activity activity) {
        AtomicInteger atomicInteger = f46877g;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f46872b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strU = e1.u(activity);
        e7.e.k(activity);
        f46873c.execute(new Runnable() { // from class: n7.d
            @Override // java.lang.Runnable
            public final void run() {
                g.u(jCurrentTimeMillis, strU);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final long j10, final String activityName) {
        s.h(activityName, "$activityName");
        if (f46878h == null) {
            f46878h = new n(Long.valueOf(j10), null, null, 4, null);
        }
        n nVar = f46878h;
        if (nVar != null) {
            nVar.k(Long.valueOf(j10));
        }
        if (f46877g.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: n7.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.v(j10, activityName);
                }
            };
            synchronized (f46876f) {
                f46875e = f46873c.schedule(runnable, f46871a.o(), TimeUnit.SECONDS);
                g0 g0Var = g0.f38750a;
            }
        }
        long j11 = f46881k;
        k.i(activityName, j11 > 0 ? (j10 - j11) / ((long) 1000) : 0L);
        n nVar2 = f46878h;
        if (nVar2 != null) {
            nVar2.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(long j10, String activityName) {
        s.h(activityName, "$activityName");
        if (f46878h == null) {
            f46878h = new n(Long.valueOf(j10), null, null, 4, null);
        }
        if (f46877g.get() <= 0) {
            o.d(activityName, f46878h, f46880j);
            n.f46906g.a();
            f46878h = null;
        }
        synchronized (f46876f) {
            f46875e = null;
            g0 g0Var = g0.f38750a;
        }
    }

    public static final void w(Activity activity) {
        s.h(activity, "activity");
        f46883m = new WeakReference(activity);
        f46877g.incrementAndGet();
        f46871a.l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f46881k = jCurrentTimeMillis;
        final String strU = e1.u(activity);
        e7.e.l(activity);
        c7.b.d(activity);
        r7.e.h(activity);
        String str = f46884n;
        if (str != null && r.T(str, "ProxyBillingActivity", false, 2, null) && !s.c(strU, "ProxyBillingActivity")) {
            f46874d.execute(new Runnable() { // from class: n7.b
                @Override // java.lang.Runnable
                public final void run() {
                    g.x();
                }
            });
        }
        final Context applicationContext = activity.getApplicationContext();
        f46873c.execute(new Runnable() { // from class: n7.c
            @Override // java.lang.Runnable
            public final void run() {
                g.y(jCurrentTimeMillis, strU, applicationContext);
            }
        });
        f46884n = strU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x() {
        l7.s.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(long j10, String activityName, Context appContext) {
        n nVar;
        s.h(activityName, "$activityName");
        n nVar2 = f46878h;
        Long lE = nVar2 != null ? nVar2.e() : null;
        if (f46878h == null) {
            f46878h = new n(Long.valueOf(j10), null, null, 4, null);
            String str = f46880j;
            s.g(appContext, "appContext");
            o.b(activityName, null, str, appContext);
        } else if (lE != null) {
            long jLongValue = j10 - lE.longValue();
            if (jLongValue > f46871a.o() * 1000) {
                o.d(activityName, f46878h, f46880j);
                String str2 = f46880j;
                s.g(appContext, "appContext");
                o.b(activityName, null, str2, appContext);
                f46878h = new n(Long.valueOf(j10), null, null, 4, null);
            } else if (jLongValue > 1000 && (nVar = f46878h) != null) {
                nVar.h();
            }
        }
        n nVar3 = f46878h;
        if (nVar3 != null) {
            nVar3.k(Long.valueOf(j10));
        }
        n nVar4 = f46878h;
        if (nVar4 != null) {
            nVar4.m();
        }
    }

    public static final void z(Application application, String str) {
        s.h(application, "application");
        if (f46879i.compareAndSet(false, true)) {
            com.facebook.internal.s.a(com.facebook.internal.s.b.CodelessEvents, new com.facebook.internal.s.a() { // from class: n7.a
                @Override // com.facebook.internal.s.a
                public final void a(boolean z10) {
                    g.A(z10);
                }
            });
            f46880j = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }
}
