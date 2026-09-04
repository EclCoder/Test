package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: renamed from: com.inmobi.media.jd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3067jd extends V6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3185o1 f26802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC3288s1 f26803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Pc f26804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ic f26805r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3067jd(C3185o1 adManagerComponent, AbstractC3288s1 adUnitTimeout, Ic stateMachine, Pc nativeCallback) {
        super(adManagerComponent, adUnitTimeout, stateMachine, nativeCallback);
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.s.h(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f26802o = adManagerComponent;
        this.f26803p = adUnitTimeout;
        this.f26804q = nativeCallback;
        this.f26805r = stateMachine;
    }

    @Override // com.inmobi.media.V6
    public final void a(AdResponse obj) {
        kotlin.jvm.internal.s.h(obj, "adResponse");
        C3348u9 c3348u9 = this.f26426e;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.h(obj, "obj");
            c3348u9.a("AUM-NativeFetchingState", "onAdResponseParseSuccess " + AbstractC3323ta.a(obj, AdResponse.class));
        }
        S0.a(this.f26802o, obj, new C3016hd(this), new C3042id(this));
    }
}
