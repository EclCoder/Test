package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53823a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f53826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53828f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.z f53824b = new w1.z(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53829g = C.TIME_UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f53830h = C.TIME_UNSET;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f53831i = C.TIME_UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f53825c = new w1.u();

    h0(int i10) {
        this.f53823a = i10;
    }

    private int a(o2.q qVar) {
        this.f53825c.Q(w1.c0.f55774f);
        this.f53826d = true;
        qVar.resetPeekPosition();
        return 0;
    }

    private int f(o2.q qVar, o2.i0 i0Var, int i10) {
        int iMin = (int) Math.min(this.f53823a, qVar.getLength());
        long j10 = 0;
        if (qVar.getPosition() != j10) {
            i0Var.f48076a = j10;
            return 1;
        }
        this.f53825c.P(iMin);
        qVar.resetPeekPosition();
        qVar.peekFully(this.f53825c.e(), 0, iMin);
        this.f53829g = g(this.f53825c, i10);
        this.f53827e = true;
        return 0;
    }

    private long g(w1.u uVar, int i10) {
        int iG = uVar.g();
        for (int iF = uVar.f(); iF < iG; iF++) {
            if (uVar.e()[iF] == 71) {
                long jC = l0.c(uVar, iF, i10);
                if (jC != C.TIME_UNSET) {
                    return jC;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int h(o2.q qVar, o2.i0 i0Var, int i10) {
        long length = qVar.getLength();
        int iMin = (int) Math.min(this.f53823a, length);
        long j10 = length - ((long) iMin);
        if (qVar.getPosition() != j10) {
            i0Var.f48076a = j10;
            return 1;
        }
        this.f53825c.P(iMin);
        qVar.resetPeekPosition();
        qVar.peekFully(this.f53825c.e(), 0, iMin);
        this.f53830h = i(this.f53825c, i10);
        this.f53828f = true;
        return 0;
    }

    private long i(w1.u uVar, int i10) {
        int iF = uVar.f();
        int iG = uVar.g();
        for (int i11 = iG - 188; i11 >= iF; i11--) {
            if (l0.b(uVar.e(), iF, iG, i11)) {
                long jC = l0.c(uVar, i11, i10);
                if (jC != C.TIME_UNSET) {
                    return jC;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public long b() {
        return this.f53831i;
    }

    public w1.z c() {
        return this.f53824b;
    }

    public boolean d() {
        return this.f53826d;
    }

    public int e(o2.q qVar, o2.i0 i0Var, int i10) {
        if (i10 <= 0) {
            return a(qVar);
        }
        if (!this.f53828f) {
            return h(qVar, i0Var, i10);
        }
        if (this.f53830h == C.TIME_UNSET) {
            return a(qVar);
        }
        if (!this.f53827e) {
            return f(qVar, i0Var, i10);
        }
        long j10 = this.f53829g;
        if (j10 == C.TIME_UNSET) {
            return a(qVar);
        }
        this.f53831i = this.f53824b.c(this.f53830h) - this.f53824b.b(j10);
        return a(qVar);
    }
}
