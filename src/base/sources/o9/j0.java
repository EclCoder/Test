package o9;

import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f48292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f48293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0 f48294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0 f48295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j0 f48296g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48298b;

    static {
        j0 j0Var = new j0(0L, 0L);
        f48292c = j0Var;
        f48293d = new j0(Long.MAX_VALUE, Long.MAX_VALUE);
        f48294e = new j0(Long.MAX_VALUE, 0L);
        f48295f = new j0(0L, Long.MAX_VALUE);
        f48296g = j0Var;
    }

    public j0(long j10, long j11) {
        ob.a.a(j10 >= 0);
        ob.a.a(j11 >= 0);
        this.f48297a = j10;
        this.f48298b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long a(long j10, long j11, long j12) {
        long j13 = this.f48297a;
        if (j13 == 0 && this.f48298b == 0) {
            return j10;
        }
        long jB1 = r0.b1(j10, j13, Long.MIN_VALUE);
        long jB = r0.b(j10, this.f48298b, Long.MAX_VALUE);
        boolean z10 = false;
        boolean z11 = jB1 <= j11 && j11 <= jB;
        if (jB1 <= j12 && j12 <= jB) {
            z10 = true;
        }
        if (z11 && z10) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (!z11) {
            if (z10) {
                return j12;
            }
            return jB1;
        }
        return j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (this.f48297a == j0Var.f48297a && this.f48298b == j0Var.f48298b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f48297a) * 31) + ((int) this.f48298b);
    }
}
