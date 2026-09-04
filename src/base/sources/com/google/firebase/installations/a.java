package com.google.firebase.installations;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22183c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f22185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f22186c;

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f22184a == null) {
                str = " token";
            }
            if (this.f22185b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f22186c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f22184a, this.f22185b.longValue(), this.f22186c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f22184a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j10) {
            this.f22186c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j10) {
            this.f22185b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f22181a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f22183c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f22182b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f22181a.equals(fVar.b()) && this.f22182b == fVar.d() && this.f22183c == fVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f22181a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f22182b;
        long j11 = this.f22183c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f22181a + ", tokenExpirationTimestamp=" + this.f22182b + ", tokenCreationTimestamp=" + this.f22183c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f22181a = str;
        this.f22182b = j10;
        this.f22183c = j11;
    }
}
