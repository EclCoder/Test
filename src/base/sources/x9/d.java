package x9;

import com.google.android.exoplayer2.ParserException;
import ob.d0;
import ob.r0;
import u9.b0;
import u9.k;
import u9.l;
import u9.m;
import u9.p;
import u9.q;
import u9.r;
import u9.s;
import u9.t;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p f56793o = new p() { // from class: x9.c
        @Override // u9.p
        public final k[] createExtractors() {
            return d.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f56794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f56795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f56796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q.a f56797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m f56798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b0 f56799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ha.a f56801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t f56802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f56803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f56804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f56805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f56806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f56807n;

    public d() {
        this(0);
    }

    public static /* synthetic */ k[] a() {
        return new k[]{new d()};
    }

    private long e(d0 d0Var, boolean z10) {
        boolean zD;
        ob.a.e(this.f56802i);
        int iF = d0Var.f();
        while (iF <= d0Var.g() - 16) {
            d0Var.U(iF);
            if (q.d(d0Var, this.f56802i, this.f56804k, this.f56797d)) {
                d0Var.U(iF);
                return this.f56797d.f54306a;
            }
            iF++;
        }
        if (!z10) {
            d0Var.U(iF);
            return -1L;
        }
        while (iF <= d0Var.g() - this.f56803j) {
            d0Var.U(iF);
            try {
                zD = q.d(d0Var, this.f56802i, this.f56804k, this.f56797d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (d0Var.f() <= d0Var.g() ? zD : false) {
                d0Var.U(iF);
                return this.f56797d.f54306a;
            }
            iF++;
        }
        d0Var.U(d0Var.g());
        return -1L;
    }

    private void f(l lVar) {
        this.f56804k = r.b(lVar);
        ((m) r0.j(this.f56798e)).c(g(lVar.getPosition(), lVar.getLength()));
        this.f56800g = 5;
    }

    private z g(long j10, long j11) {
        ob.a.e(this.f56802i);
        t tVar = this.f56802i;
        if (tVar.f54320k != null) {
            return new s(tVar, j10);
        }
        if (j11 == -1 || tVar.f54319j <= 0) {
            return new z.b(tVar.f());
        }
        b bVar = new b(tVar, this.f56804k, j10, j11);
        this.f56805l = bVar;
        return bVar.b();
    }

    private void h(l lVar) {
        byte[] bArr = this.f56794a;
        lVar.peekFully(bArr, 0, bArr.length);
        lVar.resetPeekPosition();
        this.f56800g = 2;
    }

    private void i() {
        ((b0) r0.j(this.f56799f)).f((this.f56807n * 1000000) / ((long) ((t) r0.j(this.f56802i)).f54314e), 1, this.f56806m, 0, null);
    }

    private int j(l lVar, y yVar) {
        boolean z10;
        ob.a.e(this.f56799f);
        ob.a.e(this.f56802i);
        b bVar = this.f56805l;
        if (bVar != null && bVar.d()) {
            return this.f56805l.c(lVar, yVar);
        }
        if (this.f56807n == -1) {
            this.f56807n = q.i(lVar, this.f56802i);
            return 0;
        }
        int iG = this.f56795b.g();
        if (iG < 32768) {
            int i10 = lVar.read(this.f56795b.e(), iG, 32768 - iG);
            z10 = i10 == -1;
            if (!z10) {
                this.f56795b.T(iG + i10);
            } else if (this.f56795b.a() == 0) {
                i();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iF = this.f56795b.f();
        int i11 = this.f56806m;
        int i12 = this.f56803j;
        if (i11 < i12) {
            d0 d0Var = this.f56795b;
            d0Var.V(Math.min(i12 - i11, d0Var.a()));
        }
        long jE = e(this.f56795b, z10);
        int iF2 = this.f56795b.f() - iF;
        this.f56795b.U(iF);
        this.f56799f.c(this.f56795b, iF2);
        this.f56806m += iF2;
        if (jE != -1) {
            i();
            this.f56806m = 0;
            this.f56807n = jE;
        }
        if (this.f56795b.a() < 16) {
            int iA = this.f56795b.a();
            System.arraycopy(this.f56795b.e(), this.f56795b.f(), this.f56795b.e(), 0, iA);
            this.f56795b.U(0);
            this.f56795b.T(iA);
        }
        return 0;
    }

    private void k(l lVar) {
        this.f56801h = r.d(lVar, !this.f56796c);
        this.f56800g = 1;
    }

    private void l(l lVar) {
        r.a aVar = new r.a(this.f56802i);
        boolean zE = false;
        while (!zE) {
            zE = r.e(lVar, aVar);
            this.f56802i = (t) r0.j(aVar.f54307a);
        }
        ob.a.e(this.f56802i);
        this.f56803j = Math.max(this.f56802i.f54312c, 6);
        ((b0) r0.j(this.f56799f)).e(this.f56802i.g(this.f56794a, this.f56801h));
        this.f56800g = 4;
    }

    private void m(l lVar) throws ParserException {
        r.i(lVar);
        this.f56800g = 3;
    }

    @Override // u9.k
    public void b(m mVar) {
        this.f56798e = mVar;
        this.f56799f = mVar.track(0, 1);
        mVar.endTracks();
    }

    @Override // u9.k
    public int c(l lVar, y yVar) throws ParserException {
        int i10 = this.f56800g;
        if (i10 == 0) {
            k(lVar);
            return 0;
        }
        if (i10 == 1) {
            h(lVar);
            return 0;
        }
        if (i10 == 2) {
            m(lVar);
            return 0;
        }
        if (i10 == 3) {
            l(lVar);
            return 0;
        }
        if (i10 == 4) {
            f(lVar);
            return 0;
        }
        if (i10 == 5) {
            return j(lVar, yVar);
        }
        throw new IllegalStateException();
    }

    @Override // u9.k
    public boolean d(l lVar) throws Throwable {
        r.c(lVar, false);
        return r.a(lVar);
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f56800g = 0;
        } else {
            b bVar = this.f56805l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f56807n = j11 != 0 ? -1L : 0L;
        this.f56806m = 0;
        this.f56795b.Q(0);
    }

    public d(int i10) {
        this.f56794a = new byte[42];
        this.f56795b = new d0(new byte[32768], 0);
        this.f56796c = (i10 & 1) != 0;
        this.f56797d = new q.a();
        this.f56800g = 0;
    }

    @Override // u9.k
    public void release() {
    }
}
