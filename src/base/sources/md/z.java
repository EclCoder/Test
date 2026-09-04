package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class z extends h0.f.d.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46196b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46198b;

        b() {
        }

        @Override // md.h0.f.d.e.b.a
        public h0.f.d.e.b a() {
            String str;
            String str2 = this.f46197a;
            if (str2 != null && (str = this.f46198b) != null) {
                return new z(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46197a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f46198b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.e.b.a
        public h0.f.d.e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f46197a = str;
            return this;
        }

        @Override // md.h0.f.d.e.b.a
        public h0.f.d.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f46198b = str;
            return this;
        }
    }

    @Override // md.h0.f.d.e.b
    public String b() {
        return this.f46195a;
    }

    @Override // md.h0.f.d.e.b
    public String c() {
        return this.f46196b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.e.b) {
            h0.f.d.e.b bVar = (h0.f.d.e.b) obj;
            if (this.f46195a.equals(bVar.b()) && this.f46196b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f46195a.hashCode() ^ 1000003) * 1000003) ^ this.f46196b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f46195a + ", variantId=" + this.f46196b + "}";
    }

    private z(String str, String str2) {
        this.f46195a = str;
        this.f46196b = str2;
    }
}
