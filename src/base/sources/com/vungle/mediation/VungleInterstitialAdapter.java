package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.f0;
import com.vungle.ads.h;
import com.vungle.ads.h0;
import com.vungle.ads.i;
import com.vungle.ads.q;
import com.vungle.ads.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class VungleInterstitialAdapter extends VungleMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private h0 bannerAdView;
    private q interstitialAd;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.vungle.ads.b f35901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MediationInterstitialListener f35902d;

        a(Context context, String str, com.vungle.ads.b bVar, MediationInterstitialListener mediationInterstitialListener) {
            this.f35899a = context;
            this.f35900b = str;
            this.f35901c = bVar;
            this.f35902d = mediationInterstitialListener;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError adError) {
            this.f35902d.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() {
            VungleInterstitialAdapter.this.interstitialAd = new q(this.f35899a, this.f35900b, this.f35901c);
            VungleInterstitialAdapter.this.interstitialAd.setAdListener(new d());
            VungleInterstitialAdapter.this.interstitialAd.setAdapterAdFormat("VungleInterstitialAdapter-interstitial");
            VungleInterstitialAdapter.this.interstitialAd.load((String) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f35906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AdSize f35907d;

        b(Context context, String str, f0 f0Var, AdSize adSize) {
            this.f35904a = context;
            this.f35905b = str;
            this.f35906c = f0Var;
            this.f35907d = adSize;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() throws Throwable {
            VungleInterstitialAdapter.this.bannerAdView = new h0(this.f35904a, this.f35905b, this.f35906c);
            VungleInterstitialAdapter.this.bannerAdView.setAdListener(new c());
            VungleInterstitialAdapter.this.bannerAdView.setAdapterAdFormat("VungleInterstitialAdapter-banner");
            com.google.ads.mediation.vungle.d.a(VungleInterstitialAdapter.this.bannerAdView, "VungleInterstitialAdapter-banner-custom", this.f35905b, this.f35907d);
            VungleInterstitialAdapter.this.bannerAdView.load((String) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c implements h {
        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdClicked(i iVar) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdClicked(VungleInterstitialAdapter.this);
                VungleInterstitialAdapter.this.mediationBannerListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdFailedToLoad(i iVar, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdFailedToPlay(i iVar, VungleError vungleError) {
            Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdLeftApplication(i iVar) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdLoaded(i iVar) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdLoaded(VungleInterstitialAdapter.this);
            }
        }

        private c() {
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdEnd(i iVar) {
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdImpression(i iVar) {
        }

        @Override // com.vungle.ads.h, com.vungle.ads.j
        public void onAdStart(i iVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d implements r {
        @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
        public void onAdClicked(i iVar) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClicked(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
        public void onAdEnd(i iVar) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClosed(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
        public void onAdFailedToLoad(i iVar, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
        public void onAdFailedToPlay(i iVar, VungleError vungleError) {
            Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
        }

        @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
        public void onAdLeftApplication(i iVar) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
        public void onAdLoaded(i iVar) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLoaded(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
        public void onAdStart(i iVar) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        private d() {
        }

        @Override // com.vungle.ads.r, com.vungle.ads.o, com.vungle.ads.j
        public void onAdImpression(i iVar) {
        }
    }

    public static f0 getVungleBannerAdSizeFromGoogleAdSize(AdSize adSize, String str) {
        f0 validAdSizeFromSize = f0.getValidAdSizeFromSize(adSize.getWidth(), adSize.getHeight(), str);
        Log.d(VungleMediationAdapter.TAG, "The requested ad size: " + adSize + "; placementId=" + str + "; vngAdSize=" + validAdSizeFromSize);
        return validAdSizeFromSize;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        Log.d(VungleMediationAdapter.TAG, "getBannerView # instance: " + hashCode());
        return this.bannerAdView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        Log.d(VungleMediationAdapter.TAG, "onDestroy: " + hashCode());
        h0 h0Var = this.bannerAdView;
        if (h0Var != null) {
            h0Var.finishAd();
            this.bannerAdView = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
        String string2 = bundle.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        f0 vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(adSize, string2);
        Log.d(VungleMediationAdapter.TAG, "requestBannerAd for Placement: " + string2 + " ### Adapter instance: " + hashCode());
        com.google.ads.mediation.vungle.c.a().b(string, context, new b(context, string2, vungleBannerAdSizeFromGoogleAdSize, adSize));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        String string2 = bundle.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError2);
        } else {
            com.google.ads.mediation.vungle.c.a().c(MobileAds.getRequestConfiguration());
            com.vungle.ads.b bVar = new com.vungle.ads.b();
            if (bundle2 != null && bundle2.containsKey("adOrientation")) {
                bVar.setAdOrientation(bundle2.getInt("adOrientation", 2));
            }
            com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, bVar, mediationInterstitialListener));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        q qVar = this.interstitialAd;
        if (qVar != null) {
            qVar.play(null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }
}
