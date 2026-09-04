package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends d implements n {
    private final int arity;

    public m(int i10, kl.f fVar) {
        super(fVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strI = l0.i(this);
        s.g(strI, "renderLambdaToString(...)");
        return strI;
    }
}
