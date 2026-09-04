package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzciu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcja zze;

    zzciu(zzcja zzcjaVar, String str, String str2, int i10, int i11, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        Objects.requireNonNull(zzcjaVar);
        this.zze = zzcjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bytesLoaded", Integer.toString(this.zzc));
        map.put("totalBytes", Integer.toString(this.zzd));
        map.put("cacheReady", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        this.zze.zzw("onPrecacheEvent", map);
    }
}
