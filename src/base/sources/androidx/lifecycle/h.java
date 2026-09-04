package androidx.lifecycle;

import em.u2;
import em.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f4387m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4388r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f4390t;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4388r = obj;
            this.f4390t |= Integer.MIN_VALUE;
            return h.this.v(this);
        }
    }

    public h(kl.j context, long j10, tl.o block) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(block, "block");
        this.f4387m = new d(this, block, j10, em.p0.a(em.c1.c().X0().plus(context).plus(u2.a((z1) context.get(z1.f38078x2)))), new tl.a() { // from class: androidx.lifecycle.g
            @Override // tl.a
            public final Object invoke() {
                return h.u(this.f4385a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 u(h hVar) {
        hVar.f4387m = null;
        return fl.g0.f38750a;
    }

    @Override // androidx.lifecycle.n0, androidx.lifecycle.k0
    protected void l() {
        super.l();
        d dVar = this.f4387m;
        if (dVar != null) {
            dVar.h();
        }
    }

    @Override // androidx.lifecycle.n0, androidx.lifecycle.k0
    protected void m() {
        super.m();
        d dVar = this.f4387m;
        if (dVar != null) {
            dVar.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(kl.f fVar) {
        a aVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f4390t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4390t = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f4388r;
        ll.b.f();
        int i11 = aVar.f4390t;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(obj);
        return fl.g0.f38750a;
    }
}
