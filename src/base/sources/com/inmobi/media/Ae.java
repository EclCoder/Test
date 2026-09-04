package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ae extends Ei implements InterfaceC3076jm, Tk {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nc f24470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3416x f24471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PublisherCallbacks f24472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC3410wj f24473i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(Nc adUnit, C3416x adComponent, PublisherCallbacks publisherCallbacks, AbstractC3410wj stateMachine) {
        super(adUnit, adComponent, publisherCallbacks, stateMachine);
        kotlin.jvm.internal.s.h(adUnit, "adUnit");
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f24470f = adUnit;
        this.f24471g = adComponent;
        this.f24472h = publisherCallbacks;
        this.f24473i = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void a(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeRenderedState", "onAudioStateChanged " + z10);
        }
        T4.a(k(), new C3198oe(this, z10, null));
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void b() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeRenderedState", "onVideoPaused");
        }
        T4.a(k(), new C3275re(this, null));
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeRenderedState", "unTrackViews - stopping view tracking");
        }
        this.f24473i.a(new Fe(this.f24470f, this.f24471g, this.f24472h, this.f24473i), this);
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void f() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeRenderedState", "onVideoStarted");
        }
        T4.a(k(), new C3327te(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void h() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeRenderedState", "onVideoCompleted");
        }
        T4.a(k(), new C3250qe(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void i() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeRenderedState", "onVideoResumed");
        }
        T4.a(k(), new C3301se(this, null));
    }
}
