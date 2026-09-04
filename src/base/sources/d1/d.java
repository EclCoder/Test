package d1;

import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d implements z0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0.h f36095a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f36096r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f36097s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ o f36098t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar, kl.f fVar) {
            super(2, fVar);
            this.f36098t = oVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, kl.f fVar2) {
            return ((a) create(fVar, fVar2)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(this.f36098t, fVar);
            aVar.f36097s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f36096r;
            if (i10 == 0) {
                s.b(obj);
                f fVar = (f) this.f36097s;
                o oVar = this.f36098t;
                this.f36096r = 1;
                obj = oVar.invoke(fVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            f fVar2 = (f) obj;
            kotlin.jvm.internal.s.f(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }
    }

    public d(z0.h delegate) {
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.f36095a = delegate;
    }

    @Override // z0.h
    public Object a(o oVar, kl.f fVar) {
        return this.f36095a.a(new a(oVar, null), fVar);
    }

    @Override // z0.h
    public hm.e getData() {
        return this.f36095a.getData();
    }
}
