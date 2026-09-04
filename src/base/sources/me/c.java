package me;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f46217a;

    c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f46217a = set;
    }

    @Override // me.e
    public Set b() {
        return this.f46217a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f46217a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f46217a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f46217a + "}";
    }
}
