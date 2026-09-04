package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g0 extends i0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f46014c;

    g0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f46012a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f46013b = str2;
        this.f46014c = z10;
    }

    @Override // md.i0.c
    public boolean b() {
        return this.f46014c;
    }

    @Override // md.i0.c
    public String c() {
        return this.f46013b;
    }

    @Override // md.i0.c
    public String d() {
        return this.f46012a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0.c) {
            i0.c cVar = (i0.c) obj;
            if (this.f46012a.equals(cVar.d()) && this.f46013b.equals(cVar.c()) && this.f46014c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f46012a.hashCode() ^ 1000003) * 1000003) ^ this.f46013b.hashCode()) * 1000003) ^ (this.f46014c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f46012a + ", osCodeName=" + this.f46013b + ", isRooted=" + this.f46014c + "}";
    }
}
