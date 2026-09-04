package fe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f38478c;

    /* JADX INFO: renamed from: fe.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0579b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f38479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f38480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f38481c;

        C0579b() {
        }

        @Override // fe.f.a
        public f a() {
            String str = "";
            if (this.f38480b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f38479a, this.f38480b.longValue(), this.f38481c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // fe.f.a
        public f.a b(f.b bVar) {
            this.f38481c = bVar;
            return this;
        }

        @Override // fe.f.a
        public f.a c(String str) {
            this.f38479a = str;
            return this;
        }

        @Override // fe.f.a
        public f.a d(long j10) {
            this.f38480b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // fe.f
    public f.b b() {
        return this.f38478c;
    }

    @Override // fe.f
    public String c() {
        return this.f38476a;
    }

    @Override // fe.f
    public long d() {
        return this.f38477b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f38476a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f38477b == fVar.d() && ((bVar = this.f38478c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f38476a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f38477b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f38478c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f38476a + ", tokenExpirationTimestamp=" + this.f38477b + ", responseCode=" + this.f38478c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f38476a = str;
        this.f38477b = j10;
        this.f38478c = bVar;
    }
}
