package com.google.android.gms.auth;

import android.os.IBinder;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzi implements zzk {
    final /* synthetic */ AccountChangeEventsRequest zza;

    zzi(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws IOException {
        AccountChangeEventsResponse accountChangeEventsResponseZzh = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzh(this.zza);
        zzl.zzc(accountChangeEventsResponseZzh);
        return accountChangeEventsResponseZzh.getEvents();
    }
}
