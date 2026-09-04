package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Kd extends AbstractC3272rb {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3416x f25114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC3288s1 f25115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Pc f25116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ic f25117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Nc f25118j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kd(C3416x adComponent, InMobiJsonResponse inMobiJsonResponse, AbstractC3288s1 adUnitTimeout, Pc nativeCallback, Ic stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(inMobiJsonResponse, "inMobiJsonResponse");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f25114f = adComponent;
        this.f25115g = adUnitTimeout;
        this.f25116h = nativeCallback;
        this.f25117i = stateMachine;
        this.f25118j = new Nc(new Mc(adComponent, inMobiJsonResponse, stateMachine));
    }

    public final void a(C3068je pubData) {
        kotlin.jvm.internal.s.h(pubData, "pubData");
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeLoadingState", "onLoadSuccess - ad loaded successfully " + pubData);
        }
        this.f25117i.a(new C3430xd(pubData, this.f25114f, this.f25118j, this.f25115g, this.f25116h, this.f25117i), this);
    }
}
