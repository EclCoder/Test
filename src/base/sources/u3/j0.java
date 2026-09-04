package u3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements o2.p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o2.u f53857v = new o2.u() { // from class: u3.i0
        @Override // o2.u
        public final o2.p[] createExtractors() {
            return j0.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f53861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w1.u f53862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f53863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k0.c f53864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l3.r.a f53865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f53866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f53867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f53868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h0 f53869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g0 f53870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o2.r f53871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f53872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f53873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k0 f53876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f53877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f53878u;

    public j0(int i10, l3.r.a aVar) {
        this(1, i10, aVar, new w1.z(0L), new j(0), 112800);
    }

    public static /* synthetic */ o2.p[] a() {
        return new o2.p[]{new j0(1, l3.r.a.f43873a)};
    }

    static /* synthetic */ int l(j0 j0Var) {
        int i10 = j0Var.f53872o;
        j0Var.f53872o = i10 + 1;
        return i10;
    }

    private boolean v(o2.q qVar) {
        byte[] bArrE = this.f53862e.e();
        if (9400 - this.f53862e.f() < 188) {
            int iA = this.f53862e.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f53862e.f(), bArrE, 0, iA);
            }
            this.f53862e.R(bArrE, iA);
        }
        while (this.f53862e.a() < 188) {
            int iG = this.f53862e.g();
            int i10 = qVar.read(bArrE, iG, 9400 - iG);
            if (i10 == -1) {
                return false;
            }
            this.f53862e.S(iG + i10);
        }
        return true;
    }

    private int w() throws ParserException {
        int iF = this.f53862e.f();
        int iG = this.f53862e.g();
        int iA = l0.a(this.f53862e.e(), iF, iG);
        this.f53862e.T(iA);
        int i10 = iA + 188;
        if (i10 <= iG) {
            this.f53877t = 0;
            return i10;
        }
        int i11 = this.f53877t + (iA - iF);
        this.f53877t = i11;
        if (this.f53858a != 2 || i11 <= 376) {
            return i10;
        }
        throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void x(long j10) {
        if (this.f53874q) {
            return;
        }
        this.f53874q = true;
        if (this.f53869l.b() == C.TIME_UNSET) {
            this.f53871n.d(new o2.j0.b(this.f53869l.b()));
            return;
        }
        g0 g0Var = new g0(this.f53869l.c(), this.f53869l.b(), j10, this.f53878u, this.f53860c);
        this.f53870m = g0Var;
        this.f53871n.d(g0Var.b());
    }

    private void y() {
        this.f53867j.clear();
        this.f53866i.clear();
        SparseArray sparseArrayCreateInitialPayloadReaders = this.f53864g.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f53866i.put(sparseArrayCreateInitialPayloadReaders.keyAt(i10), (k0) sparseArrayCreateInitialPayloadReaders.valueAt(i10));
        }
        this.f53866i.put(0, new e0(new a()));
        this.f53876s = null;
    }

    private boolean z(int i10) {
        return this.f53858a == 2 || this.f53873p || !this.f53868k.get(i10, false);
    }

    @Override // o2.p
    public int b(o2.q qVar, o2.i0 i0Var) throws ParserException {
        int i10;
        long length = qVar.getLength();
        boolean z10 = this.f53858a == 2;
        if (this.f53873p) {
            if (length != -1 && !z10 && !this.f53869l.d()) {
                return this.f53869l.e(qVar, i0Var, this.f53878u);
            }
            x(length);
            if (this.f53875r) {
                this.f53875r = false;
                seek(0L, 0L);
                if (qVar.getPosition() != 0) {
                    i0Var.f48076a = 0L;
                    return 1;
                }
            }
            g0 g0Var = this.f53870m;
            if (g0Var != null && g0Var.d()) {
                return this.f53870m.c(qVar, i0Var);
            }
        }
        if (!v(qVar)) {
            for (int i11 = 0; i11 < this.f53866i.size(); i11++) {
                k0 k0Var = (k0) this.f53866i.valueAt(i11);
                if (k0Var instanceof y) {
                    y yVar = (y) k0Var;
                    if (yVar.c(z10)) {
                        yVar.b(new w1.u(), 1);
                    }
                }
            }
            return -1;
        }
        int iW = w();
        int iG = this.f53862e.g();
        if (iW > iG) {
            return 0;
        }
        int iP = this.f53862e.p();
        if ((8388608 & iP) != 0) {
            this.f53862e.T(iW);
            return 0;
        }
        int i12 = (4194304 & iP) != 0 ? 1 : 0;
        int i13 = (2096896 & iP) >> 8;
        boolean z11 = (iP & 32) != 0;
        k0 k0Var2 = (iP & 16) != 0 ? (k0) this.f53866i.get(i13) : null;
        if (k0Var2 == null) {
            this.f53862e.T(iW);
            return 0;
        }
        if (this.f53858a != 2) {
            int i14 = iP & 15;
            i10 = 0;
            int i15 = this.f53863f.get(i13, i14 - 1);
            this.f53863f.put(i13, i14);
            if (i15 == i14) {
                this.f53862e.T(iW);
                return 0;
            }
            if (i14 != ((i15 + 1) & 15)) {
                k0Var2.seek();
            }
        } else {
            i10 = 0;
        }
        if (z11) {
            int iG2 = this.f53862e.G();
            i12 |= (this.f53862e.G() & 64) != 0 ? 2 : i10;
            this.f53862e.U(iG2 - 1);
        }
        boolean z12 = this.f53873p;
        if (z(i13)) {
            this.f53862e.S(iW);
            k0Var2.b(this.f53862e, i12);
            this.f53862e.S(iG);
        }
        if (this.f53858a != 2 && !z12 && this.f53873p && length != -1) {
            this.f53875r = true;
        }
        this.f53862e.T(iW);
        return i10;
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        if ((this.f53859b & 1) == 0) {
            rVar = new l3.t(rVar, this.f53865h);
        }
        this.f53871n = rVar;
    }

    @Override // o2.p
    public boolean d(o2.q qVar) {
        byte[] bArrE = this.f53862e.e();
        qVar.peekFully(bArrE, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    qVar.skipFully(i10);
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

    @Override // o2.p
    public void seek(long j10, long j11) {
        g0 g0Var;
        w1.a.g(this.f53858a != 2);
        int size = this.f53861d.size();
        for (int i10 = 0; i10 < size; i10++) {
            w1.z zVar = (w1.z) this.f53861d.get(i10);
            boolean z10 = zVar.f() == C.TIME_UNSET;
            if (!z10) {
                long jD = zVar.d();
                z10 = (jD == C.TIME_UNSET || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                zVar.i(j11);
            }
        }
        if (j11 != 0 && (g0Var = this.f53870m) != null) {
            g0Var.h(j11);
        }
        this.f53862e.P(0);
        this.f53863f.clear();
        for (int i11 = 0; i11 < this.f53866i.size(); i11++) {
            ((k0) this.f53866i.valueAt(i11)).seek();
        }
        this.f53877t = 0;
    }

    public j0(int i10, int i11, l3.r.a aVar, w1.z zVar, k0.c cVar, int i12) {
        this.f53864g = (k0.c) w1.a.e(cVar);
        this.f53860c = i12;
        this.f53858a = i10;
        this.f53859b = i11;
        this.f53865h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f53861d = Collections.singletonList(zVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f53861d = arrayList;
            arrayList.add(zVar);
        }
        this.f53862e = new w1.u(new byte[9400], 0);
        this.f53867j = new SparseBooleanArray();
        this.f53868k = new SparseBooleanArray();
        this.f53866i = new SparseArray();
        this.f53863f = new SparseIntArray();
        this.f53869l = new h0(i12);
        this.f53871n = o2.r.A2;
        this.f53878u = -1;
        y();
    }

    @Override // o2.p
    public void release() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w1.t f53879a = new w1.t(new byte[4]);

        public a() {
        }

        @Override // u3.d0
        public void b(w1.u uVar) {
            if (uVar.G() == 0 && (uVar.G() & 128) != 0) {
                uVar.U(6);
                int iA = uVar.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    uVar.k(this.f53879a, 4);
                    int iH = this.f53879a.h(16);
                    this.f53879a.r(3);
                    if (iH == 0) {
                        this.f53879a.r(13);
                    } else {
                        int iH2 = this.f53879a.h(13);
                        if (j0.this.f53866i.get(iH2) == null) {
                            j0.this.f53866i.put(iH2, new e0(j0.this.new b(iH2)));
                            j0.l(j0.this);
                        }
                    }
                }
                if (j0.this.f53858a != 2) {
                    j0.this.f53866i.remove(0);
                }
            }
        }

        @Override // u3.d0
        public void a(w1.z zVar, o2.r rVar, k0.d dVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w1.t f53881a = new w1.t(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f53882b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f53883c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f53884d;

        public b(int i10) {
            this.f53884d = i10;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private k0.b c(w1.u uVar, int i10) {
            int i11;
            int iF = uVar.f();
            int i12 = iF + i10;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iG = 0;
            while (uVar.f() < i12) {
                int iG2 = uVar.G();
                int iF2 = uVar.f() + uVar.G();
                if (iF2 > i12) {
                    break;
                }
                if (iG2 == 5) {
                    long jI = uVar.I();
                    if (jI == 1094921523) {
                        i13 = 129;
                    } else if (jI == 1161904947) {
                        i13 = 135;
                    } else if (jI == 1094921524) {
                        i13 = 172;
                    } else if (jI == 1212503619) {
                        i13 = 36;
                    }
                } else if (iG2 == 106) {
                    i13 = 129;
                } else if (iG2 == 122) {
                    i13 = 135;
                } else if (iG2 == 127) {
                    int iG3 = uVar.G();
                    if (iG3 == 21) {
                        i13 = 172;
                    } else if (iG3 == 14) {
                        i13 = Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE;
                    } else if (iG3 == 33) {
                        i13 = 139;
                    }
                } else {
                    if (iG2 == 123) {
                        i11 = 138;
                    } else if (iG2 == 10) {
                        String strTrim = uVar.D(3).trim();
                        iG = uVar.G();
                        str = strTrim;
                    } else if (iG2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (uVar.f() < iF2) {
                            String strTrim2 = uVar.D(3).trim();
                            int iG4 = uVar.G();
                            byte[] bArr = new byte[4];
                            uVar.l(bArr, 0, 4);
                            arrayList2.add(new k0.a(strTrim2, iG4, bArr));
                        }
                        arrayList = arrayList2;
                        i13 = 89;
                    } else if (iG2 == 111) {
                        i11 = 257;
                    }
                    i13 = i11;
                }
                uVar.U(iF2 - uVar.f());
            }
            uVar.T(i12);
            return new k0.b(i13, str, iG, arrayList, Arrays.copyOfRange(uVar.e(), iF, i12));
        }

        @Override // u3.d0
        public void b(w1.u uVar) {
            w1.z zVar;
            if (uVar.G() != 2) {
                return;
            }
            if (j0.this.f53858a == 1 || j0.this.f53858a == 2 || j0.this.f53872o == 1) {
                zVar = (w1.z) j0.this.f53861d.get(0);
            } else {
                zVar = new w1.z(((w1.z) j0.this.f53861d.get(0)).d());
                j0.this.f53861d.add(zVar);
            }
            if ((uVar.G() & 128) == 0) {
                return;
            }
            uVar.U(1);
            int iM = uVar.M();
            int i10 = 3;
            uVar.U(3);
            uVar.k(this.f53881a, 2);
            this.f53881a.r(3);
            int i11 = 13;
            j0.this.f53878u = this.f53881a.h(13);
            uVar.k(this.f53881a, 2);
            int i12 = 4;
            this.f53881a.r(4);
            uVar.U(this.f53881a.h(12));
            if (j0.this.f53858a == 2 && j0.this.f53876s == null) {
                k0.b bVar = new k0.b(21, null, 0, null, w1.c0.f55774f);
                j0 j0Var = j0.this;
                j0Var.f53876s = j0Var.f53864g.a(21, bVar);
                if (j0.this.f53876s != null) {
                    j0.this.f53876s.a(zVar, j0.this.f53871n, new k0.d(iM, 21, 8192));
                }
            }
            this.f53882b.clear();
            this.f53883c.clear();
            int iA = uVar.a();
            while (iA > 0) {
                uVar.k(this.f53881a, 5);
                int iH = this.f53881a.h(8);
                this.f53881a.r(i10);
                int iH2 = this.f53881a.h(i11);
                this.f53881a.r(i12);
                int iH3 = this.f53881a.h(12);
                k0.b bVarC = c(uVar, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f53905a;
                }
                iA -= iH3 + 5;
                int i13 = j0.this.f53858a == 2 ? iH : iH2;
                if (!j0.this.f53867j.get(i13)) {
                    k0 k0VarA = (j0.this.f53858a == 2 && iH == 21) ? j0.this.f53876s : j0.this.f53864g.a(iH, bVarC);
                    if (j0.this.f53858a != 2 || iH2 < this.f53883c.get(i13, 8192)) {
                        this.f53883c.put(i13, iH2);
                        this.f53882b.put(i13, k0VarA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f53883c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f53883c.keyAt(i14);
                int iValueAt = this.f53883c.valueAt(i14);
                j0.this.f53867j.put(iKeyAt, true);
                j0.this.f53868k.put(iValueAt, true);
                k0 k0Var = (k0) this.f53882b.valueAt(i14);
                if (k0Var != null) {
                    if (k0Var != j0.this.f53876s) {
                        k0Var.a(zVar, j0.this.f53871n, new k0.d(iM, iKeyAt, 8192));
                    }
                    j0.this.f53866i.put(iValueAt, k0Var);
                }
            }
            if (j0.this.f53858a == 2) {
                if (j0.this.f53873p) {
                    return;
                }
                j0.this.f53871n.endTracks();
                j0.this.f53872o = 0;
                j0.this.f53873p = true;
                return;
            }
            j0.this.f53866i.remove(this.f53884d);
            j0 j0Var2 = j0.this;
            j0Var2.f53872o = j0Var2.f53858a == 1 ? 0 : j0.this.f53872o - 1;
            if (j0.this.f53872o == 0) {
                j0.this.f53871n.endTracks();
                j0.this.f53873p = true;
            }
        }

        @Override // u3.d0
        public void a(w1.z zVar, o2.r rVar, k0.d dVar) {
        }
    }
}
