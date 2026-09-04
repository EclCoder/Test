package za;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import ob.r0;
import ob.u;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f58714b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58716d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f58718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f58720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f58721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f58722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f58723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f58724l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f58715c = C.TIME_UNSET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58717e = -1;

    public e(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58713a = hVar;
    }

    private void d() {
        b0 b0Var = (b0) ob.a.e(this.f58714b);
        long j10 = this.f58723k;
        boolean z10 = this.f58720h;
        b0Var.f(j10, z10 ? 1 : 0, this.f58716d, 0, null);
        this.f58716d = 0;
        this.f58723k = C.TIME_UNSET;
        this.f58720h = false;
        this.f58724l = false;
    }

    private void e(d0 d0Var, boolean z10) {
        int iF = d0Var.f();
        if (((d0Var.J() >> 10) & 63) != 32) {
            d0Var.U(iF);
            this.f58720h = false;
            return;
        }
        int iJ = d0Var.j();
        int i10 = (iJ >> 1) & 1;
        if (!z10 && i10 == 0) {
            int i11 = (iJ >> 2) & 7;
            if (i11 == 1) {
                this.f58718f = 128;
                this.f58719g = 96;
            } else {
                int i12 = i11 - 2;
                this.f58718f = 176 << i12;
                this.f58719g = 144 << i12;
            }
        }
        d0Var.U(iF);
        this.f58720h = i10 == 0;
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 2);
        this.f58714b = b0VarTrack;
        b0VarTrack.e(this.f58713a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        ob.a.i(this.f58714b);
        int iF = d0Var.f();
        int iN = d0Var.N();
        boolean z11 = (iN & UserVerificationMethods.USER_VERIFY_ALL) > 0;
        if ((iN & 512) != 0 || (iN & PglCryptUtils.BASE64_FAILED) != 0 || (iN & 7) != 0) {
            u.i("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z11) {
            if (this.f58724l && this.f58716d > 0) {
                d();
            }
            this.f58724l = true;
            if ((d0Var.j() & 252) < 128) {
                u.i("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                d0Var.e()[iF] = 0;
                d0Var.e()[iF + 1] = 0;
                d0Var.U(iF);
            }
        } else {
            if (!this.f58724l) {
                u.i("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int iB = ya.a.b(this.f58717e);
            if (i10 < iB) {
                u.i("RtpH263Reader", r0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
                return;
            }
        }
        if (this.f58716d == 0) {
            e(d0Var, this.f58721i);
            if (!this.f58721i && this.f58720h) {
                int i11 = this.f58718f;
                v0 v0Var = this.f58713a.f17998c;
                if (i11 != v0Var.f18873q || this.f58719g != v0Var.f18874r) {
                    this.f58714b.e(v0Var.b().n0(this.f58718f).S(this.f58719g).G());
                }
                this.f58721i = true;
            }
        }
        int iA = d0Var.a();
        this.f58714b.c(d0Var, iA);
        this.f58716d += iA;
        this.f58723k = m.a(this.f58722j, j10, this.f58715c, 90000);
        if (z10) {
            d();
        }
        this.f58717e = i10;
    }

    @Override // za.k
    public void c(long j10, int i10) {
        ob.a.g(this.f58715c == C.TIME_UNSET);
        this.f58715c = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58715c = j10;
        this.f58716d = 0;
        this.f58722j = j11;
    }
}
