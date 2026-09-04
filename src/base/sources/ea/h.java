package ea;

import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements u9.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u9.p f37372m = new u9.p() { // from class: ea.g
        @Override // u9.p
        public final u9.k[] createExtractors() {
            return h.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f37374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.d0 f37375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ob.d0 f37376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ob.c0 f37377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u9.m f37378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f37379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37384l;

    public h() {
        this(0);
    }

    public static /* synthetic */ u9.k[] a() {
        return new u9.k[]{new h()};
    }

    private void e(u9.l lVar) throws ParserException {
        if (this.f37382j) {
            return;
        }
        this.f37381i = -1;
        lVar.resetPeekPosition();
        long j10 = 0;
        if (lVar.getPosition() == 0) {
            i(lVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (lVar.peekFully(this.f37376d.e(), 0, 2, true)) {
                    this.f37376d.U(0);
                    if (!i.k(this.f37376d.N())) {
                        break;
                    }
                    if (lVar.peekFully(this.f37376d.e(), 0, 4, true)) {
                        this.f37377e.p(14);
                        int iH = this.f37377e.h(13);
                        if (iH <= 6) {
                            this.f37382j = true;
                            throw ParserException.a("Malformed ADTS stream", null);
                        }
                        j10 += (long) iH;
                        i11++;
                        if (i11 != 1000 && lVar.advancePeekPosition(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        lVar.resetPeekPosition();
        if (i10 > 0) {
            this.f37381i = (int) (j10 / ((long) i10));
        } else {
            this.f37381i = -1;
        }
        this.f37382j = true;
    }

    private static int f(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private u9.z g(long j10, boolean z10) {
        return new u9.d(j10, this.f37380h, f(this.f37381i, this.f37374b.i()), this.f37381i, z10);
    }

    private void h(long j10, boolean z10) {
        if (this.f37384l) {
            return;
        }
        boolean z11 = (this.f37373a & 1) != 0 && this.f37381i > 0;
        if (z11 && this.f37374b.i() == C.TIME_UNSET && !z10) {
            return;
        }
        if (!z11 || this.f37374b.i() == C.TIME_UNSET) {
            this.f37378f.c(new u9.z.b(C.TIME_UNSET));
        } else {
            this.f37378f.c(g(j10, (this.f37373a & 2) != 0));
        }
        this.f37384l = true;
    }

    private int i(u9.l lVar) {
        int i10 = 0;
        while (true) {
            lVar.peekFully(this.f37376d.e(), 0, 10);
            this.f37376d.U(0);
            if (this.f37376d.K() != 4801587) {
                break;
            }
            this.f37376d.V(3);
            int iG = this.f37376d.G();
            i10 += iG + 10;
            lVar.advancePeekPosition(iG);
        }
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(i10);
        if (this.f37380h == -1) {
            this.f37380h = i10;
        }
        return i10;
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        this.f37378f = mVar;
        this.f37374b.d(mVar, new i0.d(0, 1));
        mVar.endTracks();
    }

    @Override // u9.k
    public int c(u9.l lVar, u9.y yVar) throws ParserException {
        ob.a.i(this.f37378f);
        long length = lVar.getLength();
        int i10 = this.f37373a;
        if ((i10 & 2) != 0 || ((i10 & 1) != 0 && length != -1)) {
            e(lVar);
        }
        int i11 = lVar.read(this.f37375c.e(), 0, 2048);
        boolean z10 = i11 == -1;
        h(length, z10);
        if (z10) {
            return -1;
        }
        this.f37375c.U(0);
        this.f37375c.T(i11);
        if (!this.f37383k) {
            this.f37374b.c(this.f37379g, 4);
            this.f37383k = true;
        }
        this.f37374b.b(this.f37375c);
        return 0;
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        int i10 = i(lVar);
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            lVar.peekFully(this.f37376d.e(), 0, 2);
            this.f37376d.U(0);
            if (i.k(this.f37376d.N())) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                lVar.peekFully(this.f37376d.e(), 0, 4);
                this.f37377e.p(14);
                int iH = this.f37377e.h(13);
                if (iH <= 6) {
                    i11++;
                    lVar.resetPeekPosition();
                    lVar.advancePeekPosition(i11);
                } else {
                    lVar.advancePeekPosition(iH - 6);
                    i13 += iH;
                }
            } else {
                i11++;
                lVar.resetPeekPosition();
                lVar.advancePeekPosition(i11);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        this.f37383k = false;
        this.f37374b.seek();
        this.f37379g = j11;
    }

    public h(int i10) {
        this.f37373a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f37374b = new i(true);
        this.f37375c = new ob.d0(2048);
        this.f37381i = -1;
        this.f37380h = -1L;
        ob.d0 d0Var = new ob.d0(10);
        this.f37376d = d0Var;
        this.f37377e = new ob.c0(d0Var.e());
    }

    @Override // u9.k
    public void release() {
    }
}
