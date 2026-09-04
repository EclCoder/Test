package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f11022a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Handler f11025d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<c> f11023b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f11024c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f11026e = new Object();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f11024c.isEmpty()) {
                if (p.this.f11025d != null) {
                    try {
                        p.this.f11025d.sendMessageAtFrontOfQueue((Message) p.this.f11024c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f11023b.isEmpty()) {
                c cVar = (c) p.this.f11023b.poll();
                if (p.this.f11025d != null) {
                    try {
                        p.this.f11025d.sendMessageAtTime(cVar.f11031a, cVar.f11032b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f11028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f11029b;

        b(String str) {
            super(str);
            this.f11028a = 0;
            this.f11029b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f11026e) {
                try {
                    p.this.f11025d = new Handler();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p.this.f11025d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th3) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f11028a < 5) {
                            com.apm.insight.c.a();
                            j.a(th3, "NPTH_CATCH");
                        } else if (!this.f11029b) {
                            this.f11029b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f11028a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Message f11031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f11032b;

        c(Message message, long j10) {
            this.f11031a = message;
            this.f11032b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f11022a = new b(str);
    }

    public final void b() {
        this.f11022a.start();
    }

    public final HandlerThread c() {
        return this.f11022a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f11025d, runnable);
    }

    public final Handler a() {
        return this.f11025d;
    }

    private boolean b(Message message, long j10) {
        if (this.f11025d == null) {
            synchronized (this.f11026e) {
                try {
                    if (this.f11025d == null) {
                        this.f11023b.add(new c(message, j10));
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        try {
            return this.f11025d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }
}
