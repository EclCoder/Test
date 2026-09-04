package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {
    public static final void a(o oVar, e1 e1Var) {
        c(oVar, new f1(e1Var));
    }

    public static final q b(kl.f fVar) {
        if (!(fVar instanceof jm.h)) {
            return new q(fVar, 1);
        }
        q qVarK = ((jm.h) fVar).k();
        if (qVarK != null) {
            if (!qVarK.R()) {
                qVarK = null;
            }
            if (qVarK != null) {
                return qVarK;
            }
        }
        return new q(fVar, 2);
    }

    public static final void c(o oVar, n nVar) {
        if (!(oVar instanceof q)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((q) oVar).K(nVar);
    }
}
