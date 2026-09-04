package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class NativeBannerAdView {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum Type {
        HEIGHT_50(4),
        HEIGHT_100(0),
        HEIGHT_120(1);

        private final int mEnumCode;
        private NativeAdViewTypeApi mNativeAdViewTypeApi;

        Type(int i10) {
            this.mEnumCode = i10;
        }

        private NativeAdViewTypeApi getNativeAdViewTypeApi() {
            if (this.mNativeAdViewTypeApi == null) {
                this.mNativeAdViewTypeApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewTypeApi(this.mEnumCode);
            }
            return this.mNativeAdViewTypeApi;
        }

        public int getEnumCode() {
            return this.mEnumCode;
        }

        public int getHeight() {
            return getNativeAdViewTypeApi().getHeight();
        }

        public int getValue() {
            return getNativeAdViewTypeApi().getValue();
        }

        public int getWidth() {
            return getNativeAdViewTypeApi().getWidth();
        }
    }

    public static View render(Context context, NativeBannerAd nativeBannerAd, Type type) {
        Preconditions.checkNotNull(context, "context must be not null");
        Preconditions.checkNotNull(nativeBannerAd, "nativeBannerAd must be not null");
        Preconditions.checkNotNull(type, "type must be not null");
        return DynamicLoaderFactory.makeLoader(context).createNativeBannerAdViewApi().render(context, nativeBannerAd, type, null);
    }

    public static View render(Context context, NativeBannerAd nativeBannerAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        Preconditions.checkNotNull(context, "context must be not null");
        Preconditions.checkNotNull(nativeBannerAd, "nativeBannerAd must be not null");
        Preconditions.checkNotNull(type, "type must be not null");
        return DynamicLoaderFactory.makeLoader(context).createNativeBannerAdViewApi().render(context, nativeBannerAd, type, nativeAdViewAttributes);
    }
}
