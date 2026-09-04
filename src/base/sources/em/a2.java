package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a2 extends e2 implements b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37959c;

    public a2(z1 z1Var) {
        super(true);
        h0(z1Var);
        this.f37959c = Q0();
    }

    private final boolean Q0() {
        e2 e2VarU;
        v vVarY = Y();
        w wVar = vVarY instanceof w ? (w) vVarY : null;
        if (wVar != null && (e2VarU = wVar.u()) != null) {
            while (!e2VarU.U()) {
                v vVarY2 = e2VarU.Y();
                w wVar2 = vVarY2 instanceof w ? (w) vVarY2 : null;
                if (wVar2 == null || (e2VarU = wVar2.u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // em.e2
    public boolean U() {
        return this.f37959c;
    }

    @Override // em.e2
    public boolean V() {
        return true;
    }
}
