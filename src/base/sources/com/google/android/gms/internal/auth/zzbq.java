package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbq extends zzbi {
    final /* synthetic */ ProxyRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(zzbt zzbtVar, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.zza = proxyRequest;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    protected final void zza(Context context, zzbh zzbhVar) {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}
