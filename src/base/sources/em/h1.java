package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h1 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38011a;

    public h1(boolean z10) {
        this.f38011a = z10;
    }

    @Override // em.u1
    public j2 b() {
        return null;
    }

    @Override // em.u1
    public boolean isActive() {
        return this.f38011a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
