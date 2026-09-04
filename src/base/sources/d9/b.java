package d9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f36461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36462b;

    b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f36461a = aVar;
        this.f36462b = j10;
    }

    @Override // d9.g
    public long b() {
        return this.f36462b;
    }

    @Override // d9.g
    public g.a c() {
        return this.f36461a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f36461a.equals(gVar.c()) && this.f36462b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f36461a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f36462b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f36461a + ", nextRequestWaitMillis=" + this.f36462b + "}";
    }
}
