package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3230pk f24560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f24561b;

    public Bk(C3230pk telemetryConfigMetaData, double d10) {
        kotlin.jvm.internal.s.h(telemetryConfigMetaData, "telemetryConfigMetaData");
        this.f24560a = telemetryConfigMetaData;
        this.f24561b = d10;
    }

    public final int a(String eventType) {
        kotlin.jvm.internal.s.h(eventType, "eventType");
        if (this.f24561b >= this.f24560a.f27277g) {
            return 0;
        }
        C3178nk c3178nk = C3178nk.f27064a;
        return 2;
    }
}
