package androidx.media3.extractor.flv;

import androidx.media3.extractor.flv.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.e0;
import o2.i0;
import o2.j0;
import o2.p;
import o2.q;
import o2.r;
import o2.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f6250q = new u() { // from class: u2.a
        @Override // o2.u
        public final p[] createExtractors() {
            return b.a();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f6256f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f6263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f6264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f6265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f6266p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.u f6251a = new w1.u(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f6252b = new w1.u(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f6253c = new w1.u(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.u f6254d = new w1.u();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f6255e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6257g = 1;

    public static /* synthetic */ p[] a() {
        return new p[]{new b()};
    }

    private void g() {
        if (this.f6264n) {
            return;
        }
        this.f6256f.d(new j0.b(C.TIME_UNSET));
        this.f6264n = true;
    }

    private long h() {
        if (this.f6258h) {
            return this.f6259i + this.f6263m;
        }
        if (this.f6255e.d() == C.TIME_UNSET) {
            return 0L;
        }
        return this.f6263m;
    }

    private w1.u i(q qVar) {
        if (this.f6262l > this.f6254d.b()) {
            w1.u uVar = this.f6254d;
            uVar.R(new byte[Math.max(uVar.b() * 2, this.f6262l)], 0);
        } else {
            this.f6254d.T(0);
        }
        this.f6254d.S(this.f6262l);
        qVar.readFully(this.f6254d.e(), 0, this.f6262l);
        return this.f6254d;
    }

    private boolean j(q qVar) {
        if (!qVar.readFully(this.f6252b.e(), 0, 9, true)) {
            return false;
        }
        this.f6252b.T(0);
        this.f6252b.U(4);
        int iG = this.f6252b.G();
        boolean z10 = (iG & 4) != 0;
        boolean z11 = (iG & 1) != 0;
        if (z10 && this.f6265o == null) {
            this.f6265o = new a(this.f6256f.track(8, 1));
        }
        if (z11 && this.f6266p == null) {
            this.f6266p = new d(this.f6256f.track(9, 2));
        }
        this.f6256f.endTracks();
        this.f6260j = this.f6252b.p() - 5;
        this.f6257g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    private boolean k(q qVar) {
        boolean zA;
        boolean z10;
        long j10;
        long jH = h();
        int i10 = this.f6261k;
        if (i10 == 8 && this.f6265o != null) {
            g();
            zA = this.f6265o.a(i(qVar), jH);
        } else {
            if (i10 != 9 || this.f6266p == null) {
                if (i10 != 18 || this.f6264n) {
                    qVar.skipFully(this.f6262l);
                    zA = false;
                    z10 = false;
                } else {
                    zA = this.f6255e.a(i(qVar), jH);
                    long jD = this.f6255e.d();
                    if (jD != C.TIME_UNSET) {
                        this.f6256f.d(new e0(this.f6255e.e(), this.f6255e.f(), jD));
                        this.f6264n = true;
                    }
                }
                if (!this.f6258h && zA) {
                    this.f6258h = true;
                    if (this.f6255e.d() == C.TIME_UNSET) {
                        j10 = -this.f6263m;
                    } else {
                        j10 = 0;
                    }
                    this.f6259i = j10;
                }
                this.f6260j = 4;
                this.f6257g = 2;
                return z10;
            }
            g();
            zA = this.f6266p.a(i(qVar), jH);
        }
        z10 = true;
        if (!this.f6258h) {
            this.f6258h = true;
            if (this.f6255e.d() == C.TIME_UNSET) {
                j10 = -this.f6263m;
            } else {
                j10 = 0;
            }
            this.f6259i = j10;
        }
        this.f6260j = 4;
        this.f6257g = 2;
        return z10;
    }

    private boolean l(q qVar) {
        if (!qVar.readFully(this.f6253c.e(), 0, 11, true)) {
            return false;
        }
        this.f6253c.T(0);
        this.f6261k = this.f6253c.G();
        this.f6262l = this.f6253c.J();
        this.f6263m = this.f6253c.J();
        this.f6263m = (((long) (this.f6253c.G() << 24)) | this.f6263m) * 1000;
        this.f6253c.U(3);
        this.f6257g = 4;
        return true;
    }

    private void m(q qVar) {
        qVar.skipFully(this.f6260j);
        this.f6260j = 0;
        this.f6257g = 3;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) {
        w1.a.i(this.f6256f);
        while (true) {
            int i10 = this.f6257g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m(qVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (k(qVar)) {
                        return 0;
                    }
                } else if (!l(qVar)) {
                    return -1;
                }
            } else if (!j(qVar)) {
                return -1;
            }
        }
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f6256f = rVar;
    }

    @Override // o2.p
    public boolean d(q qVar) {
        qVar.peekFully(this.f6251a.e(), 0, 3);
        this.f6251a.T(0);
        if (this.f6251a.J() != 4607062) {
            return false;
        }
        qVar.peekFully(this.f6251a.e(), 0, 2);
        this.f6251a.T(0);
        if ((this.f6251a.M() & 250) != 0) {
            return false;
        }
        qVar.peekFully(this.f6251a.e(), 0, 4);
        this.f6251a.T(0);
        int iP = this.f6251a.p();
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(iP);
        qVar.peekFully(this.f6251a.e(), 0, 4);
        this.f6251a.T(0);
        return this.f6251a.p() == 0;
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f6257g = 1;
            this.f6258h = false;
        } else {
            this.f6257g = 3;
        }
        this.f6260j = 0;
    }

    @Override // o2.p
    public void release() {
    }
}
