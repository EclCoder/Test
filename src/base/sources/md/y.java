package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class y extends h0.f.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.f.d.e.b f46186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f46189d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h0.f.d.e.b f46190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f46193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f46194e;

        b() {
        }

        @Override // md.h0.f.d.e.a
        public h0.f.d.e a() {
            h0.f.d.e.b bVar;
            String str;
            String str2;
            if (this.f46194e == 1 && (bVar = this.f46190a) != null && (str = this.f46191b) != null && (str2 = this.f46192c) != null) {
                return new y(bVar, str, str2, this.f46193d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46190a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f46191b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f46192c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f46194e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.e.a
        public h0.f.d.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f46191b = str;
            return this;
        }

        @Override // md.h0.f.d.e.a
        public h0.f.d.e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f46192c = str;
            return this;
        }

        @Override // md.h0.f.d.e.a
        public h0.f.d.e.a d(h0.f.d.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f46190a = bVar;
            return this;
        }

        @Override // md.h0.f.d.e.a
        public h0.f.d.e.a e(long j10) {
            this.f46193d = j10;
            this.f46194e = (byte) (this.f46194e | 1);
            return this;
        }
    }

    @Override // md.h0.f.d.e
    public String b() {
        return this.f46187b;
    }

    @Override // md.h0.f.d.e
    public String c() {
        return this.f46188c;
    }

    @Override // md.h0.f.d.e
    public h0.f.d.e.b d() {
        return this.f46186a;
    }

    @Override // md.h0.f.d.e
    public long e() {
        return this.f46189d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.e) {
            h0.f.d.e eVar = (h0.f.d.e) obj;
            if (this.f46186a.equals(eVar.d()) && this.f46187b.equals(eVar.b()) && this.f46188c.equals(eVar.c()) && this.f46189d == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f46186a.hashCode() ^ 1000003) * 1000003) ^ this.f46187b.hashCode()) * 1000003) ^ this.f46188c.hashCode()) * 1000003;
        long j10 = this.f46189d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f46186a + ", parameterKey=" + this.f46187b + ", parameterValue=" + this.f46188c + ", templateVersion=" + this.f46189d + "}";
    }

    private y(h0.f.d.e.b bVar, String str, String str2, long j10) {
        this.f46186a = bVar;
        this.f46187b = str;
        this.f46188c = str2;
        this.f46189d = j10;
    }
}
