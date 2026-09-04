package com.google.android.gms.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zza;

    AdFormat(int i10) {
        this.zza = i10;
    }

    public static AdFormat getAdFormat(int i10) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i10) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zza;
    }
}
