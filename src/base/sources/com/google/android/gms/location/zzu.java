package com.google.android.gms.location;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzu {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    public static final Feature zzd;
    public static final Feature zze;
    public static final Feature[] zzf;

    static {
        Feature feature = new Feature("name_ulr_private", 1L);
        zza = feature;
        Feature feature2 = new Feature("name_sleep_segment_request", 1L);
        zzb = feature2;
        Feature feature3 = new Feature("support_context_feature_id", 1L);
        zzc = feature3;
        Feature feature4 = new Feature("get_current_location", 1L);
        zzd = feature4;
        Feature feature5 = new Feature("get_last_activity_feature_id", 1L);
        zze = feature5;
        zzf = new Feature[]{feature, feature2, feature3, feature4, feature5};
    }
}
