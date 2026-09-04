package v8;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediationAdLoadCallback f55243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.b f55244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.c f55245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.ads.mediation.pangle.a f55246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MediationNativeAdCallback f55247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PAGNativeAd f55248f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.pangle.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f55249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediationNativeAdConfiguration f55250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f55251c;

        /* JADX INFO: renamed from: v8.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0834a implements PAGNativeAdLoadListener {
            C0834a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGNativeAd pAGNativeAd) {
                d.this.h(pAGNativeAd);
                d dVar = d.this;
                dVar.f55247e = (MediationNativeAdCallback) dVar.f55243a.onSuccess(d.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.dse
            public void onError(int i10, String str) {
                AdError adErrorC = u8.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                d.this.f55243a.onFailure(adErrorC);
            }
        }

        a(String str, MediationNativeAdConfiguration mediationNativeAdConfiguration, String str2) {
            this.f55249a = str;
            this.f55250b = mediationNativeAdConfiguration;
            this.f55251c = str2;
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            d.this.f55243a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.b.a
        public void b() {
            PAGNativeRequest pAGNativeRequestE = d.this.f55246d.e();
            pAGNativeRequestE.setAdString(this.f55249a);
            u8.b.a(pAGNativeRequestE, this.f55249a, this.f55250b);
            d.this.f55245c.g(this.f55251c, pAGNativeRequestE, new C0834a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f55248f.showPrivacyActivity();
        }
    }

    /* JADX INFO: renamed from: v8.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class C0835d extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable f55256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f55257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f55258c;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f55256a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f55258c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f55257b;
        }

        private C0835d(Drawable drawable, Uri uri, double d10) {
            this.f55256a = drawable;
            this.f55257b = uri;
            this.f55258c = d10;
        }
    }

    public d(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.b bVar, com.google.ads.mediation.pangle.c cVar, com.google.ads.mediation.pangle.a aVar) {
        this.f55243a = mediationAdLoadCallback;
        this.f55244b = bVar;
        this.f55245c = cVar;
        this.f55246d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(PAGNativeAd pAGNativeAd) {
        this.f55248f = pAGNativeAd;
        PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        setHeadline(nativeAdData.getTitle());
        setBody(nativeAdData.getDescription());
        setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            setIcon(new C0835d(null, Uri.parse(nativeAdData.getIcon().getImageUrl()), 1.0d));
        }
        setOverrideClickHandling(true);
        setMediaView(nativeAdData.getMediaView());
        setAdChoicesContent(nativeAdData.getAdLogoView());
    }

    public void i(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = u8.a.a(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f55243a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            this.f55244b.b(mediationNativeAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationNativeAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        View view2 = (View) map3.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f55248f.registerViewForInteraction((ViewGroup) view, new ArrayList(map3.values()), arrayList, (View) null, new b());
        getAdChoicesContent().setOnClickListener(new c());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements PAGNativeAdInteractionListener {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (d.this.f55247e != null) {
                d.this.f55247e.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (d.this.f55247e != null) {
                d.this.f55247e.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
        }
    }
}
