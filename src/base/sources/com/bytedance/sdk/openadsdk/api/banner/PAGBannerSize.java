package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.qor;
import com.google.api.client.http.HttpStatusCodes;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class PAGBannerSize {
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13220hn;
    private int hnj;
    private int qor = 1;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i10, int i11) {
        this.hnj = i10;
        this.f13220hn = i11;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        int iHnj = qor.hnj(context, i10, 0);
        if (iHnj == qor.hnj) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, iHnj);
        pAGBannerSize.qor = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iHnj = qor.hnj(context, 0);
        if (iHnj == qor.hnj) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.gjv = iHnj;
        pAGBannerSize.qor = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.gjv = i11;
        pAGBannerSize.qor = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.f13220hn;
    }

    public int getMaxHeight() {
        return this.gjv;
    }

    public int getType() {
        return this.qor;
    }

    public int getWidth() {
        return this.hnj;
    }
}
