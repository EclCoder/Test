package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f28871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f28872c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile d f28875f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28870a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.database.b f28873d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f28874e = true;

    private g(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        this.f28875f = dVar;
        this.f28872c = bVar;
        this.f28871b = cVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        String strE = this.f28875f.e();
        if (this.f28875f.i() == 5) {
            com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
            cVar.a(true);
            return cVar;
        }
        if (this.f28872c.e() == 0) {
            com.mbridge.msdk.config.component.load.downloader.c cVar2 = new com.mbridge.msdk.config.component.load.downloader.c();
            cVar2.b(true);
            return cVar2;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f28871b.a(strE, this.f28872c.b(), new com.mbridge.msdk.config.component.load.downloader.database.c.a() { // from class: com.mbridge.msdk.config.component.load.downloader.core.q
            @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
            public final void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
                this.f28905a.a(countDownLatch, bVar);
            }
        });
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f28870a) {
                    this.f28874e = false;
                }
            } catch (InterruptedException e10) {
                q0.a(IDownloadTask.TAG, e10.getMessage(), e10);
                countDownLatch.countDown();
                synchronized (this.f28870a) {
                    this.f28874e = false;
                }
            }
            com.mbridge.msdk.config.component.load.downloader.c cVarRun = k.a(this.f28875f, this.f28873d, this.f28871b, strE, this.f28872c).run();
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.a(cVarRun) || !cVarRun.c()) {
                if (this.f28872c != null) {
                    this.f28872c.a(false);
                }
                return n.a(this.f28875f, this.f28873d, this.f28871b, this.f28872c).run();
            }
            if (this.f28872c != null) {
                this.f28872c.a(true);
                this.f28872c.a(this.f28875f.k());
                this.f28872c.b(this.f28873d.h());
                this.f28872c.a(com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f28875f.k(), this.f28875f.f()));
            }
            a(this.f28875f, this.f28872c);
            this.f28873d = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f28873d.f(), this.f28873d.i(), this.f28873d.d(), this.f28873d.n(), System.currentTimeMillis(), this.f28875f.k(), this.f28875f.f(), this.f28873d.e(), this.f28873d.c(), this.f28873d.j(), this.f28873d.h(), this.f28873d.b(), this.f28873d.a());
            this.f28871b.a(this.f28873d, this.f28872c.h());
            return cVarRun;
        } catch (Throwable th2) {
            synchronized (this.f28870a) {
                this.f28874e = false;
                throw th2;
            }
        }
    }

    static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        return new g(dVar, bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CountDownLatch countDownLatch, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        synchronized (this.f28870a) {
            try {
                if (this.f28874e) {
                    this.f28873d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        countDownLatch.countDown();
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (dVar.i() != 5) {
            long jF = this.f28875f.f();
            long jK = this.f28875f.k();
            dVar.a(bVar, new DownloadProgress(jF, jK, com.mbridge.msdk.config.component.load.downloader.utils.b.a(jK, jF)));
        }
    }
}
