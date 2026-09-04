package com.mbridge.msdk.config.component.common.network.retry;

import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledFuture<?> f28702d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f28704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.nori.model.a f28705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.network.a f28706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f28707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f28708j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f28699a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f28700b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f28701c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f28703e = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f28709k = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f28710a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Retry-InstanceScheduler-" + System.currentTimeMillis() + "-" + this.f28710a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.config.component.common.network.retry.a {
        b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0375c implements com.mbridge.msdk.config.component.common.network.retry.b {
        C0375c() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements com.mbridge.msdk.config.component.common.network.retry.a {
        d() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements com.mbridge.msdk.config.component.common.network.retry.b {
        e() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final f f28716b = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f28717a = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(), new ThreadPoolExecutor.DiscardOldestPolicy());

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AtomicInteger f28718a = new AtomicInteger(1);

            a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Retry-NetworkThread-" + this.f28718a.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        }

        private f() {
        }

        public static f a() {
            return f28716b;
        }

        public ThreadPoolExecutor b() {
            return this.f28717a;
        }
    }

    public c(String str, com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.a aVar2, com.mbridge.msdk.config.component.common.network.result.a aVar3) {
        this.f28704f = str;
        this.f28705g = aVar;
        this.f28706h = aVar2;
        this.f28707i = aVar3;
        this.f28708j = aVar3.a();
        b();
    }

    private void d() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar;
        try {
            try {
                this.f28700b = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f28705g, this.f28707i, this.f28706h);
                h();
                this.f28700b.a(this.f28704f);
                aVar = this.f28700b;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f28707i.c(0);
                this.f28707i.b(0);
                this.f28707i.a(e10.getMessage());
                g();
                aVar = this.f28700b;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th2) {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f28700b;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f28701c) {
            q0.c("RequestRetry", "重试任务已被取消，停止执行");
        } else if (this.f28705g.i().equals(com.mbridge.msdk.config.component.common.util.c.c("340"))) {
            f();
        } else if (this.f28705g.i().equals(com.mbridge.msdk.config.component.common.util.c.c("341"))) {
            d();
        }
    }

    private void f() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar;
        try {
            try {
                this.f28699a = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f28705g, this.f28707i, this.f28706h);
                i();
                this.f28699a.a(this.f28704f);
                aVar = this.f28699a;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f28707i.c(0);
                this.f28707i.b(0);
                this.f28707i.a(e10.getMessage());
                g();
                aVar = this.f28699a;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th2) {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar2 = this.f28699a;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f28701c) {
            q0.c("RequestRetry", "重试任务已被取消，停止调度重试");
            return;
        }
        this.f28709k.incrementAndGet();
        if (this.f28709k.get() >= this.f28705g.g()) {
            q0.c("RequestRetry", "重试次数已达上限: " + this.f28709k.get());
            com.mbridge.msdk.config.component.common.network.a aVar = this.f28706h;
            if (aVar != null) {
                aVar.d(this.f28707i);
            }
            a();
            return;
        }
        q0.b("RequestRetry", "重试 次数 " + this.f28709k.get());
        try {
            ScheduledExecutorService scheduledExecutorService = this.f28703e;
            if (scheduledExecutorService != null) {
                this.f28702d = scheduledExecutorService.schedule(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28720a.c();
                    }
                }, this.f28705g.h(), TimeUnit.SECONDS);
                q0.c("RequestRetry", "已调度第 " + this.f28709k.get() + " 次重试");
            }
        } catch (Exception e10) {
            q0.b("RequestRetry", "调度重试任务失败: " + e10.getMessage());
            com.mbridge.msdk.config.component.common.network.a aVar2 = this.f28706h;
            if (aVar2 != null) {
                aVar2.d(this.f28707i);
            }
            a();
        }
    }

    private void h() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = this.f28700b;
        if (aVar != null) {
            aVar.a(new d());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f28708j;
        if (bVar != null) {
            bVar.a(new e());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f28699a;
        if (aVar != null) {
            aVar.a(new b());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f28708j;
        if (bVar != null) {
            bVar.a(new C0375c());
        }
    }

    private void j() {
        ScheduledExecutorService scheduledExecutorService = this.f28703e;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        try {
            q0.c("RequestRetry", "正在关闭独立调度器");
            this.f28703e.shutdown();
            if (this.f28703e.awaitTermination(5L, TimeUnit.SECONDS)) {
                q0.c("RequestRetry", "独立调度器已成功关闭");
            } else {
                q0.d("RequestRetry", "独立调度器未能在5秒内关闭，强制关闭");
                this.f28703e.shutdownNow();
            }
        } catch (InterruptedException e10) {
            q0.b("RequestRetry", "关闭独立调度器时被中断: " + e10.getMessage());
            this.f28703e.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f28701c) {
            return;
        }
        q0.c("RequestRetry", "取消所有重试任务");
        this.f28701c = true;
        ScheduledFuture<?> scheduledFuture = this.f28702d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f28702d.cancel(true);
            q0.c("RequestRetry", "已取消当前重试调度任务");
        }
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f28699a;
        if (aVar != null) {
            aVar.a();
            q0.c("RequestRetry", "已取消TCP连接");
        }
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f28700b;
        if (aVar2 != null) {
            aVar2.a();
            q0.c("RequestRetry", "已取消HTTP连接");
        }
        j();
    }

    private void b() {
        try {
            this.f28703e = Executors.newSingleThreadScheduledExecutor(new a());
            q0.c("RequestRetry", "创建独立调度器成功");
        } catch (Exception e10) {
            q0.b("RequestRetry", "创建独立调度器失败: " + e10.getMessage());
        }
    }

    public void c() {
        if (this.f28701c) {
            q0.c("RequestRetry", "重试任务已被取消，跳过执行");
        } else {
            f.a().b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28721a.e();
                }
            });
        }
    }
}
