package b9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8575a;

    d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f8575a = list;
    }

    @Override // b9.n
    public List c() {
        return this.f8575a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f8575a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f8575a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f8575a + "}";
    }
}
