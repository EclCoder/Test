package com.facebook.ads.internal.api;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface NativeAdViewTypeApi {
    public static final int HEIGHT_100 = 0;
    public static final int HEIGHT_120 = 1;

    @Deprecated
    public static final int HEIGHT_300 = 2;

    @Deprecated
    public static final int HEIGHT_400 = 3;
    public static final int HEIGHT_50 = 4;
    public static final int RECT_DYNAMIC = 5;

    int getHeight();

    int getValue();

    int getWidth();
}
