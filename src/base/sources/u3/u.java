package u3;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f54093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f54094f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54097i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f54100l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f54102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f54103o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f54107s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f54109u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54092d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.u f54089a = new w1.u(new byte[15], 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.t f54090b = new w1.t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f54091c = new w1.u();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private v.b f54104p = new v.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f54105q = -2147483647;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f54106r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f54108t = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f54098j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f54101m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f54095g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f54096h = -9.223372036854776E18d;

    private void a(w1.u uVar, w1.u uVar2, boolean z10) {
        int iF = uVar.f();
        int iMin = Math.min(uVar.a(), uVar2.a());
        uVar.l(uVar2.e(), uVar2.f(), iMin);
        uVar2.U(iMin);
        if (z10) {
            uVar.T(iF);
        }
    }

    private void f() {
        int i10;
        if (this.f54109u) {
            this.f54098j = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = (((double) (this.f54106r - this.f54107s)) * 1000000.0d) / ((double) this.f54105q);
        long jRound = Math.round(this.f54095g);
        if (this.f54097i) {
            this.f54097i = false;
            this.f54095g = this.f54096h;
        } else {
            this.f54095g += d10;
        }
        this.f54094f.e(jRound, i10, this.f54103o, 0, null);
        this.f54109u = false;
        this.f54107s = 0;
        this.f54103o = 0;
    }

    private void g(w1.t tVar) throws ParserException {
        v.c cVarH = v.h(tVar);
        this.f54105q = cVarH.f54114b;
        this.f54106r = cVarH.f54115c;
        long j10 = this.f54108t;
        long j11 = this.f54104p.f54111b;
        if (j10 != j11) {
            this.f54108t = j11;
            String str = "mhm1";
            if (cVarH.f54113a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f54113a));
            }
            byte[] bArr = cVarH.f54116d;
            this.f54094f.b(new t1.o.b().a0(this.f54093e).o0("audio/mhm1").p0(this.f54105q).O(str).b0((bArr == null || bArr.length <= 0) ? null : com.google.common.collect.c0.E(w1.c0.f55774f, bArr)).K());
        }
        this.f54109u = true;
    }

    private boolean h() throws ParserException {
        int iG = this.f54089a.g();
        this.f54090b.o(this.f54089a.e(), iG);
        boolean zG = v.g(this.f54090b, this.f54104p);
        if (zG) {
            this.f54102n = 0;
            this.f54103o += this.f54104p.f54112c + iG;
        }
        return zG;
    }

    private boolean i(int i10) {
        return i10 == 1 || i10 == 17;
    }

    private boolean j(w1.u uVar) {
        int i10 = this.f54099k;
        if ((i10 & 2) == 0) {
            uVar.T(uVar.g());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (uVar.a() > 0) {
            int i11 = this.f54100l << 8;
            this.f54100l = i11;
            int iG = i11 | uVar.G();
            this.f54100l = iG;
            if (v.e(iG)) {
                uVar.T(uVar.f() - 3);
                this.f54100l = 0;
                return true;
            }
        }
        return false;
    }

    private void k(w1.u uVar) {
        int iMin = Math.min(uVar.a(), this.f54104p.f54112c - this.f54102n);
        this.f54094f.c(uVar, iMin);
        this.f54102n += iMin;
    }

    @Override // u3.m
    public void b(w1.u uVar) throws ParserException {
        w1.a.i(this.f54094f);
        while (uVar.a() > 0) {
            int i10 = this.f54092d;
            if (i10 != 0) {
                if (i10 == 1) {
                    a(uVar, this.f54089a, false);
                    if (this.f54089a.a() != 0) {
                        this.f54101m = false;
                    } else if (h()) {
                        this.f54089a.T(0);
                        o0 o0Var = this.f54094f;
                        w1.u uVar2 = this.f54089a;
                        o0Var.c(uVar2, uVar2.g());
                        this.f54089a.P(2);
                        this.f54091c.P(this.f54104p.f54112c);
                        this.f54101m = true;
                        this.f54092d = 2;
                    } else if (this.f54089a.g() < 15) {
                        w1.u uVar3 = this.f54089a;
                        uVar3.S(uVar3.g() + 1);
                        this.f54101m = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (i(this.f54104p.f54110a)) {
                        a(uVar, this.f54091c, true);
                    }
                    k(uVar);
                    int i11 = this.f54102n;
                    v.b bVar = this.f54104p;
                    if (i11 == bVar.f54112c) {
                        int i12 = bVar.f54110a;
                        if (i12 == 1) {
                            g(new w1.t(this.f54091c.e()));
                        } else if (i12 == 17) {
                            this.f54107s = v.f(new w1.t(this.f54091c.e()));
                        } else if (i12 == 2) {
                            f();
                        }
                        this.f54092d = 1;
                    }
                }
            } else if (j(uVar)) {
                this.f54092d = 1;
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f54099k = i10;
        if (!this.f54098j && (this.f54103o != 0 || !this.f54101m)) {
            this.f54097i = true;
        }
        if (j10 != C.TIME_UNSET) {
            if (this.f54097i) {
                this.f54096h = j10;
            } else {
                this.f54095g = j10;
            }
        }
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f54093e = dVar.b();
        this.f54094f = rVar.track(dVar.c(), 1);
    }

    @Override // u3.m
    public void seek() {
        this.f54092d = 0;
        this.f54100l = 0;
        this.f54089a.P(2);
        this.f54102n = 0;
        this.f54103o = 0;
        this.f54105q = -2147483647;
        this.f54106r = -1;
        this.f54107s = 0;
        this.f54108t = -1L;
        this.f54109u = false;
        this.f54097i = false;
        this.f54101m = true;
        this.f54098j = true;
        this.f54095g = -9.223372036854776E18d;
        this.f54096h = -9.223372036854776E18d;
    }

    @Override // u3.m
    public void e(boolean z10) {
    }
}
