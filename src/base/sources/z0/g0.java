package z0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nm.a f58255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0.b f58256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hm.e f58257d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58258r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f58259s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f58260t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f58262v;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58260t = obj;
            this.f58262v |= Integer.MIN_VALUE;
            return g0.this.c(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58263r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f58264s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f58265t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f58267v;

        b(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58265t = obj;
            this.f58267v |= Integer.MIN_VALUE;
            return g0.this.e(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58268r;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hm.f fVar, kl.f fVar2) {
            return ((c) create(fVar, fVar2)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f58268r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return fl.g0.f38750a;
        }
    }

    public g0(String filePath) {
        kotlin.jvm.internal.s.h(filePath, "filePath");
        this.f58254a = filePath;
        this.f58255b = nm.g.b(false, 1, null);
        this.f58256c = new z0.b(0);
        this.f58257d = hm.g.s(new c(null));
    }

    @Override // z0.s
    public Object a(kl.f fVar) {
        return kotlin.coroutines.jvm.internal.b.d(this.f58256c.d());
    }

    @Override // z0.s
    public hm.e b() {
        return this.f58257d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z0.s
    public Object c(Function1 function1, kl.f fVar) throws Throwable {
        a aVar;
        nm.a aVar2;
        Throwable th2;
        nm.a aVar3;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f58262v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f58262v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f58260t;
        Object objF = ll.b.f();
        int i11 = aVar.f58262v;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                aVar2 = this.f58255b;
                aVar.f58258r = function1;
                aVar.f58259s = aVar2;
                aVar.f58262v = 1;
                if (aVar2.e(null, aVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (nm.a) aVar.f58258r;
                try {
                    fl.s.b(obj);
                    aVar3.f(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.f(null);
                    throw th2;
                }
            }
            nm.a aVar4 = (nm.a) aVar.f58259s;
            Function1 function2 = (Function1) aVar.f58258r;
            fl.s.b(obj);
            aVar2 = aVar4;
            function1 = function2;
            aVar.f58258r = aVar2;
            aVar.f58259s = null;
            aVar.f58262v = 2;
            Object objInvoke = function1.invoke(aVar);
            if (objInvoke != objF) {
                nm.a aVar5 = aVar2;
                obj = objInvoke;
                aVar3 = aVar5;
                aVar3.f(null);
                return obj;
            }
            return objF;
        } catch (Throwable th4) {
            nm.a aVar6 = aVar2;
            th2 = th4;
            aVar3 = aVar6;
            aVar3.f(null);
            throw th2;
        }
    }

    @Override // z0.s
    public Object d(kl.f fVar) {
        return kotlin.coroutines.jvm.internal.b.d(this.f58256c.b());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z0.s
    public Object e(tl.o oVar, kl.f fVar) throws Throwable {
        b bVar;
        nm.a aVar;
        Throwable th2;
        boolean z10;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f58267v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f58267v = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f58265t;
        Object objF = ll.b.f();
        int i11 = bVar.f58267v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar.f58264s;
            aVar = (nm.a) bVar.f58263r;
            try {
                fl.s.b(obj);
                if (z10) {
                    aVar.f(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z10) {
                    aVar.f(null);
                }
                throw th2;
            }
        }
        fl.s.b(obj);
        nm.a aVar2 = this.f58255b;
        boolean zC = aVar2.c(null);
        try {
            Object objA = kotlin.coroutines.jvm.internal.b.a(zC);
            bVar.f58263r = aVar2;
            bVar.f58264s = zC;
            bVar.f58267v = 1;
            Object objInvoke = oVar.invoke(objA, bVar);
            if (objInvoke == objF) {
                return objF;
            }
            aVar = aVar2;
            obj = objInvoke;
            z10 = zC;
            if (z10) {
                aVar.f(null);
            }
            return obj;
        } catch (Throwable th4) {
            aVar = aVar2;
            th2 = th4;
            z10 = zC;
            if (z10) {
                aVar.f(null);
            }
            throw th2;
        }
    }
}
