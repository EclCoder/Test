package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D5 f26160c;

    public Zn(AdConfig.VideoPlayerViewabilityConfig viewableConfig) {
        kotlin.jvm.internal.s.h(viewableConfig, "viewableConfig");
        this.f26158a = viewableConfig.getMinPercentageVisible();
        this.f26159b = viewableConfig.getPollingInterval();
        this.f26160c = AbstractC3463yl.a(viewableConfig.getMinDimensions());
    }
}
