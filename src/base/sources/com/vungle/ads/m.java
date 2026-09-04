package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m extends s {
    private Long valueFirst;
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.s.h(metricType, "metricType");
    }

    public final Long getValueFirst() {
        return this.valueFirst;
    }

    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(Long l10) {
        this.valueFirst = l10;
    }

    public final void setValueSecond(Long l10) {
        this.valueSecond = l10;
    }
}
