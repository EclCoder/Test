package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends k {
    public /* synthetic */ b0(Context context, String str, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? new b() : bVar);
    }

    private final com.vungle.ads.internal.m getRewardedAdInternal() {
        com.vungle.ads.internal.a adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        kotlin.jvm.internal.s.f(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        return (com.vungle.ads.internal.m) adInternal$vungle_ads_release;
    }

    public final void setAlertBodyText(String bodyText) {
        kotlin.jvm.internal.s.h(bodyText, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(bodyText);
    }

    public final void setAlertCloseButtonText(String closeButtonText) {
        kotlin.jvm.internal.s.h(closeButtonText, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(closeButtonText);
    }

    public final void setAlertContinueButtonText(String continueButtonText) {
        kotlin.jvm.internal.s.h(continueButtonText, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(continueButtonText);
    }

    public final void setAlertTitleText(String titleText) {
        kotlin.jvm.internal.s.h(titleText, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(titleText);
    }

    public final void setUserId(String userId) {
        kotlin.jvm.internal.s.h(userId, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, String placementId, b adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placementId, "placementId");
        kotlin.jvm.internal.s.h(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.i
    public com.vungle.ads.internal.m constructAdInternal$vungle_ads_release(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        return new com.vungle.ads.internal.m(context);
    }
}
