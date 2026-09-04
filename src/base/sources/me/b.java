package me;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f46208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f46210f;

    /* JADX INFO: renamed from: me.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0711b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f46214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f46215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f46216f;

        C0711b() {
        }

        @Override // me.d.a
        public d a() {
            if (this.f46216f == 1 && this.f46211a != null && this.f46212b != null && this.f46213c != null && this.f46214d != null) {
                return new b(this.f46211a, this.f46212b, this.f46213c, this.f46214d, this.f46215e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46211a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f46212b == null) {
                sb2.append(" variantId");
            }
            if (this.f46213c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f46214d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f46216f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // me.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f46213c = str;
            return this;
        }

        @Override // me.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f46214d = str;
            return this;
        }

        @Override // me.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f46211a = str;
            return this;
        }

        @Override // me.d.a
        public d.a e(long j10) {
            this.f46215e = j10;
            this.f46216f = (byte) (this.f46216f | 1);
            return this;
        }

        @Override // me.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f46212b = str;
            return this;
        }
    }

    @Override // me.d
    public String b() {
        return this.f46208d;
    }

    @Override // me.d
    public String c() {
        return this.f46209e;
    }

    @Override // me.d
    public String d() {
        return this.f46206b;
    }

    @Override // me.d
    public long e() {
        return this.f46210f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f46206b.equals(dVar.d()) && this.f46207c.equals(dVar.f()) && this.f46208d.equals(dVar.b()) && this.f46209e.equals(dVar.c()) && this.f46210f == dVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // me.d
    public String f() {
        return this.f46207c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f46206b.hashCode() ^ 1000003) * 1000003) ^ this.f46207c.hashCode()) * 1000003) ^ this.f46208d.hashCode()) * 1000003) ^ this.f46209e.hashCode()) * 1000003;
        long j10 = this.f46210f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f46206b + ", variantId=" + this.f46207c + ", parameterKey=" + this.f46208d + ", parameterValue=" + this.f46209e + ", templateVersion=" + this.f46210f + "}";
    }

    private b(String str, String str2, String str3, String str4, long j10) {
        this.f46206b = str;
        this.f46207c = str2;
        this.f46208d = str3;
        this.f46209e = str4;
        this.f46210f = j10;
    }
}
