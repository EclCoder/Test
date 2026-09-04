package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f43467b = new o(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43468a;

    private o(long j10) {
        this.f43468a = j10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        long j10 = this.f43468a;
        long j11 = oVar.f43468a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public void b(char[] cArr, int i10) {
        g.d(this.f43468a, cArr, i10);
    }

    public byte[] c() {
        byte[] bArr = new byte[8];
        g.e(this.f43468a, bArr, 0);
        return bArr;
    }

    public String d() {
        char[] cArr = new char[16];
        b(cArr, 0);
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o) && this.f43468a == ((o) obj).f43468a;
    }

    public int hashCode() {
        long j10 = this.f43468a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return "SpanId{spanId=" + d() + "}";
    }
}
