package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwh {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfwg(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfwd.zzb() != zzfuq.CTV) {
            return 2;
        }
        return zza;
    }
}
