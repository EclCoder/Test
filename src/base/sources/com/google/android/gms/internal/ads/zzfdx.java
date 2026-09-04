package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfdx implements zzfck {
    final zzhcg zza;

    public zzfdx(zzbhe zzbheVar, zzhcg zzhcgVar, Context context) {
        this.zza = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfdy(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 45;
    }
}
