package com.google.ads.mediation.vungle;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdSize;
import com.vungle.ads.VungleMediationLogger;
import com.vungle.ads.g0;
import com.vungle.ads.h0;
import com.vungle.ads.l;
import com.vungle.ads.p;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f16379a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.google.ads.mediation.vungle.a f16380b = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements com.google.ads.mediation.vungle.a {
        a() {
        }

        @Override // com.google.ads.mediation.vungle.a
        public void a(Context context, String appId, p initializationListener) {
            s.h(context, "context");
            s.h(appId, "appId");
            s.h(initializationListener, "initializationListener");
            g0.Companion.init(context, appId, initializationListener);
        }

        @Override // com.google.ads.mediation.vungle.a
        public String b() {
            return g0.Companion.getSdkVersion();
        }

        @Override // com.google.ads.mediation.vungle.a
        public void c(Context context, l callback) {
            s.h(context, "context");
            s.h(callback, "callback");
            g0.Companion.getBiddingToken(context, callback);
        }

        @Override // com.google.ads.mediation.vungle.a
        public boolean isInitialized() {
            return g0.Companion.isInitialized();
        }
    }

    private d() {
    }

    public static final void a(h0 bannerAdView, String adapterAdFormat, String placementId, AdSize adSize) {
        s.h(bannerAdView, "bannerAdView");
        s.h(adapterAdFormat, "adapterAdFormat");
        s.h(placementId, "placementId");
        s.h(adSize, "adSize");
        if (g0.Companion.isInline(placementId)) {
            return;
        }
        int width = adSize.getWidth();
        AdSize adSize2 = AdSize.BANNER;
        if (width == adSize2.getWidth() && adSize.getHeight() == adSize2.getHeight()) {
            return;
        }
        int width2 = adSize.getWidth();
        AdSize adSize3 = AdSize.MEDIUM_RECTANGLE;
        if (width2 == adSize3.getWidth() && adSize.getHeight() == adSize3.getHeight()) {
            return;
        }
        int width3 = adSize.getWidth();
        AdSize adSize4 = AdSize.LEADERBOARD;
        if (width3 == adSize4.getWidth() && adSize.getHeight() == adSize4.getHeight()) {
            return;
        }
        bannerAdView.setAdapterAdFormat(adapterAdFormat);
        VungleMediationLogger.logError(bannerAdView, "CustomBannerSizeMismatch:w-" + adSize.getWidth() + "|h-" + adSize.getHeight());
        Log.e(VungleMediationAdapter.TAG, "Please use a Liftoff inline placement ID in order to use custom size banner: placementId=" + placementId + " adSize=" + adSize);
    }
}
