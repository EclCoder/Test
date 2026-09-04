package za;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import ob.r0;
import ob.u;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f58752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f58754d = C.TIME_UNSET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58755e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58757g;

    public i(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58751a = hVar;
    }

    private static int d(d0 d0Var) {
        int iA = com.google.common.primitives.b.a(d0Var.e(), new byte[]{0, 0, 1, -74});
        if (iA != -1) {
            d0Var.U(iA + 4);
            if ((d0Var.j() >> 6) == 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 2);
        this.f58752b = b0VarTrack;
        ((b0) r0.j(b0VarTrack)).e(this.f58751a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        int iB;
        ob.a.i(this.f58752b);
        int i11 = this.f58755e;
        if (i11 != -1 && i10 != (iB = ya.a.b(i11))) {
            u.i("RtpMpeg4Reader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
        }
        int iA = d0Var.a();
        this.f58752b.c(d0Var, iA);
        if (this.f58757g == 0) {
            this.f58753c = d(d0Var);
        }
        this.f58757g += iA;
        if (z10) {
            if (this.f58754d == C.TIME_UNSET) {
                this.f58754d = j10;
            }
            this.f58752b.f(m.a(this.f58756f, j10, this.f58754d, 90000), this.f58753c, this.f58757g, 0, null);
            this.f58757g = 0;
        }
        this.f58755e = i10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58754d = j10;
        this.f58756f = j11;
        this.f58757g = 0;
    }

    @Override // za.k
    public void c(long j10, int i10) {
    }
}
