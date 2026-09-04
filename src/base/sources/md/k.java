package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k extends h0.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f46049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f46051f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.a.AbstractC0695a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f46055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f46056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f46057f;

        b() {
        }

        @Override // md.h0.f.a.AbstractC0695a
        public h0.f.a a() {
            String str;
            String str2 = this.f46052a;
            if (str2 != null && (str = this.f46053b) != null) {
                return new k(str2, str, this.f46054c, null, this.f46055d, this.f46056e, this.f46057f);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46052a == null) {
                sb2.append(" identifier");
            }
            if (this.f46053b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.a.AbstractC0695a
        public h0.f.a.AbstractC0695a b(String str) {
            this.f46056e = str;
            return this;
        }

        @Override // md.h0.f.a.AbstractC0695a
        public h0.f.a.AbstractC0695a c(String str) {
            this.f46057f = str;
            return this;
        }

        @Override // md.h0.f.a.AbstractC0695a
        public h0.f.a.AbstractC0695a d(String str) {
            this.f46054c = str;
            return this;
        }

        @Override // md.h0.f.a.AbstractC0695a
        public h0.f.a.AbstractC0695a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f46052a = str;
            return this;
        }

        @Override // md.h0.f.a.AbstractC0695a
        public h0.f.a.AbstractC0695a f(String str) {
            this.f46055d = str;
            return this;
        }

        @Override // md.h0.f.a.AbstractC0695a
        public h0.f.a.AbstractC0695a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f46053b = str;
            return this;
        }
    }

    @Override // md.h0.f.a
    public String b() {
        return this.f46050e;
    }

    @Override // md.h0.f.a
    public String c() {
        return this.f46051f;
    }

    @Override // md.h0.f.a
    public String d() {
        return this.f46048c;
    }

    @Override // md.h0.f.a
    public String e() {
        return this.f46046a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.a) {
            h0.f.a aVar = (h0.f.a) obj;
            if (this.f46046a.equals(aVar.e()) && this.f46047b.equals(aVar.h()) && ((str = this.f46048c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
                aVar.g();
                String str2 = this.f46049d;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f46050e;
                    if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                        String str4 = this.f46051f;
                        if (str4 != null ? str4.equals(aVar.c()) : aVar.c() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // md.h0.f.a
    public String f() {
        return this.f46049d;
    }

    @Override // md.h0.f.a
    public h0.f.a.b g() {
        return null;
    }

    @Override // md.h0.f.a
    public String h() {
        return this.f46047b;
    }

    public int hashCode() {
        int iHashCode = (((this.f46046a.hashCode() ^ 1000003) * 1000003) ^ this.f46047b.hashCode()) * 1000003;
        String str = this.f46048c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f46049d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f46050e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f46051f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f46046a + ", version=" + this.f46047b + ", displayVersion=" + this.f46048c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f46049d + ", developmentPlatform=" + this.f46050e + ", developmentPlatformVersion=" + this.f46051f + "}";
    }

    private k(String str, String str2, String str3, h0.f.a.b bVar, String str4, String str5, String str6) {
        this.f46046a = str;
        this.f46047b = str2;
        this.f46048c = str3;
        this.f46049d = str4;
        this.f46050e = str5;
        this.f46051f = str6;
    }
}
