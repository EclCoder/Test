package bm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yl.f f9139b;

    public j(String value, yl.f range) {
        kotlin.jvm.internal.s.h(value, "value");
        kotlin.jvm.internal.s.h(range, "range");
        this.f9138a = value;
        this.f9139b = range;
    }

    public final String a() {
        return this.f9138a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.s.c(this.f9138a, jVar.f9138a) && kotlin.jvm.internal.s.c(this.f9139b, jVar.f9139b);
    }

    public int hashCode() {
        return (this.f9138a.hashCode() * 31) + this.f9139b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f9138a + ", range=" + this.f9139b + ')';
    }
}
