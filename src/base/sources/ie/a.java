package ie;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41326b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f41325a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f41326b = str2;
    }

    @Override // ie.f
    public String b() {
        return this.f41325a;
    }

    @Override // ie.f
    public String c() {
        return this.f41326b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f41325a.equals(fVar.b()) && this.f41326b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f41325a.hashCode() ^ 1000003) * 1000003) ^ this.f41326b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f41325a + ", version=" + this.f41326b + "}";
    }
}
