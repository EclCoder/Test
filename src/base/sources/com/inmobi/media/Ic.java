package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ic extends AbstractC3002h implements Ah, Tk, Io, InterfaceC3076jm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3332tj f25000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ic(C3185o1 adManagerComponent, Pc nativeCallbacks) {
        super(adManagerComponent.f27107e);
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(nativeCallbacks, "nativeCallbacks");
        this.f25000c = new C2861bd(adManagerComponent, nativeCallbacks, this);
    }

    @Override // com.inmobi.media.AbstractC3410wj
    public final InterfaceC3332tj a() {
        return this.f25000c;
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void b() {
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        InterfaceC3076jm interfaceC3076jm = interfaceC3332tj instanceof InterfaceC3076jm ? (InterfaceC3076jm) interfaceC3332tj : null;
        if (interfaceC3076jm != null) {
            interfaceC3076jm.b();
        }
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        Tk tk2 = interfaceC3332tj instanceof Tk ? (Tk) interfaceC3332tj : null;
        if (tk2 != null) {
            tk2.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void f() {
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        InterfaceC3076jm interfaceC3076jm = interfaceC3332tj instanceof InterfaceC3076jm ? (InterfaceC3076jm) interfaceC3332tj : null;
        if (interfaceC3076jm != null) {
            interfaceC3076jm.f();
        }
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void h() {
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        InterfaceC3076jm interfaceC3076jm = interfaceC3332tj instanceof InterfaceC3076jm ? (InterfaceC3076jm) interfaceC3332tj : null;
        if (interfaceC3076jm != null) {
            interfaceC3076jm.h();
        }
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void i() {
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        InterfaceC3076jm interfaceC3076jm = interfaceC3332tj instanceof InterfaceC3076jm ? (InterfaceC3076jm) interfaceC3332tj : null;
        if (interfaceC3076jm != null) {
            interfaceC3076jm.i();
        }
    }

    @Override // com.inmobi.media.Io
    public final String a(int i10, double d10) {
        Nc nc2;
        String strA;
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        if (interfaceC3332tj instanceof Kd) {
            nc2 = ((Kd) interfaceC3332tj).f25118j;
        } else if (interfaceC3332tj instanceof C3430xd) {
            nc2 = ((C3430xd) interfaceC3332tj).f27849h;
        } else if (interfaceC3332tj instanceof Ae) {
            nc2 = ((Ae) interfaceC3332tj).f24470f;
        } else {
            nc2 = interfaceC3332tj instanceof Fe ? ((Fe) interfaceC3332tj).f24773a : null;
        }
        return (nc2 == null || (strA = nc2.a(i10, d10)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.Io
    public final String a(double d10) {
        Nc nc2;
        String strA;
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        if (interfaceC3332tj instanceof Kd) {
            nc2 = ((Kd) interfaceC3332tj).f25118j;
        } else if (interfaceC3332tj instanceof C3430xd) {
            nc2 = ((C3430xd) interfaceC3332tj).f27849h;
        } else if (interfaceC3332tj instanceof Ae) {
            nc2 = ((Ae) interfaceC3332tj).f24470f;
        } else {
            nc2 = interfaceC3332tj instanceof Fe ? ((Fe) interfaceC3332tj).f24773a : null;
        }
        return (nc2 == null || (strA = nc2.a(d10)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : strA;
    }

    @Override // com.inmobi.media.InterfaceC3076jm
    public final void a(boolean z10) {
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        InterfaceC3076jm interfaceC3076jm = interfaceC3332tj instanceof InterfaceC3076jm ? (InterfaceC3076jm) interfaceC3332tj : null;
        if (interfaceC3076jm != null) {
            interfaceC3076jm.a(z10);
        }
    }

    @Override // com.inmobi.media.Ah
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.s.h(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3332tj interfaceC3332tj = this.f25000c;
        Ah ah2 = interfaceC3332tj instanceof Ah ? (Ah) interfaceC3332tj : null;
        if (ah2 != null) {
            ah2.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC3410wj
    public final void a(InterfaceC3332tj interfaceC3332tj) {
        kotlin.jvm.internal.s.h(interfaceC3332tj, "<set-?>");
        this.f25000c = interfaceC3332tj;
    }
}
