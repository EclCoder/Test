package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import m2.r;
import sc.x;
import t1.e0;
import t1.f0;
import t1.g0;
import t1.l;
import t1.o;
import t1.p;
import t1.y;
import w1.c0;
import w1.j;
import w1.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r, f0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Executor f6124n = new Executor() { // from class: m2.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            androidx.media3.exoplayer.video.a.d(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f6126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.video.g f6127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.video.h f6128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y.a f6129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w1.d f6130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet f6131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o f6132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m2.f f6133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j f6134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Pair f6135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f6137m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f6138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.video.g f6139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e0.a f6140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private y.a f6141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private w1.d f6142e = w1.d.f55786a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6143f;

        public b(Context context, androidx.media3.exoplayer.video.g gVar) {
            this.f6138a = context.getApplicationContext();
            this.f6139b = gVar;
        }

        public a e() {
            w1.a.g(!this.f6143f);
            if (this.f6141d == null) {
                if (this.f6140c == null) {
                    this.f6140c = new e();
                }
                this.f6141d = new f(this.f6140c);
            }
            a aVar = new a(this);
            this.f6143f = true;
            return aVar;
        }

        public b f(w1.d dVar) {
            this.f6142e = dVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements androidx.media3.exoplayer.video.h.a {
        private c() {
        }

        @Override // androidx.media3.exoplayer.video.h.a
        public void a() {
            Iterator it = a.this.f6131g.iterator();
            while (it.hasNext()) {
                ((d) it.next()).m(a.this);
            }
            a.q(a.this);
            android.support.v4.media.session.b.a(w1.a.i(null));
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.h.a
        public void b(long j10, long j11, long j12, boolean z10) {
            if (z10 && a.this.f6135k != null) {
                Iterator it = a.this.f6131g.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).q(a.this);
                }
            }
            if (a.this.f6133i != null) {
                a.this.f6133i.d(j11, a.this.f6130f.nanoTime(), a.this.f6132h == null ? new o.b().K() : a.this.f6132h, null);
            }
            a.q(a.this);
            android.support.v4.media.session.b.a(w1.a.i(null));
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.h.a
        public void onVideoSizeChanged(g0 g0Var) {
            a.this.f6132h = new o.b().t0(g0Var.f52694a).Y(g0Var.f52695b).o0("video/raw").K();
            Iterator it = a.this.f6131g.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f(a.this, g0Var);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void f(a aVar, g0 g0Var);

        void m(a aVar);

        void q(a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final x f6145a = sc.y.a(new x() { // from class: androidx.media3.exoplayer.video.b
            @Override // sc.x
            public final Object get() {
                return a.e.a();
            }
        });

        private e() {
        }

        public static /* synthetic */ e0.a a() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (e0.a) w1.a.e(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f implements y.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0.a f6146a;

        public f(e0.a aVar) {
            this.f6146a = aVar;
        }

        @Override // t1.y.a
        public y a(Context context, t1.f fVar, t1.i iVar, f0 f0Var, Executor executor, List list, long j10) throws VideoFrameProcessingException {
            try {
                ((y.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(e0.a.class).newInstance(this.f6146a)).a(context, fVar, iVar, f0Var, executor, list, j10);
                return null;
            } catch (Exception e10) {
                throw VideoFrameProcessingException.a(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Constructor f6147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f6148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f6149c;

        public static l a(float f10) {
            try {
                b();
                Object objNewInstance = f6147a.newInstance(null);
                f6148b.invoke(objNewInstance, Float.valueOf(f10));
                android.support.v4.media.session.b.a(w1.a.e(f6149c.invoke(objNewInstance, null)));
                return null;
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }

        private static void b() throws ClassNotFoundException {
            if (f6147a == null || f6148b == null || f6149c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f6147a = cls.getConstructor(null);
                f6148b = cls.getMethod("setRotationDegrees", Float.TYPE);
                f6149c = cls.getMethod("build", null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class h implements VideoSink, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f6150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6151b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private o f6153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f6155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f6156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f6157h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f6160k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f6161l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f6152c = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f6158i = C.TIME_UNSET;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f6159j = C.TIME_UNSET;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private VideoSink.a f6162m = VideoSink.a.f6123a;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Executor f6163n = a.f6124n;

        public h(Context context) {
            this.f6150a = context;
            this.f6151b = c0.Y(context);
        }

        public static /* synthetic */ void v(h hVar, VideoSink.a aVar) {
            hVar.getClass();
            aVar.c((VideoSink) w1.a.i(hVar));
        }

        public static /* synthetic */ void w(h hVar, VideoSink.a aVar) {
            hVar.getClass();
            aVar.b(hVar);
        }

        public static /* synthetic */ void x(h hVar, VideoSink.a aVar, g0 g0Var) {
            hVar.getClass();
            aVar.a(hVar, g0Var);
        }

        private void y() {
            if (this.f6153d == null) {
                return;
            }
            new ArrayList().addAll(this.f6152c);
            o oVar = (o) w1.a.e(this.f6153d);
            android.support.v4.media.session.b.a(w1.a.i(null));
            new p.b(a.y(oVar.A), oVar.f52763t, oVar.f52764u).b(oVar.f52767x).a();
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void a(int i10, o oVar) {
            int i11;
            w1.a.g(isInitialized());
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i10);
            }
            a.this.f6127c.p(oVar.f52765v);
            if (i10 == 1 && c0.f55769a < 21 && (i11 = oVar.f52766w) != -1 && i11 != 0) {
                g.a(i11);
            }
            this.f6154e = i10;
            this.f6153d = oVar;
            if (this.f6160k) {
                w1.a.g(this.f6159j != C.TIME_UNSET);
                this.f6161l = this.f6159j;
            } else {
                y();
                this.f6160k = true;
                this.f6161l = C.TIME_UNSET;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void b() {
            a.this.f6127c.a();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public long c(long j10, boolean z10) {
            w1.a.g(isInitialized());
            w1.a.g(this.f6151b != -1);
            long j11 = this.f6161l;
            if (j11 != C.TIME_UNSET) {
                if (!a.this.z(j11)) {
                    return C.TIME_UNSET;
                }
                y();
                this.f6161l = C.TIME_UNSET;
            }
            android.support.v4.media.session.b.a(w1.a.i(null));
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void d() {
            a.this.f6127c.l();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void e(List list) {
            if (this.f6152c.equals(list)) {
                return;
            }
            z(list);
            y();
        }

        @Override // androidx.media3.exoplayer.video.a.d
        public void f(a aVar, final g0 g0Var) {
            final VideoSink.a aVar2 = this.f6162m;
            this.f6163n.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.c
                @Override // java.lang.Runnable
                public final void run() {
                    a.h.x(this.f6165a, aVar2, g0Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void g(long j10, long j11) {
            this.f6157h |= (this.f6155f == j10 && this.f6156g == j11) ? false : true;
            this.f6155f = j10;
            this.f6156g = j11;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean h() {
            return c0.x0(this.f6150a);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void i(boolean z10) {
            a.this.f6127c.h(z10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            if (!isInitialized()) {
                return false;
            }
            long j10 = this.f6158i;
            return j10 != C.TIME_UNSET && a.this.z(j10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady() {
            return isInitialized() && a.this.C();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void j(m2.f fVar) {
            a.this.I(fVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface k() {
            w1.a.g(isInitialized());
            android.support.v4.media.session.b.a(w1.a.i(null));
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void l() {
            a.this.f6127c.k();
        }

        @Override // androidx.media3.exoplayer.video.a.d
        public void m(a aVar) {
            final VideoSink.a aVar2 = this.f6162m;
            this.f6163n.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.d
                @Override // java.lang.Runnable
                public final void run() {
                    a.h.v(this.f6168a, aVar2);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void n() {
            a.this.f6127c.g();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void o(float f10) {
            a.this.H(f10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void p() {
            a.this.v();
        }

        @Override // androidx.media3.exoplayer.video.a.d
        public void q(a aVar) {
            final VideoSink.a aVar2 = this.f6162m;
            this.f6163n.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.e
                @Override // java.lang.Runnable
                public final void run() {
                    a.h.w(this.f6170a, aVar2);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void r(boolean z10) {
            if (isInitialized()) {
                throw null;
            }
            this.f6160k = false;
            this.f6158i = C.TIME_UNSET;
            this.f6159j = C.TIME_UNSET;
            a.this.w();
            if (z10) {
                a.this.f6127c.m();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            a.this.E();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j10, long j11) throws VideoSink.VideoSinkException {
            try {
                a.this.F(j10, j11);
            } catch (ExoPlaybackException e10) {
                o oVarK = this.f6153d;
                if (oVarK == null) {
                    oVarK = new o.b().K();
                }
                throw new VideoSink.VideoSinkException(e10, oVarK);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void s(Surface surface, v vVar) {
            a.this.G(surface, vVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void t(VideoSink.a aVar, Executor executor) {
            this.f6162m = aVar;
            this.f6163n = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void u(o oVar) throws VideoSink.VideoSinkException {
            w1.a.g(!isInitialized());
            a.t(a.this, oVar);
        }

        public void z(List list) {
            this.f6152c.clear();
            this.f6152c.addAll(list);
        }
    }

    private e0 A(o oVar) throws VideoSink.VideoSinkException {
        w1.a.g(this.f6137m == 0);
        t1.f fVarY = y(oVar.A);
        if (fVarY.f52678c == 7 && c0.f55769a < 34) {
            fVarY = fVarY.a().e(6).a();
        }
        t1.f fVar = fVarY;
        final j jVarCreateHandler = this.f6130f.createHandler((Looper) w1.a.i(Looper.myLooper()), null);
        this.f6134j = jVarCreateHandler;
        try {
            y.a aVar = this.f6129e;
            Context context = this.f6125a;
            t1.i iVar = t1.i.f52698a;
            Objects.requireNonNull(jVarCreateHandler);
            try {
                aVar.a(context, fVar, iVar, this, new Executor() { // from class: m2.a
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        jVarCreateHandler.post(runnable);
                    }
                }, com.google.common.collect.c0.C(), 0L);
                Pair pair = this.f6135k;
                if (pair == null) {
                    throw null;
                }
                Surface surface = (Surface) pair.first;
                v vVar = (v) pair.second;
                D(surface, vVar.b(), vVar.a());
                throw null;
            } catch (VideoFrameProcessingException e10) {
                e = e10;
                throw new VideoSink.VideoSinkException(e, oVar);
            }
        } catch (VideoFrameProcessingException e11) {
            e = e11;
        }
    }

    private boolean B() {
        return this.f6137m == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        return this.f6136l == 0 && this.f6128d.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(float f10) {
        this.f6128d.j(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(m2.f fVar) {
        this.f6133i = fVar;
    }

    static /* synthetic */ y q(a aVar) {
        aVar.getClass();
        return null;
    }

    static /* synthetic */ e0 t(a aVar, o oVar) throws VideoSink.VideoSinkException {
        aVar.A(oVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (B()) {
            this.f6136l++;
            this.f6128d.b();
            ((j) w1.a.i(this.f6134j)).post(new Runnable() { // from class: m2.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45070a.x();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        int i10 = this.f6136l - 1;
        this.f6136l = i10;
        if (i10 > 0) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalStateException(String.valueOf(this.f6136l));
        }
        this.f6128d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t1.f y(t1.f fVar) {
        return (fVar == null || !fVar.g()) ? t1.f.f52668h : fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(long j10) {
        return this.f6136l == 0 && this.f6128d.d(j10);
    }

    public void E() {
        if (this.f6137m == 2) {
            return;
        }
        j jVar = this.f6134j;
        if (jVar != null) {
            jVar.removeCallbacksAndMessages(null);
        }
        this.f6135k = null;
        this.f6137m = 2;
    }

    public void F(long j10, long j11) {
        if (this.f6136l == 0) {
            this.f6128d.h(j10, j11);
        }
    }

    public void G(Surface surface, v vVar) {
        Pair pair = this.f6135k;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((v) this.f6135k.second).equals(vVar)) {
            return;
        }
        this.f6135k = Pair.create(surface, vVar);
        D(surface, vVar.b(), vVar.a());
    }

    @Override // m2.r
    public androidx.media3.exoplayer.video.g a() {
        return this.f6127c;
    }

    @Override // m2.r
    public VideoSink b() {
        return this.f6126b;
    }

    public void u(d dVar) {
        this.f6131g.add(dVar);
    }

    public void v() {
        v vVar = v.f55847c;
        D(null, vVar.b(), vVar.a());
        this.f6135k = null;
    }

    private a(b bVar) {
        Context context = bVar.f6138a;
        this.f6125a = context;
        h hVar = new h(context);
        this.f6126b = hVar;
        w1.d dVar = bVar.f6142e;
        this.f6130f = dVar;
        androidx.media3.exoplayer.video.g gVar = bVar.f6139b;
        this.f6127c = gVar;
        gVar.o(dVar);
        this.f6128d = new androidx.media3.exoplayer.video.h(new c(), gVar);
        this.f6129e = (y.a) w1.a.i(bVar.f6141d);
        this.f6131g = new CopyOnWriteArraySet();
        this.f6137m = 0;
        u(hVar);
    }

    public static /* synthetic */ void d(Runnable runnable) {
    }

    private void D(Surface surface, int i10, int i11) {
    }
}
