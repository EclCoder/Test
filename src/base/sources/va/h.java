package va;

import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55347e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f55343a = str;
        this.f55344b = str2;
        this.f55345c = str3;
        this.f55346d = str4;
        this.f55347e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return r0.c(this.f55343a, hVar.f55343a) && r0.c(this.f55344b, hVar.f55344b) && r0.c(this.f55345c, hVar.f55345c) && r0.c(this.f55346d, hVar.f55346d) && r0.c(this.f55347e, hVar.f55347e);
    }

    public int hashCode() {
        String str = this.f55343a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55344b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55345c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f55346d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f55347e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
