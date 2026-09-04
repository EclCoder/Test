package ea;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.n0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37656e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f37652a = new n0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37657f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f37658g = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37659h = C.TIME_UNSET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.d0 f37653b = new ob.d0();

    y() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(u9.l lVar) {
        this.f37653b.R(r0.f48430f);
        this.f37654c = true;
        lVar.resetPeekPosition();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    private int h(u9.l lVar, u9.y yVar) {
        int iMin = (int) Math.min(20000L, lVar.getLength());
        long j10 = 0;
        if (lVar.getPosition() != j10) {
            yVar.f54333a = j10;
            return 1;
        }
        this.f37653b.Q(iMin);
        lVar.resetPeekPosition();
        lVar.peekFully(this.f37653b.e(), 0, iMin);
        this.f37657f = i(this.f37653b);
        this.f37655d = true;
        return 0;
    }

    private long i(ob.d0 d0Var) {
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG - 3; iF++) {
            if (f(d0Var.e(), iF) == 442) {
                d0Var.U(iF + 4);
                long jL = l(d0Var);
                if (jL != C.TIME_UNSET) {
                    return jL;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int j(u9.l lVar, u9.y yVar) {
        long length = lVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (lVar.getPosition() != j10) {
            yVar.f54333a = j10;
            return 1;
        }
        this.f37653b.Q(iMin);
        lVar.resetPeekPosition();
        lVar.peekFully(this.f37653b.e(), 0, iMin);
        this.f37658g = k(this.f37653b);
        this.f37656e = true;
        return 0;
    }

    private long k(ob.d0 d0Var) {
        int iF = d0Var.f();
        for (int iG = d0Var.g() - 4; iG >= iF; iG--) {
            if (f(d0Var.e(), iG) == 442) {
                d0Var.U(iG + 4);
                long jL = l(d0Var);
                if (jL != C.TIME_UNSET) {
                    return jL;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long l(ob.d0 d0Var) {
        int iF = d0Var.f();
        if (d0Var.a() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        d0Var.l(bArr, 0, 9);
        d0Var.U(iF);
        return !a(bArr) ? C.TIME_UNSET : m(bArr);
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f37659h;
    }

    public n0 d() {
        return this.f37652a;
    }

    public boolean e() {
        return this.f37654c;
    }

    public int g(u9.l lVar, u9.y yVar) {
        if (!this.f37656e) {
            return j(lVar, yVar);
        }
        if (this.f37658g == C.TIME_UNSET) {
            return b(lVar);
        }
        if (!this.f37655d) {
            return h(lVar, yVar);
        }
        long j10 = this.f37657f;
        if (j10 == C.TIME_UNSET) {
            return b(lVar);
        }
        long jB = this.f37652a.b(this.f37658g) - this.f37652a.b(j10);
        this.f37659h = jB;
        if (jB < 0) {
            ob.u.i("PsDurationReader", "Invalid duration: " + this.f37659h + ". Using TIME_UNSET instead.");
            this.f37659h = C.TIME_UNSET;
        }
        return b(lVar);
    }
}
