package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleError;
import com.vungle.ads.f0;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.util.a0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends com.vungle.ads.internal.a {
    private final f0 adSize;
    private f0 updatedAdSize;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends com.vungle.ads.internal.presenter.c {
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.vungle.ads.internal.presenter.b bVar, c cVar) {
            super(bVar);
            this.this$0 = cVar;
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            this.this$0.setAdState(com.vungle.ads.internal.a.EnumC0494a.FINISHED);
            super.onAdEnd(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdImpression(String str) {
            this.this$0.setAdState(com.vungle.ads.internal.a.EnumC0494a.IMPRESSION_LOGGED);
            super.onAdImpression(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) {
            this.this$0.setAdState(com.vungle.ads.internal.a.EnumC0494a.PLAYING);
            super.onAdStart(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onFailure(VungleError error) {
            s.h(error, "error");
            this.this$0.setAdState(com.vungle.ads.internal.a.EnumC0494a.ERROR);
            super.onFailure(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, f0 adSize) {
        super(context);
        s.h(context, "context");
        s.h(adSize, "adSize");
        this.adSize = adSize;
    }

    @Override // com.vungle.ads.internal.a
    public void adLoadedAndUpdateConfigure$vungle_ads_release(com.vungle.ads.internal.model.b advertisement) {
        s.h(advertisement, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        com.vungle.ads.internal.util.p logEntry$vungle_ads_release = getLogEntry$vungle_ads_release();
        Long adLoadType$vungle_ads_release = logEntry$vungle_ads_release != null ? logEntry$vungle_ads_release.getAdLoadType$vungle_ads_release() : null;
        if ((adLoadType$vungle_ads_release != null && adLoadType$vungle_ads_release.longValue() == 3) || (adLoadType$vungle_ads_release != null && adLoadType$vungle_ads_release.longValue() == 4)) {
            sendWinURL();
        }
        if (this.adSize.isAdaptiveWidth$vungle_ads_release() || this.adSize.isAdaptiveHeight$vungle_ads_release()) {
            fl.q deviceWidthAndHeightWithOrientation = a0.INSTANCE.getDeviceWidthAndHeightWithOrientation(getContext(), 0);
            int iIntValue = ((Number) deviceWidthAndHeightWithOrientation.d()).intValue();
            int iIntValue2 = ((Number) deviceWidthAndHeightWithOrientation.g()).intValue();
            int iAdWidth = this.adSize.isAdaptiveWidth$vungle_ads_release() ? advertisement.adWidth() : this.adSize.getWidth();
            int iAdHeight = this.adSize.isAdaptiveHeight$vungle_ads_release() ? advertisement.adHeight() : this.adSize.getHeight();
            int iMin = Math.min(iIntValue, iAdWidth);
            int iMin2 = Math.min(iIntValue2, iAdHeight);
            if (this.adSize.isAdaptiveHeight$vungle_ads_release() && this.adSize.getHeight() > 0) {
                iMin2 = Math.min(this.adSize.getHeight(), iMin2);
            }
            this.updatedAdSize = new f0(iMin, iMin2);
        }
    }

    @Override // com.vungle.ads.internal.a
    public f0 getAdSizeForAdRequest() {
        return this.adSize;
    }

    public final f0 getUpdatedAdSize$vungle_ads_release() {
        return this.updatedAdSize;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdSize(f0 f0Var) {
        if (f0Var != null) {
            return f0Var.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(Placement placement) {
        s.h(placement, "placement");
        return placement.isBanner() || placement.isMREC() || placement.isInline();
    }

    public final void setUpdatedAdSize$vungle_ads_release(f0 f0Var) {
        this.updatedAdSize = f0Var;
    }

    public final com.vungle.ads.internal.presenter.c wrapCallback$vungle_ads_release(com.vungle.ads.internal.presenter.b adPlayCallback) {
        s.h(adPlayCallback, "adPlayCallback");
        return new a(adPlayCallback, this);
    }
}
