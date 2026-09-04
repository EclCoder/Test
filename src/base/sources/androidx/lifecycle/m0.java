package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f4438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.j f4439b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4440r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f4442t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, kl.f fVar) {
            super(2, fVar);
            this.f4442t = obj;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m0.this.new a(this.f4442t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f4440r;
            if (i10 == 0) {
                fl.s.b(obj);
                h hVarA = m0.this.a();
                this.f4440r = 1;
                if (hVarA.v(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            m0.this.a().q(this.f4442t);
            return fl.g0.f38750a;
        }
    }

    public m0(h target, kl.j context) {
        kotlin.jvm.internal.s.h(target, "target");
        kotlin.jvm.internal.s.h(context, "context");
        this.f4438a = target;
        this.f4439b = context.plus(em.c1.c().X0());
    }

    public final h a() {
        return this.f4438a;
    }

    @Override // androidx.lifecycle.l0
    public Object emit(Object obj, kl.f fVar) {
        Object objJ = em.i.j(this.f4439b, new a(obj, null), fVar);
        return objJ == ll.b.f() ? objJ : fl.g0.f38750a;
    }
}
