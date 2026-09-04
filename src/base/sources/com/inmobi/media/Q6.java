package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Q6 extends AbstractC3108l2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f25538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f25539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pc f25540f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(Map payload, InMobiAdRequestStatus inMobiAdRequestStatus, AbstractC3288s1 adUnitTimeout, C3185o1 adManagerComponent, Pc publisherCallbacks, Ic stateMachine) {
        super(adUnitTimeout, adManagerComponent, stateMachine);
        kotlin.jvm.internal.s.h(payload, "payload");
        kotlin.jvm.internal.s.h(inMobiAdRequestStatus, "inMobiAdRequestStatus");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f25538d = payload;
        this.f25539e = inMobiAdRequestStatus;
        this.f25540f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9C = this.f26916b.c();
        if (interfaceC3322t9C != null) {
            ((C3348u9) interfaceC3322t9C).b("AUM-FetchFailedState", "Initialized Called : " + this.f25538d + " " + this.f25539e.getStatusCode() + " " + this.f25539e.getMessage());
        }
        T4.a(this.f26916b.a(), new P6(this, null));
        C3132m0 c3132m0B = this.f26916b.b();
        Map payload = this.f25538d;
        c3132m0B.getClass();
        kotlin.jvm.internal.s.h(payload, "payload");
        em.k.d(c3132m0B.f26967a, null, null, new C3054j0(c3132m0B, payload, null), 3, null);
        AbstractC3288s1 abstractC3288s1 = this.f26915a;
        if (abstractC3288s1 != null) {
            abstractC3288s1.a();
        }
        j();
    }
}
