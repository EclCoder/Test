package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d extends h0.a.AbstractC0693a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45978c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.a.AbstractC0693a.AbstractC0694a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f45979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f45981c;

        b() {
        }

        @Override // md.h0.a.AbstractC0693a.AbstractC0694a
        public h0.a.AbstractC0693a a() {
            String str;
            String str2;
            String str3 = this.f45979a;
            if (str3 != null && (str = this.f45980b) != null && (str2 = this.f45981c) != null) {
                return new d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f45979a == null) {
                sb2.append(" arch");
            }
            if (this.f45980b == null) {
                sb2.append(" libraryName");
            }
            if (this.f45981c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.a.AbstractC0693a.AbstractC0694a
        public h0.a.AbstractC0693a.AbstractC0694a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f45979a = str;
            return this;
        }

        @Override // md.h0.a.AbstractC0693a.AbstractC0694a
        public h0.a.AbstractC0693a.AbstractC0694a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f45981c = str;
            return this;
        }

        @Override // md.h0.a.AbstractC0693a.AbstractC0694a
        public h0.a.AbstractC0693a.AbstractC0694a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f45980b = str;
            return this;
        }
    }

    @Override // md.h0.a.AbstractC0693a
    public String b() {
        return this.f45976a;
    }

    @Override // md.h0.a.AbstractC0693a
    public String c() {
        return this.f45978c;
    }

    @Override // md.h0.a.AbstractC0693a
    public String d() {
        return this.f45977b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.a.AbstractC0693a) {
            h0.a.AbstractC0693a abstractC0693a = (h0.a.AbstractC0693a) obj;
            if (this.f45976a.equals(abstractC0693a.b()) && this.f45977b.equals(abstractC0693a.d()) && this.f45978c.equals(abstractC0693a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f45976a.hashCode() ^ 1000003) * 1000003) ^ this.f45977b.hashCode()) * 1000003) ^ this.f45978c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f45976a + ", libraryName=" + this.f45977b + ", buildId=" + this.f45978c + "}";
    }

    private d(String str, String str2, String str3) {
        this.f45976a = str;
        this.f45977b = str2;
        this.f45978c = str3;
    }
}
