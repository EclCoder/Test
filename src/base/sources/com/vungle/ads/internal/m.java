package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m extends g implements com.vungle.ads.internal.presenter.n {
    private String alertBodyText;
    private String alertCloseButtonText;
    private String alertContinueButtonText;
    private String alertTitleText;
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        s.h(context, "context");
    }

    @Override // com.vungle.ads.internal.presenter.n
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.n
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.n
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.n
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.n
    public String getUserId() {
        return this.userId;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(Placement placement) {
        s.h(placement, "placement");
        return placement.isRewardedVideo();
    }

    public final void setAlertBodyText$vungle_ads_release(String str) {
        this.alertBodyText = str;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(String str) {
        this.alertCloseButtonText = str;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(String str) {
        this.alertContinueButtonText = str;
    }

    public final void setAlertTitleText$vungle_ads_release(String str) {
        this.alertTitleText = str;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    @Override // com.vungle.ads.internal.g
    public com.vungle.ads.internal.presenter.n getPresenterDelegate() {
        return this;
    }
}
