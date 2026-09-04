package fa;

import ob.r0;
import u9.a0;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f38446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f38448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f38449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f38450e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f38446a = cVar;
        this.f38447b = i10;
        this.f38448c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f38441e);
        this.f38449d = j12;
        this.f38450e = b(j12);
    }

    private long b(long j10) {
        return r0.U0(j10 * ((long) this.f38447b), 1000000L, this.f38446a.f38439c);
    }

    @Override // u9.z
    public long getDurationUs() {
        return this.f38450e;
    }

    @Override // u9.z
    public z.a getSeekPoints(long j10) {
        long jR = r0.r((((long) this.f38446a.f38439c) * j10) / (((long) this.f38447b) * 1000000), 0L, this.f38449d - 1);
        long j11 = this.f38448c + (((long) this.f38446a.f38441e) * jR);
        long jB = b(jR);
        a0 a0Var = new a0(jB, j11);
        if (jB >= j10 || jR == this.f38449d - 1) {
            return new z.a(a0Var);
        }
        long j12 = jR + 1;
        return new z.a(a0Var, new a0(b(j12), this.f38448c + (((long) this.f38446a.f38441e) * j12)));
    }

    @Override // u9.z
    public boolean isSeekable() {
        return true;
    }
}
