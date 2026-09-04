package m8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import l8.e;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f45344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NativeAdBase f45345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediationNativeAdCallback f45346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaView f45347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f45348e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f45350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f45351b;

        public b() {
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f45350a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f45351b;
        }

        public b(Uri uri) {
            this.f45351b = uri;
        }

        public b(Drawable drawable) {
            this.f45350a = drawable;
        }
    }

    /* JADX INFO: renamed from: m8.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface InterfaceC0689c {
        void a(AdError adError);

        void b();
    }

    public c(MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        this.f45344a = mediationAdLoadCallback;
        this.f45348e = eVar;
    }

    private boolean d(NativeAdBase nativeAdBase) {
        boolean z10 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        if (nativeAdBase instanceof NativeBannerAd) {
            return z10;
        }
        return (!z10 || nativeAdBase.getAdCoverImage() == null || this.f45347d == null) ? false : true;
    }

    public void e(Context context, InterfaceC0689c interfaceC0689c) {
        if (!d(this.f45345b)) {
            AdError adError = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            interfaceC0689c.a(adError);
            return;
        }
        setHeadline(this.f45345b.getAdHeadline());
        if (this.f45345b.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(Uri.parse(this.f45345b.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.f45345b.getAdBodyText());
        if (this.f45345b.getPreloadedIconViewDrawable() != null) {
            setIcon(new b(this.f45345b.getPreloadedIconViewDrawable()));
        } else if (this.f45345b.getAdIcon() == null) {
            setIcon(new b());
        } else {
            setIcon(new b(Uri.parse(this.f45345b.getAdIcon().getUrl())));
        }
        setCallToAction(this.f45345b.getAdCallToAction());
        setAdvertiser(this.f45345b.getAdvertiserName());
        this.f45347d.setListener(new a());
        setHasVideoContent(true);
        setMediaView(this.f45347d);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", this.f45345b.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f45345b.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.f45345b, null));
        interfaceC0689c.b();
    }

    public void f(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationNativeAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f45344a.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationNativeAdConfiguration);
        this.f45347d = this.f45348e.c(mediationNativeAdConfiguration.getContext());
        try {
            this.f45345b = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementID, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getWatermark())) {
                this.f45345b.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.f45345b;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new d(mediationNativeAdConfiguration.getContext(), this.f45345b)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f45344a.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = (View) map.get(NpmRNZ.PxFewHKkfWaZ);
        NativeAdBase nativeAdBase = this.f45345b;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            }
        }
        if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.f45347d, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.f45347d, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f45345b;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements MediaViewListener {
        a() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (c.this.f45346c != null) {
                c.this.f45346c.onVideoComplete();
            }
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onEnterFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onExitFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenBackground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenForeground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPause(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPlay(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onVolumeChange(MediaView mediaView, float f10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d implements AdListener, NativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f45353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NativeAdBase f45354b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements InterfaceC0689c {
            a() {
            }

            @Override // m8.c.InterfaceC0689c
            public void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f45344a.onFailure(adError);
            }

            @Override // m8.c.InterfaceC0689c
            public void b() {
                c cVar = c.this;
                cVar.f45346c = (MediationNativeAdCallback) cVar.f45344a.onSuccess(c.this);
            }
        }

        d(Context context, NativeAdBase nativeAdBase) {
            this.f45354b = nativeAdBase;
            this.f45353a = new WeakReference(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            c.this.f45346c.reportAdClicked();
            c.this.f45346c.onAdOpened();
            c.this.f45346c.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.f45354b) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f45344a.onFailure(adError);
                return;
            }
            Context context = (Context) this.f45353a.get();
            if (context != null) {
                c.this.e(context, new a());
                return;
            }
            AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f45344a.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f45344a.onFailure(adError2);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }
    }
}
