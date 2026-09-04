package m2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f45095a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f45096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f45097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f45099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f45100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f45101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f45102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f45103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f45105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f45106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f45107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f45108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f45109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f45110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f45111q;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                w1.n.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f45114f = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f45115a = C.TIME_UNSET;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f45116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f45117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f45118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f45119e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f45117c = handlerThread;
            handlerThread.start();
            Handler handlerY = c0.y(handlerThread.getLooper(), this);
            this.f45116b = handlerY;
            handlerY.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f45118d;
            if (choreographer != null) {
                int i10 = this.f45119e + 1;
                this.f45119e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f45118d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                w1.n.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f45114f;
        }

        private void f() {
            Choreographer choreographer = this.f45118d;
            if (choreographer != null) {
                int i10 = this.f45119e - 1;
                this.f45119e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f45115a = C.TIME_UNSET;
                }
            }
        }

        public void a() {
            this.f45116b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f45115a = j10;
            ((Choreographer) w1.a.e(this.f45118d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f45116b.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public g(Context context) {
        b bVarF = f(context);
        this.f45096b = bVarF;
        this.f45097c = bVarF != null ? c.d() : null;
        this.f45105k = C.TIME_UNSET;
        this.f45106l = C.TIME_UNSET;
        this.f45100f = -1.0f;
        this.f45103i = 1.0f;
        this.f45104j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (c0.f55769a < 30 || (surface = this.f45099e) == null || this.f45104j == Integer.MIN_VALUE || this.f45102h == 0.0f) {
            return;
        }
        this.f45102h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f45107m = 0L;
        this.f45110p = -1L;
        this.f45108n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f45105k = refreshRate;
            this.f45106l = (refreshRate * 80) / 100;
        } else {
            w1.n.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f45105k = C.TIME_UNSET;
            this.f45106l = C.TIME_UNSET;
        }
    }

    private void q() {
        if (c0.f55769a < 30 || this.f45099e == null) {
            return;
        }
        float fB = this.f45095a.e() ? this.f45095a.b() : this.f45100f;
        float f10 = this.f45101g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f45101g) < ((!this.f45095a.e() || this.f45095a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f45095a.c() < 30) {
            return;
        }
        this.f45101g = fB;
        r(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void r(boolean z10) {
        Surface surface;
        float f10;
        if (c0.f55769a < 30 || (surface = this.f45099e) == null || this.f45104j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f45098d) {
            float f11 = this.f45101g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f45103i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f45102h != f10) {
            this.f45102h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        if (this.f45110p == -1 || !this.f45095a.e()) {
            j11 = j10;
        } else {
            long jA = this.f45111q + ((long) ((this.f45095a.a() * (this.f45107m - this.f45110p)) / this.f45103i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f45108n = this.f45107m;
        this.f45109o = j11;
        c cVar = this.f45097c;
        if (cVar != null && this.f45105k != C.TIME_UNSET) {
            long j12 = cVar.f45115a;
            if (j12 != C.TIME_UNSET) {
                return e(j11, j12, this.f45105k) - this.f45106l;
            }
        }
        return j11;
    }

    public void g(float f10) {
        this.f45100f = f10;
        this.f45095a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f45108n;
        if (j11 != -1) {
            this.f45110p = j11;
            this.f45111q = this.f45109o;
        }
        this.f45107m++;
        this.f45095a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f45103i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f45098d = true;
        n();
        if (this.f45096b != null) {
            ((c) w1.a.e(this.f45097c)).a();
            this.f45096b.b();
        }
        r(false);
    }

    public void l() {
        this.f45098d = false;
        b bVar = this.f45096b;
        if (bVar != null) {
            bVar.c();
            ((c) w1.a.e(this.f45097c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof e) {
            surface = null;
        }
        if (this.f45099e == surface) {
            return;
        }
        d();
        this.f45099e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f45104j == i10) {
            return;
        }
        this.f45104j = i10;
        r(true);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f45112a;

        public b(DisplayManager displayManager) {
            this.f45112a = displayManager;
        }

        private Display a() {
            return this.f45112a.getDisplay(0);
        }

        public void b() {
            this.f45112a.registerDisplayListener(this, c0.z());
            g.this.p(a());
        }

        public void c() {
            this.f45112a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                g.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
