package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzeuo implements zzhbe {
    static final /* synthetic */ zzeuo zza = new zzeuo();

    private /* synthetic */ zzeuo() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzhbw.zza(new zzeur(Integer.toString(17))) : zzhbw.zza(new zzeur(null));
    }
}
