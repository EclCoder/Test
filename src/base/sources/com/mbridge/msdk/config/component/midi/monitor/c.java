package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29003c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f29007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HandlerThread f29008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f29009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f29010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f29011k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f29013m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29004d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29005e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29006f = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29012l = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f29011k != null) {
                c.this.f29011k.a("Video first frame render timeout : " + c.this.f29002b + "ms");
            }
            c.this.h();
        }
    }

    public c(int i10, String str) {
        this.f29001a = 3;
        this.f29013m = str;
        this.f29002b = i10 > 0 ? i10 : 3000L;
        this.f29001a = i10 / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f29008h = handlerThread;
            handlerThread.start();
            this.f29007g = new Handler(this.f29008h.getLooper());
            d();
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f29007g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    private void d() {
        this.f29009i = new a();
        this.f29010j = new b();
    }

    public boolean e() {
        return this.f29004d;
    }

    public void f() {
        Runnable runnable;
        if (!this.f29004d || this.f29006f) {
            return;
        }
        this.f29006f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f29003c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f29007g;
        if (handler != null && (runnable = this.f29010j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f29002b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        h();
    }

    public void g() {
        Runnable runnable;
        if (this.f29007g == null) {
            h();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f29011k;
            if (aVar != null) {
                aVar.a("playerHandler is null");
            }
        }
        if (this.f29004d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f29004d = true;
        this.f29005e = false;
        this.f29006f = false;
        this.f29012l = 0;
        this.f29003c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f29002b + "ms");
        Handler handler = this.f29007g;
        if (handler != null && (runnable = this.f29010j) != null) {
            handler.postDelayed(runnable, this.f29002b);
        }
        a();
    }

    public void h() {
        if (this.f29004d) {
            this.f29004d = false;
            Handler handler = this.f29007g;
            if (handler != null) {
                Runnable runnable = this.f29009i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f29010j;
                if (runnable2 != null) {
                    this.f29007g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f29004d || this.f29005e || TextUtils.isEmpty(this.f29013m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                this.f29012l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.f29012l);
                if (this.f29012l >= this.f29001a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f29007g;
                if (handler == null || (runnable2 = this.f29009i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f29005e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strC);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f29011k;
            if (aVar != null) {
                aVar.b(strC);
            }
            Handler handler2 = this.f29007g;
            if (handler2 == null || (runnable3 = this.f29009i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "检查本地地址异常：" + e10.getMessage());
            Handler handler3 = this.f29007g;
            if (handler3 == null || (runnable = this.f29009i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    private String c() {
        try {
            if (this.f29013m.startsWith(com.vungle.ads.internal.model.b.FILE_SCHEME) || this.f29013m.startsWith("/")) {
                File file = new File(this.f29013m.replace(com.vungle.ads.internal.model.b.FILE_SCHEME, ""));
                if (file.exists() && file.isFile()) {
                    return this.f29013m;
                }
            }
            if (this.f29013m.startsWith("http")) {
                com.mbridge.msdk.config.component.common.file.b bVarA = com.mbridge.msdk.config.component.common.file.a.a(this.f29013m, -1, null);
                String strA = bVarA != null ? bVarA.a() : "";
                File file2 = new File(strA.replace(com.vungle.ads.internal.model.b.FILE_SCHEME, ""));
                if (file2.exists() && file2.isFile()) {
                    return strA;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "获取本地视频地址异常：" + e10.getMessage());
            return null;
        }
    }

    public void b() {
        try {
            h();
            Handler handler = this.f29007g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f29007g = null;
            }
            HandlerThread handlerThread = this.f29008h;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f29008h.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f29008h = null;
                }
                this.f29009i = null;
                this.f29010j = null;
                this.f29011k = null;
                this.f29004d = false;
                this.f29005e = false;
                this.f29006f = false;
                this.f29012l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f29008h = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorPlayerTimeout", "销毁MonitorPlayerTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.f29011k = aVar;
    }
}
