package z0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hm.w f58421a;

    public k() {
        l0 l0Var = l0.f58424b;
        kotlin.jvm.internal.s.f(l0Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f58421a = hm.k0.a(l0Var);
    }

    public final h0 a() {
        return (h0) this.f58421a.getValue();
    }

    public final hm.e b() {
        return this.f58421a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final h0 c(h0 newState) {
        Object value;
        h0 h0Var;
        kotlin.jvm.internal.s.h(newState, "newState");
        hm.w wVar = this.f58421a;
        do {
            value = wVar.getValue();
            h0Var = (h0) value;
            if (h0Var instanceof a0 ? true : kotlin.jvm.internal.s.c(h0Var, l0.f58424b)) {
                h0Var = newState;
            } else if (h0Var instanceof e) {
                if (newState.a() > h0Var.a()) {
                    h0Var = newState;
                }
            } else if (!(h0Var instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!wVar.c(value, h0Var));
        return h0Var;
    }
}
