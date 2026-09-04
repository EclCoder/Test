package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e0 extends i0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f45992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f45993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gd.f f45994f;

    e0(String str, String str2, String str3, String str4, int i10, gd.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f45989a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f45990b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f45991c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f45992d = str4;
        this.f45993e = i10;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f45994f = fVar;
    }

    @Override // md.i0.a
    public String a() {
        return this.f45989a;
    }

    @Override // md.i0.a
    public int c() {
        return this.f45993e;
    }

    @Override // md.i0.a
    public gd.f d() {
        return this.f45994f;
    }

    @Override // md.i0.a
    public String e() {
        return this.f45992d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0.a) {
            i0.a aVar = (i0.a) obj;
            if (this.f45989a.equals(aVar.a()) && this.f45990b.equals(aVar.f()) && this.f45991c.equals(aVar.g()) && this.f45992d.equals(aVar.e()) && this.f45993e == aVar.c() && this.f45994f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // md.i0.a
    public String f() {
        return this.f45990b;
    }

    @Override // md.i0.a
    public String g() {
        return this.f45991c;
    }

    public int hashCode() {
        return ((((((((((this.f45989a.hashCode() ^ 1000003) * 1000003) ^ this.f45990b.hashCode()) * 1000003) ^ this.f45991c.hashCode()) * 1000003) ^ this.f45992d.hashCode()) * 1000003) ^ this.f45993e) * 1000003) ^ this.f45994f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f45989a + ", versionCode=" + this.f45990b + ", versionName=" + this.f45991c + ", installUuid=" + this.f45992d + ", deliveryMechanism=" + this.f45993e + ", developmentPlatformProvider=" + this.f45994f + "}";
    }
}
