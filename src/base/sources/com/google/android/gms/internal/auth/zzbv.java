package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbv implements ProxyApi.SpatulaHeaderResult {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) Preconditions.checkNotNull(status);
        this.zzb = "";
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult
    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zza = Status.RESULT_SUCCESS;
    }
}
