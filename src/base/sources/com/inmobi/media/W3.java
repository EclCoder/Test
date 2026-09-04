package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class W3 extends X7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f25924n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(AdConfig.ViewabilityConfig viewabilityConfig, InterfaceC3322t9 interfaceC3322t9) {
        super(viewabilityConfig, (byte) 1, interfaceC3322t9);
        C3268r7 visibilityChecker = C3346u7.f27601k;
        kotlin.jvm.internal.s.h(visibilityChecker, "visibilityChecker");
        this.f25924n = 500;
    }

    @Override // com.inmobi.media.X7, com.inmobi.media.AbstractC3104ko
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f24866l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.f25924n;
    }
}
