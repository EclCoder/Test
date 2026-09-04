package k9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c9.p f43029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c9.i f43030c;

    b(long j10, c9.p pVar, c9.i iVar) {
        this.f43028a = j10;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f43029b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f43030c = iVar;
    }

    @Override // k9.k
    public c9.i b() {
        return this.f43030c;
    }

    @Override // k9.k
    public long c() {
        return this.f43028a;
    }

    @Override // k9.k
    public c9.p d() {
        return this.f43029b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f43028a == kVar.c() && this.f43029b.equals(kVar.d()) && this.f43030c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f43028a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f43029b.hashCode()) * 1000003) ^ this.f43030c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f43028a + ", transportContext=" + this.f43029b + ", event=" + this.f43030c + "}";
    }
}
