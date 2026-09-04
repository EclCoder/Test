package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.v0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c0 implements u9.b0 {
    private v0 A;
    private v0 B;
    private long C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f17432a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f17435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f17436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f17437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v0 f17438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DrmSession f17439h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17450s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17454w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f17457z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f17433b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17440i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f17441j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f17442k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f17445n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f17444m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f17443l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private u9.b0.a[] f17446o = new u9.b0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f17434c = new h0(new ob.h() { // from class: com.google.android.exoplayer2.source.b0
        @Override // ob.h
        public final void accept(Object obj) {
            ((c0.c) obj).f17462b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f17451t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f17452u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f17453v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17456y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f17455x = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u9.b0.a f17460c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0 f17461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.j.b f17462b;

        private c(v0 v0Var, com.google.android.exoplayer2.drm.j.b bVar) {
            this.f17461a = v0Var;
            this.f17462b = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a(v0 v0Var);
    }

    protected c0(nb.b bVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.i.a aVar) {
        this.f17435d = jVar;
        this.f17436e = aVar;
        this.f17432a = new a0(bVar);
    }

    private long B(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iD = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f17445n[iD]);
            if ((this.f17444m[iD] & 1) != 0) {
                return jMax;
            }
            iD--;
            if (iD == -1) {
                iD = this.f17440i - 1;
            }
        }
        return jMax;
    }

    private int D(int i10) {
        int i11 = this.f17449r + i10;
        int i12 = this.f17440i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean H() {
        return this.f17450s != this.f17447p;
    }

    private boolean L(int i10) {
        DrmSession drmSession = this.f17439h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f17444m[i10] & 1073741824) == 0 && this.f17439h.b();
    }

    private void N(v0 v0Var, o9.p pVar) {
        v0 v0Var2 = this.f17438g;
        boolean z10 = v0Var2 == null;
        com.google.android.exoplayer2.drm.h hVar = z10 ? null : v0Var2.f18871o;
        this.f17438g = v0Var;
        com.google.android.exoplayer2.drm.h hVar2 = v0Var.f18871o;
        com.google.android.exoplayer2.drm.j jVar = this.f17435d;
        pVar.f48303b = jVar != null ? v0Var.c(jVar.b(v0Var)) : v0Var;
        pVar.f48302a = this.f17439h;
        if (this.f17435d == null) {
            return;
        }
        if (z10 || !r0.c(hVar, hVar2)) {
            DrmSession drmSession = this.f17439h;
            DrmSession drmSessionC = this.f17435d.c(this.f17436e, v0Var);
            this.f17439h = drmSessionC;
            pVar.f48302a = drmSessionC;
            if (drmSession != null) {
                drmSession.f(this.f17436e);
            }
        }
    }

    private synchronized int O(o9.p pVar, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, b bVar) {
        try {
            decoderInputBuffer.f16755d = false;
            if (!H()) {
                if (!z11 && !this.f17454w) {
                    v0 v0Var = this.B;
                    if (v0Var == null || (!z10 && v0Var == this.f17438g)) {
                        return -3;
                    }
                    N((v0) ob.a.e(v0Var), pVar);
                    return -5;
                }
                decoderInputBuffer.k(4);
                return -4;
            }
            v0 v0Var2 = ((c) this.f17434c.e(C())).f17461a;
            if (!z10 && v0Var2 == this.f17438g) {
                int iD = D(this.f17450s);
                if (!L(iD)) {
                    decoderInputBuffer.f16755d = true;
                    return -3;
                }
                decoderInputBuffer.k(this.f17444m[iD]);
                if (this.f17450s == this.f17447p - 1 && (z11 || this.f17454w)) {
                    decoderInputBuffer.a(536870912);
                }
                long j10 = this.f17445n[iD];
                decoderInputBuffer.f16756e = j10;
                if (j10 < this.f17451t) {
                    decoderInputBuffer.a(Integer.MIN_VALUE);
                }
                bVar.f17458a = this.f17443l[iD];
                bVar.f17459b = this.f17442k[iD];
                bVar.f17460c = this.f17446o[iD];
                return -4;
            }
            N(v0Var2, pVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void T() {
        DrmSession drmSession = this.f17439h;
        if (drmSession != null) {
            drmSession.f(this.f17436e);
            this.f17439h = null;
            this.f17438g = null;
        }
    }

    private synchronized void W() {
        this.f17450s = 0;
        this.f17432a.o();
    }

    private synchronized boolean b0(v0 v0Var) {
        try {
            this.f17456y = false;
            if (r0.c(v0Var, this.B)) {
                return false;
            }
            if (this.f17434c.g() || !((c) this.f17434c.f()).f17461a.equals(v0Var)) {
                this.B = v0Var;
            } else {
                this.B = ((c) this.f17434c.f()).f17461a;
            }
            v0 v0Var2 = this.B;
            this.D = ob.y.a(v0Var2.f18868l, v0Var2.f18865i);
            this.E = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean h(long j10) {
        if (this.f17447p == 0) {
            return j10 > this.f17452u;
        }
        if (A() >= j10) {
            return false;
        }
        t(this.f17448q + j(j10));
        return true;
    }

    private synchronized void i(long j10, int i10, long j11, int i11, u9.b0.a aVar) {
        try {
            int i12 = this.f17447p;
            if (i12 > 0) {
                int iD = D(i12 - 1);
                ob.a.a(this.f17442k[iD] + ((long) this.f17443l[iD]) <= j11);
            }
            this.f17454w = (536870912 & i10) != 0;
            this.f17453v = Math.max(this.f17453v, j10);
            int iD2 = D(this.f17447p);
            this.f17445n[iD2] = j10;
            this.f17442k[iD2] = j11;
            this.f17443l[iD2] = i11;
            this.f17444m[iD2] = i10;
            this.f17446o[iD2] = aVar;
            this.f17441j[iD2] = this.C;
            if (this.f17434c.g() || !((c) this.f17434c.f()).f17461a.equals(this.B)) {
                com.google.android.exoplayer2.drm.j jVar = this.f17435d;
                this.f17434c.a(G(), new c((v0) ob.a.e(this.B), jVar != null ? jVar.d(this.f17436e, this.B) : com.google.android.exoplayer2.drm.j.b.f16870a));
            }
            int i13 = this.f17447p + 1;
            this.f17447p = i13;
            int i14 = this.f17440i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                u9.b0.a[] aVarArr = new u9.b0.a[i15];
                int i16 = this.f17449r;
                int i17 = i14 - i16;
                System.arraycopy(this.f17442k, i16, jArr2, 0, i17);
                System.arraycopy(this.f17445n, this.f17449r, jArr3, 0, i17);
                System.arraycopy(this.f17444m, this.f17449r, iArr, 0, i17);
                System.arraycopy(this.f17443l, this.f17449r, iArr2, 0, i17);
                System.arraycopy(this.f17446o, this.f17449r, aVarArr, 0, i17);
                System.arraycopy(this.f17441j, this.f17449r, jArr, 0, i17);
                int i18 = this.f17449r;
                System.arraycopy(this.f17442k, 0, jArr2, i17, i18);
                System.arraycopy(this.f17445n, 0, jArr3, i17, i18);
                System.arraycopy(this.f17444m, 0, iArr, i17, i18);
                System.arraycopy(this.f17443l, 0, iArr2, i17, i18);
                System.arraycopy(this.f17446o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f17441j, 0, jArr, i17, i18);
                this.f17442k = jArr2;
                this.f17445n = jArr3;
                this.f17444m = iArr;
                this.f17443l = iArr2;
                this.f17446o = aVarArr;
                this.f17441j = jArr;
                this.f17449r = 0;
                this.f17440i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int j(long j10) {
        int i10 = this.f17447p;
        int iD = D(i10 - 1);
        while (i10 > this.f17450s && this.f17445n[iD] >= j10) {
            i10--;
            iD--;
            if (iD == -1) {
                iD = this.f17440i - 1;
            }
        }
        return i10;
    }

    public static c0 k(nb.b bVar, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.i.a aVar) {
        return new c0(bVar, (com.google.android.exoplayer2.drm.j) ob.a.e(jVar), (com.google.android.exoplayer2.drm.i.a) ob.a.e(aVar));
    }

    public static c0 l(nb.b bVar) {
        return new c0(bVar, null, null);
    }

    private synchronized long m(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f17447p;
                if (i10 != 0) {
                    long[] jArr = this.f17445n;
                    int i11 = this.f17449r;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f17450s;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iV = v(i11, i10, j10, z10);
                        if (iV == -1) {
                            return -1L;
                        }
                        return p(iV);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    private synchronized long n() {
        int i10 = this.f17447p;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    private long p(int i10) {
        this.f17452u = Math.max(this.f17452u, B(i10));
        this.f17447p -= i10;
        int i11 = this.f17448q + i10;
        this.f17448q = i11;
        int i12 = this.f17449r + i10;
        this.f17449r = i12;
        int i13 = this.f17440i;
        if (i12 >= i13) {
            this.f17449r = i12 - i13;
        }
        int i14 = this.f17450s - i10;
        this.f17450s = i14;
        if (i14 < 0) {
            this.f17450s = 0;
        }
        this.f17434c.d(i11);
        if (this.f17447p != 0) {
            return this.f17442k[this.f17449r];
        }
        int i15 = this.f17449r;
        if (i15 == 0) {
            i15 = this.f17440i;
        }
        int i16 = i15 - 1;
        return this.f17442k[i16] + ((long) this.f17443l[i16]);
    }

    private long t(int i10) {
        int iG = G() - i10;
        boolean z10 = false;
        ob.a.a(iG >= 0 && iG <= this.f17447p - this.f17450s);
        int i11 = this.f17447p - iG;
        this.f17447p = i11;
        this.f17453v = Math.max(this.f17452u, B(i11));
        if (iG == 0 && this.f17454w) {
            z10 = true;
        }
        this.f17454w = z10;
        this.f17434c.c(i10);
        int i12 = this.f17447p;
        if (i12 == 0) {
            return 0L;
        }
        int iD = D(i12 - 1);
        return this.f17442k[iD] + ((long) this.f17443l[iD]);
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f17445n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f17444m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f17440i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f17452u, B(this.f17450s));
    }

    public final int C() {
        return this.f17448q + this.f17450s;
    }

    public final synchronized int E(long j10, boolean z10) throws Throwable {
        Throwable th2;
        try {
            try {
                int iD = D(this.f17450s);
                if (!H() || j10 < this.f17445n[iD]) {
                    return 0;
                }
                if (j10 <= this.f17453v || !z10) {
                    int iV = v(iD, this.f17447p - this.f17450s, j10, true);
                    if (iV == -1) {
                        return 0;
                    }
                    return iV;
                }
                try {
                    return this.f17447p - this.f17450s;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    public final synchronized v0 F() {
        return this.f17456y ? null : this.B;
    }

    public final int G() {
        return this.f17448q + this.f17447p;
    }

    protected final void I() {
        this.f17457z = true;
    }

    public final synchronized boolean J() {
        return this.f17454w;
    }

    public synchronized boolean K(boolean z10) {
        v0 v0Var;
        boolean z11 = true;
        if (H()) {
            if (((c) this.f17434c.e(C())).f17461a != this.f17438g) {
                return true;
            }
            return L(D(this.f17450s));
        }
        if (!z10 && !this.f17454w && ((v0Var = this.B) == null || v0Var == this.f17438g)) {
            z11 = false;
        }
        return z11;
    }

    public void M() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.f17439h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) ob.a.e(this.f17439h.getError()));
        }
    }

    public final synchronized long P() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return H() ? this.f17441j[D(this.f17450s)] : this.C;
    }

    public void Q() {
        r();
        T();
    }

    public int R(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int iO = O(pVar, decoderInputBuffer, (i10 & 2) != 0, z10, this.f17433b);
        if (iO == -4 && !decoderInputBuffer.g()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f17432a.f(decoderInputBuffer, this.f17433b);
                } else {
                    this.f17432a.m(decoderInputBuffer, this.f17433b);
                }
            }
            if (!z11) {
                this.f17450s++;
            }
        }
        return iO;
    }

    public void S() {
        V(true);
        T();
    }

    public final void U() {
        V(false);
    }

    public void V(boolean z10) {
        this.f17432a.n();
        this.f17447p = 0;
        this.f17448q = 0;
        this.f17449r = 0;
        this.f17450s = 0;
        this.f17455x = true;
        this.f17451t = Long.MIN_VALUE;
        this.f17452u = Long.MIN_VALUE;
        this.f17453v = Long.MIN_VALUE;
        this.f17454w = false;
        this.f17434c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f17456y = true;
        }
    }

    public final synchronized boolean X(int i10) {
        W();
        int i11 = this.f17448q;
        if (i10 >= i11 && i10 <= this.f17447p + i11) {
            this.f17451t = Long.MIN_VALUE;
            this.f17450s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean Y(long j10, boolean z10) throws Throwable {
        try {
            try {
                W();
                int iD = D(this.f17450s);
                if (!H() || j10 < this.f17445n[iD] || (j10 > this.f17453v && !z10)) {
                    return false;
                }
                int iV = v(iD, this.f17447p - this.f17450s, j10, true);
                if (iV == -1) {
                    return false;
                }
                this.f17451t = j10;
                this.f17450s += iV;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void Z(long j10) {
        if (this.F != j10) {
            this.F = j10;
            I();
        }
    }

    public final void a0(long j10) {
        this.f17451t = j10;
    }

    @Override // u9.b0
    public final void b(ob.d0 d0Var, int i10, int i11) {
        this.f17432a.q(d0Var, i10);
    }

    public final void c0(d dVar) {
        this.f17437f = dVar;
    }

    @Override // u9.b0
    public final int d(nb.h hVar, int i10, boolean z10, int i11) {
        return this.f17432a.p(hVar, i10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void d0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f17450s + i10 <= this.f17447p) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z10 = false;
        }
        ob.a.a(z10);
        this.f17450s += i10;
    }

    @Override // u9.b0
    public final void e(v0 v0Var) {
        v0 v0VarW = w(v0Var);
        this.f17457z = false;
        this.A = v0Var;
        boolean zB0 = b0(v0VarW);
        d dVar = this.f17437f;
        if (dVar == null || !zB0) {
            return;
        }
        dVar.a(v0VarW);
    }

    public final void e0(long j10) {
        this.C = j10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // u9.b0
    public void f(long j10, int i10, int i11, int i12, u9.b0.a aVar) {
        int i13;
        if (this.f17457z) {
            e((v0) ob.a.i(this.A));
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.f17455x) {
            if (!z10) {
                return;
            } else {
                this.f17455x = false;
            }
        }
        long j11 = this.F + j10;
        if (!this.D) {
            i13 = i10;
        } else {
            if (j11 < this.f17451t) {
                return;
            }
            if (i14 == 0) {
                if (!this.E) {
                    ob.u.i("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        if (this.G) {
            if (!z10 || !h(j11)) {
                return;
            } else {
                this.G = false;
            }
        }
        i(j11, i13, (this.f17432a.e() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    public final void f0() {
        this.G = true;
    }

    public synchronized long o() {
        int i10 = this.f17450s;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f17432a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f17432a.b(n());
    }

    public final void s() {
        this.f17432a.b(o());
    }

    public final void u(int i10) {
        this.f17432a.c(t(i10));
    }

    protected v0 w(v0 v0Var) {
        return (this.F == 0 || v0Var.f18872p == Long.MAX_VALUE) ? v0Var : v0Var.b().k0(v0Var.f18872p + this.F).G();
    }

    public final int x() {
        return this.f17448q;
    }

    public final synchronized long y() {
        return this.f17447p == 0 ? Long.MIN_VALUE : this.f17445n[this.f17449r];
    }

    public final synchronized long z() {
        return this.f17453v;
    }
}
