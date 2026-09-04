package za;

import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import ob.r0;
import ob.u;
import ob.z;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b0 f58728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58729e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f58732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f58733i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f58726b = new d0(z.f48467a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f58725a = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58730f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58731g = -1;

    public f(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58727c = hVar;
    }

    private static int d(int i10) {
        return i10 == 5 ? 1 : 0;
    }

    private void e(d0 d0Var, int i10) {
        byte b10 = d0Var.e()[0];
        byte b11 = d0Var.e()[1];
        int i11 = (b10 & 224) | (b11 & 31);
        boolean z10 = (b11 & 128) > 0;
        boolean z11 = (b11 & 64) > 0;
        if (z10) {
            this.f58732h += h();
            d0Var.e()[1] = (byte) i11;
            this.f58725a.R(d0Var.e());
            this.f58725a.U(1);
        } else {
            int iB = ya.a.b(this.f58731g);
            if (i10 != iB) {
                u.i("RtpH264Reader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
                return;
            } else {
                this.f58725a.R(d0Var.e());
                this.f58725a.U(2);
            }
        }
        int iA = this.f58725a.a();
        this.f58728d.c(this.f58725a, iA);
        this.f58732h += iA;
        if (z11) {
            this.f58729e = d(i11 & 31);
        }
    }

    private void f(d0 d0Var) {
        int iA = d0Var.a();
        this.f58732h += h();
        this.f58728d.c(d0Var, iA);
        this.f58732h += iA;
        this.f58729e = d(d0Var.e()[0] & 31);
    }

    private void g(d0 d0Var) {
        d0Var.H();
        while (d0Var.a() > 4) {
            int iN = d0Var.N();
            this.f58732h += h();
            this.f58728d.c(d0Var, iN);
            this.f58732h += iN;
        }
        this.f58729e = 0;
    }

    private int h() {
        this.f58726b.U(0);
        int iA = this.f58726b.a();
        ((b0) ob.a.e(this.f58728d)).c(this.f58726b, iA);
        return iA;
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 2);
        this.f58728d = b0VarTrack;
        ((b0) r0.j(b0VarTrack)).e(this.f58727c.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) throws ParserException {
        try {
            int i11 = d0Var.e()[0] & 31;
            ob.a.i(this.f58728d);
            if (i11 > 0 && i11 < 24) {
                f(d0Var);
            } else if (i11 == 24) {
                g(d0Var);
            } else {
                if (i11 != 28) {
                    throw ParserException.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i11)), null);
                }
                e(d0Var, i10);
            }
            if (z10) {
                if (this.f58730f == C.TIME_UNSET) {
                    this.f58730f = j10;
                }
                this.f58728d.f(m.a(this.f58733i, j10, this.f58730f, 90000), this.f58729e, this.f58732h, 0, null);
                this.f58732h = 0;
            }
            this.f58731g = i10;
        } catch (IndexOutOfBoundsException e10) {
            throw ParserException.c(null, e10);
        }
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58730f = j10;
        this.f58732h = 0;
        this.f58733i = j11;
    }

    @Override // za.k
    public void c(long j10, int i10) {
    }
}
