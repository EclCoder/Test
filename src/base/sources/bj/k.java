package bj;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import fl.g0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements SurfaceTexture.OnFrameAvailableListener, b {
    private boolean A;
    private final zi.c B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f8976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oi.a f8977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oi.a f8978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final oi.a f8979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final oi.a f8980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pi.c f8981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private qi.a f8989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BlockingQueue f8990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LinkedBlockingQueue f8991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ti.a f8997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ExecutorService f8998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ri.b f8999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final bj.a f9000z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9001a;

        static {
            int[] iArr = new int[qi.a.values().length];
            try {
                iArr[qi.a.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qi.a.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qi.a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9001a = iArr;
        }
    }

    public k(Context context) {
        s.h(context, "context");
        this.f8975a = context;
        this.f8976b = new AtomicBoolean(false);
        this.f8977c = new oi.a();
        this.f8978d = new oi.a();
        this.f8979e = new oi.a();
        this.f8980f = new oi.a();
        this.f8981g = new pi.c();
        this.f8989o = qi.a.NONE;
        this.f8990p = new LinkedBlockingQueue();
        this.f8991q = new LinkedBlockingQueue();
        this.f8997w = ti.a.Adjust;
        this.f8999y = new ri.b();
        this.f9000z = new bj.a();
        this.B = new zi.c(context, true, true, new zi.c.b() { // from class: bj.d
            @Override // zi.c.b
            public final void a(int i10, boolean z10) {
                k.q(this.f8968a, i10, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 l(k kVar, Surface surface) {
        if (kVar.f8977c.e()) {
            kVar.f8978d.g();
            kVar.f8978d.d(surface, kVar.f8977c);
        }
        return g0.f38750a;
    }

    private final void m(boolean z10) {
        boolean z11;
        if (!n() || this.f8999y.a()) {
            return;
        }
        if (!z10) {
            this.f9000z.e();
        }
        if (this.f8977c.e() && this.f8981g.g()) {
            this.f8977c.f();
            this.f8981g.j();
            this.f8981g.a();
            this.f8977c.h();
        }
        if (!this.f8990p.isEmpty() && this.f8981g.g()) {
            try {
                android.support.v4.media.session.b.a(this.f8990p.take());
                throw null;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        int i10 = a.f9001a[this.f8989o.ordinal()];
        boolean z12 = true;
        if (i10 == 1) {
            z11 = z12;
        } else if (i10 == 2) {
            z11 = false;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = this.f8988n;
            z11 = z12;
        }
        if (this.f8978d.e() && this.f8981g.g()) {
            boolean z13 = this.f8992r;
            int i11 = z13 ? 0 : this.f8982h;
            int i12 = z13 ? 0 : this.f8983i;
            this.f8978d.f();
            this.f8981g.b(i11, i12, z11, this.f8984j, this.f8996v, this.f8995u);
            this.f8978d.h();
        }
        if (this.f8980f.e() && this.f8981g.g()) {
            int i13 = this.f8985k;
            if (i13 == 0) {
                i13 = this.f8982h;
            }
            int i14 = i13;
            int i15 = this.f8986l;
            if (i15 == 0) {
                i15 = this.f8983i;
            }
            this.f8980f.f();
            this.f8981g.c(i14, i15, z11, this.f8997w, this.f8987m, this.f8994t, this.f8993s);
            this.f8980f.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(k kVar) {
        kVar.m(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 p(k kVar) {
        kVar.f8978d.g();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(k kVar, int i10, boolean z10) {
        if (kVar.A) {
            kVar.r(i10);
            kVar.f8988n = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 u(final k kVar) {
        kVar.f8977c.g();
        kVar.f8977c.a();
        kVar.f8977c.f();
        pi.c cVar = kVar.f8981g;
        Context context = kVar.f8975a;
        int i10 = kVar.f8982h;
        int i11 = kVar.f8983i;
        cVar.f(context, i10, i11, i10, i11);
        kVar.f8979e.g();
        kVar.f8979e.c(kVar.f8982h, kVar.f8983i, kVar.f8977c);
        kVar.f8976b.set(true);
        kVar.f8981g.e().setOnFrameAvailableListener(kVar);
        kVar.f9000z.f(new tl.a() { // from class: bj.i
            @Override // tl.a
            public final Object invoke() {
                return k.v(this.f8973a);
            }
        });
        if (kVar.A) {
            kVar.B.e();
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 v(final k kVar) {
        ExecutorService executorService = kVar.f8998x;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: bj.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.w(this.f8974a);
                }
            });
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(k kVar) {
        kVar.m(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 x(k kVar) {
        kVar.f9000z.g();
        kVar.B.f();
        kVar.f8979e.g();
        kVar.f8978d.g();
        kVar.f8977c.g();
        kVar.f8981g.h();
        return g0.f38750a;
    }

    @Override // bj.b
    public void a(int i10, int i11) {
        this.f8982h = i10;
        this.f8983i = i11;
    }

    @Override // bj.b
    public void b(final Surface surface) {
        s.h(surface, "surface");
        ExecutorService executorService = this.f8998x;
        if (executorService != null) {
            ji.i.m(executorService, 0L, new tl.a() { // from class: bj.c
                @Override // tl.a
                public final Object invoke() {
                    return k.l(this.f8966a, surface);
                }
            }, 1, null);
        }
    }

    @Override // bj.b
    public void c() {
        this.f8991q.clear();
        ExecutorService executorService = this.f8998x;
        if (executorService != null) {
            ji.i.m(executorService, 0L, new tl.a() { // from class: bj.e
                @Override // tl.a
                public final Object invoke() {
                    return k.p(this.f8969a);
                }
            }, 1, null);
        }
    }

    @Override // bj.b
    public Surface getSurface() {
        return this.f8981g.d();
    }

    public boolean n() {
        return this.f8976b.get();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ExecutorService executorService;
        if (n() && (executorService = this.f8998x) != null) {
            executorService.execute(new Runnable() { // from class: bj.h
                @Override // java.lang.Runnable
                public final void run() {
                    k.o(this.f8972a);
                }
            });
        }
    }

    public final void r(int i10) {
        this.f8981g.i(i10);
    }

    public final void s(boolean z10) {
        this.f8988n = z10;
    }

    @Override // bj.b
    public void start() {
        ExecutorService executorServiceI = ji.i.i(this.f8991q);
        this.f8998x = executorServiceI;
        if (executorServiceI != null) {
            ji.i.m(executorServiceI, 0L, new tl.a() { // from class: bj.g
                @Override // tl.a
                public final Object invoke() {
                    return k.u(this.f8971a);
                }
            }, 1, null);
        }
    }

    @Override // bj.b
    public void stop() {
        this.f8976b.set(false);
        this.f8991q.clear();
        ExecutorService executorService = this.f8998x;
        if (executorService != null) {
            ji.i.m(executorService, 0L, new tl.a() { // from class: bj.f
                @Override // tl.a
                public final Object invoke() {
                    return k.x(this.f8970a);
                }
            }, 1, null);
        }
        ExecutorService executorService2 = this.f8998x;
        if (executorService2 != null) {
            executorService2.shutdownNow();
        }
        this.f8998x = null;
    }

    public final void t(int i10, int i11) {
        this.f8985k = i10;
        this.f8986l = i11;
    }
}
