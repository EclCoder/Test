package jd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c extends s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42257c;

    c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f42255a = str;
        this.f42256b = str2;
        this.f42257c = str3;
    }

    @Override // jd.s0.a
    public String c() {
        return this.f42255a;
    }

    @Override // jd.s0.a
    public String d() {
        return this.f42257c;
    }

    @Override // jd.s0.a
    public String e() {
        return this.f42256b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0.a) {
            s0.a aVar = (s0.a) obj;
            if (this.f42255a.equals(aVar.c()) && ((str = this.f42256b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.f42257c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f42255a.hashCode() ^ 1000003) * 1000003;
        String str = this.f42256b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f42257c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f42255a + ", firebaseInstallationId=" + this.f42256b + ", firebaseAuthenticationToken=" + this.f42257c + "}";
    }
}
