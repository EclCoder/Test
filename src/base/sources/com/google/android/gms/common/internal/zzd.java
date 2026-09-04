package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd extends zzz {
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(BaseGmsClient baseGmsClient, int i10) {
        this.zza = baseGmsClient;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i10, IBinder iBinder, Bundle bundle) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i10, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i10, IBinder iBinder, zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzjVar);
        baseGmsClient.zzc(zzjVar);
        onPostInitComplete(i10, iBinder, zzjVar.zza);
    }
}
