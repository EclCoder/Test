package x8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.VungleError;
import com.vungle.ads.i;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.v;
import com.vungle.ads.w;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d extends UnifiedNativeAdMapper implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f56765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediationNativeAdCallback f56766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v f56767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaView f56768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f56769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.ads.mediation.vungle.b f56770f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f56771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f56772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f56773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ VideoOptions f56774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f56775e;

        a(Context context, String str, int i10, VideoOptions videoOptions, String str2) {
            this.f56771a = context;
            this.f56772b = str;
            this.f56773c = i10;
            this.f56774d = videoOptions;
            this.f56775e = str2;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void a(AdError adError) {
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            d.this.f56765a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void b() throws Throwable {
            d dVar = d.this;
            dVar.f56767c = dVar.f56770f.d(this.f56771a, this.f56772b);
            d.this.f56767c.setAdOptionsPosition(this.f56773c);
            d.this.f56767c.setAdListener(d.this);
            d.this.f56767c.setAdapterAdFormat("VungleRtbNativeAd");
            if (this.f56774d != null) {
                d.this.f56767c.getVideoOptions().setStartMuted(Boolean.valueOf(this.f56774d.getStartMuted()));
            }
            d.this.f56768d = new MediaView(this.f56771a);
            if (!TextUtils.isEmpty(this.f56775e)) {
                d.this.f56767c.getAdConfig().setWatermark(this.f56775e);
            }
            d.this.f56767c.load(d.this.f56769e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements zj.c {
        b() {
        }

        @Override // zj.c
        public void onVideoEnd() {
            d.this.f56766b.onVideoComplete();
        }

        @Override // zj.c
        public void onVideoMute() {
            d.this.f56766b.onVideoMute();
        }

        @Override // zj.c
        public void onVideoPause() {
            d.this.f56766b.onVideoPause();
        }

        @Override // zj.c
        public void onVideoPlay() {
            d.this.f56766b.onVideoPlay();
        }

        @Override // zj.c
        public void onVideoUnmute() {
            d.this.f56766b.onVideoUnmute();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f56778a;

        public c(Uri uri) {
            this.f56778a = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f56778a;
        }
    }

    public d(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f56765a = mediationAdLoadCallback;
        this.f56770f = bVar;
    }

    private void h() {
        setHeadline(this.f56767c.getAdTitle());
        setBody(this.f56767c.getAdBodyText());
        setCallToAction(this.f56767c.getAdCallToActionText());
        Double adStarRating = this.f56767c.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.f56767c.getAdSponsoredText());
        setHasVideoContent(this.f56767c.hasVideoContent());
        setMediaView(this.f56768d);
        this.f56768d.setNativeVideoListener(new b());
        String appIcon = this.f56767c.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(com.vungle.ads.internal.model.b.FILE_SCHEME)) {
            setIcon(new c(Uri.parse(appIcon)));
        }
        setMediaContentAspectRatio(this.f56767c.getMediaAspectRatio());
        if (VungleMediationAdapter.runtimeGmaSdkListensToAdapterReportedImpressions()) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
    }

    public void i(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        int i10;
        int i11;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        VideoOptions videoOptions = nativeAdOptions.getVideoOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            this.f56765a.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            this.f56765a.onFailure(adError2);
            return;
        }
        this.f56769e = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            i10 = 3;
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i10 = 1;
                } else {
                    i11 = 2;
                }
            }
            com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, i11, videoOptions, mediationNativeAdConfiguration.getWatermark()));
        }
        i10 = 0;
        i11 = i10;
        com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, i11, videoOptions, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.vungle.ads.w, com.vungle.ads.j
    public void onAdClicked(i iVar) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f56766b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f56766b.onAdOpened();
        }
    }

    @Override // com.vungle.ads.w, com.vungle.ads.j
    public void onAdFailedToLoad(i iVar, VungleError vungleError) {
        this.f56765a.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.w, com.vungle.ads.j
    public void onAdFailedToPlay(i iVar, VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.w, com.vungle.ads.j
    public void onAdImpression(i iVar) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f56766b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.w, com.vungle.ads.j
    public void onAdLeftApplication(i iVar) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f56766b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.w, com.vungle.ads.j
    public void onAdLoaded(i iVar) {
        h();
        this.f56766b = (MediationNativeAdCallback) this.f56765a.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) throws Throwable {
        super.trackViews(view, map, map2);
        String str = VungleMediationAdapter.TAG;
        Log.d(str, "trackViews()");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (this.f56767c == null) {
                return;
            }
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (!(childAt instanceof FrameLayout)) {
                Log.d(str, "Vungle requires a FrameLayout to render the native ad.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ImageView imageView = null;
            View view2 = null;
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add((View) entry.getValue());
                if (((String) entry.getKey()).equals("3003")) {
                    view2 = (View) entry.getValue();
                } else if (((String) entry.getKey()).equals("3010")) {
                    arrayList.add(this.f56768d);
                }
            }
            if (view2 instanceof ImageView) {
                imageView = (ImageView) view2;
            } else {
                Log.d(VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
            }
            this.f56767c.registerViewForInteraction((FrameLayout) childAt, this.f56768d, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) throws Throwable {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        v vVar = this.f56767c;
        if (vVar == null) {
            return;
        }
        vVar.unregisterView();
    }

    @Override // com.vungle.ads.w, com.vungle.ads.j
    public void onAdEnd(i iVar) {
    }

    @Override // com.vungle.ads.w, com.vungle.ads.j
    public void onAdStart(i iVar) {
    }
}
