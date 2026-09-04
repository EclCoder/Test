package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcgx implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzchb zzb;

    zzcgx(zzchb zzchbVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzchbVar);
        this.zzb = zzchbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
