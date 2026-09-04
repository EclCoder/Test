package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class n extends h0.f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f46077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0.f.d.a f46079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.f.d.c f46080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0.f.d.AbstractC0707d f46081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h0.f.d.AbstractC0708f f46082f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f46083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h0.f.d.a f46085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h0.f.d.c f46086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h0.f.d.AbstractC0707d f46087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private h0.f.d.AbstractC0708f f46088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f46089g;

        @Override // md.h0.f.d.b
        public h0.f.d a() {
            String str;
            h0.f.d.a aVar;
            h0.f.d.c cVar;
            if (this.f46089g == 1 && (str = this.f46084b) != null && (aVar = this.f46085c) != null && (cVar = this.f46086d) != null) {
                return new n(this.f46083a, str, aVar, cVar, this.f46087e, this.f46088f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f46089g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f46084b == null) {
                sb2.append(" type");
            }
            if (this.f46085c == null) {
                sb2.append(" app");
            }
            if (this.f46086d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.b
        public h0.f.d.b b(h0.f.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f46085c = aVar;
            return this;
        }

        @Override // md.h0.f.d.b
        public h0.f.d.b c(h0.f.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f46086d = cVar;
            return this;
        }

        @Override // md.h0.f.d.b
        public h0.f.d.b d(h0.f.d.AbstractC0707d abstractC0707d) {
            this.f46087e = abstractC0707d;
            return this;
        }

        @Override // md.h0.f.d.b
        public h0.f.d.b e(h0.f.d.AbstractC0708f abstractC0708f) {
            this.f46088f = abstractC0708f;
            return this;
        }

        @Override // md.h0.f.d.b
        public h0.f.d.b f(long j10) {
            this.f46083a = j10;
            this.f46089g = (byte) (this.f46089g | 1);
            return this;
        }

        @Override // md.h0.f.d.b
        public h0.f.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f46084b = str;
            return this;
        }

        b() {
        }

        private b(h0.f.d dVar) {
            this.f46083a = dVar.f();
            this.f46084b = dVar.g();
            this.f46085c = dVar.b();
            this.f46086d = dVar.c();
            this.f46087e = dVar.d();
            this.f46088f = dVar.e();
            this.f46089g = (byte) 1;
        }
    }

    @Override // md.h0.f.d
    public h0.f.d.a b() {
        return this.f46079c;
    }

    @Override // md.h0.f.d
    public h0.f.d.c c() {
        return this.f46080d;
    }

    @Override // md.h0.f.d
    public h0.f.d.AbstractC0707d d() {
        return this.f46081e;
    }

    @Override // md.h0.f.d
    public h0.f.d.AbstractC0708f e() {
        return this.f46082f;
    }

    public boolean equals(Object obj) {
        h0.f.d.AbstractC0707d abstractC0707d;
        h0.f.d.AbstractC0708f abstractC0708f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d) {
            h0.f.d dVar = (h0.f.d) obj;
            if (this.f46077a == dVar.f() && this.f46078b.equals(dVar.g()) && this.f46079c.equals(dVar.b()) && this.f46080d.equals(dVar.c()) && ((abstractC0707d = this.f46081e) != null ? abstractC0707d.equals(dVar.d()) : dVar.d() == null) && ((abstractC0708f = this.f46082f) != null ? abstractC0708f.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // md.h0.f.d
    public long f() {
        return this.f46077a;
    }

    @Override // md.h0.f.d
    public String g() {
        return this.f46078b;
    }

    @Override // md.h0.f.d
    public h0.f.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f46077a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46078b.hashCode()) * 1000003) ^ this.f46079c.hashCode()) * 1000003) ^ this.f46080d.hashCode()) * 1000003;
        h0.f.d.AbstractC0707d abstractC0707d = this.f46081e;
        int iHashCode2 = (iHashCode ^ (abstractC0707d == null ? 0 : abstractC0707d.hashCode())) * 1000003;
        h0.f.d.AbstractC0708f abstractC0708f = this.f46082f;
        return iHashCode2 ^ (abstractC0708f != null ? abstractC0708f.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f46077a + ", type=" + this.f46078b + ", app=" + this.f46079c + ", device=" + this.f46080d + ", log=" + this.f46081e + ", rollouts=" + this.f46082f + "}";
    }

    private n(long j10, String str, h0.f.d.a aVar, h0.f.d.c cVar, h0.f.d.AbstractC0707d abstractC0707d, h0.f.d.AbstractC0708f abstractC0708f) {
        this.f46077a = j10;
        this.f46078b = str;
        this.f46079c = aVar;
        this.f46080d = cVar;
        this.f46081e = abstractC0707d;
        this.f46082f = abstractC0708f;
    }
}
