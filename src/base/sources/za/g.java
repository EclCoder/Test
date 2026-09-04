package za;

import com.google.android.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import ob.d0;
import ob.r0;
import ob.u;
import ob.z;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b0 f58737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58738e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f58741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f58742i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f58734a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f58735b = new d0(z.f48467a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58739f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58740g = -1;

    public g(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58736c = hVar;
    }

    private static int d(int i10) {
        return (i10 == 19 || i10 == 20) ? 1 : 0;
    }

    private void e(d0 d0Var, int i10) throws ParserException {
        if (d0Var.e().length < 3) {
            throw ParserException.c("Malformed FU header.", null);
        }
        int i11 = d0Var.e()[1] & 7;
        byte b10 = d0Var.e()[2];
        int i12 = b10 & 63;
        boolean z10 = (b10 & 128) > 0;
        boolean z11 = (b10 & 64) > 0;
        if (z10) {
            this.f58741h += g();
            d0Var.e()[1] = (byte) ((i12 << 1) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            d0Var.e()[2] = (byte) i11;
            this.f58734a.R(d0Var.e());
            this.f58734a.U(1);
        } else {
            int i13 = (this.f58740g + 1) % 65535;
            if (i10 != i13) {
                u.i("RtpH265Reader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i13), Integer.valueOf(i10)));
                return;
            } else {
                this.f58734a.R(d0Var.e());
                this.f58734a.U(3);
            }
        }
        int iA = this.f58734a.a();
        this.f58737d.c(this.f58734a, iA);
        this.f58741h += iA;
        if (z11) {
            this.f58738e = d(i12);
        }
    }

    private void f(d0 d0Var) {
        int iA = d0Var.a();
        this.f58741h += g();
        this.f58737d.c(d0Var, iA);
        this.f58741h += iA;
        this.f58738e = d((d0Var.e()[0] >> 1) & 63);
    }

    private int g() {
        this.f58735b.U(0);
        int iA = this.f58735b.a();
        ((b0) ob.a.e(this.f58737d)).c(this.f58735b, iA);
        return iA;
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 2);
        this.f58737d = b0VarTrack;
        b0VarTrack.e(this.f58736c.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) throws ParserException {
        if (d0Var.e().length == 0) {
            throw ParserException.c("Empty RTP data packet.", null);
        }
        int i11 = (d0Var.e()[0] >> 1) & 63;
        ob.a.i(this.f58737d);
        if (i11 >= 0 && i11 < 48) {
            f(d0Var);
        } else {
            if (i11 == 48) {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (i11 != 49) {
                throw ParserException.c(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i11)), null);
            }
            e(d0Var, i10);
        }
        if (z10) {
            if (this.f58739f == C.TIME_UNSET) {
                this.f58739f = j10;
            }
            this.f58737d.f(m.a(this.f58742i, j10, this.f58739f, 90000), this.f58738e, this.f58741h, 0, null);
            this.f58741h = 0;
        }
        this.f58740g = i10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58739f = j10;
        this.f58741h = 0;
        this.f58742i = j11;
    }

    @Override // za.k
    public void c(long j10, int i10) {
    }
}
