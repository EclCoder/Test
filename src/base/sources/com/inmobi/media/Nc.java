package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Nc implements Io, InterfaceC2950f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f25343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rc f25344b;

    public Nc(Mc nativeAdUnitComponent) {
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.f25343a = nativeAdUnitComponent;
        this.f25344b = new Rc(nativeAdUnitComponent);
    }

    public final void a() {
        InterfaceC3332tj interfaceC3332tj = this.f25344b.f25635c;
        Be be2 = interfaceC3332tj instanceof Be ? (Be) interfaceC3332tj : null;
        if (be2 != null) {
            InterfaceC3322t9 interfaceC3322t9L = be2.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "takeAction");
            }
            ((C3274rd) be2.f24536b.f24611p.getValue()).b();
        }
    }

    @Override // com.inmobi.media.Io
    public final String a(double d10) {
        return Ho.a(this.f25343a.f25267a, d10);
    }

    @Override // com.inmobi.media.Io
    public final String a(int i10, double d10) {
        return Ho.a(this.f25343a.f25267a, i10, d10);
    }

    @Override // com.inmobi.media.InterfaceC2950f
    public final Object a(kl.f fVar) {
        Object objA = this.f25344b.a(fVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }
}
