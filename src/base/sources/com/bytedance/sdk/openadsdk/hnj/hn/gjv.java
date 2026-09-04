package com.bytedance.sdk.openadsdk.hnj.hn;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements PAGNativeAdData {
    private final hnj hnj;

    public gjv(hnj hnjVar) {
        this.hnj = hnjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        hnj hnjVar = this.hnj;
        if (hnjVar != null) {
            return hnjVar.dnm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        hnj hnjVar = this.hnj;
        if (hnjVar != null) {
            return hnjVar.ta();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        hnj hnjVar = this.hnj;
        if (hnjVar != null) {
            return hnjVar.dkl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        hnj hnjVar = this.hnj;
        if (hnjVar != null) {
            return hnjVar.sk();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        hnj hnjVar = this.hnj;
        if (hnjVar != null) {
            return hnjVar.qor();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return as.sk(this.hnj.hnj) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        hnj hnjVar = this.hnj;
        if (hnjVar != null) {
            return hnjVar.dse();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        hnj hnjVar = this.hnj;
        if (hnjVar != null) {
            return hnjVar.gjv();
        }
        return null;
    }
}
