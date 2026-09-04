package uh;

import androidx.lifecycle.p1;
import androidx.lifecycle.q1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hm.v f54506b = hm.b0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hm.v f54507c = hm.b0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hm.v f54508d = hm.b0.b(0, 0, null, 7, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54509r;

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54509r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = j.this.f54507c;
                fl.g0 g0Var = fl.g0.f38750a;
                this.f54509r = 1;
                if (vVar.emit(g0Var, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54511r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f54513t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, kl.f fVar) {
            super(2, fVar);
            this.f54513t = i10;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new b(this.f54513t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54511r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = j.this.f54508d;
                Integer numD = kotlin.coroutines.jvm.internal.b.d(this.f54513t);
                this.f54511r = 1;
                if (vVar.emit(numD, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54514r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ qh.h f54516t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(qh.h hVar, kl.f fVar) {
            super(2, fVar);
            this.f54516t = hVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return j.this.new c(this.f54516t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54514r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = j.this.f54506b;
                qh.h hVar = this.f54516t;
                this.f54514r = 1;
                if (vVar.emit(hVar, this) == objF) {
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

    public final hm.z m() {
        return this.f54507c;
    }

    public final hm.z n() {
        return this.f54508d;
    }

    public final hm.z o() {
        return this.f54506b;
    }

    public final void p() {
        em.k.d(q1.a(this), null, null, new a(null), 3, null);
    }

    public final void q(int i10) {
        em.k.d(q1.a(this), null, null, new b(i10, null), 3, null);
    }

    public final void r(qh.h ratioItem) {
        kotlin.jvm.internal.s.h(ratioItem, "ratioItem");
        em.k.d(q1.a(this), null, null, new c(ratioItem, null), 3, null);
    }
}
