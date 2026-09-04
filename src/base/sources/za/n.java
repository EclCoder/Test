package za;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import ob.r0;
import ob.u;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f58771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f58772c = C.TIME_UNSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58773d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58774e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58775f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f58776g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f58777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f58778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f58779j;

    public n(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58770a = hVar;
    }

    private void d() {
        b0 b0Var = (b0) ob.a.e(this.f58771b);
        long j10 = this.f58775f;
        boolean z10 = this.f58778i;
        b0Var.f(j10, z10 ? 1 : 0, this.f58774e, 0, null);
        this.f58774e = -1;
        this.f58775f = C.TIME_UNSET;
        this.f58777h = false;
    }

    private boolean e(d0 d0Var, int i10) {
        int iH = d0Var.H();
        if ((iH & 16) == 16 && (iH & 7) == 0) {
            if (this.f58777h && this.f58774e > 0) {
                d();
            }
            this.f58777h = true;
        } else {
            if (!this.f58777h) {
                u.i("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int iB = ya.a.b(this.f58773d);
            if (i10 < iB) {
                u.i("RtpVP8Reader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
                return false;
            }
        }
        if ((iH & 128) != 0) {
            int iH2 = d0Var.H();
            if ((iH2 & 128) != 0 && (d0Var.H() & 128) != 0) {
                d0Var.V(1);
            }
            if ((iH2 & 64) != 0) {
                d0Var.V(1);
            }
            if ((iH2 & 32) != 0 || (iH2 & 16) != 0) {
                d0Var.V(1);
            }
        }
        return true;
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 2);
        this.f58771b = b0VarTrack;
        b0VarTrack.e(this.f58770a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        ob.a.i(this.f58771b);
        if (e(d0Var, i10)) {
            if (this.f58774e == -1 && this.f58777h) {
                this.f58778i = (d0Var.j() & 1) == 0;
            }
            if (!this.f58779j) {
                int iF = d0Var.f();
                d0Var.U(iF + 6);
                int iZ = d0Var.z() & 16383;
                int iZ2 = d0Var.z() & 16383;
                d0Var.U(iF);
                v0 v0Var = this.f58770a.f17998c;
                if (iZ != v0Var.f18873q || iZ2 != v0Var.f18874r) {
                    this.f58771b.e(v0Var.b().n0(iZ).S(iZ2).G());
                }
                this.f58779j = true;
            }
            int iA = d0Var.a();
            this.f58771b.c(d0Var, iA);
            int i11 = this.f58774e;
            if (i11 == -1) {
                this.f58774e = iA;
            } else {
                this.f58774e = i11 + iA;
            }
            this.f58775f = m.a(this.f58776g, j10, this.f58772c, 90000);
            if (z10) {
                d();
            }
            this.f58773d = i10;
        }
    }

    @Override // za.k
    public void c(long j10, int i10) {
        ob.a.g(this.f58772c == C.TIME_UNSET);
        this.f58772c = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58772c = j10;
        this.f58774e = -1;
        this.f58776g = j11;
    }
}
