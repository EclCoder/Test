package dd;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface d {
    default Object a(Class cls) {
        return e(a0.b(cls));
    }

    default Set b(Class cls) {
        return g(a0.b(cls));
    }

    ce.a c(a0 a0Var);

    ce.b d(a0 a0Var);

    default Object e(a0 a0Var) {
        ce.b bVarH = h(a0Var);
        if (bVarH == null) {
            return null;
        }
        return bVarH.get();
    }

    default ce.b f(Class cls) {
        return h(a0.b(cls));
    }

    default Set g(a0 a0Var) {
        return (Set) d(a0Var).get();
    }

    ce.b h(a0 a0Var);

    default ce.a i(Class cls) {
        return c(a0.b(cls));
    }
}
