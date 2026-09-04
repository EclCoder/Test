package u3;

import android.util.SparseArray;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements o2.p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o2.u f53760l = new o2.u() { // from class: u3.b0
        @Override // o2.u
        public final o2.p[] createExtractors() {
            return c0.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.z f53761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f53762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f53763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f53764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f53768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z f53769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o2.r f53770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f53771k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f53772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w1.z f53773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w1.t f53774c = new w1.t(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f53775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f53776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f53777f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f53778g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f53779h;

        public a(m mVar, w1.z zVar) {
            this.f53772a = mVar;
            this.f53773b = zVar;
        }

        private void b() {
            this.f53774c.r(8);
            this.f53775d = this.f53774c.g();
            this.f53776e = this.f53774c.g();
            this.f53774c.r(6);
            this.f53778g = this.f53774c.h(8);
        }

        private void c() {
            this.f53779h = 0L;
            if (this.f53775d) {
                this.f53774c.r(4);
                long jH = ((long) this.f53774c.h(3)) << 30;
                this.f53774c.r(1);
                long jH2 = jH | ((long) (this.f53774c.h(15) << 15));
                this.f53774c.r(1);
                long jH3 = jH2 | ((long) this.f53774c.h(15));
                this.f53774c.r(1);
                if (!this.f53777f && this.f53776e) {
                    this.f53774c.r(4);
                    long jH4 = ((long) this.f53774c.h(3)) << 30;
                    this.f53774c.r(1);
                    long jH5 = jH4 | ((long) (this.f53774c.h(15) << 15));
                    this.f53774c.r(1);
                    long jH6 = jH5 | ((long) this.f53774c.h(15));
                    this.f53774c.r(1);
                    this.f53773b.b(jH6);
                    this.f53777f = true;
                }
                this.f53779h = this.f53773b.b(jH3);
            }
        }

        public void a(w1.u uVar) {
            uVar.l(this.f53774c.f55837a, 0, 3);
            this.f53774c.p(0);
            b();
            uVar.l(this.f53774c.f55837a, 0, this.f53778g);
            this.f53774c.p(0);
            c();
            this.f53772a.c(this.f53779h, 4);
            this.f53772a.b(uVar);
            this.f53772a.e(false);
        }

        public void d() {
            this.f53777f = false;
            this.f53772a.seek();
        }
    }

    public c0() {
        this(new w1.z(0L));
    }

    public static /* synthetic */ o2.p[] a() {
        return new o2.p[]{new c0()};
    }

    private void g(long j10) {
        if (this.f53771k) {
            return;
        }
        this.f53771k = true;
        if (this.f53764d.c() == C.TIME_UNSET) {
            this.f53770j.d(new o2.j0.b(this.f53764d.c()));
            return;
        }
        z zVar = new z(this.f53764d.d(), this.f53764d.c(), j10);
        this.f53769i = zVar;
        this.f53770j.d(zVar.b());
    }

    @Override // o2.p
    public int b(o2.q qVar, o2.i0 i0Var) {
        m nVar;
        w1.a.i(this.f53770j);
        long length = qVar.getLength();
        if (length != -1 && !this.f53764d.e()) {
            return this.f53764d.g(qVar, i0Var);
        }
        g(length);
        z zVar = this.f53769i;
        if (zVar != null && zVar.d()) {
            return this.f53769i.c(qVar, i0Var);
        }
        qVar.resetPeekPosition();
        long peekPosition = length != -1 ? length - qVar.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !qVar.peekFully(this.f53763c.e(), 0, 4, true)) {
            return -1;
        }
        this.f53763c.T(0);
        int iP = this.f53763c.p();
        if (iP == 441) {
            return -1;
        }
        if (iP == 442) {
            qVar.peekFully(this.f53763c.e(), 0, 10);
            this.f53763c.T(9);
            qVar.skipFully((this.f53763c.G() & 7) + 14);
            return 0;
        }
        if (iP == 443) {
            qVar.peekFully(this.f53763c.e(), 0, 2);
            this.f53763c.T(0);
            qVar.skipFully(this.f53763c.M() + 6);
            return 0;
        }
        if (((iP & (-256)) >> 8) != 1) {
            qVar.skipFully(1);
            return 0;
        }
        int i10 = iP & 255;
        a aVar = (a) this.f53762b.get(i10);
        if (!this.f53765e) {
            if (aVar == null) {
                if (i10 == 189) {
                    nVar = new c();
                    this.f53766f = true;
                    this.f53768h = qVar.getPosition();
                } else if ((iP & 224) == 192) {
                    nVar = new t();
                    this.f53766f = true;
                    this.f53768h = qVar.getPosition();
                } else if ((iP & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    nVar = new n();
                    this.f53767g = true;
                    this.f53768h = qVar.getPosition();
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.d(this.f53770j, new k0.d(i10, 256));
                    aVar = new a(nVar, this.f53761a);
                    this.f53762b.put(i10, aVar);
                }
            }
            if (qVar.getPosition() > ((this.f53766f && this.f53767g) ? this.f53768h + 8192 : 1048576L)) {
                this.f53765e = true;
                this.f53770j.endTracks();
            }
        }
        qVar.peekFully(this.f53763c.e(), 0, 2);
        this.f53763c.T(0);
        int iM = this.f53763c.M() + 6;
        if (aVar == null) {
            qVar.skipFully(iM);
        } else {
            this.f53763c.P(iM);
            qVar.readFully(this.f53763c.e(), 0, iM);
            this.f53763c.T(6);
            aVar.a(this.f53763c);
            w1.u uVar = this.f53763c;
            uVar.S(uVar.b());
        }
        return 0;
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        this.f53770j = rVar;
    }

    @Override // o2.p
    public boolean d(o2.q qVar) {
        byte[] bArr = new byte[14];
        qVar.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.advancePeekPosition(bArr[13] & 7);
        qVar.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        boolean z10 = this.f53761a.f() == C.TIME_UNSET;
        if (!z10) {
            long jD = this.f53761a.d();
            z10 = (jD == C.TIME_UNSET || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f53761a.i(j11);
        }
        z zVar = this.f53769i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f53762b.size(); i10++) {
            ((a) this.f53762b.valueAt(i10)).d();
        }
    }

    public c0(w1.z zVar) {
        this.f53761a = zVar;
        this.f53763c = new w1.u(4096);
        this.f53762b = new SparseArray();
        this.f53764d = new a0();
    }

    @Override // o2.p
    public void release() {
    }
}
