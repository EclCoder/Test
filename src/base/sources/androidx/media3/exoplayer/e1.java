package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e1 implements Handler.Callback, androidx.media3.exoplayer.source.q.a, k2.v.a, b2.d, m.a, d2.a {
    private static final long X = w1.c0.c1(10000);
    private e A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private h N;
    private long O;
    private long P;
    private int Q;
    private boolean R;
    private ExoPlaybackException S;
    private long T;
    private o.c V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f2[] f5276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f5277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g2[] f5278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2.v f5279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k2.w f5280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h1 f5281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l2.d f5282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w1.j f5283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HandlerThread f5284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f5285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t1.a0.c f5286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t1.a0.b f5287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f5288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f5289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m f5290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList f5291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final w1.d f5292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f5293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final n1 f5294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b2 f5295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final g1 f5296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f5297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c2.x1 f5298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f5299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j2 f5300y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private c2 f5301z;
    private long U = C.TIME_UNSET;
    private long F = C.TIME_UNSET;
    private t1.a0 W = t1.a0.f52510a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements f2.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.f2.a
        public void a() {
            e1.this.K = true;
        }

        @Override // androidx.media3.exoplayer.f2.a
        public void b() {
            if (e1.this.f5299x || e1.this.L) {
                e1.this.f5283h.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f5303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i2.r f5304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f5306d;

        /* synthetic */ b(List list, i2.r rVar, int i10, long j10, a aVar) {
            this(list, rVar, i10, j10);
        }

        private b(List list, i2.r rVar, int i10, long j10) {
            this.f5303a = list;
            this.f5304b = rVar;
            this.f5305c = i10;
            this.f5306d = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d2 f5307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f5309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5310d;

        public d(d2 d2Var) {
            this.f5307a = d2Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f5310d;
            if ((obj == null) != (dVar.f5310d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f5308b - dVar.f5308b;
            return i10 != 0 ? i10 : w1.c0.m(this.f5309c, dVar.f5309c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f5308b = i10;
            this.f5309c = j10;
            this.f5310d = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c2 f5312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5315e;

        public e(c2 c2Var) {
            this.f5312b = c2Var;
        }

        public void b(int i10) {
            this.f5311a |= i10 > 0;
            this.f5313c += i10;
        }

        public void c(c2 c2Var) {
            this.f5311a |= this.f5312b != c2Var;
            this.f5312b = c2Var;
        }

        public void d(int i10) {
            if (this.f5314d && this.f5315e != 5) {
                w1.a.a(i10 == 5);
                return;
            }
            this.f5311a = true;
            this.f5314d = true;
            this.f5315e = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.b f5316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f5319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f5320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5321f;

        public g(androidx.media3.exoplayer.source.r.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f5316a = bVar;
            this.f5317b = j10;
            this.f5318c = j11;
            this.f5319d = z10;
            this.f5320e = z11;
            this.f5321f = z12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t1.a0 f5322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5324c;

        public h(t1.a0 a0Var, int i10, long j10) {
            this.f5322a = a0Var;
            this.f5323b = i10;
            this.f5324c = j10;
        }
    }

    public e1(f2[] f2VarArr, k2.v vVar, k2.w wVar, h1 h1Var, l2.d dVar, int i10, boolean z10, c2.a aVar, j2 j2Var, g1 g1Var, long j10, boolean z11, boolean z12, Looper looper, w1.d dVar2, f fVar, c2.x1 x1Var, Looper looper2, o.c cVar) {
        this.f5293r = fVar;
        this.f5276a = f2VarArr;
        this.f5279d = vVar;
        this.f5280e = wVar;
        this.f5281f = h1Var;
        this.f5282g = dVar;
        this.H = i10;
        this.I = z10;
        this.f5300y = j2Var;
        this.f5296u = g1Var;
        this.f5297v = j10;
        this.T = j10;
        this.C = z11;
        this.f5299x = z12;
        this.f5292q = dVar2;
        this.f5298w = x1Var;
        this.V = cVar;
        this.f5288m = h1Var.d(x1Var);
        this.f5289n = h1Var.b(x1Var);
        c2 c2VarK = c2.k(wVar);
        this.f5301z = c2VarK;
        this.A = new e(c2VarK);
        this.f5278c = new g2[f2VarArr.length];
        g2.a aVarC = vVar.c();
        for (int i11 = 0; i11 < f2VarArr.length; i11++) {
            f2VarArr[i11].t(i11, x1Var, dVar2);
            this.f5278c[i11] = f2VarArr[i11].getCapabilities();
            if (aVarC != null) {
                this.f5278c[i11].y(aVarC);
            }
        }
        this.f5290o = new m(this, dVar2);
        this.f5291p = new ArrayList();
        this.f5277b = com.google.common.collect.g1.i();
        this.f5286k = new t1.a0.c();
        this.f5287l = new t1.a0.b();
        vVar.d(this, dVar);
        this.R = true;
        w1.j jVarCreateHandler = dVar2.createHandler(looper, null);
        this.f5294s = new n1(aVar, jVarCreateHandler, new k1.a() { // from class: androidx.media3.exoplayer.d1
            @Override // androidx.media3.exoplayer.k1.a
            public final k1 a(l1 l1Var, long j11) {
                return this.f5146a.p(l1Var, j11);
            }
        }, cVar);
        this.f5295t = new b2(this, aVar, jVarCreateHandler, x1Var);
        if (looper2 != null) {
            this.f5284i = null;
            this.f5285j = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f5284i = handlerThread;
            handlerThread.start();
            this.f5285j = handlerThread.getLooper();
        }
        this.f5283h = dVar2.createHandler(this.f5285j, this);
    }

    private static t1.o[] A(k2.q qVar) {
        int length = qVar != null ? qVar.length() : 0;
        t1.o[] oVarArr = new t1.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = qVar.getFormat(i10);
        }
        return oVarArr;
    }

    private void A0(t1.a0 a0Var, t1.a0 a0Var2) {
        if (a0Var.q() && a0Var2.q()) {
            return;
        }
        int size = this.f5291p.size() - 1;
        while (size >= 0) {
            t1.a0 a0Var3 = a0Var;
            t1.a0 a0Var4 = a0Var2;
            if (!z0((d) this.f5291p.get(size), a0Var3, a0Var4, this.H, this.I, this.f5286k, this.f5287l)) {
                ((d) this.f5291p.get(size)).f5307a.k(false);
                this.f5291p.remove(size);
            }
            size--;
            a0Var = a0Var3;
            a0Var2 = a0Var4;
        }
        Collections.sort(this.f5291p);
    }

    private long B(t1.a0 a0Var, Object obj, long j10) {
        a0Var.n(a0Var.h(obj, this.f5287l).f52521c, this.f5286k);
        t1.a0.c cVar = this.f5286k;
        if (cVar.f52541f != C.TIME_UNSET && cVar.f()) {
            t1.a0.c cVar2 = this.f5286k;
            if (cVar2.f52544i) {
                return w1.c0.E0(cVar2.a() - this.f5286k.f52541f) - (j10 + this.f5287l.n());
            }
        }
        return C.TIME_UNSET;
    }

    private static g B0(t1.a0 a0Var, c2 c2Var, h hVar, n1 n1Var, int i10, boolean z10, t1.a0.c cVar, t1.a0.b bVar) {
        int i11;
        long j10;
        int iA;
        long jLongValue;
        boolean z11;
        boolean z12;
        boolean z13;
        int iA2;
        boolean z14;
        t1.a0 a0Var2;
        t1.a0.b bVar2;
        long j11;
        int i12;
        long jLongValue2;
        int iA3;
        boolean z15;
        boolean z16;
        boolean z17;
        if (a0Var.q()) {
            return new g(c2.l(), 0L, C.TIME_UNSET, false, true, false);
        }
        androidx.media3.exoplayer.source.r.b bVar3 = c2Var.f5126b;
        Object obj = bVar3.f6055a;
        boolean zV = V(c2Var, bVar);
        long jG = (c2Var.f5126b.b() || zV) ? c2Var.f5127c : c2Var.f5143s;
        if (hVar != null) {
            i11 = -1;
            j10 = C.TIME_UNSET;
            Pair pairC0 = C0(a0Var, hVar, true, i10, z10, cVar, bVar);
            if (pairC0 == null) {
                iA3 = a0Var.a(z10);
                jLongValue2 = jG;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f5324c == C.TIME_UNSET) {
                    iA3 = a0Var.h(pairC0.first, bVar).f52521c;
                    jLongValue2 = jG;
                    z15 = false;
                } else {
                    obj = pairC0.first;
                    jLongValue2 = ((Long) pairC0.second).longValue();
                    iA3 = -1;
                    z15 = true;
                }
                z16 = c2Var.f5129e == 4;
                z17 = false;
            }
            iA = iA3;
            jG = jLongValue2;
            z13 = z15;
            z11 = z16;
            z12 = z17;
        } else {
            i11 = -1;
            j10 = C.TIME_UNSET;
            if (c2Var.f5125a.q()) {
                iA = a0Var.a(z10);
            } else if (a0Var.b(obj) == -1) {
                int iD0 = D0(cVar, bVar, i10, z10, obj, c2Var.f5125a, a0Var);
                if (iD0 == -1) {
                    iA2 = a0Var.a(z10);
                    z14 = true;
                } else {
                    iA2 = iD0;
                    z14 = false;
                }
                iA = iA2;
                obj = obj;
                jG = jG;
                z12 = z14;
                z11 = false;
                z13 = false;
            } else if (jG == C.TIME_UNSET) {
                iA = a0Var.h(obj, bVar).f52521c;
                obj = obj;
            } else if (zV) {
                c2Var.f5125a.h(bVar3.f6055a, bVar);
                if (c2Var.f5125a.n(bVar.f52521c, cVar).f52549n == c2Var.f5125a.b(bVar3.f6055a)) {
                    Pair pairJ = a0Var.j(cVar, bVar, a0Var.h(obj, bVar).f52521c, bVar.n() + jG);
                    obj = pairJ.first;
                    jLongValue = ((Long) pairJ.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = jG;
                }
                jG = jLongValue;
                iA = -1;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                obj = obj;
                iA = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (iA != i11) {
            bVar2 = bVar;
            Pair pairJ2 = a0Var.j(cVar, bVar2, iA, C.TIME_UNSET);
            a0Var2 = a0Var;
            obj = pairJ2.first;
            jG = ((Long) pairJ2.second).longValue();
            j11 = j10;
        } else {
            a0Var2 = a0Var;
            bVar2 = bVar;
            j11 = jG;
        }
        androidx.media3.exoplayer.source.r.b bVarK = n1Var.K(a0Var2, obj, jG);
        int i13 = bVarK.f6059e;
        boolean z18 = bVar3.f6055a.equals(obj) && !bVar3.b() && !bVarK.b() && (i13 == i11 || ((i12 = bVar3.f6059e) != i11 && i13 >= i12));
        long j12 = j11;
        androidx.media3.exoplayer.source.r.b bVar4 = bVarK;
        boolean zR = R(zV, bVar3, jG, bVar4, a0Var2.h(obj, bVar2), j12);
        if (z18 || zR) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jG = c2Var.f5143s;
            } else {
                a0Var2.h(bVar4.f6055a, bVar2);
                jG = bVar4.f6057c == bVar2.k(bVar4.f6056b) ? bVar2.g() : 0L;
            }
        }
        return new g(bVar4, jG, j12, z11, z12, z13);
    }

    private long C() {
        k1 k1VarU = this.f5294s.u();
        if (k1VarU == null) {
            return 0L;
        }
        long jM = k1VarU.m();
        if (!k1VarU.f5444d) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            f2[] f2VarArr = this.f5276a;
            if (i10 >= f2VarArr.length) {
                return jM;
            }
            if (T(f2VarArr[i10]) && this.f5276a[i10].getStream() == k1VarU.f5443c[i10]) {
                long jL = this.f5276a[i10].l();
                if (jL == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jL, jM);
            }
            i10++;
        }
    }

    private static Pair C0(t1.a0 a0Var, h hVar, boolean z10, int i10, boolean z11, t1.a0.c cVar, t1.a0.b bVar) {
        t1.a0 a0Var2;
        int iD0;
        t1.a0 a0Var3 = hVar.f5322a;
        if (a0Var.q()) {
            return null;
        }
        if (a0Var3.q()) {
            a0Var2 = a0Var3;
            a0Var2 = a0Var;
        }
        try {
            a0Var2 = a0Var3;
            Pair pairJ = a0Var2.j(cVar, bVar, hVar.f5323b, hVar.f5324c);
            t1.a0 a0Var4 = a0Var2;
            if (a0Var.equals(a0Var4)) {
                return pairJ;
            }
            if (a0Var.b(pairJ.first) != -1) {
                return (a0Var4.h(pairJ.first, bVar).f52524f && a0Var4.n(bVar.f52521c, cVar).f52549n == a0Var4.b(pairJ.first)) ? a0Var.j(cVar, bVar, a0Var.h(pairJ.first, bVar).f52521c, hVar.f5324c) : pairJ;
            }
            if (z10 && (iD0 = D0(cVar, bVar, i10, z11, pairJ.first, a0Var4, a0Var)) != -1) {
                return a0Var.j(cVar, bVar, iD0, C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private Pair D(t1.a0 a0Var) {
        if (a0Var.q()) {
            return Pair.create(c2.l(), 0L);
        }
        Pair pairJ = a0Var.j(this.f5286k, this.f5287l, a0Var.a(this.I), C.TIME_UNSET);
        androidx.media3.exoplayer.source.r.b bVarK = this.f5294s.K(a0Var, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (bVarK.b()) {
            a0Var.h(bVarK.f6055a, this.f5287l);
            jLongValue = bVarK.f6057c == this.f5287l.k(bVarK.f6056b) ? this.f5287l.g() : 0L;
        }
        return Pair.create(bVarK, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    static int D0(t1.a0.c cVar, t1.a0.b bVar, int i10, boolean z10, Object obj, t1.a0 a0Var, t1.a0 a0Var2) {
        t1.a0.b bVar2;
        Object obj2 = a0Var.n(a0Var.h(obj, bVar).f52521c, cVar).f52536a;
        int i11 = 0;
        for (int i12 = 0; i12 < a0Var2.p(); i12++) {
            if (a0Var2.n(i12, cVar).f52536a.equals(obj2)) {
                return i12;
            }
        }
        int iB = a0Var.b(obj);
        int i13 = a0Var.i();
        int iD = iB;
        int iB2 = -1;
        while (i11 < i13 && iB2 == -1) {
            t1.a0.c cVar2 = cVar;
            bVar2 = bVar;
            int i14 = i10;
            boolean z11 = z10;
            t1.a0 a0Var3 = a0Var;
            iD = a0Var3.d(iD, bVar2, cVar2, i14, z11);
            if (iD == -1) {
                if (iB2 == -1) {
                    return -1;
                }
                return a0Var2.f(iB2, bVar2).f52521c;
            }
            iB2 = a0Var2.b(a0Var3.m(iD));
            i11++;
            a0Var = a0Var3;
            bVar = bVar2;
            cVar = cVar2;
            i10 = i14;
            z10 = z11;
        }
        bVar2 = bVar;
        if (iB2 == -1) {
            return -1;
        }
        return a0Var2.f(iB2, bVar2).f52521c;
    }

    private void E0(long j10) {
        long jMin = (this.f5301z.f5129e != 3 || (!this.f5299x && g1())) ? X : 1000L;
        if (this.f5299x && g1()) {
            for (f2 f2Var : this.f5276a) {
                if (T(f2Var)) {
                    jMin = Math.min(jMin, w1.c0.c1(f2Var.w(this.O, this.P)));
                }
            }
        }
        this.f5283h.sendEmptyMessageAtTime(2, j10 + jMin);
    }

    private long F() {
        return G(this.f5301z.f5141q);
    }

    private long G(long j10) {
        k1 k1VarM = this.f5294s.m();
        if (k1VarM == null) {
            return 0L;
        }
        return Math.max(0L, j10 - k1VarM.A(this.O));
    }

    private void G0(boolean z10) throws ExoPlaybackException {
        androidx.media3.exoplayer.source.r.b bVar = this.f5294s.t().f5446f.f5477a;
        long jJ0 = J0(bVar, this.f5301z.f5143s, true, false);
        if (jJ0 != this.f5301z.f5143s) {
            c2 c2Var = this.f5301z;
            this.f5301z = O(bVar, jJ0, c2Var.f5127c, c2Var.f5128d, z10, 5);
        }
    }

    private void H(androidx.media3.exoplayer.source.q qVar) {
        if (this.f5294s.B(qVar)) {
            this.f5294s.E(this.O);
            W();
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
    private void H0(h hVar) throws Throwable {
        long jLongValue;
        androidx.media3.exoplayer.source.r.b bVarK;
        long j10;
        boolean z10;
        long j11;
        androidx.media3.exoplayer.source.r.b bVar;
        long j12;
        androidx.media3.exoplayer.source.r.b bVar2;
        k1 k1VarT;
        long jC;
        c2 c2Var;
        int i10;
        int i11;
        long j13;
        androidx.media3.exoplayer.source.r.b bVar3;
        long j14;
        boolean z11;
        long jI0;
        androidx.media3.exoplayer.source.r.b bVar4;
        long j15;
        e1 e1Var = this;
        e1Var.A.b(1);
        Pair pairC0 = C0(e1Var.f5301z.f5125a, hVar, true, e1Var.H, e1Var.I, e1Var.f5286k, e1Var.f5287l);
        try {
            if (pairC0 != null) {
                Object obj = pairC0.first;
                jLongValue = ((Long) pairC0.second).longValue();
                long j16 = hVar.f5324c == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
                bVarK = e1Var.f5294s.K(e1Var.f5301z.f5125a, obj, jLongValue);
                if (bVarK.b()) {
                    e1Var.f5301z.f5125a.h(bVarK.f6055a, e1Var.f5287l);
                    jLongValue = e1Var.f5287l.k(bVarK.f6056b) == bVarK.f6057c ? e1Var.f5287l.g() : 0L;
                    z10 = true;
                    j11 = j16;
                } else {
                    j10 = 0;
                    z10 = hVar.f5324c == C.TIME_UNSET;
                    j11 = j16;
                }
                if (e1Var.f5301z.f5125a.q()) {
                    if (pairC0 == null) {
                        if (e1Var.f5301z.f5129e != 1) {
                            e1Var.d1(4);
                        }
                        e1Var.v0(false, true, false, true);
                    } else {
                        if (bVarK.equals(e1Var.f5301z.f5126b)) {
                            try {
                                k1VarT = e1Var.f5294s.t();
                                if (k1VarT == null && k1VarT.f5444d && jLongValue != j10) {
                                    jC = k1VarT.f5441a.c(jLongValue, e1Var.f5300y);
                                } else {
                                    jC = jLongValue;
                                }
                                bVar2 = bVarK;
                                try {
                                    if (w1.c0.c1(jC) != w1.c0.c1(e1Var.f5301z.f5143s) && ((i10 = (c2Var = e1Var.f5301z).f5129e) == 2 || i10 == 3)) {
                                        long j17 = c2Var.f5143s;
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
                                    e1Var.f5301z = e1Var.O(bVar, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z10 = z10;
                                bVar2 = bVarK;
                            }
                        } else {
                            bVar2 = bVarK;
                            jC = jLongValue;
                        }
                        try {
                            if (e1Var.f5301z.f5129e == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            jI0 = e1Var.I0(bVar2, jC, z11);
                            z10 |= jLongValue != jI0;
                            try {
                                c2 c2Var2 = e1Var.f5301z;
                                t1.a0 a0Var = c2Var2.f5125a;
                                bVar4 = bVar2;
                                j15 = j11;
                                try {
                                    e1Var.s1(a0Var, bVar4, a0Var, c2Var2.f5126b, j15, true);
                                    bVar3 = bVar4;
                                    j11 = j15;
                                    j14 = jI0;
                                    i11 = 2;
                                    j13 = j14;
                                    e1Var = this;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar = bVar4;
                                    j11 = j15;
                                    j12 = jI0;
                                    e1Var.f5301z = e1Var.O(bVar, j12, j11, j12, z10, 2);
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
                            e1Var.f5301z = e1Var.O(bVar, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    }
                    e1Var.f5301z = e1Var.O(bVar3, j14, j11, j13, z10, i11);
                    return;
                }
                e1Var.N = hVar;
                z10 = z10;
                bVar3 = bVarK;
                j14 = jLongValue;
                i11 = 2;
                j13 = j14;
                e1Var = this;
                e1Var.f5301z = e1Var.O(bVar3, j14, j11, j13, z10, i11);
                return;
            }
            Pair pairD = e1Var.D(e1Var.f5301z.f5125a);
            bVarK = (androidx.media3.exoplayer.source.r.b) pairD.first;
            jLongValue = ((Long) pairD.second).longValue();
            z10 = !e1Var.f5301z.f5125a.q();
            j11 = -9223372036854775807L;
            if (e1Var.f5301z.f5125a.q()) {
                if (pairC0 == null) {
                    if (e1Var.f5301z.f5129e != 1) {
                        e1Var.d1(4);
                    }
                    e1Var.v0(false, true, false, true);
                } else {
                    if (bVarK.equals(e1Var.f5301z.f5126b)) {
                        k1VarT = e1Var.f5294s.t();
                        if (k1VarT == null) {
                            jC = jLongValue;
                        } else {
                            jC = jLongValue;
                        }
                        bVar2 = bVarK;
                        if (w1.c0.c1(jC) != w1.c0.c1(e1Var.f5301z.f5143s)) {
                        }
                    } else {
                        bVar2 = bVarK;
                        jC = jLongValue;
                    }
                    if (e1Var.f5301z.f5129e == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jI0 = e1Var.I0(bVar2, jC, z11);
                    z10 |= jLongValue != jI0;
                    c2 c2Var3 = e1Var.f5301z;
                    t1.a0 a0Var2 = c2Var3.f5125a;
                    bVar4 = bVar2;
                    j15 = j11;
                    e1Var.s1(a0Var2, bVar4, a0Var2, c2Var3.f5126b, j15, true);
                    bVar3 = bVar4;
                    j11 = j15;
                    j14 = jI0;
                    i11 = 2;
                    j13 = j14;
                    e1Var = this;
                }
                e1Var.f5301z = e1Var.O(bVar3, j14, j11, j13, z10, i11);
                return;
            }
            e1Var.N = hVar;
            z10 = z10;
            bVar3 = bVarK;
            j14 = jLongValue;
            i11 = 2;
            j13 = j14;
            e1Var = this;
            e1Var.f5301z = e1Var.O(bVar3, j14, j11, j13, z10, i11);
            return;
        } catch (Throwable th7) {
            th = th7;
            z10 = z10;
            bVar = bVarK;
        }
        j10 = 0;
    }

    private void I(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackExceptionI = ExoPlaybackException.i(iOException, i10);
        k1 k1VarT = this.f5294s.t();
        if (k1VarT != null) {
            exoPlaybackExceptionI = exoPlaybackExceptionI.g(k1VarT.f5446f.f5477a);
        }
        w1.n.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionI);
        l1(false, false);
        this.f5301z = this.f5301z.f(exoPlaybackExceptionI);
    }

    private long I0(androidx.media3.exoplayer.source.r.b bVar, long j10, boolean z10) {
        return J0(bVar, j10, this.f5294s.t() != this.f5294s.u(), z10);
    }

    private void J(boolean z10) {
        k1 k1VarM = this.f5294s.m();
        androidx.media3.exoplayer.source.r.b bVar = k1VarM == null ? this.f5301z.f5126b : k1VarM.f5446f.f5477a;
        boolean zEquals = this.f5301z.f5135k.equals(bVar);
        if (!zEquals) {
            this.f5301z = this.f5301z.c(bVar);
        }
        c2 c2Var = this.f5301z;
        c2Var.f5141q = k1VarM == null ? c2Var.f5143s : k1VarM.j();
        this.f5301z.f5142r = F();
        if ((!zEquals || z10) && k1VarM != null && k1VarM.f5444d) {
            o1(k1VarM.f5446f.f5477a, k1VarM.o(), k1VarM.p());
        }
    }

    private long J0(androidx.media3.exoplayer.source.r.b bVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        m1();
        t1(false, true);
        if (z11 || this.f5301z.f5129e == 3) {
            d1(2);
        }
        k1 k1VarT = this.f5294s.t();
        k1 k1VarK = k1VarT;
        while (k1VarK != null && !bVar.equals(k1VarK.f5446f.f5477a)) {
            k1VarK = k1VarK.k();
        }
        if (z10 || k1VarT != k1VarK || (k1VarK != null && k1VarK.B(j10) < 0)) {
            for (f2 f2Var : this.f5276a) {
                r(f2Var);
            }
            if (k1VarK != null) {
                while (this.f5294s.t() != k1VarK) {
                    this.f5294s.b();
                }
                this.f5294s.H(k1VarK);
                k1VarK.z(1000000000000L);
                u();
            }
        }
        if (k1VarK != null) {
            this.f5294s.H(k1VarK);
            if (!k1VarK.f5444d) {
                k1VarK.f5446f = k1VarK.f5446f.b(j10);
            } else if (k1VarK.f5445e) {
                j10 = k1VarK.f5441a.seekToUs(j10);
                k1VarK.f5441a.discardBuffer(j10 - this.f5288m, this.f5289n);
            }
            x0(j10);
            W();
        } else {
            this.f5294s.f();
            x0(j10);
        }
        J(false);
        this.f5283h.sendEmptyMessage(2);
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x0153  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x018f  */
    private void K(t1.a0 a0Var, boolean z10) throws Throwable {
        int i10;
        t1.a0 a0Var2;
        long j10;
        Object obj;
        boolean z11;
        int i11;
        a0Var = a0Var;
        g gVarB0 = B0(a0Var, this.f5301z, this.N, this.f5294s, this.H, this.I, this.f5286k, this.f5287l);
        androidx.media3.exoplayer.source.r.b bVar = gVarB0.f5316a;
        long j11 = gVarB0.f5318c;
        boolean z12 = gVarB0.f5319d;
        long jI0 = gVarB0.f5317b;
        int i12 = 1;
        boolean z13 = (this.f5301z.f5126b.equals(bVar) && jI0 == this.f5301z.f5143s) ? false : true;
        try {
            if (gVarB0.f5320e) {
                if (this.f5301z.f5129e != 1) {
                    d1(4);
                }
                v0(false, false, false, true);
            }
            for (f2 f2Var : this.f5276a) {
                f2Var.p(a0Var);
            }
            try {
                if (z13) {
                    i10 = 4;
                    i12 = -1;
                    if (!a0Var.q()) {
                        for (k1 k1VarT = this.f5294s.t(); k1VarT != null; k1VarT = k1VarT.k()) {
                            if (k1VarT.f5446f.f5477a.equals(bVar)) {
                                k1VarT.f5446f = this.f5294s.v(a0Var, k1VarT.f5446f);
                                k1VarT.C();
                            }
                        }
                        jI0 = I0(bVar, jI0, z12);
                    }
                } else {
                    try {
                        try {
                            i10 = 4;
                            i12 = -1;
                            try {
                                a0Var = a0Var;
                                if (!this.f5294s.Q(a0Var, this.O, C())) {
                                    G0(false);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                a0Var = a0Var;
                                a0Var2 = a0Var;
                                c2 c2Var = this.f5301z;
                                t1.a0 a0Var3 = c2Var.f5125a;
                                androidx.media3.exoplayer.source.r.b bVar2 = c2Var.f5126b;
                                if (gVarB0.f5321f) {
                                    j10 = jI0;
                                } else {
                                    j10 = -9223372036854775807L;
                                }
                                s1(a0Var2, bVar, a0Var3, bVar2, j10, false);
                                if (z13 || j11 != this.f5301z.f5127c) {
                                    c2 c2Var2 = this.f5301z;
                                    obj = c2Var2.f5126b.f6055a;
                                    t1.a0 a0Var4 = c2Var2.f5125a;
                                    if (z13 || !z10 || a0Var4.q() || a0Var4.h(obj, this.f5287l).f52524f) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    long j12 = this.f5301z.f5128d;
                                    if (a0Var2.b(obj) == i12) {
                                        i11 = i10;
                                    } else {
                                        i11 = 3;
                                    }
                                    this.f5301z = O(bVar, jI0, j11, j12, z11, i11);
                                }
                                w0();
                                A0(a0Var2, this.f5301z.f5125a);
                                this.f5301z = this.f5301z.j(a0Var2);
                                if (!a0Var2.q()) {
                                    this.N = null;
                                }
                                J(false);
                                this.f5283h.sendEmptyMessage(2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i10 = 4;
                            i12 = -1;
                            a0Var2 = a0Var;
                            c2 c2Var3 = this.f5301z;
                            t1.a0 a0Var5 = c2Var3.f5125a;
                            androidx.media3.exoplayer.source.r.b bVar3 = c2Var3.f5126b;
                            if (gVarB0.f5321f) {
                                j10 = jI0;
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            s1(a0Var2, bVar, a0Var5, bVar3, j10, false);
                            if (z13) {
                                c2 c2Var4 = this.f5301z;
                                obj = c2Var4.f5126b.f6055a;
                                t1.a0 a0Var6 = c2Var4.f5125a;
                                if (z13) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                long j13 = this.f5301z.f5128d;
                                if (a0Var2.b(obj) == i12) {
                                    i11 = i10;
                                } else {
                                    i11 = 3;
                                }
                                this.f5301z = O(bVar, jI0, j11, j13, z11, i11);
                            } else {
                                c2 c2Var5 = this.f5301z;
                                obj = c2Var5.f5126b.f6055a;
                                t1.a0 a0Var7 = c2Var5.f5125a;
                                if (z13) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                long j14 = this.f5301z.f5128d;
                                if (a0Var2.b(obj) == i12) {
                                    i11 = i10;
                                } else {
                                    i11 = 3;
                                }
                                this.f5301z = O(bVar, jI0, j11, j14, z11, i11);
                            }
                            w0();
                            A0(a0Var2, this.f5301z.f5125a);
                            this.f5301z = this.f5301z.j(a0Var2);
                            if (!a0Var2.q()) {
                                this.N = null;
                            }
                            J(false);
                            this.f5283h.sendEmptyMessage(2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i10 = 4;
                    }
                }
                c2 c2Var6 = this.f5301z;
                s1(a0Var, bVar, c2Var6.f5125a, c2Var6.f5126b, gVarB0.f5321f ? jI0 : -9223372036854775807L, false);
                if (z13 || j11 != this.f5301z.f5127c) {
                    c2 c2Var7 = this.f5301z;
                    Object obj2 = c2Var7.f5126b.f6055a;
                    t1.a0 a0Var8 = c2Var7.f5125a;
                    this.f5301z = O(bVar, jI0, j11, this.f5301z.f5128d, z13 && z10 && !a0Var8.q() && !a0Var8.h(obj2, this.f5287l).f52524f, a0Var.b(obj2) == i12 ? i10 : 3);
                }
                w0();
                A0(a0Var, this.f5301z.f5125a);
                this.f5301z = this.f5301z.j(a0Var);
                if (!a0Var.q()) {
                    this.N = null;
                }
                J(false);
                this.f5283h.sendEmptyMessage(2);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            i10 = 4;
            i12 = -1;
        }
    }

    private void K0(d2 d2Var) {
        if (d2Var.f() == C.TIME_UNSET) {
            L0(d2Var);
            return;
        }
        if (this.f5301z.f5125a.q()) {
            this.f5291p.add(new d(d2Var));
            return;
        }
        d dVar = new d(d2Var);
        t1.a0 a0Var = this.f5301z.f5125a;
        if (!z0(dVar, a0Var, a0Var, this.H, this.I, this.f5286k, this.f5287l)) {
            d2Var.k(false);
        } else {
            this.f5291p.add(dVar);
            Collections.sort(this.f5291p);
        }
    }

    private void L(androidx.media3.exoplayer.source.q qVar) throws ExoPlaybackException {
        if (this.f5294s.B(qVar)) {
            k1 k1VarM = this.f5294s.m();
            k1VarM.q(this.f5290o.getPlaybackParameters().f53030a, this.f5301z.f5125a);
            o1(k1VarM.f5446f.f5477a, k1VarM.o(), k1VarM.p());
            if (k1VarM == this.f5294s.t()) {
                x0(k1VarM.f5446f.f5478b);
                u();
                c2 c2Var = this.f5301z;
                androidx.media3.exoplayer.source.r.b bVar = c2Var.f5126b;
                long j10 = k1VarM.f5446f.f5478b;
                this.f5301z = O(bVar, j10, c2Var.f5127c, j10, false, 5);
            }
            W();
        }
    }

    private void L0(d2 d2Var) {
        if (d2Var.c() != this.f5285j) {
            this.f5283h.obtainMessage(15, d2Var).a();
            return;
        }
        q(d2Var);
        int i10 = this.f5301z.f5129e;
        if (i10 == 3 || i10 == 2) {
            this.f5283h.sendEmptyMessage(2);
        }
    }

    private void M(t1.w wVar, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.A.b(1);
            }
            this.f5301z = this.f5301z.g(wVar);
        }
        u1(wVar.f53030a);
        for (f2 f2Var : this.f5276a) {
            if (f2Var != null) {
                f2Var.k(f10, wVar.f53030a);
            }
        }
    }

    private void M0(final d2 d2Var) {
        Looper looperC = d2Var.c();
        if (looperC.getThread().isAlive()) {
            this.f5292q.createHandler(looperC, null).post(new Runnable() { // from class: androidx.media3.exoplayer.c1
                @Override // java.lang.Runnable
                public final void run() {
                    e1.g(this.f5122a, d2Var);
                }
            });
        } else {
            w1.n.h("TAG", "Trying to send message on a dead thread.");
            d2Var.k(false);
        }
    }

    private void N(t1.w wVar, boolean z10) {
        M(wVar, wVar.f53030a, true, z10);
    }

    private void N0(long j10) {
        for (f2 f2Var : this.f5276a) {
            if (f2Var.getStream() != null) {
                O0(f2Var, j10);
            }
        }
    }

    private c2 O(androidx.media3.exoplayer.source.r.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        i2.v vVar;
        k2.w wVar;
        this.R = (!this.R && j10 == this.f5301z.f5143s && bVar.equals(this.f5301z.f5126b)) ? false : true;
        w0();
        c2 c2Var = this.f5301z;
        i2.v vVar2 = c2Var.f5132h;
        k2.w wVar2 = c2Var.f5133i;
        List listC = c2Var.f5134j;
        if (this.f5295t.t()) {
            k1 k1VarT = this.f5294s.t();
            i2.v vVarO = k1VarT == null ? i2.v.f40816d : k1VarT.o();
            k2.w wVarP = k1VarT == null ? this.f5280e : k1VarT.p();
            com.google.common.collect.c0 c0VarY = y(wVarP.f42968c);
            if (k1VarT != null) {
                l1 l1Var = k1VarT.f5446f;
                if (l1Var.f5479c != j11) {
                    k1VarT.f5446f = l1Var.a(j11);
                }
            }
            a0();
            vVar = vVarO;
            wVar = wVarP;
            list = c0VarY;
        } else {
            if (!bVar.equals(this.f5301z.f5126b)) {
                vVar2 = i2.v.f40816d;
                wVar2 = this.f5280e;
                listC = com.google.common.collect.c0.C();
            }
            list = listC;
            vVar = vVar2;
            wVar = wVar2;
        }
        if (z10) {
            this.A.d(i10);
        }
        return this.f5301z.d(bVar, j10, j11, j12, F(), vVar, wVar, list);
    }

    private void O0(f2 f2Var, long j10) {
        f2Var.setCurrentStreamFinal();
        if (f2Var instanceof j2.i) {
            ((j2.i) f2Var).o0(j10);
        }
    }

    private boolean P(f2 f2Var, k1 k1Var) {
        k1 k1VarK = k1Var.k();
        if (k1Var.f5446f.f5482f && k1VarK.f5444d) {
            return (f2Var instanceof j2.i) || (f2Var instanceof h2.c) || f2Var.l() >= k1VarK.n();
        }
        return false;
    }

    private void P0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10) {
                for (f2 f2Var : this.f5276a) {
                    if (!T(f2Var) && this.f5277b.remove(f2Var)) {
                        f2Var.reset();
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

    private boolean Q() {
        k1 k1VarU = this.f5294s.u();
        if (!k1VarU.f5444d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            f2[] f2VarArr = this.f5276a;
            if (i10 >= f2VarArr.length) {
                return true;
            }
            f2 f2Var = f2VarArr[i10];
            i2.q qVar = k1VarU.f5443c[i10];
            if (f2Var.getStream() != qVar || (qVar != null && !f2Var.hasReadStreamToEnd() && !P(f2Var, k1VarU))) {
                return false;
            }
            i10++;
        }
    }

    private void Q0(t1.w wVar) {
        this.f5283h.removeMessages(16);
        this.f5290o.i(wVar);
    }

    private static boolean R(boolean z10, androidx.media3.exoplayer.source.r.b bVar, long j10, androidx.media3.exoplayer.source.r.b bVar2, t1.a0.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f6055a.equals(bVar2.f6055a)) {
            if (bVar.b() && bVar3.r(bVar.f6056b)) {
                return (bVar3.h(bVar.f6056b, bVar.f6057c) == 4 || bVar3.h(bVar.f6056b, bVar.f6057c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.r(bVar2.f6056b)) {
                return true;
            }
        }
        return false;
    }

    private void R0(b bVar) throws Throwable {
        this.A.b(1);
        if (bVar.f5305c != -1) {
            this.N = new h(new e2(bVar.f5303a, bVar.f5304b), bVar.f5305c, bVar.f5306d);
        }
        K(this.f5295t.B(bVar.f5303a, bVar.f5304b), false);
    }

    private boolean S() {
        k1 k1VarM = this.f5294s.m();
        return (k1VarM == null || k1VarM.r() || k1VarM.l() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean T(f2 f2Var) {
        return f2Var.getState() != 0;
    }

    private void T0(boolean z10) {
        if (z10 == this.L) {
            return;
        }
        this.L = z10;
        if (z10 || !this.f5301z.f5140p) {
            return;
        }
        this.f5283h.sendEmptyMessage(2);
    }

    private boolean U() {
        k1 k1VarT = this.f5294s.t();
        long j10 = k1VarT.f5446f.f5481e;
        if (k1VarT.f5444d) {
            return j10 == C.TIME_UNSET || this.f5301z.f5143s < j10 || !g1();
        }
        return false;
    }

    private void U0(boolean z10) throws ExoPlaybackException {
        this.C = z10;
        w0();
        if (!this.D || this.f5294s.u() == this.f5294s.t()) {
            return;
        }
        G0(true);
        J(false);
    }

    private static boolean V(c2 c2Var, t1.a0.b bVar) {
        androidx.media3.exoplayer.source.r.b bVar2 = c2Var.f5126b;
        t1.a0 a0Var = c2Var.f5125a;
        return a0Var.q() || a0Var.h(bVar2.f6055a, bVar).f52524f;
    }

    private void W() {
        boolean zF1 = f1();
        this.G = zF1;
        if (zF1) {
            this.f5294s.m().e(this.O, this.f5290o.getPlaybackParameters().f53030a, this.F);
        }
        n1();
    }

    private void W0(boolean z10, int i10, boolean z11, int i11) {
        this.A.b(z11 ? 1 : 0);
        this.f5301z = this.f5301z.e(z10, i11, i10);
        t1(false, false);
        i0(z10);
        if (!g1()) {
            m1();
            r1();
            return;
        }
        int i12 = this.f5301z.f5129e;
        if (i12 == 3) {
            this.f5290o.e();
            j1();
            this.f5283h.sendEmptyMessage(2);
        } else if (i12 == 2) {
            this.f5283h.sendEmptyMessage(2);
        }
    }

    private void X() {
        this.A.c(this.f5301z);
        if (this.A.f5311a) {
            this.f5293r.a(this.A);
            this.A = new e(this.f5301z);
        }
    }

    private void X0(t1.w wVar) {
        Q0(wVar);
        N(this.f5290o.getPlaybackParameters(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.e1.Y(long, long):void");
    }

    private void Y0(o.c cVar) {
        this.V = cVar;
        this.f5294s.P(this.f5301z.f5125a, cVar);
    }

    private boolean Z() {
        l1 l1VarS;
        this.f5294s.E(this.O);
        boolean z10 = false;
        if (this.f5294s.N() && (l1VarS = this.f5294s.s(this.O, this.f5301z)) != null) {
            k1 k1VarG = this.f5294s.g(l1VarS);
            k1VarG.f5441a.g(this, l1VarS.f5478b);
            if (this.f5294s.t() == k1VarG) {
                x0(l1VarS.f5478b);
            }
            J(false);
            z10 = true;
        }
        if (!this.G) {
            W();
            return z10;
        }
        this.G = S();
        n1();
        return z10;
    }

    private void Z0(int i10) throws ExoPlaybackException {
        this.H = i10;
        if (!this.f5294s.R(this.f5301z.f5125a, i10)) {
            G0(true);
        }
        J(false);
    }

    private void a0() {
        boolean z10;
        k1 k1VarT = this.f5294s.t();
        if (k1VarT != null) {
            k2.w wVarP = k1VarT.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f5276a.length) {
                    z10 = true;
                    break;
                }
                if (wVarP.c(i10)) {
                    if (this.f5276a[i10].getTrackType() != 1) {
                        z10 = false;
                        break;
                    } else if (wVarP.f42967b[i10].f5380a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            T0(z11);
        }
    }

    private void a1(j2 j2Var) {
        this.f5300y = j2Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    private void b0() {
        boolean z10;
        boolean z11 = false;
        while (e1()) {
            if (z11) {
                X();
            }
            k1 k1Var = (k1) w1.a.e(this.f5294s.b());
            if (this.f5301z.f5126b.f6055a.equals(k1Var.f5446f.f5477a.f6055a)) {
                androidx.media3.exoplayer.source.r.b bVar = this.f5301z.f5126b;
                if (bVar.f6056b == -1) {
                    androidx.media3.exoplayer.source.r.b bVar2 = k1Var.f5446f.f5477a;
                    if (bVar2.f6056b != -1 || bVar.f6059e == bVar2.f6059e) {
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
            l1 l1Var = k1Var.f5446f;
            androidx.media3.exoplayer.source.r.b bVar3 = l1Var.f5477a;
            long j10 = l1Var.f5478b;
            this.f5301z = O(bVar3, j10, l1Var.f5479c, j10, !z10, 0);
            w0();
            r1();
            if (this.f5301z.f5129e == 3) {
                j1();
            }
            n();
            z11 = true;
        }
    }

    private void b1(boolean z10) throws ExoPlaybackException {
        this.I = z10;
        if (!this.f5294s.S(this.f5301z.f5125a, z10)) {
            G0(true);
        }
        J(false);
    }

    private void c0(boolean z10) {
        if (this.V.f5692a != C.TIME_UNSET) {
            if (z10 || !this.f5301z.f5125a.equals(this.W)) {
                t1.a0 a0Var = this.f5301z.f5125a;
                this.W = a0Var;
                this.f5294s.x(a0Var);
            }
        }
    }

    private void c1(i2.r rVar) throws Throwable {
        this.A.b(1);
        K(this.f5295t.C(rVar), false);
    }

    private void d0() {
        k1 k1VarU = this.f5294s.u();
        if (k1VarU == null) {
            return;
        }
        int i10 = 0;
        if (k1VarU.k() != null && !this.D) {
            if (Q()) {
                if (k1VarU.k().f5444d || this.O >= k1VarU.k().n()) {
                    k2.w wVarP = k1VarU.p();
                    k1 k1VarC = this.f5294s.c();
                    k2.w wVarP2 = k1VarC.p();
                    t1.a0 a0Var = this.f5301z.f5125a;
                    s1(a0Var, k1VarC.f5446f.f5477a, a0Var, k1VarU.f5446f.f5477a, C.TIME_UNSET, false);
                    if (k1VarC.f5444d && k1VarC.f5441a.readDiscontinuity() != C.TIME_UNSET) {
                        N0(k1VarC.n());
                        if (k1VarC.s()) {
                            return;
                        }
                        this.f5294s.H(k1VarC);
                        J(false);
                        W();
                        return;
                    }
                    for (int i11 = 0; i11 < this.f5276a.length; i11++) {
                        boolean zC = wVarP.c(i11);
                        boolean zC2 = wVarP2.c(i11);
                        if (zC && !this.f5276a[i11].isCurrentStreamFinal()) {
                            boolean z10 = this.f5278c[i11].getTrackType() == -2;
                            h2 h2Var = wVarP.f42967b[i11];
                            h2 h2Var2 = wVarP2.f42967b[i11];
                            if (!zC2 || !h2Var2.equals(h2Var) || z10) {
                                O0(this.f5276a[i11], k1VarC.n());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!k1VarU.f5446f.f5485i && !this.D) {
            return;
        }
        while (true) {
            f2[] f2VarArr = this.f5276a;
            if (i10 >= f2VarArr.length) {
                return;
            }
            f2 f2Var = f2VarArr[i10];
            i2.q qVar = k1VarU.f5443c[i10];
            if (qVar != null && f2Var.getStream() == qVar && f2Var.hasReadStreamToEnd()) {
                long j10 = k1VarU.f5446f.f5481e;
                O0(f2Var, (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? -9223372036854775807L : k1VarU.m() + k1VarU.f5446f.f5481e);
            }
            i10++;
        }
    }

    private void d1(int i10) {
        c2 c2Var = this.f5301z;
        if (c2Var.f5129e != i10) {
            if (i10 != 2) {
                this.U = C.TIME_UNSET;
            }
            this.f5301z = c2Var.h(i10);
        }
    }

    private void e0() throws ExoPlaybackException {
        k1 k1VarU = this.f5294s.u();
        if (k1VarU == null || this.f5294s.t() == k1VarU || k1VarU.f5447g || !s0()) {
            return;
        }
        u();
    }

    private boolean e1() {
        k1 k1VarT;
        k1 k1VarK;
        return g1() && !this.D && (k1VarT = this.f5294s.t()) != null && (k1VarK = k1VarT.k()) != null && this.O >= k1VarK.n() && k1VarK.f5447g;
    }

    private void f0() throws Throwable {
        K(this.f5295t.i(), true);
    }

    private boolean f1() {
        if (!S()) {
            return false;
        }
        k1 k1VarM = this.f5294s.m();
        long jG = G(k1VarM.l());
        h1.a aVar = new h1.a(this.f5298w, this.f5301z.f5125a, k1VarM.f5446f.f5477a, k1VarM == this.f5294s.t() ? k1VarM.A(this.O) : k1VarM.A(this.O) - k1VarM.f5446f.f5478b, jG, this.f5290o.getPlaybackParameters().f53030a, this.f5301z.f5136l, this.E, i1(this.f5301z.f5125a, k1VarM.f5446f.f5477a) ? this.f5296u.b() : C.TIME_UNSET);
        boolean zF = this.f5281f.f(aVar);
        k1 k1VarT = this.f5294s.t();
        if (zF || !k1VarT.f5444d || jG >= 500000) {
            return zF;
        }
        if (this.f5288m <= 0 && !this.f5289n) {
            return zF;
        }
        k1VarT.f5441a.discardBuffer(this.f5301z.f5143s, false);
        return this.f5281f.f(aVar);
    }

    public static /* synthetic */ void g(e1 e1Var, d2 d2Var) {
        e1Var.getClass();
        try {
            e1Var.q(d2Var);
        } catch (ExoPlaybackException e10) {
            w1.n.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void g0(c cVar) {
        this.A.b(1);
        throw null;
    }

    private boolean g1() {
        c2 c2Var = this.f5301z;
        return c2Var.f5136l && c2Var.f5138n == 0;
    }

    private void h0() {
        for (k1 k1VarT = this.f5294s.t(); k1VarT != null; k1VarT = k1VarT.k()) {
            for (k2.q qVar : k1VarT.p().f42968c) {
                if (qVar != null) {
                    qVar.a();
                }
            }
        }
    }

    private boolean h1(boolean z10) {
        if (this.M == 0) {
            return U();
        }
        if (!z10) {
            return false;
        }
        if (!this.f5301z.f5131g) {
            return true;
        }
        k1 k1VarT = this.f5294s.t();
        long jB = i1(this.f5301z.f5125a, k1VarT.f5446f.f5477a) ? this.f5296u.b() : C.TIME_UNSET;
        k1 k1VarM = this.f5294s.m();
        return (k1VarM.s() && k1VarM.f5446f.f5485i) || (k1VarM.f5446f.f5477a.b() && !k1VarM.f5444d) || this.f5281f.a(new h1.a(this.f5298w, this.f5301z.f5125a, k1VarT.f5446f.f5477a, k1VarT.A(this.O), F(), this.f5290o.getPlaybackParameters().f53030a, this.f5301z.f5136l, this.E, jB));
    }

    private void i0(boolean z10) {
        for (k1 k1VarT = this.f5294s.t(); k1VarT != null; k1VarT = k1VarT.k()) {
            for (k2.q qVar : k1VarT.p().f42968c) {
                if (qVar != null) {
                    qVar.b(z10);
                }
            }
        }
    }

    private boolean i1(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar) {
        if (!bVar.b() && !a0Var.q()) {
            a0Var.n(a0Var.h(bVar.f6055a, this.f5287l).f52521c, this.f5286k);
            if (this.f5286k.f()) {
                t1.a0.c cVar = this.f5286k;
                if (cVar.f52544i && cVar.f52541f != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private void j0() {
        for (k1 k1VarT = this.f5294s.t(); k1VarT != null; k1VarT = k1VarT.k()) {
            for (k2.q qVar : k1VarT.p().f42968c) {
                if (qVar != null) {
                    qVar.c();
                }
            }
        }
    }

    private void j1() {
        k1 k1VarT = this.f5294s.t();
        if (k1VarT == null) {
            return;
        }
        k2.w wVarP = k1VarT.p();
        for (int i10 = 0; i10 < this.f5276a.length; i10++) {
            if (wVarP.c(i10) && this.f5276a[i10].getState() == 1) {
                this.f5276a[i10].start();
            }
        }
    }

    private void l1(boolean z10, boolean z11) {
        v0(z10 || !this.J, false, true, false);
        this.A.b(z11 ? 1 : 0);
        this.f5281f.g(this.f5298w);
        d1(1);
    }

    private void m(b bVar, int i10) throws Throwable {
        this.A.b(1);
        b2 b2Var = this.f5295t;
        if (i10 == -1) {
            i10 = b2Var.r();
        }
        K(b2Var.f(i10, bVar.f5303a, bVar.f5304b), false);
    }

    private void m0() {
        this.A.b(1);
        v0(false, false, false, true);
        this.f5281f.c(this.f5298w);
        d1(this.f5301z.f5125a.q() ? 4 : 2);
        this.f5295t.v(this.f5282g.a());
        this.f5283h.sendEmptyMessage(2);
    }

    private void m1() {
        this.f5290o.f();
        for (f2 f2Var : this.f5276a) {
            if (T(f2Var)) {
                w(f2Var);
            }
        }
    }

    private void n() {
        k2.w wVarP = this.f5294s.t().p();
        for (int i10 = 0; i10 < this.f5276a.length; i10++) {
            if (wVarP.c(i10)) {
                this.f5276a[i10].b();
            }
        }
    }

    private void n1() {
        k1 k1VarM = this.f5294s.m();
        boolean z10 = this.G || (k1VarM != null && k1VarM.f5441a.isLoading());
        c2 c2Var = this.f5301z;
        if (z10 != c2Var.f5131g) {
            this.f5301z = c2Var.b(z10);
        }
    }

    private void o() throws ExoPlaybackException {
        u0();
    }

    private void o0() {
        try {
            v0(true, false, true, false);
            p0();
            this.f5281f.h(this.f5298w);
            d1(1);
            HandlerThread handlerThread = this.f5284i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.B = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            HandlerThread handlerThread2 = this.f5284i;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.B = true;
                notifyAll();
                throw th2;
            }
        }
    }

    private void o1(androidx.media3.exoplayer.source.r.b bVar, i2.v vVar, k2.w wVar) {
        this.f5281f.e(this.f5298w, this.f5301z.f5125a, bVar, this.f5276a, vVar, wVar.f42968c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k1 p(l1 l1Var, long j10) {
        return new k1(this.f5278c, j10, this.f5279d, this.f5281f.getAllocator(), this.f5295t, l1Var, this.f5280e);
    }

    private void p0() {
        for (int i10 = 0; i10 < this.f5276a.length; i10++) {
            this.f5278c[i10].c();
            this.f5276a[i10].release();
        }
    }

    private void p1(int i10, int i11, List list) throws Throwable {
        this.A.b(1);
        K(this.f5295t.D(i10, i11, list), false);
    }

    private void q(d2 d2Var) {
        if (d2Var.j()) {
            return;
        }
        try {
            d2Var.g().handleMessage(d2Var.i(), d2Var.e());
        } finally {
            d2Var.k(true);
        }
    }

    private void q0(int i10, int i11, i2.r rVar) throws Throwable {
        this.A.b(1);
        K(this.f5295t.z(i10, i11, rVar), false);
    }

    private void q1() throws ExoPlaybackException {
        if (this.f5301z.f5125a.q() || !this.f5295t.t()) {
            return;
        }
        boolean Z = Z();
        d0();
        e0();
        b0();
        c0(Z);
    }

    private void r(f2 f2Var) {
        if (T(f2Var)) {
            this.f5290o.a(f2Var);
            w(f2Var);
            f2Var.disable();
            this.M--;
        }
    }

    private void r1() {
        k1 k1VarT = this.f5294s.t();
        if (k1VarT == null) {
            return;
        }
        long discontinuity = k1VarT.f5444d ? k1VarT.f5441a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C.TIME_UNSET) {
            if (!k1VarT.s()) {
                this.f5294s.H(k1VarT);
                J(false);
                W();
            }
            x0(discontinuity);
            if (discontinuity != this.f5301z.f5143s) {
                c2 c2Var = this.f5301z;
                long j10 = discontinuity;
                this.f5301z = O(c2Var.f5126b, j10, c2Var.f5127c, j10, true, 5);
            }
        } else {
            long jG = this.f5290o.g(k1VarT != this.f5294s.u());
            this.O = jG;
            long jA = k1VarT.A(jG);
            Y(this.f5301z.f5143s, jA);
            if (this.f5290o.q()) {
                boolean z10 = !this.A.f5314d;
                c2 c2Var2 = this.f5301z;
                this.f5301z = O(c2Var2.f5126b, jA, c2Var2.f5127c, jA, z10, 6);
            } else {
                this.f5301z.o(jA);
            }
        }
        this.f5301z.f5141q = this.f5294s.m().j();
        this.f5301z.f5142r = F();
        c2 c2Var3 = this.f5301z;
        if (c2Var3.f5136l && c2Var3.f5129e == 3 && i1(c2Var3.f5125a, c2Var3.f5126b) && this.f5301z.f5139o.f53030a == 1.0f) {
            float fA = this.f5296u.a(z(), F());
            if (this.f5290o.getPlaybackParameters().f53030a != fA) {
                Q0(this.f5301z.f5139o.b(fA));
                M(this.f5301z.f5139o, this.f5290o.getPlaybackParameters().f53030a, false, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0179  */
    /* JADX WARN: Code duplicated, block: B:117:0x01af  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:151:0x0173 A[EDGE_INSN: B:151:0x0173->B:103:0x0173 BREAK  A[LOOP:1: B:95:0x014e->B:102:0x0170], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0170 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0153  */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    private void s() throws ExoPlaybackException {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        boolean z14;
        c2 c2Var;
        int i10;
        int i11;
        f2[] f2VarArr;
        c2 c2Var2;
        long jUptimeMillis = this.f5292q.uptimeMillis();
        this.f5283h.removeMessages(2);
        q1();
        int i12 = this.f5301z.f5129e;
        if (i12 == 1 || i12 == 4) {
            return;
        }
        k1 k1VarT = this.f5294s.t();
        if (k1VarT == null) {
            E0(jUptimeMillis);
            return;
        }
        w1.a0.a("doSomeWork");
        r1();
        if (k1VarT.f5444d) {
            this.P = w1.c0.E0(this.f5292q.elapsedRealtime());
            k1VarT.f5441a.discardBuffer(this.f5301z.f5143s - this.f5288m, this.f5289n);
            z10 = true;
            z11 = true;
            int i13 = 0;
            while (true) {
                f2[] f2VarArr2 = this.f5276a;
                if (i13 >= f2VarArr2.length) {
                    break;
                }
                f2 f2Var = f2VarArr2[i13];
                if (T(f2Var)) {
                    f2Var.render(this.O, this.P);
                    z10 = z10 && f2Var.isEnded();
                    boolean z15 = k1VarT.f5443c[i13] != f2Var.getStream();
                    boolean z16 = z15 || (!z15 && f2Var.hasReadStreamToEnd()) || f2Var.isReady() || f2Var.isEnded();
                    z11 = z11 && z16;
                    if (!z16) {
                        f2Var.maybeThrowStreamError();
                    }
                }
                i13++;
            }
        } else {
            k1VarT.f5441a.maybeThrowPrepareError();
            z10 = true;
            z11 = true;
        }
        long j11 = k1VarT.f5446f.f5481e;
        if (z10 && k1VarT.f5444d) {
            if (j11 != C.TIME_UNSET) {
                j10 = -9223372036854775807L;
                if (j11 <= this.f5301z.f5143s) {
                }
                if (z12 && this.D) {
                    this.D = false;
                    W0(false, this.f5301z.f5138n, false, 5);
                }
                if (!z12 && k1VarT.f5446f.f5485i) {
                    d1(4);
                    m1();
                } else if (this.f5301z.f5129e != 2 && h1(z11)) {
                    d1(3);
                    this.S = null;
                    if (g1()) {
                        t1(false, false);
                        this.f5290o.e();
                        j1();
                    }
                } else if (this.f5301z.f5129e == 3 && (this.M != 0 ? !z11 : !U())) {
                    t1(g1(), false);
                    d1(2);
                    if (this.E) {
                        j0();
                        this.f5296u.c();
                    }
                    m1();
                }
                if (this.f5301z.f5129e == 2) {
                    i11 = 0;
                    while (true) {
                        f2VarArr = this.f5276a;
                        if (i11 >= f2VarArr.length) {
                            break;
                        }
                        if (!T(f2VarArr[i11]) && this.f5276a[i11].getStream() == k1VarT.f5443c[i11]) {
                            this.f5276a[i11].maybeThrowStreamError();
                        }
                        i11++;
                    }
                    c2Var2 = this.f5301z;
                    if (!c2Var2.f5131g || c2Var2.f5142r >= 500000 || !S()) {
                        this.U = j10;
                    } else if (this.U == j10) {
                        this.U = this.f5292q.elapsedRealtime();
                    } else if (this.f5292q.elapsedRealtime() - this.U >= 4000) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                } else {
                    this.U = j10;
                }
                if (g1() || this.f5301z.f5129e != 3) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                z14 = !this.L && this.K && z13;
                c2Var = this.f5301z;
                if (c2Var.f5140p != z14) {
                    this.f5301z = c2Var.i(z14);
                }
                this.K = false;
                if (!z14 && (i10 = this.f5301z.f5129e) != 4 && (z13 || i10 == 2 || (i10 == 3 && this.M != 0))) {
                    E0(jUptimeMillis);
                }
                w1.a0.b();
            }
            j10 = -9223372036854775807L;
            z12 = true;
            if (z12) {
                this.D = false;
                W0(false, this.f5301z.f5138n, false, 5);
            }
            if (!z12) {
                if (this.f5301z.f5129e != 2) {
                    if (this.f5301z.f5129e == 3) {
                        t1(g1(), false);
                        d1(2);
                        if (this.E) {
                            j0();
                            this.f5296u.c();
                        }
                        m1();
                    }
                } else if (this.f5301z.f5129e == 3) {
                    t1(g1(), false);
                    d1(2);
                    if (this.E) {
                        j0();
                        this.f5296u.c();
                    }
                    m1();
                }
            } else if (this.f5301z.f5129e != 2) {
                if (this.f5301z.f5129e == 3) {
                    t1(g1(), false);
                    d1(2);
                    if (this.E) {
                        j0();
                        this.f5296u.c();
                    }
                    m1();
                }
            } else if (this.f5301z.f5129e == 3) {
                t1(g1(), false);
                d1(2);
                if (this.E) {
                    j0();
                    this.f5296u.c();
                }
                m1();
            }
            if (this.f5301z.f5129e == 2) {
                i11 = 0;
                while (true) {
                    f2VarArr = this.f5276a;
                    if (i11 >= f2VarArr.length) {
                        break;
                        break;
                    } else {
                        if (!T(f2VarArr[i11])) {
                        }
                        i11++;
                    }
                }
                c2Var2 = this.f5301z;
                if (!c2Var2.f5131g) {
                    this.U = j10;
                } else {
                    this.U = j10;
                }
            } else {
                this.U = j10;
            }
            if (g1()) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (this.L) {
            }
            c2Var = this.f5301z;
            if (c2Var.f5140p != z14) {
                this.f5301z = c2Var.i(z14);
            }
            this.K = false;
            if (!z14) {
                E0(jUptimeMillis);
            }
            w1.a0.b();
        }
        j10 = -9223372036854775807L;
        z12 = false;
        if (z12) {
            this.D = false;
            W0(false, this.f5301z.f5138n, false, 5);
        }
        if (!z12) {
            if (this.f5301z.f5129e != 2) {
                if (this.f5301z.f5129e == 3) {
                    t1(g1(), false);
                    d1(2);
                    if (this.E) {
                        j0();
                        this.f5296u.c();
                    }
                    m1();
                }
            } else if (this.f5301z.f5129e == 3) {
                t1(g1(), false);
                d1(2);
                if (this.E) {
                    j0();
                    this.f5296u.c();
                }
                m1();
            }
        } else if (this.f5301z.f5129e != 2) {
            if (this.f5301z.f5129e == 3) {
                t1(g1(), false);
                d1(2);
                if (this.E) {
                    j0();
                    this.f5296u.c();
                }
                m1();
            }
        } else if (this.f5301z.f5129e == 3) {
            t1(g1(), false);
            d1(2);
            if (this.E) {
                j0();
                this.f5296u.c();
            }
            m1();
        }
        if (this.f5301z.f5129e == 2) {
            i11 = 0;
            while (true) {
                f2VarArr = this.f5276a;
                if (i11 >= f2VarArr.length) {
                    break;
                    break;
                } else {
                    if (!T(f2VarArr[i11])) {
                    }
                    i11++;
                }
            }
            c2Var2 = this.f5301z;
            if (!c2Var2.f5131g) {
                this.U = j10;
            } else {
                this.U = j10;
            }
        } else {
            this.U = j10;
        }
        if (g1()) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (this.L) {
        }
        c2Var = this.f5301z;
        if (c2Var.f5140p != z14) {
            this.f5301z = c2Var.i(z14);
        }
        this.K = false;
        if (!z14) {
            E0(jUptimeMillis);
        }
        w1.a0.b();
    }

    private boolean s0() {
        k1 k1VarU = this.f5294s.u();
        k2.w wVarP = k1VarU.p();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            f2[] f2VarArr = this.f5276a;
            if (i10 >= f2VarArr.length) {
                return !z10;
            }
            f2 f2Var = f2VarArr[i10];
            if (T(f2Var)) {
                boolean z11 = f2Var.getStream() != k1VarU.f5443c[i10];
                if (!wVarP.c(i10) || z11) {
                    if (!f2Var.isCurrentStreamFinal()) {
                        f2Var.x(A(wVarP.f42968c[i10]), k1VarU.f5443c[i10], k1VarU.n(), k1VarU.m(), k1VarU.f5446f.f5477a);
                        if (this.L) {
                            T0(false);
                        }
                    } else if (f2Var.isEnded()) {
                        r(f2Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void s1(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar, t1.a0 a0Var2, androidx.media3.exoplayer.source.r.b bVar2, long j10, boolean z10) {
        if (!i1(a0Var, bVar)) {
            t1.w wVar = bVar.b() ? t1.w.f53027d : this.f5301z.f5139o;
            if (this.f5290o.getPlaybackParameters().equals(wVar)) {
                return;
            }
            Q0(wVar);
            M(this.f5301z.f5139o, wVar.f53030a, false, false);
            return;
        }
        a0Var.n(a0Var.h(bVar.f6055a, this.f5287l).f52521c, this.f5286k);
        this.f5296u.e((t1.r.g) w1.c0.h(this.f5286k.f52545j));
        if (j10 != C.TIME_UNSET) {
            this.f5296u.d(B(a0Var, bVar.f6055a, j10));
            return;
        }
        if (!w1.c0.c(!a0Var2.q() ? a0Var2.n(a0Var2.h(bVar2.f6055a, this.f5287l).f52521c, this.f5286k).f52536a : null, this.f5286k.f52536a) || z10) {
            this.f5296u.d(C.TIME_UNSET);
        }
    }

    private void t(int i10, boolean z10, long j10) throws ExoPlaybackException {
        f2 f2Var = this.f5276a[i10];
        if (T(f2Var)) {
            return;
        }
        k1 k1VarU = this.f5294s.u();
        boolean z11 = k1VarU == this.f5294s.t();
        k2.w wVarP = k1VarU.p();
        h2 h2Var = wVarP.f42967b[i10];
        t1.o[] oVarArrA = A(wVarP.f42968c[i10]);
        boolean z12 = g1() && this.f5301z.f5129e == 3;
        boolean z13 = !z10 && z12;
        this.M++;
        this.f5277b.add(f2Var);
        f2Var.A(h2Var, oVarArrA, k1VarU.f5443c[i10], this.O, z13, z11, j10, k1VarU.m(), k1VarU.f5446f.f5477a);
        f2Var.handleMessage(11, new a());
        this.f5290o.b(f2Var);
        if (z12 && z11) {
            f2Var.start();
        }
    }

    private void t0() throws ExoPlaybackException {
        float f10 = this.f5290o.getPlaybackParameters().f53030a;
        k1 k1VarU = this.f5294s.u();
        k2.w wVar = null;
        boolean z10 = true;
        for (k1 k1VarT = this.f5294s.t(); k1VarT != null && k1VarT.f5444d; k1VarT = k1VarT.k()) {
            k2.w wVarX = k1VarT.x(f10, this.f5301z.f5125a);
            if (k1VarT == this.f5294s.t()) {
                wVar = wVarX;
            }
            int i10 = 0;
            if (!wVarX.a(k1VarT.p())) {
                if (z10) {
                    k1 k1VarT2 = this.f5294s.t();
                    boolean zH = this.f5294s.H(k1VarT2);
                    boolean[] zArr = new boolean[this.f5276a.length];
                    long jB = k1VarT2.b((k2.w) w1.a.e(wVar), this.f5301z.f5143s, zH, zArr);
                    c2 c2Var = this.f5301z;
                    boolean z11 = (c2Var.f5129e == 4 || jB == c2Var.f5143s) ? false : true;
                    c2 c2Var2 = this.f5301z;
                    this.f5301z = O(c2Var2.f5126b, jB, c2Var2.f5127c, c2Var2.f5128d, z11, 5);
                    if (z11) {
                        x0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.f5276a.length];
                    while (true) {
                        f2[] f2VarArr = this.f5276a;
                        if (i10 >= f2VarArr.length) {
                            break;
                        }
                        f2 f2Var = f2VarArr[i10];
                        boolean zT = T(f2Var);
                        zArr2[i10] = zT;
                        i2.q qVar = k1VarT2.f5443c[i10];
                        if (zT) {
                            if (qVar != f2Var.getStream()) {
                                r(f2Var);
                            } else if (zArr[i10]) {
                                f2Var.resetPosition(this.O);
                            }
                        }
                        i10++;
                    }
                    v(zArr2, this.O);
                } else {
                    this.f5294s.H(k1VarT);
                    if (k1VarT.f5444d) {
                        k1VarT.a(wVarX, Math.max(k1VarT.f5446f.f5478b, k1VarT.A(this.O)), false);
                    }
                }
                J(true);
                if (this.f5301z.f5129e != 4) {
                    W();
                    r1();
                    this.f5283h.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (k1VarT == k1VarU) {
                z10 = false;
            }
        }
    }

    private void t1(boolean z10, boolean z11) {
        this.E = z10;
        this.F = (!z10 || z11) ? C.TIME_UNSET : this.f5292q.elapsedRealtime();
    }

    private void u() throws ExoPlaybackException {
        v(new boolean[this.f5276a.length], this.f5294s.u().n());
    }

    private void u0() throws ExoPlaybackException {
        t0();
        G0(true);
    }

    private void u1(float f10) {
        for (k1 k1VarT = this.f5294s.t(); k1VarT != null; k1VarT = k1VarT.k()) {
            for (k2.q qVar : k1VarT.p().f42968c) {
                if (qVar != null) {
                    qVar.onPlaybackSpeed(f10);
                }
            }
        }
    }

    private void v(boolean[] zArr, long j10) throws ExoPlaybackException {
        k1 k1VarU = this.f5294s.u();
        k2.w wVarP = k1VarU.p();
        for (int i10 = 0; i10 < this.f5276a.length; i10++) {
            if (!wVarP.c(i10) && this.f5277b.remove(this.f5276a[i10])) {
                this.f5276a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f5276a.length; i11++) {
            if (wVarP.c(i11)) {
                t(i11, zArr[i11], j10);
            }
        }
        k1VarU.f5447g = true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[PHI: r5 r6 r8
      0x00a4: PHI (r5v3 androidx.media3.exoplayer.source.r$b) = (r5v2 androidx.media3.exoplayer.source.r$b), (r5v6 androidx.media3.exoplayer.source.r$b) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v2 long) = (r6v1 long), (r6v9 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r8v3 long) = (r8v2 long), (r8v8 long) binds: [B:30:0x007a, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[PHI: r0
      0x00eb: PHI (r0v10 t1.a0) = (r0v9 t1.a0), (r0v9 t1.a0), (r0v20 t1.a0), (r0v20 t1.a0) binds: [B:36:0x00b1, B:38:0x00b5, B:40:0x00c6, B:42:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    private void v0(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        t1.a0 a0Var;
        androidx.media3.exoplayer.source.r.b bVar;
        this.f5283h.removeMessages(2);
        this.S = null;
        t1(false, true);
        this.f5290o.f();
        this.O = 1000000000000L;
        for (f2 f2Var : this.f5276a) {
            try {
                r(f2Var);
            } catch (ExoPlaybackException | RuntimeException e10) {
                w1.n.d("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (f2 f2Var2 : this.f5276a) {
                if (this.f5277b.remove(f2Var2)) {
                    try {
                        f2Var2.reset();
                    } catch (RuntimeException e11) {
                        w1.n.d("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.M = 0;
        c2 c2Var = this.f5301z;
        androidx.media3.exoplayer.source.r.b bVar2 = c2Var.f5126b;
        long jLongValue = c2Var.f5143s;
        long j10 = (this.f5301z.f5126b.b() || V(this.f5301z, this.f5287l)) ? this.f5301z.f5127c : this.f5301z.f5143s;
        if (z11) {
            this.N = null;
            Pair pairD = D(this.f5301z.f5125a);
            bVar2 = (androidx.media3.exoplayer.source.r.b) pairD.first;
            jLongValue = ((Long) pairD.second).longValue();
            boolean zEquals = bVar2.equals(this.f5301z.f5126b);
            j10 = C.TIME_UNSET;
            z14 = zEquals ? false : true;
        }
        long j11 = jLongValue;
        long j12 = j10;
        this.f5294s.f();
        this.G = false;
        t1.a0 a0VarE = this.f5301z.f5125a;
        if (z12 && (a0VarE instanceof e2)) {
            a0VarE = ((e2) a0VarE).E(this.f5295t.q());
            if (bVar2.f6056b != -1) {
                a0VarE.h(bVar2.f6055a, this.f5287l);
                if (a0VarE.n(this.f5287l.f52521c, this.f5286k).f()) {
                    a0Var = a0VarE;
                    bVar = new androidx.media3.exoplayer.source.r.b(bVar2.f6055a, bVar2.f6058d);
                } else {
                    a0Var = a0VarE;
                    bVar = bVar2;
                }
            } else {
                a0Var = a0VarE;
                bVar = bVar2;
            }
        } else {
            a0Var = a0VarE;
            bVar = bVar2;
        }
        c2 c2Var2 = this.f5301z;
        int i10 = c2Var2.f5129e;
        ExoPlaybackException exoPlaybackException = z13 ? null : c2Var2.f5130f;
        i2.v vVar = z14 ? i2.v.f40816d : c2Var2.f5132h;
        k2.w wVar = z14 ? this.f5280e : c2Var2.f5133i;
        List listC = z14 ? com.google.common.collect.c0.C() : c2Var2.f5134j;
        c2 c2Var3 = this.f5301z;
        this.f5301z = new c2(a0Var, bVar, j12, j11, i10, exoPlaybackException, false, vVar, wVar, listC, bVar, c2Var3.f5136l, c2Var3.f5137m, c2Var3.f5138n, c2Var3.f5139o, j11, 0L, j11, 0L, false);
        if (z12) {
            this.f5294s.G();
            this.f5295t.x();
        }
    }

    private synchronized void v1(sc.x xVar, long j10) {
        long jElapsedRealtime = this.f5292q.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) xVar.get()).booleanValue() && j10 > 0) {
            try {
                this.f5292q.a();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jElapsedRealtime - this.f5292q.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void w(f2 f2Var) {
        if (f2Var.getState() == 2) {
            f2Var.stop();
        }
    }

    private void w0() {
        k1 k1VarT = this.f5294s.t();
        this.D = k1VarT != null && k1VarT.f5446f.f5484h && this.C;
    }

    private void x0(long j10) {
        k1 k1VarT = this.f5294s.t();
        long jB = k1VarT == null ? j10 + 1000000000000L : k1VarT.B(j10);
        this.O = jB;
        this.f5290o.c(jB);
        for (f2 f2Var : this.f5276a) {
            if (T(f2Var)) {
                f2Var.resetPosition(this.O);
            }
        }
        h0();
    }

    private com.google.common.collect.c0 y(k2.q[] qVarArr) {
        com.google.common.collect.c0.a aVar = new com.google.common.collect.c0.a();
        boolean z10 = false;
        for (k2.q qVar : qVarArr) {
            if (qVar != null) {
                t1.u uVar = qVar.getFormat(0).f52754k;
                if (uVar == null) {
                    aVar.a(new t1.u(new t1.u.b[0]));
                } else {
                    aVar.a(uVar);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.m() : com.google.common.collect.c0.C();
    }

    private static void y0(t1.a0 a0Var, d dVar, t1.a0.c cVar, t1.a0.b bVar) {
        int i10 = a0Var.n(a0Var.h(dVar.f5310d, bVar).f52521c, cVar).f52550o;
        Object obj = a0Var.g(i10, bVar, true).f52520b;
        long j10 = bVar.f52522d;
        dVar.b(i10, j10 != C.TIME_UNSET ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private long z() {
        c2 c2Var = this.f5301z;
        return B(c2Var.f5125a, c2Var.f5126b.f6055a, c2Var.f5143s);
    }

    private static boolean z0(d dVar, t1.a0 a0Var, t1.a0 a0Var2, int i10, boolean z10, t1.a0.c cVar, t1.a0.b bVar) {
        Object obj = dVar.f5310d;
        if (obj == null) {
            Pair pairC0 = C0(a0Var, new h(dVar.f5307a.h(), dVar.f5307a.d(), dVar.f5307a.f() == Long.MIN_VALUE ? C.TIME_UNSET : w1.c0.E0(dVar.f5307a.f())), false, i10, z10, cVar, bVar);
            if (pairC0 == null) {
                return false;
            }
            dVar.b(a0Var.b(pairC0.first), ((Long) pairC0.second).longValue(), pairC0.first);
            if (dVar.f5307a.f() == Long.MIN_VALUE) {
                y0(a0Var, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = a0Var.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f5307a.f() == Long.MIN_VALUE) {
            y0(a0Var, dVar, cVar, bVar);
            return true;
        }
        dVar.f5308b = iB;
        a0Var2.h(dVar.f5310d, bVar);
        if (bVar.f52524f && a0Var2.n(bVar.f52521c, cVar).f52549n == a0Var2.b(dVar.f5310d)) {
            Pair pairJ = a0Var.j(cVar, bVar, a0Var.h(dVar.f5310d, bVar).f52521c, dVar.f5309c + bVar.n());
            dVar.b(a0Var.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    public Looper E() {
        return this.f5285j;
    }

    public void F0(t1.a0 a0Var, int i10, long j10) {
        this.f5283h.obtainMessage(3, new h(a0Var, i10, j10)).a();
    }

    public void S0(List list, int i10, long j10, i2.r rVar) {
        this.f5283h.obtainMessage(17, new b(list, rVar, i10, j10, null)).a();
    }

    public void V0(boolean z10, int i10, int i11) {
        this.f5283h.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    @Override // k2.v.a
    public void a(f2 f2Var) {
        this.f5283h.sendEmptyMessage(26);
    }

    @Override // androidx.media3.exoplayer.b2.d
    public void b() {
        this.f5283h.removeMessages(2);
        this.f5283h.sendEmptyMessage(22);
    }

    @Override // androidx.media3.exoplayer.d2.a
    public synchronized void c(d2 d2Var) {
        if (!this.B && this.f5285j.getThread().isAlive()) {
            this.f5283h.obtainMessage(14, d2Var).a();
            return;
        }
        w1.n.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        d2Var.k(false);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void d(androidx.media3.exoplayer.source.q qVar) {
        this.f5283h.obtainMessage(8, qVar).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i10;
        k1 k1VarU;
        int i11;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i13 = message.arg2;
                    W0(z10, i13 >> 4, true, i13 & 15);
                    break;
                case 2:
                    s();
                    break;
                case 3:
                    H0((h) message.obj);
                    break;
                case 4:
                    X0((t1.w) message.obj);
                    break;
                case 5:
                    a1((j2) message.obj);
                    break;
                case 6:
                    l1(false, true);
                    break;
                case 7:
                    o0();
                    return true;
                case 8:
                    L((androidx.media3.exoplayer.source.q) message.obj);
                    break;
                case 9:
                    H((androidx.media3.exoplayer.source.q) message.obj);
                    break;
                case 10:
                    t0();
                    break;
                case 11:
                    Z0(message.arg1);
                    break;
                case 12:
                    b1(message.arg1 != 0);
                    break;
                case 13:
                    P0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    K0((d2) message.obj);
                    break;
                case 15:
                    M0((d2) message.obj);
                    break;
                case 16:
                    N((t1.w) message.obj, false);
                    break;
                case 17:
                    R0((b) message.obj);
                    break;
                case 18:
                    m((b) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.session.b.a(message.obj);
                    g0(null);
                    break;
                case 20:
                    q0(message.arg1, message.arg2, (i2.r) message.obj);
                    break;
                case 21:
                    c1((i2.r) message.obj);
                    break;
                case 22:
                    f0();
                    break;
                case 23:
                    U0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    o();
                    break;
                case 26:
                    u0();
                    break;
                case 27:
                    p1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    Y0((o.c) message.obj);
                    break;
                case 29:
                    m0();
                    break;
            }
        } catch (ParserException e10) {
            int i14 = e10.f4612b;
            if (i14 == 1) {
                i11 = e10.f4611a ? 3001 : 3003;
            } else {
                if (i14 == 4) {
                    i11 = e10.f4611a ? 3002 : 3004;
                }
                I(e10, i12);
            }
            i12 = i11;
            I(e10, i12);
        } catch (DataSourceException e11) {
            I(e11, e11.f4703a);
        } catch (ExoPlaybackException e12) {
            e = e12;
            if (e.f4878j == 1 && (k1VarU = this.f5294s.u()) != null) {
                e = e.g(k1VarU.f5446f.f5477a);
            }
            if (e.f4884p && (this.S == null || (i10 = e.f4619a) == 5004 || i10 == 5003)) {
                w1.n.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                ExoPlaybackException exoPlaybackException = this.S;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.S;
                } else {
                    this.S = e;
                }
                w1.j jVar = this.f5283h;
                jVar.b(jVar.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException2 = this.S;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(e);
                    e = this.S;
                }
                w1.n.d("ExoPlayerImplInternal", "Playback error", e);
                if (e.f4878j == 1 && this.f5294s.t() != this.f5294s.u()) {
                    while (this.f5294s.t() != this.f5294s.u()) {
                        this.f5294s.b();
                    }
                    k1 k1Var = (k1) w1.a.e(this.f5294s.t());
                    X();
                    l1 l1Var = k1Var.f5446f;
                    androidx.media3.exoplayer.source.r.b bVar = l1Var.f5477a;
                    long j10 = l1Var.f5478b;
                    this.f5301z = O(bVar, j10, l1Var.f5479c, j10, true, 0);
                }
                l1(true, false);
                this.f5301z = this.f5301z.f(e);
            }
        } catch (DrmSession.DrmSessionException e13) {
            I(e13, e13.f5236a);
        } catch (BehindLiveWindowException e14) {
            I(e14, 1002);
        } catch (IOException e15) {
            I(e15, 2000);
        } catch (RuntimeException e16) {
            ExoPlaybackException exoPlaybackExceptionJ = ExoPlaybackException.j(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            w1.n.d("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionJ);
            l1(true, false);
            this.f5301z = this.f5301z.f(exoPlaybackExceptionJ);
        }
        X();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void e(androidx.media3.exoplayer.source.q qVar) {
        this.f5283h.obtainMessage(9, qVar).a();
    }

    public void k1() {
        this.f5283h.obtainMessage(6).a();
    }

    public void l0() {
        this.f5283h.obtainMessage(29).a();
    }

    public synchronized boolean n0() {
        if (!this.B && this.f5285j.getThread().isAlive()) {
            this.f5283h.sendEmptyMessage(7);
            v1(new sc.x() { // from class: androidx.media3.exoplayer.b1
                @Override // sc.x
                public final Object get() {
                    return Boolean.valueOf(this.f5099a.B);
                }
            }, this.f5297v);
            return this.B;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.m.a
    public void onPlaybackParametersChanged(t1.w wVar) {
        this.f5283h.obtainMessage(16, wVar).a();
    }

    @Override // k2.v.a
    public void onTrackSelectionsInvalidated() {
        this.f5283h.sendEmptyMessage(10);
    }

    public void r0(int i10, int i11, i2.r rVar) {
        this.f5283h.obtainMessage(20, i10, i11, rVar).a();
    }

    public void x(long j10) {
        this.T = j10;
    }
}
