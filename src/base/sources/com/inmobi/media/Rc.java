package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Rc extends AbstractC3410wj implements Ah, Tk, InterfaceC2950f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3332tj f25635c;

    /* JADX WARN: Illegal instructions before constructor call */
    public Rc(Mc nativeAdUnitComponent) {
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        C3416x adComponent = nativeAdUnitComponent.f25267a;
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        super(adComponent.f27822a.f27107e);
        this.f25635c = new C2887cd(nativeAdUnitComponent, this);
    }

    @Override // com.inmobi.media.AbstractC3410wj
    public final InterfaceC3332tj a() {
        return this.f25635c;
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        InterfaceC3332tj interfaceC3332tj = this.f25635c;
        Tk tk2 = interfaceC3332tj instanceof Tk ? (Tk) interfaceC3332tj : null;
        if (tk2 != null) {
            tk2.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC2950f
    public final Object a(kl.f fVar) {
        InterfaceC3332tj interfaceC3332tj = this.f25635c;
        InterfaceC2950f interfaceC2950f = interfaceC3332tj instanceof InterfaceC2950f ? (InterfaceC2950f) interfaceC3332tj : null;
        if (interfaceC2950f == null) {
            return fl.g0.f38750a;
        }
        Object objA = interfaceC2950f.a(fVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    @Override // com.inmobi.media.Ah
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.s.h(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3332tj interfaceC3332tj = this.f25635c;
        Ah ah2 = interfaceC3332tj instanceof Ah ? (Ah) interfaceC3332tj : null;
        if (ah2 != null) {
            ah2.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC3410wj
    public final void a(InterfaceC3332tj interfaceC3332tj) {
        kotlin.jvm.internal.s.h(interfaceC3332tj, "<set-?>");
        this.f25635c = interfaceC3332tj;
    }
}
