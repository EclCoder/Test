package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public enum zzjj {
    STORAGE(zzjk.AD_STORAGE, zzjk.ANALYTICS_STORAGE),
    DMA(zzjk.AD_USER_DATA);

    private final zzjk[] zzc;

    zzjj(zzjk... zzjkVarArr) {
        this.zzc = zzjkVarArr;
    }

    public final zzjk[] zza() {
        return this.zzc;
    }

    final /* synthetic */ zzjk[] zzb() {
        return this.zzc;
    }
}
