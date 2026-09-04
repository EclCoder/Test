package ca;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import ob.d0;
import ob.r0;
import u9.a0;
import u9.b0;
import u9.c0;
import u9.v;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements u9.k, z {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final u9.p f9781y = new u9.p() { // from class: ca.j
        @Override // u9.p
        public final u9.k[] createExtractors() {
            return k.f();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f9783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f9784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f9785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f9786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f9787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f9788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f9789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f9792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d0 f9794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f9796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f9798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private u9.m f9799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a[] f9800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[][] f9801t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f9802u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f9803v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f9804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private na.b f9805x;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f9806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f9807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f9808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c0 f9809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9810e;

        public a(o oVar, r rVar, b0 b0Var) {
            this.f9806a = oVar;
            this.f9807b = rVar;
            this.f9808c = b0Var;
            this.f9809d = MimeTypes.AUDIO_TRUEHD.equals(oVar.f9828f.f18868l) ? new c0() : null;
        }
    }

    public k() {
        this(0);
    }

    public static /* synthetic */ u9.k[] f() {
        return new u9.k[]{new k()};
    }

    private static int g(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] h(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f9807b.f9858b];
            jArr2[i10] = aVarArr[i10].f9807b.f9862f[0];
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
            r rVar = aVarArr[i12].f9807b;
            j10 += (long) rVar.f9860d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = rVar.f9862f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void i() {
        this.f9790i = 0;
        this.f9793l = 0;
    }

    private static int k(r rVar, long j10) {
        int iA = rVar.a(j10);
        return iA == -1 ? rVar.b(j10) : iA;
    }

    private int l(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f9800s;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f9810e;
            r rVar = aVar.f9807b;
            if (i13 != rVar.f9858b) {
                long j14 = rVar.f9859c[i13];
                long j15 = ((long[][]) r0.j(this.f9801t))[i12][i13];
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

    private static long m(r rVar, long j10, long j11) {
        int iK = k(rVar, j10);
        return iK == -1 ? j11 : Math.min(rVar.f9859c[iK], j11);
    }

    private void n(u9.l lVar) {
        this.f9785d.Q(8);
        lVar.peekFully(this.f9785d.e(), 0, 8);
        b.f(this.f9785d);
        lVar.skipFully(this.f9785d.f());
        lVar.resetPeekPosition();
    }

    private void o(long j10) {
        while (!this.f9787f.isEmpty() && ((ca.a.C0132a) this.f9787f.peek()).f9690b == j10) {
            ca.a.C0132a c0132a = (ca.a.C0132a) this.f9787f.pop();
            if (c0132a.f9689a == 1836019574) {
                r(c0132a);
                this.f9787f.clear();
                this.f9790i = 2;
            } else if (!this.f9787f.isEmpty()) {
                ((ca.a.C0132a) this.f9787f.peek()).d(c0132a);
            }
        }
        if (this.f9790i != 2) {
            i();
        }
    }

    private void p() {
        if (this.f9804w != 2 || (this.f9782a & 2) == 0) {
            return;
        }
        this.f9799r.track(0, 4).e(new v0.b().Z(this.f9805x == null ? null : new ha.a(this.f9805x)).G());
        this.f9799r.endTracks();
        this.f9799r.c(new z.b(C.TIME_UNSET));
    }

    private static int q(d0 d0Var) {
        d0Var.U(8);
        int iG = g(d0Var.q());
        if (iG != 0) {
            return iG;
        }
        d0Var.V(4);
        while (d0Var.a() > 0) {
            int iG2 = g(d0Var.q());
            if (iG2 != 0) {
                return iG2;
            }
        }
        return 0;
    }

    private void r(ca.a.C0132a c0132a) {
        ha.a aVar;
        ha.a aVar2;
        ha.a aVar3;
        boolean z10;
        int size;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f9804w == 1;
        v vVar = new v();
        ca.a.b bVarG = c0132a.g(1969517665);
        if (bVarG != null) {
            b.i iVarC = b.C(bVarG);
            ha.a aVar4 = iVarC.f9725a;
            ha.a aVar5 = iVarC.f9726b;
            ha.a aVar6 = iVarC.f9727c;
            if (aVar4 != null) {
                vVar.c(aVar4);
            }
            aVar = aVar6;
            aVar2 = aVar4;
            aVar3 = aVar5;
        } else {
            aVar = null;
            aVar2 = null;
            aVar3 = null;
        }
        ca.a.C0132a c0132aF = c0132a.f(1835365473);
        ha.a aVarO = c0132aF != null ? b.o(c0132aF) : null;
        ha.a aVar7 = b.q(((ca.a.b) ob.a.e(c0132a.g(1836476516))).f9693b).f9708a;
        ha.a aVar8 = aVarO;
        List listB = b.B(c0132a, vVar, C.TIME_UNSET, null, (this.f9782a & 1) != 0, z11, new sc.g() { // from class: ca.i
            @Override // sc.g
            public final Object apply(Object obj) {
                return k.e((o) obj);
            }
        });
        long j10 = C.TIME_UNSET;
        int i10 = 0;
        int i11 = -1;
        for (int size2 = listB.size(); i10 < size2; size2 = size2) {
            r rVar = (r) listB.get(i10);
            if (rVar.f9858b == 0) {
                size = i11;
                z10 = true;
            } else {
                o oVar = rVar.f9857a;
                int i12 = i11;
                ArrayList arrayList2 = arrayList;
                long j11 = oVar.f9827e;
                if (j11 == C.TIME_UNSET) {
                    j11 = rVar.f9864h;
                }
                long jMax = Math.max(j10, j11);
                a aVar9 = new a(oVar, rVar, this.f9799r.track(i10, oVar.f9824b));
                int i13 = MimeTypes.AUDIO_TRUEHD.equals(oVar.f9828f.f18868l) ? rVar.f9861e * 16 : rVar.f9861e + 30;
                v0.b bVarB = oVar.f9828f.b();
                bVarB.Y(i13);
                if (oVar.f9824b != 2 || j11 <= 0) {
                    z10 = true;
                } else {
                    int i14 = rVar.f9858b;
                    z10 = true;
                    if (i14 > 1) {
                        bVarB.R(i14 / (j11 / 1000000.0f));
                    }
                }
                h.k(oVar.f9824b, vVar, bVarB);
                h.l(oVar.f9824b, aVar2, aVar8, bVarB, aVar3, this.f9789h.isEmpty() ? null : new ha.a(this.f9789h), aVar, aVar7);
                aVar9.f9808c.e(bVarB.G());
                if (oVar.f9824b == 2) {
                    size = i12;
                    if (size == -1) {
                        size = arrayList2.size();
                    }
                } else {
                    size = i12;
                }
                arrayList = arrayList2;
                arrayList.add(aVar9);
                j10 = jMax;
            }
            i10++;
            i11 = size;
            listB = listB;
        }
        this.f9802u = i11;
        this.f9803v = j10;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f9800s = aVarArr;
        this.f9801t = h(aVarArr);
        this.f9799r.endTracks();
        this.f9799r.c(this);
    }

    private void s(long j10) {
        if (this.f9791j == 1836086884) {
            int i10 = this.f9793l;
            this.f9805x = new na.b(0L, j10, C.TIME_UNSET, j10 + ((long) i10), this.f9792k - ((long) i10));
        }
    }

    private boolean t(u9.l lVar) throws ParserException {
        ca.a.C0132a c0132a;
        if (this.f9793l == 0) {
            if (!lVar.readFully(this.f9786e.e(), 0, 8, true)) {
                p();
                return false;
            }
            this.f9793l = 8;
            this.f9786e.U(0);
            this.f9792k = this.f9786e.J();
            this.f9791j = this.f9786e.q();
        }
        long j10 = this.f9792k;
        if (j10 == 1) {
            lVar.readFully(this.f9786e.e(), 8, 8);
            this.f9793l += 8;
            this.f9792k = this.f9786e.M();
        } else if (j10 == 0) {
            long length = lVar.getLength();
            if (length == -1 && (c0132a = (ca.a.C0132a) this.f9787f.peek()) != null) {
                length = c0132a.f9690b;
            }
            if (length != -1) {
                this.f9792k = (length - lVar.getPosition()) + ((long) this.f9793l);
            }
        }
        if (this.f9792k < this.f9793l) {
            throw ParserException.e("Atom size less than header length (unsupported).");
        }
        if (x(this.f9791j)) {
            long position = lVar.getPosition();
            long j11 = this.f9792k;
            int i10 = this.f9793l;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f9791j == 1835365473) {
                n(lVar);
            }
            this.f9787f.push(new ca.a.C0132a(this.f9791j, j12));
            if (this.f9792k == this.f9793l) {
                o(j12);
            } else {
                i();
            }
        } else if (y(this.f9791j)) {
            ob.a.g(this.f9793l == 8);
            ob.a.g(this.f9792k <= 2147483647L);
            d0 d0Var = new d0((int) this.f9792k);
            System.arraycopy(this.f9786e.e(), 0, d0Var.e(), 0, 8);
            this.f9794m = d0Var;
            this.f9790i = 1;
        } else {
            s(lVar.getPosition() - ((long) this.f9793l));
            this.f9794m = null;
            this.f9790i = 1;
        }
        return true;
    }

    private boolean u(u9.l lVar, y yVar) {
        boolean z10;
        long j10 = this.f9792k - ((long) this.f9793l);
        long position = lVar.getPosition() + j10;
        d0 d0Var = this.f9794m;
        if (d0Var == null) {
            if (j10 < 262144) {
                lVar.skipFully((int) j10);
            } else {
                yVar.f54333a = lVar.getPosition() + j10;
                z10 = true;
            }
            o(position);
            return (z10 || this.f9790i == 2) ? false : true;
        }
        lVar.readFully(d0Var.e(), this.f9793l, (int) j10);
        if (this.f9791j == 1718909296) {
            this.f9804w = q(d0Var);
        } else if (!this.f9787f.isEmpty()) {
            ((ca.a.C0132a) this.f9787f.peek()).e(new ca.a.b(this.f9791j, d0Var));
        }
        z10 = false;
        o(position);
        if (z10) {
        }
    }

    private int v(u9.l lVar, y yVar) throws ParserException {
        int i10;
        long position = lVar.getPosition();
        if (this.f9795n == -1) {
            int iL = l(position);
            this.f9795n = iL;
            if (iL == -1) {
                return -1;
            }
        }
        a aVar = this.f9800s[this.f9795n];
        b0 b0Var = aVar.f9808c;
        int i11 = aVar.f9810e;
        r rVar = aVar.f9807b;
        long j10 = rVar.f9859c[i11];
        int i12 = rVar.f9860d[i11];
        c0 c0Var = aVar.f9809d;
        long j11 = (j10 - position) + ((long) this.f9796o);
        if (j11 < 0 || j11 >= 262144) {
            yVar.f54333a = j10;
            return 1;
        }
        if (aVar.f9806a.f9829g == 1) {
            j11 += 8;
            i12 -= 8;
        }
        lVar.skipFully((int) j11);
        o oVar = aVar.f9806a;
        if (oVar.f9832j == 0) {
            if ("audio/ac4".equals(oVar.f9828f.f18868l)) {
                if (this.f9797p == 0) {
                    q9.c.a(i12, this.f9785d);
                    b0Var.c(this.f9785d, 7);
                    this.f9797p += 7;
                }
                i12 += 7;
            } else if (c0Var != null) {
                c0Var.d(lVar);
            }
            while (true) {
                int i13 = this.f9797p;
                if (i13 >= i12) {
                    break;
                }
                int iA = b0Var.a(lVar, i12 - i13, false);
                this.f9796o += iA;
                this.f9797p += iA;
                this.f9798q -= iA;
            }
        } else {
            byte[] bArrE = this.f9784c.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i14 = aVar.f9806a.f9832j;
            int i15 = 4 - i14;
            while (this.f9797p < i12) {
                int i16 = this.f9798q;
                if (i16 == 0) {
                    lVar.readFully(bArrE, i15, i14);
                    this.f9796o += i14;
                    this.f9784c.U(0);
                    int iQ = this.f9784c.q();
                    if (iQ < 0) {
                        throw ParserException.a("Invalid NAL length", null);
                    }
                    this.f9798q = iQ;
                    this.f9783b.U(0);
                    b0Var.c(this.f9783b, 4);
                    this.f9797p += 4;
                    i12 += i15;
                } else {
                    int iA2 = b0Var.a(lVar, i16, false);
                    this.f9796o += iA2;
                    this.f9797p += iA2;
                    this.f9798q -= iA2;
                }
            }
        }
        int i17 = i12;
        r rVar2 = aVar.f9807b;
        long j12 = rVar2.f9862f[i11];
        int i18 = rVar2.f9863g[i11];
        if (c0Var != null) {
            i10 = 0;
            c0Var.c(b0Var, j12, i18, i17, 0, null);
            if (i11 + 1 == aVar.f9807b.f9858b) {
                c0Var.a(b0Var, null);
            }
        } else {
            i10 = 0;
            b0Var.f(j12, i18, i17, 0, null);
        }
        aVar.f9810e++;
        this.f9795n = -1;
        this.f9796o = i10;
        this.f9797p = i10;
        this.f9798q = i10;
        return i10;
    }

    private int w(u9.l lVar, y yVar) throws ParserException {
        int iC = this.f9788g.c(lVar, yVar, this.f9789h);
        if (iC == 1 && yVar.f54333a == 0) {
            i();
        }
        return iC;
    }

    private static boolean x(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean y(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void z(a aVar, long j10) {
        r rVar = aVar.f9807b;
        int iA = rVar.a(j10);
        if (iA == -1) {
            iA = rVar.b(j10);
        }
        aVar.f9810e = iA;
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        this.f9799r = mVar;
    }

    @Override // u9.k
    public int c(u9.l lVar, y yVar) {
        while (true) {
            int i10 = this.f9790i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return v(lVar, yVar);
                    }
                    if (i10 == 3) {
                        return w(lVar, yVar);
                    }
                    throw new IllegalStateException();
                }
                if (u(lVar, yVar)) {
                    return 1;
                }
            } else if (!t(lVar)) {
                return -1;
            }
        }
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        return n.d(lVar, (this.f9782a & 2) != 0);
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f9803v;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        return j(j10, -1);
    }

    @Override // u9.z
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
    public z.a j(long j10, int i10) {
        long j11;
        long j12;
        long jM;
        long j13;
        int i11;
        a[] aVarArr;
        r rVar;
        int iB;
        a[] aVarArr2 = this.f9800s;
        if (aVarArr2.length == 0) {
            return new z.a(a0.f54230c);
        }
        int i12 = i10 != -1 ? i10 : this.f9802u;
        if (i12 != -1) {
            r rVar2 = aVarArr2[i12].f9807b;
            int iK = k(rVar2, j10);
            if (iK == -1) {
                return new z.a(a0.f54230c);
            }
            j12 = rVar2.f9862f[iK];
            j11 = rVar2.f9859c[iK];
            if (j12 < j10 && iK < rVar2.f9858b - 1 && (iB = rVar2.b(j10)) != -1 && iB != iK) {
                j13 = rVar2.f9862f[iB];
                jM = rVar2.f9859c[iB];
            }
            if (i10 == -1) {
                i11 = 0;
                while (true) {
                    aVarArr = this.f9800s;
                    if (i11 < aVarArr.length) {
                        break;
                    }
                    if (i11 != this.f9802u) {
                        rVar = aVarArr[i11].f9807b;
                        long jM2 = m(rVar, j12, j11);
                        if (j13 != C.TIME_UNSET) {
                            jM = m(rVar, j13, jM);
                        }
                        j11 = jM2;
                    }
                    i11++;
                }
            }
            a0 a0Var = new a0(j12, j11);
            return j13 == C.TIME_UNSET ? new z.a(a0Var) : new z.a(a0Var, new a0(j13, jM));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        jM = -1;
        j13 = -9223372036854775807L;
        if (i10 == -1) {
            i11 = 0;
            while (true) {
                aVarArr = this.f9800s;
                if (i11 < aVarArr.length) {
                    break;
                    break;
                }
                if (i11 != this.f9802u) {
                    rVar = aVarArr[i11].f9807b;
                    long jM3 = m(rVar, j12, j11);
                    if (j13 != C.TIME_UNSET) {
                        jM = m(rVar, j13, jM);
                    }
                    j11 = jM3;
                }
                i11++;
            }
        }
        a0 a0Var2 = new a0(j12, j11);
        if (j13 == C.TIME_UNSET) {
        }
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        this.f9787f.clear();
        this.f9793l = 0;
        this.f9795n = -1;
        this.f9796o = 0;
        this.f9797p = 0;
        this.f9798q = 0;
        if (j10 == 0) {
            if (this.f9790i != 3) {
                i();
                return;
            } else {
                this.f9788g.g();
                this.f9789h.clear();
                return;
            }
        }
        for (a aVar : this.f9800s) {
            z(aVar, j11);
            c0 c0Var = aVar.f9809d;
            if (c0Var != null) {
                c0Var.b();
            }
        }
    }

    public k(int i10) {
        this.f9782a = i10;
        this.f9790i = (i10 & 4) != 0 ? 3 : 0;
        this.f9788g = new m();
        this.f9789h = new ArrayList();
        this.f9786e = new d0(16);
        this.f9787f = new ArrayDeque();
        this.f9783b = new d0(ob.z.f48467a);
        this.f9784c = new d0(4);
        this.f9785d = new d0();
        this.f9795n = -1;
        this.f9799r = u9.m.B2;
        this.f9800s = new a[0];
    }

    @Override // u9.k
    public void release() {
    }

    public static /* synthetic */ o e(o oVar) {
        return oVar;
    }
}
