package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class x extends d0 {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.s.h(metricType, "metricType");
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }
}
