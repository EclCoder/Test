package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwd {
    private static UiModeManager zza;

    public static void zza(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static zzfuq zzb() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfuq.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? zzfuq.OTHER : zzfuq.CTV;
        }
        return zzfuq.MOBILE;
    }
}
