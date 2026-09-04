package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.f1;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f0 implements o0 {
    private t1.o A;
    private t1.o B;
    private long C;
    private boolean E;
    private long F;
    private boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f5916a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f5919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f5920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f5921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t1.o f5922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DrmSession f5923h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5934s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f5938w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f5941z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f5917b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5924i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f5925j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f5926k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f5929n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f5928m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f5927l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o0.a[] f5930o = new o0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0 f5918c = new j0(new w1.h() { // from class: androidx.media3.exoplayer.source.e0
        @Override // w1.h
        public final void accept(Object obj) {
            ((f0.c) obj).f5946b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f5935t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f5936u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f5937v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f5940y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f5939x = true;
    private boolean D = true;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f5943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o0.a f5944c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t1.o f5945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.i.b f5946b;

        private c(t1.o oVar, androidx.media3.exoplayer.drm.i.b bVar) {
            this.f5945a = oVar;
            this.f5946b = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void e(t1.o oVar);
    }

    protected f0(l2.b bVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar) {
        this.f5919d = iVar;
        this.f5920e = aVar;
        this.f5916a = new d0(bVar);
    }

    private boolean D() {
        return this.f5934s != this.f5931p;
    }

    private boolean G(int i10) {
        DrmSession drmSession = this.f5923h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f5928m[i10] & 1073741824) == 0 && this.f5923h.b();
    }

    private void I(t1.o oVar, f1 f1Var) {
        t1.o oVar2 = this.f5922g;
        boolean z10 = oVar2 == null;
        t1.k kVar = oVar2 == null ? null : oVar2.f52761r;
        this.f5922g = oVar;
        t1.k kVar2 = oVar.f52761r;
        androidx.media3.exoplayer.drm.i iVar = this.f5919d;
        f1Var.f5339b = iVar != null ? oVar.b(iVar.b(oVar)) : oVar;
        f1Var.f5338a = this.f5923h;
        if (this.f5919d == null) {
            return;
        }
        if (z10 || !w1.c0.c(kVar, kVar2)) {
            DrmSession drmSession = this.f5923h;
            DrmSession drmSessionD = this.f5919d.d(this.f5920e, oVar);
            this.f5923h = drmSessionD;
            f1Var.f5338a = drmSessionD;
            if (drmSession != null) {
                drmSession.g(this.f5920e);
            }
        }
    }

    private synchronized int J(f1 f1Var, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, b bVar) {
        try {
            decoderInputBuffer.f4865e = false;
            if (!D()) {
                if (!z11 && !this.f5938w) {
                    t1.o oVar = this.B;
                    if (oVar == null || (!z10 && oVar == this.f5922g)) {
                        return -3;
                    }
                    I((t1.o) w1.a.e(oVar), f1Var);
                    return -5;
                }
                decoderInputBuffer.i(4);
                decoderInputBuffer.f4866f = Long.MIN_VALUE;
                return -4;
            }
            t1.o oVar2 = ((c) this.f5918c.e(y())).f5945a;
            if (!z10 && oVar2 == this.f5922g) {
                int iZ = z(this.f5934s);
                if (!G(iZ)) {
                    decoderInputBuffer.f4865e = true;
                    return -3;
                }
                decoderInputBuffer.i(this.f5928m[iZ]);
                if (this.f5934s == this.f5931p - 1 && (z11 || this.f5938w)) {
                    decoderInputBuffer.a(536870912);
                }
                decoderInputBuffer.f4866f = this.f5929n[iZ];
                bVar.f5942a = this.f5927l[iZ];
                bVar.f5943b = this.f5926k[iZ];
                bVar.f5944c = this.f5930o[iZ];
                return -4;
            }
            I(oVar2, f1Var);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void N() {
        DrmSession drmSession = this.f5923h;
        if (drmSession != null) {
            drmSession.g(this.f5920e);
            this.f5923h = null;
            this.f5922g = null;
        }
    }

    private synchronized void Q() {
        this.f5934s = 0;
        this.f5916a.n();
    }

    private synchronized boolean U(t1.o oVar) {
        try {
            this.f5940y = false;
            if (w1.c0.c(oVar, this.B)) {
                return false;
            }
            if (this.f5918c.g() || !((c) this.f5918c.f()).f5945a.equals(oVar)) {
                this.B = oVar;
            } else {
                this.B = ((c) this.f5918c.f()).f5945a;
            }
            boolean z10 = this.D;
            t1.o oVar2 = this.B;
            this.D = z10 & t1.v.a(oVar2.f52757n, oVar2.f52753j);
            this.E = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean h(long j10) {
        if (this.f5931p == 0) {
            return j10 > this.f5936u;
        }
        if (w() >= j10) {
            return false;
        }
        q(this.f5932q + j(j10));
        return true;
    }

    private synchronized void i(long j10, int i10, long j11, int i11, o0.a aVar) {
        try {
            int i12 = this.f5931p;
            if (i12 > 0) {
                int iZ = z(i12 - 1);
                w1.a.a(this.f5926k[iZ] + ((long) this.f5927l[iZ]) <= j11);
            }
            this.f5938w = (536870912 & i10) != 0;
            this.f5937v = Math.max(this.f5937v, j10);
            int iZ2 = z(this.f5931p);
            this.f5929n[iZ2] = j10;
            this.f5926k[iZ2] = j11;
            this.f5927l[iZ2] = i11;
            this.f5928m[iZ2] = i10;
            this.f5930o[iZ2] = aVar;
            this.f5925j[iZ2] = this.C;
            if (this.f5918c.g() || !((c) this.f5918c.f()).f5945a.equals(this.B)) {
                t1.o oVar = (t1.o) w1.a.e(this.B);
                androidx.media3.exoplayer.drm.i iVar = this.f5919d;
                this.f5918c.a(C(), new c(oVar, iVar != null ? iVar.c(this.f5920e, oVar) : androidx.media3.exoplayer.drm.i.b.f5260a));
            }
            int i13 = this.f5931p + 1;
            this.f5931p = i13;
            int i14 = this.f5924i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                o0.a[] aVarArr = new o0.a[i15];
                int i16 = this.f5933r;
                int i17 = i14 - i16;
                System.arraycopy(this.f5926k, i16, jArr2, 0, i17);
                System.arraycopy(this.f5929n, this.f5933r, jArr3, 0, i17);
                System.arraycopy(this.f5928m, this.f5933r, iArr, 0, i17);
                System.arraycopy(this.f5927l, this.f5933r, iArr2, 0, i17);
                System.arraycopy(this.f5930o, this.f5933r, aVarArr, 0, i17);
                System.arraycopy(this.f5925j, this.f5933r, jArr, 0, i17);
                int i18 = this.f5933r;
                System.arraycopy(this.f5926k, 0, jArr2, i17, i18);
                System.arraycopy(this.f5929n, 0, jArr3, i17, i18);
                System.arraycopy(this.f5928m, 0, iArr, i17, i18);
                System.arraycopy(this.f5927l, 0, iArr2, i17, i18);
                System.arraycopy(this.f5930o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f5925j, 0, jArr, i17, i18);
                this.f5926k = jArr2;
                this.f5929n = jArr3;
                this.f5928m = iArr;
                this.f5927l = iArr2;
                this.f5930o = aVarArr;
                this.f5925j = jArr;
                this.f5933r = 0;
                this.f5924i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int j(long j10) {
        int i10 = this.f5931p;
        int iZ = z(i10 - 1);
        while (i10 > this.f5934s && this.f5929n[iZ] >= j10) {
            i10--;
            iZ--;
            if (iZ == -1) {
                iZ = this.f5924i - 1;
            }
        }
        return i10;
    }

    public static f0 k(l2.b bVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar) {
        return new f0(bVar, (androidx.media3.exoplayer.drm.i) w1.a.e(iVar), (androidx.media3.exoplayer.drm.h.a) w1.a.e(aVar));
    }

    private synchronized long l(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f5931p;
                if (i10 != 0) {
                    long[] jArr = this.f5929n;
                    int i11 = this.f5933r;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f5934s;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iS = s(i11, i10, j10, z10);
                        if (iS == -1) {
                            return -1L;
                        }
                        return n(iS);
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

    private synchronized long m() {
        int i10 = this.f5931p;
        if (i10 == 0) {
            return -1L;
        }
        return n(i10);
    }

    private long n(int i10) {
        this.f5936u = Math.max(this.f5936u, x(i10));
        this.f5931p -= i10;
        int i11 = this.f5932q + i10;
        this.f5932q = i11;
        int i12 = this.f5933r + i10;
        this.f5933r = i12;
        int i13 = this.f5924i;
        if (i12 >= i13) {
            this.f5933r = i12 - i13;
        }
        int i14 = this.f5934s - i10;
        this.f5934s = i14;
        if (i14 < 0) {
            this.f5934s = 0;
        }
        this.f5918c.d(i11);
        if (this.f5931p != 0) {
            return this.f5926k[this.f5933r];
        }
        int i15 = this.f5933r;
        if (i15 == 0) {
            i15 = this.f5924i;
        }
        int i16 = i15 - 1;
        return this.f5926k[i16] + ((long) this.f5927l[i16]);
    }

    private long q(int i10) {
        int iC = C() - i10;
        boolean z10 = false;
        w1.a.a(iC >= 0 && iC <= this.f5931p - this.f5934s);
        int i11 = this.f5931p - iC;
        this.f5931p = i11;
        this.f5937v = Math.max(this.f5936u, x(i11));
        if (iC == 0 && this.f5938w) {
            z10 = true;
        }
        this.f5938w = z10;
        this.f5918c.c(i10);
        int i12 = this.f5931p;
        if (i12 == 0) {
            return 0L;
        }
        int iZ = z(i12 - 1);
        return this.f5926k[iZ] + ((long) this.f5927l[iZ]);
    }

    private int r(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f5929n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f5924i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int s(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f5929n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f5928m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f5924i) {
                i10 = 0;
            }
        }
        return i12;
    }

    private long x(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iZ = z(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f5929n[iZ]);
            if ((this.f5928m[iZ] & 1) != 0) {
                return jMax;
            }
            iZ--;
            if (iZ == -1) {
                iZ = this.f5924i - 1;
            }
        }
        return jMax;
    }

    private int z(int i10) {
        int i11 = this.f5933r + i10;
        int i12 = this.f5924i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int A(long j10, boolean z10) throws Throwable {
        Throwable th2;
        try {
            try {
                int iZ = z(this.f5934s);
                if (!D() || j10 < this.f5929n[iZ]) {
                    return 0;
                }
                if (j10 <= this.f5937v || !z10) {
                    int iS = s(iZ, this.f5931p - this.f5934s, j10, true);
                    if (iS == -1) {
                        return 0;
                    }
                    return iS;
                }
                try {
                    return this.f5931p - this.f5934s;
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

    public final synchronized t1.o B() {
        return this.f5940y ? null : this.B;
    }

    public final int C() {
        return this.f5932q + this.f5931p;
    }

    public final synchronized boolean E() {
        return this.f5938w;
    }

    public synchronized boolean F(boolean z10) {
        t1.o oVar;
        boolean z11 = true;
        if (D()) {
            if (((c) this.f5918c.e(y())).f5945a != this.f5922g) {
                return true;
            }
            return G(z(this.f5934s));
        }
        if (!z10 && !this.f5938w && ((oVar = this.B) == null || oVar == this.f5922g)) {
            z11 = false;
        }
        return z11;
    }

    public void H() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.f5923h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) w1.a.e(this.f5923h.getError()));
        }
    }

    public void K() {
        p();
        N();
    }

    public int L(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int iJ = J(f1Var, decoderInputBuffer, (i10 & 2) != 0, z10, this.f5917b);
        if (iJ == -4 && !decoderInputBuffer.e()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f5916a.e(decoderInputBuffer, this.f5917b);
                } else {
                    this.f5916a.l(decoderInputBuffer, this.f5917b);
                }
            }
            if (!z11) {
                this.f5934s++;
            }
        }
        return iJ;
    }

    public void M() {
        P(true);
        N();
    }

    public final void O() {
        P(false);
    }

    public void P(boolean z10) {
        this.f5916a.m();
        this.f5931p = 0;
        this.f5932q = 0;
        this.f5933r = 0;
        this.f5934s = 0;
        this.f5939x = true;
        this.f5935t = Long.MIN_VALUE;
        this.f5936u = Long.MIN_VALUE;
        this.f5937v = Long.MIN_VALUE;
        this.f5938w = false;
        this.f5918c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f5940y = true;
            this.D = true;
        }
    }

    public final synchronized boolean R(int i10) {
        Q();
        int i11 = this.f5932q;
        if (i10 >= i11 && i10 <= this.f5931p + i11) {
            this.f5935t = Long.MIN_VALUE;
            this.f5934s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean S(long j10, boolean z10) throws Throwable {
        f0 f0Var;
        long j11;
        int iS;
        try {
            try {
                Q();
                int iZ = z(this.f5934s);
                if (!D() || j10 < this.f5929n[iZ] || (j10 > this.f5937v && !z10)) {
                    return false;
                }
                if (this.D) {
                    f0Var = this;
                    j11 = j10;
                    iS = f0Var.r(iZ, this.f5931p - this.f5934s, j11, z10);
                } else {
                    f0Var = this;
                    j11 = j10;
                    iS = f0Var.s(iZ, f0Var.f5931p - f0Var.f5934s, j11, true);
                }
                if (iS == -1) {
                    return false;
                }
                f0Var.f5935t = j11;
                f0Var.f5934s += iS;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void T(long j10) {
        this.f5935t = j10;
    }

    public final void V(d dVar) {
        this.f5921f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void W(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f5934s + i10 <= this.f5931p) {
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
        w1.a.a(z10);
        this.f5934s += i10;
    }

    @Override // o2.o0
    public final void b(t1.o oVar) {
        t1.o oVarT = t(oVar);
        this.f5941z = false;
        this.A = oVar;
        boolean zU = U(oVarT);
        d dVar = this.f5921f;
        if (dVar == null || !zU) {
            return;
        }
        dVar.e(oVarT);
    }

    @Override // o2.o0
    public final int d(t1.g gVar, int i10, boolean z10, int i11) {
        return this.f5916a.o(gVar, i10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // o2.o0
    public void e(long j10, int i10, int i11, int i12, o0.a aVar) {
        int i13;
        if (this.f5941z) {
            b((t1.o) w1.a.i(this.A));
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.f5939x) {
            if (!z10) {
                return;
            } else {
                this.f5939x = false;
            }
        }
        long j11 = this.F + j10;
        if (!this.D) {
            i13 = i10;
        } else {
            if (j11 < this.f5935t) {
                return;
            }
            if (i14 == 0) {
                if (!this.E) {
                    w1.n.h("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
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
        i(j11, i13, (this.f5916a.d() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    @Override // o2.o0
    public final void f(w1.u uVar, int i10, int i11) {
        this.f5916a.p(uVar, i10);
    }

    public final void o(long j10, boolean z10, boolean z11) {
        this.f5916a.b(l(j10, z10, z11));
    }

    public final void p() {
        this.f5916a.b(m());
    }

    protected t1.o t(t1.o oVar) {
        return (this.F == 0 || oVar.f52762s == Long.MAX_VALUE) ? oVar : oVar.a().s0(oVar.f52762s + this.F).K();
    }

    public final int u() {
        return this.f5932q;
    }

    public final synchronized long v() {
        return this.f5937v;
    }

    public final synchronized long w() {
        return Math.max(this.f5936u, x(this.f5934s));
    }

    public final int y() {
        return this.f5932q + this.f5934s;
    }
}
