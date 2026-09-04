package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzcsb implements zzhbe {
    static final /* synthetic */ zzcsb zza = new zzcsb();

    private /* synthetic */ zzcsb() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlQ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzhbw.zza(new androidx.privacysandbox.ads.adservices.topics.c(zzgwm.zzi()));
    }
}
