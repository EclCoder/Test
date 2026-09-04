package z0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nm.a f58214a = nm.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final em.y f58215b = em.a0.c(null, 1, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58216r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58217s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f58218t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f58220v;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58218t = obj;
            this.f58220v |= Integer.MIN_VALUE;
            return c0.this.c(this);
        }
    }

    public final Object a(kl.f fVar) {
        Object objN0 = this.f58215b.N0(fVar);
        return objN0 == ll.b.f() ? objN0 : fl.g0.f38750a;
    }

    protected abstract Object b(kl.f fVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(kl.f fVar) throws Throwable {
        a aVar;
        nm.a aVar2;
        c0 c0Var;
        nm.a aVar3;
        Throwable th2;
        c0 c0Var2;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f58220v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f58220v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f58218t;
        Object objF = ll.b.f();
        int i11 = aVar.f58220v;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                if (this.f58215b.h()) {
                    return fl.g0.f38750a;
                }
                aVar2 = this.f58214a;
                aVar.f58216r = this;
                aVar.f58217s = aVar2;
                aVar.f58220v = 1;
                if (aVar2.e(null, aVar) != objF) {
                    c0Var = this;
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (nm.a) aVar.f58217s;
                c0Var2 = (c0) aVar.f58216r;
                try {
                    fl.s.b(obj);
                    em.y yVar = c0Var2.f58215b;
                    fl.g0 g0Var = fl.g0.f38750a;
                    yVar.s(g0Var);
                    aVar3.f(null);
                    return g0Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.f(null);
                    throw th2;
                }
            }
            nm.a aVar4 = (nm.a) aVar.f58217s;
            c0Var = (c0) aVar.f58216r;
            fl.s.b(obj);
            aVar2 = aVar4;
            if (c0Var.f58215b.h()) {
                fl.g0 g0Var2 = fl.g0.f38750a;
                aVar2.f(null);
                return g0Var2;
            }
            aVar.f58216r = c0Var;
            aVar.f58217s = aVar2;
            aVar.f58220v = 2;
            if (c0Var.b(aVar) != objF) {
                aVar3 = aVar2;
                c0Var2 = c0Var;
                em.y yVar2 = c0Var2.f58215b;
                fl.g0 g0Var3 = fl.g0.f38750a;
                yVar2.s(g0Var3);
                aVar3.f(null);
                return g0Var3;
            }
            return objF;
        } catch (Throwable th4) {
            aVar3 = aVar2;
            th2 = th4;
            aVar3.f(null);
            throw th2;
        }
    }
}
