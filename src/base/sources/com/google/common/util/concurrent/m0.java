package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22016a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f22017b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f22018c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f22019d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ThreadFactory f22020e = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f22021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f22023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f22024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f22025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f22026f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f22021a = threadFactory;
            this.f22022b = str;
            this.f22023c = atomicLong;
            this.f22024d = bool;
            this.f22025e = num;
            this.f22026f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f22021a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f22022b;
            if (str != null) {
                AtomicLong atomicLong = this.f22023c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(m0.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f22024d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f22025e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f22026f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory c(m0 m0Var) {
        String str = m0Var.f22016a;
        Boolean bool = m0Var.f22017b;
        Integer num = m0Var.f22018c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = m0Var.f22019d;
        ThreadFactory threadFactoryDefaultThreadFactory = m0Var.f22020e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public m0 e(boolean z10) {
        this.f22017b = Boolean.valueOf(z10);
        return this;
    }
}
