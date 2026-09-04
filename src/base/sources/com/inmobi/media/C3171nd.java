package com.inmobi.media;

import com.inmobi.media.C3171nd;

/* JADX INFO: renamed from: com.inmobi.media.nd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3171nd extends AbstractC3315t2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3197od f27051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fl.k f27052i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3171nd(em.o0 coroutineScope, Ln viewabilityModel, On viewabilityCriteria, hm.w windowObserver) {
        super(coroutineScope, viewabilityModel, viewabilityCriteria, windowObserver);
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(viewabilityModel, "viewabilityModel");
        kotlin.jvm.internal.s.h(viewabilityCriteria, "viewabilityCriteria");
        kotlin.jvm.internal.s.h(windowObserver, "windowObserver");
        this.f27051h = new C3197od(new C2846ao(viewabilityCriteria.f25438b, viewabilityCriteria.f25439c), this.f27507g.f25278c);
        this.f27052i = fl.l.b(new tl.a() { // from class: yh.v9
            @Override // tl.a
            public final Object invoke() {
                return C3171nd.a(this.f57976a);
            }
        });
    }

    public static final Sn a(C3171nd c3171nd) {
        C3197od viewabilityTrackerView = c3171nd.f27051h;
        kotlin.jvm.internal.s.h(viewabilityTrackerView, "viewabilityTrackerView");
        return new Sn(new Fg(c3171nd.f27501a, new Hg(c3171nd.f27502b.f25437a), viewabilityTrackerView), new Un(c3171nd.f27501a, c3171nd.f27502b.f25440d));
    }

    @Override // com.inmobi.media.AbstractC3315t2
    public final Sn c() {
        return (Sn) this.f27052i.getValue();
    }
}
