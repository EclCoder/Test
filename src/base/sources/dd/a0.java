package dd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f36614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f36615b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private @interface a {
    }

    public a0(Class cls, Class cls2) {
        this.f36614a = cls;
        this.f36615b = cls2;
    }

    public static a0 a(Class cls, Class cls2) {
        return new a0(cls, cls2);
    }

    public static a0 b(Class cls) {
        return new a0(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f36615b.equals(a0Var.f36615b)) {
            return this.f36614a.equals(a0Var.f36614a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f36615b.hashCode() * 31) + this.f36614a.hashCode();
    }

    public String toString() {
        if (this.f36614a == a.class) {
            return this.f36615b.getName();
        }
        return "@" + this.f36614a.getName() + " " + this.f36615b.getName();
    }
}
