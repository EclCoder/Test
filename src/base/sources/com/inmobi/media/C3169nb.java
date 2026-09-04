package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3169nb extends AbstractC3108l2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f27048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f27049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pc f27050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3169nb(Map telemetryPayload, InMobiAdRequestStatus status, AbstractC3288s1 abstractC3288s1, A8 adManagerComponent, Pc publisherCallbacks, Ic stateMachine) {
        super(abstractC3288s1, adManagerComponent, stateMachine);
        kotlin.jvm.internal.s.h(telemetryPayload, "telemetryPayload");
        kotlin.jvm.internal.s.h(status, "status");
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f27048d = telemetryPayload;
        this.f27049e = status;
        this.f27050f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9C = this.f26916b.c();
        if (interfaceC3322t9C != null) {
            ((C3348u9) interfaceC3322t9C).b("AUM-LoadFailedState", "Initialize Called " + this.f27048d + " " + this.f27049e.getStatusCode() + " " + this.f27049e.getMessage());
        }
        T4.a(this.f26916b.a(), new C3143mb(this, null));
        C3132m0 c3132m0B = this.f26916b.b();
        Map payload = this.f27048d;
        c3132m0B.getClass();
        kotlin.jvm.internal.s.h(payload, "payload");
        em.k.d(c3132m0B.f26967a, null, null, new C3003h0(c3132m0B, payload, null), 3, null);
        AbstractC3288s1 abstractC3288s1 = this.f26915a;
        if (abstractC3288s1 != null) {
            abstractC3288s1.a();
        }
        j();
    }
}
