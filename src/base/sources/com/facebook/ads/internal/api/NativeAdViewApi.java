package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface NativeAdViewApi {
    View render(Context context, NativeAd nativeAd);

    @Deprecated
    View render(Context context, NativeAd nativeAd, NativeAdView.Type type);

    @Deprecated
    View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes);

    View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes);
}
