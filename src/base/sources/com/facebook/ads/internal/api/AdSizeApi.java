package com.facebook.ads.internal.api;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface AdSizeApi {

    @Deprecated
    public static final int BANNER_320_50 = 4;
    public static final int BANNER_HEIGHT_50 = 5;
    public static final int BANNER_HEIGHT_90 = 6;
    public static final int INTERSTITIAL = 100;
    public static final int RECTANGLE_HEIGHT_250 = 7;

    int getHeight();

    int getWidth();
}
