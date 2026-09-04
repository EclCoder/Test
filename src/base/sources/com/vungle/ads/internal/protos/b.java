package com.vungle.ads.internal.protos;

import com.google.protobuf.s0;
import com.google.protobuf.t0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface b extends t0 {
    @Override // com.google.protobuf.t0
    /* synthetic */ s0 getDefaultInstanceForType();

    Sdk$SDKMetric getMetrics(int i10);

    int getMetricsCount();

    List<Sdk$SDKMetric> getMetricsList();

    @Override // com.google.protobuf.t0
    /* synthetic */ boolean isInitialized();
}
