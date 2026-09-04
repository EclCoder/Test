package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends e2 implements z1, kl.f, o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kl.j f37957c;

    public a(kl.j jVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            h0((z1) jVar.get(z1.f38078x2));
        }
        this.f37957c = jVar.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // em.e2
    public String L() {
        return s0.a(this) + " was cancelled";
    }

    protected void Q0(Object obj) {
        D(obj);
    }

    public final void T0(q0 q0Var, Object obj, tl.o oVar) {
        q0Var.e(oVar, obj, this);
    }

    @Override // em.e2
    public final void f0(Throwable th2) {
        m0.a(this.f37957c, th2);
    }

    @Override // kl.f
    public final kl.j getContext() {
        return this.f37957c;
    }

    @Override // em.o0
    public kl.j i0() {
        return this.f37957c;
    }

    @Override // em.e2, em.z1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kl.f
    public final void resumeWith(Object obj) {
        Object objR0 = r0(e0.b(obj));
        if (objR0 == f2.f37998b) {
            return;
        }
        Q0(objR0);
    }

    @Override // em.e2
    public String s0() {
        String strG = i0.g(this.f37957c);
        if (strG == null) {
            return super.s0();
        }
        return '\"' + strG + "\":" + super.s0();
    }

    @Override // em.e2
    protected final void x0(Object obj) {
        if (!(obj instanceof d0)) {
            S0(obj);
        } else {
            d0 d0Var = (d0) obj;
            R0(d0Var.f37973a, d0Var.a());
        }
    }

    protected void S0(Object obj) {
    }

    protected void R0(Throwable th2, boolean z10) {
    }
}
