package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbta implements zzbpq {
    final /* synthetic */ zzbsp zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbv zzb;
    final /* synthetic */ zzbtu zzc;

    zzbta(zzbtu zzbtuVar, zzbap zzbapVar, zzbsp zzbspVar, com.google.android.gms.ads.internal.util.zzbv zzbvVar) {
        this.zza = zzbspVar;
        this.zzb = zzbvVar;
        Objects.requireNonNull(zzbtuVar);
        this.zzc = zzbtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbtu zzbtuVar = this.zzc;
        synchronized (zzbtuVar.zzg()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                com.google.android.gms.ads.internal.util.client.zzo.zzh("JS Engine is requesting an update");
                if (zzbtuVar.zzk() == 0) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh(jyeoXJ.iqsfDkg);
                    zzbtuVar.zzl(2);
                    zzbtuVar.zza(null);
                }
                this.zza.zzn("/requestReload", (zzbpq) this.zzb.zza());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
