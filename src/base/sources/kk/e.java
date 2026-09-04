package kk;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class e extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43444a;

    e(List list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.f43444a = list;
    }

    @Override // kk.u
    public List d() {
        return this.f43444a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return this.f43444a.equals(((u) obj).d());
        }
        return false;
    }

    public int hashCode() {
        return this.f43444a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Tracestate{entries=" + this.f43444a + "}";
    }
}
