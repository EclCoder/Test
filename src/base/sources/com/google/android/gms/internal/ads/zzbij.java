package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbij {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_adapter_flags", 0);
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
            return null;
        }
    }

    public static final SharedPreferences zzb(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
            return null;
        }
    }
}
