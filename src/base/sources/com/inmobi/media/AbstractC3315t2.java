package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3315t2 implements C8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f27501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final On f27502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hm.w f27503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nm.a f27504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f27505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public em.z1 f27506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Me f27507g;

    public AbstractC3315t2(em.o0 coroutineScope, Ln viewabilityModel, On viewabilityCriteria, hm.w lifecycleObserver) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(viewabilityModel, "viewabilityModel");
        kotlin.jvm.internal.s.h(viewabilityCriteria, "viewabilityCriteria");
        kotlin.jvm.internal.s.h(lifecycleObserver, "lifecycleObserver");
        this.f27501a = coroutineScope;
        this.f27502b = viewabilityCriteria;
        this.f27503c = lifecycleObserver;
        this.f27504d = nm.g.b(false, 1, null);
        this.f27505e = new AtomicBoolean(false);
        this.f27507g = new Me(coroutineScope, viewabilityModel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(AbstractC3315t2 abstractC3315t2, kotlin.coroutines.jvm.internal.d dVar) {
        C3212p2 c3212p2;
        nm.a aVar;
        abstractC3315t2.getClass();
        if (dVar instanceof C3212p2) {
            c3212p2 = (C3212p2) dVar;
            int i10 = c3212p2.f27164d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3212p2.f27164d = i10 - Integer.MIN_VALUE;
            } else {
                c3212p2 = new C3212p2(abstractC3315t2, dVar);
            }
        } else {
            c3212p2 = new C3212p2(abstractC3315t2, dVar);
        }
        Object obj = c3212p2.f27162b;
        Object objF = ll.b.f();
        int i11 = c3212p2.f27164d;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = abstractC3315t2.f27504d;
            c3212p2.f27161a = aVar2;
            c3212p2.f27164d = 1;
            if (aVar2.e(null, c3212p2) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3212p2.f27161a;
            fl.s.b(obj);
        }
        try {
            Sn snC = abstractC3315t2.c();
            Fg fg2 = snC.f25716a;
            fg2.f24784f.set(true);
            L6.a(fg2.f24783e);
            fg2.f24783e = null;
            L6.a(snC.f25719d.f25773a);
            snC.f25719d.f25773a = null;
            L6.a(snC.f25720e);
            snC.f25720e = null;
            abstractC3315t2.f27507g.b();
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(AbstractC3315t2 abstractC3315t2, kotlin.coroutines.jvm.internal.d dVar) {
        C3238q2 c3238q2;
        nm.a aVar;
        abstractC3315t2.getClass();
        if (dVar instanceof C3238q2) {
            c3238q2 = (C3238q2) dVar;
            int i10 = c3238q2.f27305d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3238q2.f27305d = i10 - Integer.MIN_VALUE;
            } else {
                c3238q2 = new C3238q2(abstractC3315t2, dVar);
            }
        } else {
            c3238q2 = new C3238q2(abstractC3315t2, dVar);
        }
        Object obj = c3238q2.f27303b;
        Object objF = ll.b.f();
        int i11 = c3238q2.f27305d;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = abstractC3315t2.f27504d;
            c3238q2.f27302a = aVar2;
            c3238q2.f27305d = 1;
            if (aVar2.e(null, c3238q2) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3238q2.f27302a;
            fl.s.b(obj);
        }
        try {
            if (abstractC3315t2.f27505e.get()) {
                abstractC3315t2.f27507g.a();
            } else {
                abstractC3315t2.f27507g.b();
            }
            if (abstractC3315t2.f27505e.get()) {
                Fg fg2 = abstractC3315t2.c().f25716a;
                fg2.f24784f.set(false);
                fg2.a();
            } else {
                Fg fg3 = abstractC3315t2.c().f25716a;
                fg3.f24780b.setValue(EnumC2949eo.HIDDEN);
                fg3.f24784f.set(true);
                L6.a(fg3.f24783e);
                fg3.f24783e = null;
            }
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    public abstract Sn c();

    @Override // com.inmobi.media.C8
    public final void a() {
        this.f27505e.set(false);
        this.f27507g.b();
        Sn snC = c();
        Fg fg2 = snC.f25716a;
        fg2.f24784f.set(true);
        L6.a(fg2.f24783e);
        fg2.f24783e = null;
        L6.a(snC.f25719d.f25773a);
        snC.f25719d.f25773a = null;
        L6.a(snC.f25720e);
        snC.f25720e = null;
        L6.a(this.f27506f);
        this.f27506f = null;
    }

    @Override // com.inmobi.media.C8
    public final hm.e b() {
        if (this.f27506f == null) {
            this.f27506f = em.k.d(this.f27501a, null, null, new C3186o2(this.f27503c, null, this), 3, null);
            fl.g0 g0Var = fl.g0.f38750a;
        }
        Sn snC = c();
        if (snC.f25720e == null) {
            Fg fg2 = snC.f25716a;
            fg2.a();
            snC.f25720e = em.k.d(snC.f25717b.f25858a, null, null, new Qn(fg2.f24780b, null, snC), 3, null);
            fl.g0 g0Var2 = fl.g0.f38750a;
        }
        return hm.g.x(hm.g.z(snC.f25718c, new C3263r2(this, null)), new C3289s2(this, null));
    }
}
