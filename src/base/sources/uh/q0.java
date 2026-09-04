package uh;

import android.text.Layout;
import androidx.lifecycle.p1;
import androidx.lifecycle.q1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class q0 extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qh.j f54558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.p0 f54559c = new androidx.lifecycle.p0("");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.lifecycle.p0 f54560d = new androidx.lifecycle.p0(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.p0 f54561e = new androidx.lifecycle.p0(Integer.valueOf(rh.b.b()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.p0 f54562f = new androidx.lifecycle.p0(Float.valueOf(1.0f));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.lifecycle.p0 f54563g = new androidx.lifecycle.p0(Layout.Alignment.ALIGN_CENTER);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.lifecycle.p0 f54564h = new androidx.lifecycle.p0(Float.valueOf(16.0f));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.lifecycle.p0 f54565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.lifecycle.p0 f54566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final hm.v f54567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final hm.v f54568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final hm.v f54569m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54570r;

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
            return q0.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54570r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = q0.this.f54568l;
                fl.g0 g0Var = fl.g0.f38750a;
                this.f54570r = 1;
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
        int f54572r;

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
            return q0.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54572r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = q0.this.f54569m;
                fl.g0 g0Var = fl.g0.f38750a;
                this.f54572r = 1;
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
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54574r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f54576t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kl.f fVar) {
            super(2, fVar);
            this.f54576t = str;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return q0.this.new c(this.f54576t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f54574r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.v vVar = q0.this.f54567k;
                String str = this.f54576t;
                this.f54574r = 1;
                if (vVar.emit(str, this) == objF) {
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

    public q0() {
        Float fValueOf = Float.valueOf(0.0f);
        this.f54565i = new androidx.lifecycle.p0(fValueOf);
        this.f54566j = new androidx.lifecycle.p0(fValueOf);
        this.f54567k = hm.b0.b(0, 0, null, 7, null);
        this.f54568l = hm.b0.b(0, 0, null, 7, null);
        this.f54569m = hm.b0.b(0, 0, null, 7, null);
    }

    public final void A(String text) {
        kotlin.jvm.internal.s.h(text, "text");
        em.k.d(q1.a(this), null, null, new c(text, null), 3, null);
    }

    public final void B(qh.j jVar) {
        this.f54558b = jVar;
    }

    public final void C(Layout.Alignment value) {
        kotlin.jvm.internal.s.h(value, "value");
        this.f54563g.q(value);
    }

    public final hm.z m() {
        return this.f54568l;
    }

    public final hm.z n() {
        return this.f54569m;
    }

    public final hm.z o() {
        return this.f54567k;
    }

    public final androidx.lifecycle.p0 p() {
        return this.f54563g;
    }

    public final androidx.lifecycle.p0 q() {
        return this.f54561e;
    }

    public final androidx.lifecycle.p0 r() {
        return this.f54562f;
    }

    public final androidx.lifecycle.p0 s() {
        return this.f54560d;
    }

    public final qh.j t() {
        return this.f54558b;
    }

    public final androidx.lifecycle.p0 u() {
        return this.f54565i;
    }

    public final androidx.lifecycle.p0 v() {
        return this.f54566j;
    }

    public final androidx.lifecycle.p0 w() {
        return this.f54564h;
    }

    public final androidx.lifecycle.p0 x() {
        return this.f54559c;
    }

    public final void y() {
        em.k.d(q1.a(this), null, null, new a(null), 3, null);
    }

    public final void z() {
        em.k.d(q1.a(this), null, null, new b(null), 3, null);
    }
}
