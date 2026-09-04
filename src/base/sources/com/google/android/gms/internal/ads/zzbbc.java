package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbbc implements zzbbg {
    final /* synthetic */ Activity zza;

    zzbbc(zzbbh zzbbhVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbg
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.zza);
    }
}
