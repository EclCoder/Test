package q8;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50436b;

    public j(String adUnitId, String placementId) {
        s.h(adUnitId, "adUnitId");
        s.h(placementId, "placementId");
        this.f50435a = adUnitId;
        this.f50436b = placementId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.c(this.f50435a, jVar.f50435a) && s.c(this.f50436b, jVar.f50436b);
    }

    public int hashCode() {
        return (this.f50435a.hashCode() * 31) + this.f50436b.hashCode();
    }

    public String toString() {
        return "MintegralSlotIdentifier(adUnitId=" + this.f50435a + ", placementId=" + this.f50436b + ")";
    }
}
