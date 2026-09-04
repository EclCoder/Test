package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zze {
    private final zzji zza;

    zze(zzji zzjiVar) {
        this.zza = zzjiVar;
    }

    static zze zzc(String str) {
        return new zze((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : zzjl.zzj(str.charAt(0)));
    }

    final zzji zza() {
        return this.zza;
    }

    final String zzb() {
        return String.valueOf(zzjl.zzm(this.zza));
    }
}
