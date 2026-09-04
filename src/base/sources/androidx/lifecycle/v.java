package androidx.lifecycle;

import em.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v implements em.o0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4507r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ tl.o f4509t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(tl.o oVar, kl.f fVar) {
            super(2, fVar);
            this.f4509t = oVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return v.this.new a(this.f4509t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f4507r;
            if (i10 == 0) {
                fl.s.b(obj);
                s sVarB = v.this.b();
                tl.o oVar = this.f4509t;
                this.f4507r = 1;
                if (t0.a(sVarB, oVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    public abstract s b();

    public final z1 d(tl.o block) {
        kotlin.jvm.internal.s.h(block, "block");
        return em.k.d(this, null, null, new a(block, null), 3, null);
    }
}
