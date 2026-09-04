package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f47103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f47104f;

    public b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, u logEnvironment, a androidAppInfo) {
        kotlin.jvm.internal.s.h(appId, "appId");
        kotlin.jvm.internal.s.h(deviceModel, "deviceModel");
        kotlin.jvm.internal.s.h(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.s.h(osVersion, "osVersion");
        kotlin.jvm.internal.s.h(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.s.h(androidAppInfo, "androidAppInfo");
        this.f47099a = appId;
        this.f47100b = deviceModel;
        this.f47101c = sessionSdkVersion;
        this.f47102d = osVersion;
        this.f47103e = logEnvironment;
        this.f47104f = androidAppInfo;
    }

    public final a a() {
        return this.f47104f;
    }

    public final String b() {
        return this.f47099a;
    }

    public final String c() {
        return this.f47100b;
    }

    public final u d() {
        return this.f47103e;
    }

    public final String e() {
        return this.f47102d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.s.c(this.f47099a, bVar.f47099a) && kotlin.jvm.internal.s.c(this.f47100b, bVar.f47100b) && kotlin.jvm.internal.s.c(this.f47101c, bVar.f47101c) && kotlin.jvm.internal.s.c(this.f47102d, bVar.f47102d) && this.f47103e == bVar.f47103e && kotlin.jvm.internal.s.c(this.f47104f, bVar.f47104f);
    }

    public final String f() {
        return this.f47101c;
    }

    public int hashCode() {
        return (((((((((this.f47099a.hashCode() * 31) + this.f47100b.hashCode()) * 31) + this.f47101c.hashCode()) * 31) + this.f47102d.hashCode()) * 31) + this.f47103e.hashCode()) * 31) + this.f47104f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f47099a + ", deviceModel=" + this.f47100b + ", sessionSdkVersion=" + this.f47101c + ", osVersion=" + this.f47102d + ", logEnvironment=" + this.f47103e + ", androidAppInfo=" + this.f47104f + ')';
    }
}
