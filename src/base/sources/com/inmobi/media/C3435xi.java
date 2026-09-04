package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3435xi extends GestureDetectorOnGestureListenerC3228pi {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final byte f27862k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final C3348u9 f27863l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final String f27864m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f27865n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final C3409wi f27866o1;

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC3228pi getAdRenderView() {
        C3348u9 c3348u9;
        if (this.f27865n1 == null && (c3348u9 = this.f27863l1) != null) {
            c3348u9.b(this.f27864m1, "Ad RenderView not found for id: " + getRoute().f25563b);
        }
        return this.f27865n1;
    }

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3228pi
    public final void C() {
    }

    public final void Z() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        C3348u9 c3348u9 = this.f27863l1;
        if (c3348u9 != null) {
            c3348u9.a(this.f27864m1, "initialize RenderViewSibling");
        }
        a(this.f27866o1);
        GestureDetectorOnGestureListenerC3228pi adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC3228pi adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC3228pi adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof C3435xi)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C3348u9 c3348u10 = this.f27863l1;
        if (c3348u10 != null) {
            c3348u10.a(this.f27864m1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(gl.l0.v(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3228pi
    public final void a(Nf orientationProperties) {
        kotlin.jvm.internal.s.h(orientationProperties, "orientationProperties");
        C3348u9 c3348u9 = this.f27863l1;
        if (c3348u9 != null) {
            c3348u9.a(this.f27864m1, "setOrientationProperties " + this);
        }
        setOrientationProperties(orientationProperties);
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3228pi, com.inmobi.media.C
    public final void b() {
        k();
        removeAllViews();
        kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    public final InterfaceC3322t9 getLogger() {
        return this.f27863l1;
    }

    public final byte getMPlacementType() {
        return this.f27862k1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3228pi, com.inmobi.media.C
    public Wn getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new K9(this, this, new C3346u7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.f27863l1), this.f27863l1));
        }
        Wn mViewableAd = getMViewableAd();
        kotlin.jvm.internal.s.e(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3228pi
    public final void n() {
        C3348u9 c3348u9 = this.f27863l1;
        if (c3348u9 != null) {
            c3348u9.a(this.f27864m1, "dismissCurrentViewContainer " + this);
        }
        Ec mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C3222pc c3222pc = mediaProcessor.f24710c;
            if (c3222pc != null) {
                c3222pc.b();
            }
            mediaProcessor.f24710c = null;
        }
        if (kotlin.jvm.internal.s.c("Default", getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3228pi, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        Bo webViewFactory = getWebViewFactory();
        String id2 = getRoute().f25562a;
        webViewFactory.getClass();
        kotlin.jvm.internal.s.h(id2, "id");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) webViewFactory.f24572b.get(id2);
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            c(gestureDetectorOnGestureListenerC3228pi, getRoute().f25563b);
            return;
        }
        C3348u9 c3348u9 = this.f27863l1;
        if (c3348u9 != null) {
            c3348u9.b(this.f27864m1, "Not able to give show success as the source view is not present");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3228pi
    public final void u() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3435xi(Context context, byte b10, C3348u9 c3348u9, C3184o0 adMetaData, Bo bo2, Qi route, AdConfig adConfig) {
        super(context, b10, null, null, adMetaData.f27100r, 0L, adMetaData.f27101s, c3348u9, route, bo2, adMetaData, adConfig, 92);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(adMetaData, "adMetaData");
        kotlin.jvm.internal.s.h(bo2, lkCBSIFlvmyGX.skdwppPErS);
        kotlin.jvm.internal.s.h(route, "route");
        kotlin.jvm.internal.s.h(adConfig, "adConfig");
        this.f27862k1 = b10;
        this.f27863l1 = c3348u9;
        this.f27864m1 = "RenderViewSibling - " + route.f25563b;
        bo2.getClass();
        kotlin.jvm.internal.s.h("default", "id");
        this.f27865n1 = (GestureDetectorOnGestureListenerC3228pi) bo2.f24572b.get("default");
        this.f27866o1 = new C3409wi(this, bo2, route);
    }
}
