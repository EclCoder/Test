package ea;

import android.util.SparseArray;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import ob.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements u9.k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u9.p f37298l = new u9.p() { // from class: ea.z
        @Override // u9.p
        public final u9.k[] createExtractors() {
            return a0.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f37299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f37300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.d0 f37301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f37302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x f37307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u9.m f37308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37309k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f37310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n0 f37311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ob.c0 f37312c = new ob.c0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f37313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f37314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f37315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f37316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f37317h;

        public a(m mVar, n0 n0Var) {
            this.f37310a = mVar;
            this.f37311b = n0Var;
        }

        private void b() {
            this.f37312c.r(8);
            this.f37313d = this.f37312c.g();
            this.f37314e = this.f37312c.g();
            this.f37312c.r(6);
            this.f37316g = this.f37312c.h(8);
        }

        private void c() {
            this.f37317h = 0L;
            if (this.f37313d) {
                this.f37312c.r(4);
                long jH = ((long) this.f37312c.h(3)) << 30;
                this.f37312c.r(1);
                long jH2 = jH | ((long) (this.f37312c.h(15) << 15));
                this.f37312c.r(1);
                long jH3 = jH2 | ((long) this.f37312c.h(15));
                this.f37312c.r(1);
                if (!this.f37315f && this.f37314e) {
                    this.f37312c.r(4);
                    long jH4 = ((long) this.f37312c.h(3)) << 30;
                    this.f37312c.r(1);
                    long jH5 = jH4 | ((long) (this.f37312c.h(15) << 15));
                    this.f37312c.r(1);
                    long jH6 = jH5 | ((long) this.f37312c.h(15));
                    this.f37312c.r(1);
                    this.f37311b.b(jH6);
                    this.f37315f = true;
                }
                this.f37317h = this.f37311b.b(jH3);
            }
        }

        public void a(ob.d0 d0Var) {
            d0Var.l(this.f37312c.f48353a, 0, 3);
            this.f37312c.p(0);
            b();
            d0Var.l(this.f37312c.f48353a, 0, this.f37316g);
            this.f37312c.p(0);
            c();
            this.f37310a.c(this.f37317h, 4);
            this.f37310a.b(d0Var);
            this.f37310a.packetFinished();
        }

        public void d() {
            this.f37315f = false;
            this.f37310a.seek();
        }
    }

    public a0() {
        this(new n0(0L));
    }

    public static /* synthetic */ u9.k[] a() {
        return new u9.k[]{new a0()};
    }

    private void e(long j10) {
        if (this.f37309k) {
            return;
        }
        this.f37309k = true;
        if (this.f37302d.c() == C.TIME_UNSET) {
            this.f37308j.c(new u9.z.b(this.f37302d.c()));
            return;
        }
        x xVar = new x(this.f37302d.d(), this.f37302d.c(), j10);
        this.f37307i = xVar;
        this.f37308j.c(xVar.b());
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        this.f37308j = mVar;
    }

    @Override // u9.k
    public int c(u9.l lVar, u9.y yVar) {
        m nVar;
        ob.a.i(this.f37308j);
        long length = lVar.getLength();
        if (length != -1 && !this.f37302d.e()) {
            return this.f37302d.g(lVar, yVar);
        }
        e(length);
        x xVar = this.f37307i;
        if (xVar != null && xVar.d()) {
            return this.f37307i.c(lVar, yVar);
        }
        lVar.resetPeekPosition();
        long peekPosition = length != -1 ? length - lVar.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !lVar.peekFully(this.f37301c.e(), 0, 4, true)) {
            return -1;
        }
        this.f37301c.U(0);
        int iQ = this.f37301c.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            lVar.peekFully(this.f37301c.e(), 0, 10);
            this.f37301c.U(9);
            lVar.skipFully((this.f37301c.H() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            lVar.peekFully(this.f37301c.e(), 0, 2);
            this.f37301c.U(0);
            lVar.skipFully(this.f37301c.N() + 6);
            return 0;
        }
        if (((iQ & (-256)) >> 8) != 1) {
            lVar.skipFully(1);
            return 0;
        }
        int i10 = iQ & 255;
        a aVar = (a) this.f37300b.get(i10);
        if (!this.f37303e) {
            if (aVar == null) {
                if (i10 == 189) {
                    nVar = new c();
                    this.f37304f = true;
                    this.f37306h = lVar.getPosition();
                } else if ((iQ & 224) == 192) {
                    nVar = new t();
                    this.f37304f = true;
                    this.f37306h = lVar.getPosition();
                } else if ((iQ & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    nVar = new n();
                    this.f37305g = true;
                    this.f37306h = lVar.getPosition();
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.d(this.f37308j, new i0.d(i10, 256));
                    aVar = new a(nVar, this.f37299a);
                    this.f37300b.put(i10, aVar);
                }
            }
            if (lVar.getPosition() > ((this.f37304f && this.f37305g) ? this.f37306h + 8192 : 1048576L)) {
                this.f37303e = true;
                this.f37308j.endTracks();
            }
        }
        lVar.peekFully(this.f37301c.e(), 0, 2);
        this.f37301c.U(0);
        int iN = this.f37301c.N() + 6;
        if (aVar == null) {
            lVar.skipFully(iN);
        } else {
            this.f37301c.Q(iN);
            lVar.readFully(this.f37301c.e(), 0, iN);
            this.f37301c.U(6);
            aVar.a(this.f37301c);
            ob.d0 d0Var = this.f37301c;
            d0Var.T(d0Var.b());
        }
        return 0;
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        byte[] bArr = new byte[14];
        lVar.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.advancePeekPosition(bArr[13] & 7);
        lVar.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        boolean z10 = this.f37299a.e() == C.TIME_UNSET;
        if (!z10) {
            long jC = this.f37299a.c();
            z10 = (jC == C.TIME_UNSET || jC == 0 || jC == j11) ? false : true;
        }
        if (z10) {
            this.f37299a.h(j11);
        }
        x xVar = this.f37307i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f37300b.size(); i10++) {
            ((a) this.f37300b.valueAt(i10)).d();
        }
    }

    public a0(n0 n0Var) {
        this.f37299a = n0Var;
        this.f37301c = new ob.d0(4096);
        this.f37300b = new SparseArray();
        this.f37302d = new y();
    }

    @Override // u9.k
    public void release() {
    }
}
