package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29066b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f29067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HandlerThread f29068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f29069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f29070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f29071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.b f29072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.b f29073i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f29070f != null && !b.this.f29071g.h()) {
                b.this.a();
                b.this.f29070f.d(b.this.f29071g);
            }
            b.this.e();
        }
    }

    public b(long j10) {
        if (this.f29065a < 0) {
            this.f29065a = 30L;
        } else {
            this.f29065a = j10;
        }
    }

    public void d() {
        Runnable runnable;
        if (this.f29066b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f29066b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.f29068d = handlerThread;
            handlerThread.start();
            this.f29067c = new Handler(this.f29068d.getLooper());
            c();
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f29067c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.f29067c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f29070f;
            if (aVar != null) {
                aVar.d(this.f29071g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.f29065a + "ms");
        Handler handler = this.f29067c;
        if (handler == null || (runnable = this.f29069e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.f29065a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.f29066b) {
            this.f29066b = false;
            Handler handler = this.f29067c;
            if (handler != null && (runnable = this.f29069e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    private void c() {
        this.f29069e = new a();
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.f29072h = bVar;
    }

    public void b() {
        try {
            e();
            Handler handler = this.f29067c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f29067c = null;
            }
            HandlerThread handlerThread = this.f29068d;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f29068d.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f29068d = null;
                }
                this.f29069e = null;
                this.f29066b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f29068d = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorNetworkTimeout", "销毁MonitorNetworkTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.f29073i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.f29072h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.f29072h.a();
            }
            if (this.f29073i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.f29073i.a();
            }
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "取消任务时发生异常：" + e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.f29071g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f29070f = aVar;
    }
}
