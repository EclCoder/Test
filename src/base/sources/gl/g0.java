package gl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f39327b;

    public g0(int i10, Object obj) {
        this.f39326a = i10;
        this.f39327b = obj;
    }

    public final int a() {
        return this.f39326a;
    }

    public final Object b() {
        return this.f39327b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f39326a == g0Var.f39326a && kotlin.jvm.internal.s.c(this.f39327b, g0Var.f39327b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f39326a) * 31;
        Object obj = this.f39327b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f39326a + ", value=" + this.f39327b + ')';
    }
}
