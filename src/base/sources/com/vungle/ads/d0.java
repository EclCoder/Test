package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d0 extends s {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.s.h(metricType, "metricType");
    }

    public final void addValue(long j10) {
        Long l10 = this.value;
        this.value = Long.valueOf((l10 != null ? l10.longValue() : 0L) + j10);
    }

    /* JADX INFO: renamed from: getValue, reason: collision with other method in class */
    public final Long m55getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l10) {
        this.value = l10;
    }

    @Override // com.vungle.ads.s
    public long getValue() {
        Long l10 = this.value;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }
}
