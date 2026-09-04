package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends jm.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal f37961e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public b3(kl.j jVar, kl.f fVar) {
        c3 c3Var = c3.f37970a;
        super(jVar.get(c3Var) == null ? jVar.plus(c3Var) : jVar, fVar);
        this.f37961e = new ThreadLocal();
        if (fVar.getContext().get(kl.g.f43529z2) instanceof k0) {
            return;
        }
        Object objI = jm.k0.i(jVar, null);
        jm.k0.f(jVar, objI);
        X0(jVar, objI);
    }

    private final void W0() {
        if (this.threadLocalIsSet) {
            fl.q qVar = (fl.q) this.f37961e.get();
            if (qVar != null) {
                jm.k0.f((kl.j) qVar.d(), qVar.g());
            }
            this.f37961e.remove();
        }
    }

    @Override // jm.z, em.a
    protected void Q0(Object obj) {
        W0();
        Object objA = e0.a(obj, this.f42693d);
        kl.f fVar = this.f42693d;
        kl.j context = fVar.getContext();
        Object objI = jm.k0.i(context, null);
        b3 b3VarM = objI != jm.k0.f42663a ? i0.m(fVar, context, objI) : null;
        try {
            this.f42693d.resumeWith(objA);
            fl.g0 g0Var = fl.g0.f38750a;
        } finally {
            if (b3VarM == null || b3VarM.V0()) {
                jm.k0.f(context, objI);
            }
        }
    }

    @Override // jm.z
    public void U0() {
        W0();
    }

    public final boolean V0() {
        boolean z10 = this.threadLocalIsSet && this.f37961e.get() == null;
        this.f37961e.remove();
        return !z10;
    }

    public final void X0(kl.j jVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f37961e.set(fl.w.a(jVar, obj));
    }
}
