package fe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f38469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f38470e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f38471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f38472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f38473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f38474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f38475e;

        b() {
        }

        @Override // fe.d.a
        public d a() {
            return new a(this.f38471a, this.f38472b, this.f38473c, this.f38474d, this.f38475e);
        }

        @Override // fe.d.a
        public d.a b(f fVar) {
            this.f38474d = fVar;
            return this;
        }

        @Override // fe.d.a
        public d.a c(String str) {
            this.f38472b = str;
            return this;
        }

        @Override // fe.d.a
        public d.a d(String str) {
            this.f38473c = str;
            return this;
        }

        @Override // fe.d.a
        public d.a e(d.b bVar) {
            this.f38475e = bVar;
            return this;
        }

        @Override // fe.d.a
        public d.a f(String str) {
            this.f38471a = str;
            return this;
        }
    }

    @Override // fe.d
    public f b() {
        return this.f38469d;
    }

    @Override // fe.d
    public String c() {
        return this.f38467b;
    }

    @Override // fe.d
    public String d() {
        return this.f38468c;
    }

    @Override // fe.d
    public d.b e() {
        return this.f38470e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f38466a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f38467b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f38468c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f38469d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f38470e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // fe.d
    public String f() {
        return this.f38466a;
    }

    public int hashCode() {
        String str = this.f38466a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f38467b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f38468c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f38469d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f38470e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f38466a + ", fid=" + this.f38467b + ", refreshToken=" + this.f38468c + ", authToken=" + this.f38469d + ", responseCode=" + this.f38470e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f38466a = str;
        this.f38467b = str2;
        this.f38468c = str3;
        this.f38469d = fVar;
        this.f38470e = bVar;
    }
}
