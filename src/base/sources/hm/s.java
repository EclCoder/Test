package hm;

import em.b2;
import java.util.NoSuchElementException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class s {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements hm.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.k0 f40649a;

        public a(kotlin.jvm.internal.k0 k0Var) {
            this.f40649a = k0Var;
        }

        @Override // hm.f
        public Object emit(Object obj, kl.f fVar) {
            this.f40649a.f43597a = obj;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements hm.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.o f40650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.k0 f40651b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f40652r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f40653s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f40654t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f40656v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f40657w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f40658x;

            public a(kl.f fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f40653s = obj;
                this.f40654t |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(tl.o oVar, kotlin.jvm.internal.k0 k0Var) {
            this.f40650a = oVar;
            this.f40651b = k0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // hm.f
        public Object emit(Object obj, kl.f fVar) {
            a aVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f40654t;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f40654t = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(fVar);
                }
            } else {
                aVar = new a(fVar);
            }
            Object objInvoke = aVar.f40653s;
            Object objF = ll.b.f();
            int i11 = aVar.f40654t;
            if (i11 == 0) {
                fl.s.b(objInvoke);
                tl.o oVar = this.f40650a;
                aVar.f40652r = kotlin.coroutines.jvm.internal.l.a(obj);
                aVar.f40656v = kotlin.coroutines.jvm.internal.l.a(aVar);
                aVar.f40657w = obj;
                aVar.f40658x = 0;
                aVar.f40654t = 1;
                kotlin.jvm.internal.q.a(6);
                objInvoke = oVar.invoke(obj, aVar);
                kotlin.jvm.internal.q.a(7);
                if (objInvoke == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f40657w;
                fl.s.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return fl.g0.f38750a;
            }
            this.f40651b.f43597a = obj;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40659r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40660s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40661t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f40662u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f40663v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f40664w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f40665x;

        c(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40664w = obj;
            this.f40665x |= Integer.MIN_VALUE;
            return g.p(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40666r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40667s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40668t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f40669u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f40670v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f40671w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f40672x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f40673y;

        d(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40672x = obj;
            this.f40673y |= Integer.MIN_VALUE;
            return g.q(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements hm.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.k0 f40674a;

        public e(kotlin.jvm.internal.k0 k0Var) {
            this.f40674a = k0Var;
        }

        @Override // hm.f
        public Object emit(Object obj, kl.f fVar) {
            this.f40674a.f43597a = obj;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40675r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f40676s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40677t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f40678u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f40679v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f40680w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f40681x;

        f(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40680w = obj;
            this.f40681x |= Integer.MIN_VALUE;
            return g.r(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(hm.e eVar, kl.f fVar) {
        c cVar;
        kotlin.jvm.internal.k0 k0Var;
        AbortFlowException e10;
        hm.f fVar2;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f40665x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f40665x = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object obj = cVar.f40664w;
        Object objF = ll.b.f();
        int i11 = cVar.f40665x;
        if (i11 == 0) {
            fl.s.b(obj);
            kotlin.jvm.internal.k0 k0Var2 = new kotlin.jvm.internal.k0();
            k0Var2.f43597a = im.n.f41534a;
            hm.f aVar = new a(k0Var2);
            try {
                cVar.f40659r = kotlin.coroutines.jvm.internal.l.a(eVar);
                cVar.f40660s = k0Var2;
                cVar.f40661t = kotlin.coroutines.jvm.internal.l.a(eVar);
                cVar.f40662u = aVar;
                cVar.f40663v = 0;
                cVar.f40665x = 1;
                if (eVar.collect(aVar, cVar) == objF) {
                    return objF;
                }
                k0Var = k0Var2;
            } catch (AbortFlowException e11) {
                k0Var = k0Var2;
                e10 = e11;
                fVar2 = aVar;
                im.j.a(e10, fVar2);
                b2.h(cVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar2 = (a) cVar.f40662u;
            k0Var = (kotlin.jvm.internal.k0) cVar.f40660s;
            try {
                fl.s.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                im.j.a(e10, fVar2);
                b2.h(cVar.getContext());
            }
        }
        Object obj2 = k0Var.f43597a;
        if (obj2 != im.n.f41534a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(hm.e eVar, tl.o oVar, kl.f fVar) {
        d dVar;
        kotlin.jvm.internal.k0 k0Var;
        AbortFlowException e10;
        hm.f fVar2;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f40673y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f40673y = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object obj = dVar.f40672x;
        Object objF = ll.b.f();
        int i11 = dVar.f40673y;
        if (i11 == 0) {
            fl.s.b(obj);
            kotlin.jvm.internal.k0 k0Var2 = new kotlin.jvm.internal.k0();
            k0Var2.f43597a = im.n.f41534a;
            hm.f bVar = new b(oVar, k0Var2);
            try {
                dVar.f40666r = kotlin.coroutines.jvm.internal.l.a(eVar);
                dVar.f40667s = kotlin.coroutines.jvm.internal.l.a(oVar);
                dVar.f40668t = k0Var2;
                dVar.f40669u = kotlin.coroutines.jvm.internal.l.a(eVar);
                dVar.f40670v = bVar;
                dVar.f40671w = 0;
                dVar.f40673y = 1;
                if (eVar.collect(bVar, dVar) == objF) {
                    return objF;
                }
                k0Var = k0Var2;
            } catch (AbortFlowException e11) {
                k0Var = k0Var2;
                e10 = e11;
                fVar2 = bVar;
                im.j.a(e10, fVar2);
                b2.h(dVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar2 = (b) dVar.f40670v;
            k0Var = (kotlin.jvm.internal.k0) dVar.f40668t;
            try {
                fl.s.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                im.j.a(e10, fVar2);
                b2.h(dVar.getContext());
            }
        }
        Object obj2 = k0Var.f43597a;
        if (obj2 != im.n.f41534a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(hm.e eVar, kl.f fVar) {
        f fVar2;
        kotlin.jvm.internal.k0 k0Var;
        AbortFlowException e10;
        hm.f fVar3;
        if (fVar instanceof f) {
            fVar2 = (f) fVar;
            int i10 = fVar2.f40681x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.f40681x = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(fVar);
            }
        } else {
            fVar2 = new f(fVar);
        }
        Object obj = fVar2.f40680w;
        Object objF = ll.b.f();
        int i11 = fVar2.f40681x;
        if (i11 == 0) {
            fl.s.b(obj);
            kotlin.jvm.internal.k0 k0Var2 = new kotlin.jvm.internal.k0();
            hm.f eVar2 = new e(k0Var2);
            try {
                fVar2.f40675r = kotlin.coroutines.jvm.internal.l.a(eVar);
                fVar2.f40676s = k0Var2;
                fVar2.f40677t = kotlin.coroutines.jvm.internal.l.a(eVar);
                fVar2.f40678u = eVar2;
                fVar2.f40679v = 0;
                fVar2.f40681x = 1;
                if (eVar.collect(eVar2, fVar2) == objF) {
                    return objF;
                }
                k0Var = k0Var2;
            } catch (AbortFlowException e11) {
                k0Var = k0Var2;
                e10 = e11;
                fVar3 = eVar2;
                im.j.a(e10, fVar3);
                b2.h(fVar2.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar3 = (e) fVar2.f40678u;
            k0Var = (kotlin.jvm.internal.k0) fVar2.f40676s;
            try {
                fl.s.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                im.j.a(e10, fVar3);
                b2.h(fVar2.getContext());
            }
        }
        return k0Var.f43597a;
    }
}
