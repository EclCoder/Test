package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjx {

    @Deprecated
    public static final Api zza;
    private static final Api.ClientKey zzb;
    private static final Api.AbstractClientBuilder zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzb = clientKey;
        zzjw zzjwVar = new zzjw();
        zzc = zzjwVar;
        zza = new Api("Phenotype.API", zzjwVar, clientKey);
    }

    public static zzkk zza(Context context) {
        return new zzkk(context);
    }
}
