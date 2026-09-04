package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpr implements zzgpe, zzgfd {
    private final Context zza;
    private final ExecutorService zzb;
    private NetworkCapabilities zzc = null;

    zzgpr(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final ListenableFuture zza() {
        return zzhbw.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        }, this.zzb);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0035 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x000a, B:9:0x000e, B:11:0x0015, B:15:0x001b, B:17:0x0024, B:19:0x0028, B:21:0x0031, B:23:0x0035), top: B:34:0x000a }] */
    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(Map map) {
        NetworkCapabilities networkCapabilities;
        long j10;
        synchronized (this) {
            networkCapabilities = this.zzc;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.zzc;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j10 = 2;
                    } else if (this.zzc.hasTransport(1)) {
                        j10 = 1;
                    } else {
                        j10 = this.zzc.hasTransport(0) ? 0L : -1L;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        map.put("nt", Long.valueOf(j10));
    }

    final /* synthetic */ void zze() {
        zzgpp zzgppVar = new zzgpp(this);
        try {
            Object systemService = this.zza.getSystemService("connectivity");
            if (systemService == null) {
                throw null;
            }
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(zzgppVar);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void zzf(NetworkCapabilities networkCapabilities) {
        this.zzc = networkCapabilities;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzc(Map map, Context context, View view) {
    }
}
