package im;

import fl.g0;
import jm.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class w implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.j f41548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f41549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tl.o f41550c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f41551r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f41552s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ hm.f f41553t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(hm.f fVar, kl.f fVar2) {
            super(2, fVar2);
            this.f41553t = fVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kl.f fVar) {
            return ((a) create(obj, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(this.f41553t, fVar);
            aVar.f41552s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.f41552s;
            Object objF = ll.b.f();
            int i10 = this.f41551r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.f fVar = this.f41553t;
                this.f41552s = kotlin.coroutines.jvm.internal.l.a(obj2);
                this.f41551r = 1;
                if (fVar.emit(obj2, this) == objF) {
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

    public w(hm.f fVar, kl.j jVar) {
        this.f41548a = jVar;
        this.f41549b = k0.g(jVar);
        this.f41550c = new a(fVar, null);
    }

    @Override // hm.f
    public Object emit(Object obj, kl.f fVar) throws Throwable {
        Object objB = e.b(this.f41548a, obj, this.f41549b, this.f41550c, fVar);
        return objB == ll.b.f() ? objB : g0.f38750a;
    }
}
