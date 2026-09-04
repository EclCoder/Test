package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f22090a;

    public c(d dVar) {
        Objects.requireNonNull(dVar);
        this.f22090a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        d dVar = this.f22090a;
        if (dVar.f22091a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i10 = b.f22089g;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            dVar.a().a(2, bundle2);
        }
    }
}
