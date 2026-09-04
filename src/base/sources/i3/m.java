package i3;

import androidx.media3.common.ParserException;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import o2.b0;
import o2.i0;
import o2.j0;
import o2.k0;
import o2.n0;
import o2.o0;
import o2.p0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m implements o2.p, j0 {
    public static final o2.u B = new o2.u() { // from class: i3.l
        @Override // o2.u
        public final o2.p[] createExtractors() {
            return m.i();
        }
    };
    private d3.a A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l3.r.a f40913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f40915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.u f40916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w1.u f40917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w1.u f40918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f40919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f40920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f40921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c0 f40922j = c0.C();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f40924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f40925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f40926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private w1.u f40927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f40929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f40930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f40931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f40932t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private o2.r f40933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a[] f40934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long[][] f40935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f40936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f40937y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f40938z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f40939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f40940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o0 f40941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p0 f40942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40943e;

        public a(s sVar, v vVar, o0 o0Var) {
            this.f40939a = sVar;
            this.f40940b = vVar;
            this.f40941c = o0Var;
            this.f40942d = MimeTypes.AUDIO_TRUEHD.equals(sVar.f40963f.f52757n) ? new p0() : null;
        }
    }

    public m(l3.r.a aVar, int i10) {
        this.f40913a = aVar;
        this.f40914b = i10;
        this.f40923k = (i10 & 4) != 0 ? 3 : 0;
        this.f40920h = new p();
        this.f40921i = new ArrayList();
        this.f40918f = new w1.u(16);
        this.f40919g = new ArrayDeque();
        this.f40915c = new w1.u(x1.d.f56574a);
        this.f40916d = new w1.u(4);
        this.f40917e = new w1.u();
        this.f40928p = -1;
        this.f40933u = o2.r.A2;
        this.f40934v = new a[0];
    }

    private int A(o2.q qVar, i0 i0Var) throws ParserException {
        int iC = this.f40920h.c(qVar, i0Var, this.f40921i);
        if (iC == 1 && i0Var.f48076a == 0) {
            l();
        }
        return iC;
    }

    private static boolean B(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean C(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void D(a aVar, long j10) {
        v vVar = aVar.f40940b;
        int iA = vVar.a(j10);
        if (iA == -1) {
            iA = vVar.b(j10);
        }
        aVar.f40943e = iA;
    }

    public static /* synthetic */ o2.p[] i() {
        return new o2.p[]{new m(l3.r.a.f43873a, 16)};
    }

    private static int j(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] k(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f40940b.f40993b];
            jArr2[i10] = aVarArr[i10].f40940b.f40997f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            v vVar = aVarArr[i12].f40940b;
            j10 += (long) vVar.f40995d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = vVar.f40997f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void l() {
        this.f40923k = 0;
        this.f40926n = 0;
    }

    private static int o(v vVar, long j10) {
        int iA = vVar.a(j10);
        return iA == -1 ? vVar.b(j10) : iA;
    }

    private int p(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f40934v;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f40943e;
            v vVar = aVar.f40940b;
            if (i13 != vVar.f40993b) {
                long j14 = vVar.f40994c[i13];
                long j15 = ((long[][]) w1.c0.h(this.f40935w))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    z10 = z12;
                    j11 = j15;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    private static long q(v vVar, long j10, long j11) {
        int iO = o(vVar, j10);
        return iO == -1 ? j11 : Math.min(vVar.f40994c[iO], j11);
    }

    private void r(o2.q qVar) {
        this.f40917e.P(8);
        qVar.peekFully(this.f40917e.e(), 0, 8);
        b.f(this.f40917e);
        qVar.skipFully(this.f40917e.f());
        qVar.resetPeekPosition();
    }

    private void s(long j10) {
        while (!this.f40919g.isEmpty() && ((i3.a.C0621a) this.f40919g.peek()).f40822b == j10) {
            i3.a.C0621a c0621a = (i3.a.C0621a) this.f40919g.pop();
            if (c0621a.f40821a == 1836019574) {
                v(c0621a);
                this.f40919g.clear();
                this.f40923k = 2;
            } else if (!this.f40919g.isEmpty()) {
                ((i3.a.C0621a) this.f40919g.peek()).d(c0621a);
            }
        }
        if (this.f40923k != 2) {
            l();
        }
    }

    private void t() {
        if (this.f40938z != 2 || (this.f40914b & 2) == 0) {
            return;
        }
        this.f40933u.track(0, 4).b(new t1.o.b().h0(this.A == null ? null : new t1.u(this.A)).K());
        this.f40933u.endTracks();
        this.f40933u.d(new j0.b(C.TIME_UNSET));
    }

    private static int u(w1.u uVar) {
        uVar.T(8);
        int iJ = j(uVar.p());
        if (iJ != 0) {
            return iJ;
        }
        uVar.U(4);
        while (uVar.a() > 0) {
            int iJ2 = j(uVar.p());
            if (iJ2 != 0) {
                return iJ2;
            }
        }
        return 0;
    }

    private void v(i3.a.C0621a c0621a) {
        t1.u uVar;
        int i10;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f40938z == 1;
        b0 b0Var = new b0();
        i3.a.b bVarG = c0621a.g(1969517665);
        if (bVarG != null) {
            t1.u uVarC = b.C(bVarG);
            b0Var.c(uVarC);
            uVar = uVarC;
        } else {
            uVar = null;
        }
        i3.a.C0621a c0621aF = c0621a.f(1835365473);
        t1.u uVarP = c0621aF != null ? b.p(c0621aF) : null;
        t1.u uVar2 = new t1.u(b.r(((i3.a.b) w1.a.e(c0621a.g(1836476516))).f40825b));
        int i11 = 0;
        int i12 = 0;
        long j10 = C.TIME_UNSET;
        int size = -1;
        for (List listB = b.B(c0621a, b0Var, C.TIME_UNSET, null, (this.f40914b & 1) != 0, z10, new sc.g() { // from class: i3.k
            @Override // sc.g
            public final Object apply(Object obj) {
                return m.h((s) obj);
            }
        }); i11 < listB.size(); listB = listB) {
            v vVar = (v) listB.get(i11);
            if (vVar.f40993b != 0) {
                s sVar = vVar.f40992a;
                long j11 = j10;
                long j12 = sVar.f40962e;
                if (j12 == C.TIME_UNSET) {
                    j12 = vVar.f40999h;
                }
                long jMax = Math.max(j11, j12);
                int i13 = i12 + 1;
                a aVar = new a(sVar, vVar, this.f40933u.track(i12, sVar.f40959b));
                int i14 = MimeTypes.AUDIO_TRUEHD.equals(sVar.f40963f.f52757n) ? vVar.f40996e * 16 : vVar.f40996e + 30;
                t1.o.b bVarA = sVar.f40963f.a();
                bVarA.f0(i14);
                if (sVar.f40959b == 2) {
                    if ((this.f40914b & 8) != 0) {
                        bVarA.m0(sVar.f40963f.f52749f | (size == -1 ? 1 : 2));
                    }
                    if (j12 > 0 && (i10 = vVar.f40993b) > 0) {
                        bVarA.X(i10 / (j12 / 1000000.0f));
                    }
                }
                j.k(sVar.f40959b, b0Var, bVarA);
                j.l(sVar.f40959b, uVarP, bVarA, this.f40921i.isEmpty() ? null : new t1.u(this.f40921i), uVar, uVar2);
                aVar.f40941c.b(bVarA.K());
                if (sVar.f40959b == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList.add(aVar);
                i12 = i13;
                j10 = jMax;
            }
            i11++;
        }
        this.f40936x = size;
        this.f40937y = j10;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f40934v = aVarArr;
        this.f40935w = k(aVarArr);
        this.f40933u.endTracks();
        this.f40933u.d(this);
    }

    private void w(long j10) {
        if (this.f40924l == 1836086884) {
            int i10 = this.f40926n;
            this.A = new d3.a(0L, j10, C.TIME_UNSET, j10 + ((long) i10), this.f40925m - ((long) i10));
        }
    }

    private boolean x(o2.q qVar) throws ParserException {
        i3.a.C0621a c0621a;
        if (this.f40926n == 0) {
            if (!qVar.readFully(this.f40918f.e(), 0, 8, true)) {
                t();
                return false;
            }
            this.f40926n = 8;
            this.f40918f.T(0);
            this.f40925m = this.f40918f.I();
            this.f40924l = this.f40918f.p();
        }
        long j10 = this.f40925m;
        if (j10 == 1) {
            qVar.readFully(this.f40918f.e(), 8, 8);
            this.f40926n += 8;
            this.f40925m = this.f40918f.L();
        } else if (j10 == 0) {
            long length = qVar.getLength();
            if (length == -1 && (c0621a = (i3.a.C0621a) this.f40919g.peek()) != null) {
                length = c0621a.f40822b;
            }
            if (length != -1) {
                this.f40925m = (length - qVar.getPosition()) + ((long) this.f40926n);
            }
        }
        if (this.f40925m < this.f40926n) {
            throw ParserException.c("Atom size less than header length (unsupported).");
        }
        if (B(this.f40924l)) {
            long position = qVar.getPosition();
            long j11 = this.f40925m;
            int i10 = this.f40926n;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f40924l == 1835365473) {
                r(qVar);
            }
            this.f40919g.push(new i3.a.C0621a(this.f40924l, j12));
            if (this.f40925m == this.f40926n) {
                s(j12);
            } else {
                l();
            }
        } else if (C(this.f40924l)) {
            w1.a.g(this.f40926n == 8);
            w1.a.g(this.f40925m <= 2147483647L);
            w1.u uVar = new w1.u((int) this.f40925m);
            System.arraycopy(this.f40918f.e(), 0, uVar.e(), 0, 8);
            this.f40927o = uVar;
            this.f40923k = 1;
        } else {
            w(qVar.getPosition() - ((long) this.f40926n));
            this.f40927o = null;
            this.f40923k = 1;
        }
        return true;
    }

    private boolean y(o2.q qVar, i0 i0Var) {
        boolean z10;
        long j10 = this.f40925m - ((long) this.f40926n);
        long position = qVar.getPosition() + j10;
        w1.u uVar = this.f40927o;
        if (uVar == null) {
            if (!this.f40932t && this.f40924l == 1835295092) {
                this.f40938z = 1;
            }
            if (j10 < 262144) {
                qVar.skipFully((int) j10);
            } else {
                i0Var.f48076a = qVar.getPosition() + j10;
                z10 = true;
            }
            s(position);
            return (z10 || this.f40923k == 2) ? false : true;
        }
        qVar.readFully(uVar.e(), this.f40926n, (int) j10);
        if (this.f40924l == 1718909296) {
            this.f40932t = true;
            this.f40938z = u(uVar);
        } else if (!this.f40919g.isEmpty()) {
            ((i3.a.C0621a) this.f40919g.peek()).e(new i3.a.b(this.f40924l, uVar));
        }
        z10 = false;
        s(position);
        if (z10) {
        }
    }

    private int z(o2.q qVar, i0 i0Var) throws ParserException {
        int i10;
        long position = qVar.getPosition();
        if (this.f40928p == -1) {
            int iP = p(position);
            this.f40928p = iP;
            if (iP == -1) {
                return -1;
            }
        }
        a aVar = this.f40934v[this.f40928p];
        o0 o0Var = aVar.f40941c;
        int i11 = aVar.f40943e;
        v vVar = aVar.f40940b;
        long j10 = vVar.f40994c[i11];
        int i12 = vVar.f40995d[i11];
        p0 p0Var = aVar.f40942d;
        long j11 = (j10 - position) + ((long) this.f40929q);
        if (j11 < 0 || j11 >= 262144) {
            i0Var.f48076a = j10;
            return 1;
        }
        if (aVar.f40939a.f40964g == 1) {
            j11 += 8;
            i12 -= 8;
        }
        qVar.skipFully((int) j11);
        s sVar = aVar.f40939a;
        if (sVar.f40967j == 0) {
            if ("audio/ac4".equals(sVar.f40963f.f52757n)) {
                if (this.f40930r == 0) {
                    o2.c.a(i12, this.f40917e);
                    o0Var.c(this.f40917e, 7);
                    this.f40930r += 7;
                }
                i12 += 7;
            } else if (p0Var != null) {
                p0Var.d(qVar);
            }
            while (true) {
                int i13 = this.f40930r;
                if (i13 >= i12) {
                    break;
                }
                int iA = o0Var.a(qVar, i12 - i13, false);
                this.f40929q += iA;
                this.f40930r += iA;
                this.f40931s -= iA;
            }
        } else {
            byte[] bArrE = this.f40916d.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i14 = aVar.f40939a.f40967j;
            int i15 = 4 - i14;
            while (this.f40930r < i12) {
                int i16 = this.f40931s;
                if (i16 == 0) {
                    qVar.readFully(bArrE, i15, i14);
                    this.f40929q += i14;
                    this.f40916d.T(0);
                    int iP2 = this.f40916d.p();
                    if (iP2 < 0) {
                        throw ParserException.a("Invalid NAL length", null);
                    }
                    this.f40931s = iP2;
                    this.f40915c.T(0);
                    o0Var.c(this.f40915c, 4);
                    this.f40930r += 4;
                    i12 += i15;
                } else {
                    int iA2 = o0Var.a(qVar, i16, false);
                    this.f40929q += iA2;
                    this.f40930r += iA2;
                    this.f40931s -= iA2;
                }
            }
        }
        int i17 = i12;
        v vVar2 = aVar.f40940b;
        long j12 = vVar2.f40997f[i11];
        int i18 = vVar2.f40998g[i11];
        if (p0Var != null) {
            i10 = 0;
            p0Var.c(o0Var, j12, i18, i17, 0, null);
            if (i11 + 1 == aVar.f40940b.f40993b) {
                p0Var.a(o0Var, null);
            }
        } else {
            i10 = 0;
            o0Var.e(j12, i18, i17, 0, null);
        }
        aVar.f40943e++;
        this.f40928p = -1;
        this.f40929q = i10;
        this.f40930r = i10;
        this.f40931s = i10;
        return i10;
    }

    @Override // o2.p
    public int b(o2.q qVar, i0 i0Var) {
        while (true) {
            int i10 = this.f40923k;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return z(qVar, i0Var);
                    }
                    if (i10 == 3) {
                        return A(qVar, i0Var);
                    }
                    throw new IllegalStateException();
                }
                if (y(qVar, i0Var)) {
                    return 1;
                }
            } else if (!x(qVar)) {
                return -1;
            }
        }
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        if ((this.f40914b & 16) == 0) {
            rVar = new l3.t(rVar, this.f40913a);
        }
        this.f40933u = rVar;
    }

    @Override // o2.p
    public boolean d(o2.q qVar) {
        n0 n0VarD = r.d(qVar, (this.f40914b & 2) != 0);
        this.f40922j = n0VarD != null ? c0.D(n0VarD) : c0.C();
        return n0VarD == null;
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f40937y;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        return m(j10, -1);
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[EDGE_INSN: B:43:0x0080->B:37:0x0080 BREAK  A[LOOP:0: B:28:0x0063->B:36:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[SYNTHETIC] */
    public j0.a m(long j10, int i10) {
        long j11;
        long j12;
        long jQ;
        long j13;
        int i11;
        a[] aVarArr;
        v vVar;
        int iB;
        a[] aVarArr2 = this.f40934v;
        if (aVarArr2.length == 0) {
            return new j0.a(k0.f48081c);
        }
        int i12 = i10 != -1 ? i10 : this.f40936x;
        if (i12 != -1) {
            v vVar2 = aVarArr2[i12].f40940b;
            int iO = o(vVar2, j10);
            if (iO == -1) {
                return new j0.a(k0.f48081c);
            }
            j12 = vVar2.f40997f[iO];
            j11 = vVar2.f40994c[iO];
            if (j12 < j10 && iO < vVar2.f40993b - 1 && (iB = vVar2.b(j10)) != -1 && iB != iO) {
                j13 = vVar2.f40997f[iB];
                jQ = vVar2.f40994c[iB];
            }
            if (i10 == -1) {
                i11 = 0;
                while (true) {
                    aVarArr = this.f40934v;
                    if (i11 < aVarArr.length) {
                        break;
                    }
                    if (i11 != this.f40936x) {
                        vVar = aVarArr[i11].f40940b;
                        long jQ2 = q(vVar, j12, j11);
                        if (j13 != C.TIME_UNSET) {
                            jQ = q(vVar, j13, jQ);
                        }
                        j11 = jQ2;
                    }
                    i11++;
                }
            }
            k0 k0Var = new k0(j12, j11);
            return j13 == C.TIME_UNSET ? new j0.a(k0Var) : new j0.a(k0Var, new k0(j13, jQ));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        jQ = -1;
        j13 = -9223372036854775807L;
        if (i10 == -1) {
            i11 = 0;
            while (true) {
                aVarArr = this.f40934v;
                if (i11 < aVarArr.length) {
                    break;
                    break;
                }
                if (i11 != this.f40936x) {
                    vVar = aVarArr[i11].f40940b;
                    long jQ3 = q(vVar, j12, j11);
                    if (j13 != C.TIME_UNSET) {
                        jQ = q(vVar, j13, jQ);
                    }
                    j11 = jQ3;
                }
                i11++;
            }
        }
        k0 k0Var2 = new k0(j12, j11);
        if (j13 == C.TIME_UNSET) {
        }
    }

    @Override // o2.p
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c0 f() {
        return this.f40922j;
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f40919g.clear();
        this.f40926n = 0;
        this.f40928p = -1;
        this.f40929q = 0;
        this.f40930r = 0;
        this.f40931s = 0;
        if (j10 == 0) {
            if (this.f40923k != 3) {
                l();
                return;
            } else {
                this.f40920h.g();
                this.f40921i.clear();
                return;
            }
        }
        for (a aVar : this.f40934v) {
            D(aVar, j11);
            p0 p0Var = aVar.f40942d;
            if (p0Var != null) {
                p0Var.b();
            }
        }
    }

    @Override // o2.p
    public void release() {
    }

    public static /* synthetic */ s h(s sVar) {
        return sVar;
    }
}
