package ea;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ob.n0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements u9.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u9.p f37385t = new u9.p() { // from class: ea.g0
        @Override // u9.p
        public final u9.k[] createExtractors() {
            return h0.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f37388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ob.d0 f37389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseIntArray f37390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i0.c f37391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray f37392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f37393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f37394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f0 f37395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e0 f37396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private u9.m f37397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f37401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private i0 f37402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f37403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f37404s;

    public h0() {
        this(0);
    }

    public static /* synthetic */ u9.k[] a() {
        return new u9.k[]{new h0()};
    }

    static /* synthetic */ int j(h0 h0Var) {
        int i10 = h0Var.f37398m;
        h0Var.f37398m = i10 + 1;
        return i10;
    }

    private boolean t(u9.l lVar) {
        byte[] bArrE = this.f37389d.e();
        if (9400 - this.f37389d.f() < 188) {
            int iA = this.f37389d.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f37389d.f(), bArrE, 0, iA);
            }
            this.f37389d.S(bArrE, iA);
        }
        while (this.f37389d.a() < 188) {
            int iG = this.f37389d.g();
            int i10 = lVar.read(bArrE, iG, 9400 - iG);
            if (i10 == -1) {
                return false;
            }
            this.f37389d.T(iG + i10);
        }
        return true;
    }

    private int u() throws ParserException {
        int iF = this.f37389d.f();
        int iG = this.f37389d.g();
        int iA = j0.a(this.f37389d.e(), iF, iG);
        this.f37389d.U(iA);
        int i10 = iA + 188;
        if (i10 <= iG) {
            this.f37403r = 0;
            return i10;
        }
        int i11 = this.f37403r + (iA - iF);
        this.f37403r = i11;
        if (this.f37386a != 2 || i11 <= 376) {
            return i10;
        }
        throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void v(long j10) {
        if (this.f37400o) {
            return;
        }
        this.f37400o = true;
        if (this.f37395j.b() == C.TIME_UNSET) {
            this.f37397l.c(new u9.z.b(this.f37395j.b()));
            return;
        }
        e0 e0Var = new e0(this.f37395j.c(), this.f37395j.b(), j10, this.f37404s, this.f37387b);
        this.f37396k = e0Var;
        this.f37397l.c(e0Var.b());
    }

    private void w() {
        this.f37393h.clear();
        this.f37392g.clear();
        SparseArray sparseArrayCreateInitialPayloadReaders = this.f37391f.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f37392g.put(sparseArrayCreateInitialPayloadReaders.keyAt(i10), (i0) sparseArrayCreateInitialPayloadReaders.valueAt(i10));
        }
        this.f37392g.put(0, new c0(new a()));
        this.f37402q = null;
    }

    private boolean x(int i10) {
        return this.f37386a == 2 || this.f37399n || !this.f37394i.get(i10, false);
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        this.f37397l = mVar;
    }

    @Override // u9.k
    public int c(u9.l lVar, u9.y yVar) throws ParserException {
        long j10;
        long length = lVar.getLength();
        if (this.f37399n) {
            if (length != -1 && this.f37386a != 2 && !this.f37395j.d()) {
                return this.f37395j.e(lVar, yVar, this.f37404s);
            }
            v(length);
            if (this.f37401p) {
                this.f37401p = false;
                seek(0L, 0L);
                if (lVar.getPosition() != 0) {
                    yVar.f54333a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f37396k;
            if (e0Var != null && e0Var.d()) {
                return this.f37396k.c(lVar, yVar);
            }
        }
        if (!t(lVar)) {
            return -1;
        }
        int iU = u();
        int iG = this.f37389d.g();
        if (iU > iG) {
            return 0;
        }
        int iQ = this.f37389d.q();
        if ((8388608 & iQ) != 0) {
            this.f37389d.U(iU);
            return 0;
        }
        int i10 = (4194304 & iQ) != 0 ? 1 : 0;
        int i11 = (2096896 & iQ) >> 8;
        boolean z10 = (iQ & 32) != 0;
        i0 i0Var = (iQ & 16) != 0 ? (i0) this.f37392g.get(i11) : null;
        if (i0Var == null) {
            this.f37389d.U(iU);
            return 0;
        }
        if (this.f37386a != 2) {
            int i12 = iQ & 15;
            j10 = -1;
            int i13 = this.f37390e.get(i11, i12 - 1);
            this.f37390e.put(i11, i12);
            if (i13 == i12) {
                this.f37389d.U(iU);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                i0Var.seek();
            }
        } else {
            j10 = -1;
        }
        if (z10) {
            int iH = this.f37389d.H();
            i10 |= (this.f37389d.H() & 64) != 0 ? 2 : 0;
            this.f37389d.V(iH - 1);
        }
        boolean z11 = this.f37399n;
        if (x(i11)) {
            this.f37389d.T(iU);
            i0Var.b(this.f37389d, i10);
            this.f37389d.T(iG);
        }
        if (this.f37386a != 2 && !z11 && this.f37399n && length != j10) {
            this.f37401p = true;
        }
        this.f37389d.U(iU);
        return 0;
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        byte[] bArrE = this.f37389d.e();
        lVar.peekFully(bArrE, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    lVar.skipFully(i10);
                    return true;
                }
                if (bArrE[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        e0 e0Var;
        ob.a.g(this.f37386a != 2);
        int size = this.f37388c.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) this.f37388c.get(i10);
            boolean z10 = n0Var.e() == C.TIME_UNSET;
            if (!z10) {
                long jC = n0Var.c();
                z10 = (jC == C.TIME_UNSET || jC == 0 || jC == j11) ? false : true;
            }
            if (z10) {
                n0Var.h(j11);
            }
        }
        if (j11 != 0 && (e0Var = this.f37396k) != null) {
            e0Var.h(j11);
        }
        this.f37389d.Q(0);
        this.f37390e.clear();
        for (int i11 = 0; i11 < this.f37392g.size(); i11++) {
            ((i0) this.f37392g.valueAt(i11)).seek();
        }
        this.f37403r = 0;
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new n0(0L), new j(i11), i12);
    }

    public h0(int i10, n0 n0Var, i0.c cVar) {
        this(i10, n0Var, cVar, 112800);
    }

    public h0(int i10, n0 n0Var, i0.c cVar, int i11) {
        this.f37391f = (i0.c) ob.a.e(cVar);
        this.f37387b = i11;
        this.f37386a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f37388c = arrayList;
            arrayList.add(n0Var);
        } else {
            this.f37388c = Collections.singletonList(n0Var);
        }
        this.f37389d = new ob.d0(new byte[9400], 0);
        this.f37393h = new SparseBooleanArray();
        this.f37394i = new SparseBooleanArray();
        this.f37392g = new SparseArray();
        this.f37390e = new SparseIntArray();
        this.f37395j = new f0(i11);
        this.f37397l = u9.m.B2;
        this.f37404s = -1;
        w();
    }

    @Override // u9.k
    public void release() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ob.c0 f37405a = new ob.c0(new byte[4]);

        public a() {
        }

        @Override // ea.b0
        public void b(ob.d0 d0Var) {
            if (d0Var.H() == 0 && (d0Var.H() & 128) != 0) {
                d0Var.V(6);
                int iA = d0Var.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    d0Var.k(this.f37405a, 4);
                    int iH = this.f37405a.h(16);
                    this.f37405a.r(3);
                    if (iH == 0) {
                        this.f37405a.r(13);
                    } else {
                        int iH2 = this.f37405a.h(13);
                        if (h0.this.f37392g.get(iH2) == null) {
                            h0.this.f37392g.put(iH2, new c0(h0.this.new b(iH2)));
                            h0.j(h0.this);
                        }
                    }
                }
                if (h0.this.f37386a != 2) {
                    h0.this.f37392g.remove(0);
                }
            }
        }

        @Override // ea.b0
        public void a(n0 n0Var, u9.m mVar, i0.d dVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ob.c0 f37407a = new ob.c0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f37408b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f37409c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f37410d;

        public b(int i10) {
            this.f37410d = i10;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:24:0x0055  */
        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        private i0.b c(ob.d0 d0Var, int i10) {
            int iF = d0Var.f();
            int i11 = i10 + iF;
            int i12 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (d0Var.f() < i11) {
                int iH = d0Var.H();
                int iF2 = d0Var.f() + d0Var.H();
                if (iF2 > i11) {
                    break;
                }
                if (iH == 5) {
                    long J = d0Var.J();
                    if (J == 1094921523) {
                        i12 = 129;
                    } else if (J == 1161904947) {
                        i12 = 135;
                    } else if (J == 1094921524) {
                        i12 = 172;
                    } else if (J == 1212503619) {
                        i12 = 36;
                    }
                } else if (iH == 106) {
                    i12 = 129;
                } else if (iH == 122) {
                    i12 = 135;
                } else if (iH == 127) {
                    if (d0Var.H() == 21) {
                        i12 = 172;
                    }
                } else if (iH == 123) {
                    i12 = 138;
                } else if (iH == 10) {
                    strTrim = d0Var.E(3).trim();
                } else if (iH == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (d0Var.f() < iF2) {
                        String strTrim2 = d0Var.E(3).trim();
                        int iH2 = d0Var.H();
                        byte[] bArr = new byte[4];
                        d0Var.l(bArr, 0, 4);
                        arrayList2.add(new i0.a(strTrim2, iH2, bArr));
                    }
                    arrayList = arrayList2;
                    i12 = 89;
                } else if (iH == 111) {
                    i12 = 257;
                }
                d0Var.V(iF2 - d0Var.f());
            }
            d0Var.U(i11);
            return new i0.b(i12, strTrim, arrayList, Arrays.copyOfRange(d0Var.e(), iF, i11));
        }

        @Override // ea.b0
        public void b(ob.d0 d0Var) {
            n0 n0Var;
            if (d0Var.H() != 2) {
                return;
            }
            if (h0.this.f37386a == 1 || h0.this.f37386a == 2 || h0.this.f37398m == 1) {
                n0Var = (n0) h0.this.f37388c.get(0);
            } else {
                n0Var = new n0(((n0) h0.this.f37388c.get(0)).c());
                h0.this.f37388c.add(n0Var);
            }
            if ((d0Var.H() & 128) == 0) {
                return;
            }
            d0Var.V(1);
            int iN = d0Var.N();
            int i10 = 3;
            d0Var.V(3);
            d0Var.k(this.f37407a, 2);
            this.f37407a.r(3);
            int i11 = 13;
            h0.this.f37404s = this.f37407a.h(13);
            d0Var.k(this.f37407a, 2);
            int i12 = 4;
            this.f37407a.r(4);
            d0Var.V(this.f37407a.h(12));
            if (h0.this.f37386a == 2 && h0.this.f37402q == null) {
                i0.b bVar = new i0.b(21, null, null, r0.f48430f);
                h0 h0Var = h0.this;
                h0Var.f37402q = h0Var.f37391f.a(21, bVar);
                if (h0.this.f37402q != null) {
                    h0.this.f37402q.a(n0Var, h0.this.f37397l, new i0.d(iN, 21, 8192));
                }
            }
            this.f37408b.clear();
            this.f37409c.clear();
            int iA = d0Var.a();
            while (iA > 0) {
                d0Var.k(this.f37407a, 5);
                int iH = this.f37407a.h(8);
                this.f37407a.r(i10);
                int iH2 = this.f37407a.h(i11);
                this.f37407a.r(i12);
                int iH3 = this.f37407a.h(12);
                i0.b bVarC = c(d0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f37437a;
                }
                iA -= iH3 + 5;
                int i13 = h0.this.f37386a == 2 ? iH : iH2;
                if (!h0.this.f37393h.get(i13)) {
                    i0 i0VarA = (h0.this.f37386a == 2 && iH == 21) ? h0.this.f37402q : h0.this.f37391f.a(iH, bVarC);
                    if (h0.this.f37386a != 2 || iH2 < this.f37409c.get(i13, 8192)) {
                        this.f37409c.put(i13, iH2);
                        this.f37408b.put(i13, i0VarA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f37409c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f37409c.keyAt(i14);
                int iValueAt = this.f37409c.valueAt(i14);
                h0.this.f37393h.put(iKeyAt, true);
                h0.this.f37394i.put(iValueAt, true);
                i0 i0Var = (i0) this.f37408b.valueAt(i14);
                if (i0Var != null) {
                    if (i0Var != h0.this.f37402q) {
                        i0Var.a(n0Var, h0.this.f37397l, new i0.d(iN, iKeyAt, 8192));
                    }
                    h0.this.f37392g.put(iValueAt, i0Var);
                }
            }
            if (h0.this.f37386a == 2) {
                if (h0.this.f37399n) {
                    return;
                }
                h0.this.f37397l.endTracks();
                h0.this.f37398m = 0;
                h0.this.f37399n = true;
                return;
            }
            h0.this.f37392g.remove(this.f37410d);
            h0 h0Var2 = h0.this;
            h0Var2.f37398m = h0Var2.f37386a == 1 ? 0 : h0.this.f37398m - 1;
            if (h0.this.f37398m == 0) {
                h0.this.f37397l.endTracks();
                h0.this.f37399n = true;
            }
        }

        @Override // ea.b0
        public void a(n0 n0Var, u9.m mVar, i0.d dVar) {
        }
    }
}
