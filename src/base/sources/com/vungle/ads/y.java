package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class y extends e0 {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.s.h(metricType, "metricType");
    }

    public final boolean alreadyMetered$vungle_ads_release() {
        return (getValueFirst() == null || getValueSecond() == null) ? false : true;
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    @Override // com.vungle.ads.e0
    public void markEnd() {
        if (getValueSecond() == null) {
            super.markEnd();
        }
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    @Override // com.vungle.ads.e0
    public void markStart() {
        if (getValueFirst() == null) {
            super.markStart();
        }
    }
}
