package uh;

import androidx.lifecycle.p1;
import androidx.lifecycle.q1;
import em.c1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.k0 f54551b = androidx.lifecycle.i.b(q1.a(this).i0(), 0, new a(null), 2, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54552r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f54553s;

        /* JADX INFO: renamed from: uh.p0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0821a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f54554r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.l0 f54555s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0821a(androidx.lifecycle.l0 l0Var, kl.f fVar) {
                super(2, fVar);
                this.f54555s = l0Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(em.o0 o0Var, kl.f fVar) {
                return ((C0821a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new C0821a(this.f54555s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f54554r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    androidx.lifecycle.l0 l0Var = this.f54555s;
                    ArrayList arrayListB = og.b.b();
                    kotlin.jvm.internal.s.g(arrayListB, "getFontItemList(...)");
                    this.f54554r = 1;
                    if (l0Var.emit(arrayListB, this) == objF) {
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

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.lifecycle.l0 l0Var, kl.f fVar) {
            return ((a) create(l0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(fVar);
            aVar.f54553s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54552r;
            if (i10 == 0) {
                fl.s.b(obj);
                androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) this.f54553s;
                em.k0 k0VarB = c1.b();
                C0821a c0821a = new C0821a(l0Var, null);
                this.f54552r = 1;
                if (em.i.j(k0VarB, c0821a, this) == objF) {
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

    public final androidx.lifecycle.k0 j() {
        return this.f54551b;
    }
}
