package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzcfu;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd {
    public static void zza(Context context) {
        int i10 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbkm.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                ListenableFuture listenableFutureZzb = new zzc(context).zzb();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                zzcfu.zza(listenableFutureZzb, "AdDebugLogUpdater.updateEnablement", zzcfr.zzh);
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e10);
            }
        }
    }
}
