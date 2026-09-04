package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import dd.a0;
import dd.t;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t f22101a = new t(new ce.b() { // from class: ed.a
        @Override // ce.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t f22102b = new t(new ce.b() { // from class: ed.b
        @Override // ce.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final t f22103c = new t(new ce.b() { // from class: ed.c
        @Override // ce.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final t f22104d = new t(new ce.b() { // from class: ed.d
        @Override // ce.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(dd.d dVar) {
        return (ScheduledExecutorService) f22102b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(dd.d dVar) {
        return (ScheduledExecutorService) f22103c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(dd.d dVar) {
        return (ScheduledExecutorService) f22101a.get();
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f22104d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(dd.c.d(a0.a(cd.a.class, ScheduledExecutorService.class), a0.a(cd.a.class, ExecutorService.class), a0.a(cd.a.class, Executor.class)).e(new dd.g() { // from class: ed.e
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return ExecutorsRegistrar.g(dVar);
            }
        }).c(), dd.c.d(a0.a(cd.b.class, ScheduledExecutorService.class), a0.a(cd.b.class, ExecutorService.class), a0.a(cd.b.class, Executor.class)).e(new dd.g() { // from class: ed.f
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return ExecutorsRegistrar.e(dVar);
            }
        }).c(), dd.c.d(a0.a(cd.c.class, ScheduledExecutorService.class), a0.a(cd.c.class, ExecutorService.class), a0.a(cd.c.class, Executor.class)).e(new dd.g() { // from class: ed.g
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return ExecutorsRegistrar.a(dVar);
            }
        }).c(), dd.c.c(a0.a(cd.d.class, Executor.class)).e(new dd.g() { // from class: ed.h
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return k.INSTANCE;
            }
        }).c());
    }
}
