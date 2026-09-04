package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i1 extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private gl.i f38015e;

    public static /* synthetic */ void Y0(i1 i1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        i1Var.X0(z10);
    }

    private final long Z0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void d1(i1 i1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        i1Var.c1(z10);
    }

    @Override // em.k0
    public final k0 V0(int i10, String str) {
        jm.l.a(i10);
        return jm.l.b(this, str);
    }

    public final void X0(boolean z10) {
        long jZ0 = this.f38013c - Z0(z10);
        this.f38013c = jZ0;
        if (jZ0 <= 0 && this.f38014d) {
            shutdown();
        }
    }

    public final void a1(a1 a1Var) {
        gl.i iVar = this.f38015e;
        if (iVar == null) {
            iVar = new gl.i();
            this.f38015e = iVar;
        }
        iVar.addLast(a1Var);
    }

    protected long b1() {
        gl.i iVar = this.f38015e;
        return (iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void c1(boolean z10) {
        this.f38013c += Z0(z10);
        if (z10) {
            return;
        }
        this.f38014d = true;
    }

    public final boolean e1() {
        return this.f38013c >= Z0(true);
    }

    public final boolean f1() {
        gl.i iVar = this.f38015e;
        if (iVar != null) {
            return iVar.isEmpty();
        }
        return true;
    }

    public abstract long g1();

    public final boolean h1() {
        a1 a1Var;
        gl.i iVar = this.f38015e;
        if (iVar == null || (a1Var = (a1) iVar.y()) == null) {
            return false;
        }
        a1Var.run();
        return true;
    }

    public abstract void shutdown();
}
