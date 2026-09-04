package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: renamed from: com.inmobi.media.xd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3430xd extends AbstractC3441y implements Ah, InterfaceC3332tj, I, InterfaceC2976g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Nc f27843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3416x f27844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3288s1 f27845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ic f27846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3068je f27847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3416x f27848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Nc f27849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Pc f27850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ic f27851j;

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        InterfaceC3322t9 interfaceC3322t9L2 = l();
        if (interfaceC3322t9L2 != null) {
            ((C3348u9) interfaceC3322t9L2).a("AUM-LoadedState", "Initialize Called");
        }
        this.f27845d.e();
        C2874c0 c2874c0 = this.f27890a.f27822a.f27106d;
        c2874c0.getClass();
        c2874c0.f26293g = SystemClock.elapsedRealtime();
        T4.a(k(), new C3404wd(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-LoadedState", "onAdDisplayed");
        }
        InterfaceC3322t9 interfaceC3322t9L2 = l();
        if (interfaceC3322t9L2 != null) {
            ((C3348u9) interfaceC3322t9L2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.f27851j.a(new Ae(this.f27849h, this.f27848g, this.f27850i, this.f27851j), this);
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-LoadedState", "onDestroy");
        }
        this.f27846e.a(new C3370v5(this.f27843b, this.f27845d, this.f27844c), this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3430xd(C3068je nativePubData, C3416x adComponent, Nc nc2, AbstractC3288s1 adUnitTimeout, Pc nativeCallback, Ic stateMachine) {
        super(adComponent);
        kotlin.jvm.internal.s.h(nativePubData, "nativePubData");
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        String str = CIdIVqKnNZ.PiblY;
        kotlin.jvm.internal.s.h(nc2, str);
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        kotlin.jvm.internal.s.h(nc2, str);
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f27843b = nc2;
        this.f27844c = adComponent;
        this.f27845d = adUnitTimeout;
        this.f27846e = stateMachine;
        this.f27847f = nativePubData;
        this.f27848g = adComponent;
        this.f27849h = nc2;
        this.f27850i = nativeCallback;
        this.f27851j = stateMachine;
    }

    @Override // com.inmobi.media.Ah
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.s.h(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        Nc nc2 = this.f27849h;
        nc2.getClass();
        kotlin.jvm.internal.s.h(inMobiNativeViewData, "inMobiNativeViewData");
        nc2.f25344b.a(inMobiNativeViewData);
    }
}
