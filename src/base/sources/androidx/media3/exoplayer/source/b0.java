package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.j2;
import androidx.media3.exoplayer.upstream.Loader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b0 implements q, o2.r, Loader.b, Loader.f, f0.d {
    private static final Map O = A();
    private static final t1.o P = new t1.o.b().a0("icy").o0("application/x-icy").K();
    private o2.j0 A;
    private long B;
    private boolean C;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private long I;
    private boolean K;
    private int L;
    private boolean M;
    private boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f5823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.a f5824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f5825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f5826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s.a f5827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f5828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f5829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l2.b f5830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f5831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f5832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f5833k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w f5835m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private q.a f5840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b3.b f5841s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f5845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f5846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f5847y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f5848z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Loader f5834l = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w1.g f5836n = new w1.g();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f5837o = new Runnable() { // from class: androidx.media3.exoplayer.source.y
        @Override // java.lang.Runnable
        public final void run() {
            this.f6078a.G();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f5838p = new Runnable() { // from class: androidx.media3.exoplayer.source.z
        @Override // java.lang.Runnable
        public final void run() {
            b0.l(this.f6079a);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f5839q = w1.c0.z();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e[] f5843u = new e[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private f0[] f5842t = new f0[0];
    private long J = C.TIME_UNSET;
    private int D = 1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends o2.a0 {
        a(o2.j0 j0Var) {
            super(j0Var);
        }

        @Override // o2.a0, o2.j0
        public long getDurationUs() {
            return b0.this.B;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class b implements Loader.e, n.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f5851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z1.k f5852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w f5853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final o2.r f5854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final w1.g f5855f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f5857h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f5859j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private o0 f5861l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f5862m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final o2.i0 f5856g = new o2.i0();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f5858i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f5850a = i2.i.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private z1.g f5860k = g(0);

        public b(Uri uri, androidx.media3.datasource.a aVar, w wVar, o2.r rVar, w1.g gVar) {
            this.f5851b = uri;
            this.f5852c = new z1.k(aVar);
            this.f5853d = wVar;
            this.f5854e = rVar;
            this.f5855f = gVar;
        }

        private z1.g g(long j10) {
            return new z1.g.b().i(this.f5851b).h(j10).f(b0.this.f5831i).b(6).e(b0.O).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(long j10, long j11) {
            this.f5856g.f48076a = j10;
            this.f5859j = j11;
            this.f5858i = true;
            this.f5862m = false;
        }

        @Override // androidx.media3.exoplayer.source.n.a
        public void a(w1.u uVar) {
            long jMax = !this.f5862m ? this.f5859j : Math.max(b0.this.C(true), this.f5859j);
            int iA = uVar.a();
            o0 o0Var = (o0) w1.a.e(this.f5861l);
            o0Var.c(uVar, iA);
            o0Var.e(jMax, 1, iA, 0, null);
            this.f5862m = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void cancelLoad() {
            this.f5857h = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void load() {
            int iC = 0;
            while (iC == 0 && !this.f5857h) {
                try {
                    long j10 = this.f5856g.f48076a;
                    z1.g gVarG = g(j10);
                    this.f5860k = gVarG;
                    long jA = this.f5852c.a(gVarG);
                    if (this.f5857h) {
                        if (iC != 1 && this.f5853d.b() != -1) {
                            this.f5856g.f48076a = this.f5853d.b();
                        }
                        z1.f.a(this.f5852c);
                        return;
                    }
                    if (jA != -1) {
                        jA += j10;
                        b0.this.L();
                    }
                    long j11 = jA;
                    b0.this.f5841s = b3.b.a(this.f5852c.getResponseHeaders());
                    t1.g nVar = this.f5852c;
                    if (b0.this.f5841s != null && b0.this.f5841s.f8314f != -1) {
                        nVar = new n(this.f5852c, b0.this.f5841s.f8314f, this);
                        o0 o0VarD = b0.this.D();
                        this.f5861l = o0VarD;
                        o0VarD.b(b0.P);
                    }
                    this.f5853d.d(nVar, this.f5851b, this.f5852c.getResponseHeaders(), j10, j11, this.f5854e);
                    if (b0.this.f5841s != null) {
                        this.f5853d.a();
                    }
                    if (this.f5858i) {
                        this.f5853d.seek(j10, this.f5859j);
                        this.f5858i = false;
                    }
                    while (iC == 0 && !this.f5857h) {
                        try {
                            this.f5855f.a();
                            iC = this.f5853d.c(this.f5856g);
                            long jB = this.f5853d.b();
                            if (jB > b0.this.f5832j + j10) {
                                this.f5855f.c();
                                b0.this.f5839q.post(b0.this.f5838p);
                                j10 = jB;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else if (this.f5853d.b() != -1) {
                        this.f5856g.f48076a = this.f5853d.b();
                    }
                    z1.f.a(this.f5852c);
                } catch (Throwable th2) {
                    if (iC != 1 && this.f5853d.b() != -1) {
                        this.f5856g.f48076a = this.f5853d.b();
                    }
                    z1.f.a(this.f5852c);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        void b(long j10, boolean z10, boolean z11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class d implements i2.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5864a;

        public d(int i10) {
            this.f5864a = i10;
        }

        @Override // i2.q
        public int a(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10) {
            return b0.this.Q(this.f5864a, f1Var, decoderInputBuffer, i10);
        }

        @Override // i2.q
        public boolean isReady() {
            return b0.this.F(this.f5864a);
        }

        @Override // i2.q
        public void maybeThrowError() throws IOException {
            b0.this.K(this.f5864a);
        }

        @Override // i2.q
        public int skipData(long j10) {
            return b0.this.U(this.f5864a, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5867b;

        public e(int i10, boolean z10) {
            this.f5866a = i10;
            this.f5867b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f5866a == eVar.f5866a && this.f5867b == eVar.f5867b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f5866a * 31) + (this.f5867b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.v f5868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f5869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f5870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f5871d;

        public f(i2.v vVar, boolean[] zArr) {
            this.f5868a = vVar;
            this.f5869b = zArr;
            int i10 = vVar.f40818a;
            this.f5870c = new boolean[i10];
            this.f5871d = new boolean[i10];
        }
    }

    public b0(Uri uri, androidx.media3.datasource.a aVar, w wVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar2, androidx.media3.exoplayer.upstream.b bVar, s.a aVar3, c cVar, l2.b bVar2, String str, int i10, long j10) {
        this.f5823a = uri;
        this.f5824b = aVar;
        this.f5825c = iVar;
        this.f5828f = aVar2;
        this.f5826d = bVar;
        this.f5827e = aVar3;
        this.f5829g = cVar;
        this.f5830h = bVar2;
        this.f5831i = str;
        this.f5832j = i10;
        this.f5835m = wVar;
        this.f5833k = j10;
    }

    private static Map A() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int B() {
        int iC = 0;
        for (f0 f0Var : this.f5842t) {
            iC += f0Var.C();
        }
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long C(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f5842t.length; i10++) {
            if (z10 || ((f) w1.a.e(this.f5848z)).f5870c[i10]) {
                jMax = Math.max(jMax, this.f5842t[i10].v());
            }
        }
        return jMax;
    }

    private boolean E() {
        return this.J != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.N || this.f5845w || !this.f5844v || this.A == null) {
            return;
        }
        for (f0 f0Var : this.f5842t) {
            if (f0Var.B() == null) {
                return;
            }
        }
        this.f5836n.c();
        int length = this.f5842t.length;
        t1.b0[] b0VarArr = new t1.b0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            t1.o oVarK = (t1.o) w1.a.e(this.f5842t[i10].B());
            String str = oVarK.f52757n;
            boolean zH = t1.v.h(str);
            boolean z10 = zH || t1.v.k(str);
            zArr[i10] = z10;
            this.f5846x = z10 | this.f5846x;
            this.f5847y = this.f5833k != C.TIME_UNSET && length == 1 && t1.v.i(str);
            b3.b bVar = this.f5841s;
            if (bVar != null) {
                if (zH || this.f5843u[i10].f5867b) {
                    t1.u uVar = oVarK.f52754k;
                    oVarK = oVarK.a().h0(uVar == null ? new t1.u(bVar) : uVar.a(bVar)).K();
                }
                if (zH && oVarK.f52750g == -1 && oVarK.f52751h == -1 && bVar.f8309a != -1) {
                    oVarK = oVarK.a().M(bVar.f8309a).K();
                }
            }
            b0VarArr[i10] = new t1.b0(Integer.toString(i10), oVarK.b(this.f5825c.b(oVarK)));
        }
        this.f5848z = new f(new i2.v(b0VarArr), zArr);
        if (this.f5847y && this.B == C.TIME_UNSET) {
            this.B = this.f5833k;
            this.A = new a(this.A);
        }
        this.f5829g.b(this.B, this.A.isSeekable(), this.C);
        this.f5845w = true;
        ((q.a) w1.a.e(this.f5840r)).d(this);
    }

    private void H(int i10) {
        y();
        f fVar = this.f5848z;
        boolean[] zArr = fVar.f5871d;
        if (zArr[i10]) {
            return;
        }
        t1.o oVarA = fVar.f5868a.b(i10).a(0);
        this.f5827e.g(t1.v.f(oVarA.f52757n), oVarA, 0, null, this.I);
        zArr[i10] = true;
    }

    private void I(int i10) {
        y();
        boolean[] zArr = this.f5848z.f5869b;
        if (this.K && zArr[i10]) {
            if (this.f5842t[i10].F(false)) {
                return;
            }
            this.J = 0L;
            this.K = false;
            this.F = true;
            this.I = 0L;
            this.L = 0;
            for (f0 f0Var : this.f5842t) {
                f0Var.O();
            }
            ((q.a) w1.a.e(this.f5840r)).e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        this.f5839q.post(new Runnable() { // from class: androidx.media3.exoplayer.source.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f6077a.H = true;
            }
        });
    }

    private o0 P(e eVar) {
        int length = this.f5842t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f5843u[i10])) {
                return this.f5842t[i10];
            }
        }
        if (this.f5844v) {
            w1.n.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f5866a + ") after finishing tracks.");
            return new o2.m();
        }
        f0 f0VarK = f0.k(this.f5830h, this.f5825c, this.f5828f);
        f0VarK.V(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f5843u, i11);
        eVarArr[length] = eVar;
        this.f5843u = (e[]) w1.c0.i(eVarArr);
        f0[] f0VarArr = (f0[]) Arrays.copyOf(this.f5842t, i11);
        f0VarArr[length] = f0VarK;
        this.f5842t = (f0[]) w1.c0.i(f0VarArr);
        return f0VarK;
    }

    private boolean S(boolean[] zArr, long j10) {
        int length = this.f5842t.length;
        for (int i10 = 0; i10 < length; i10++) {
            f0 f0Var = this.f5842t[i10];
            if (!(this.f5847y ? f0Var.R(f0Var.u()) : f0Var.S(j10, false)) && (zArr[i10] || !this.f5846x)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(o2.j0 j0Var) {
        this.A = this.f5841s == null ? j0Var : new o2.j0.b(C.TIME_UNSET);
        this.B = j0Var.getDurationUs();
        boolean z10 = !this.H && j0Var.getDurationUs() == C.TIME_UNSET;
        this.C = z10;
        this.D = z10 ? 7 : 1;
        if (this.f5845w) {
            this.f5829g.b(this.B, j0Var.isSeekable(), this.C);
        } else {
            G();
        }
    }

    private void V() {
        b bVar = new b(this.f5823a, this.f5824b, this.f5835m, this, this.f5836n);
        if (this.f5845w) {
            w1.a.g(E());
            long j10 = this.B;
            if (j10 != C.TIME_UNSET && this.J > j10) {
                this.M = true;
                this.J = C.TIME_UNSET;
                return;
            }
            bVar.h(((o2.j0) w1.a.e(this.A)).getSeekPoints(this.J).f48077a.f48083b, this.J);
            for (f0 f0Var : this.f5842t) {
                f0Var.T(this.J);
            }
            this.J = C.TIME_UNSET;
        }
        this.L = B();
        this.f5827e.o(new i2.i(bVar.f5850a, bVar.f5860k, this.f5834l.n(bVar, this, this.f5826d.a(this.D))), 1, -1, null, 0, null, bVar.f5859j, this.B);
    }

    private boolean W() {
        return this.F || E();
    }

    public static /* synthetic */ void l(b0 b0Var) {
        if (b0Var.N) {
            return;
        }
        ((q.a) w1.a.e(b0Var.f5840r)).e(b0Var);
    }

    private void y() {
        w1.a.g(this.f5845w);
        w1.a.e(this.f5848z);
        w1.a.e(this.A);
    }

    private boolean z(b bVar, int i10) {
        o2.j0 j0Var;
        if (this.H || !((j0Var = this.A) == null || j0Var.getDurationUs() == C.TIME_UNSET)) {
            this.L = i10;
            return true;
        }
        if (this.f5845w && !W()) {
            this.K = true;
            return false;
        }
        this.F = this.f5845w;
        this.I = 0L;
        this.L = 0;
        for (f0 f0Var : this.f5842t) {
            f0Var.O();
        }
        bVar.h(0L, 0L);
        return true;
    }

    o0 D() {
        return P(new e(0, true));
    }

    boolean F(int i10) {
        return !W() && this.f5842t[i10].F(this.M);
    }

    void J() throws IOException {
        this.f5834l.k(this.f5826d.a(this.D));
    }

    void K(int i10) throws IOException {
        this.f5842t[i10].H();
        J();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void i(b bVar, long j10, long j11, boolean z10) {
        z1.k kVar = bVar.f5852c;
        i2.i iVar = new i2.i(bVar.f5850a, bVar.f5860k, kVar.e(), kVar.f(), j10, j11, kVar.d());
        this.f5826d.b(bVar.f5850a);
        this.f5827e.i(iVar, 1, -1, null, 0, null, bVar.f5859j, this.B);
        if (z10) {
            return;
        }
        for (f0 f0Var : this.f5842t) {
            f0Var.O();
        }
        if (this.G > 0) {
            ((q.a) w1.a.e(this.f5840r)).e(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void h(b bVar, long j10, long j11) {
        o2.j0 j0Var;
        if (this.B == C.TIME_UNSET && (j0Var = this.A) != null) {
            boolean zIsSeekable = j0Var.isSeekable();
            long jC = C(true);
            long j12 = jC == Long.MIN_VALUE ? 0L : jC + 10000;
            this.B = j12;
            this.f5829g.b(j12, zIsSeekable, this.C);
        }
        z1.k kVar = bVar.f5852c;
        i2.i iVar = new i2.i(bVar.f5850a, bVar.f5860k, kVar.e(), kVar.f(), j10, j11, kVar.d());
        this.f5826d.b(bVar.f5850a);
        this.f5827e.k(iVar, 1, -1, null, 0, null, bVar.f5859j, this.B);
        this.M = true;
        ((q.a) w1.a.e(this.f5840r)).e(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Loader.c b(b bVar, long j10, long j11, IOException iOException, int i10) {
        b bVar2;
        Loader.c cVarG;
        z1.k kVar = bVar.f5852c;
        i2.i iVar = new i2.i(bVar.f5850a, bVar.f5860k, kVar.e(), kVar.f(), j10, j11, kVar.d());
        long jC = this.f5826d.c(new androidx.media3.exoplayer.upstream.b.a(iVar, new i2.j(1, -1, null, 0, null, w1.c0.c1(bVar.f5859j), w1.c0.c1(this.B)), iOException, i10));
        if (jC == C.TIME_UNSET) {
            cVarG = Loader.f6093g;
            bVar2 = bVar;
        } else {
            int iB = B();
            bVar2 = bVar;
            cVarG = z(bVar2, iB) ? Loader.g(iB > this.L, jC) : Loader.f6092f;
        }
        boolean zC = cVarG.c();
        this.f5827e.m(iVar, 1, -1, null, 0, null, bVar2.f5859j, this.B, iOException, !zC);
        if (!zC) {
            this.f5826d.b(bVar2.f5850a);
        }
        return cVarG;
    }

    int Q(int i10, f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (W()) {
            return -3;
        }
        H(i10);
        int iL = this.f5842t[i10].L(f1Var, decoderInputBuffer, i11, this.M);
        if (iL == -3) {
            I(i10);
        }
        return iL;
    }

    public void R() {
        if (this.f5845w) {
            for (f0 f0Var : this.f5842t) {
                f0Var.K();
            }
        }
        this.f5834l.m(this);
        this.f5839q.removeCallbacksAndMessages(null);
        this.f5840r = null;
        this.N = true;
    }

    int U(int i10, long j10) throws Throwable {
        if (W()) {
            return 0;
        }
        H(i10);
        f0 f0Var = this.f5842t[i10];
        int iA = f0Var.A(j10, this.M);
        f0Var.W(iA);
        if (iA == 0) {
            I(i10);
        }
        return iA;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean a(i1 i1Var) {
        if (this.M || this.f5834l.h() || this.K) {
            return false;
        }
        if (this.f5845w && this.G == 0) {
            return false;
        }
        boolean zE = this.f5836n.e();
        if (this.f5834l.i()) {
            return zE;
        }
        V();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long c(long j10, j2 j2Var) {
        y();
        if (!this.A.isSeekable()) {
            return 0L;
        }
        o2.j0.a seekPoints = this.A.getSeekPoints(j10);
        return j2Var.a(j10, seekPoints.f48077a.f48082a, seekPoints.f48078b.f48082a);
    }

    @Override // o2.r
    public void d(final o2.j0 j0Var) {
        this.f5839q.post(new Runnable() { // from class: androidx.media3.exoplayer.source.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5811a.T(j0Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.q
    public void discardBuffer(long j10, boolean z10) {
        if (this.f5847y) {
            return;
        }
        y();
        if (E()) {
            return;
        }
        boolean[] zArr = this.f5848z.f5870c;
        int length = this.f5842t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f5842t[i10].o(j10, z10, zArr[i10]);
        }
    }

    @Override // androidx.media3.exoplayer.source.f0.d
    public void e(t1.o oVar) {
        this.f5839q.post(this.f5837o);
    }

    @Override // o2.r
    public void endTracks() {
        this.f5844v = true;
        this.f5839q.post(this.f5837o);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long f(k2.q[] qVarArr, boolean[] zArr, i2.q[] qVarArr2, boolean[] zArr2, long j10) {
        k2.q qVar;
        y();
        f fVar = this.f5848z;
        i2.v vVar = fVar.f5868a;
        boolean[] zArr3 = fVar.f5870c;
        int i10 = this.G;
        int i11 = 0;
        for (int i12 = 0; i12 < qVarArr.length; i12++) {
            i2.q qVar2 = qVarArr2[i12];
            if (qVar2 != null && (qVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) qVar2).f5864a;
                w1.a.g(zArr3[i13]);
                this.G--;
                zArr3[i13] = false;
                qVarArr2[i12] = null;
            }
        }
        boolean z10 = !this.E ? j10 == 0 || this.f5847y : i10 != 0;
        for (int i14 = 0; i14 < qVarArr.length; i14++) {
            if (qVarArr2[i14] == null && (qVar = qVarArr[i14]) != null) {
                w1.a.g(qVar.length() == 1);
                w1.a.g(qVar.getIndexInTrackGroup(0) == 0);
                int iD = vVar.d(qVar.getTrackGroup());
                w1.a.g(!zArr3[iD]);
                this.G++;
                zArr3[iD] = true;
                qVarArr2[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    f0 f0Var = this.f5842t[iD];
                    z10 = (f0Var.y() == 0 || f0Var.S(j10, true)) ? false : true;
                }
            }
        }
        if (this.G == 0) {
            this.K = false;
            this.F = false;
            if (this.f5834l.i()) {
                f0[] f0VarArr = this.f5842t;
                int length = f0VarArr.length;
                while (i11 < length) {
                    f0VarArr[i11].p();
                    i11++;
                }
                this.f5834l.e();
            } else {
                this.M = false;
                f0[] f0VarArr2 = this.f5842t;
                int length2 = f0VarArr2.length;
                while (i11 < length2) {
                    f0VarArr2[i11].O();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < qVarArr2.length) {
                if (qVarArr2[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.E = true;
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void g(q.a aVar, long j10) {
        this.f5840r = aVar;
        this.f5836n.e();
        V();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getBufferedPositionUs() {
        long jC;
        y();
        if (this.M || this.G == 0) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.J;
        }
        if (this.f5846x) {
            int length = this.f5842t.length;
            jC = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f5848z;
                if (fVar.f5869b[i10] && fVar.f5870c[i10] && !this.f5842t[i10].E()) {
                    jC = Math.min(jC, this.f5842t[i10].v());
                }
            }
        } else {
            jC = Long.MAX_VALUE;
        }
        if (jC == Long.MAX_VALUE) {
            jC = C(false);
        }
        return jC == Long.MIN_VALUE ? this.I : jC;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q
    public i2.v getTrackGroups() {
        y();
        return this.f5848z.f5868a;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f5834l.i() && this.f5836n.d();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void maybeThrowPrepareError() throws IOException {
        J();
        if (this.M && !this.f5845w) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public void onLoaderReleased() {
        for (f0 f0Var : this.f5842t) {
            f0Var.M();
        }
        this.f5835m.release();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long readDiscontinuity() {
        if (!this.F) {
            return C.TIME_UNSET;
        }
        if (!this.M && B() <= this.L) {
            return C.TIME_UNSET;
        }
        this.F = false;
        return this.I;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long seekToUs(long j10) {
        y();
        boolean[] zArr = this.f5848z.f5869b;
        if (!this.A.isSeekable()) {
            j10 = 0;
        }
        int i10 = 0;
        this.F = false;
        this.I = j10;
        if (E()) {
            this.J = j10;
            return j10;
        }
        if (this.D == 7 || ((!this.M && !this.f5834l.i()) || !S(zArr, j10))) {
            this.K = false;
            this.J = j10;
            this.M = false;
            if (this.f5834l.i()) {
                f0[] f0VarArr = this.f5842t;
                int length = f0VarArr.length;
                while (i10 < length) {
                    f0VarArr[i10].p();
                    i10++;
                }
                this.f5834l.e();
                return j10;
            }
            this.f5834l.f();
            f0[] f0VarArr2 = this.f5842t;
            int length2 = f0VarArr2.length;
            while (i10 < length2) {
                f0VarArr2[i10].O();
                i10++;
            }
        }
        return j10;
    }

    @Override // o2.r
    public o0 track(int i10, int i11) {
        return P(new e(i10, false));
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void reevaluateBuffer(long j10) {
    }
}
