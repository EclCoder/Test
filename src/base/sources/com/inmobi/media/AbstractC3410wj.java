package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3410wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f27802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm.a f27803b;

    public AbstractC3410wj(em.o0 coroutineScope) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        this.f27802a = coroutineScope;
        this.f27803b = nm.g.b(false, 1, null);
    }

    public abstract InterfaceC3332tj a();

    public abstract void a(InterfaceC3332tj interfaceC3332tj);

    public final void a(InterfaceC3332tj newState, InterfaceC3332tj callerState) {
        kotlin.jvm.internal.s.h(newState, "newState");
        kotlin.jvm.internal.s.h(callerState, "callerState");
        em.k.d(this.f27802a, null, null, new C3358uj(this, newState, callerState, null), 3, null);
    }

    public final void b(InterfaceC3332tj interfaceC3332tj, InterfaceC3332tj interfaceC3332tj2) {
        if (kotlin.jvm.internal.s.c(a(), interfaceC3332tj2) && !kotlin.jvm.internal.s.c(a(), interfaceC3332tj)) {
            kotlin.jvm.internal.s.g(getClass().getSimpleName(), "getSimpleName(...)");
            a().getClass();
            interfaceC3332tj.getClass();
            a().c();
            a(interfaceC3332tj);
            a().a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C2913dd c2913dd, InterfaceC3332tj interfaceC3332tj, kotlin.coroutines.jvm.internal.d dVar) {
        C3384vj c3384vj;
        nm.a aVar;
        InterfaceC3332tj interfaceC3332tj2;
        if (dVar instanceof C3384vj) {
            c3384vj = (C3384vj) dVar;
            int i10 = c3384vj.f27741f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3384vj.f27741f = i10 - Integer.MIN_VALUE;
            } else {
                c3384vj = new C3384vj(this, dVar);
            }
        } else {
            c3384vj = new C3384vj(this, dVar);
        }
        Object obj = c3384vj.f27739d;
        Object objF = ll.b.f();
        int i11 = c3384vj.f27741f;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar = this.f27803b;
            c3384vj.f27736a = c2913dd;
            c3384vj.f27737b = interfaceC3332tj;
            c3384vj.f27738c = aVar;
            c3384vj.f27741f = 1;
            if (aVar.e(null, c3384vj) == objF) {
                interfaceC3332tj2 = c2913dd;
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar2 = c3384vj.f27738c;
            interfaceC3332tj = c3384vj.f27737b;
            InterfaceC3332tj interfaceC3332tj3 = c3384vj.f27736a;
            fl.s.b(obj);
            aVar = aVar2;
            interfaceC3332tj2 = interfaceC3332tj3;
        }
        try {
            interfaceC3332tj2 = c2913dd;
            b(interfaceC3332tj2, interfaceC3332tj);
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }
}
