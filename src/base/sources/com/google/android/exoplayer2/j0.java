package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.exoplayer2.x1;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j0 extends com.google.android.exoplayer2.e implements k {
    private final com.google.android.exoplayer2.d A;
    private final e2 B;
    private final j2 C;
    private final k2 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private o9.j0 L;
    private com.google.android.exoplayer2.source.e0 M;
    private boolean N;
    private x1.b O;
    private z0 P;
    private z0 Q;
    private v0 R;
    private v0 S;
    private AudioTrack T;
    private Object U;
    private Surface V;
    private SurfaceHolder W;
    private qb.l X;
    private boolean Y;
    private TextureView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f17072a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final lb.b0 f17073b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f17074b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final x1.b f17075c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ob.g0 f17076c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ob.g f17077d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private s9.e f17078d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f17079e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private s9.e f17080e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x1 f17081f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f17082f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b2[] f17083g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.a f17084g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final lb.a0 f17085h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f17086h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ob.q f17087i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f17088i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u0.f f17089j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private bb.f f17090j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u0 f17091k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f17092k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ob.t f17093l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f17094l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArraySet f17095m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f17096m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h2.b f17097n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f17098n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f17099o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private j f17100o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f17101p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private pb.z f17102p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.p.a f17103q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private z0 f17104q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p9.a f17105r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private v1 f17106r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Looper f17107s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f17108s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nb.d f17109t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f17110t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f17111u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private long f17112u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f17113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ob.d f17114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final c f17115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final d f17116y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final com.google.android.exoplayer2.b f17117z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static p9.s1 a(Context context, j0 j0Var, boolean z10) {
            p9.q1 q1VarW0 = p9.q1.w0(context);
            if (q1VarW0 == null) {
                ob.u.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new p9.s1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                j0Var.V0(q1VarW0);
            }
            return new p9.s1(q1VarW0.D0());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements pb.k, qb.a, y1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private pb.k f17119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qb.a f17120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private pb.k f17121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qb.a f17122d;

        private d() {
        }

        @Override // qb.a
        public void a(long j10, float[] fArr) {
            qb.a aVar = this.f17122d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            qb.a aVar2 = this.f17120b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // pb.k
        public void b(long j10, long j11, v0 v0Var, MediaFormat mediaFormat) {
            long j12;
            long j13;
            v0 v0Var2;
            MediaFormat mediaFormat2;
            pb.k kVar = this.f17121c;
            if (kVar != null) {
                kVar.b(j10, j11, v0Var, mediaFormat);
                mediaFormat2 = mediaFormat;
                v0Var2 = v0Var;
                j13 = j11;
                j12 = j10;
            } else {
                j12 = j10;
                j13 = j11;
                v0Var2 = v0Var;
                mediaFormat2 = mediaFormat;
            }
            pb.k kVar2 = this.f17119a;
            if (kVar2 != null) {
                kVar2.b(j12, j13, v0Var2, mediaFormat2);
            }
        }

        @Override // qb.a
        public void c() {
            qb.a aVar = this.f17122d;
            if (aVar != null) {
                aVar.c();
            }
            qb.a aVar2 = this.f17120b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // com.google.android.exoplayer2.y1.b
        public void handleMessage(int i10, Object obj) {
            if (i10 == 7) {
                this.f17119a = (pb.k) obj;
                return;
            }
            if (i10 == 8) {
                this.f17120b = (qb.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            qb.l lVar = (qb.l) obj;
            if (lVar == null) {
                this.f17121c = null;
                this.f17122d = null;
            } else {
                this.f17121c = lVar.getVideoFrameMetadataListener();
                this.f17122d = lVar.getCameraMotionListener();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f17123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h2 f17124b;

        public e(Object obj, h2 h2Var) {
            this.f17123a = obj;
            this.f17124b = h2Var;
        }

        @Override // com.google.android.exoplayer2.e1
        public Object a() {
            return this.f17123a;
        }

        @Override // com.google.android.exoplayer2.e1
        public h2 b() {
            return this.f17124b;
        }
    }

    static {
        o9.n.a("goog.exo.exoplayer");
    }

    public j0(k.b bVar, x1 x1Var) {
        ob.g gVar = new ob.g();
        this.f17077d = gVar;
        try {
            ob.u.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + ob.r0.f48429e + "]");
            Context applicationContext = bVar.f17132a.getApplicationContext();
            this.f17079e = applicationContext;
            p9.a aVar = (p9.a) bVar.f17140i.apply(bVar.f17133b);
            this.f17105r = aVar;
            this.f17084g0 = bVar.f17142k;
            this.f17072a0 = bVar.f17148q;
            this.f17074b0 = bVar.f17149r;
            this.f17088i0 = bVar.f17146o;
            this.E = bVar.f17156y;
            c cVar = new c();
            this.f17115x = cVar;
            d dVar = new d();
            this.f17116y = dVar;
            Handler handler = new Handler(bVar.f17141j);
            b2[] b2VarArrA = ((o9.i0) bVar.f17135d.get()).a(handler, cVar, cVar, cVar, cVar);
            this.f17083g = b2VarArrA;
            ob.a.g(b2VarArrA.length > 0);
            lb.a0 a0Var = (lb.a0) bVar.f17137f.get();
            this.f17085h = a0Var;
            this.f17103q = (com.google.android.exoplayer2.source.p.a) bVar.f17136e.get();
            nb.d dVar2 = (nb.d) bVar.f17139h.get();
            this.f17109t = dVar2;
            this.f17101p = bVar.f17150s;
            this.L = bVar.f17151t;
            this.f17111u = bVar.f17152u;
            this.f17113v = bVar.f17153v;
            this.N = bVar.f17157z;
            Looper looper = bVar.f17141j;
            this.f17107s = looper;
            ob.d dVar3 = bVar.f17133b;
            this.f17114w = dVar3;
            x1 x1Var2 = x1Var == null ? this : x1Var;
            this.f17081f = x1Var2;
            this.f17093l = new ob.t(looper, dVar3, new ob.t.b() { // from class: com.google.android.exoplayer2.r
                @Override // ob.t.b
                public final void a(Object obj, ob.o oVar) {
                    ((x1.d) obj).L(this.f17334a.f17081f, new x1.c(oVar));
                }
            });
            this.f17095m = new CopyOnWriteArraySet();
            this.f17099o = new ArrayList();
            this.M = new com.google.android.exoplayer2.source.e0.a(0);
            lb.b0 b0Var = new lb.b0(new o9.h0[b2VarArrA.length], new lb.r[b2VarArrA.length], i2.f17044b, null);
            this.f17073b = b0Var;
            this.f17097n = new h2.b();
            x1.b bVarE = new x1.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).d(29, a0Var.h()).d(23, bVar.f17147p).d(25, bVar.f17147p).d(33, bVar.f17147p).d(26, bVar.f17147p).d(34, bVar.f17147p).e();
            this.f17075c = bVarE;
            this.O = new x1.b.a().b(bVarE).a(4).a(10).e();
            this.f17087i = dVar3.createHandler(looper, null);
            u0.f fVar = new u0.f() { // from class: com.google.android.exoplayer2.s
                @Override // com.google.android.exoplayer2.u0.f
                public final void a(u0.e eVar) {
                    j0 j0Var = this.f17338a;
                    j0Var.f17087i.post(new Runnable() { // from class: com.google.android.exoplayer2.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            j0Var.p1(eVar);
                        }
                    });
                }
            };
            this.f17089j = fVar;
            this.f17106r0 = v1.k(b0Var);
            aVar.t(x1Var2, looper);
            int i10 = ob.r0.f48425a;
            u0 u0Var = new u0(b2VarArrA, a0Var, b0Var, (o9.r) bVar.f17138g.get(), dVar2, this.F, this.G, aVar, this.L, bVar.f17154w, bVar.f17155x, this.N, looper, dVar3, fVar, i10 < 31 ? new p9.s1() : b.a(applicationContext, this, bVar.A), bVar.B);
            this.f17091k = u0Var;
            this.f17086h0 = 1.0f;
            this.F = 0;
            z0 z0Var = z0.I;
            this.P = z0Var;
            this.Q = z0Var;
            this.f17104q0 = z0Var;
            this.f17108s0 = -1;
            if (i10 < 21) {
                this.f17082f0 = q1(0);
            } else {
                this.f17082f0 = ob.r0.G(applicationContext);
            }
            this.f17090j0 = bb.f.f8775c;
            this.f17092k0 = true;
            E(aVar);
            dVar2.d(new Handler(looper), aVar);
            W0(cVar);
            long j10 = bVar.f17134c;
            if (j10 > 0) {
                u0Var.u(j10);
            }
            com.google.android.exoplayer2.b bVar2 = new com.google.android.exoplayer2.b(bVar.f17132a, handler, cVar);
            this.f17117z = bVar2;
            bVar2.b(bVar.f17145n);
            com.google.android.exoplayer2.d dVar4 = new com.google.android.exoplayer2.d(bVar.f17132a, handler, cVar);
            this.A = dVar4;
            dVar4.m(bVar.f17143l ? this.f17084g0 : null);
            if (bVar.f17147p) {
                e2 e2Var = new e2(bVar.f17132a, handler, cVar);
                this.B = e2Var;
                e2Var.h(ob.r0.j0(this.f17084g0.f16548c));
            } else {
                this.B = null;
            }
            j2 j2Var = new j2(bVar.f17132a);
            this.C = j2Var;
            j2Var.a(bVar.f17144m != 0);
            k2 k2Var = new k2(bVar.f17132a);
            this.D = k2Var;
            k2Var.a(bVar.f17144m == 2);
            this.f17100o0 = b1(this.B);
            this.f17102p0 = pb.z.f49991e;
            this.f17076c0 = ob.g0.f48376c;
            a0Var.l(this.f17084g0);
            x1(1, 10, Integer.valueOf(this.f17082f0));
            x1(2, 10, Integer.valueOf(this.f17082f0));
            x1(1, 3, this.f17084g0);
            x1(2, 4, Integer.valueOf(this.f17072a0));
            x1(2, 5, Integer.valueOf(this.f17074b0));
            x1(1, 9, Boolean.valueOf(this.f17088i0));
            x1(2, 7, dVar);
            x1(6, 8, dVar);
            gVar.e();
        } catch (Throwable th2) {
            this.f17077d.e();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    private void B1(List list, int i10, long j10, boolean z10) {
        long j11;
        int i11;
        int i12;
        v1 v1VarH;
        boolean z11;
        int iE = i10;
        int iJ1 = j1(this.f17106r0);
        long currentPosition = getCurrentPosition();
        this.H++;
        if (!this.f17099o.isEmpty()) {
            v1(0, this.f17099o.size());
        }
        List listX0 = X0(0, list);
        h2 h2VarC1 = c1();
        if (!h2VarC1.u() && iE >= h2VarC1.t()) {
            throw new IllegalSeekPositionException(h2VarC1, iE, j10);
        }
        if (!z10) {
            if (iE == -1) {
                i11 = iJ1;
                j11 = currentPosition;
            } else {
                j11 = j10;
            }
            v1 v1VarR1 = r1(this.f17106r0, h2VarC1, s1(h2VarC1, i11, j11));
            i12 = v1VarR1.f18914e;
            if (i11 != -1 && i12 != 1) {
                if (!h2VarC1.u() || i11 >= h2VarC1.t()) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
            }
            v1VarH = v1VarR1.h(i12);
            this.f17091k.M0(listX0, i11, ob.r0.H0(j11), this.M);
            if (!this.f17106r0.f18911b.f51199a.equals(v1VarH.f18911b.f51199a) || this.f17106r0.f18910a.u()) {
                z11 = false;
            } else {
                z11 = true;
            }
            J1(v1VarH, 0, 1, z11, 4, i1(v1VarH), -1, false);
        }
        iE = h2VarC1.e(this.G);
        j11 = C.TIME_UNSET;
        i11 = iE;
        v1 v1VarR2 = r1(this.f17106r0, h2VarC1, s1(h2VarC1, i11, j11));
        i12 = v1VarR2.f18914e;
        if (i11 != -1) {
            if (h2VarC1.u()) {
                i12 = 4;
            } else {
                i12 = 4;
            }
        }
        v1VarH = v1VarR2.h(i12);
        this.f17091k.M0(listX0, i11, ob.r0.H0(j11), this.M);
        if (this.f17106r0.f18911b.f51199a.equals(v1VarH.f18911b.f51199a)) {
            z11 = false;
        } else {
            z11 = false;
        }
        J1(v1VarH, 0, 1, z11, 4, i1(v1VarH), -1, false);
    }

    private void C1(SurfaceHolder surfaceHolder) {
        this.Y = false;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f17115x);
        Surface surface = this.W.getSurface();
        if (surface == null || !surface.isValid()) {
            t1(0, 0);
        } else {
            Rect surfaceFrame = this.W.getSurfaceFrame();
            t1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        E1(surface);
        this.V = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (b2 b2Var : this.f17083g) {
            if (b2Var.getTrackType() == 2) {
                arrayList.add(e1(b2Var).n(1).m(obj).l());
            }
        }
        Object obj2 = this.U;
        if (obj2 != null && obj2 != obj) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((y1) obj3).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj4 = this.U;
            Surface surface = this.V;
            if (obj4 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z10) {
            G1(ExoPlaybackException.j(new ExoTimeoutException(3), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
        }
    }

    private void G1(ExoPlaybackException exoPlaybackException) {
        v1 v1Var = this.f17106r0;
        v1 v1VarC = v1Var.c(v1Var.f18911b);
        v1VarC.f18925p = v1VarC.f18927r;
        v1VarC.f18926q = 0L;
        v1 v1VarH = v1VarC.h(1);
        if (exoPlaybackException != null) {
            v1VarH = v1VarH.f(exoPlaybackException);
        }
        this.H++;
        this.f17091k.i1();
        J1(v1VarH, 0, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    private void H1() {
        x1.b bVar = this.O;
        x1.b bVarI = ob.r0.I(this.f17081f, this.f17075c);
        this.O = bVarI;
        if (bVarI.equals(bVar)) {
            return;
        }
        this.f17093l.h(13, new ob.t.a() { // from class: com.google.android.exoplayer2.z
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((x1.d) obj).y(this.f19135a.O);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        v1 v1VarA = this.f17106r0;
        if (v1VarA.f18921l == z11 && v1VarA.f18922m == i12) {
            return;
        }
        this.H++;
        if (v1VarA.f18924o) {
            v1VarA = v1VarA.a();
        }
        v1 v1VarE = v1VarA.e(z11, i12);
        this.f17091k.Q0(z11, i12);
        J1(v1VarE, 0, i11, false, 5, C.TIME_UNSET, -1, false);
    }

    private void J1(final v1 v1Var, final int i10, final int i11, boolean z10, final int i12, long j10, int i13, boolean z11) {
        v1 v1Var2 = this.f17106r0;
        this.f17106r0 = v1Var;
        boolean zEquals = v1Var2.f18910a.equals(v1Var.f18910a);
        Pair pairF1 = f1(v1Var, v1Var2, z10, i12, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairF1.first).booleanValue();
        final int iIntValue = ((Integer) pairF1.second).intValue();
        z0 z0VarY0 = this.P;
        final y0 y0Var = null;
        if (zBooleanValue) {
            if (!v1Var.f18910a.u()) {
                y0Var = v1Var.f18910a.r(v1Var.f18910a.l(v1Var.f18911b.f51199a, this.f17097n).f17000c, this.f16885a).f17020c;
            }
            this.f17104q0 = z0.I;
        }
        if (zBooleanValue || !v1Var2.f18919j.equals(v1Var.f18919j)) {
            this.f17104q0 = this.f17104q0.b().L(v1Var.f18919j).H();
            z0VarY0 = Y0();
        }
        boolean zEquals2 = z0VarY0.equals(this.P);
        this.P = z0VarY0;
        boolean z12 = v1Var2.f18921l != v1Var.f18921l;
        boolean z13 = v1Var2.f18914e != v1Var.f18914e;
        if (z13 || z12) {
            L1();
        }
        boolean z14 = v1Var2.f18916g;
        boolean z15 = v1Var.f18916g;
        boolean z16 = z14 != z15;
        if (z16) {
            K1(z15);
        }
        if (!zEquals) {
            this.f17093l.h(0, new ob.t.a() { // from class: com.google.android.exoplayer2.l
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    x1.d dVar = (x1.d) obj;
                    dVar.z(v1Var.f18910a, i10);
                }
            });
        }
        if (z10) {
            final x1.e eVarN1 = n1(i12, v1Var2, i13);
            final x1.e eVarM1 = m1(j10);
            this.f17093l.h(11, new ob.t.a() { // from class: com.google.android.exoplayer2.e0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    j0.g0(i12, eVarN1, eVarM1, (x1.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f17093l.h(1, new ob.t.a() { // from class: com.google.android.exoplayer2.f0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).P(y0Var, iIntValue);
                }
            });
        }
        if (v1Var2.f18915f != v1Var.f18915f) {
            this.f17093l.h(10, new ob.t.a() { // from class: com.google.android.exoplayer2.g0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).D(v1Var.f18915f);
                }
            });
            if (v1Var.f18915f != null) {
                this.f17093l.h(10, new ob.t.a() { // from class: com.google.android.exoplayer2.h0
                    @Override // ob.t.a
                    public final void invoke(Object obj) {
                        ((x1.d) obj).I(v1Var.f18915f);
                    }
                });
            }
        }
        lb.b0 b0Var = v1Var2.f18918i;
        lb.b0 b0Var2 = v1Var.f18918i;
        if (b0Var != b0Var2) {
            this.f17085h.i(b0Var2.f44110e);
            this.f17093l.h(2, new ob.t.a() { // from class: com.google.android.exoplayer2.i0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).H(v1Var.f18918i.f44109d);
                }
            });
        }
        if (!zEquals2) {
            final z0 z0Var = this.P;
            this.f17093l.h(14, new ob.t.a() { // from class: com.google.android.exoplayer2.m
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).B(z0Var);
                }
            });
        }
        if (z16) {
            this.f17093l.h(3, new ob.t.a() { // from class: com.google.android.exoplayer2.n
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    j0.o0(v1Var, (x1.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f17093l.h(-1, new ob.t.a() { // from class: com.google.android.exoplayer2.o
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    v1 v1Var3 = v1Var;
                    ((x1.d) obj).onPlayerStateChanged(v1Var3.f18921l, v1Var3.f18914e);
                }
            });
        }
        if (z13) {
            this.f17093l.h(4, new ob.t.a() { // from class: com.google.android.exoplayer2.p
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).onPlaybackStateChanged(v1Var.f18914e);
                }
            });
        }
        if (z12) {
            this.f17093l.h(5, new ob.t.a() { // from class: com.google.android.exoplayer2.w
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    x1.d dVar = (x1.d) obj;
                    dVar.onPlayWhenReadyChanged(v1Var.f18921l, i11);
                }
            });
        }
        if (v1Var2.f18922m != v1Var.f18922m) {
            this.f17093l.h(6, new ob.t.a() { // from class: com.google.android.exoplayer2.b0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).onPlaybackSuppressionReasonChanged(v1Var.f18922m);
                }
            });
        }
        if (v1Var2.n() != v1Var.n()) {
            this.f17093l.h(7, new ob.t.a() { // from class: com.google.android.exoplayer2.c0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).onIsPlayingChanged(v1Var.n());
                }
            });
        }
        if (!v1Var2.f18923n.equals(v1Var.f18923n)) {
            this.f17093l.h(12, new ob.t.a() { // from class: com.google.android.exoplayer2.d0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).n(v1Var.f18923n);
                }
            });
        }
        H1();
        this.f17093l.f();
        if (v1Var2.f18924o != v1Var.f18924o) {
            Iterator it = this.f17095m.iterator();
            while (it.hasNext()) {
                ((k.a) it.next()).B(v1Var.f18924o);
            }
        }
    }

    private void K1(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1() {
        int playbackState = getPlaybackState();
        boolean z10 = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zG1 = g1();
                j2 j2Var = this.C;
                if (getPlayWhenReady() && !zG1) {
                    z10 = true;
                }
                j2Var.b(z10);
                this.D.b(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    private void M1() {
        this.f17077d.b();
        if (Thread.currentThread() != w().getThread()) {
            String strD = ob.r0.D("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), w().getThread().getName());
            if (this.f17092k0) {
                throw new IllegalStateException(strD);
            }
            ob.u.j("ExoPlayerImpl", strD, this.f17094l0 ? null : new IllegalStateException());
            this.f17094l0 = true;
        }
    }

    private List X0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            s1.c cVar = new s1.c((com.google.android.exoplayer2.source.p) list.get(i11), this.f17101p);
            arrayList.add(cVar);
            this.f17099o.add(i11 + i10, new e(cVar.f17358b, cVar.f17357a.Z()));
        }
        this.M = this.M.cloneAndInsert(i10, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public z0 Y0() {
        h2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.u()) {
            return this.f17104q0;
        }
        return this.f17104q0.b().J(currentTimeline.r(l(), this.f16885a).f17020c.f18985e).H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j b1(e2 e2Var) {
        return new j.b(0).g(e2Var != null ? e2Var.d() : 0).f(e2Var != null ? e2Var.c() : 0).e();
    }

    private h2 c1() {
        return new z1(this.f17099o, this.M);
    }

    private List d1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f17103q.a((y0) list.get(i10)));
        }
        return arrayList;
    }

    private y1 e1(y1.b bVar) {
        int iJ1 = j1(this.f17106r0);
        u0 u0Var = this.f17091k;
        h2 h2Var = this.f17106r0.f18910a;
        if (iJ1 == -1) {
            iJ1 = 0;
        }
        return new y1(u0Var, bVar, h2Var, iJ1, this.f17114w, u0Var.B());
    }

    private Pair f1(v1 v1Var, v1 v1Var2, boolean z10, int i10, boolean z11, boolean z12) {
        h2 h2Var = v1Var2.f18910a;
        h2 h2Var2 = v1Var.f18910a;
        if (h2Var2.u() && h2Var.u()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (h2Var2.u() != h2Var.u()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (h2Var.r(h2Var.l(v1Var2.f18911b.f51199a, this.f17097n).f17000c, this.f16885a).f17018a.equals(h2Var2.r(h2Var2.l(v1Var.f18911b.f51199a, this.f17097n).f17000c, this.f16885a).f17018a)) {
            if (z10 && i10 == 0 && v1Var2.f18911b.f51202d < v1Var.f18911b.f51202d) {
                return new Pair(Boolean.TRUE, 0);
            }
            return (z10 && i10 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i11));
    }

    public static /* synthetic */ void g0(int i10, x1.e eVar, x1.e eVar2, x1.d dVar) {
        dVar.onPositionDiscontinuity(i10);
        dVar.x(eVar, eVar2, i10);
    }

    private long h1(v1 v1Var) {
        if (!v1Var.f18911b.b()) {
            return ob.r0.i1(i1(v1Var));
        }
        v1Var.f18910a.l(v1Var.f18911b.f51199a, this.f17097n);
        return v1Var.f18912c == C.TIME_UNSET ? v1Var.f18910a.r(j1(v1Var), this.f16885a).d() : this.f17097n.p() + ob.r0.i1(v1Var.f18912c);
    }

    private long i1(v1 v1Var) {
        if (v1Var.f18910a.u()) {
            return ob.r0.H0(this.f17112u0);
        }
        long jM = v1Var.f18924o ? v1Var.m() : v1Var.f18927r;
        return v1Var.f18911b.b() ? jM : u1(v1Var.f18910a, v1Var.f18911b, jM);
    }

    private int j1(v1 v1Var) {
        return v1Var.f18910a.u() ? this.f17108s0 : v1Var.f18910a.l(v1Var.f18911b.f51199a, this.f17097n).f17000c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private x1.e m1(long j10) {
        Object obj;
        int iF;
        y0 y0Var;
        Object obj2;
        int iL = l();
        if (this.f17106r0.f18910a.u()) {
            obj = null;
            iF = -1;
            y0Var = null;
            obj2 = null;
        } else {
            v1 v1Var = this.f17106r0;
            Object obj3 = v1Var.f18911b.f51199a;
            v1Var.f18910a.l(obj3, this.f17097n);
            iF = this.f17106r0.f18910a.f(obj3);
            obj2 = obj3;
            obj = this.f17106r0.f18910a.r(iL, this.f16885a).f17018a;
            y0Var = this.f16885a.f17020c;
        }
        int i10 = iF;
        long jI1 = ob.r0.i1(j10);
        long jI2 = this.f17106r0.f18911b.b() ? ob.r0.i1(o1(this.f17106r0)) : jI1;
        com.google.android.exoplayer2.source.p.b bVar = this.f17106r0.f18911b;
        return new x1.e(obj, iL, y0Var, obj2, i10, jI1, jI2, bVar.f51200b, bVar.f51201c);
    }

    private x1.e n1(int i10, v1 v1Var, int i11) {
        int i12;
        Object obj;
        y0 y0Var;
        Object obj2;
        int i13;
        long jO1;
        long jO2;
        h2.b bVar = new h2.b();
        if (v1Var.f18910a.u()) {
            i12 = i11;
            obj = null;
            y0Var = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = v1Var.f18911b.f51199a;
            v1Var.f18910a.l(obj3, bVar);
            int i14 = bVar.f17000c;
            int iF = v1Var.f18910a.f(obj3);
            Object obj4 = v1Var.f18910a.r(i14, this.f16885a).f17018a;
            y0Var = this.f16885a.f17020c;
            obj2 = obj3;
            i13 = iF;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (v1Var.f18911b.b()) {
                com.google.android.exoplayer2.source.p.b bVar2 = v1Var.f18911b;
                jO1 = bVar.e(bVar2.f51200b, bVar2.f51201c);
                jO2 = o1(v1Var);
            } else {
                jO1 = v1Var.f18911b.f51203e != -1 ? o1(this.f17106r0) : bVar.f17002e + bVar.f17001d;
                jO2 = jO1;
            }
        } else if (v1Var.f18911b.b()) {
            jO1 = v1Var.f18927r;
            jO2 = o1(v1Var);
        } else {
            jO1 = bVar.f17002e + v1Var.f18927r;
            jO2 = jO1;
        }
        long jI1 = ob.r0.i1(jO1);
        long jI2 = ob.r0.i1(jO2);
        com.google.android.exoplayer2.source.p.b bVar3 = v1Var.f18911b;
        return new x1.e(obj, i12, y0Var, obj2, i13, jI1, jI2, bVar3.f51200b, bVar3.f51201c);
    }

    public static /* synthetic */ void o0(v1 v1Var, x1.d dVar) {
        dVar.onLoadingChanged(v1Var.f18916g);
        dVar.onIsLoadingChanged(v1Var.f18916g);
    }

    private static long o1(v1 v1Var) {
        h2.d dVar = new h2.d();
        h2.b bVar = new h2.b();
        v1Var.f18910a.l(v1Var.f18911b.f51199a, bVar);
        return v1Var.f18912c == C.TIME_UNSET ? v1Var.f18910a.r(bVar.f17000c, dVar).e() : bVar.q() + v1Var.f18912c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p1(u0.e eVar) {
        long jU1;
        int i10 = this.H - eVar.f18375c;
        this.H = i10;
        boolean z10 = true;
        if (eVar.f18376d) {
            this.I = eVar.f18377e;
            this.J = true;
        }
        if (eVar.f18378f) {
            this.K = eVar.f18379g;
        }
        if (i10 == 0) {
            h2 h2Var = eVar.f18374b.f18910a;
            if (!this.f17106r0.f18910a.u() && h2Var.u()) {
                this.f17108s0 = -1;
                this.f17112u0 = 0L;
                this.f17110t0 = 0;
            }
            if (!h2Var.u()) {
                List listJ = ((z1) h2Var).J();
                ob.a.g(listJ.size() == this.f17099o.size());
                for (int i11 = 0; i11 < listJ.size(); i11++) {
                    ((e) this.f17099o.get(i11)).f17124b = (h2) listJ.get(i11);
                }
            }
            boolean z11 = this.J;
            long j10 = C.TIME_UNSET;
            if (z11) {
                if (eVar.f18374b.f18911b.equals(this.f17106r0.f18911b) && eVar.f18374b.f18913d == this.f17106r0.f18927r) {
                    z10 = false;
                }
                if (z10) {
                    if (h2Var.u() || eVar.f18374b.f18911b.b()) {
                        jU1 = eVar.f18374b.f18913d;
                    } else {
                        v1 v1Var = eVar.f18374b;
                        jU1 = u1(h2Var, v1Var.f18911b, v1Var.f18913d);
                    }
                    j10 = jU1;
                }
            } else {
                z10 = false;
            }
            this.J = false;
            J1(eVar.f18374b, 1, this.K, z10, this.I, j10, -1, false);
        }
    }

    private int q1(int i10) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.T.getAudioSessionId();
    }

    private v1 r1(v1 v1Var, h2 h2Var, Pair pair) {
        ob.a.a(h2Var.u() || pair != null);
        h2 h2Var2 = v1Var.f18910a;
        long jH1 = h1(v1Var);
        v1 v1VarJ = v1Var.j(h2Var);
        if (h2Var.u()) {
            com.google.android.exoplayer2.source.p.b bVarL = v1.l();
            long jH0 = ob.r0.H0(this.f17112u0);
            v1 v1VarC = v1VarJ.d(bVarL, jH0, jH0, jH0, 0L, ra.x.f51253d, this.f17073b, com.google.common.collect.c0.C()).c(bVarL);
            v1VarC.f18925p = v1VarC.f18927r;
            return v1VarC;
        }
        Object obj = v1VarJ.f18911b.f51199a;
        boolean zEquals = obj.equals(((Pair) ob.r0.j(pair)).first);
        com.google.android.exoplayer2.source.p.b bVar = !zEquals ? new com.google.android.exoplayer2.source.p.b(pair.first) : v1VarJ.f18911b;
        long jLongValue = ((Long) pair.second).longValue();
        long jH2 = ob.r0.H0(jH1);
        if (!h2Var2.u()) {
            jH2 -= h2Var2.l(obj, this.f17097n).q();
        }
        if (!zEquals || jLongValue < jH2) {
            com.google.android.exoplayer2.source.p.b bVar2 = bVar;
            ob.a.g(!bVar2.b());
            v1 v1VarC2 = v1VarJ.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? ra.x.f51253d : v1VarJ.f18917h, !zEquals ? this.f17073b : v1VarJ.f18918i, !zEquals ? com.google.common.collect.c0.C() : v1VarJ.f18919j).c(bVar2);
            v1VarC2.f18925p = jLongValue;
            return v1VarC2;
        }
        if (jLongValue != jH2) {
            com.google.android.exoplayer2.source.p.b bVar3 = bVar;
            ob.a.g(!bVar3.b());
            long jMax = Math.max(0L, v1VarJ.f18926q - (jLongValue - jH2));
            long j10 = v1VarJ.f18925p;
            if (v1VarJ.f18920k.equals(v1VarJ.f18911b)) {
                j10 = jLongValue + jMax;
            }
            v1 v1VarD = v1VarJ.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, v1VarJ.f18917h, v1VarJ.f18918i, v1VarJ.f18919j);
            v1VarD.f18925p = j10;
            return v1VarD;
        }
        int iF = h2Var.f(v1VarJ.f18920k.f51199a);
        if (iF != -1 && h2Var.j(iF, this.f17097n).f17000c == h2Var.l(bVar.f51199a, this.f17097n).f17000c) {
            return v1VarJ;
        }
        h2Var.l(bVar.f51199a, this.f17097n);
        long jE = bVar.b() ? this.f17097n.e(bVar.f51200b, bVar.f51201c) : this.f17097n.f17001d;
        com.google.android.exoplayer2.source.p.b bVar4 = bVar;
        v1 v1VarC3 = v1VarJ.d(bVar4, v1VarJ.f18927r, v1VarJ.f18927r, v1VarJ.f18913d, jE - v1VarJ.f18927r, v1VarJ.f18917h, v1VarJ.f18918i, v1VarJ.f18919j).c(bVar4);
        v1VarC3.f18925p = jE;
        return v1VarC3;
    }

    private Pair s1(h2 h2Var, int i10, long j10) {
        if (h2Var.u()) {
            this.f17108s0 = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.f17112u0 = j10;
            this.f17110t0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= h2Var.t()) {
            i10 = h2Var.e(this.G);
            j10 = h2Var.r(i10, this.f16885a).d();
        }
        return h2Var.n(this.f16885a, this.f17097n, i10, ob.r0.H0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1(final int i10, final int i11) {
        if (i10 == this.f17076c0.b() && i11 == this.f17076c0.a()) {
            return;
        }
        this.f17076c0 = new ob.g0(i10, i11);
        this.f17093l.k(24, new ob.t.a() { // from class: com.google.android.exoplayer2.u
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((x1.d) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        x1(2, 14, new ob.g0(i10, i11));
    }

    private long u1(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar, long j10) {
        h2Var.l(bVar.f51199a, this.f17097n);
        return j10 + this.f17097n.q();
    }

    private void v1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f17099o.remove(i12);
        }
        this.M = this.M.a(i10, i11);
    }

    private void w1() {
        if (this.X != null) {
            e1(this.f17116y).n(10000).m(null).l();
            this.X.g(this.f17115x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f17115x) {
                ob.u.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f17115x);
            this.W = null;
        }
    }

    private void x1(int i10, int i11, Object obj) {
        for (b2 b2Var : this.f17083g) {
            if (b2Var.getTrackType() == i10) {
                e1(b2Var).n(i11).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1() {
        x1(1, 2, Float.valueOf(this.f17086h0 * this.A.g()));
    }

    public void A1(List list, boolean z10) {
        M1();
        B1(list, -1, C.TIME_UNSET, z10);
    }

    @Override // com.google.android.exoplayer2.x1
    public long B() {
        M1();
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.x1
    public long D() {
        M1();
        return this.f17113v;
    }

    @Override // com.google.android.exoplayer2.x1
    public void E(x1.d dVar) {
        this.f17093l.c((x1.d) ob.a.e(dVar));
    }

    @Override // com.google.android.exoplayer2.x1
    public long F() {
        M1();
        if (this.f17106r0.f18910a.u()) {
            return this.f17112u0;
        }
        v1 v1Var = this.f17106r0;
        if (v1Var.f18920k.f51202d != v1Var.f18911b.f51202d) {
            return v1Var.f18910a.r(l(), this.f16885a).f();
        }
        long j10 = v1Var.f18925p;
        if (this.f17106r0.f18920k.b()) {
            v1 v1Var2 = this.f17106r0;
            h2.b bVarL = v1Var2.f18910a.l(v1Var2.f18920k.f51199a, this.f17097n);
            long jI = bVarL.i(this.f17106r0.f18920k.f51200b);
            j10 = jI == Long.MIN_VALUE ? bVarL.f17001d : jI;
        }
        v1 v1Var3 = this.f17106r0;
        return ob.r0.i1(u1(v1Var3.f18910a, v1Var3.f18920k, j10));
    }

    public void F1(SurfaceHolder surfaceHolder) {
        M1();
        if (surfaceHolder == null) {
            Z0();
            return;
        }
        w1();
        this.Y = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f17115x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            E1(null);
            t1(0, 0);
        } else {
            E1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            t1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.x1
    public z0 I() {
        M1();
        return this.P;
    }

    @Override // com.google.android.exoplayer2.x1
    public long J() {
        M1();
        return this.f17111u;
    }

    @Override // com.google.android.exoplayer2.e
    public void O(int i10, long j10, int i11, boolean z10) {
        M1();
        ob.a.a(i10 >= 0);
        this.f17105r.m();
        h2 h2Var = this.f17106r0.f18910a;
        if (h2Var.u() || i10 < h2Var.t()) {
            this.H++;
            if (isPlayingAd()) {
                ob.u.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                u0.e eVar = new u0.e(this.f17106r0);
                eVar.b(1);
                this.f17089j.a(eVar);
                return;
            }
            v1 v1VarH = this.f17106r0;
            int i12 = v1VarH.f18914e;
            if (i12 == 3 || (i12 == 4 && !h2Var.u())) {
                v1VarH = this.f17106r0.h(2);
            }
            int iL = l();
            v1 v1VarR1 = r1(v1VarH, h2Var, s1(h2Var, i10, j10));
            this.f17091k.z0(h2Var, i10, ob.r0.H0(j10));
            J1(v1VarR1, 0, 1, true, 1, i1(v1VarR1), iL, z10);
        }
    }

    public void V0(p9.b bVar) {
        this.f17105r.M((p9.b) ob.a.e(bVar));
    }

    public void W0(k.a aVar) {
        this.f17095m.add(aVar);
    }

    public void Z0() {
        M1();
        w1();
        E1(null);
        t1(0, 0);
    }

    @Override // com.google.android.exoplayer2.x1
    public void a() {
        M1();
        boolean playWhenReady = getPlayWhenReady();
        int iP = this.A.p(playWhenReady, 2);
        I1(playWhenReady, iP, k1(playWhenReady, iP));
        v1 v1Var = this.f17106r0;
        if (v1Var.f18914e != 1) {
            return;
        }
        v1 v1VarF = v1Var.f(null);
        v1 v1VarH = v1VarF.h(v1VarF.f18910a.u() ? 4 : 2);
        this.H++;
        this.f17091k.g0();
        J1(v1VarH, 1, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public void a1(SurfaceHolder surfaceHolder) {
        M1();
        if (surfaceHolder == null || surfaceHolder != this.W) {
            return;
        }
        Z0();
    }

    @Override // com.google.android.exoplayer2.x1
    public void b(w1 w1Var) {
        M1();
        if (w1Var == null) {
            w1Var = w1.f18938d;
        }
        if (this.f17106r0.f18923n.equals(w1Var)) {
            return;
        }
        v1 v1VarG = this.f17106r0.g(w1Var);
        this.H++;
        this.f17091k.S0(w1Var);
        J1(v1VarG, 0, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.exoplayer2.x1
    public long c() {
        M1();
        return ob.r0.i1(this.f17106r0.f18926q);
    }

    @Override // com.google.android.exoplayer2.x1
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        M1();
        a1(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.x1
    public void clearVideoTextureView(TextureView textureView) {
        M1();
        if (textureView == null || textureView != this.Z) {
            return;
        }
        Z0();
    }

    @Override // com.google.android.exoplayer2.x1
    public i2 e() {
        M1();
        return this.f17106r0.f18918i.f44109d;
    }

    public boolean g1() {
        M1();
        return this.f17106r0.f18924o;
    }

    @Override // com.google.android.exoplayer2.x1
    public long getContentPosition() {
        M1();
        return h1(this.f17106r0);
    }

    @Override // com.google.android.exoplayer2.x1
    public int getCurrentAdGroupIndex() {
        M1();
        if (isPlayingAd()) {
            return this.f17106r0.f18911b.f51200b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.x1
    public int getCurrentAdIndexInAdGroup() {
        M1();
        if (isPlayingAd()) {
            return this.f17106r0.f18911b.f51201c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.x1
    public int getCurrentPeriodIndex() {
        M1();
        if (this.f17106r0.f18910a.u()) {
            return this.f17110t0;
        }
        v1 v1Var = this.f17106r0;
        return v1Var.f18910a.f(v1Var.f18911b.f51199a);
    }

    @Override // com.google.android.exoplayer2.x1
    public long getCurrentPosition() {
        M1();
        return ob.r0.i1(i1(this.f17106r0));
    }

    @Override // com.google.android.exoplayer2.x1
    public h2 getCurrentTimeline() {
        M1();
        return this.f17106r0.f18910a;
    }

    @Override // com.google.android.exoplayer2.x1
    public long getDuration() {
        M1();
        if (!isPlayingAd()) {
            return C();
        }
        v1 v1Var = this.f17106r0;
        com.google.android.exoplayer2.source.p.b bVar = v1Var.f18911b;
        v1Var.f18910a.l(bVar.f51199a, this.f17097n);
        return ob.r0.i1(this.f17097n.e(bVar.f51200b, bVar.f51201c));
    }

    @Override // com.google.android.exoplayer2.x1
    public boolean getPlayWhenReady() {
        M1();
        return this.f17106r0.f18921l;
    }

    @Override // com.google.android.exoplayer2.x1
    public w1 getPlaybackParameters() {
        M1();
        return this.f17106r0.f18923n;
    }

    @Override // com.google.android.exoplayer2.x1
    public int getPlaybackState() {
        M1();
        return this.f17106r0.f18914e;
    }

    @Override // com.google.android.exoplayer2.x1
    public int getRepeatMode() {
        M1();
        return this.F;
    }

    @Override // com.google.android.exoplayer2.x1
    public boolean getShuffleModeEnabled() {
        M1();
        return this.G;
    }

    @Override // com.google.android.exoplayer2.x1
    public int h() {
        M1();
        return this.f17106r0.f18922m;
    }

    @Override // com.google.android.exoplayer2.x1
    public pb.z i() {
        M1();
        return this.f17102p0;
    }

    @Override // com.google.android.exoplayer2.x1
    public boolean isPlayingAd() {
        M1();
        return this.f17106r0.f18911b.b();
    }

    @Override // com.google.android.exoplayer2.x1
    public int l() {
        M1();
        int iJ1 = j1(this.f17106r0);
        if (iJ1 == -1) {
            return 0;
        }
        return iJ1;
    }

    @Override // com.google.android.exoplayer2.x1
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public ExoPlaybackException d() {
        M1();
        return this.f17106r0.f18915f;
    }

    @Override // com.google.android.exoplayer2.k
    public void n(com.google.android.exoplayer2.source.p pVar) {
        M1();
        z1(Collections.singletonList(pVar));
    }

    @Override // com.google.android.exoplayer2.x1
    public void o(x1.d dVar) {
        M1();
        this.f17093l.j((x1.d) ob.a.e(dVar));
    }

    @Override // com.google.android.exoplayer2.x1
    public void p(List list, boolean z10) {
        M1();
        A1(d1(list), z10);
    }

    @Override // com.google.android.exoplayer2.x1
    public void q(final lb.y yVar) {
        M1();
        if (!this.f17085h.h() || yVar.equals(this.f17085h.c())) {
            return;
        }
        this.f17085h.m(yVar);
        this.f17093l.k(19, new ob.t.a() { // from class: com.google.android.exoplayer2.a0
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((x1.d) obj).C(yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1
    public bb.f s() {
        M1();
        return this.f17090j0;
    }

    @Override // com.google.android.exoplayer2.x1
    public void setPlayWhenReady(boolean z10) {
        M1();
        int iP = this.A.p(z10, getPlaybackState());
        I1(z10, iP, k1(z10, iP));
    }

    @Override // com.google.android.exoplayer2.x1
    public void setRepeatMode(final int i10) {
        M1();
        if (this.F != i10) {
            this.F = i10;
            this.f17091k.U0(i10);
            this.f17093l.h(8, new ob.t.a() { // from class: com.google.android.exoplayer2.t
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).onRepeatModeChanged(i10);
                }
            });
            H1();
            this.f17093l.f();
        }
    }

    @Override // com.google.android.exoplayer2.x1
    public void setShuffleModeEnabled(final boolean z10) {
        M1();
        if (this.G != z10) {
            this.G = z10;
            this.f17091k.Y0(z10);
            this.f17093l.h(9, new ob.t.a() { // from class: com.google.android.exoplayer2.v
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).onShuffleModeEnabledChanged(z10);
                }
            });
            H1();
            this.f17093l.f();
        }
    }

    @Override // com.google.android.exoplayer2.x1
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        M1();
        if (surfaceView instanceof pb.j) {
            w1();
            E1(surfaceView);
            C1(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof qb.l)) {
                F1(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            w1();
            this.X = (qb.l) surfaceView;
            e1(this.f17116y).n(10000).m(this.X).l();
            this.X.d(this.f17115x);
            E1(this.X.getVideoSurface());
            C1(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.x1
    public void setVideoTextureView(TextureView textureView) {
        M1();
        if (textureView == null) {
            Z0();
            return;
        }
        w1();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ob.u.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f17115x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            E1(null);
            t1(0, 0);
        } else {
            D1(surfaceTexture);
            t1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.x1
    public void setVolume(float f10) {
        M1();
        final float fP = ob.r0.p(f10, 0.0f, 1.0f);
        if (this.f17086h0 == fP) {
            return;
        }
        this.f17086h0 = fP;
        y1();
        this.f17093l.k(22, new ob.t.a() { // from class: com.google.android.exoplayer2.y
            @Override // ob.t.a
            public final void invoke(Object obj) {
                ((x1.d) obj).onVolumeChanged(fP);
            }
        });
    }

    @Override // com.google.android.exoplayer2.x1
    public void stop() {
        M1();
        this.A.p(getPlayWhenReady(), 1);
        G1(null);
        this.f17090j0 = new bb.f(com.google.common.collect.c0.C(), this.f17106r0.f18927r);
    }

    @Override // com.google.android.exoplayer2.k
    public void u(boolean z10) {
        M1();
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        this.f17091k.O0(z10);
    }

    @Override // com.google.android.exoplayer2.k
    public void v(o9.j0 j0Var) {
        M1();
        if (j0Var == null) {
            j0Var = o9.j0.f48296g;
        }
        if (this.L.equals(j0Var)) {
            return;
        }
        this.L = j0Var;
        this.f17091k.W0(j0Var);
    }

    @Override // com.google.android.exoplayer2.x1
    public Looper w() {
        return this.f17107s;
    }

    @Override // com.google.android.exoplayer2.x1
    public lb.y x() {
        M1();
        return this.f17085h.c();
    }

    @Override // com.google.android.exoplayer2.x1
    public x1.b z() {
        M1();
        return this.O;
    }

    public void z1(List list) {
        M1();
        A1(list, true);
    }

    @Override // com.google.android.exoplayer2.x1
    public void release() {
        AudioTrack audioTrack;
        ob.u.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + KPtaxpyICj.RLFo + "] [" + ob.r0.f48429e + "] [" + o9.n.b() + "]");
        M1();
        if (ob.r0.f48425a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f17117z.b(false);
        e2 e2Var = this.B;
        if (e2Var != null) {
            e2Var.g();
        }
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f17091k.i0()) {
            this.f17093l.k(10, new ob.t.a() { // from class: com.google.android.exoplayer2.q
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).I(ExoPlaybackException.j(new ExoTimeoutException(1), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
                }
            });
        }
        this.f17093l.i();
        this.f17087i.removeCallbacksAndMessages(null);
        this.f17109t.g(this.f17105r);
        v1 v1Var = this.f17106r0;
        if (v1Var.f18924o) {
            this.f17106r0 = v1Var.a();
        }
        v1 v1VarH = this.f17106r0.h(1);
        this.f17106r0 = v1VarH;
        v1 v1VarC = v1VarH.c(v1VarH.f18911b);
        this.f17106r0 = v1VarC;
        v1VarC.f18925p = v1VarC.f18927r;
        this.f17106r0.f18926q = 0L;
        this.f17105r.release();
        this.f17085h.j();
        w1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f17096m0) {
            android.support.v4.media.session.b.a(ob.a.e(null));
            throw null;
        }
        this.f17090j0 = bb.f.f8775c;
        this.f17098n0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class c implements pb.x, com.google.android.exoplayer2.audio.e, bb.o, ha.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, qb.l.b, com.google.android.exoplayer2.d.b, com.google.android.exoplayer2.b.InterfaceC0280b, e2.b, k.a {
        private c() {
        }

        @Override // com.google.android.exoplayer2.k.a
        public void B(boolean z10) {
            j0.this.L1();
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void a(Exception exc) {
            j0.this.f17105r.a(exc);
        }

        @Override // pb.x
        public void b(String str) {
            j0.this.f17105r.b(str);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void c(String str) {
            j0.this.f17105r.c(str);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void d(long j10) {
            j0.this.f17105r.d(j10);
        }

        @Override // pb.x
        public void e(Exception exc) {
            j0.this.f17105r.e(exc);
        }

        @Override // pb.x
        public void f(Object obj, long j10) {
            j0.this.f17105r.f(obj, j10);
            if (j0.this.U == obj) {
                j0.this.f17093l.k(26, new ob.t.a() { // from class: o9.m
                    @Override // ob.t.a
                    public final void invoke(Object obj2) {
                        ((x1.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void g(Exception exc) {
            j0.this.f17105r.g(exc);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void h(int i10, long j10, long j11) {
            j0.this.f17105r.h(i10, j10, j11);
        }

        @Override // pb.x
        public void i(long j10, int i10) {
            j0.this.f17105r.i(j10, i10);
        }

        @Override // pb.x
        public void j(s9.e eVar) {
            j0.this.f17105r.j(eVar);
            j0.this.R = null;
            j0.this.f17078d0 = null;
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void k(s9.e eVar) {
            j0.this.f17105r.k(eVar);
            j0.this.S = null;
            j0.this.f17080e0 = null;
        }

        @Override // pb.x
        public void l(s9.e eVar) {
            j0.this.f17078d0 = eVar;
            j0.this.f17105r.l(eVar);
        }

        @Override // com.google.android.exoplayer2.e2.b
        public void m(int i10) {
            final j jVarB1 = j0.b1(j0.this.B);
            if (jVarB1.equals(j0.this.f17100o0)) {
                return;
            }
            j0.this.f17100o0 = jVarB1;
            j0.this.f17093l.k(29, new ob.t.a() { // from class: com.google.android.exoplayer2.p0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).A(jVarB1);
                }
            });
        }

        @Override // com.google.android.exoplayer2.b.InterfaceC0280b
        public void n() {
            j0.this.I1(false, -1, 3);
        }

        @Override // pb.x
        public void o(v0 v0Var, s9.g gVar) {
            j0.this.R = v0Var;
            j0.this.f17105r.o(v0Var, gVar);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void onAudioDecoderInitialized(String str, long j10, long j11) {
            j0.this.f17105r.onAudioDecoderInitialized(str, j10, j11);
        }

        @Override // bb.o
        public void onCues(final List list) {
            j0.this.f17093l.k(27, new ob.t.a() { // from class: com.google.android.exoplayer2.k0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).onCues(list);
                }
            });
        }

        @Override // pb.x
        public void onDroppedFrames(int i10, long j10) {
            j0.this.f17105r.onDroppedFrames(i10, j10);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (j0.this.f17088i0 == z10) {
                return;
            }
            j0.this.f17088i0 = z10;
            j0.this.f17093l.k(23, new ob.t.a() { // from class: com.google.android.exoplayer2.q0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            j0.this.D1(surfaceTexture);
            j0.this.t1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            j0.this.E1(null);
            j0.this.t1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            j0.this.t1(i10, i11);
        }

        @Override // pb.x
        public void onVideoDecoderInitialized(String str, long j10, long j11) {
            j0.this.f17105r.onVideoDecoderInitialized(str, j10, j11);
        }

        @Override // ha.e
        public void p(final ha.a aVar) {
            j0 j0Var = j0.this;
            j0Var.f17104q0 = j0Var.f17104q0.b().K(aVar).H();
            z0 z0VarY0 = j0.this.Y0();
            if (!z0VarY0.equals(j0.this.P)) {
                j0.this.P = z0VarY0;
                j0.this.f17093l.h(14, new ob.t.a() { // from class: com.google.android.exoplayer2.m0
                    @Override // ob.t.a
                    public final void invoke(Object obj) {
                        ((x1.d) obj).B(j0.this.P);
                    }
                });
            }
            j0.this.f17093l.h(28, new ob.t.a() { // from class: com.google.android.exoplayer2.n0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).p(aVar);
                }
            });
            j0.this.f17093l.f();
        }

        @Override // com.google.android.exoplayer2.e2.b
        public void q(final int i10, final boolean z10) {
            j0.this.f17093l.k(30, new ob.t.a() { // from class: com.google.android.exoplayer2.o0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void r(v0 v0Var, s9.g gVar) {
            j0.this.S = v0Var;
            j0.this.f17105r.r(v0Var, gVar);
        }

        @Override // bb.o
        public void s(final bb.f fVar) {
            j0.this.f17090j0 = fVar;
            j0.this.f17093l.k(27, new ob.t.a() { // from class: com.google.android.exoplayer2.l0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).s(fVar);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            j0.this.t1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (j0.this.Y) {
                j0.this.E1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (j0.this.Y) {
                j0.this.E1(null);
            }
            j0.this.t1(0, 0);
        }

        @Override // com.google.android.exoplayer2.d.b
        public void t(float f10) {
            j0.this.y1();
        }

        @Override // com.google.android.exoplayer2.d.b
        public void u(int i10) {
            boolean playWhenReady = j0.this.getPlayWhenReady();
            j0.this.I1(playWhenReady, i10, j0.k1(playWhenReady, i10));
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void v(s9.e eVar) {
            j0.this.f17080e0 = eVar;
            j0.this.f17105r.v(eVar);
        }

        @Override // pb.x
        public void w(final pb.z zVar) {
            j0.this.f17102p0 = zVar;
            j0.this.f17093l.k(25, new ob.t.a() { // from class: com.google.android.exoplayer2.r0
                @Override // ob.t.a
                public final void invoke(Object obj) {
                    ((x1.d) obj).w(zVar);
                }
            });
        }

        @Override // qb.l.b
        public void x(Surface surface) {
            j0.this.E1(null);
        }

        @Override // qb.l.b
        public void y(Surface surface) {
            j0.this.E1(surface);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
