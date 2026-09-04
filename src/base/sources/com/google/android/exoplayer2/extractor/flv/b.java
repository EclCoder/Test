package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.flv.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import u9.k;
import u9.l;
import u9.m;
import u9.p;
import u9.x;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p f16903q = new p() { // from class: y9.a
        @Override // u9.p
        public final k[] createExtractors() {
            return b.a();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m f16909f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f16912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f16913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f16916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f16918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f16919p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f16904a = new d0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f16905b = new d0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f16906c = new d0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f16907d = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f16908e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16910g = 1;

    public static /* synthetic */ k[] a() {
        return new k[]{new b()};
    }

    private void e() {
        if (this.f16917n) {
            return;
        }
        this.f16909f.c(new z.b(C.TIME_UNSET));
        this.f16917n = true;
    }

    private long f() {
        if (this.f16911h) {
            return this.f16912i + this.f16916m;
        }
        if (this.f16908e.d() == C.TIME_UNSET) {
            return 0L;
        }
        return this.f16916m;
    }

    private d0 g(l lVar) {
        if (this.f16915l > this.f16907d.b()) {
            d0 d0Var = this.f16907d;
            d0Var.S(new byte[Math.max(d0Var.b() * 2, this.f16915l)], 0);
        } else {
            this.f16907d.U(0);
        }
        this.f16907d.T(this.f16915l);
        lVar.readFully(this.f16907d.e(), 0, this.f16915l);
        return this.f16907d;
    }

    private boolean h(l lVar) {
        if (!lVar.readFully(this.f16905b.e(), 0, 9, true)) {
            return false;
        }
        this.f16905b.U(0);
        this.f16905b.V(4);
        int iH = this.f16905b.H();
        boolean z10 = (iH & 4) != 0;
        boolean z11 = (iH & 1) != 0;
        if (z10 && this.f16918o == null) {
            this.f16918o = new a(this.f16909f.track(8, 1));
        }
        if (z11 && this.f16919p == null) {
            this.f16919p = new d(this.f16909f.track(9, 2));
        }
        this.f16909f.endTracks();
        this.f16913j = this.f16905b.q() - 5;
        this.f16910g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    private boolean i(l lVar) {
        boolean zA;
        boolean z10;
        long j10;
        long jF = f();
        int i10 = this.f16914k;
        if (i10 == 8 && this.f16918o != null) {
            e();
            zA = this.f16918o.a(g(lVar), jF);
        } else {
            if (i10 != 9 || this.f16919p == null) {
                if (i10 != 18 || this.f16917n) {
                    lVar.skipFully(this.f16915l);
                    zA = false;
                    z10 = false;
                } else {
                    zA = this.f16908e.a(g(lVar), jF);
                    long jD = this.f16908e.d();
                    if (jD != C.TIME_UNSET) {
                        this.f16909f.c(new x(this.f16908e.e(), this.f16908e.f(), jD));
                        this.f16917n = true;
                    }
                }
                if (!this.f16911h && zA) {
                    this.f16911h = true;
                    if (this.f16908e.d() == C.TIME_UNSET) {
                        j10 = -this.f16916m;
                    } else {
                        j10 = 0;
                    }
                    this.f16912i = j10;
                }
                this.f16913j = 4;
                this.f16910g = 2;
                return z10;
            }
            e();
            zA = this.f16919p.a(g(lVar), jF);
        }
        z10 = true;
        if (!this.f16911h) {
            this.f16911h = true;
            if (this.f16908e.d() == C.TIME_UNSET) {
                j10 = -this.f16916m;
            } else {
                j10 = 0;
            }
            this.f16912i = j10;
        }
        this.f16913j = 4;
        this.f16910g = 2;
        return z10;
    }

    private boolean j(l lVar) {
        if (!lVar.readFully(this.f16906c.e(), 0, 11, true)) {
            return false;
        }
        this.f16906c.U(0);
        this.f16914k = this.f16906c.H();
        this.f16915l = this.f16906c.K();
        this.f16916m = this.f16906c.K();
        this.f16916m = (((long) (this.f16906c.H() << 24)) | this.f16916m) * 1000;
        this.f16906c.V(3);
        this.f16910g = 4;
        return true;
    }

    private void k(l lVar) {
        lVar.skipFully(this.f16913j);
        this.f16913j = 0;
        this.f16910g = 3;
    }

    @Override // u9.k
    public void b(m mVar) {
        this.f16909f = mVar;
    }

    @Override // u9.k
    public int c(l lVar, y yVar) {
        ob.a.i(this.f16909f);
        while (true) {
            int i10 = this.f16910g;
            if (i10 != 1) {
                if (i10 == 2) {
                    k(lVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (i(lVar)) {
                        return 0;
                    }
                } else if (!j(lVar)) {
                    return -1;
                }
            } else if (!h(lVar)) {
                return -1;
            }
        }
    }

    @Override // u9.k
    public boolean d(l lVar) {
        lVar.peekFully(this.f16904a.e(), 0, 3);
        this.f16904a.U(0);
        if (this.f16904a.K() != 4607062) {
            return false;
        }
        lVar.peekFully(this.f16904a.e(), 0, 2);
        this.f16904a.U(0);
        if ((this.f16904a.N() & 250) != 0) {
            return false;
        }
        lVar.peekFully(this.f16904a.e(), 0, 4);
        this.f16904a.U(0);
        int iQ = this.f16904a.q();
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(iQ);
        lVar.peekFully(this.f16904a.e(), 0, 4);
        this.f16904a.U(0);
        return this.f16904a.q() == 0;
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f16910g = 1;
            this.f16911h = false;
        } else {
            this.f16910g = 3;
        }
        this.f16913j = 0;
    }

    @Override // u9.k
    public void release() {
    }
}
