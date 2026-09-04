package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f45925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f45926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f45927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f45928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f45929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h0.f f45930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h0.d f45931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h0.a f45932m;

    /* JADX INFO: renamed from: md.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0692b extends h0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f45933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f45935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f45936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f45937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f45938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f45939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f45940h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f45941i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private h0.f f45942j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private h0.d f45943k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private h0.a f45944l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f45945m;

        @Override // md.h0.b
        public h0 a() {
            if (this.f45945m == 1 && this.f45933a != null && this.f45934b != null && this.f45936d != null && this.f45940h != null && this.f45941i != null) {
                return new b(this.f45933a, this.f45934b, this.f45935c, this.f45936d, this.f45937e, this.f45938f, this.f45939g, this.f45940h, this.f45941i, this.f45942j, this.f45943k, this.f45944l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f45933a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f45934b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f45945m) == 0) {
                sb2.append(" platform");
            }
            if (this.f45936d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f45940h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f45941i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.b
        public h0.b b(h0.a aVar) {
            this.f45944l = aVar;
            return this;
        }

        @Override // md.h0.b
        public h0.b c(String str) {
            this.f45939g = str;
            return this;
        }

        @Override // md.h0.b
        public h0.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f45940h = str;
            return this;
        }

        @Override // md.h0.b
        public h0.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f45941i = str;
            return this;
        }

        @Override // md.h0.b
        public h0.b f(String str) {
            this.f45938f = str;
            return this;
        }

        @Override // md.h0.b
        public h0.b g(String str) {
            this.f45937e = str;
            return this;
        }

        @Override // md.h0.b
        public h0.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f45934b = str;
            return this;
        }

        @Override // md.h0.b
        public h0.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f45936d = str;
            return this;
        }

        @Override // md.h0.b
        public h0.b j(h0.d dVar) {
            this.f45943k = dVar;
            return this;
        }

        @Override // md.h0.b
        public h0.b k(int i10) {
            this.f45935c = i10;
            this.f45945m = (byte) (this.f45945m | 1);
            return this;
        }

        @Override // md.h0.b
        public h0.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f45933a = str;
            return this;
        }

        @Override // md.h0.b
        public h0.b m(h0.f fVar) {
            this.f45942j = fVar;
            return this;
        }

        C0692b() {
        }

        private C0692b(h0 h0Var) {
            this.f45933a = h0Var.m();
            this.f45934b = h0Var.i();
            this.f45935c = h0Var.l();
            this.f45936d = h0Var.j();
            this.f45937e = h0Var.h();
            this.f45938f = h0Var.g();
            this.f45939g = h0Var.d();
            this.f45940h = h0Var.e();
            this.f45941i = h0Var.f();
            this.f45942j = h0Var.n();
            this.f45943k = h0Var.k();
            this.f45944l = h0Var.c();
            this.f45945m = (byte) 1;
        }
    }

    @Override // md.h0
    public h0.a c() {
        return this.f45932m;
    }

    @Override // md.h0
    public String d() {
        return this.f45927h;
    }

    @Override // md.h0
    public String e() {
        return this.f45928i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        h0.f fVar;
        h0.d dVar;
        h0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (this.f45921b.equals(h0Var.m()) && this.f45922c.equals(h0Var.i()) && this.f45923d == h0Var.l() && this.f45924e.equals(h0Var.j()) && ((str = this.f45925f) != null ? str.equals(h0Var.h()) : h0Var.h() == null) && ((str2 = this.f45926g) != null ? str2.equals(h0Var.g()) : h0Var.g() == null) && ((str3 = this.f45927h) != null ? str3.equals(h0Var.d()) : h0Var.d() == null) && this.f45928i.equals(h0Var.e()) && this.f45929j.equals(h0Var.f()) && ((fVar = this.f45930k) != null ? fVar.equals(h0Var.n()) : h0Var.n() == null) && ((dVar = this.f45931l) != null ? dVar.equals(h0Var.k()) : h0Var.k() == null) && ((aVar = this.f45932m) != null ? aVar.equals(h0Var.c()) : h0Var.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // md.h0
    public String f() {
        return this.f45929j;
    }

    @Override // md.h0
    public String g() {
        return this.f45926g;
    }

    @Override // md.h0
    public String h() {
        return this.f45925f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f45921b.hashCode() ^ 1000003) * 1000003) ^ this.f45922c.hashCode()) * 1000003) ^ this.f45923d) * 1000003) ^ this.f45924e.hashCode()) * 1000003;
        String str = this.f45925f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f45926g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f45927h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f45928i.hashCode()) * 1000003) ^ this.f45929j.hashCode()) * 1000003;
        h0.f fVar = this.f45930k;
        int iHashCode5 = (iHashCode4 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        h0.d dVar = this.f45931l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        h0.a aVar = this.f45932m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // md.h0
    public String i() {
        return this.f45922c;
    }

    @Override // md.h0
    public String j() {
        return this.f45924e;
    }

    @Override // md.h0
    public h0.d k() {
        return this.f45931l;
    }

    @Override // md.h0
    public int l() {
        return this.f45923d;
    }

    @Override // md.h0
    public String m() {
        return this.f45921b;
    }

    @Override // md.h0
    public h0.f n() {
        return this.f45930k;
    }

    @Override // md.h0
    protected h0.b o() {
        return new C0692b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f45921b + ", gmpAppId=" + this.f45922c + ", platform=" + this.f45923d + ", installationUuid=" + this.f45924e + ", firebaseInstallationId=" + this.f45925f + ", firebaseAuthenticationToken=" + this.f45926g + ", appQualitySessionId=" + this.f45927h + ", buildVersion=" + this.f45928i + ", displayVersion=" + this.f45929j + ", session=" + this.f45930k + ", ndkPayload=" + this.f45931l + ", appExitInfo=" + this.f45932m + "}";
    }

    private b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, h0.f fVar, h0.d dVar, h0.a aVar) {
        this.f45921b = str;
        this.f45922c = str2;
        this.f45923d = i10;
        this.f45924e = str3;
        this.f45925f = str4;
        this.f45926g = str5;
        this.f45927h = str6;
        this.f45928i = str7;
        this.f45929j = str8;
        this.f45930k = fVar;
        this.f45931l = dVar;
        this.f45932m = aVar;
    }
}
