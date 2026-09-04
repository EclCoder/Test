package u3;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h implements o2.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o2.u f53810m = new o2.u() { // from class: u3.g
        @Override // o2.u
        public final o2.p[] createExtractors() {
            return h.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f53812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f53813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.u f53814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w1.t f53815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o2.r f53816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f53818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f53821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53822l;

    public h() {
        this(0);
    }

    public static /* synthetic */ o2.p[] a() {
        return new o2.p[]{new h()};
    }

    private void g(o2.q qVar) throws ParserException {
        if (this.f53820j) {
            return;
        }
        this.f53819i = -1;
        qVar.resetPeekPosition();
        long j10 = 0;
        if (qVar.getPosition() == 0) {
            k(qVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (qVar.peekFully(this.f53814d.e(), 0, 2, true)) {
                    this.f53814d.T(0);
                    if (!i.l(this.f53814d.M())) {
                        break;
                    }
                    if (qVar.peekFully(this.f53814d.e(), 0, 4, true)) {
                        this.f53815e.p(14);
                        int iH = this.f53815e.h(13);
                        if (iH <= 6) {
                            this.f53820j = true;
                            throw ParserException.a("Malformed ADTS stream", null);
                        }
                        j10 += (long) iH;
                        i11++;
                        if (i11 != 1000 && qVar.advancePeekPosition(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        qVar.resetPeekPosition();
        if (i10 > 0) {
            this.f53819i = (int) (j10 / ((long) i10));
        } else {
            this.f53819i = -1;
        }
        this.f53820j = true;
    }

    private static int h(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private o2.j0 i(long j10, boolean z10) {
        return new o2.h(j10, this.f53818h, h(this.f53819i, this.f53812b.j()), this.f53819i, z10);
    }

    private void j(long j10, boolean z10) {
        if (this.f53822l) {
            return;
        }
        boolean z11 = (this.f53811a & 1) != 0 && this.f53819i > 0;
        if (z11 && this.f53812b.j() == C.TIME_UNSET && !z10) {
            return;
        }
        if (!z11 || this.f53812b.j() == C.TIME_UNSET) {
            this.f53816f.d(new o2.j0.b(C.TIME_UNSET));
        } else {
            this.f53816f.d(i(j10, (this.f53811a & 2) != 0));
        }
        this.f53822l = true;
    }

    private int k(o2.q qVar) {
        int i10 = 0;
        while (true) {
            qVar.peekFully(this.f53814d.e(), 0, 10);
            this.f53814d.T(0);
            if (this.f53814d.J() != 4801587) {
                break;
            }
            this.f53814d.U(3);
            int iF = this.f53814d.F();
            i10 += iF + 10;
            qVar.advancePeekPosition(iF);
        }
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(i10);
        if (this.f53818h == -1) {
            this.f53818h = i10;
        }
        return i10;
    }

    @Override // o2.p
    public int b(o2.q qVar, o2.i0 i0Var) throws ParserException {
        w1.a.i(this.f53816f);
        long length = qVar.getLength();
        int i10 = this.f53811a;
        if ((i10 & 2) != 0 || ((i10 & 1) != 0 && length != -1)) {
            g(qVar);
        }
        int i11 = qVar.read(this.f53813c.e(), 0, 2048);
        boolean z10 = i11 == -1;
        j(length, z10);
        if (z10) {
            return -1;
        }
        this.f53813c.T(0);
        this.f53813c.S(i11);
        if (!this.f53821k) {
            this.f53812b.c(this.f53817g, 4);
            this.f53821k = true;
        }
        this.f53812b.b(this.f53813c);
        return 0;
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        this.f53816f = rVar;
        this.f53812b.d(rVar, new k0.d(0, 1));
        rVar.endTracks();
    }

    @Override // o2.p
    public boolean d(o2.q qVar) {
        int iK = k(qVar);
        int i10 = iK;
        int i11 = 0;
        int i12 = 0;
        do {
            qVar.peekFully(this.f53814d.e(), 0, 2);
            this.f53814d.T(0);
            if (i.l(this.f53814d.M())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                qVar.peekFully(this.f53814d.e(), 0, 4);
                this.f53815e.p(14);
                int iH = this.f53815e.h(13);
                if (iH <= 6) {
                    i10++;
                    qVar.resetPeekPosition();
                    qVar.advancePeekPosition(i10);
                } else {
                    qVar.advancePeekPosition(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                qVar.resetPeekPosition();
                qVar.advancePeekPosition(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iK < 8192);
        return false;
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        this.f53821k = false;
        this.f53812b.seek();
        this.f53817g = j11;
    }

    public h(int i10) {
        this.f53811a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f53812b = new i(true);
        this.f53813c = new w1.u(2048);
        this.f53819i = -1;
        this.f53818h = -1L;
        w1.u uVar = new w1.u(10);
        this.f53814d = uVar;
        this.f53815e = new w1.t(uVar.e());
    }

    @Override // o2.p
    public void release() {
    }
}
