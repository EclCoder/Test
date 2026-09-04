package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t implements n, Serializable {
    private final int arity;

    public t(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strJ = l0.j(this);
        s.g(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
