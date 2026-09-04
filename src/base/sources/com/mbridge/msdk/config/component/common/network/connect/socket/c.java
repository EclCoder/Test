package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f28684d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f28685a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f28686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f28687c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f28688a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f28688a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f28686b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f28687c = new AtomicBoolean(false);
    }

    private boolean b() {
        int iX;
        try {
            int iH = m0.h();
            return iH > 0 && (iX = m0.x()) > 0 && (((double) iH) / ((double) iX)) * 100.0d <= 5.0d;
        } catch (Exception e10) {
            q0.b("SocketThreadPoolManager", "Memory check failed: " + e10.getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.f28685a.isEmpty()) {
            try {
                Runnable runnablePoll = this.f28685a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof b) && ((b) runnablePoll).e() != null) {
                        ((b) runnablePoll).e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th2) {
                this.f28687c.set(false);
                if (!this.f28685a.isEmpty()) {
                    d();
                }
                throw th2;
            }
        }
        this.f28687c.set(false);
        if (this.f28685a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.f28687c.compareAndSet(false, true)) {
            this.f28686b.execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.connect.socket.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28690a.c();
                }
            });
        }
    }

    public static c a() {
        if (f28684d == null) {
            synchronized (c.class) {
                try {
                    if (f28684d == null) {
                        f28684d = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f28684d;
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.f28685a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.f28686b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.f28686b.getActiveCount(), this.f28686b.getQueue().size());
    }
}
