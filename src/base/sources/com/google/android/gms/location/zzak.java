package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzak extends zzap {
    final /* synthetic */ ListenerHolder zza;
    final /* synthetic */ FusedLocationProviderClient zzb;

    zzak(FusedLocationProviderClient fusedLocationProviderClient, ListenerHolder listenerHolder) {
        this.zzb = fusedLocationProviderClient;
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(com.google.android.gms.internal.location.zzaz zzazVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        com.google.android.gms.internal.location.zzaz zzazVar2 = zzazVar;
        TaskCompletionSource<Boolean> taskCompletionSource2 = taskCompletionSource;
        if (zza()) {
            zzal zzalVar = new zzal(this.zzb, taskCompletionSource2);
            try {
                ListenerHolder.ListenerKey<LocationCallback> listenerKey = this.zza.getListenerKey();
                if (listenerKey != null) {
                    zzazVar2.zzH(listenerKey, zzalVar);
                }
            } catch (RuntimeException e10) {
                taskCompletionSource2.trySetException(e10);
            }
        }
    }
}
