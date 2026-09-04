package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f33918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f33922e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f33926i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f33923f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f33924g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f33925h = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33927j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f33928k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f33929l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f33930m = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f33933a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.f33933a = sVar;
        }

        private void a(String str) {
            Log.d("TrackManager", this.f33933a.f33922e.v() + " " + str + this.f33933a.f33924g.addAndGet(0) + " 数据库记录数：" + this.f33933a.f33918a.b());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f33703a) {
                    Log.e("TrackManager", this.f33933a.f33922e.v() + " removeMessages failed ", e10);
                }
            }
            if (this.f33933a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f33933a.f33923f.get(), this.f33933a.f33928k, this.f33933a.f33920c));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f33703a) {
                    Log.e("TrackManager", this.f33933a.f33922e.v() + " sendMessageDelayed failed ", e11);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 == 2 || i10 == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.f33703a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.tracker.a.f33703a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f33933a.a();
                sendMessageDelayed(Message.obtain(this, 5), 120000L);
                return;
            }
            if (i10 != 6) {
                if (i10 != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.f33703a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.f33933a.k();
                b();
                if (com.mbridge.msdk.tracker.a.f33703a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.f33703a && !y.b(eVar)) {
                a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.g()));
            }
            if (y.a(eVar) || this.f33933a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.f33703a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private synchronized void a() {
            try {
                this.f33933a.h();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f33703a) {
                    Log.e("TrackManager", this.f33933a.f33922e.v() + " report failed ", e10);
                }
            }
        }
    }

    public s(k kVar) {
        this.f33918a = kVar.d();
        this.f33919b = kVar.i();
        this.f33920c = kVar.l();
        this.f33921d = kVar.j();
        this.f33922e = kVar;
    }

    private void l() {
        this.f33918a.c();
    }

    public void k() {
        synchronized (this.f33925h) {
            try {
                if (!this.f33929l) {
                    this.f33929l = true;
                    l();
                }
                if (!this.f33930m) {
                    this.f33930m = true;
                    this.f33924g.addAndGet(this.f33918a.b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private List<i> c() {
        return this.f33918a.a(this.f33919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f33923f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f33703a) {
                Log.d("TrackManager", this.f33922e.v() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        a(listC);
        int size = listC.size();
        this.f33924g.addAndGet(-size);
        boolean zA = false;
        if (com.mbridge.msdk.tracker.a.f33703a) {
            Log.d("TrackManager", this.f33922e.v() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f33924g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f33918a.b());
        }
        try {
            zA = this.f33922e.a();
        } catch (IllegalStateException e10) {
            if (com.mbridge.msdk.tracker.a.f33703a) {
                Log.e("TrackManager", this.f33922e.v() + " report environment check failed ", e10);
            }
        }
        if (!zA) {
            if (com.mbridge.msdk.tracker.a.f33703a) {
                Log.e("TrackManager", this.f33922e.v() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o oVarM = this.f33922e.m();
        oVarM.a(new a(this.f33926i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f33922e.f().a(this.f33922e.u(), listC, this.f33922e.o());
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f33703a) {
                Log.e("TrackManager", this.f33922e.v() + " report decorate request params failed ", e11);
            }
        }
        oVarM.b(new t(listC), map, y.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f33923f.set(0);
    }

    public void b() {
        this.f33926i.removeMessages(1);
        Handler handler = this.f33926i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.f33924g.incrementAndGet();
    }

    protected boolean f() {
        return this.f33924g.addAndGet(0) >= this.f33919b;
    }

    boolean g() {
        return this.f33927j;
    }

    public void j() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f33926i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f33926i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f33920c);
        this.f33927j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f33918a.c(list);
    }

    public void a(e eVar) {
        if (this.f33926i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f33923f.get(), this.f33928k, this.f33920c);
        if (jA > this.f33920c) {
            Handler handler = this.f33926i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.f33926i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f33931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f33932b;

        public a(Handler handler, s sVar) {
            this.f33931a = handler;
            this.f33932b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.f33932b.b(tVar.a());
            this.f33932b.i();
            this.f33932b.f33928k = 0L;
            if (this.f33932b.f()) {
                Handler handler = this.f33931a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f33703a) {
                Log.d("TrackManager", this.f33932b.f33922e.v() + " report success " + tVar.a().size() + " 剩余事件数：" + this.f33932b.f33924g.addAndGet(0) + " 个，数据库记录数：" + this.f33932b.f33918a.b() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i10, String str) {
            this.f33932b.a(tVar.a(), str);
            this.f33932b.f33928k = System.currentTimeMillis();
            int iD = this.f33932b.d();
            if (iD <= 10) {
                this.f33931a.removeMessages(3);
                Handler handler = this.f33931a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), ((long) iD) * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f33703a) {
                Log.d("TrackManager", this.f33932b.f33922e.v() + " report failed " + tVar.a().size() + " 剩余事件数：" + this.f33932b.f33924g.addAndGet(0) + " 个，数据库记录数：" + this.f33932b.f33918a.b() + " 个 连续失败次数： " + iD);
            }
        }
    }

    private void a(List<i> list) {
        this.f33918a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f33703a) {
            return;
        }
        int iA = this.f33918a.a();
        if (com.mbridge.msdk.tracker.a.f33703a) {
            Log.d("TrackManager", this.f33922e.v() + " 删除无效数据的数量 = " + iA + " 当前剩余事件数 = " + this.f33924g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f33918a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i10 = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z10 = !iVar.l() && iVar.h() >= this.f33921d;
                boolean z11 = !iVar.m() && iVar.g() < System.currentTimeMillis();
                if (!z10 && !z11) {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i10++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.f33918a.a(list);
        this.f33924g.addAndGet(i10);
    }
}
