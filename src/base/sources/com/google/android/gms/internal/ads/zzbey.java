package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbey implements zzbfd {
    final /* synthetic */ Activity zza;

    zzbey(zzbfe zzbfeVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbfeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
