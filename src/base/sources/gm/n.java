package gm;

import em.o0;
import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class n {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f39397r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f39398s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f39399t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f39400u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ u f39401v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Object f39402w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar, Object obj, kl.f fVar) {
            super(2, fVar);
            this.f39401v = uVar;
            this.f39402w = obj;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(this.f39401v, this.f39402w, fVar);
            aVar.f39400u = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            o0 o0Var = (o0) this.f39400u;
            Object objF = ll.b.f();
            int i10 = this.f39399t;
            try {
                if (i10 == 0) {
                    fl.s.b(obj);
                    u uVar = this.f39401v;
                    Object obj2 = this.f39402w;
                    fl.r.a aVar = fl.r.f38769b;
                    this.f39400u = kotlin.coroutines.jvm.internal.l.a(o0Var);
                    this.f39397r = kotlin.coroutines.jvm.internal.l.a(o0Var);
                    this.f39398s = 0;
                    this.f39399t = 1;
                    if (uVar.o(obj2, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
                objB = fl.r.b(g0.f38750a);
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                objB = fl.r.b(fl.s.a(th2));
            }
            return k.b(fl.r.i(objB) ? k.f39391b.c(g0.f38750a) : k.f39391b.a(fl.r.e(objB)));
        }
    }

    public static final Object a(u uVar, Object obj) {
        Object objE = uVar.e(obj);
        if (objE instanceof k.c) {
            return ((k) em.l.b(null, new a(uVar, obj, null), 1, null)).k();
        }
        return k.f39391b.c(g0.f38750a);
    }
}
