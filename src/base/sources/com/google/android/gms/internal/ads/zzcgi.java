package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcgi implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcgr zzb;

    zzcgi(zzcgr zzcgrVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcgrVar);
        this.zzb = zzcgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgr zzcgrVar = this.zzb;
        zzcgrVar.zzs(this.zza);
        if (zzcgrVar.zzt() != null) {
            zzcgrVar.zzt().zzb();
        }
    }
}
