package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AdView extends RelativeLayout implements Ad {
    private final AdViewApi mAdViewApi;
    private final AdViewParentApi mAdViewParentApi;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface AdViewLoadConfig extends Ad.LoadAdConfig {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface AdViewLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        AdViewLoadConfig build();

        AdViewLoadConfigBuilder withAdListener(AdListener adListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        AdViewLoadConfigBuilder withBid(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AdViewParentApi {
        a() {
        }

        @Override // com.facebook.ads.internal.api.AdViewParentApi
        public void onConfigurationChanged(Configuration configuration) {
            AdView.super.onConfigurationChanged(configuration);
        }
    }

    public AdView(Context context, String str, AdSize adSize) {
        super(context);
        a aVar = new a();
        this.mAdViewParentApi = aVar;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, adSize, aVar, this);
    }

    public AdViewLoadConfigBuilder buildLoadAdConfig() {
        return this.mAdViewApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mAdViewApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mAdViewApi.getPlacementId();
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mAdViewApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mAdViewApi.loadAd();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        this.mAdViewApi.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mAdViewApi.setExtraHints(extraHints);
    }

    public void loadAd(AdViewLoadConfig adViewLoadConfig) {
        this.mAdViewApi.loadAd(adViewLoadConfig);
    }

    public AdView(Context context, String str, String str2) {
        super(context);
        a aVar = new a();
        this.mAdViewParentApi = aVar;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, str2, aVar, this);
    }
}
