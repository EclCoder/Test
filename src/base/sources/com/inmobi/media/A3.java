package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.inmobi.media.A3;
import com.inmobi.media.J2;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class A3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A3 f24440a = new A3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fl.k f24441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static em.o0 f24442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerC3083k3 f24443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HandlerThread f24444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static List f24445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f24446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f24447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f24448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f24449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Function1 f24450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3420x3 f24451l;

    static {
        String TAG = A3.class.getSimpleName();
        f24441b = fl.l.b(new tl.a() { // from class: yh.d
            @Override // tl.a
            public final Object invoke() {
                return A3.b();
            }
        });
        f24445f = new ArrayList();
        f24446g = new AtomicBoolean(false);
        f24447h = new AtomicBoolean(true);
        f24448i = new Object();
        f24449j = new LinkedHashMap();
        f24450k = new Function1() { // from class: yh.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A3.a((J2) obj);
            }
        };
        kotlin.jvm.internal.s.g(TAG, "TAG");
        Runnable runnable = new Runnable() { // from class: yh.f
            @Override // java.lang.Runnable
            public final void run() {
                A3.a();
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
        f24451l = new C3420x3();
    }

    public static final fl.g0 a(J2 event) {
        kotlin.jvm.internal.s.h(event, "event");
        int i10 = event.f25043a;
        if (i10 == 1 || i10 == 2) {
            kotlin.jvm.internal.s.g("A3", "TAG");
            f24447h.set(false);
        } else if (i10 != 10) {
            if (i10 != 11) {
                kotlin.jvm.internal.s.g("A3", "TAG");
            } else if (!Boolean.parseBoolean(event.f25044b)) {
                f();
            }
        } else if (kotlin.jvm.internal.s.c("available", event.f25044b)) {
            f();
        }
        return fl.g0.f38750a;
    }

    public static final void b(V2 v10) {
        int i10 = v10.f25874f;
        if (i10 > 0) {
            v10.f25874f = i10 - 1;
            v10.f25875g = System.currentTimeMillis();
            em.j.b(null, new C3470z3(v10, null), 1, null);
        }
    }

    public static AdConfig.ImaiConfig c() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getImai();
    }

    public static void d() {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            kotlin.jvm.internal.s.g("A3", "TAG");
            kotlin.jvm.internal.s.h("A3", "name");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new I9("A3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f24442c = em.p0.a(em.r1.b(threadPoolExecutor).plus(em.u2.b(null, 1, null)));
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f24444e = handlerThread;
            L6.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = f24444e;
            kotlin.jvm.internal.s.e(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            kotlin.jvm.internal.s.g(looper, "getLooper(...)");
            f24443d = new HandlerC3083k3(looper);
            ((Fc) Xi.f26025e.getValue()).a(new int[]{10, 11, 2, 1}, f24450k);
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("A3", "TAG");
            e10.getMessage();
        }
    }

    public static boolean e() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
        return !((RootConfig) AbstractC2878c4.f26300a.a(RootConfig.class)).getMonetizationDisabled();
    }

    public static void f() {
        HandlerThread handlerThread;
        try {
            if (Ze.a() != null) {
                return;
            }
            synchronized (f24448i) {
                try {
                    if (f24446g.compareAndSet(false, true)) {
                        kotlin.jvm.internal.s.g("A3", "TAG");
                        if (f24444e == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            f24444e = handlerThread2;
                            L6.a(handlerThread2, "pingHandlerThread");
                        }
                        if (f24443d == null && (handlerThread = f24444e) != null) {
                            Looper looper = handlerThread.getLooper();
                            kotlin.jvm.internal.s.g(looper, "getLooper(...)");
                            f24443d = new HandlerC3083k3(looper);
                        }
                        em.j.b(null, new C3445y3(null), 1, null);
                    }
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("A3", "TAG");
            e10.getMessage();
        }
    }

    public static void g() {
        try {
            AtomicBoolean atomicBoolean = f24446g;
            atomicBoolean.set(false);
            synchronized (f24448i) {
                try {
                    if (!atomicBoolean.get()) {
                        HandlerThread handlerThread = f24444e;
                        if (handlerThread != null) {
                            handlerThread.getLooper().quit();
                            handlerThread.interrupt();
                        }
                        f24444e = null;
                        f24443d = null;
                    }
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("A3", "TAG");
            e10.getMessage();
        }
    }

    public static final Z2 b() {
        return new Z2(AbstractC3193o9.b());
    }

    public static final HashMap a(V2 v10) {
        HashMap map = new HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - v10.f25874f) + 1;
            if (maxRetries > 0) {
                map.put("X-im-retry-count", String.valueOf(maxRetries));
            }
            return map;
        } catch (Exception unused) {
            kotlin.jvm.internal.s.g("A3", "TAG");
            return map;
        }
    }

    public static final void a() {
        d();
    }

    public static void a(String url, boolean z10, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.g("A3", "TAG");
        Mg.a(Jg.REGULAR, new C3239q3(url, z10, interfaceC3322t9, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(V2 v10, C2822a0 c2822a0, InterfaceC3322t9 interfaceC3322t9, kotlin.coroutines.jvm.internal.d dVar) {
        C3342u3 c3342u3;
        C2822a0 c2822a1;
        V2 v11 = v10;
        InterfaceC3322t9 interfaceC3322t10 = interfaceC3322t9;
        if (dVar instanceof C3342u3) {
            c3342u3 = (C3342u3) dVar;
            int i10 = c3342u3.f27593f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3342u3.f27593f = i10 - Integer.MIN_VALUE;
            } else {
                c3342u3 = new C3342u3(this, dVar);
            }
        } else {
            c3342u3 = new C3342u3(this, dVar);
        }
        Object obj = c3342u3.f27591d;
        Object objF = ll.b.f();
        int i11 = c3342u3.f27593f;
        if (i11 == 0) {
            fl.s.b(obj);
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("A3", "TAG");
                ((C3348u9) interfaceC3322t10).c("A3", "record Click");
            }
            Z2 z10 = (Z2) f24441b.getValue();
            int maxDbEvents = c().getMaxDbEvents();
            c3342u3.f27588a = v11;
            c2822a1 = c2822a0;
            c3342u3.f27589b = c2822a1;
            c3342u3.f27590c = interfaceC3322t10;
            c3342u3.f27593f = 1;
            C3167n9 c3167n9 = z10.f26111a;
            Y2 y10 = new Y2(maxDbEvents, z10, v11, null);
            c3167n9.getClass();
            Object objA = c3167n9.a(new C3141m9(c3167n9, y10, null), c3342u3);
            if (objA != ll.b.f()) {
                objA = fl.g0.f38750a;
            }
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC3322t9 interfaceC3322t11 = c3342u3.f27590c;
            C2822a0 c2822a2 = c3342u3.f27589b;
            V2 v12 = c3342u3.f27588a;
            fl.s.b(obj);
            c2822a1 = c2822a2;
            interfaceC3322t10 = interfaceC3322t11;
            v11 = v12;
        }
        if (c2822a1 != null) {
            f24449j.put(Integer.valueOf(v11.f25869a), c2822a1);
        }
        if (Ze.a() != null) {
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("A3", "TAG");
                ((C3348u9) interfaceC3322t10).b("A3", "No network available. Saving click for later processing ...");
            }
            f24446g.set(false);
            g();
        } else {
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("A3", "TAG");
                ((C3348u9) interfaceC3322t10).a("A3", "submit click - " + v11.f25869a);
            }
            em.o0 o0Var = f24442c;
            if (o0Var != null) {
                em.k.d(o0Var, null, null, new C3368v3(v11, interfaceC3322t10, null), 3, null);
            }
        }
        return fl.g0.f38750a;
    }

    public static void a(V2 click, String reason) {
        kotlin.jvm.internal.s.h(click, "click");
        kotlin.jvm.internal.s.h(reason, "error");
        LinkedHashMap linkedHashMap = f24449j;
        C2822a0 c2822a0 = (C2822a0) linkedHashMap.get(Integer.valueOf(click.f25869a));
        if (c2822a0 != null) {
            kotlin.jvm.internal.s.h(click, "click");
            kotlin.jvm.internal.s.h(reason, "error");
            C3437xk c3437xk = c2822a0.f26164b;
            kotlin.jvm.internal.s.h(reason, "reason");
            LinkedHashMap linkedHashMapA = c3437xk.a();
            linkedHashMapA.put("networkType", B5.g());
            linkedHashMapA.put("errorCode", (short) 2178);
            linkedHashMapA.put("reason", reason);
            String str = c3437xk.f27874d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("AdImpressionSuccessful", linkedHashMapA, EnumC3281rk.SDK);
        }
        linkedHashMap.remove(Integer.valueOf(click.f25869a));
    }
}
