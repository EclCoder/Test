package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgcm {
    private static zzgcm zzb;
    final zzgci zza;

    private zzgcm(Context context) {
        this.zza = zzgci.zza(context);
        zzgch.zza(context);
    }

    public static final zzgcm zza(Context context) {
        zzgcm zzgcmVar;
        synchronized (zzgcm.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgcm(context);
                }
                zzgcmVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgcmVar;
    }

    public final void zzb(zzgcg zzgcgVar) {
        synchronized (zzgcm.class) {
            zzgci zzgciVar = this.zza;
            zzgciVar.zzf("vendor_scoped_gpid_v2_id");
            zzgciVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
