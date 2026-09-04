package je;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f42433a;

    a(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f42433a = set;
    }

    @Override // je.b
    public Set b() {
        return this.f42433a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f42433a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f42433a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f42433a + "}";
    }
}
