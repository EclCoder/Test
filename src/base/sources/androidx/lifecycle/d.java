package androidx.lifecycle;

import em.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f4344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tl.o f4345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final em.o0 f4347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tl.a f4348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z1 f4349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1 f4350g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4351r;

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
            return d.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f4351r;
            if (i10 == 0) {
                fl.s.b(obj);
                long j10 = d.this.f4346c;
                this.f4351r = 1;
                if (em.y0.a(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            if (!d.this.f4344a.h()) {
                z1 z1Var = d.this.f4349f;
                if (z1Var != null) {
                    z1.c0(z1Var, null, 1, null);
                }
                d.this.f4349f = null;
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4353r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f4354s;

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = d.this.new b(fVar);
            bVar.f4354s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f4353r;
            if (i10 == 0) {
                fl.s.b(obj);
                m0 m0Var = new m0(d.this.f4344a, ((em.o0) this.f4354s).i0());
                tl.o oVar = d.this.f4345b;
                this.f4353r = 1;
                if (oVar.invoke(m0Var, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            d.this.f4348e.invoke();
            return fl.g0.f38750a;
        }
    }

    public d(h liveData, tl.o block, long j10, em.o0 scope, tl.a onDone) {
        kotlin.jvm.internal.s.h(liveData, "liveData");
        kotlin.jvm.internal.s.h(block, "block");
        kotlin.jvm.internal.s.h(scope, "scope");
        kotlin.jvm.internal.s.h(onDone, "onDone");
        this.f4344a = liveData;
        this.f4345b = block;
        this.f4346c = j10;
        this.f4347d = scope;
        this.f4348e = onDone;
    }

    public final void g() {
        if (this.f4350g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        this.f4350g = em.k.d(this.f4347d, em.c1.c().X0(), null, new a(null), 2, null);
    }

    public final void h() {
        z1 z1Var = this.f4350g;
        if (z1Var != null) {
            z1.c0(z1Var, null, 1, null);
        }
        this.f4350g = null;
        if (this.f4349f != null) {
            return;
        }
        this.f4349f = em.k.d(this.f4347d, null, null, new b(null), 3, null);
    }
}
