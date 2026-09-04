package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j2 f5407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j2 f5408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j2 f5409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j2 f5410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j2 f5411g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5413b;

    static {
        j2 j2Var = new j2(0L, 0L);
        f5407c = j2Var;
        f5408d = new j2(Long.MAX_VALUE, Long.MAX_VALUE);
        f5409e = new j2(Long.MAX_VALUE, 0L);
        f5410f = new j2(0L, Long.MAX_VALUE);
        f5411g = j2Var;
    }

    public j2(long j10, long j11) {
        w1.a.a(j10 >= 0);
        w1.a.a(j11 >= 0);
        this.f5412a = j10;
        this.f5413b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long a(long j10, long j11, long j12) {
        long j13 = this.f5412a;
        if (j13 == 0 && this.f5413b == 0) {
            return j10;
        }
        long jW0 = w1.c0.W0(j10, j13, Long.MIN_VALUE);
        long jB = w1.c0.b(j10, this.f5413b, Long.MAX_VALUE);
        boolean z10 = false;
        boolean z11 = jW0 <= j11 && j11 <= jB;
        if (jW0 <= j12 && j12 <= jB) {
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
            return jW0;
        }
        return j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j2.class == obj.getClass()) {
            j2 j2Var = (j2) obj;
            if (this.f5412a == j2Var.f5412a && this.f5413b == j2Var.f5413b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f5412a) * 31) + ((int) this.f5413b);
    }
}
