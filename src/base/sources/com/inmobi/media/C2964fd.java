package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2964fd implements InterfaceC3332tj, InterfaceC2950f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f26548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiAdRequestStatus f26549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mc f26550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rc f26551d;

    public C2964fd(short s10, InMobiAdRequestStatus status, Mc nativeAdUnitComponent, Rc stateMachine) {
        kotlin.jvm.internal.s.h(status, "status");
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f26548a = s10;
        this.f26549b = status;
        this.f26550c = nativeAdUnitComponent;
        this.f26551d = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() {
        C3348u9 c3348u9 = this.f26550c.f25267a.f27822a.f27105c;
        if (c3348u9 != null) {
            c3348u9.a("NativeFailedState", "Initialize Called");
        }
        this.f26550c.f25269c.a(this.f26549b, this.f26548a);
    }

    @Override // com.inmobi.media.InterfaceC2950f
    public final Object a(kl.f fVar) {
        C3348u9 c3348u9 = this.f26550c.f25267a.f27822a.f27105c;
        if (c3348u9 != null) {
            c3348u9.a("NativeFailedState", "onDestroy");
        }
        Object objA = this.f26551d.a(new C2913dd(), this, (kotlin.coroutines.jvm.internal.d) fVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }
}
