package pb;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pb.e f49937a = new pb.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f49938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f49939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f49941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f49942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f49943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f49944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f49945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f49947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f49948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f49949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f49950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f49951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f49952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f49953q;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                ob.u.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public interface a {
            void a(Display display);
        }

        void a();

        void b(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final e f49957f = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f49958a = C.TIME_UNSET;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f49959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f49960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f49961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f49962e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f49960c = handlerThread;
            handlerThread.start();
            Handler handlerV = r0.v(handlerThread.getLooper(), this);
            this.f49959b = handlerV;
            handlerV.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f49961d;
            if (choreographer != null) {
                int i10 = this.f49962e + 1;
                this.f49962e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f49961d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                ob.u.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static e d() {
            return f49957f;
        }

        private void f() {
            Choreographer choreographer = this.f49961d;
            if (choreographer != null) {
                int i10 = this.f49962e - 1;
                this.f49962e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f49958a = C.TIME_UNSET;
                }
            }
        }

        public void a() {
            this.f49959b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f49958a = j10;
            ((Choreographer) ob.a.e(this.f49961d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f49959b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            }
            if (i10 == 1) {
                b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public m(Context context) {
        b bVarF = f(context);
        this.f49938b = bVarF;
        this.f49939c = bVarF != null ? e.d() : null;
        this.f49947k = C.TIME_UNSET;
        this.f49948l = C.TIME_UNSET;
        this.f49942f = -1.0f;
        this.f49945i = 1.0f;
        this.f49946j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (r0.f48425a < 30 || (surface = this.f49941e) == null || this.f49946j == Integer.MIN_VALUE || this.f49944h == 0.0f) {
            return;
        }
        this.f49944h = 0.0f;
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

    private static b f(Context context) {
        b bVarD = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            bVarD = r0.f48425a >= 17 ? d.d(applicationContext) : null;
            if (bVarD == null) {
                return c.c(applicationContext);
            }
        }
        return bVarD;
    }

    private void n() {
        this.f49949m = 0L;
        this.f49952p = -1L;
        this.f49950n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f49947k = refreshRate;
            this.f49948l = (refreshRate * 80) / 100;
        } else {
            ob.u.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f49947k = C.TIME_UNSET;
            this.f49948l = C.TIME_UNSET;
        }
    }

    private void q() {
        if (r0.f48425a < 30 || this.f49941e == null) {
            return;
        }
        float fB = this.f49937a.e() ? this.f49937a.b() : this.f49942f;
        float f10 = this.f49943g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f49943g) < ((!this.f49937a.e() || this.f49937a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f49937a.c() < 30) {
            return;
        }
        this.f49943g = fB;
        r(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void r(boolean z10) {
        Surface surface;
        float f10;
        if (r0.f48425a < 30 || (surface = this.f49941e) == null || this.f49946j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f49940d) {
            float f11 = this.f49943g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f49945i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f49944h != f10) {
            this.f49944h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        if (this.f49952p == -1 || !this.f49937a.e()) {
            j11 = j10;
        } else {
            long jA = this.f49953q + ((long) ((this.f49937a.a() * (this.f49949m - this.f49952p)) / this.f49945i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f49950n = this.f49949m;
        this.f49951o = j11;
        e eVar = this.f49939c;
        if (eVar != null && this.f49947k != C.TIME_UNSET) {
            long j12 = eVar.f49958a;
            if (j12 != C.TIME_UNSET) {
                return e(j11, j12, this.f49947k) - this.f49948l;
            }
        }
        return j11;
    }

    public void g(float f10) {
        this.f49942f = f10;
        this.f49937a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f49950n;
        if (j11 != -1) {
            this.f49952p = j11;
            this.f49953q = this.f49951o;
        }
        this.f49949m++;
        this.f49937a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f49945i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f49940d = true;
        n();
        if (this.f49938b != null) {
            ((e) ob.a.e(this.f49939c)).a();
            this.f49938b.b(new b.a() { // from class: pb.l
                @Override // pb.m.b.a
                public final void a(Display display) {
                    this.f49936a.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f49940d = false;
        b bVar = this.f49938b;
        if (bVar != null) {
            bVar.a();
            ((e) ob.a.e(this.f49939c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof h) {
            surface = null;
        }
        if (this.f49941e == surface) {
            return;
        }
        d();
        this.f49941e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f49946j == i10) {
            return;
        }
        this.f49946j = i10;
        r(true);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowManager f49954a;

        private c(WindowManager windowManager) {
            this.f49954a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // pb.m.b
        public void b(b.a aVar) {
            aVar.a(this.f49954a.getDefaultDisplay());
        }

        @Override // pb.m.b
        public void a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f49955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b.a f49956b;

        private d(DisplayManager displayManager) {
            this.f49955a = displayManager;
        }

        private Display c() {
            return this.f49955a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // pb.m.b
        public void a() {
            this.f49955a.unregisterDisplayListener(this);
            this.f49956b = null;
        }

        @Override // pb.m.b
        public void b(b.a aVar) {
            this.f49956b = aVar;
            this.f49955a.registerDisplayListener(this, r0.w());
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f49956b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
