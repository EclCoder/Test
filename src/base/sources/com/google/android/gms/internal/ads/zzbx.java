package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbx extends BroadcastReceiver {
    private final zzdz zza;

    /* synthetic */ zzbx(zzbz zzbzVar, zzdz zzdzVar, zzby zzbyVar, byte[] bArr) {
        Objects.requireNonNull(zzbzVar);
        this.zza = zzdzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.zzm(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                }
            });
        }
    }
}
