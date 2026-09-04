package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcgk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcgr zzc;

    zzcgk(zzcgr zzcgrVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzcgrVar);
        this.zzc = zzcgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgr zzcgrVar = this.zzc;
        if (zzcgrVar.zzt() != null) {
            zzcgrVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}
