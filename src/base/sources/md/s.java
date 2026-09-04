package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s extends h0.f.d.a.b.AbstractC0701d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f46139c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.a.b.AbstractC0701d.AbstractC0702a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f46142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f46143d;

        b() {
        }

        @Override // md.h0.f.d.a.b.AbstractC0701d.AbstractC0702a
        public h0.f.d.a.b.AbstractC0701d a() {
            String str;
            String str2;
            if (this.f46143d == 1 && (str = this.f46140a) != null && (str2 = this.f46141b) != null) {
                return new s(str, str2, this.f46142c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46140a == null) {
                sb2.append(" name");
            }
            if (this.f46141b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f46143d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.a.b.AbstractC0701d.AbstractC0702a
        public h0.f.d.a.b.AbstractC0701d.AbstractC0702a b(long j10) {
            this.f46142c = j10;
            this.f46143d = (byte) (this.f46143d | 1);
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0701d.AbstractC0702a
        public h0.f.d.a.b.AbstractC0701d.AbstractC0702a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f46141b = str;
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0701d.AbstractC0702a
        public h0.f.d.a.b.AbstractC0701d.AbstractC0702a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f46140a = str;
            return this;
        }
    }

    @Override // md.h0.f.d.a.b.AbstractC0701d
    public long b() {
        return this.f46139c;
    }

    @Override // md.h0.f.d.a.b.AbstractC0701d
    public String c() {
        return this.f46138b;
    }

    @Override // md.h0.f.d.a.b.AbstractC0701d
    public String d() {
        return this.f46137a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.a.b.AbstractC0701d) {
            h0.f.d.a.b.AbstractC0701d abstractC0701d = (h0.f.d.a.b.AbstractC0701d) obj;
            if (this.f46137a.equals(abstractC0701d.d()) && this.f46138b.equals(abstractC0701d.c()) && this.f46139c == abstractC0701d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f46137a.hashCode() ^ 1000003) * 1000003) ^ this.f46138b.hashCode()) * 1000003;
        long j10 = this.f46139c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f46137a + ", code=" + this.f46138b + ", address=" + this.f46139c + "}";
    }

    private s(String str, String str2, long j10) {
        this.f46137a = str;
        this.f46138b = str2;
        this.f46139c = j10;
    }
}
