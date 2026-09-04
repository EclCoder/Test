package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f1 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f37996a;

    public f1(e1 e1Var) {
        this.f37996a = e1Var;
    }

    @Override // em.n
    public void a(Throwable th2) {
        this.f37996a.d();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f37996a + ']';
    }
}
