package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbfm implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbfq zzb;

    zzbfm(zzbfq zzbfqVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbfqVar);
        this.zzb = zzbfqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
