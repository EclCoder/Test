package ne;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f47090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f47091f;

    public a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, c0 currentProcessDetails, List appProcessDetails) {
        kotlin.jvm.internal.s.h(packageName, "packageName");
        kotlin.jvm.internal.s.h(versionName, "versionName");
        kotlin.jvm.internal.s.h(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.s.h(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.s.h(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.s.h(appProcessDetails, "appProcessDetails");
        this.f47086a = packageName;
        this.f47087b = versionName;
        this.f47088c = appBuildVersion;
        this.f47089d = deviceManufacturer;
        this.f47090e = currentProcessDetails;
        this.f47091f = appProcessDetails;
    }

    public final String a() {
        return this.f47088c;
    }

    public final List b() {
        return this.f47091f;
    }

    public final c0 c() {
        return this.f47090e;
    }

    public final String d() {
        return this.f47089d;
    }

    public final String e() {
        return this.f47086a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.s.c(this.f47086a, aVar.f47086a) && kotlin.jvm.internal.s.c(this.f47087b, aVar.f47087b) && kotlin.jvm.internal.s.c(this.f47088c, aVar.f47088c) && kotlin.jvm.internal.s.c(this.f47089d, aVar.f47089d) && kotlin.jvm.internal.s.c(this.f47090e, aVar.f47090e) && kotlin.jvm.internal.s.c(this.f47091f, aVar.f47091f);
    }

    public final String f() {
        return this.f47087b;
    }

    public int hashCode() {
        return (((((((((this.f47086a.hashCode() * 31) + this.f47087b.hashCode()) * 31) + this.f47088c.hashCode()) * 31) + this.f47089d.hashCode()) * 31) + this.f47090e.hashCode()) * 31) + this.f47091f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f47086a + ", versionName=" + this.f47087b + ", appBuildVersion=" + this.f47088c + ", deviceManufacturer=" + this.f47089d + ", currentProcessDetails=" + this.f47090e + ", appProcessDetails=" + this.f47091f + ')';
    }
}
