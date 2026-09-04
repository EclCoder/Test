package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbav {
    private NetworkCapabilities zza;

    zzbav(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzbau(this));
            } catch (RuntimeException unused) {
                synchronized (zzbav.class) {
                    this.zza = null;
                }
            }
        }
    }

    public static zzbav zza(Context context) {
        if (context != null) {
            return new zzbav((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }

    public final long zzc() {
        synchronized (zzbav.class) {
            try {
                NetworkCapabilities networkCapabilities = this.zza;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.zza.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.zza.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void zzd(NetworkCapabilities networkCapabilities) {
        this.zza = networkCapabilities;
    }
}
