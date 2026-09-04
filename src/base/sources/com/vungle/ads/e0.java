package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e0 extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Sdk$SDKMetric.b metricType) {
        super(metricType);
        kotlin.jvm.internal.s.h(metricType, "metricType");
    }

    private final long calculateIntervalDuration() {
        long currentTime = getCurrentTime();
        Long valueSecond = getValueSecond();
        long jLongValue = valueSecond != null ? valueSecond.longValue() : currentTime;
        Long valueFirst = getValueFirst();
        if (valueFirst != null) {
            currentTime = valueFirst.longValue();
        }
        return (jLongValue - currentTime) / ((long) 1000000);
    }

    private final long getCurrentTime() {
        return System.nanoTime();
    }

    @Override // com.vungle.ads.s
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
