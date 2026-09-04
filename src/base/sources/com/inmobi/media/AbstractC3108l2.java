package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3108l2 implements InterfaceC3332tj, InterfaceC2976g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3288s1 f26915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8 f26916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ic f26917c;

    public AbstractC3108l2(AbstractC3288s1 abstractC3288s1, A8 adManagerComponent, Ic stateMachine) {
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f26915a = abstractC3288s1;
        this.f26916b = adManagerComponent;
        this.f26917c = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2976g
    public final void j() {
        this.f26917c.a(new C3370v5(this.f26916b), this);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }
}
