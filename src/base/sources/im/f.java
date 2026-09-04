package im;

import em.i0;
import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final hm.e f41504d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f41505r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f41506s;

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hm.f fVar, kl.f fVar2) {
            return ((a) create(fVar, fVar2)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = f.this.new a(fVar);
            aVar.f41506s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            hm.f fVar = (hm.f) this.f41506s;
            Object objF = ll.b.f();
            int i10 = this.f41505r;
            if (i10 == 0) {
                fl.s.b(obj);
                f fVar2 = f.this;
                this.f41506s = kotlin.coroutines.jvm.internal.l.a(fVar);
                this.f41505r = 1;
                if (fVar2.r(fVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return g0.f38750a;
        }
    }

    public f(hm.e eVar, kl.j jVar, int i10, gm.a aVar) {
        super(jVar, i10, aVar);
        this.f41504d = eVar;
    }

    static /* synthetic */ Object o(f fVar, hm.f fVar2, kl.f fVar3) {
        if (fVar.f41486b == -3) {
            kl.j context = fVar3.getContext();
            kl.j jVarK = i0.k(context, fVar.f41485a);
            if (kotlin.jvm.internal.s.c(jVarK, context)) {
                Object objR = fVar.r(fVar2, fVar3);
                return objR == ll.b.f() ? objR : g0.f38750a;
            }
            kl.g.b bVar = kl.g.f43529z2;
            if (kotlin.jvm.internal.s.c(jVarK.get(bVar), context.get(bVar))) {
                Object objQ = fVar.q(fVar2, jVarK, fVar3);
                return objQ == ll.b.f() ? objQ : g0.f38750a;
            }
        }
        Object objCollect = super.collect(fVar2, fVar3);
        return objCollect == ll.b.f() ? objCollect : g0.f38750a;
    }

    static /* synthetic */ Object p(f fVar, gm.s sVar, kl.f fVar2) {
        Object objR = fVar.r(new t(sVar), fVar2);
        return objR == ll.b.f() ? objR : g0.f38750a;
    }

    private final Object q(hm.f fVar, kl.j jVar, kl.f fVar2) {
        return e.c(jVar, e.d(fVar, fVar2.getContext()), null, new a(null), fVar2, 4, null);
    }

    @Override // im.d, hm.e
    public Object collect(hm.f fVar, kl.f fVar2) {
        return o(this, fVar, fVar2);
    }

    @Override // im.d
    protected Object h(gm.s sVar, kl.f fVar) {
        return p(this, sVar, fVar);
    }

    protected abstract Object r(hm.f fVar, kl.f fVar2);

    @Override // im.d
    public String toString() {
        return this.f41504d + " -> " + super.toString();
    }
}
