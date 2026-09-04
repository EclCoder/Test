package u3;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f53738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53739e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.z f53735a = new w1.z(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53740f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53741g = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f53742h = C.TIME_UNSET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f53736b = new w1.u();

    a0() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(o2.q qVar) {
        this.f53736b.Q(w1.c0.f55774f);
        this.f53737c = true;
        qVar.resetPeekPosition();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    private int h(o2.q qVar, o2.i0 i0Var) {
        int iMin = (int) Math.min(20000L, qVar.getLength());
        long j10 = 0;
        if (qVar.getPosition() != j10) {
            i0Var.f48076a = j10;
            return 1;
        }
        this.f53736b.P(iMin);
        qVar.resetPeekPosition();
        qVar.peekFully(this.f53736b.e(), 0, iMin);
        this.f53740f = i(this.f53736b);
        this.f53738d = true;
        return 0;
    }

    private long i(w1.u uVar) {
        int iG = uVar.g();
        for (int iF = uVar.f(); iF < iG - 3; iF++) {
            if (f(uVar.e(), iF) == 442) {
                uVar.T(iF + 4);
                long jL = l(uVar);
                if (jL != C.TIME_UNSET) {
                    return jL;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int j(o2.q qVar, o2.i0 i0Var) {
        long length = qVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (qVar.getPosition() != j10) {
            i0Var.f48076a = j10;
            return 1;
        }
        this.f53736b.P(iMin);
        qVar.resetPeekPosition();
        qVar.peekFully(this.f53736b.e(), 0, iMin);
        this.f53741g = k(this.f53736b);
        this.f53739e = true;
        return 0;
    }

    private long k(w1.u uVar) {
        int iF = uVar.f();
        for (int iG = uVar.g() - 4; iG >= iF; iG--) {
            if (f(uVar.e(), iG) == 442) {
                uVar.T(iG + 4);
                long jL = l(uVar);
                if (jL != C.TIME_UNSET) {
                    return jL;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long l(w1.u uVar) {
        int iF = uVar.f();
        if (uVar.a() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        uVar.l(bArr, 0, 9);
        uVar.T(iF);
        return !a(bArr) ? C.TIME_UNSET : m(bArr);
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f53742h;
    }

    public w1.z d() {
        return this.f53735a;
    }

    public boolean e() {
        return this.f53737c;
    }

    public int g(o2.q qVar, o2.i0 i0Var) {
        if (!this.f53739e) {
            return j(qVar, i0Var);
        }
        if (this.f53741g == C.TIME_UNSET) {
            return b(qVar);
        }
        if (!this.f53738d) {
            return h(qVar, i0Var);
        }
        long j10 = this.f53740f;
        if (j10 == C.TIME_UNSET) {
            return b(qVar);
        }
        this.f53742h = this.f53735a.c(this.f53741g) - this.f53735a.b(j10);
        return b(qVar);
    }
}
