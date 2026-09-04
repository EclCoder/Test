package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class q2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f38052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f38053b;

    public q2(k0 k0Var, o oVar) {
        this.f38052a = k0Var;
        this.f38053b = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f38053b.u(this.f38052a, fl.g0.f38750a);
    }
}
