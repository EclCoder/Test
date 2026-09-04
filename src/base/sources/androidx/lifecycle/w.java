package androidx.lifecycle;

import em.c2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class w extends v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f4522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.j f4523b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4524r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f4525s;

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
            a aVar = w.this.new a(fVar);
            aVar.f4525s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ll.b.f();
            if (this.f4524r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f4525s;
            if (w.this.b().b().compareTo(s.b.INITIALIZED) >= 0) {
                w.this.b().a(w.this);
            } else {
                c2.d(o0Var.i0(), null, 1, null);
            }
            return fl.g0.f38750a;
        }
    }

    public w(s lifecycle, kl.j coroutineContext) {
        kotlin.jvm.internal.s.h(lifecycle, "lifecycle");
        kotlin.jvm.internal.s.h(coroutineContext, "coroutineContext");
        this.f4522a = lifecycle;
        this.f4523b = coroutineContext;
        if (b().b() == s.b.DESTROYED) {
            c2.d(i0(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.v
    public s b() {
        return this.f4522a;
    }

    @Override // androidx.lifecycle.y
    public void c(b0 source, s.a event) {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(event, "event");
        if (b().b().compareTo(s.b.DESTROYED) <= 0) {
            b().d(this);
            c2.d(i0(), null, 1, null);
        }
    }

    public final void e() {
        em.k.d(this, em.c1.c().X0(), null, new a(null), 2, null);
    }

    @Override // em.o0
    public kl.j i0() {
        return this.f4523b;
    }
}
