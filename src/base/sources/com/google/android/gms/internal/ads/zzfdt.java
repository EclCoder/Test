package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdt implements zzfck {
    private final zzcfd zza;
    private final ScheduledExecutorService zzb;
    private final zzhcg zzc;

    zzfdt(String str, zzbgs zzbgsVar, zzcfd zzcfdVar, ScheduledExecutorService scheduledExecutorService, zzhcg zzhcgVar) {
        this.zza = zzcfdVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdP)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdU)).booleanValue()) {
                ListenableFuture listenableFutureZza = zzgcs.zza(Tasks.forResult(null), null);
                zzhcg zzhcgVar = this.zzc;
                ListenableFuture listenableFutureZzj = zzhbw.zzj(listenableFutureZza, zzfds.zza, zzhcgVar);
                if (((Boolean) zzbkd.zza.zze()).booleanValue()) {
                    listenableFutureZzj = zzhbw.zzi(listenableFutureZzj, ((Long) zzbkd.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzhbw.zzg(listenableFutureZzj, Exception.class, new zzgta() { // from class: com.google.android.gms.internal.ads.zzfdr
                    @Override // com.google.android.gms.internal.ads.zzgta
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzhcgVar);
            }
        }
        return zzhbw.zza(new zzfdu(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 43;
    }

    final /* synthetic */ zzfdu zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfdu(null, -1);
    }
}
