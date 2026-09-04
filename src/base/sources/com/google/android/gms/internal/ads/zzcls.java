package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcls implements Runnable {
    final /* synthetic */ zzclx zza;

    zzcls(zzclx zzclxVar) {
        Objects.requireNonNull(zzclxVar);
        this.zza = zzclxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
