package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f43509c = new r(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43511b;

    private r(long j10, long j11) {
        this.f43510a = j10;
        this.f43511b = j11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(r rVar) {
        long j10 = this.f43510a;
        long j11 = rVar.f43510a;
        if (j10 != j11) {
            return j10 < j11 ? -1 : 1;
        }
        long j12 = this.f43511b;
        long j13 = rVar.f43511b;
        if (j12 == j13) {
            return 0;
        }
        return j12 < j13 ? -1 : 1;
    }

    public void b(char[] cArr, int i10) {
        g.d(this.f43510a, cArr, i10);
        g.d(this.f43511b, cArr, i10 + 16);
    }

    public String c() {
        char[] cArr = new char[32];
        b(cArr, 0);
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f43510a == rVar.f43510a && this.f43511b == rVar.f43511b;
    }

    public int hashCode() {
        long j10 = this.f43510a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + 31) * 31;
        long j11 = this.f43511b;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    public String toString() {
        return "TraceId{traceId=" + c() + "}";
    }
}
