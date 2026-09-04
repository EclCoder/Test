package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e extends h0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45986b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f45987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45988b;

        b() {
        }

        @Override // md.h0.c.a
        public h0.c a() {
            String str;
            String str2 = this.f45987a;
            if (str2 != null && (str = this.f45988b) != null) {
                return new e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f45987a == null) {
                sb2.append(" key");
            }
            if (this.f45988b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.c.a
        public h0.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f45987a = str;
            return this;
        }

        @Override // md.h0.c.a
        public h0.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f45988b = str;
            return this;
        }
    }

    @Override // md.h0.c
    public String b() {
        return this.f45985a;
    }

    @Override // md.h0.c
    public String c() {
        return this.f45986b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.c) {
            h0.c cVar = (h0.c) obj;
            if (this.f45985a.equals(cVar.b()) && this.f45986b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f45985a.hashCode() ^ 1000003) * 1000003) ^ this.f45986b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f45985a + ", value=" + this.f45986b + "}";
    }

    private e(String str, String str2) {
        this.f45985a = str;
        this.f45986b = str2;
    }
}
