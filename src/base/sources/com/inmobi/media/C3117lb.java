package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3117lb extends AbstractC3108l2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f26936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f26937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pc f26938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3117lb(short s10, InMobiAdRequestStatus status, C3185o1 adManagerComponent, Pc publisherCallbacks, Ic stateMachine) {
        super(null, adManagerComponent, stateMachine);
        kotlin.jvm.internal.s.h(status, "status");
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f26936d = s10;
        this.f26937e = status;
        this.f26938f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9C = this.f26916b.c();
        if (interfaceC3322t9C != null) {
            short s10 = this.f26936d;
            ((C3348u9) interfaceC3322t9C).b("AUM-LoadDroppedState", "Initialize Called " + ((int) s10) + " " + this.f26937e.getStatusCode() + " " + this.f26937e.getMessage());
        }
        T4.a(this.f26916b.a(), new C3091kb(this, null));
        C3132m0 c3132m0B = this.f26916b.b();
        em.k.d(c3132m0B.f26967a, null, null, new C2977g0(c3132m0B, this.f26936d, null), 3, null);
        AbstractC3288s1 abstractC3288s1 = this.f26915a;
        if (abstractC3288s1 != null) {
            abstractC3288s1.a();
        }
        j();
    }
}
