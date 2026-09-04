package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjs {
    final Context zza;
    Boolean zzb;
    long zzc;
    com.google.android.gms.internal.measurement.zzdb zzd;
    boolean zze;
    final Long zzf;
    final Long zzg;
    String zzh;

    public zzjs(Context context, com.google.android.gms.internal.measurement.zzdb zzdbVar, Long l10, Long l11) {
        this.zze = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzf = l10;
        this.zzg = l11;
        if (zzdbVar != null) {
            this.zzd = zzdbVar;
            this.zze = zzdbVar.zzc;
            this.zzc = zzdbVar.zzb;
            this.zzh = zzdbVar.zze;
            Bundle bundle = zzdbVar.zzd;
            if (bundle != null) {
                this.zzb = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
