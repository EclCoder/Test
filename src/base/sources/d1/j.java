package d1;

import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f36104r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f36105s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ o f36106t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar, kl.f fVar) {
            super(2, fVar);
            this.f36106t = oVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, kl.f fVar2) {
            return ((a) create(fVar, fVar2)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(this.f36106t, fVar);
            aVar.f36105s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f36104r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f36105s;
                s.b(obj);
                return cVar;
            }
            s.b(obj);
            c cVarC = ((f) this.f36105s).c();
            o oVar = this.f36106t;
            this.f36105s = cVarC;
            this.f36104r = 1;
            return oVar.invoke(cVarC, this) == objF ? objF : cVarC;
        }
    }

    public static final Object a(z0.h hVar, o oVar, kl.f fVar) {
        return hVar.a(new a(oVar, null), fVar);
    }
}
