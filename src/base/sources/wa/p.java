package wa;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.i0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lb.z;
import o9.j0;
import ob.r0;
import ob.u;
import ob.y;
import ra.v;
import ra.x;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class p implements Loader.b, Loader.f, d0, u9.m, c0.d {
    private static final Set Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private v0 F;
    private v0 G;
    private boolean H;
    private x I;
    private Set J;
    private int[] K;
    private int L;
    private boolean M;
    private boolean[] N;
    private boolean[] O;
    private long P;
    private long Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private com.google.android.exoplayer2.drm.h W;
    private i X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f56114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f56115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nb.b f56116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v0 f56117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f56118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f56119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.c f56120i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.q.a f56122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f56123l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f56125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f56126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f56127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f56128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f56129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList f56130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f56131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ta.f f56132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d[] f56133v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set f56135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SparseIntArray f56136y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private b0 f56137z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Loader f56121j = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f.b f56124m = new f.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f56134w = new int[0];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b extends d0.a {
        void e(Uri uri);

        void onPrepared();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements b0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final v0 f56138g = new v0.b().g0(MimeTypes.APPLICATION_ID3).G();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final v0 f56139h = new v0.b().g0(MimeTypes.APPLICATION_EMSG).G();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ja.b f56140a = new ja.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f56141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v0 f56142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private v0 f56143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f56144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f56145f;

        public c(b0 b0Var, int i10) {
            this.f56141b = b0Var;
            if (i10 == 1) {
                this.f56142c = f56138g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                this.f56142c = f56139h;
            }
            this.f56144e = new byte[0];
            this.f56145f = 0;
        }

        private boolean g(ja.a aVar) {
            v0 v0VarK = aVar.k();
            return v0VarK != null && r0.c(this.f56142c.f18868l, v0VarK.f18868l);
        }

        private void h(int i10) {
            byte[] bArr = this.f56144e;
            if (bArr.length < i10) {
                this.f56144e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private ob.d0 i(int i10, int i11) {
            int i12 = this.f56145f - i11;
            ob.d0 d0Var = new ob.d0(Arrays.copyOfRange(this.f56144e, i12 - i10, i12));
            byte[] bArr = this.f56144e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f56145f = i11;
            return d0Var;
        }

        @Override // u9.b0
        public void b(ob.d0 d0Var, int i10, int i11) {
            h(this.f56145f + i10);
            d0Var.l(this.f56144e, this.f56145f, i10);
            this.f56145f += i10;
        }

        @Override // u9.b0
        public int d(nb.h hVar, int i10, boolean z10, int i11) throws EOFException {
            h(this.f56145f + i10);
            int i12 = hVar.read(this.f56144e, this.f56145f, i10);
            if (i12 != -1) {
                this.f56145f += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // u9.b0
        public void e(v0 v0Var) {
            this.f56143d = v0Var;
            this.f56141b.e(this.f56142c);
        }

        @Override // u9.b0
        public void f(long j10, int i10, int i11, int i12, b0.a aVar) {
            ob.a.e(this.f56143d);
            ob.d0 d0VarI = i(i11, i12);
            if (!r0.c(this.f56143d.f18868l, this.f56142c.f18868l)) {
                if (!MimeTypes.APPLICATION_EMSG.equals(this.f56143d.f18868l)) {
                    u.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f56143d.f18868l);
                    return;
                }
                ja.a aVarC = this.f56140a.c(d0VarI);
                if (!g(aVarC)) {
                    u.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f56142c.f18868l, aVarC.k()));
                    return;
                }
                d0VarI = new ob.d0((byte[]) ob.a.e(aVarC.m()));
            }
            int iA = d0VarI.a();
            this.f56141b.c(d0VarI, iA);
            this.f56141b.f(j10, i10, iA, i12, aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends c0 {
        private final Map H;
        private com.google.android.exoplayer2.drm.h I;

        private ha.a g0(ha.a aVar) {
            if (aVar == null) {
                return null;
            }
            int iF = aVar.f();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iF) {
                    i11 = -1;
                    break;
                }
                ha.a.b bVarE = aVar.e(i11);
                if ((bVarE instanceof ma.l) && "com.apple.streaming.transportStreamTimestamp".equals(((ma.l) bVarE).f45402b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return aVar;
            }
            if (iF == 1) {
                return null;
            }
            ha.a.b[] bVarArr = new ha.a.b[iF - 1];
            while (i10 < iF) {
                if (i10 != i11) {
                    bVarArr[i10 < i11 ? i10 : i10 - 1] = aVar.e(i10);
                }
                i10++;
            }
            return new ha.a(bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.c0, u9.b0
        public void f(long j10, int i10, int i11, int i12, b0.a aVar) {
            super.f(j10, i10, i11, i12, aVar);
        }

        public void h0(com.google.android.exoplayer2.drm.h hVar) {
            this.I = hVar;
            I();
        }

        public void i0(i iVar) {
            e0(iVar.f56063k);
        }

        @Override // com.google.android.exoplayer2.source.c0
        public v0 w(v0 v0Var) {
            com.google.android.exoplayer2.drm.h hVar;
            com.google.android.exoplayer2.drm.h hVar2 = this.I;
            if (hVar2 == null) {
                hVar2 = v0Var.f18871o;
            }
            if (hVar2 != null && (hVar = (com.google.android.exoplayer2.drm.h) this.H.get(hVar2.f16856c)) != null) {
                hVar2 = hVar;
            }
            ha.a aVarG0 = g0(v0Var.f18866j);
            if (hVar2 != v0Var.f18871o || aVarG0 != v0Var.f18866j) {
                v0Var = v0Var.b().O(hVar2).Z(aVarG0).G();
            }
            return super.w(v0Var);
        }

        private d(nb.b bVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.i.a aVar, Map map) {
            super(bVar, jVar, aVar);
            this.H = map;
        }
    }

    public p(String str, int i10, b bVar, f fVar, Map map, nb.b bVar2, long j10, v0 v0Var, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.i.a aVar, com.google.android.exoplayer2.upstream.c cVar, com.google.android.exoplayer2.source.q.a aVar2, int i11) {
        this.f56112a = str;
        this.f56113b = i10;
        this.f56114c = bVar;
        this.f56115d = fVar;
        this.f56131t = map;
        this.f56116e = bVar2;
        this.f56117f = v0Var;
        this.f56118g = jVar;
        this.f56119h = aVar;
        this.f56120i = cVar;
        this.f56122k = aVar2;
        this.f56123l = i11;
        Set set = Y;
        this.f56135x = new HashSet(set.size());
        this.f56136y = new SparseIntArray(set.size());
        this.f56133v = new d[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f56125n = arrayList;
        this.f56126o = Collections.unmodifiableList(arrayList);
        this.f56130s = new ArrayList();
        this.f56127p = new Runnable() { // from class: wa.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f56110a.G();
            }
        };
        this.f56128q = new Runnable() { // from class: wa.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f56111a.P();
            }
        };
        this.f56129r = r0.w();
        this.P = j10;
        this.Q = j10;
    }

    private void A(i iVar) {
        this.X = iVar;
        this.F = iVar.f53214d;
        this.Q = C.TIME_UNSET;
        this.f56125n.add(iVar);
        com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
        for (d dVar : this.f56133v) {
            aVarR.a(Integer.valueOf(dVar.G()));
        }
        iVar.l(this, aVarR.m());
        for (d dVar2 : this.f56133v) {
            dVar2.i0(iVar);
            if (iVar.f56066n) {
                dVar2.f0();
            }
        }
    }

    private static boolean B(ta.f fVar) {
        return fVar instanceof i;
    }

    private boolean C() {
        return this.Q != C.TIME_UNSET;
    }

    private void F() {
        int i10 = this.I.f51256a;
        int[] iArr = new int[i10];
        this.K = iArr;
        Arrays.fill(iArr, -1);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                d[] dVarArr = this.f56133v;
                if (i13 >= dVarArr.length) {
                    break;
                }
                if (w((v0) ob.a.i(dVarArr[i13].F()), this.I.b(i12).c(0))) {
                    this.K[i12] = i13;
                    break;
                }
                i13++;
            }
        }
        ArrayList arrayList = this.f56130s;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((l) obj).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (!this.H && this.K == null && this.C) {
            for (d dVar : this.f56133v) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.I != null) {
                F();
                return;
            }
            l();
            Y();
            this.f56114c.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        this.C = true;
        G();
    }

    private void T() {
        for (d dVar : this.f56133v) {
            dVar.V(this.R);
        }
        this.R = false;
    }

    private boolean U(long j10) {
        int length = this.f56133v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f56133v[i10].Y(j10, false) && (this.O[i10] || !this.M)) {
                return false;
            }
        }
        return true;
    }

    private void Y() {
        this.D = true;
    }

    private void d0(ra.s[] sVarArr) {
        this.f56130s.clear();
        for (ra.s sVar : sVarArr) {
            if (sVar != null) {
                this.f56130s.add((l) sVar);
            }
        }
    }

    private void j() {
        ob.a.g(this.D);
        ob.a.e(this.I);
        ob.a.e(this.J);
    }

    private void l() {
        v0 v0Var;
        int length = this.f56133v.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = ((v0) ob.a.i(this.f56133v[i12].F())).f18868l;
            if (!y.s(str)) {
                i13 = y.o(str) ? 1 : y.r(str) ? 3 : -2;
            }
            if (z(i13) > z(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        v vVarJ = this.f56115d.j();
        int i14 = vVarJ.f51248a;
        this.L = -1;
        this.K = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.K[i15] = i15;
        }
        v[] vVarArr = new v[length];
        int i16 = 0;
        while (i16 < length) {
            v0 v0Var2 = (v0) ob.a.i(this.f56133v[i16].F());
            if (i16 == i11) {
                v0[] v0VarArr = new v0[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    v0 v0VarC = vVarJ.c(i17);
                    if (i10 == 1 && (v0Var = this.f56117f) != null) {
                        v0VarC = v0VarC.k(v0Var);
                    }
                    v0VarArr[i17] = i14 == 1 ? v0Var2.k(v0VarC) : s(v0VarC, v0Var2, true);
                }
                vVarArr[i16] = new v(this.f56112a, v0VarArr);
                this.L = i16;
            } else {
                v0 v0Var3 = (i10 == 2 && y.o(v0Var2.f18868l)) ? this.f56117f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f56112a);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                vVarArr[i16] = new v(sb2.toString(), s(v0Var3, v0Var2, false));
            }
            i16++;
        }
        this.I = r(vVarArr);
        ob.a.g(this.J == null);
        this.J = Collections.EMPTY_SET;
    }

    private boolean m(int i10) {
        for (int i11 = i10; i11 < this.f56125n.size(); i11++) {
            if (((i) this.f56125n.get(i11)).f56066n) {
                return false;
            }
        }
        i iVar = (i) this.f56125n.get(i10);
        for (int i12 = 0; i12 < this.f56133v.length; i12++) {
            if (this.f56133v[i12].C() > iVar.k(i12)) {
                return false;
            }
        }
        return true;
    }

    private static u9.j p(int i10, int i11) {
        u.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new u9.j();
    }

    private c0 q(int i10, int i11) {
        int length = this.f56133v.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f56116e, this.f56118g, this.f56119h, this.f56131t);
        dVar.a0(this.P);
        if (z10) {
            dVar.h0(this.W);
        }
        dVar.Z(this.V);
        i iVar = this.X;
        if (iVar != null) {
            dVar.i0(iVar);
        }
        dVar.c0(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f56134w, i12);
        this.f56134w = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f56133v = (d[]) r0.K0(this.f56133v, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.O, i12);
        this.O = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.M |= z10;
        this.f56135x.add(Integer.valueOf(i11));
        this.f56136y.append(i11, length);
        if (z(i11) > z(this.A)) {
            this.B = length;
            this.A = i11;
        }
        this.N = Arrays.copyOf(this.N, i12);
        return dVar;
    }

    private x r(v[] vVarArr) {
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            v vVar = vVarArr[i10];
            v0[] v0VarArr = new v0[vVar.f51248a];
            for (int i11 = 0; i11 < vVar.f51248a; i11++) {
                v0 v0VarC = vVar.c(i11);
                v0VarArr[i11] = v0VarC.c(this.f56118g.b(v0VarC));
            }
            vVarArr[i10] = new v(vVar.f51249b, v0VarArr);
        }
        return new x(vVarArr);
    }

    private static v0 s(v0 v0Var, v0 v0Var2, boolean z10) {
        String strD;
        String strG;
        if (v0Var == null) {
            return v0Var2;
        }
        int iK = y.k(v0Var2.f18868l);
        if (r0.L(v0Var.f18865i, iK) == 1) {
            strD = r0.M(v0Var.f18865i, iK);
            strG = y.g(strD);
        } else {
            strD = y.d(v0Var.f18865i, v0Var2.f18868l);
            strG = v0Var2.f18868l;
        }
        v0.b bVarK = v0Var2.b().U(v0Var.f18857a).W(v0Var.f18858b).X(v0Var.f18859c).i0(v0Var.f18860d).e0(v0Var.f18861e).I(z10 ? v0Var.f18862f : -1).b0(z10 ? v0Var.f18863g : -1).K(strD);
        if (iK == 2) {
            bVarK.n0(v0Var.f18873q).S(v0Var.f18874r).R(v0Var.f18875s);
        }
        if (strG != null) {
            bVarK.g0(strG);
        }
        int i10 = v0Var.f18881y;
        if (i10 != -1 && iK == 1) {
            bVarK.J(i10);
        }
        ha.a aVarB = v0Var.f18866j;
        if (aVarB != null) {
            ha.a aVar = v0Var2.f18866j;
            if (aVar != null) {
                aVarB = aVar.b(aVarB);
            }
            bVarK.Z(aVarB);
        }
        return bVarK.G();
    }

    private void t(int i10) {
        ob.a.g(!this.f56121j.i());
        while (true) {
            if (i10 >= this.f56125n.size()) {
                i10 = -1;
                break;
            } else if (m(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = x().f53218h;
        i iVarU = u(i10);
        if (this.f56125n.isEmpty()) {
            this.Q = this.P;
        } else {
            ((i) i0.d(this.f56125n)).m();
        }
        this.T = false;
        this.f56122k.w(this.A, iVarU.f53217g, j10);
    }

    private i u(int i10) {
        i iVar = (i) this.f56125n.get(i10);
        ArrayList arrayList = this.f56125n;
        r0.S0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f56133v.length; i11++) {
            this.f56133v[i11].u(iVar.k(i11));
        }
        return iVar;
    }

    private boolean v(i iVar) {
        int i10 = iVar.f56063k;
        int length = this.f56133v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.N[i11] && this.f56133v[i11].P() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean w(v0 v0Var, v0 v0Var2) {
        String str = v0Var.f18868l;
        String str2 = v0Var2.f18868l;
        int iK = y.k(str);
        if (iK != 3) {
            return iK == y.k(str2);
        }
        if (r0.c(str, str2)) {
            return !(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || v0Var.D == v0Var2.D;
        }
        return false;
    }

    private i x() {
        ArrayList arrayList = this.f56125n;
        return (i) arrayList.get(arrayList.size() - 1);
    }

    private b0 y(int i10, int i11) {
        ob.a.a(Y.contains(Integer.valueOf(i11)));
        int i12 = this.f56136y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f56135x.add(Integer.valueOf(i11))) {
            this.f56134w[i12] = i10;
        }
        return this.f56134w[i12] == i10 ? this.f56133v[i12] : p(i10, i11);
    }

    private static int z(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public boolean D(int i10) {
        return !C() && this.f56133v[i10].K(this.T);
    }

    public boolean E() {
        return this.A == 2;
    }

    public void H() {
        this.f56121j.maybeThrowError();
        this.f56115d.n();
    }

    public void I(int i10) {
        H();
        this.f56133v[i10].M();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void e(ta.f fVar, long j10, long j11, boolean z10) {
        this.f56132u = null;
        ra.i iVar = new ra.i(fVar.f53211a, fVar.f53212b, fVar.d(), fVar.c(), j10, j11, fVar.a());
        this.f56120i.b(fVar.f53211a);
        this.f56122k.k(iVar, fVar.f53213c, this.f56113b, fVar.f53214d, fVar.f53215e, fVar.f53216f, fVar.f53217g, fVar.f53218h);
        if (z10) {
            return;
        }
        if (C() || this.E == 0) {
            T();
        }
        if (this.E > 0) {
            this.f56114c.c(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void i(ta.f fVar, long j10, long j11) {
        this.f56132u = null;
        this.f56115d.p(fVar);
        ra.i iVar = new ra.i(fVar.f53211a, fVar.f53212b, fVar.d(), fVar.c(), j10, j11, fVar.a());
        this.f56120i.b(fVar.f53211a);
        this.f56122k.n(iVar, fVar.f53213c, this.f56113b, fVar.f53214d, fVar.f53215e, fVar.f53216f, fVar.f53217g, fVar.f53218h);
        if (this.D) {
            this.f56114c.c(this);
        } else {
            continueLoading(this.P);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Loader.c n(ta.f fVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        int i11;
        boolean zB = B(fVar);
        if (zB && !((i) fVar).o() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i11 = ((HttpDataSource$InvalidResponseCodeException) iOException).f18739d) == 410 || i11 == 404)) {
            return Loader.f18743d;
        }
        long jA = fVar.a();
        ra.i iVar = new ra.i(fVar.f53211a, fVar.f53212b, fVar.d(), fVar.c(), j10, j11, jA);
        com.google.android.exoplayer2.upstream.c.C0294c c0294c = new com.google.android.exoplayer2.upstream.c.C0294c(iVar, new ra.j(fVar.f53213c, this.f56113b, fVar.f53214d, fVar.f53215e, fVar.f53216f, r0.i1(fVar.f53217g), r0.i1(fVar.f53218h)), iOException, i10);
        com.google.android.exoplayer2.upstream.c.b bVarD = this.f56120i.d(z.c(this.f56115d.k()), c0294c);
        boolean zM = (bVarD == null || bVarD.f18805a != 2) ? false : this.f56115d.m(fVar, bVarD.f18806b);
        if (zM) {
            if (zB && jA == 0) {
                ArrayList arrayList = this.f56125n;
                ob.a.g(((i) arrayList.remove(arrayList.size() - 1)) == fVar);
                if (this.f56125n.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((i) i0.d(this.f56125n)).m();
                }
            }
            cVarG = Loader.f18745f;
        } else {
            long jC = this.f56120i.c(c0294c);
            cVarG = jC != C.TIME_UNSET ? Loader.g(false, jC) : Loader.f18746g;
        }
        Loader.c cVar = cVarG;
        boolean zC = cVar.c();
        this.f56122k.p(iVar, fVar.f53213c, this.f56113b, fVar.f53214d, fVar.f53215e, fVar.f53216f, fVar.f53217g, fVar.f53218h, iOException, !zC);
        if (!zC) {
            this.f56132u = null;
            this.f56120i.b(fVar.f53211a);
        }
        if (zM) {
            if (!this.D) {
                continueLoading(this.P);
                return cVar;
            }
            this.f56114c.c(this);
        }
        return cVar;
    }

    public void M() {
        this.f56135x.clear();
    }

    public boolean N(Uri uri, com.google.android.exoplayer2.upstream.c.C0294c c0294c, boolean z10) {
        com.google.android.exoplayer2.upstream.c.b bVarD;
        if (!this.f56115d.o(uri)) {
            return true;
        }
        long j10 = (z10 || (bVarD = this.f56120i.d(z.c(this.f56115d.k()), c0294c)) == null || bVarD.f18805a != 2) ? -9223372036854775807L : bVarD.f18806b;
        return this.f56115d.q(uri, j10) && j10 != C.TIME_UNSET;
    }

    public void O() {
        if (this.f56125n.isEmpty()) {
            return;
        }
        i iVar = (i) i0.d(this.f56125n);
        int iC = this.f56115d.c(iVar);
        if (iC == 1) {
            iVar.t();
        } else if (iC == 2 && !this.T && this.f56121j.i()) {
            this.f56121j.e();
        }
    }

    public void Q(v[] vVarArr, int i10, int... iArr) {
        this.I = r(vVarArr);
        this.J = new HashSet();
        for (int i11 : iArr) {
            this.J.add(this.I.b(i11));
        }
        this.L = i10;
        Handler handler = this.f56129r;
        final b bVar = this.f56114c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: wa.m
            @Override // java.lang.Runnable
            public final void run() {
                bVar.onPrepared();
            }
        });
        Y();
    }

    public int R(int i10, o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (C()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f56125n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f56125n.size() - 1 && v((i) this.f56125n.get(i13))) {
                i13++;
            }
            r0.S0(this.f56125n, 0, i13);
            i iVar = (i) this.f56125n.get(0);
            v0 v0Var = iVar.f53214d;
            if (!v0Var.equals(this.G)) {
                this.f56122k.h(this.f56113b, v0Var, iVar.f53215e, iVar.f53216f, iVar.f53217g);
            }
            this.G = v0Var;
        }
        if (!this.f56125n.isEmpty() && !((i) this.f56125n.get(0)).o()) {
            return -3;
        }
        int iR = this.f56133v[i10].R(pVar, decoderInputBuffer, i11, this.T);
        if (iR == -5) {
            v0 v0VarK = (v0) ob.a.e(pVar.f48303b);
            if (i10 == this.B) {
                int iD = com.google.common.primitives.g.d(this.f56133v[i10].P());
                while (i12 < this.f56125n.size() && ((i) this.f56125n.get(i12)).f56063k != iD) {
                    i12++;
                }
                v0VarK = v0VarK.k(i12 < this.f56125n.size() ? ((i) this.f56125n.get(i12)).f53214d : (v0) ob.a.e(this.F));
            }
            pVar.f48303b = v0VarK;
        }
        return iR;
    }

    public void S() {
        if (this.D) {
            for (d dVar : this.f56133v) {
                dVar.Q();
            }
        }
        this.f56121j.l(this);
        this.f56129r.removeCallbacksAndMessages(null);
        this.H = true;
        this.f56130s.clear();
    }

    public boolean V(long j10, boolean z10) {
        this.P = j10;
        if (C()) {
            this.Q = j10;
            return true;
        }
        if (this.C && !z10 && U(j10)) {
            return false;
        }
        this.Q = j10;
        this.T = false;
        this.f56125n.clear();
        if (this.f56121j.i()) {
            if (this.C) {
                for (d dVar : this.f56133v) {
                    dVar.r();
                }
            }
            this.f56121j.e();
        } else {
            this.f56121j.f();
            T();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    public boolean W(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10, boolean z10) {
        boolean z11;
        j();
        int i10 = this.E;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            l lVar = (l) sVarArr[i12];
            if (lVar != null && (rVarArr[i12] == null || !zArr[i12])) {
                this.E--;
                lVar.d();
                sVarArr[i12] = null;
            }
        }
        boolean z12 = z10 || (!this.S ? j10 == this.P : i10 != 0);
        lb.r rVarK = this.f56115d.k();
        boolean z13 = z12;
        lb.r rVar = rVarK;
        for (int i13 = 0; i13 < rVarArr.length; i13++) {
            lb.r rVar2 = rVarArr[i13];
            if (rVar2 != null) {
                int iC = this.I.c(rVar2.getTrackGroup());
                if (iC == this.L) {
                    this.f56115d.u(rVar2);
                    rVar = rVar2;
                }
                if (sVarArr[i13] == null) {
                    this.E++;
                    l lVar2 = new l(this, iC);
                    sVarArr[i13] = lVar2;
                    zArr2[i13] = true;
                    if (this.K != null) {
                        lVar2.b();
                        if (!z13) {
                            d dVar = this.f56133v[this.K[iC]];
                            z13 = (dVar.Y(j10, true) || dVar.C() == 0) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.E == 0) {
            this.f56115d.r();
            this.G = null;
            this.R = true;
            this.f56125n.clear();
            if (this.f56121j.i()) {
                if (this.C) {
                    d[] dVarArr = this.f56133v;
                    int length = dVarArr.length;
                    while (i11 < length) {
                        dVarArr[i11].r();
                        i11++;
                    }
                }
                this.f56121j.e();
            } else {
                T();
            }
        } else {
            if (this.f56125n.isEmpty() || r0.c(rVar, rVarK)) {
                z11 = z10;
            } else {
                if (!this.S) {
                    long j11 = j10 < 0 ? -j10 : 0L;
                    i iVarX = x();
                    lb.r rVar3 = rVar;
                    rVar3.e(j10, j11, C.TIME_UNSET, this.f56126o, this.f56115d.a(iVarX, j10));
                    if (rVar3.getSelectedIndexInTrackGroup() == this.f56115d.j().d(iVarX.f53214d)) {
                        z11 = z10;
                    }
                }
                this.R = true;
                z11 = true;
                z13 = true;
            }
            if (z13) {
                V(j10, z11);
                while (i11 < sVarArr.length) {
                    if (sVarArr[i11] != null) {
                        zArr2[i11] = true;
                    }
                    i11++;
                }
            }
        }
        d0(sVarArr);
        this.S = true;
        return z13;
    }

    public void X(com.google.android.exoplayer2.drm.h hVar) {
        if (r0.c(this.W, hVar)) {
            return;
        }
        this.W = hVar;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f56133v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.O[i10]) {
                dVarArr[i10].h0(hVar);
            }
            i10++;
        }
    }

    public void Z(boolean z10) {
        this.f56115d.t(z10);
    }

    @Override // com.google.android.exoplayer2.source.c0.d
    public void a(v0 v0Var) {
        this.f56129r.post(this.f56127p);
    }

    public void a0(long j10) {
        if (this.V != j10) {
            this.V = j10;
            for (d dVar : this.f56133v) {
                dVar.Z(j10);
            }
        }
    }

    public long b(long j10, j0 j0Var) {
        return this.f56115d.b(j10, j0Var);
    }

    public int b0(int i10, long j10) throws Throwable {
        if (C()) {
            return 0;
        }
        d dVar = this.f56133v[i10];
        int iE = dVar.E(j10, this.T);
        i iVar = (i) i0.e(this.f56125n, null);
        if (iVar != null && !iVar.o()) {
            iE = Math.min(iE, iVar.k(i10) - dVar.C());
        }
        dVar.d0(iE);
        return iE;
    }

    public void c0(int i10) {
        j();
        ob.a.e(this.K);
        int i11 = this.K[i10];
        ob.a.g(this.N[i11]);
        this.N[i11] = false;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        List list;
        long jMax;
        if (this.T || this.f56121j.i() || this.f56121j.h()) {
            return false;
        }
        if (C()) {
            list = Collections.EMPTY_LIST;
            jMax = this.Q;
            for (d dVar : this.f56133v) {
                dVar.a0(this.Q);
            }
        } else {
            list = this.f56126o;
            i iVarX = x();
            jMax = iVarX.f() ? iVarX.f53218h : Math.max(this.P, iVarX.f53217g);
        }
        List list2 = list;
        long j11 = jMax;
        this.f56124m.a();
        this.f56115d.e(j10, j11, list2, this.D || !list2.isEmpty(), this.f56124m);
        f.b bVar = this.f56124m;
        boolean z10 = bVar.f56052b;
        ta.f fVar = bVar.f56051a;
        Uri uri = bVar.f56053c;
        if (z10) {
            this.Q = C.TIME_UNSET;
            this.T = true;
            return true;
        }
        if (fVar == null) {
            if (uri != null) {
                this.f56114c.e(uri);
            }
            return false;
        }
        if (B(fVar)) {
            A((i) fVar);
        }
        this.f56132u = fVar;
        this.f56122k.t(new ra.i(fVar.f53211a, fVar.f53212b, this.f56121j.m(fVar, this, this.f56120i.a(fVar.f53213c))), fVar.f53213c, this.f56113b, fVar.f53214d, fVar.f53215e, fVar.f53216f, fVar.f53217g, fVar.f53218h);
        return true;
    }

    public void discardBuffer(long j10, boolean z10) {
        if (!this.C || C()) {
            return;
        }
        int length = this.f56133v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f56133v[i10].q(j10, z10, this.N[i10]);
        }
    }

    @Override // u9.m
    public void endTracks() {
        this.U = true;
        this.f56129r.post(this.f56128q);
    }

    @Override // com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.Q;
        }
        long jMax = this.P;
        i iVarX = x();
        if (!iVarX.f()) {
            if (this.f56125n.size() > 1) {
                ArrayList arrayList = this.f56125n;
                iVarX = (i) arrayList.get(arrayList.size() - 2);
            } else {
                iVarX = null;
            }
        }
        if (iVarX != null) {
            jMax = Math.max(jMax, iVarX.f53218h);
        }
        if (this.C) {
            for (d dVar : this.f56133v) {
                jMax = Math.max(jMax, dVar.z());
            }
        }
        return jMax;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        if (C()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return x().f53218h;
    }

    public x getTrackGroups() {
        j();
        return this.I;
    }

    @Override // com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f56121j.i();
    }

    public int k(int i10) {
        j();
        ob.a.e(this.K);
        int i11 = this.K[i10];
        if (i11 == -1) {
            return this.J.contains(this.I.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.N;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public void maybeThrowPrepareError() throws ParserException {
        H();
        if (this.T && !this.D) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    public void o() {
        if (this.D) {
            return;
        }
        continueLoading(this.P);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void onLoaderReleased() {
        for (d dVar : this.f56133v) {
            dVar.S();
        }
    }

    @Override // com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
        if (this.f56121j.h() || C()) {
            return;
        }
        if (this.f56121j.i()) {
            ob.a.e(this.f56132u);
            if (this.f56115d.v(j10, this.f56132u, this.f56126o)) {
                this.f56121j.e();
                return;
            }
            return;
        }
        int size = this.f56126o.size();
        while (size > 0 && this.f56115d.c((i) this.f56126o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f56126o.size()) {
            t(size);
        }
        int iH = this.f56115d.h(j10, this.f56126o);
        if (iH < this.f56125n.size()) {
            t(iH);
        }
    }

    @Override // u9.m
    public b0 track(int i10, int i11) {
        b0 b0VarQ;
        if (!Y.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                b0[] b0VarArr = this.f56133v;
                if (i12 >= b0VarArr.length) {
                    b0VarQ = null;
                    break;
                }
                if (this.f56134w[i12] == i10) {
                    b0VarQ = b0VarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            b0VarQ = y(i10, i11);
        }
        if (b0VarQ == null) {
            if (this.U) {
                return p(i10, i11);
            }
            b0VarQ = q(i10, i11);
        }
        if (i11 != 5) {
            return b0VarQ;
        }
        if (this.f56137z == null) {
            this.f56137z = new c(b0VarQ, this.f56123l);
        }
        return this.f56137z;
    }

    @Override // u9.m
    public void c(u9.z zVar) {
    }
}
