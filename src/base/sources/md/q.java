package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class q extends h0.f.d.a.b.AbstractC0697a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f46117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f46120d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.a.b.AbstractC0697a.AbstractC0698a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f46121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f46122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f46124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f46125e;

        b() {
        }

        @Override // md.h0.f.d.a.b.AbstractC0697a.AbstractC0698a
        public h0.f.d.a.b.AbstractC0697a a() {
            String str;
            if (this.f46125e == 3 && (str = this.f46123c) != null) {
                return new q(this.f46121a, this.f46122b, str, this.f46124d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f46125e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f46125e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f46123c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.a.b.AbstractC0697a.AbstractC0698a
        public h0.f.d.a.b.AbstractC0697a.AbstractC0698a b(long j10) {
            this.f46121a = j10;
            this.f46125e = (byte) (this.f46125e | 1);
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0697a.AbstractC0698a
        public h0.f.d.a.b.AbstractC0697a.AbstractC0698a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f46123c = str;
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0697a.AbstractC0698a
        public h0.f.d.a.b.AbstractC0697a.AbstractC0698a d(long j10) {
            this.f46122b = j10;
            this.f46125e = (byte) (this.f46125e | 2);
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0697a.AbstractC0698a
        public h0.f.d.a.b.AbstractC0697a.AbstractC0698a e(String str) {
            this.f46124d = str;
            return this;
        }
    }

    @Override // md.h0.f.d.a.b.AbstractC0697a
    public long b() {
        return this.f46117a;
    }

    @Override // md.h0.f.d.a.b.AbstractC0697a
    public String c() {
        return this.f46119c;
    }

    @Override // md.h0.f.d.a.b.AbstractC0697a
    public long d() {
        return this.f46118b;
    }

    @Override // md.h0.f.d.a.b.AbstractC0697a
    public String e() {
        return this.f46120d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.a.b.AbstractC0697a) {
            h0.f.d.a.b.AbstractC0697a abstractC0697a = (h0.f.d.a.b.AbstractC0697a) obj;
            if (this.f46117a == abstractC0697a.b() && this.f46118b == abstractC0697a.d() && this.f46119c.equals(abstractC0697a.c()) && ((str = this.f46120d) != null ? str.equals(abstractC0697a.e()) : abstractC0697a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f46117a;
        long j11 = this.f46118b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f46119c.hashCode()) * 1000003;
        String str = this.f46120d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f46117a + ", size=" + this.f46118b + ", name=" + this.f46119c + ", uuid=" + this.f46120d + "}";
    }

    private q(long j10, long j11, String str, String str2) {
        this.f46117a = j10;
        this.f46118b = j11;
        this.f46119c = str;
        this.f46120d = str2;
    }
}
