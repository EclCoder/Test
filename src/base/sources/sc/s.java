package sc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s extends m {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f52310a;

    s(Object obj) {
        this.f52310a = obj;
    }

    @Override // sc.m
    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f52310a.equals(((s) obj).f52310a);
        }
        return false;
    }

    @Override // sc.m
    public Object g() {
        return this.f52310a;
    }

    @Override // sc.m
    public boolean h() {
        return true;
    }

    @Override // sc.m
    public int hashCode() {
        return this.f52310a.hashCode() + 1502476572;
    }

    @Override // sc.m
    public Object j(x xVar) {
        p.o(xVar);
        return this.f52310a;
    }

    @Override // sc.m
    public Object k() {
        return this.f52310a;
    }

    public String toString() {
        return "Optional.of(" + this.f52310a + ")";
    }
}
