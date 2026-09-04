package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f22091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bd.a.b f22092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppMeasurementSdk f22093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f22094d;

    public d(AppMeasurementSdk appMeasurementSdk, bd.a.b bVar) {
        this.f22092b = bVar;
        this.f22093c = appMeasurementSdk;
        c cVar = new c(this);
        this.f22094d = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(cVar);
        this.f22091a = new HashSet();
    }

    final /* synthetic */ bd.a.b a() {
        return this.f22092b;
    }
}
