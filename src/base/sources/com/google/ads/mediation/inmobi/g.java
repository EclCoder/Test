package com.google.ads.mediation.inmobi;

import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static AdError a(int i10, String str) {
        return new AdError(i10, str, "com.google.ads.mediation.inmobi");
    }

    public static AdError b(int i10, String str) {
        return new AdError(i10, str, "com.inmobi.sdk");
    }
}
