package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class S6 extends AbstractC3441y implements InterfaceC3332tj, InterfaceC3116la, InterfaceC2976g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3416x f25673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3288s1 f25674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pc f25675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ic f25676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S6(C3416x adComponent, AbstractC3288s1 adUnitTimeout, Pc publisherCallbacks, Ic stateMachine) {
        super(adComponent);
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f25673b = adComponent;
        this.f25674c = adUnitTimeout;
        this.f25675d = publisherCallbacks;
        this.f25676e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3116la
    public final void e() {
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-FetchedState", "transitionToLoadFailedState Called");
        }
        this.f25676e.a(new C3169nb(gl.l0.m(fl.w.a("errorCode", (short) 2138)), inMobiAdRequestStatus, this.f25674c, this.f25673b, this.f25675d, this.f25676e), this);
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-FetchedState", "onDestroy Called");
        }
        this.f25676e.a(new C3370v5(null, this.f25674c, this.f25673b), this);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }
}
