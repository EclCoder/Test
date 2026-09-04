package ee;

import com.android.vending.billing.fTvD.qEagQqzJZsd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f37695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f37696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f37698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f37699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f37700h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f37701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f37702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f37703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f37704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f37705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f37706f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f37707g;

        @Override // ee.d.a
        public d a() {
            String str = "";
            if (this.f37702b == null) {
                str = " registrationStatus";
            }
            if (this.f37705e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f37706f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f37701a, this.f37702b, this.f37703c, this.f37704d, this.f37705e.longValue(), this.f37706f.longValue(), this.f37707g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ee.d.a
        public d.a b(String str) {
            this.f37703c = str;
            return this;
        }

        @Override // ee.d.a
        public d.a c(long j10) {
            this.f37705e = Long.valueOf(j10);
            return this;
        }

        @Override // ee.d.a
        public d.a d(String str) {
            this.f37701a = str;
            return this;
        }

        @Override // ee.d.a
        public d.a e(String str) {
            this.f37707g = str;
            return this;
        }

        @Override // ee.d.a
        public d.a f(String str) {
            this.f37704d = str;
            return this;
        }

        @Override // ee.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f37702b = aVar;
            return this;
        }

        @Override // ee.d.a
        public d.a h(long j10) {
            this.f37706f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f37701a = dVar.d();
            this.f37702b = dVar.g();
            this.f37703c = dVar.b();
            this.f37704d = dVar.f();
            this.f37705e = Long.valueOf(dVar.c());
            this.f37706f = Long.valueOf(dVar.h());
            this.f37707g = dVar.e();
        }
    }

    @Override // ee.d
    public String b() {
        return this.f37696d;
    }

    @Override // ee.d
    public long c() {
        return this.f37698f;
    }

    @Override // ee.d
    public String d() {
        return this.f37694b;
    }

    @Override // ee.d
    public String e() {
        return this.f37700h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f37694b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f37695c.equals(dVar.g()) && ((str = this.f37696d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f37697e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f37698f == dVar.c() && this.f37699g == dVar.h() && ((str3 = this.f37700h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ee.d
    public String f() {
        return this.f37697e;
    }

    @Override // ee.d
    public c.a g() {
        return this.f37695c;
    }

    @Override // ee.d
    public long h() {
        return this.f37699g;
    }

    public int hashCode() {
        String str = this.f37694b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f37695c.hashCode()) * 1000003;
        String str2 = this.f37696d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f37697e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f37698f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f37699g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f37700h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // ee.d
    public d.a n() {
        return new b(this);
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f37694b = str;
        this.f37695c = aVar;
        this.f37696d = str2;
        this.f37697e = str3;
        this.f37698f = j10;
        this.f37699g = j11;
        this.f37700h = str4;
    }

    public String toString() {
        return qEagQqzJZsd.mtxIMZxsemroRw + this.f37694b + ", registrationStatus=" + this.f37695c + ", authToken=" + this.f37696d + ", refreshToken=" + this.f37697e + ", expiresInSecs=" + this.f37698f + ", tokenCreationEpochInSecs=" + this.f37699g + ", fisError=" + this.f37700h + "}";
    }
}
