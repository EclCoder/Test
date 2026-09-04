package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o9.j0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class y implements o, u9.m, Loader.b, Loader.f, c0.d {
    private static final Map M = y();
    private static final v0 N = new v0.b().U("icy").g0("application/x-icy").G();
    private boolean A;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private long G;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f18264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nb.j f18265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f18266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f18267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q.a f18268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f18269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f18270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nb.b f18271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f18272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f18273j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t f18275l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o.a f18280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private la.b f18281r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f18284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f18285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e f18287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private u9.z f18288y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Loader f18274k = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ob.g f18276m = new ob.g();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f18277n = new Runnable() { // from class: com.google.android.exoplayer2.source.u
        @Override // java.lang.Runnable
        public final void run() {
            this.f18259a.E();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f18278o = new Runnable() { // from class: com.google.android.exoplayer2.source.v
        @Override // java.lang.Runnable
        public final void run() {
            y.j(this.f18260a);
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f18279p = r0.w();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d[] f18283t = new d[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c0[] f18282s = new c0[0];
    private long H = C.TIME_UNSET;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f18289z = C.TIME_UNSET;
    private int B = 1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class a implements Loader.e, l.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f18291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nb.z f18292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t f18293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final u9.m f18294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ob.g f18295f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f18297h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f18299j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private u9.b0 f18301l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f18302m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final u9.y f18296g = new u9.y();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f18298i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f18290a = ra.i.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.a f18300k = g(0);

        public a(Uri uri, nb.j jVar, t tVar, u9.m mVar, ob.g gVar) {
            this.f18291b = uri;
            this.f18292c = new nb.z(jVar);
            this.f18293d = tVar;
            this.f18294e = mVar;
            this.f18295f = gVar;
        }

        private com.google.android.exoplayer2.upstream.a g(long j10) {
            return new com.google.android.exoplayer2.upstream.a.b().i(this.f18291b).h(j10).f(y.this.f18272i).b(6).e(y.M).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(long j10, long j11) {
            this.f18296g.f54333a = j10;
            this.f18299j = j11;
            this.f18298i = true;
            this.f18302m = false;
        }

        @Override // com.google.android.exoplayer2.source.l.a
        public void a(ob.d0 d0Var) {
            long jMax = !this.f18302m ? this.f18299j : Math.max(y.this.A(true), this.f18299j);
            int iA = d0Var.a();
            u9.b0 b0Var = (u9.b0) ob.a.e(this.f18301l);
            b0Var.c(d0Var, iA);
            b0Var.f(jMax, 1, iA, 0, null);
            this.f18302m = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void cancelLoad() {
            this.f18297h = true;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0027 */
        @Override // com.google.android.exoplayer2.upstream.Loader.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void load() {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.y.a.load():void");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        void b(long j10, boolean z10, boolean z11);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements ra.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18304a;

        public c(int i10) {
            this.f18304a = i10;
        }

        @Override // ra.s
        public int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            return y.this.O(this.f18304a, pVar, decoderInputBuffer, i10);
        }

        @Override // ra.s
        public boolean isReady() {
            return y.this.D(this.f18304a);
        }

        @Override // ra.s
        public void maybeThrowError() throws IOException {
            y.this.I(this.f18304a);
        }

        @Override // ra.s
        public int skipData(long j10) {
            return y.this.S(this.f18304a, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18307b;

        public d(int i10, boolean z10) {
            this.f18306a = i10;
            this.f18307b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f18306a == dVar.f18306a && this.f18307b == dVar.f18307b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f18306a * 31) + (this.f18307b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ra.x f18308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f18309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f18310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f18311d;

        public e(ra.x xVar, boolean[] zArr) {
            this.f18308a = xVar;
            this.f18309b = zArr;
            int i10 = xVar.f51256a;
            this.f18310c = new boolean[i10];
            this.f18311d = new boolean[i10];
        }
    }

    public y(Uri uri, nb.j jVar, t tVar, com.google.android.exoplayer2.drm.j jVar2, com.google.android.exoplayer2.drm.i.a aVar, com.google.android.exoplayer2.upstream.c cVar, q.a aVar2, b bVar, nb.b bVar2, String str, int i10) {
        this.f18264a = uri;
        this.f18265b = jVar;
        this.f18266c = jVar2;
        this.f18269f = aVar;
        this.f18267d = cVar;
        this.f18268e = aVar2;
        this.f18270g = bVar;
        this.f18271h = bVar2;
        this.f18272i = str;
        this.f18273j = i10;
        this.f18275l = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f18282s.length; i10++) {
            if (z10 || ((e) ob.a.e(this.f18287x)).f18310c[i10]) {
                jMax = Math.max(jMax, this.f18282s[i10].z());
            }
        }
        return jMax;
    }

    private boolean C() {
        return this.H != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.L || this.f18285v || !this.f18284u || this.f18288y == null) {
            return;
        }
        for (c0 c0Var : this.f18282s) {
            if (c0Var.F() == null) {
                return;
            }
        }
        this.f18276m.c();
        int length = this.f18282s.length;
        ra.v[] vVarArr = new ra.v[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            v0 v0VarG = (v0) ob.a.e(this.f18282s[i10].F());
            String str = v0VarG.f18868l;
            boolean zO = ob.y.o(str);
            boolean z10 = zO || ob.y.s(str);
            zArr[i10] = z10;
            this.f18286w = z10 | this.f18286w;
            la.b bVar = this.f18281r;
            if (bVar != null) {
                if (zO || this.f18283t[i10].f18307b) {
                    ha.a aVar = v0VarG.f18866j;
                    v0VarG = v0VarG.b().Z(aVar == null ? new ha.a(bVar) : aVar.a(bVar)).G();
                }
                if (zO && v0VarG.f18862f == -1 && v0VarG.f18863g == -1 && bVar.f44069a != -1) {
                    v0VarG = v0VarG.b().I(bVar.f44069a).G();
                }
            }
            vVarArr[i10] = new ra.v(Integer.toString(i10), v0VarG.c(this.f18266c.b(v0VarG)));
        }
        this.f18287x = new e(new ra.x(vVarArr), zArr);
        this.f18285v = true;
        ((o.a) ob.a.e(this.f18280q)).g(this);
    }

    private void F(int i10) {
        w();
        e eVar = this.f18287x;
        boolean[] zArr = eVar.f18311d;
        if (zArr[i10]) {
            return;
        }
        v0 v0VarC = eVar.f18308a.b(i10).c(0);
        this.f18268e.h(ob.y.k(v0VarC.f18868l), v0VarC, 0, null, this.G);
        zArr[i10] = true;
    }

    private void G(int i10) {
        w();
        boolean[] zArr = this.f18287x.f18309b;
        if (this.I && zArr[i10]) {
            if (this.f18282s[i10].K(false)) {
                return;
            }
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (c0 c0Var : this.f18282s) {
                c0Var.U();
            }
            ((o.a) ob.a.e(this.f18280q)).c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        this.f18279p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f18261a.F = true;
            }
        });
    }

    private u9.b0 N(d dVar) {
        int length = this.f18282s.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f18283t[i10])) {
                return this.f18282s[i10];
            }
        }
        c0 c0VarK = c0.k(this.f18271h, this.f18266c, this.f18269f);
        c0VarK.c0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f18283t, i11);
        dVarArr[length] = dVar;
        this.f18283t = (d[]) r0.k(dVarArr);
        c0[] c0VarArr = (c0[]) Arrays.copyOf(this.f18282s, i11);
        c0VarArr[length] = c0VarK;
        this.f18282s = (c0[]) r0.k(c0VarArr);
        return c0VarK;
    }

    private boolean Q(boolean[] zArr, long j10) {
        int length = this.f18282s.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f18282s[i10].Y(j10, false) && (zArr[i10] || !this.f18286w)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(u9.z zVar) {
        this.f18288y = this.f18281r == null ? zVar : new u9.z.b(C.TIME_UNSET);
        this.f18289z = zVar.getDurationUs();
        boolean z10 = !this.F && zVar.getDurationUs() == C.TIME_UNSET;
        this.A = z10;
        this.B = z10 ? 7 : 1;
        this.f18270g.b(this.f18289z, zVar.isSeekable(), this.A);
        if (this.f18285v) {
            return;
        }
        E();
    }

    private void T() {
        a aVar = new a(this.f18264a, this.f18265b, this.f18275l, this, this.f18276m);
        if (this.f18285v) {
            ob.a.g(C());
            long j10 = this.f18289z;
            if (j10 != C.TIME_UNSET && this.H > j10) {
                this.K = true;
                this.H = C.TIME_UNSET;
                return;
            }
            aVar.h(((u9.z) ob.a.e(this.f18288y)).getSeekPoints(this.H).f54334a.f54232b, this.H);
            for (c0 c0Var : this.f18282s) {
                c0Var.a0(this.H);
            }
            this.H = C.TIME_UNSET;
        }
        this.J = z();
        this.f18268e.t(new ra.i(aVar.f18290a, aVar.f18300k, this.f18274k.m(aVar, this, this.f18267d.a(this.B))), 1, -1, null, 0, null, aVar.f18299j, this.f18289z);
    }

    private boolean U() {
        return this.D || C();
    }

    public static /* synthetic */ void j(y yVar) {
        if (yVar.L) {
            return;
        }
        ((o.a) ob.a.e(yVar.f18280q)).c(yVar);
    }

    private void w() {
        ob.a.g(this.f18285v);
        ob.a.e(this.f18287x);
        ob.a.e(this.f18288y);
    }

    private boolean x(a aVar, int i10) {
        u9.z zVar;
        if (this.F || !((zVar = this.f18288y) == null || zVar.getDurationUs() == C.TIME_UNSET)) {
            this.J = i10;
            return true;
        }
        if (this.f18285v && !U()) {
            this.I = true;
            return false;
        }
        this.D = this.f18285v;
        this.G = 0L;
        this.J = 0;
        for (c0 c0Var : this.f18282s) {
            c0Var.U();
        }
        aVar.h(0L, 0L);
        return true;
    }

    private static Map y() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int z() {
        int iG = 0;
        for (c0 c0Var : this.f18282s) {
            iG += c0Var.G();
        }
        return iG;
    }

    u9.b0 B() {
        return N(new d(0, true));
    }

    boolean D(int i10) {
        return !U() && this.f18282s[i10].K(this.K);
    }

    void H() throws IOException {
        this.f18274k.j(this.f18267d.a(this.B));
    }

    void I(int i10) throws IOException {
        this.f18282s[i10].M();
        H();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void e(a aVar, long j10, long j11, boolean z10) {
        nb.z zVar = aVar.f18292c;
        ra.i iVar = new ra.i(aVar.f18290a, aVar.f18300k, zVar.i(), zVar.j(), j10, j11, zVar.f());
        this.f18267d.b(aVar.f18290a);
        this.f18268e.k(iVar, 1, -1, null, 0, null, aVar.f18299j, this.f18289z);
        if (z10) {
            return;
        }
        for (c0 c0Var : this.f18282s) {
            c0Var.U();
        }
        if (this.E > 0) {
            ((o.a) ob.a.e(this.f18280q)).c(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void i(a aVar, long j10, long j11) {
        u9.z zVar;
        if (this.f18289z == C.TIME_UNSET && (zVar = this.f18288y) != null) {
            boolean zIsSeekable = zVar.isSeekable();
            long jA = A(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.f18289z = j12;
            this.f18270g.b(j12, zIsSeekable, this.A);
        }
        nb.z zVar2 = aVar.f18292c;
        ra.i iVar = new ra.i(aVar.f18290a, aVar.f18300k, zVar2.i(), zVar2.j(), j10, j11, zVar2.f());
        this.f18267d.b(aVar.f18290a);
        this.f18268e.n(iVar, 1, -1, null, 0, null, aVar.f18299j, this.f18289z);
        this.K = true;
        ((o.a) ob.a.e(this.f18280q)).c(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Loader.c n(a aVar, long j10, long j11, IOException iOException, int i10) {
        a aVar2;
        Loader.c cVarG;
        nb.z zVar = aVar.f18292c;
        ra.i iVar = new ra.i(aVar.f18290a, aVar.f18300k, zVar.i(), zVar.j(), j10, j11, zVar.f());
        long jC = this.f18267d.c(new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(1, -1, null, 0, null, r0.i1(aVar.f18299j), r0.i1(this.f18289z)), iOException, i10));
        if (jC == C.TIME_UNSET) {
            cVarG = Loader.f18746g;
            aVar2 = aVar;
        } else {
            int iZ = z();
            aVar2 = aVar;
            cVarG = x(aVar2, iZ) ? Loader.g(iZ > this.J, jC) : Loader.f18745f;
        }
        boolean zC = cVarG.c();
        this.f18268e.p(iVar, 1, -1, null, 0, null, aVar2.f18299j, this.f18289z, iOException, !zC);
        if (!zC) {
            this.f18267d.b(aVar2.f18290a);
        }
        return cVarG;
    }

    int O(int i10, o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (U()) {
            return -3;
        }
        F(i10);
        int iR = this.f18282s[i10].R(pVar, decoderInputBuffer, i11, this.K);
        if (iR == -3) {
            G(i10);
        }
        return iR;
    }

    public void P() {
        if (this.f18285v) {
            for (c0 c0Var : this.f18282s) {
                c0Var.Q();
            }
        }
        this.f18274k.l(this);
        this.f18279p.removeCallbacksAndMessages(null);
        this.f18280q = null;
        this.L = true;
    }

    int S(int i10, long j10) throws Throwable {
        if (U()) {
            return 0;
        }
        F(i10);
        c0 c0Var = this.f18282s[i10];
        int iE = c0Var.E(j10, this.K);
        c0Var.d0(iE);
        if (iE == 0) {
            G(i10);
        }
        return iE;
    }

    @Override // com.google.android.exoplayer2.source.c0.d
    public void a(v0 v0Var) {
        this.f18279p.post(this.f18277n);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        w();
        if (!this.f18288y.isSeekable()) {
            return 0L;
        }
        u9.z.a seekPoints = this.f18288y.getSeekPoints(j10);
        return j0Var.a(j10, seekPoints.f54334a.f54231a, seekPoints.f54335b.f54231a);
    }

    @Override // u9.m
    public void c(final u9.z zVar) {
        this.f18279p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f18262a.R(zVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        if (this.K || this.f18274k.h() || this.I) {
            return false;
        }
        if (this.f18285v && this.E == 0) {
            return false;
        }
        boolean zE = this.f18276m.e();
        if (this.f18274k.i()) {
            return zE;
        }
        T();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(o.a aVar, long j10) {
        this.f18280q = aVar;
        this.f18276m.e();
        T();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
        w();
        if (C()) {
            return;
        }
        boolean[] zArr = this.f18287x.f18310c;
        int length = this.f18282s.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f18282s[i10].q(j10, z10, zArr[i10]);
        }
    }

    @Override // u9.m
    public void endTracks() {
        this.f18284u = true;
        this.f18279p.post(this.f18277n);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10) {
        lb.r rVar;
        w();
        e eVar = this.f18287x;
        ra.x xVar = eVar.f18308a;
        boolean[] zArr3 = eVar.f18310c;
        int i10 = this.E;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            ra.s sVar = sVarArr[i12];
            if (sVar != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) sVar).f18304a;
                ob.a.g(zArr3[i13]);
                this.E--;
                zArr3[i13] = false;
                sVarArr[i12] = null;
            }
        }
        boolean z10 = !this.C ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (sVarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                ob.a.g(rVar.length() == 1);
                ob.a.g(rVar.getIndexInTrackGroup(0) == 0);
                int iC = xVar.c(rVar.getTrackGroup());
                ob.a.g(!zArr3[iC]);
                this.E++;
                zArr3[iC] = true;
                sVarArr[i14] = new c(iC);
                zArr2[i14] = true;
                if (!z10) {
                    c0 c0Var = this.f18282s[iC];
                    z10 = (c0Var.Y(j10, true) || c0Var.C() == 0) ? false : true;
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            if (this.f18274k.i()) {
                c0[] c0VarArr = this.f18282s;
                int length = c0VarArr.length;
                while (i11 < length) {
                    c0VarArr[i11].r();
                    i11++;
                }
                this.f18274k.e();
            } else {
                c0[] c0VarArr2 = this.f18282s;
                int length2 = c0VarArr2.length;
                while (i11 < length2) {
                    c0VarArr2[i11].U();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < sVarArr.length) {
                if (sVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.C = true;
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        long jA;
        w();
        if (this.K || this.E == 0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.H;
        }
        if (this.f18286w) {
            int length = this.f18282s.length;
            jA = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f18287x;
                if (eVar.f18309b[i10] && eVar.f18310c[i10] && !this.f18282s[i10].J()) {
                    jA = Math.min(jA, this.f18282s[i10].z());
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = A(false);
        }
        return jA == Long.MIN_VALUE ? this.G : jA;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o
    public ra.x getTrackGroups() {
        w();
        return this.f18287x.f18308a;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f18274k.i() && this.f18276m.d();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() throws IOException {
        H();
        if (this.K && !this.f18285v) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void onLoaderReleased() {
        for (c0 c0Var : this.f18282s) {
            c0Var.S();
        }
        this.f18275l.release();
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        if (!this.D) {
            return C.TIME_UNSET;
        }
        if (!this.K && z() <= this.J) {
            return C.TIME_UNSET;
        }
        this.D = false;
        return this.G;
    }

    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) {
        w();
        boolean[] zArr = this.f18287x.f18309b;
        if (!this.f18288y.isSeekable()) {
            j10 = 0;
        }
        int i10 = 0;
        this.D = false;
        this.G = j10;
        if (C()) {
            this.H = j10;
            return j10;
        }
        if (this.B == 7 || !Q(zArr, j10)) {
            this.I = false;
            this.H = j10;
            this.K = false;
            if (this.f18274k.i()) {
                c0[] c0VarArr = this.f18282s;
                int length = c0VarArr.length;
                while (i10 < length) {
                    c0VarArr[i10].r();
                    i10++;
                }
                this.f18274k.e();
                return j10;
            }
            this.f18274k.f();
            c0[] c0VarArr2 = this.f18282s;
            int length2 = c0VarArr2.length;
            while (i10 < length2) {
                c0VarArr2[i10].U();
                i10++;
            }
        }
        return j10;
    }

    @Override // u9.m
    public u9.b0 track(int i10, int i11) {
        return N(new d(i10, false));
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
    }
}
