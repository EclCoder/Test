package com.inmobi.media;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3230pk f24483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Si f24484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bk f24485c;

    public Ak(C3230pk telemetryConfigMetaData, List samplingEvents) {
        kotlin.jvm.internal.s.h(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.s.h(samplingEvents, "samplingEvents");
        this.f24483a = telemetryConfigMetaData;
        double dRandom = Math.random();
        this.f24484b = new Si(telemetryConfigMetaData, dRandom, samplingEvents);
        this.f24485c = new Bk(telemetryConfigMetaData, dRandom);
    }
}
