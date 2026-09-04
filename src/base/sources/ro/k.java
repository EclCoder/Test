package ro;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f51433a;

    k(l lVar) {
        this.f51433a = lVar;
    }

    public boolean equals(Object obj) {
        l lVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            lVar = this.f51433a;
            obj = ((k) obj).f51433a;
        } else {
            lVar = this.f51433a;
        }
        return lVar.equals(obj);
    }

    public int hashCode() {
        return this.f51433a.hashCode();
    }
}
