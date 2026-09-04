package com.inmobi.media;

import com.inmobi.media.Md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Md extends AbstractC3315t2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Od f25274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fl.k f25275i;

    /* JADX WARN: Illegal instructions before constructor call */
    public Md(em.o0 coroutineScope, O5 displayMRC50Model, hm.w windowObserver) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(displayMRC50Model, "displayMRC50Model");
        kotlin.jvm.internal.s.h(windowObserver, "windowObserver");
        Ln ln2 = displayMRC50Model.f25399a;
        On on2 = displayMRC50Model.f25400b;
        super(coroutineScope, ln2, on2, windowObserver);
        this.f25274h = new Od(new C2846ao(on2.f25438b, on2.f25439c), this.f27507g.f25278c);
        this.f25275i = fl.l.b(new tl.a() { // from class: yh.m2
            @Override // tl.a
            public final Object invoke() {
                return Md.a(this.f57832a);
            }
        });
    }

    public static final Sn a(Md md2) {
        Od viewabilityTrackerView = md2.f25274h;
        kotlin.jvm.internal.s.h(viewabilityTrackerView, "viewabilityTrackerView");
        return new Sn(new Fg(md2.f27501a, new Hg(md2.f27502b.f25437a), viewabilityTrackerView), new Un(md2.f27501a, md2.f27502b.f25440d));
    }

    @Override // com.inmobi.media.AbstractC3315t2
    public final Sn c() {
        return (Sn) this.f25275i.getValue();
    }
}
