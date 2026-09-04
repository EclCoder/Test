package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: renamed from: com.inmobi.media.gd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2990gd extends S6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3416x f26607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InMobiJsonResponse f26608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC3288s1 f26609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Pc f26610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ic f26611j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2990gd(C3416x adComponent, InMobiJsonResponse inMobiJsonResponse, AbstractC3288s1 adUnitTimeout, Pc nativeCallback, Ic stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(inMobiJsonResponse, "inMobiJsonResponse");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f26607f = adComponent;
        this.f26608g = inMobiJsonResponse;
        this.f26609h = adUnitTimeout;
        this.f26610i = nativeCallback;
        this.f26611j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeFetchedState", "Initialize Called - ad fetched successfully");
        }
        InterfaceC3322t9 interfaceC3322t9L2 = l();
        if (interfaceC3322t9L2 != null) {
            ((C3348u9) interfaceC3322t9L2).a("AUM-FetchedState", "Initialize Called");
        }
        this.f25674c.getClass();
        C3416x c3416x = this.f27890a;
        C3132m0 c3132m0 = c3416x.f27822a.f27108f;
        G adContext = c3416x.f27823b;
        c3132m0.getClass();
        kotlin.jvm.internal.s.h(adContext, "adContext");
        em.k.d(c3132m0.f26967a, null, null, new C3029i0(adContext, c3132m0, null), 3, null);
        T4.a(k(), new R6(this, null));
    }
}
