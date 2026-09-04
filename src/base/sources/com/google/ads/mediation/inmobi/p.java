package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class p extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f16327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediationAdLoadCallback f16329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n8.c f16330d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.google.ads.mediation.inmobi.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f16331a;

        a(Uri uri) {
            this.f16331a = uri;
        }

        @Override // com.google.ads.mediation.inmobi.a.b
        public void a(HashMap map) {
            Drawable drawable = (Drawable) map.get("icon_key");
            p.this.setIcon(new m(drawable, this.f16331a, 1.0d));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new m(new ColorDrawable(0), null, 1.0d));
            p.this.setImages(arrayList);
            if (drawable != null && p.this.f16329c != null) {
                p.this.f16330d.f46932d = (MediationNativeAdCallback) p.this.f16329c.onSuccess(p.this);
            } else {
                AdError adErrorA = g.a(109, "InMobi SDK failed to download native ad image assets.");
                Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
                p.this.f16329c.onFailure(adErrorA);
            }
        }

        @Override // com.google.ads.mediation.inmobi.a.b
        public void b() {
            AdError adErrorA = g.a(109, "InMobi SDK failed to download native ad image assets.");
            Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
            p.this.f16329c.onFailure(adErrorA);
        }
    }

    public p(n nVar, Boolean bool, MediationAdLoadCallback mediationAdLoadCallback, n8.c cVar) {
        this.f16327a = nVar;
        this.f16328b = bool.booleanValue();
        this.f16329c = mediationAdLoadCallback;
        this.f16330d = cVar;
        setOverrideImpressionRecording(true);
    }

    public void c(Context context) {
        if (this.f16327a.e() != null) {
            setHeadline(this.f16327a.e());
        }
        if (this.f16327a.b() != null) {
            setBody(this.f16327a.b());
        }
        if (this.f16327a.a() != null) {
            setCallToAction(this.f16327a.a());
        }
        if (this.f16327a.f() != null) {
            setAdvertiser(this.f16327a.f());
        }
        setStarRating(Double.valueOf(this.f16327a.d()));
        MediaView mediaViewG = this.f16327a.g();
        if (mediaViewG != null) {
            setMediaView(mediaViewG);
        }
        setHasVideoContent(this.f16327a.h().booleanValue());
        if (this.f16327a.c() != null) {
            try {
                URL url = new URL(this.f16327a.c());
                Uri uri = Uri.parse(url.toURI().toString());
                HashMap map = new HashMap();
                if (this.f16328b) {
                    setIcon(new m(null, uri, 1.0d));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new m(new ColorDrawable(0), null, 1.0d));
                    setImages(arrayList);
                } else {
                    map.put("icon_key", url);
                }
                if (!this.f16328b) {
                    new com.google.ads.mediation.inmobi.a(new a(uri)).execute(map);
                    return;
                }
                MediationAdLoadCallback mediationAdLoadCallback = this.f16329c;
                if (mediationAdLoadCallback != null) {
                    this.f16330d.f46932d = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(this);
                }
            } catch (MalformedURLException | URISyntaxException e10) {
                AdError adErrorA = g.a(108, e10.getLocalizedMessage());
                Log.w(InMobiMediationAdapter.TAG, adErrorA.toString());
                this.f16329c.onFailure(adErrorA);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) {
        setOverrideClickHandling(true);
        View view2 = (View) map.get("3001");
        View view3 = (View) map.get("3004");
        View view4 = (View) map.get("3003");
        View view5 = (View) map.get("3002");
        View view6 = (View) map.get("3005");
        View view7 = (View) map.get("3009");
        InMobiNativeViewData.Builder builder = new InMobiNativeViewData.Builder((ViewGroup) view);
        if (view2 != null) {
            builder.setTitleView(view2);
        }
        if (view3 != null) {
            builder.setDescriptionView(view3);
        }
        if (view4 instanceof ImageView) {
            builder.setIconView((ImageView) view4);
        }
        if (view5 != null) {
            builder.setCTAView(view5);
        }
        if (view6 != null) {
            builder.setAdvertiserView(view6);
        }
        if (view7 != null) {
            builder.setRatingView(view7);
        }
        this.f16327a.k(builder.build());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        this.f16327a.o();
    }
}
