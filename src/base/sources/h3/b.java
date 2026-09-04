package h3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;
import o2.j0;
import o2.k0;
import w1.c0;
import w1.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f40174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f40175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f40176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f40178e;

    public b(long j10, long j11, long j12) {
        this.f40178e = j10;
        this.f40174a = j12;
        o oVar = new o();
        this.f40175b = oVar;
        o oVar2 = new o();
        this.f40176c = oVar2;
        oVar.a(0L);
        oVar2.a(j11);
        int i10 = -2147483647;
        if (j10 == C.TIME_UNSET) {
            this.f40177d = -2147483647;
            return;
        }
        long jP0 = c0.P0(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jP0 > 0 && jP0 <= 2147483647L) {
            i10 = (int) jP0;
        }
        this.f40177d = i10;
    }

    @Override // h3.g
    public long a() {
        return this.f40174a;
    }

    public boolean b(long j10) {
        o oVar = this.f40175b;
        return j10 - oVar.b(oVar.c() - 1) < 100000;
    }

    public void c(long j10, long j11) {
        if (b(j10)) {
            return;
        }
        this.f40175b.a(j10);
        this.f40176c.a(j11);
    }

    void d(long j10) {
        this.f40178e = j10;
    }

    @Override // h3.g
    public int g() {
        return this.f40177d;
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f40178e;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        int iE = c0.e(this.f40175b, j10, true, true);
        k0 k0Var = new k0(this.f40175b.b(iE), this.f40176c.b(iE));
        if (k0Var.f48082a == j10 || iE == this.f40175b.c() - 1) {
            return new j0.a(k0Var);
        }
        int i10 = iE + 1;
        return new j0.a(k0Var, new k0(this.f40175b.b(i10), this.f40176c.b(i10)));
    }

    @Override // h3.g
    public long getTimeUs(long j10) {
        return this.f40175b.b(c0.e(this.f40176c, j10, true, true));
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return true;
    }
}
