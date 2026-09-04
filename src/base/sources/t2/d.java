package t2;

import androidx.media3.common.ParserException;
import o2.i0;
import o2.j0;
import o2.o0;
import o2.p;
import o2.q;
import o2.r;
import o2.u;
import o2.v;
import o2.w;
import o2.x;
import o2.y;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f53060o = new u() { // from class: t2.c
        @Override // o2.u
        public final p[] createExtractors() {
            return d.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f53061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f53062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v.a f53064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f53065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f53066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t1.u f53068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f53069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f53072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f53074n;

    public d() {
        this(0);
    }

    public static /* synthetic */ p[] a() {
        return new p[]{new d()};
    }

    private long g(w1.u uVar, boolean z10) {
        boolean zD;
        w1.a.e(this.f53069i);
        int iF = uVar.f();
        while (iF <= uVar.g() - 16) {
            uVar.T(iF);
            if (v.d(uVar, this.f53069i, this.f53071k, this.f53064d)) {
                uVar.T(iF);
                return this.f53064d.f48167a;
            }
            iF++;
        }
        if (!z10) {
            uVar.T(iF);
            return -1L;
        }
        while (iF <= uVar.g() - this.f53070j) {
            uVar.T(iF);
            try {
                zD = v.d(uVar, this.f53069i, this.f53071k, this.f53064d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (uVar.f() <= uVar.g() ? zD : false) {
                uVar.T(iF);
                return this.f53064d.f48167a;
            }
            iF++;
        }
        uVar.T(uVar.g());
        return -1L;
    }

    private void h(q qVar) {
        this.f53071k = w.b(qVar);
        ((r) c0.h(this.f53065e)).d(i(qVar.getPosition(), qVar.getLength()));
        this.f53067g = 5;
    }

    private j0 i(long j10, long j11) {
        w1.a.e(this.f53069i);
        y yVar = this.f53069i;
        if (yVar.f48181k != null) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f48180j <= 0) {
            return new j0.b(yVar.f());
        }
        b bVar = new b(yVar, this.f53071k, j10, j11);
        this.f53072l = bVar;
        return bVar.b();
    }

    private void j(q qVar) {
        byte[] bArr = this.f53061a;
        qVar.peekFully(bArr, 0, bArr.length);
        qVar.resetPeekPosition();
        this.f53067g = 2;
    }

    private void k() {
        ((o0) c0.h(this.f53066f)).e((this.f53074n * 1000000) / ((long) ((y) c0.h(this.f53069i)).f48175e), 1, this.f53073m, 0, null);
    }

    private int l(q qVar, i0 i0Var) {
        boolean z10;
        w1.a.e(this.f53066f);
        w1.a.e(this.f53069i);
        b bVar = this.f53072l;
        if (bVar != null && bVar.d()) {
            return this.f53072l.c(qVar, i0Var);
        }
        if (this.f53074n == -1) {
            this.f53074n = v.i(qVar, this.f53069i);
            return 0;
        }
        int iG = this.f53062b.g();
        if (iG < 32768) {
            int i10 = qVar.read(this.f53062b.e(), iG, 32768 - iG);
            z10 = i10 == -1;
            if (!z10) {
                this.f53062b.S(iG + i10);
            } else if (this.f53062b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iF = this.f53062b.f();
        int i11 = this.f53073m;
        int i12 = this.f53070j;
        if (i11 < i12) {
            w1.u uVar = this.f53062b;
            uVar.U(Math.min(i12 - i11, uVar.a()));
        }
        long jG = g(this.f53062b, z10);
        int iF2 = this.f53062b.f() - iF;
        this.f53062b.T(iF);
        this.f53066f.c(this.f53062b, iF2);
        this.f53073m += iF2;
        if (jG != -1) {
            k();
            this.f53073m = 0;
            this.f53074n = jG;
        }
        if (this.f53062b.a() < 16) {
            int iA = this.f53062b.a();
            System.arraycopy(this.f53062b.e(), this.f53062b.f(), this.f53062b.e(), 0, iA);
            this.f53062b.T(0);
            this.f53062b.S(iA);
        }
        return 0;
    }

    private void m(q qVar) {
        this.f53068h = w.d(qVar, !this.f53063c);
        this.f53067g = 1;
    }

    private void n(q qVar) {
        w.a aVar = new w.a(this.f53069i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(qVar, aVar);
            this.f53069i = (y) c0.h(aVar.f48168a);
        }
        w1.a.e(this.f53069i);
        this.f53070j = Math.max(this.f53069i.f48173c, 6);
        ((o0) c0.h(this.f53066f)).b(this.f53069i.g(this.f53061a, this.f53068h));
        this.f53067g = 4;
    }

    private void o(q qVar) throws ParserException {
        w.i(qVar);
        this.f53067g = 3;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) throws ParserException {
        int i10 = this.f53067g;
        if (i10 == 0) {
            m(qVar);
            return 0;
        }
        if (i10 == 1) {
            j(qVar);
            return 0;
        }
        if (i10 == 2) {
            o(qVar);
            return 0;
        }
        if (i10 == 3) {
            n(qVar);
            return 0;
        }
        if (i10 == 4) {
            h(qVar);
            return 0;
        }
        if (i10 == 5) {
            return l(qVar, i0Var);
        }
        throw new IllegalStateException();
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f53065e = rVar;
        this.f53066f = rVar.track(0, 1);
        rVar.endTracks();
    }

    @Override // o2.p
    public boolean d(q qVar) throws Throwable {
        w.c(qVar, false);
        return w.a(qVar);
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f53067g = 0;
        } else {
            b bVar = this.f53072l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f53074n = j11 != 0 ? -1L : 0L;
        this.f53073m = 0;
        this.f53062b.P(0);
    }

    public d(int i10) {
        this.f53061a = new byte[42];
        this.f53062b = new w1.u(new byte[32768], 0);
        this.f53063c = (i10 & 1) != 0;
        this.f53064d = new v.a();
        this.f53067g = 0;
    }

    @Override // o2.p
    public void release() {
    }
}
