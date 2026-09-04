package tm;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f53573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f53574b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements tl.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zl.c f53576b;

        public a(zl.c cVar) {
            this.f53576b = cVar;
        }

        @Override // tl.a
        public final Object invoke() {
            return new m((pm.d) s.this.b().invoke(this.f53576b));
        }
    }

    public s(Function1 compute) {
        kotlin.jvm.internal.s.h(compute, "compute");
        this.f53573a = compute;
        this.f53574b = new u();
    }

    @Override // tm.r2
    public pm.d a(zl.c key) {
        kotlin.jvm.internal.s.h(key, "key");
        Object obj = this.f53574b.get(sl.a.a(key));
        kotlin.jvm.internal.s.g(obj, "get(...)");
        k1 k1Var = (k1) obj;
        Object objA = k1Var.f53528a.get();
        if (objA == null) {
            objA = k1Var.a(new a(key));
        }
        return ((m) objA).f53536a;
    }

    public final Function1 b() {
        return this.f53573a;
    }
}
