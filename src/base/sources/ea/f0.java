package ea;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.n0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37363a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37368f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f37364b = new n0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f37369g = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f37370h = C.TIME_UNSET;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37371i = C.TIME_UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.d0 f37365c = new ob.d0();

    f0(int i10) {
        this.f37363a = i10;
    }

    private int a(u9.l lVar) {
        this.f37365c.R(r0.f48430f);
        this.f37366d = true;
        lVar.resetPeekPosition();
        return 0;
    }

    private int f(u9.l lVar, u9.y yVar, int i10) {
        int iMin = (int) Math.min(this.f37363a, lVar.getLength());
        long j10 = 0;
        if (lVar.getPosition() != j10) {
            yVar.f54333a = j10;
            return 1;
        }
        this.f37365c.Q(iMin);
        lVar.resetPeekPosition();
        lVar.peekFully(this.f37365c.e(), 0, iMin);
        this.f37369g = g(this.f37365c, i10);
        this.f37367e = true;
        return 0;
    }

    private long g(ob.d0 d0Var, int i10) {
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG; iF++) {
            if (d0Var.e()[iF] == 71) {
                long jC = j0.c(d0Var, iF, i10);
                if (jC != C.TIME_UNSET) {
                    return jC;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int h(u9.l lVar, u9.y yVar, int i10) {
        long length = lVar.getLength();
        int iMin = (int) Math.min(this.f37363a, length);
        long j10 = length - ((long) iMin);
        if (lVar.getPosition() != j10) {
            yVar.f54333a = j10;
            return 1;
        }
        this.f37365c.Q(iMin);
        lVar.resetPeekPosition();
        lVar.peekFully(this.f37365c.e(), 0, iMin);
        this.f37370h = i(this.f37365c, i10);
        this.f37368f = true;
        return 0;
    }

    private long i(ob.d0 d0Var, int i10) {
        int iF = d0Var.f();
        int iG = d0Var.g();
        for (int i11 = iG - 188; i11 >= iF; i11--) {
            if (j0.b(d0Var.e(), iF, iG, i11)) {
                long jC = j0.c(d0Var, i11, i10);
                if (jC != C.TIME_UNSET) {
                    return jC;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public long b() {
        return this.f37371i;
    }

    public n0 c() {
        return this.f37364b;
    }

    public boolean d() {
        return this.f37366d;
    }

    public int e(u9.l lVar, u9.y yVar, int i10) {
        if (i10 <= 0) {
            return a(lVar);
        }
        if (!this.f37368f) {
            return h(lVar, yVar, i10);
        }
        if (this.f37370h == C.TIME_UNSET) {
            return a(lVar);
        }
        if (!this.f37367e) {
            return f(lVar, yVar, i10);
        }
        long j10 = this.f37369g;
        if (j10 == C.TIME_UNSET) {
            return a(lVar);
        }
        long jB = this.f37364b.b(this.f37370h) - this.f37364b.b(j10);
        this.f37371i = jB;
        if (jB < 0) {
            ob.u.i("TsDurationReader", "Invalid duration: " + this.f37371i + ". Using TIME_UNSET instead.");
            this.f37371i = C.TIME_UNSET;
        }
        return a(lVar);
    }
}
