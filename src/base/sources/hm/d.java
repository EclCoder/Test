package hm;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f40503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f40504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl.o f40505c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.k0 f40507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f40508c;

        /* JADX INFO: renamed from: hm.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0614a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f40509r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f40510s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f40511t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f40513v;

            C0614a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40511t = obj;
                this.f40513v |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(kotlin.jvm.internal.k0 k0Var, f fVar) {
            this.f40507b = k0Var;
            this.f40508c = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // hm.f
        public final Object emit(Object obj, kl.f fVar) {
            C0614a c0614a;
            if (fVar instanceof C0614a) {
                c0614a = (C0614a) fVar;
                int i10 = c0614a.f40513v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0614a.f40513v = i10 - Integer.MIN_VALUE;
                } else {
                    c0614a = new C0614a(fVar);
                }
            } else {
                c0614a = new C0614a(fVar);
            }
            Object obj2 = c0614a.f40511t;
            Object objF = ll.b.f();
            int i11 = c0614a.f40513v;
            if (i11 == 0) {
                fl.s.b(obj2);
                Object objInvoke = d.this.f40504b.invoke(obj);
                Object obj3 = this.f40507b.f43597a;
                if (obj3 != im.n.f41534a && ((Boolean) d.this.f40505c.invoke(obj3, objInvoke)).booleanValue()) {
                    return fl.g0.f38750a;
                }
                this.f40507b.f43597a = objInvoke;
                f fVar2 = this.f40508c;
                c0614a.f40509r = kotlin.coroutines.jvm.internal.l.a(obj);
                c0614a.f40510s = kotlin.coroutines.jvm.internal.l.a(objInvoke);
                c0614a.f40513v = 1;
                if (fVar2.emit(obj, c0614a) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj2);
            }
            return fl.g0.f38750a;
        }
    }

    public d(e eVar, Function1 function1, tl.o oVar) {
        this.f40503a = eVar;
        this.f40504b = function1;
        this.f40505c = oVar;
    }

    @Override // hm.e
    public Object collect(f fVar, kl.f fVar2) {
        kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        k0Var.f43597a = im.n.f41534a;
        Object objCollect = this.f40503a.collect(new a(k0Var, fVar), fVar2);
        return objCollect == ll.b.f() ? objCollect : fl.g0.f38750a;
    }
}
