package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpp extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgpr zza;

    zzgpp(zzgpr zzgprVar) {
        Objects.requireNonNull(zzgprVar);
        this.zza = zzgprVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgpr zzgprVar = this.zza;
        synchronized (zzgprVar) {
            zzgprVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgpr zzgprVar = this.zza;
        synchronized (zzgprVar) {
            zzgprVar.zzf(null);
        }
    }
}
