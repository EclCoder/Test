package b9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class l extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8624a;

    l(long j10) {
        this.f8624a = j10;
    }

    @Override // b9.v
    public long c() {
        return this.f8624a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f8624a == ((v) obj).c();
    }

    public int hashCode() {
        long j10 = this.f8624a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f8624a + "}";
    }
}
