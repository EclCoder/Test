package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class NativeBannerAd extends NativeAdBase {
    private final NativeBannerAdApi mNativeBannerAdApi;

    public NativeBannerAd(Context context, String str) {
        super(context, str);
        this.mNativeBannerAdApi = DynamicLoaderFactory.makeLoader(context).createNativeBannerAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, mediaView);
    }

    public NativeBannerAd(Context context, NativeAdBaseApi nativeAdBaseApi) {
        super(nativeAdBaseApi);
        this.mNativeBannerAdApi = DynamicLoaderFactory.makeLoader(context).createNativeBannerAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, mediaView, list);
    }

    public void registerViewForInteraction(View view, ImageView imageView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, imageView);
    }

    public void registerViewForInteraction(View view, ImageView imageView, List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view, imageView, list);
    }
}
