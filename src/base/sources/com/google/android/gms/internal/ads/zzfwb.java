package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfwb implements Runnable {
    final /* synthetic */ zzfwc zza;
    private final WebView zzb;

    zzfwb(zzfwc zzfwcVar) {
        Objects.requireNonNull(zzfwcVar);
        this.zza = zzfwcVar;
        this.zzb = zzfwcVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
