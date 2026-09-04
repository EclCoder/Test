package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class u0 implements Handler.Callback, com.google.android.exoplayer2.source.o.a, lb.a0.a, s1.d, i.a, y1.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private h K;
    private long L;
    private int M;
    private boolean N;
    private ExoPlaybackException O;
    private long P;
    private long Q = C.TIME_UNSET;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2[] f18338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f18339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c2[] f18340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lb.a0 f18341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lb.b0 f18342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o9.r f18343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nb.d f18344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ob.q f18345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HandlerThread f18346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f18347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h2.d f18348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h2.b f18349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f18350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f18351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i f18352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList f18353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ob.d f18354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f18355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final d1 f18356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final s1 f18357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final x0 f18358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f18359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private o9.j0 f18360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private v1 f18361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e f18362y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f18363z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b2.a {
        a() {
        }

        @Override // com.google.android.exoplayer2.b2.a
        public void a() {
            u0.this.H = true;
        }

        @Override // com.google.android.exoplayer2.b2.a
        public void b() {
            u0.this.f18345h.sendEmptyMessage(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f18365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.e0 f18366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f18368d;

        /* synthetic */ b(List list, com.google.android.exoplayer2.source.e0 e0Var, int i10, long j10, a aVar) {
            this(list, e0Var, i10, j10);
        }

        private b(List list, com.google.android.exoplayer2.source.e0 e0Var, int i10, long j10) {
            this.f18365a = list;
            this.f18366b = e0Var;
            this.f18367c = i10;
            this.f18368d = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y1 f18369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f18371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f18372d;

        public d(y1 y1Var) {
            this.f18369a = y1Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f18372d;
            if ((obj == null) != (dVar.f18372d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f18370b - dVar.f18370b;
            return i10 != 0 ? i10 : ob.r0.o(this.f18371c, dVar.f18371c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f18370b = i10;
            this.f18371c = j10;
            this.f18372d = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v1 f18374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18379g;

        public e(v1 v1Var) {
            this.f18374b = v1Var;
        }

        public void b(int i10) {
            this.f18373a |= i10 > 0;
            this.f18375c += i10;
        }

        public void c(int i10) {
            this.f18373a = true;
            this.f18378f = true;
            this.f18379g = i10;
        }

        public void d(v1 v1Var) {
            this.f18373a |= this.f18374b != v1Var;
            this.f18374b = v1Var;
        }

        public void e(int i10) {
            if (this.f18376d && this.f18377e != 5) {
                ob.a.a(i10 == 5);
                return;
            }
            this.f18373a = true;
            this.f18376d = true;
            this.f18377e = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.p.b f18380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f18383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f18384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f18385f;

        public g(com.google.android.exoplayer2.source.p.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f18380a = bVar;
            this.f18381b = j10;
            this.f18382c = j11;
            this.f18383d = z10;
            this.f18384e = z11;
            this.f18385f = z12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h2 f18386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18388c;

        public h(h2 h2Var, int i10, long j10) {
            this.f18386a = h2Var;
            this.f18387b = i10;
            this.f18388c = j10;
        }
    }

    public u0(b2[] b2VarArr, lb.a0 a0Var, lb.b0 b0Var, o9.r rVar, nb.d dVar, int i10, boolean z10, p9.a aVar, o9.j0 j0Var, x0 x0Var, long j10, boolean z11, Looper looper, ob.d dVar2, f fVar, p9.s1 s1Var, Looper looper2) {
        this.f18355r = fVar;
        this.f18338a = b2VarArr;
        this.f18341d = a0Var;
        this.f18342e = b0Var;
        this.f18343f = rVar;
        this.f18344g = dVar;
        this.E = i10;
        this.F = z10;
        this.f18360w = j0Var;
        this.f18358u = x0Var;
        this.f18359v = j10;
        this.P = j10;
        this.A = z11;
        this.f18354q = dVar2;
        this.f18350m = rVar.getBackBufferDurationUs();
        this.f18351n = rVar.retainBackBufferFromKeyframe();
        v1 v1VarK = v1.k(b0Var);
        this.f18361x = v1VarK;
        this.f18362y = new e(v1VarK);
        this.f18340c = new c2[b2VarArr.length];
        c2.a aVarD = a0Var.d();
        for (int i11 = 0; i11 < b2VarArr.length; i11++) {
            b2VarArr[i11].i(i11, s1Var);
            this.f18340c[i11] = b2VarArr[i11].getCapabilities();
            if (aVarD != null) {
                this.f18340c[i11].q(aVarD);
            }
        }
        this.f18352o = new i(this, dVar2);
        this.f18353p = new ArrayList();
        this.f18339b = com.google.common.collect.g1.i();
        this.f18348k = new h2.d();
        this.f18349l = new h2.b();
        a0Var.e(this, dVar);
        this.N = true;
        ob.q qVarCreateHandler = dVar2.createHandler(looper, null);
        this.f18356s = new d1(aVar, qVarCreateHandler);
        this.f18357t = new s1(this, aVar, qVarCreateHandler, s1Var);
        if (looper2 != null) {
            this.f18346i = null;
            this.f18347j = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f18346i = handlerThread;
            handlerThread.start();
            this.f18347j = handlerThread.getLooper();
        }
        this.f18345h = dVar2.createHandler(this.f18347j, this);
    }

    private Pair A(h2 h2Var) {
        if (h2Var.u()) {
            return Pair.create(v1.l(), 0L);
        }
        Pair pairN = h2Var.n(this.f18348k, this.f18349l, h2Var.e(this.F), C.TIME_UNSET);
        com.google.android.exoplayer2.source.p.b bVarE = this.f18356s.E(h2Var, pairN.first, 0L);
        long jLongValue = ((Long) pairN.second).longValue();
        if (bVarE.b()) {
            h2Var.l(bVarE.f51199a, this.f18349l);
            jLongValue = bVarE.f51201c == this.f18349l.n(bVarE.f51200b) ? this.f18349l.j() : 0L;
        }
        return Pair.create(bVarE, Long.valueOf(jLongValue));
    }

    private void A0(boolean z10) throws ExoPlaybackException {
        com.google.android.exoplayer2.source.p.b bVar = this.f18356s.r().f16440f.f16708a;
        long jD0 = D0(bVar, this.f18361x.f18927r, true, false);
        if (jD0 != this.f18361x.f18927r) {
            v1 v1Var = this.f18361x;
            this.f18361x = L(bVar, jD0, v1Var.f18912c, v1Var.f18913d, z10, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void B0(h hVar) throws Throwable {
        long jLongValue;
        com.google.android.exoplayer2.source.p.b bVarE;
        long j10;
        boolean z10;
        long j11;
        com.google.android.exoplayer2.source.p.b bVar;
        long j12;
        com.google.android.exoplayer2.source.p.b bVar2;
        a1 a1VarR;
        long jB;
        v1 v1Var;
        int i10;
        int i11;
        long j13;
        com.google.android.exoplayer2.source.p.b bVar3;
        long j14;
        boolean z11;
        long jC0;
        com.google.android.exoplayer2.source.p.b bVar4;
        long j15;
        u0 u0Var = this;
        u0Var.f18362y.b(1);
        Pair pairW0 = w0(u0Var.f18361x.f18910a, hVar, true, u0Var.E, u0Var.F, u0Var.f18348k, u0Var.f18349l);
        try {
            if (pairW0 != null) {
                Object obj = pairW0.first;
                jLongValue = ((Long) pairW0.second).longValue();
                long j16 = hVar.f18388c == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
                bVarE = u0Var.f18356s.E(u0Var.f18361x.f18910a, obj, jLongValue);
                if (bVarE.b()) {
                    u0Var.f18361x.f18910a.l(bVarE.f51199a, u0Var.f18349l);
                    jLongValue = u0Var.f18349l.n(bVarE.f51200b) == bVarE.f51201c ? u0Var.f18349l.j() : 0L;
                    z10 = true;
                    j11 = j16;
                } else {
                    j10 = 0;
                    z10 = hVar.f18388c == C.TIME_UNSET;
                    j11 = j16;
                }
                if (u0Var.f18361x.f18910a.u()) {
                    if (pairW0 == null) {
                        if (u0Var.f18361x.f18914e != 1) {
                            u0Var.b1(4);
                        }
                        u0Var.p0(false, true, false, true);
                    } else {
                        if (bVarE.equals(u0Var.f18361x.f18911b)) {
                            try {
                                a1VarR = u0Var.f18356s.r();
                                if (a1VarR == null && a1VarR.f16438d && jLongValue != j10) {
                                    jB = a1VarR.f16435a.b(jLongValue, u0Var.f18360w);
                                } else {
                                    jB = jLongValue;
                                }
                                bVar2 = bVarE;
                                try {
                                    if (ob.r0.i1(jB) != ob.r0.i1(u0Var.f18361x.f18927r) && ((i10 = (v1Var = u0Var.f18361x).f18914e) == 2 || i10 == 3)) {
                                        long j17 = v1Var.f18927r;
                                        i11 = 2;
                                        z10 = z10;
                                        j13 = j17;
                                        bVar3 = bVar2;
                                        j14 = j17;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z10 = z10;
                                    bVar = bVar2;
                                    j12 = jLongValue;
                                    u0Var.f18361x = u0Var.L(bVar, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z10 = z10;
                                bVar2 = bVarE;
                            }
                        } else {
                            bVar2 = bVarE;
                            jB = jLongValue;
                        }
                        try {
                            if (u0Var.f18361x.f18914e == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            jC0 = u0Var.C0(bVar2, jB, z11);
                            z10 |= jLongValue != jC0;
                            try {
                                v1 v1Var2 = u0Var.f18361x;
                                h2 h2Var = v1Var2.f18910a;
                                bVar4 = bVar2;
                                j15 = j11;
                                try {
                                    u0Var.p1(h2Var, bVar4, h2Var, v1Var2.f18911b, j15, true);
                                    bVar3 = bVar4;
                                    j11 = j15;
                                    j14 = jC0;
                                    i11 = 2;
                                    j13 = j14;
                                    u0Var = this;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar = bVar4;
                                    j11 = j15;
                                    j12 = jC0;
                                    u0Var.f18361x = u0Var.L(bVar, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = bVar2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bVar = bVar2;
                            j12 = jLongValue;
                            u0Var.f18361x = u0Var.L(bVar, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    }
                    u0Var.f18361x = u0Var.L(bVar3, j14, j11, j13, z10, i11);
                    return;
                }
                u0Var.K = hVar;
                z10 = z10;
                bVar3 = bVarE;
                j14 = jLongValue;
                i11 = 2;
                j13 = j14;
                u0Var = this;
                u0Var.f18361x = u0Var.L(bVar3, j14, j11, j13, z10, i11);
                return;
            }
            Pair pairA = u0Var.A(u0Var.f18361x.f18910a);
            bVarE = (com.google.android.exoplayer2.source.p.b) pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            z10 = !u0Var.f18361x.f18910a.u();
            j11 = -9223372036854775807L;
            if (u0Var.f18361x.f18910a.u()) {
                if (pairW0 == null) {
                    if (u0Var.f18361x.f18914e != 1) {
                        u0Var.b1(4);
                    }
                    u0Var.p0(false, true, false, true);
                } else {
                    if (bVarE.equals(u0Var.f18361x.f18911b)) {
                        a1VarR = u0Var.f18356s.r();
                        if (a1VarR == null) {
                            jB = jLongValue;
                        } else {
                            jB = jLongValue;
                        }
                        bVar2 = bVarE;
                        if (ob.r0.i1(jB) != ob.r0.i1(u0Var.f18361x.f18927r)) {
                        }
                    } else {
                        bVar2 = bVarE;
                        jB = jLongValue;
                    }
                    if (u0Var.f18361x.f18914e == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jC0 = u0Var.C0(bVar2, jB, z11);
                    z10 |= jLongValue != jC0;
                    v1 v1Var3 = u0Var.f18361x;
                    h2 h2Var2 = v1Var3.f18910a;
                    bVar4 = bVar2;
                    j15 = j11;
                    u0Var.p1(h2Var2, bVar4, h2Var2, v1Var3.f18911b, j15, true);
                    bVar3 = bVar4;
                    j11 = j15;
                    j14 = jC0;
                    i11 = 2;
                    j13 = j14;
                    u0Var = this;
                }
                u0Var.f18361x = u0Var.L(bVar3, j14, j11, j13, z10, i11);
                return;
            }
            u0Var.K = hVar;
            z10 = z10;
            bVar3 = bVarE;
            j14 = jLongValue;
            i11 = 2;
            j13 = j14;
            u0Var = this;
            u0Var.f18361x = u0Var.L(bVar3, j14, j11, j13, z10, i11);
            return;
        } catch (Throwable th7) {
            th = th7;
            z10 = z10;
            bVar = bVarE;
        }
        j10 = 0;
    }

    private long C() {
        return D(this.f18361x.f18925p);
    }

    private long C0(com.google.android.exoplayer2.source.p.b bVar, long j10, boolean z10) {
        return D0(bVar, j10, this.f18356s.r() != this.f18356s.s(), z10);
    }

    private long D(long j10) {
        a1 a1VarL = this.f18356s.l();
        if (a1VarL == null) {
            return 0L;
        }
        return Math.max(0L, j10 - a1VarL.y(this.L));
    }

    private long D0(com.google.android.exoplayer2.source.p.b bVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        k1();
        this.C = false;
        if (z11 || this.f18361x.f18914e == 3) {
            b1(2);
        }
        a1 a1VarR = this.f18356s.r();
        a1 a1VarJ = a1VarR;
        while (a1VarJ != null && !bVar.equals(a1VarJ.f16440f.f16708a)) {
            a1VarJ = a1VarJ.j();
        }
        if (z10 || a1VarR != a1VarJ || (a1VarJ != null && a1VarJ.z(j10) < 0)) {
            for (b2 b2Var : this.f18338a) {
                o(b2Var);
            }
            if (a1VarJ != null) {
                while (this.f18356s.r() != a1VarJ) {
                    this.f18356s.b();
                }
                this.f18356s.C(a1VarJ);
                a1VarJ.x(1000000000000L);
                r();
            }
        }
        if (a1VarJ != null) {
            this.f18356s.C(a1VarJ);
            if (!a1VarJ.f16438d) {
                a1VarJ.f16440f = a1VarJ.f16440f.b(j10);
            } else if (a1VarJ.f16439e) {
                j10 = a1VarJ.f16435a.seekToUs(j10);
                a1VarJ.f16435a.discardBuffer(j10 - this.f18350m, this.f18351n);
            }
            r0(j10);
            T();
        } else {
            this.f18356s.f();
            r0(j10);
        }
        G(false);
        this.f18345h.sendEmptyMessage(2);
        return j10;
    }

    private void E(com.google.android.exoplayer2.source.o oVar) {
        if (this.f18356s.y(oVar)) {
            this.f18356s.B(this.L);
            T();
        }
    }

    private void E0(y1 y1Var) {
        if (y1Var.f() == C.TIME_UNSET) {
            F0(y1Var);
            return;
        }
        if (this.f18361x.f18910a.u()) {
            this.f18353p.add(new d(y1Var));
            return;
        }
        d dVar = new d(y1Var);
        h2 h2Var = this.f18361x.f18910a;
        if (!t0(dVar, h2Var, h2Var, this.E, this.F, this.f18348k, this.f18349l)) {
            y1Var.k(false);
        } else {
            this.f18353p.add(dVar);
            Collections.sort(this.f18353p);
        }
    }

    private void F(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackExceptionH = ExoPlaybackException.h(iOException, i10);
        a1 a1VarR = this.f18356s.r();
        if (a1VarR != null) {
            exoPlaybackExceptionH = exoPlaybackExceptionH.e(a1VarR.f16440f.f16708a);
        }
        ob.u.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionH);
        j1(false, false);
        this.f18361x = this.f18361x.f(exoPlaybackExceptionH);
    }

    private void F0(y1 y1Var) {
        if (y1Var.c() != this.f18347j) {
            this.f18345h.obtainMessage(15, y1Var).a();
            return;
        }
        m(y1Var);
        int i10 = this.f18361x.f18914e;
        if (i10 == 3 || i10 == 2) {
            this.f18345h.sendEmptyMessage(2);
        }
    }

    private void G(boolean z10) {
        a1 a1VarL = this.f18356s.l();
        com.google.android.exoplayer2.source.p.b bVar = a1VarL == null ? this.f18361x.f18911b : a1VarL.f16440f.f16708a;
        boolean zEquals = this.f18361x.f18920k.equals(bVar);
        if (!zEquals) {
            this.f18361x = this.f18361x.c(bVar);
        }
        v1 v1Var = this.f18361x;
        v1Var.f18925p = a1VarL == null ? v1Var.f18927r : a1VarL.i();
        this.f18361x.f18926q = C();
        if ((!zEquals || z10) && a1VarL != null && a1VarL.f16438d) {
            m1(a1VarL.f16440f.f16708a, a1VarL.n(), a1VarL.o());
        }
    }

    private void G0(final y1 y1Var) {
        Looper looperC = y1Var.c();
        if (looperC.getThread().isAlive()) {
            this.f18354q.createHandler(looperC, null).post(new Runnable() { // from class: com.google.android.exoplayer2.t0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.h(this.f18331a, y1Var);
                }
            });
        } else {
            ob.u.i("TAG", "Trying to send message on a dead thread.");
            y1Var.k(false);
        }
    }

    private void H(h2 h2Var, boolean z10) throws Throwable {
        int i10;
        h2 h2Var2;
        h2 h2Var3;
        g gVarV0 = v0(h2Var, this.f18361x, this.K, this.f18356s, this.E, this.F, this.f18348k, this.f18349l);
        com.google.android.exoplayer2.source.p.b bVar = gVarV0.f18380a;
        long j10 = gVarV0.f18382c;
        boolean z11 = gVarV0.f18383d;
        long jC0 = gVarV0.f18381b;
        int i11 = 1;
        boolean z12 = (this.f18361x.f18911b.equals(bVar) && jC0 == this.f18361x.f18927r) ? false : true;
        h2 h2Var4 = null;
        try {
            if (gVarV0.f18384e) {
                if (this.f18361x.f18914e != 1) {
                    b1(4);
                }
                p0(false, false, false, true);
            }
            try {
                if (z12) {
                    h2Var3 = h2Var;
                    i11 = -1;
                    i10 = 4;
                    if (!h2Var3.u()) {
                        for (a1 a1VarR = this.f18356s.r(); a1VarR != null; a1VarR = a1VarR.j()) {
                            if (a1VarR.f16440f.f16708a.equals(bVar)) {
                                a1VarR.f16440f = this.f18356s.t(h2Var3, a1VarR.f16440f);
                                a1VarR.A();
                            }
                        }
                        jC0 = C0(bVar, jC0, z11);
                    }
                } else {
                    try {
                        try {
                            i10 = 4;
                            try {
                                i11 = -1;
                                try {
                                    h2Var3 = h2Var;
                                    if (!this.f18356s.I(h2Var, this.L, z())) {
                                        A0(false);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    h2Var4 = h2Var;
                                    h2Var2 = h2Var4;
                                    v1 v1Var = this.f18361x;
                                    p1(h2Var2, bVar, v1Var.f18910a, v1Var.f18911b, gVarV0.f18385f ? jC0 : -9223372036854775807L, false);
                                    if (z12 || j10 != this.f18361x.f18912c) {
                                        v1 v1Var2 = this.f18361x;
                                        Object obj = v1Var2.f18911b.f51199a;
                                        h2 h2Var5 = v1Var2.f18910a;
                                        this.f18361x = L(bVar, jC0, j10, this.f18361x.f18913d, z12 && z10 && !h2Var5.u() && !h2Var5.l(obj, this.f18349l).f17003f, h2Var2.f(obj) == i11 ? i10 : 3);
                                    }
                                    q0();
                                    u0(h2Var2, this.f18361x.f18910a);
                                    this.f18361x = this.f18361x.j(h2Var2);
                                    if (!h2Var2.u()) {
                                        this.K = null;
                                    }
                                    G(false);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                h2Var4 = h2Var;
                                i11 = -1;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            h2Var4 = h2Var;
                            i11 = -1;
                            i10 = 4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        h2Var4 = h2Var;
                        i11 = -1;
                        i10 = 4;
                    }
                }
                v1 v1Var3 = this.f18361x;
                p1(h2Var3, bVar, v1Var3.f18910a, v1Var3.f18911b, gVarV0.f18385f ? jC0 : -9223372036854775807L, false);
                if (z12 || j10 != this.f18361x.f18912c) {
                    v1 v1Var4 = this.f18361x;
                    Object obj2 = v1Var4.f18911b.f51199a;
                    h2 h2Var6 = v1Var4.f18910a;
                    this.f18361x = L(bVar, jC0, j10, this.f18361x.f18913d, z12 && z10 && !h2Var6.u() && !h2Var6.l(obj2, this.f18349l).f17003f, h2Var3.f(obj2) == i11 ? i10 : 3);
                }
                q0();
                u0(h2Var3, this.f18361x.f18910a);
                this.f18361x = this.f18361x.j(h2Var3);
                if (!h2Var3.u()) {
                    this.K = null;
                }
                G(false);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            i11 = -1;
            i10 = 4;
            h2Var2 = h2Var;
        }
    }

    private void H0(long j10) {
        for (b2 b2Var : this.f18338a) {
            if (b2Var.getStream() != null) {
                I0(b2Var, j10);
            }
        }
    }

    private void I(com.google.android.exoplayer2.source.o oVar) throws ExoPlaybackException {
        if (this.f18356s.y(oVar)) {
            a1 a1VarL = this.f18356s.l();
            a1VarL.p(this.f18352o.getPlaybackParameters().f18942a, this.f18361x.f18910a);
            m1(a1VarL.f16440f.f16708a, a1VarL.n(), a1VarL.o());
            if (a1VarL == this.f18356s.r()) {
                r0(a1VarL.f16440f.f16709b);
                r();
                v1 v1Var = this.f18361x;
                com.google.android.exoplayer2.source.p.b bVar = v1Var.f18911b;
                long j10 = a1VarL.f16440f.f16709b;
                this.f18361x = L(bVar, j10, v1Var.f18912c, j10, false, 5);
            }
            T();
        }
    }

    private void I0(b2 b2Var, long j10) {
        b2Var.setCurrentStreamFinal();
        if (b2Var instanceof bb.p) {
            ((bb.p) b2Var).V(j10);
        }
    }

    private void J(w1 w1Var, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f18362y.b(1);
            }
            this.f18361x = this.f18361x.g(w1Var);
        }
        q1(w1Var.f18942a);
        for (b2 b2Var : this.f18338a) {
            if (b2Var != null) {
                b2Var.k(f10, w1Var.f18942a);
            }
        }
    }

    private void J0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.G != z10) {
            this.G = z10;
            if (!z10) {
                for (b2 b2Var : this.f18338a) {
                    if (!Q(b2Var) && this.f18339b.remove(b2Var)) {
                        b2Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void K(w1 w1Var, boolean z10) {
        J(w1Var, w1Var.f18942a, true, z10);
    }

    private void K0(w1 w1Var) {
        this.f18345h.removeMessages(16);
        this.f18352o.b(w1Var);
    }

    private v1 L(com.google.android.exoplayer2.source.p.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        ra.x xVar;
        lb.b0 b0Var;
        this.N = (!this.N && j10 == this.f18361x.f18927r && bVar.equals(this.f18361x.f18911b)) ? false : true;
        q0();
        v1 v1Var = this.f18361x;
        ra.x xVar2 = v1Var.f18917h;
        lb.b0 b0Var2 = v1Var.f18918i;
        List listC = v1Var.f18919j;
        if (this.f18357t.t()) {
            a1 a1VarR = this.f18356s.r();
            ra.x xVarN = a1VarR == null ? ra.x.f51253d : a1VarR.n();
            lb.b0 b0VarO = a1VarR == null ? this.f18342e : a1VarR.o();
            com.google.common.collect.c0 c0VarV = v(b0VarO.f44108c);
            if (a1VarR != null) {
                b1 b1Var = a1VarR.f16440f;
                if (b1Var.f16710c != j11) {
                    a1VarR.f16440f = b1Var.a(j11);
                }
            }
            xVar = xVarN;
            b0Var = b0VarO;
            list = c0VarV;
        } else {
            if (!bVar.equals(this.f18361x.f18911b)) {
                xVar2 = ra.x.f51253d;
                b0Var2 = this.f18342e;
                listC = com.google.common.collect.c0.C();
            }
            list = listC;
            xVar = xVar2;
            b0Var = b0Var2;
        }
        if (z10) {
            this.f18362y.e(i10);
        }
        return this.f18361x.d(bVar, j10, j11, j12, C(), xVar, b0Var, list);
    }

    private void L0(b bVar) throws Throwable {
        this.f18362y.b(1);
        if (bVar.f18367c != -1) {
            this.K = new h(new z1(bVar.f18365a, bVar.f18366b), bVar.f18367c, bVar.f18368d);
        }
        H(this.f18357t.B(bVar.f18365a, bVar.f18366b), false);
    }

    private boolean M(b2 b2Var, a1 a1Var) {
        a1 a1VarJ = a1Var.j();
        if (a1Var.f16440f.f16713f && a1VarJ.f16438d) {
            return (b2Var instanceof bb.p) || (b2Var instanceof ha.f) || b2Var.l() >= a1VarJ.m();
        }
        return false;
    }

    private boolean N() {
        a1 a1VarS = this.f18356s.s();
        if (!a1VarS.f16438d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            b2[] b2VarArr = this.f18338a;
            if (i10 >= b2VarArr.length) {
                return true;
            }
            b2 b2Var = b2VarArr[i10];
            ra.s sVar = a1VarS.f16437c[i10];
            if (b2Var.getStream() != sVar || (sVar != null && !b2Var.hasReadStreamToEnd() && !M(b2Var, a1VarS))) {
                return false;
            }
            i10++;
        }
    }

    private void N0(boolean z10) {
        if (z10 == this.I) {
            return;
        }
        this.I = z10;
        if (z10 || !this.f18361x.f18924o) {
            return;
        }
        this.f18345h.sendEmptyMessage(2);
    }

    private static boolean O(boolean z10, com.google.android.exoplayer2.source.p.b bVar, long j10, com.google.android.exoplayer2.source.p.b bVar2, h2.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f51199a.equals(bVar2.f51199a)) {
            if (bVar.b() && bVar3.u(bVar.f51200b)) {
                return (bVar3.k(bVar.f51200b, bVar.f51201c) == 4 || bVar3.k(bVar.f51200b, bVar.f51201c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.u(bVar2.f51200b)) {
                return true;
            }
        }
        return false;
    }

    private boolean P() {
        a1 a1VarL = this.f18356s.l();
        return (a1VarL == null || a1VarL.k() == Long.MIN_VALUE) ? false : true;
    }

    private void P0(boolean z10) throws ExoPlaybackException {
        this.A = z10;
        q0();
        if (!this.B || this.f18356s.s() == this.f18356s.r()) {
            return;
        }
        A0(true);
        G(false);
    }

    private static boolean Q(b2 b2Var) {
        return b2Var.getState() != 0;
    }

    private boolean R() {
        a1 a1VarR = this.f18356s.r();
        long j10 = a1VarR.f16440f.f16712e;
        if (a1VarR.f16438d) {
            return j10 == C.TIME_UNSET || this.f18361x.f18927r < j10 || !e1();
        }
        return false;
    }

    private void R0(boolean z10, int i10, boolean z11, int i11) {
        this.f18362y.b(z11 ? 1 : 0);
        this.f18362y.c(i11);
        this.f18361x = this.f18361x.e(z10, i10);
        this.C = false;
        d0(z10);
        if (!e1()) {
            k1();
            o1();
            return;
        }
        int i12 = this.f18361x.f18914e;
        if (i12 == 3) {
            h1();
            this.f18345h.sendEmptyMessage(2);
        } else if (i12 == 2) {
            this.f18345h.sendEmptyMessage(2);
        }
    }

    private static boolean S(v1 v1Var, h2.b bVar) {
        com.google.android.exoplayer2.source.p.b bVar2 = v1Var.f18911b;
        h2 h2Var = v1Var.f18910a;
        return h2Var.u() || h2Var.l(bVar2.f51199a, bVar).f17003f;
    }

    private void T() {
        boolean zD1 = d1();
        this.D = zD1;
        if (zD1) {
            this.f18356s.l().d(this.L);
        }
        l1();
    }

    private void T0(w1 w1Var) {
        K0(w1Var);
        K(this.f18352o.getPlaybackParameters(), true);
    }

    private void U() {
        this.f18362y.d(this.f18361x);
        if (this.f18362y.f18373a) {
            this.f18355r.a(this.f18362y);
            this.f18362y = new e(this.f18361x);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void V(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.u0.V(long, long):void");
    }

    private void V0(int i10) throws ExoPlaybackException {
        this.E = i10;
        if (!this.f18356s.J(this.f18361x.f18910a, i10)) {
            A0(true);
        }
        G(false);
    }

    private void W() {
        b1 b1VarQ;
        this.f18356s.B(this.L);
        if (this.f18356s.G() && (b1VarQ = this.f18356s.q(this.L, this.f18361x)) != null) {
            a1 a1VarG = this.f18356s.g(this.f18340c, this.f18341d, this.f18343f.getAllocator(), this.f18357t, b1VarQ, this.f18342e);
            a1VarG.f16435a.d(this, b1VarQ.f16709b);
            if (this.f18356s.r() == a1VarG) {
                r0(b1VarQ.f16709b);
            }
            G(false);
        }
        if (!this.D) {
            T();
        } else {
            this.D = P();
            l1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    private void X() {
        boolean z10;
        boolean z11 = false;
        while (c1()) {
            if (z11) {
                U();
            }
            a1 a1Var = (a1) ob.a.e(this.f18356s.b());
            if (this.f18361x.f18911b.f51199a.equals(a1Var.f16440f.f16708a.f51199a)) {
                com.google.android.exoplayer2.source.p.b bVar = this.f18361x.f18911b;
                if (bVar.f51200b == -1) {
                    com.google.android.exoplayer2.source.p.b bVar2 = a1Var.f16440f.f16708a;
                    if (bVar2.f51200b != -1 || bVar.f51203e == bVar2.f51203e) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            b1 b1Var = a1Var.f16440f;
            com.google.android.exoplayer2.source.p.b bVar3 = b1Var.f16708a;
            long j10 = b1Var.f16709b;
            this.f18361x = L(bVar3, j10, b1Var.f16710c, j10, !z10, 0);
            q0();
            o1();
            z11 = true;
        }
    }

    private void X0(o9.j0 j0Var) {
        this.f18360w = j0Var;
    }

    private void Y() {
        a1 a1VarS = this.f18356s.s();
        if (a1VarS == null) {
            return;
        }
        int i10 = 0;
        if (a1VarS.j() != null && !this.B) {
            if (N()) {
                if (a1VarS.j().f16438d || this.L >= a1VarS.j().m()) {
                    lb.b0 b0VarO = a1VarS.o();
                    a1 a1VarC = this.f18356s.c();
                    lb.b0 b0VarO2 = a1VarC.o();
                    h2 h2Var = this.f18361x.f18910a;
                    p1(h2Var, a1VarC.f16440f.f16708a, h2Var, a1VarS.f16440f.f16708a, C.TIME_UNSET, false);
                    if (a1VarC.f16438d && a1VarC.f16435a.readDiscontinuity() != C.TIME_UNSET) {
                        H0(a1VarC.m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f18338a.length; i11++) {
                        boolean zC = b0VarO.c(i11);
                        boolean zC2 = b0VarO2.c(i11);
                        if (zC && !this.f18338a[i11].isCurrentStreamFinal()) {
                            boolean z10 = this.f18340c[i11].getTrackType() == -2;
                            o9.h0 h0Var = b0VarO.f44107b[i11];
                            o9.h0 h0Var2 = b0VarO2.f44107b[i11];
                            if (!zC2 || !h0Var2.equals(h0Var) || z10) {
                                I0(this.f18338a[i11], a1VarC.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!a1VarS.f16440f.f16716i && !this.B) {
            return;
        }
        while (true) {
            b2[] b2VarArr = this.f18338a;
            if (i10 >= b2VarArr.length) {
                return;
            }
            b2 b2Var = b2VarArr[i10];
            ra.s sVar = a1VarS.f16437c[i10];
            if (sVar != null && b2Var.getStream() == sVar && b2Var.hasReadStreamToEnd()) {
                long j10 = a1VarS.f16440f.f16712e;
                I0(b2Var, (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? -9223372036854775807L : a1VarS.l() + a1VarS.f16440f.f16712e);
            }
            i10++;
        }
    }

    private void Z() throws ExoPlaybackException {
        a1 a1VarS = this.f18356s.s();
        if (a1VarS == null || this.f18356s.r() == a1VarS || a1VarS.f16441g || !m0()) {
            return;
        }
        r();
    }

    private void Z0(boolean z10) throws ExoPlaybackException {
        this.F = z10;
        if (!this.f18356s.K(this.f18361x.f18910a, z10)) {
            A0(true);
        }
        G(false);
    }

    private void a0() throws Throwable {
        H(this.f18357t.i(), true);
    }

    private void a1(com.google.android.exoplayer2.source.e0 e0Var) throws Throwable {
        this.f18362y.b(1);
        H(this.f18357t.C(e0Var), false);
    }

    private void b0(c cVar) {
        this.f18362y.b(1);
        throw null;
    }

    private void b1(int i10) {
        v1 v1Var = this.f18361x;
        if (v1Var.f18914e != i10) {
            if (i10 != 2) {
                this.Q = C.TIME_UNSET;
            }
            this.f18361x = v1Var.h(i10);
        }
    }

    private void c0() {
        for (a1 a1VarR = this.f18356s.r(); a1VarR != null; a1VarR = a1VarR.j()) {
            for (lb.r rVar : a1VarR.o().f44108c) {
                if (rVar != null) {
                    rVar.a();
                }
            }
        }
    }

    private boolean c1() {
        a1 a1VarR;
        a1 a1VarJ;
        return e1() && !this.B && (a1VarR = this.f18356s.r()) != null && (a1VarJ = a1VarR.j()) != null && this.L >= a1VarJ.m() && a1VarJ.f16441g;
    }

    private void d0(boolean z10) {
        for (a1 a1VarR = this.f18356s.r(); a1VarR != null; a1VarR = a1VarR.j()) {
            for (lb.r rVar : a1VarR.o().f44108c) {
                if (rVar != null) {
                    rVar.b(z10);
                }
            }
        }
    }

    private boolean d1() {
        if (!P()) {
            return false;
        }
        a1 a1VarL = this.f18356s.l();
        long jD = D(a1VarL.k());
        long jY = a1VarL == this.f18356s.r() ? a1VarL.y(this.L) : a1VarL.y(this.L) - a1VarL.f16440f.f16709b;
        boolean zC = this.f18343f.c(jY, jD, this.f18352o.getPlaybackParameters().f18942a);
        if (zC || jD >= 500000) {
            return zC;
        }
        if (this.f18350m <= 0 && !this.f18351n) {
            return zC;
        }
        this.f18356s.r().f16435a.discardBuffer(this.f18361x.f18927r, false);
        return this.f18343f.c(jY, jD, this.f18352o.getPlaybackParameters().f18942a);
    }

    private void e0() {
        for (a1 a1VarR = this.f18356s.r(); a1VarR != null; a1VarR = a1VarR.j()) {
            for (lb.r rVar : a1VarR.o().f44108c) {
                if (rVar != null) {
                    rVar.c();
                }
            }
        }
    }

    private boolean e1() {
        v1 v1Var = this.f18361x;
        return v1Var.f18921l && v1Var.f18922m == 0;
    }

    private boolean f1(boolean z10) {
        if (this.J == 0) {
            return R();
        }
        if (!z10) {
            return false;
        }
        if (!this.f18361x.f18916g) {
            return true;
        }
        a1 a1VarR = this.f18356s.r();
        long jB = g1(this.f18361x.f18910a, a1VarR.f16440f.f16708a) ? this.f18358u.b() : C.TIME_UNSET;
        a1 a1VarL = this.f18356s.l();
        return (a1VarL.q() && a1VarL.f16440f.f16716i) || (a1VarL.f16440f.f16708a.b() && !a1VarL.f16438d) || this.f18343f.a(this.f18361x.f18910a, a1VarR.f16440f.f16708a, C(), this.f18352o.getPlaybackParameters().f18942a, this.C, jB);
    }

    private boolean g1(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar) {
        if (!bVar.b() && !h2Var.u()) {
            h2Var.r(h2Var.l(bVar.f51199a, this.f18349l).f17000c, this.f18348k);
            if (this.f18348k.h()) {
                h2.d dVar = this.f18348k;
                if (dVar.f17026i && dVar.f17023f != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void h(u0 u0Var, y1 y1Var) {
        u0Var.getClass();
        try {
            u0Var.m(y1Var);
        } catch (ExoPlaybackException e10) {
            ob.u.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void h0() {
        this.f18362y.b(1);
        p0(false, false, false, true);
        this.f18343f.onPrepared();
        b1(this.f18361x.f18910a.u() ? 4 : 2);
        this.f18357t.v(this.f18344g.a());
        this.f18345h.sendEmptyMessage(2);
    }

    private void h1() {
        this.C = false;
        this.f18352o.f();
        for (b2 b2Var : this.f18338a) {
            if (Q(b2Var)) {
                b2Var.start();
            }
        }
    }

    private void j0() {
        p0(true, false, true, false);
        k0();
        this.f18343f.onReleased();
        b1(1);
        HandlerThread handlerThread = this.f18346i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f18363z = true;
            notifyAll();
        }
    }

    private void j1(boolean z10, boolean z11) {
        p0(z10 || !this.G, false, true, false);
        this.f18362y.b(z11 ? 1 : 0);
        this.f18343f.onStopped();
        b1(1);
    }

    private void k(b bVar, int i10) throws Throwable {
        this.f18362y.b(1);
        s1 s1Var = this.f18357t;
        if (i10 == -1) {
            i10 = s1Var.r();
        }
        H(s1Var.f(i10, bVar.f18365a, bVar.f18366b), false);
    }

    private void k0() {
        for (int i10 = 0; i10 < this.f18338a.length; i10++) {
            this.f18340c[i10].c();
            this.f18338a[i10].release();
        }
    }

    private void k1() {
        this.f18352o.g();
        for (b2 b2Var : this.f18338a) {
            if (Q(b2Var)) {
                t(b2Var);
            }
        }
    }

    private void l() throws ExoPlaybackException {
        o0();
    }

    private void l0(int i10, int i11, com.google.android.exoplayer2.source.e0 e0Var) throws Throwable {
        this.f18362y.b(1);
        H(this.f18357t.z(i10, i11, e0Var), false);
    }

    private void l1() {
        a1 a1VarL = this.f18356s.l();
        boolean z10 = this.D || (a1VarL != null && a1VarL.f16435a.isLoading());
        v1 v1Var = this.f18361x;
        if (z10 != v1Var.f18916g) {
            this.f18361x = v1Var.b(z10);
        }
    }

    private void m(y1 y1Var) {
        if (y1Var.j()) {
            return;
        }
        try {
            y1Var.g().handleMessage(y1Var.i(), y1Var.e());
        } finally {
            y1Var.k(true);
        }
    }

    private boolean m0() {
        a1 a1VarS = this.f18356s.s();
        lb.b0 b0VarO = a1VarS.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            b2[] b2VarArr = this.f18338a;
            if (i10 >= b2VarArr.length) {
                return !z10;
            }
            b2 b2Var = b2VarArr[i10];
            if (Q(b2Var)) {
                boolean z11 = b2Var.getStream() != a1VarS.f16437c[i10];
                if (!b0VarO.c(i10) || z11) {
                    if (!b2Var.isCurrentStreamFinal()) {
                        b2Var.n(x(b0VarO.f44108c[i10]), a1VarS.f16437c[i10], a1VarS.m(), a1VarS.l());
                    } else if (b2Var.isEnded()) {
                        o(b2Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void m1(com.google.android.exoplayer2.source.p.b bVar, ra.x xVar, lb.b0 b0Var) {
        this.f18343f.b(this.f18361x.f18910a, bVar, this.f18338a, xVar, b0Var.f44108c);
    }

    private void n0() throws ExoPlaybackException {
        int i10;
        float f10 = this.f18352o.getPlaybackParameters().f18942a;
        a1 a1VarS = this.f18356s.s();
        boolean z10 = true;
        for (a1 a1VarR = this.f18356s.r(); a1VarR != null && a1VarR.f16438d; a1VarR = a1VarR.j()) {
            lb.b0 b0VarV = a1VarR.v(f10, this.f18361x.f18910a);
            if (!b0VarV.a(a1VarR.o())) {
                if (z10) {
                    a1 a1VarR2 = this.f18356s.r();
                    boolean zC = this.f18356s.C(a1VarR2);
                    boolean[] zArr = new boolean[this.f18338a.length];
                    long jB = a1VarR2.b(b0VarV, this.f18361x.f18927r, zC, zArr);
                    v1 v1Var = this.f18361x;
                    boolean z11 = (v1Var.f18914e == 4 || jB == v1Var.f18927r) ? false : true;
                    v1 v1Var2 = this.f18361x;
                    i10 = 4;
                    this.f18361x = L(v1Var2.f18911b, jB, v1Var2.f18912c, v1Var2.f18913d, z11, 5);
                    if (z11) {
                        r0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f18338a.length];
                    int i11 = 0;
                    while (true) {
                        b2[] b2VarArr = this.f18338a;
                        if (i11 >= b2VarArr.length) {
                            break;
                        }
                        b2 b2Var = b2VarArr[i11];
                        boolean zQ = Q(b2Var);
                        zArr2[i11] = zQ;
                        ra.s sVar = a1VarR2.f16437c[i11];
                        if (zQ) {
                            if (sVar != b2Var.getStream()) {
                                o(b2Var);
                            } else if (zArr[i11]) {
                                b2Var.resetPosition(this.L);
                            }
                        }
                        i11++;
                    }
                    s(zArr2);
                } else {
                    i10 = 4;
                    this.f18356s.C(a1VarR);
                    if (a1VarR.f16438d) {
                        a1VarR.a(b0VarV, Math.max(a1VarR.f16440f.f16709b, a1VarR.y(this.L)), false);
                    }
                }
                G(true);
                if (this.f18361x.f18914e != i10) {
                    T();
                    o1();
                    this.f18345h.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (a1VarR == a1VarS) {
                z10 = false;
            }
        }
    }

    private void n1() throws ExoPlaybackException {
        if (this.f18361x.f18910a.u() || !this.f18357t.t()) {
            return;
        }
        W();
        Y();
        Z();
        X();
    }

    private void o(b2 b2Var) {
        if (Q(b2Var)) {
            this.f18352o.a(b2Var);
            t(b2Var);
            b2Var.disable();
            this.J--;
        }
    }

    private void o0() throws ExoPlaybackException {
        n0();
        A0(true);
    }

    private void o1() {
        a1 a1VarR = this.f18356s.r();
        if (a1VarR == null) {
            return;
        }
        long discontinuity = a1VarR.f16438d ? a1VarR.f16435a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C.TIME_UNSET) {
            r0(discontinuity);
            if (discontinuity != this.f18361x.f18927r) {
                v1 v1Var = this.f18361x;
                long j10 = discontinuity;
                this.f18361x = L(v1Var.f18911b, j10, v1Var.f18912c, j10, true, 5);
            }
        } else {
            long jH = this.f18352o.h(a1VarR != this.f18356s.s());
            this.L = jH;
            long jY = a1VarR.y(jH);
            V(this.f18361x.f18927r, jY);
            this.f18361x.o(jY);
        }
        this.f18361x.f18925p = this.f18356s.l().i();
        this.f18361x.f18926q = C();
        v1 v1Var2 = this.f18361x;
        if (v1Var2.f18921l && v1Var2.f18914e == 3 && g1(v1Var2.f18910a, v1Var2.f18911b) && this.f18361x.f18923n.f18942a == 1.0f) {
            float fA = this.f18358u.a(w(), C());
            if (this.f18352o.getPlaybackParameters().f18942a != fA) {
                K0(this.f18361x.f18923n.c(fA));
                J(this.f18361x.f18923n, this.f18352o.getPlaybackParameters().f18942a, false, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    private void p() throws ExoPlaybackException {
        boolean z10;
        boolean z11;
        int i10;
        long jUptimeMillis = this.f18354q.uptimeMillis();
        this.f18345h.removeMessages(2);
        n1();
        int i11 = this.f18361x.f18914e;
        if (i11 == 1 || i11 == 4) {
            return;
        }
        a1 a1VarR = this.f18356s.r();
        if (a1VarR == null) {
            y0(jUptimeMillis, 10L);
            return;
        }
        ob.o0.a("doSomeWork");
        o1();
        if (a1VarR.f16438d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            a1VarR.f16435a.discardBuffer(this.f18361x.f18927r - this.f18350m, this.f18351n);
            z10 = true;
            z11 = true;
            int i12 = 0;
            while (true) {
                b2[] b2VarArr = this.f18338a;
                if (i12 >= b2VarArr.length) {
                    break;
                }
                b2 b2Var = b2VarArr[i12];
                if (Q(b2Var)) {
                    b2Var.render(this.L, jElapsedRealtime);
                    z10 = z10 && b2Var.isEnded();
                    boolean z12 = a1VarR.f16437c[i12] != b2Var.getStream();
                    boolean z13 = z12 || (!z12 && b2Var.hasReadStreamToEnd()) || b2Var.isReady() || b2Var.isEnded();
                    z11 = z11 && z13;
                    if (!z13) {
                        b2Var.maybeThrowStreamError();
                    }
                }
                i12++;
            }
        } else {
            a1VarR.f16435a.maybeThrowPrepareError();
            z10 = true;
            z11 = true;
        }
        long j10 = a1VarR.f16440f.f16712e;
        boolean z14 = z10 && a1VarR.f16438d && (j10 == C.TIME_UNSET || j10 <= this.f18361x.f18927r);
        if (z14 && this.B) {
            this.B = false;
            R0(false, this.f18361x.f18922m, false, 5);
        }
        if (z14 && a1VarR.f16440f.f16716i) {
            b1(4);
            k1();
        } else if (this.f18361x.f18914e == 2 && f1(z11)) {
            b1(3);
            this.O = null;
            if (e1()) {
                h1();
            }
        } else if (this.f18361x.f18914e == 3 && (this.J != 0 ? !z11 : !R())) {
            this.C = e1();
            b1(2);
            if (this.C) {
                e0();
                this.f18358u.c();
            }
            k1();
        }
        if (this.f18361x.f18914e == 2) {
            int i13 = 0;
            while (true) {
                b2[] b2VarArr2 = this.f18338a;
                if (i13 >= b2VarArr2.length) {
                    break;
                }
                if (Q(b2VarArr2[i13]) && this.f18338a[i13].getStream() == a1VarR.f16437c[i13]) {
                    this.f18338a[i13].maybeThrowStreamError();
                }
                i13++;
            }
            v1 v1Var = this.f18361x;
            if (v1Var.f18916g || v1Var.f18926q >= 500000 || !P()) {
                this.Q = C.TIME_UNSET;
            } else if (this.Q == C.TIME_UNSET) {
                this.Q = this.f18354q.elapsedRealtime();
            } else if (this.f18354q.elapsedRealtime() - this.Q >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        } else {
            this.Q = C.TIME_UNSET;
        }
        boolean z15 = e1() && this.f18361x.f18914e == 3;
        boolean z16 = this.I && this.H && z15;
        v1 v1Var2 = this.f18361x;
        if (v1Var2.f18924o != z16) {
            this.f18361x = v1Var2.i(z16);
        }
        this.H = false;
        if (!z16 && (i10 = this.f18361x.f18914e) != 4) {
            if (z15 || i10 == 2) {
                y0(jUptimeMillis, 10L);
            } else if (i10 == 3 && this.J != 0) {
                y0(jUptimeMillis, 1000L);
            }
        }
        ob.o0.c();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[PHI: r4 r5 r7
      0x00a3: PHI (r4v3 com.google.android.exoplayer2.source.p$b) = (r4v2 com.google.android.exoplayer2.source.p$b), (r4v6 com.google.android.exoplayer2.source.p$b) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r5v2 long) = (r5v1 long), (r5v16 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea A[PHI: r3
      0x00ea: PHI (r3v3 com.google.android.exoplayer2.h2) = 
      (r3v2 com.google.android.exoplayer2.h2)
      (r3v2 com.google.android.exoplayer2.h2)
      (r3v7 com.google.android.exoplayer2.h2)
      (r3v7 com.google.android.exoplayer2.h2)
     binds: [B:37:0x00b0, B:39:0x00b4, B:41:0x00c5, B:43:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    private void p0(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        h2 h2Var;
        com.google.android.exoplayer2.source.p.b bVar;
        this.f18345h.removeMessages(2);
        this.O = null;
        this.C = false;
        this.f18352o.g();
        this.L = 1000000000000L;
        for (b2 b2Var : this.f18338a) {
            try {
                o(b2Var);
            } catch (ExoPlaybackException | RuntimeException e10) {
                ob.u.d("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (b2 b2Var2 : this.f18338a) {
                if (this.f18339b.remove(b2Var2)) {
                    try {
                        b2Var2.reset();
                    } catch (RuntimeException e11) {
                        ob.u.d("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.J = 0;
        v1 v1Var = this.f18361x;
        com.google.android.exoplayer2.source.p.b bVar2 = v1Var.f18911b;
        long jLongValue = v1Var.f18927r;
        long j10 = (this.f18361x.f18911b.b() || S(this.f18361x, this.f18349l)) ? this.f18361x.f18912c : this.f18361x.f18927r;
        if (z11) {
            this.K = null;
            Pair pairA = A(this.f18361x.f18910a);
            bVar2 = (com.google.android.exoplayer2.source.p.b) pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            boolean zEquals = bVar2.equals(this.f18361x.f18911b);
            j10 = C.TIME_UNSET;
            if (zEquals) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        long j11 = jLongValue;
        long j12 = j10;
        this.f18356s.f();
        this.D = false;
        h2 h2VarI = this.f18361x.f18910a;
        if (z12 && (h2VarI instanceof z1)) {
            h2VarI = ((z1) h2VarI).I(this.f18357t.q());
            if (bVar2.f51200b != -1) {
                h2VarI.l(bVar2.f51199a, this.f18349l);
                if (h2VarI.r(this.f18349l.f17000c, this.f18348k).h()) {
                    h2Var = h2VarI;
                    bVar = new com.google.android.exoplayer2.source.p.b(bVar2.f51199a, bVar2.f51202d);
                } else {
                    h2Var = h2VarI;
                    bVar = bVar2;
                }
            } else {
                h2Var = h2VarI;
                bVar = bVar2;
            }
        } else {
            h2Var = h2VarI;
            bVar = bVar2;
        }
        v1 v1Var2 = this.f18361x;
        int i10 = v1Var2.f18914e;
        ExoPlaybackException exoPlaybackException = z13 ? null : v1Var2.f18915f;
        ra.x xVar = z14 ? ra.x.f51253d : v1Var2.f18917h;
        lb.b0 b0Var = z14 ? this.f18342e : v1Var2.f18918i;
        List listC = z14 ? com.google.common.collect.c0.C() : v1Var2.f18919j;
        v1 v1Var3 = this.f18361x;
        this.f18361x = new v1(h2Var, bVar, j12, j11, i10, exoPlaybackException, false, xVar, b0Var, listC, bVar, v1Var3.f18921l, v1Var3.f18922m, v1Var3.f18923n, j11, 0L, j11, 0L, false);
        if (z12) {
            this.f18357t.x();
        }
    }

    private void p1(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar, h2 h2Var2, com.google.android.exoplayer2.source.p.b bVar2, long j10, boolean z10) {
        if (!g1(h2Var, bVar)) {
            w1 w1Var = bVar.b() ? w1.f18938d : this.f18361x.f18923n;
            if (this.f18352o.getPlaybackParameters().equals(w1Var)) {
                return;
            }
            K0(w1Var);
            J(this.f18361x.f18923n, w1Var.f18942a, false, false);
            return;
        }
        h2Var.r(h2Var.l(bVar.f51199a, this.f18349l).f17000c, this.f18348k);
        this.f18358u.e((y0.g) ob.r0.j(this.f18348k.f17028k));
        if (j10 != C.TIME_UNSET) {
            this.f18358u.d(y(h2Var, bVar.f51199a, j10));
            return;
        }
        if (!ob.r0.c(!h2Var2.u() ? h2Var2.r(h2Var2.l(bVar2.f51199a, this.f18349l).f17000c, this.f18348k).f17018a : null, this.f18348k.f17018a) || z10) {
            this.f18358u.d(C.TIME_UNSET);
        }
    }

    private void q(int i10, boolean z10) throws ExoPlaybackException {
        b2 b2Var = this.f18338a[i10];
        if (Q(b2Var)) {
            return;
        }
        a1 a1VarS = this.f18356s.s();
        boolean z11 = a1VarS == this.f18356s.r();
        lb.b0 b0VarO = a1VarS.o();
        o9.h0 h0Var = b0VarO.f44107b[i10];
        v0[] v0VarArrX = x(b0VarO.f44108c[i10]);
        boolean z12 = e1() && this.f18361x.f18914e == 3;
        boolean z13 = !z10 && z12;
        this.J++;
        this.f18339b.add(b2Var);
        b2Var.o(h0Var, v0VarArrX, a1VarS.f16437c[i10], this.L, z13, z11, a1VarS.m(), a1VarS.l());
        b2Var.handleMessage(11, new a());
        this.f18352o.c(b2Var);
        if (z12) {
            b2Var.start();
        }
    }

    private void q0() {
        a1 a1VarR = this.f18356s.r();
        this.B = a1VarR != null && a1VarR.f16440f.f16715h && this.A;
    }

    private void q1(float f10) {
        for (a1 a1VarR = this.f18356s.r(); a1VarR != null; a1VarR = a1VarR.j()) {
            for (lb.r rVar : a1VarR.o().f44108c) {
                if (rVar != null) {
                    rVar.onPlaybackSpeed(f10);
                }
            }
        }
    }

    private void r() throws ExoPlaybackException {
        s(new boolean[this.f18338a.length]);
    }

    private void r0(long j10) {
        a1 a1VarR = this.f18356s.r();
        long jZ = a1VarR == null ? j10 + 1000000000000L : a1VarR.z(j10);
        this.L = jZ;
        this.f18352o.d(jZ);
        for (b2 b2Var : this.f18338a) {
            if (Q(b2Var)) {
                b2Var.resetPosition(this.L);
            }
        }
        c0();
    }

    private synchronized void r1(sc.x xVar, long j10) {
        long jElapsedRealtime = this.f18354q.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) xVar.get()).booleanValue() && j10 > 0) {
            try {
                this.f18354q.a();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - this.f18354q.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void s(boolean[] zArr) throws ExoPlaybackException {
        a1 a1VarS = this.f18356s.s();
        lb.b0 b0VarO = a1VarS.o();
        for (int i10 = 0; i10 < this.f18338a.length; i10++) {
            if (!b0VarO.c(i10) && this.f18339b.remove(this.f18338a[i10])) {
                this.f18338a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f18338a.length; i11++) {
            if (b0VarO.c(i11)) {
                q(i11, zArr[i11]);
            }
        }
        a1VarS.f16441g = true;
    }

    private static void s0(h2 h2Var, d dVar, h2.d dVar2, h2.b bVar) {
        int i10 = h2Var.r(h2Var.l(dVar.f18372d, bVar).f17000c, dVar2).f17033p;
        Object obj = h2Var.k(i10, bVar, true).f16999b;
        long j10 = bVar.f17001d;
        dVar.b(i10, j10 != C.TIME_UNSET ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private void t(b2 b2Var) {
        if (b2Var.getState() == 2) {
            b2Var.stop();
        }
    }

    private static boolean t0(d dVar, h2 h2Var, h2 h2Var2, int i10, boolean z10, h2.d dVar2, h2.b bVar) {
        Object obj = dVar.f18372d;
        if (obj == null) {
            Pair pairW0 = w0(h2Var, new h(dVar.f18369a.h(), dVar.f18369a.d(), dVar.f18369a.f() == Long.MIN_VALUE ? C.TIME_UNSET : ob.r0.H0(dVar.f18369a.f())), false, i10, z10, dVar2, bVar);
            if (pairW0 == null) {
                return false;
            }
            dVar.b(h2Var.f(pairW0.first), ((Long) pairW0.second).longValue(), pairW0.first);
            if (dVar.f18369a.f() == Long.MIN_VALUE) {
                s0(h2Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int iF = h2Var.f(obj);
        if (iF == -1) {
            return false;
        }
        if (dVar.f18369a.f() == Long.MIN_VALUE) {
            s0(h2Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f18370b = iF;
        h2Var2.l(dVar.f18372d, bVar);
        if (bVar.f17003f && h2Var2.r(bVar.f17000c, dVar2).f17032o == h2Var2.f(dVar.f18372d)) {
            Pair pairN = h2Var.n(dVar2, bVar, h2Var.l(dVar.f18372d, bVar).f17000c, dVar.f18371c + bVar.q());
            dVar.b(h2Var.f(pairN.first), ((Long) pairN.second).longValue(), pairN.first);
        }
        return true;
    }

    private void u0(h2 h2Var, h2 h2Var2) {
        if (h2Var.u() && h2Var2.u()) {
            return;
        }
        int size = this.f18353p.size() - 1;
        while (size >= 0) {
            h2 h2Var3 = h2Var;
            h2 h2Var4 = h2Var2;
            if (!t0((d) this.f18353p.get(size), h2Var3, h2Var4, this.E, this.F, this.f18348k, this.f18349l)) {
                ((d) this.f18353p.get(size)).f18369a.k(false);
                this.f18353p.remove(size);
            }
            size--;
            h2Var = h2Var3;
            h2Var2 = h2Var4;
        }
        Collections.sort(this.f18353p);
    }

    private com.google.common.collect.c0 v(lb.r[] rVarArr) {
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        boolean z10 = false;
        for (lb.r rVar : rVarArr) {
            if (rVar != null) {
                ha.a aVar2 = rVar.getFormat(0).f18866j;
                if (aVar2 == null) {
                    aVar.a(new ha.a(new ha.a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.m() : com.google.common.collect.c0.C();
    }

    private static g v0(h2 h2Var, v1 v1Var, h hVar, d1 d1Var, int i10, boolean z10, h2.d dVar, h2.b bVar) {
        int iE;
        boolean z11;
        boolean z12;
        boolean z13;
        int iE2;
        boolean z14;
        h2 h2Var2;
        h2.b bVar2;
        long j10;
        int i11;
        boolean z15;
        boolean z16;
        boolean z17;
        if (h2Var.u()) {
            return new g(v1.l(), 0L, C.TIME_UNSET, false, true, false);
        }
        com.google.android.exoplayer2.source.p.b bVar3 = v1Var.f18911b;
        Object obj = bVar3.f51199a;
        boolean zS = S(v1Var, bVar);
        long jLongValue = (v1Var.f18911b.b() || zS) ? v1Var.f18912c : v1Var.f18927r;
        long j11 = C.TIME_UNSET;
        boolean z18 = false;
        if (hVar != null) {
            Pair pairW0 = w0(h2Var, hVar, true, i10, z10, dVar, bVar);
            if (pairW0 == null) {
                iE = h2Var.e(z10);
                jLongValue = jLongValue;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f18388c == C.TIME_UNSET) {
                    iE = h2Var.l(pairW0.first, bVar).f17000c;
                    jLongValue = jLongValue;
                    z15 = false;
                } else {
                    obj = pairW0.first;
                    jLongValue = ((Long) pairW0.second).longValue();
                    iE = -1;
                    z15 = true;
                }
                z16 = v1Var.f18914e == 4;
                z17 = false;
            }
            z13 = z15;
            z11 = z16;
            z12 = z17;
        } else {
            j11 = -9223372036854775807L;
            if (v1Var.f18910a.u()) {
                iE = h2Var.e(z10);
            } else if (h2Var.f(obj) == -1) {
                Object objX0 = x0(dVar, bVar, i10, z10, obj, v1Var.f18910a, h2Var);
                if (objX0 == null) {
                    iE2 = h2Var.e(z10);
                    z14 = true;
                } else {
                    iE2 = h2Var.l(objX0, bVar).f17000c;
                    z14 = false;
                }
                iE = iE2;
                obj = obj;
                jLongValue = jLongValue;
                z12 = z14;
                z11 = false;
                z13 = false;
            } else if (jLongValue == C.TIME_UNSET) {
                iE = h2Var.l(obj, bVar).f17000c;
                obj = obj;
            } else if (zS) {
                v1Var.f18910a.l(bVar3.f51199a, bVar);
                if (v1Var.f18910a.r(bVar.f17000c, dVar).f17032o == v1Var.f18910a.f(bVar3.f51199a)) {
                    Pair pairN = h2Var.n(dVar, bVar, h2Var.l(obj, bVar).f17000c, bVar.q() + jLongValue);
                    obj = pairN.first;
                    jLongValue = ((Long) pairN.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = jLongValue;
                }
                iE = -1;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                obj = obj;
                iE = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (iE != -1) {
            h2Var2 = h2Var;
            Pair pairN2 = h2Var2.n(dVar, bVar, iE, C.TIME_UNSET);
            bVar2 = bVar;
            obj = pairN2.first;
            jLongValue = ((Long) pairN2.second).longValue();
            j10 = j11;
        } else {
            h2Var2 = h2Var;
            bVar2 = bVar;
            j10 = jLongValue;
        }
        com.google.android.exoplayer2.source.p.b bVarE = d1Var.E(h2Var2, obj, jLongValue);
        int i12 = bVarE.f51203e;
        boolean z19 = i12 == -1 || ((i11 = bVar3.f51203e) != -1 && i12 >= i11);
        if (bVar3.f51199a.equals(obj) && !bVar3.b() && !bVarE.b() && z19) {
            z18 = true;
        }
        com.google.android.exoplayer2.source.p.b bVar4 = bVarE;
        boolean zO = O(zS, bVar3, jLongValue, bVar4, h2Var2.l(obj, bVar2), j10);
        if (z18 || zO) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jLongValue = v1Var.f18927r;
            } else {
                h2Var2.l(bVar4.f51199a, bVar2);
                jLongValue = bVar4.f51201c == bVar2.n(bVar4.f51200b) ? bVar2.j() : 0L;
            }
        }
        return new g(bVar4, jLongValue, j10, z11, z12, z13);
    }

    private long w() {
        v1 v1Var = this.f18361x;
        return y(v1Var.f18910a, v1Var.f18911b.f51199a, v1Var.f18927r);
    }

    private static Pair w0(h2 h2Var, h hVar, boolean z10, int i10, boolean z11, h2.d dVar, h2.b bVar) {
        h2 h2Var2;
        Object objX0;
        h2 h2Var3 = hVar.f18386a;
        if (h2Var.u()) {
            return null;
        }
        if (h2Var3.u()) {
            h2Var2 = h2Var3;
            h2Var2 = h2Var;
        }
        try {
            h2Var2 = h2Var3;
            Pair pairN = h2Var2.n(dVar, bVar, hVar.f18387b, hVar.f18388c);
            h2 h2Var4 = h2Var2;
            if (h2Var.equals(h2Var4)) {
                return pairN;
            }
            if (h2Var.f(pairN.first) != -1) {
                return (h2Var4.l(pairN.first, bVar).f17003f && h2Var4.r(bVar.f17000c, dVar).f17032o == h2Var4.f(pairN.first)) ? h2Var.n(dVar, bVar, h2Var.l(pairN.first, bVar).f17000c, hVar.f18388c) : pairN;
            }
            if (z10 && (objX0 = x0(dVar, bVar, i10, z11, pairN.first, h2Var4, h2Var)) != null) {
                return h2Var.n(dVar, bVar, h2Var.l(objX0, bVar).f17000c, C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static v0[] x(lb.r rVar) {
        int length = rVar != null ? rVar.length() : 0;
        v0[] v0VarArr = new v0[length];
        for (int i10 = 0; i10 < length; i10++) {
            v0VarArr[i10] = rVar.getFormat(i10);
        }
        return v0VarArr;
    }

    static Object x0(h2.d dVar, h2.b bVar, int i10, boolean z10, Object obj, h2 h2Var, h2 h2Var2) {
        int iF = h2Var.f(obj);
        int iM = h2Var.m();
        int i11 = 0;
        int iH = iF;
        int iF2 = -1;
        while (i11 < iM && iF2 == -1) {
            h2.d dVar2 = dVar;
            h2.b bVar2 = bVar;
            int i12 = i10;
            boolean z11 = z10;
            h2 h2Var3 = h2Var;
            iH = h2Var3.h(iH, bVar2, dVar2, i12, z11);
            if (iH == -1) {
                break;
            }
            iF2 = h2Var2.f(h2Var3.q(iH));
            i11++;
            h2Var = h2Var3;
            bVar = bVar2;
            dVar = dVar2;
            i10 = i12;
            z10 = z11;
        }
        if (iF2 == -1) {
            return null;
        }
        return h2Var2.q(iF2);
    }

    private long y(h2 h2Var, Object obj, long j10) {
        h2Var.r(h2Var.l(obj, this.f18349l).f17000c, this.f18348k);
        h2.d dVar = this.f18348k;
        if (dVar.f17023f != C.TIME_UNSET && dVar.h()) {
            h2.d dVar2 = this.f18348k;
            if (dVar2.f17026i) {
                return ob.r0.H0(dVar2.c() - this.f18348k.f17023f) - (j10 + this.f18349l.q());
            }
        }
        return C.TIME_UNSET;
    }

    private void y0(long j10, long j11) {
        this.f18345h.sendEmptyMessageAtTime(2, j10 + j11);
    }

    private long z() {
        a1 a1VarS = this.f18356s.s();
        if (a1VarS == null) {
            return 0L;
        }
        long jL = a1VarS.l();
        if (!a1VarS.f16438d) {
            return jL;
        }
        int i10 = 0;
        while (true) {
            b2[] b2VarArr = this.f18338a;
            if (i10 >= b2VarArr.length) {
                return jL;
            }
            if (Q(b2VarArr[i10]) && this.f18338a[i10].getStream() == a1VarS.f16437c[i10]) {
                long jL2 = this.f18338a[i10].l();
                if (jL2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(jL2, jL);
            }
            i10++;
        }
    }

    public Looper B() {
        return this.f18347j;
    }

    public void M0(List list, int i10, long j10, com.google.android.exoplayer2.source.e0 e0Var) {
        this.f18345h.obtainMessage(17, new b(list, e0Var, i10, j10, null)).a();
    }

    public void O0(boolean z10) {
        this.f18345h.obtainMessage(23, z10 ? 1 : 0, 0).a();
    }

    public void Q0(boolean z10, int i10) {
        this.f18345h.obtainMessage(1, z10 ? 1 : 0, i10).a();
    }

    public void S0(w1 w1Var) {
        this.f18345h.obtainMessage(4, w1Var).a();
    }

    public void U0(int i10) {
        this.f18345h.obtainMessage(11, i10, 0).a();
    }

    public void W0(o9.j0 j0Var) {
        this.f18345h.obtainMessage(5, j0Var).a();
    }

    public void Y0(boolean z10) {
        this.f18345h.obtainMessage(12, z10 ? 1 : 0, 0).a();
    }

    @Override // lb.a0.a
    public void a(b2 b2Var) {
        this.f18345h.sendEmptyMessage(26);
    }

    @Override // com.google.android.exoplayer2.s1.d
    public void b() {
        this.f18345h.sendEmptyMessage(22);
    }

    @Override // com.google.android.exoplayer2.y1.a
    public synchronized void d(y1 y1Var) {
        if (!this.f18363z && this.f18347j.getThread().isAlive()) {
            this.f18345h.obtainMessage(14, y1Var).a();
            return;
        }
        ob.u.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        y1Var.k(false);
    }

    @Override // com.google.android.exoplayer2.source.d0.a
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void c(com.google.android.exoplayer2.source.o oVar) {
        this.f18345h.obtainMessage(9, oVar).a();
    }

    @Override // com.google.android.exoplayer2.source.o.a
    public void g(com.google.android.exoplayer2.source.o oVar) {
        this.f18345h.obtainMessage(8, oVar).a();
    }

    public void g0() {
        this.f18345h.obtainMessage(0).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i10;
        a1 a1VarS;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    h0();
                    break;
                case 1:
                    R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    p();
                    break;
                case 3:
                    B0((h) message.obj);
                    break;
                case 4:
                    T0((w1) message.obj);
                    break;
                case 5:
                    X0((o9.j0) message.obj);
                    break;
                case 6:
                    j1(false, true);
                    break;
                case 7:
                    j0();
                    return true;
                case 8:
                    I((com.google.android.exoplayer2.source.o) message.obj);
                    break;
                case 9:
                    E((com.google.android.exoplayer2.source.o) message.obj);
                    break;
                case 10:
                    n0();
                    break;
                case 11:
                    V0(message.arg1);
                    break;
                case 12:
                    Z0(message.arg1 != 0);
                    break;
                case 13:
                    J0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    E0((y1) message.obj);
                    break;
                case 15:
                    G0((y1) message.obj);
                    break;
                case 16:
                    K((w1) message.obj, false);
                    break;
                case 17:
                    L0((b) message.obj);
                    break;
                case 18:
                    k((b) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.session.b.a(message.obj);
                    b0(null);
                    break;
                case 20:
                    l0(message.arg1, message.arg2, (com.google.android.exoplayer2.source.e0) message.obj);
                    break;
                case 21:
                    a1((com.google.android.exoplayer2.source.e0) message.obj);
                    break;
                case 22:
                    a0();
                    break;
                case 23:
                    P0(message.arg1 != 0);
                    break;
                case 24:
                    N0(message.arg1 == 1);
                    break;
                case 25:
                    l();
                    break;
                case 26:
                    o0();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e10) {
            e = e10;
            if (e.f16410i == 1 && (a1VarS = this.f18356s.s()) != null) {
                e = e.e(a1VarS.f16440f.f16708a);
            }
            if (e.f16416o && this.O == null) {
                ob.u.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.O = e;
                ob.q qVar = this.f18345h;
                qVar.b(qVar.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.O;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.O;
                }
                ob.u.d("ExoPlayerImplInternal", "Playback error", e);
                if (e.f16410i == 1 && this.f18356s.r() != this.f18356s.s()) {
                    while (this.f18356s.r() != this.f18356s.s()) {
                        this.f18356s.b();
                    }
                    b1 b1Var = ((a1) ob.a.e(this.f18356s.r())).f16440f;
                    com.google.android.exoplayer2.source.p.b bVar = b1Var.f16708a;
                    long j10 = b1Var.f16709b;
                    this.f18361x = L(bVar, j10, b1Var.f16710c, j10, true, 0);
                }
                j1(true, false);
                this.f18361x = this.f18361x.f(e);
            }
        } catch (ParserException e11) {
            int i12 = e11.f16422b;
            if (i12 == 1) {
                i10 = e11.f16421a ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = e11.f16421a ? 3002 : 3004;
                }
                F(e11, i11);
            }
            i11 = i10;
            F(e11, i11);
        } catch (DrmSession.DrmSessionException e12) {
            F(e12, e12.f16837a);
        } catch (BehindLiveWindowException e13) {
            F(e13, 1002);
        } catch (DataSourceException e14) {
            F(e14, e14.f18731a);
        } catch (IOException e15) {
            F(e15, 2000);
        } catch (RuntimeException e16) {
            ExoPlaybackException exoPlaybackExceptionJ = ExoPlaybackException.j(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            ob.u.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionJ);
            j1(true, false);
            this.f18361x = this.f18361x.f(exoPlaybackExceptionJ);
        }
        U();
        return true;
    }

    public synchronized boolean i0() {
        if (!this.f18363z && this.f18347j.getThread().isAlive()) {
            this.f18345h.sendEmptyMessage(7);
            r1(new sc.x() { // from class: com.google.android.exoplayer2.s0
                @Override // sc.x
                public final Object get() {
                    return Boolean.valueOf(this.f17339a.f18363z);
                }
            }, this.f18359v);
            return this.f18363z;
        }
        return true;
    }

    public void i1() {
        this.f18345h.obtainMessage(6).a();
    }

    @Override // com.google.android.exoplayer2.i.a
    public void n(w1 w1Var) {
        this.f18345h.obtainMessage(16, w1Var).a();
    }

    @Override // lb.a0.a
    public void onTrackSelectionsInvalidated() {
        this.f18345h.sendEmptyMessage(10);
    }

    public void u(long j10) {
        this.P = j10;
    }

    public void z0(h2 h2Var, int i10, long j10) {
        this.f18345h.obtainMessage(3, new h(h2Var, i10, j10)).a();
    }
}
