package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class s {
    private String meta;
    private Sdk$SDKMetric.b metricType;

    public s(Sdk$SDKMetric.b metricType) {
        kotlin.jvm.internal.s.h(metricType, "metricType");
        this.metricType = metricType;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final Sdk$SDKMetric.b getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(String str) {
        this.meta = str;
    }

    public final void setMetricType(Sdk$SDKMetric.b bVar) {
        kotlin.jvm.internal.s.h(bVar, "<set-?>");
        this.metricType = bVar;
    }
}
