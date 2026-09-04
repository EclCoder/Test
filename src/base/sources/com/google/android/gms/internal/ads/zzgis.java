package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgis extends zzgix {
    private final Context zza;
    private final Map zzb;

    zzgis(zzaxm zzaxmVar, zzght zzghtVar, Map map, Context context, zzgqh zzgqhVar) {
        super("LdJAK+tGLa5RtfoE4Vj1lf7WBx7tLt5NokheHxJZ8WRPF5i3vkHONYq7jawQpmfE", "i59R9TSjiUVrKRVh1QlIoomNztzQtHmvvEjkodMX8Xo=", zzaxmVar, zzghtVar, zzgqhVar.zza(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l10 = (Long) method.invoke("", this.zza);
                if (l10 == null) {
                    throw null;
                }
                lValueOf = l10;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) this.zzb.get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    lValueOf = Long.valueOf(((zzaym) listenableFuture.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzaxmVar) {
            zzaxmVar.zzR(lValueOf.longValue());
        }
    }
}
