package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Fe implements InterfaceC3332tj, Ah, I, InterfaceC2976g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nc f24773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3416x f24774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PublisherCallbacks f24775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3410wj f24776d;

    public Fe(Nc adUnit, C3416x adComponent, PublisherCallbacks publisherCallbacks, AbstractC3410wj stateMachine) {
        kotlin.jvm.internal.s.h(adUnit, "adUnit");
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f24773a = adUnit;
        this.f24774b = adComponent;
        this.f24775c = publisherCallbacks;
        this.f24776d = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        C3348u9 c3348u9 = this.f24774b.f27822a.f27105c;
        if (c3348u9 != null) {
            c3348u9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.f24773a.f25344b.d();
    }

    @Override // com.inmobi.media.I
    public final void g() {
        C3348u9 c3348u9 = this.f24774b.f27822a.f27105c;
        if (c3348u9 != null) {
            c3348u9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.f24776d.a(new Ae(this.f24773a, this.f24774b, this.f24775c, this.f24776d), this);
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        this.f24776d.a(new C3370v5(this.f24773a, null, this.f24774b), this);
    }

    @Override // com.inmobi.media.Ah
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.s.h(inMobiNativeViewData, "inMobiNativeViewData");
        C3348u9 c3348u9 = this.f24774b.f27822a.f27105c;
        if (c3348u9 != null) {
            c3348u9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        Nc nc2 = this.f24773a;
        nc2.getClass();
        kotlin.jvm.internal.s.h(inMobiNativeViewData, "inMobiNativeViewData");
        nc2.f25344b.a(inMobiNativeViewData);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }
}
