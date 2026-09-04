package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d2 extends jm.o implements e1, u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e2 f37975d;

    @Override // em.u1
    public j2 b() {
        return null;
    }

    @Override // em.e1
    public void d() {
        u().B0(this);
    }

    @Override // em.u1
    public boolean isActive() {
        return true;
    }

    @Override // jm.o
    public String toString() {
        return s0.a(this) + '@' + s0.b(this) + "[job@" + s0.b(u()) + ']';
    }

    public final e2 u() {
        e2 e2Var = this.f37975d;
        if (e2Var != null) {
            return e2Var;
        }
        kotlin.jvm.internal.s.w("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th2);

    public final void x(e2 e2Var) {
        this.f37975d = e2Var;
    }
}
