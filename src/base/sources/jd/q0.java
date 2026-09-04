package jd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42371b;

    public q0(String str, String str2) {
        this.f42370a = str;
        this.f42371b = str2;
    }

    public final String a() {
        return this.f42371b;
    }

    public final String b() {
        return this.f42370a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.s.c(this.f42370a, q0Var.f42370a) && kotlin.jvm.internal.s.c(this.f42371b, q0Var.f42371b);
    }

    public int hashCode() {
        String str = this.f42370a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f42371b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f42370a + ", authToken=" + this.f42371b + ')';
    }
}
