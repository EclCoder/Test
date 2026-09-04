package va;

import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55332c;

    public e(String str, String str2, String str3) {
        this.f55330a = str;
        this.f55331b = str2;
        this.f55332c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (r0.c(this.f55330a, eVar.f55330a) && r0.c(this.f55331b, eVar.f55331b) && r0.c(this.f55332c, eVar.f55332c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f55330a.hashCode() * 31;
        String str = this.f55331b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55332c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
