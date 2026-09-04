package za;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import ob.r0;
import ob.u;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class o implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f58781b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f58789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f58790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f58791l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f58782c = C.TIME_UNSET;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f58785f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f58786g = C.TIME_UNSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f58783d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58784e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f58787h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f58788i = -1;

    public o(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58780a = hVar;
    }

    private void d() {
        b0 b0Var = (b0) ob.a.e(this.f58781b);
        long j10 = this.f58786g;
        boolean z10 = this.f58791l;
        b0Var.f(j10, z10 ? 1 : 0, this.f58785f, 0, null);
        this.f58785f = -1;
        this.f58786g = C.TIME_UNSET;
        this.f58789j = false;
    }

    private boolean e(d0 d0Var, int i10) {
        int iH = d0Var.H();
        if ((iH & 8) == 8) {
            if (this.f58789j && this.f58785f > 0) {
                d();
            }
            this.f58789j = true;
        } else {
            if (!this.f58789j) {
                u.i("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int iB = ya.a.b(this.f58784e);
            if (i10 < iB) {
                u.i("RtpVp9Reader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
                return false;
            }
        }
        if ((iH & 128) != 0 && (d0Var.H() & 128) != 0 && d0Var.a() < 1) {
            return false;
        }
        int i11 = iH & 16;
        ob.a.b(i11 == 0, "VP9 flexible mode is not supported.");
        if ((iH & 32) != 0) {
            d0Var.V(1);
            if (d0Var.a() < 1) {
                return false;
            }
            if (i11 == 0) {
                d0Var.V(1);
            }
        }
        if ((iH & 2) != 0) {
            int iH2 = d0Var.H();
            int i12 = (iH2 >> 5) & 7;
            if ((iH2 & 16) != 0) {
                int i13 = i12 + 1;
                if (d0Var.a() < i13 * 4) {
                    return false;
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    this.f58787h = d0Var.N();
                    this.f58788i = d0Var.N();
                }
            }
            if ((iH2 & 8) != 0) {
                int iH3 = d0Var.H();
                if (d0Var.a() < iH3) {
                    return false;
                }
                for (int i15 = 0; i15 < iH3; i15++) {
                    int iN = (d0Var.N() & 12) >> 2;
                    if (d0Var.a() < iN) {
                        return false;
                    }
                    d0Var.V(iN);
                }
            }
        }
        return true;
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 2);
        this.f58781b = b0VarTrack;
        b0VarTrack.e(this.f58780a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        int i11;
        int i12;
        ob.a.i(this.f58781b);
        if (e(d0Var, i10)) {
            if (this.f58785f == -1 && this.f58789j) {
                this.f58791l = (d0Var.j() & 4) == 0;
            }
            if (!this.f58790k && (i11 = this.f58787h) != -1 && (i12 = this.f58788i) != -1) {
                v0 v0Var = this.f58780a.f17998c;
                if (i11 != v0Var.f18873q || i12 != v0Var.f18874r) {
                    this.f58781b.e(v0Var.b().n0(this.f58787h).S(this.f58788i).G());
                }
                this.f58790k = true;
            }
            int iA = d0Var.a();
            this.f58781b.c(d0Var, iA);
            int i13 = this.f58785f;
            if (i13 == -1) {
                this.f58785f = iA;
            } else {
                this.f58785f = i13 + iA;
            }
            this.f58786g = m.a(this.f58783d, j10, this.f58782c, 90000);
            if (z10) {
                d();
            }
            this.f58784e = i10;
        }
    }

    @Override // za.k
    public void c(long j10, int i10) {
        ob.a.g(this.f58782c == C.TIME_UNSET);
        this.f58782c = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58782c = j10;
        this.f58785f = -1;
        this.f58783d = j11;
    }
}
