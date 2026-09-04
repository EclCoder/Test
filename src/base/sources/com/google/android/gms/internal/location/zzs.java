package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzs extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ LocationListener zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.zza = locationRequest;
        this.zzb = locationListener;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzaz) anyClient).zzC(this.zza, ListenerHolders.createListenerHolder(this.zzb, zzbj.zza(this.zzc), LocationListener.class.getSimpleName()), new zzy(this));
    }
}
