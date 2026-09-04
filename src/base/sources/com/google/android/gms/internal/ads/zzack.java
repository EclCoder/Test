package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzack implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ Runnable zza;

    zzack(zzacm zzacmVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzacmVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.run();
    }
}
