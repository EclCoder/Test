package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.internal.ads.zzbuy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb {
    private static volatile zzch zza;

    private zzb() {
    }

    public static zzch zza(Context context) {
        if (zza == null) {
            synchronized (zzb.class) {
                try {
                    if (zza == null) {
                        zza = zzay.zzb().zzd(context, new zzbuy());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zza;
    }
}
