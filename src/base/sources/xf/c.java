package xf;

import em.i;
import em.k0;
import em.o0;
import fl.g0;
import fl.s;
import kl.f;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f56843a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f56844r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f56846t;

        a(f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56844r = obj;
            this.f56846t |= Integer.MIN_VALUE;
            return c.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f56847r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f56849t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, f fVar) {
            super(2, fVar);
            this.f56849t = obj;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return c.this.new b(this.f56849t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f56847r;
            if (i10 == 0) {
                s.b(obj);
                c cVar = c.this;
                Object obj2 = this.f56849t;
                this.f56847r = 1;
                obj = cVar.a(obj2, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return new wg.c.b(obj);
        }
    }

    public c(k0 coroutineDispatcher) {
        kotlin.jvm.internal.s.h(coroutineDispatcher, "coroutineDispatcher");
        this.f56843a = coroutineDispatcher;
    }

    protected abstract Object a(Object obj, f fVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, f fVar) {
        a aVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f56846t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f56846t = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object objJ = aVar.f56844r;
        Object objF = ll.b.f();
        int i11 = aVar.f56846t;
        try {
            if (i11 == 0) {
                s.b(objJ);
                k0 k0Var = this.f56843a;
                b bVar = new b(obj, null);
                aVar.f56846t = 1;
                objJ = i.j(k0Var, bVar, aVar);
                if (objJ == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(objJ);
            }
            return (wg.c) objJ;
        } catch (Exception e10) {
            wp.a.b(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return new wg.c.a(e10);
        }
    }
}
