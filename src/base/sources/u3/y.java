package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class y implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f54125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.t f54126b = new w1.t(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54127c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w1.z f54129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f54130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f54131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f54135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54136l;

    public y(m mVar) {
        this.f54125a = mVar;
    }

    private boolean d(w1.u uVar, byte[] bArr, int i10) {
        int iMin = Math.min(uVar.a(), i10 - this.f54128d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            uVar.U(iMin);
        } else {
            uVar.l(bArr, this.f54128d, iMin);
        }
        int i11 = this.f54128d + iMin;
        this.f54128d = i11;
        return i11 == i10;
    }

    private boolean e() {
        this.f54126b.p(0);
        int iH = this.f54126b.h(24);
        if (iH != 1) {
            w1.n.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f54134j = -1;
            return false;
        }
        this.f54126b.r(8);
        int iH2 = this.f54126b.h(16);
        this.f54126b.r(5);
        this.f54135k = this.f54126b.g();
        this.f54126b.r(2);
        this.f54130f = this.f54126b.g();
        this.f54131g = this.f54126b.g();
        this.f54126b.r(6);
        int iH3 = this.f54126b.h(8);
        this.f54133i = iH3;
        if (iH2 == 0) {
            this.f54134j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f54134j = i10;
            if (i10 < 0) {
                w1.n.h("PesReader", "Found negative packet payload size: " + this.f54134j);
                this.f54134j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.f54126b.p(0);
        this.f54136l = C.TIME_UNSET;
        if (this.f54130f) {
            this.f54126b.r(4);
            long jH = ((long) this.f54126b.h(3)) << 30;
            this.f54126b.r(1);
            long jH2 = jH | ((long) (this.f54126b.h(15) << 15));
            this.f54126b.r(1);
            long jH3 = jH2 | ((long) this.f54126b.h(15));
            this.f54126b.r(1);
            if (!this.f54132h && this.f54131g) {
                this.f54126b.r(4);
                long jH4 = ((long) this.f54126b.h(3)) << 30;
                this.f54126b.r(1);
                long jH5 = jH4 | ((long) (this.f54126b.h(15) << 15));
                this.f54126b.r(1);
                long jH6 = jH5 | ((long) this.f54126b.h(15));
                this.f54126b.r(1);
                this.f54129e.b(jH6);
                this.f54132h = true;
            }
            this.f54136l = this.f54129e.b(jH3);
        }
    }

    private void g(int i10) {
        this.f54127c = i10;
        this.f54128d = 0;
    }

    @Override // u3.k0
    public void a(w1.z zVar, o2.r rVar, k0.d dVar) {
        this.f54129e = zVar;
        this.f54125a.d(rVar, dVar);
    }

    @Override // u3.k0
    public void b(w1.u uVar, int i10) {
        w1.a.i(this.f54129e);
        if ((i10 & 1) != 0) {
            int i11 = this.f54127c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    w1.n.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f54134j != -1) {
                        w1.n.h("PesReader", "Unexpected start indicator: expected " + this.f54134j + " more bytes");
                    }
                    this.f54125a.e(uVar.g() == 0);
                }
            }
            g(1);
        }
        while (uVar.a() > 0) {
            int i12 = this.f54127c;
            if (i12 == 0) {
                uVar.U(uVar.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (d(uVar, this.f54126b.f55837a, Math.min(10, this.f54133i)) && d(uVar, null, this.f54133i)) {
                        f();
                        i10 |= this.f54135k ? 4 : 0;
                        this.f54125a.c(this.f54136l, i10);
                        g(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = uVar.a();
                    int i13 = this.f54134j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        uVar.S(uVar.f() + iA);
                    }
                    this.f54125a.b(uVar);
                    int i15 = this.f54134j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f54134j = i16;
                        if (i16 == 0) {
                            this.f54125a.e(false);
                            g(1);
                        }
                    }
                }
            } else if (d(uVar, this.f54126b.f55837a, 9)) {
                g(e() ? 2 : 0);
            }
        }
    }

    public boolean c(boolean z10) {
        if (this.f54127c == 3 && this.f54134j == -1) {
            return (z10 && (this.f54125a instanceof n)) ? false : true;
        }
        return false;
    }

    @Override // u3.k0
    public void seek() {
        this.f54127c = 0;
        this.f54128d = 0;
        this.f54132h = false;
        this.f54125a.seek();
    }
}
