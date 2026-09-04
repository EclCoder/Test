package sc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a f52277a = new a();
    private static final long serialVersionUID = 0;

    private a() {
    }

    static m l() {
        return f52277a;
    }

    private Object readResolve() {
        return f52277a;
    }

    @Override // sc.m
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // sc.m
    public Object g() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // sc.m
    public boolean h() {
        return false;
    }

    @Override // sc.m
    public int hashCode() {
        return 2040732332;
    }

    @Override // sc.m
    public Object j(x xVar) {
        return p.p(xVar.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // sc.m
    public Object k() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
