package em;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 extends kl.a implements kl.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38025b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends kl.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0 d(kl.j.b bVar) {
            if (bVar instanceof k0) {
                return (k0) bVar;
            }
            return null;
        }

        private a() {
            super(kl.g.f43529z2, new Function1() { // from class: em.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k0.a.d((kl.j.b) obj);
                }
            });
        }
    }

    public k0() {
        super(kl.g.f43529z2);
    }

    public static /* synthetic */ k0 W0(k0 k0Var, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return k0Var.V0(i10, str);
    }

    public abstract void T0(kl.j jVar, Runnable runnable);

    public boolean U0(kl.j jVar) {
        return true;
    }

    public k0 V0(int i10, String str) {
        jm.l.a(i10);
        return new jm.k(this, i10, str);
    }

    @Override // kl.g
    public final void d0(kl.f fVar) {
        kotlin.jvm.internal.s.f(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((jm.h) fVar).s();
    }

    @Override // kl.g
    public final kl.f g0(kl.f fVar) {
        return new jm.h(this, fVar);
    }

    @Override // kl.a, kl.j.b, kl.j
    public /* bridge */ kl.j.b get(kl.j.c cVar) {
        return kl.g.a.a(this, cVar);
    }

    @Override // kl.a, kl.j
    public /* bridge */ kl.j minusKey(kl.j.c cVar) {
        return kl.g.a.b(this, cVar);
    }

    public String toString() {
        return s0.a(this) + '@' + s0.b(this);
    }
}
