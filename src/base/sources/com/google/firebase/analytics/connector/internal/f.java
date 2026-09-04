package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bd.a.b f22096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppMeasurementSdk f22097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f22098c;

    public f(AppMeasurementSdk appMeasurementSdk, bd.a.b bVar) {
        this.f22096a = bVar;
        this.f22097b = appMeasurementSdk;
        e eVar = new e(this);
        this.f22098c = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(eVar);
    }

    final /* synthetic */ bd.a.b a() {
        return this.f22096a;
    }
}
