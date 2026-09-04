package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.google.api.client.http.HttpStatusCodes;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.kj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3099kj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bo f26862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f26863b;

    public C3099kj(Bo wvFactory, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(wvFactory, "wvFactory");
        this.f26862a = wvFactory;
        this.f26863b = interfaceC3322t9;
    }

    public final GestureDetectorOnGestureListenerC3228pi a() {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a("default");
        if (gestureDetectorOnGestureListenerC3228piA != null) {
            return gestureDetectorOnGestureListenerC3228piA;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t9).b("kj", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(String sourceId, String targetId) throws JSONException {
        Object next;
        Integer numA;
        kotlin.jvm.internal.s.h(sourceId, "sourceId");
        kotlin.jvm.internal.s.h(targetId, "targetId");
        InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t9).a("kj", "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3228piA2 == null) {
            fl.k kVar = Gi.f24873a;
            JSONObject jSONObjectA = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3228piA.a("showWebView", jSONObjectA);
            return;
        }
        if (kotlin.jvm.internal.s.c(targetId, "default")) {
            a(gestureDetectorOnGestureListenerC3228piA, targetId, "showWebView");
            return;
        }
        if (!(gestureDetectorOnGestureListenerC3228piA2 instanceof C3435xi)) {
            fl.k kVar2 = Gi.f24873a;
            JSONObject jSONObjectA2 = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", Sdk$SDKError.b.MRAID_BRIDGE_ERROR_VALUE);
            gestureDetectorOnGestureListenerC3228piA.a("showWebView", jSONObjectA2);
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA3 = a();
        if (gestureDetectorOnGestureListenerC3228piA3 != null && !gestureDetectorOnGestureListenerC3228piA3.isAttachedToWindow()) {
            fl.k kVar3 = Gi.f24873a;
            JSONObject jSONObjectA3 = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA3.put("errorCode", Sdk$SDKError.b.MRAID_BRIDGE_ERROR_VALUE);
            gestureDetectorOnGestureListenerC3228piA.a("showWebView", jSONObjectA3);
            return;
        }
        Integer numA2 = gestureDetectorOnGestureListenerC3228piA2.getWvStateMachine().a(5);
        if (numA2 != null) {
            int iIntValue = numA2.intValue();
            fl.k kVar4 = Gi.f24873a;
            JSONObject jSONObjectA4 = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA4.put("errorCode", iIntValue);
            gestureDetectorOnGestureListenerC3228piA.a("showWebView", jSONObjectA4);
            return;
        }
        Iterator it = gl.l0.t(this.f26862a.f24572b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) next;
            if (gestureDetectorOnGestureListenerC3228pi.getWvStateMachine().f27868b == 105 && !kotlin.jvm.internal.s.c(gestureDetectorOnGestureListenerC3228pi, gestureDetectorOnGestureListenerC3228piA2) && !kotlin.jvm.internal.s.c(gestureDetectorOnGestureListenerC3228pi.getRoute().f25563b, "default")) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) next;
        if (gestureDetectorOnGestureListenerC3228pi2 != null && (numA = gestureDetectorOnGestureListenerC3228pi2.getWvStateMachine().a(7)) != null) {
            int iIntValue2 = numA.intValue();
            fl.k kVar5 = Gi.f24873a;
            JSONObject jSONObjectA5 = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA5.put("errorCode", iIntValue2);
            gestureDetectorOnGestureListenerC3228piA.a("showWebView", jSONObjectA5);
        }
        C3435xi c3435xi = (C3435xi) gestureDetectorOnGestureListenerC3228piA2;
        if (c3435xi.isAttachedToWindow()) {
            a(gestureDetectorOnGestureListenerC3228piA2, gestureDetectorOnGestureListenerC3228piA, targetId);
            return;
        }
        a(gestureDetectorOnGestureListenerC3228piA, c3435xi);
        a(gestureDetectorOnGestureListenerC3228piA2);
        Wn viewableAd = c3435xi.getViewableAd();
        Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC3228piA2.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public final GestureDetectorOnGestureListenerC3228pi a(String id2) {
        Bo bo2 = this.f26862a;
        bo2.getClass();
        kotlin.jvm.internal.s.h(id2, "id");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) bo2.f24572b.get(id2);
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            return gestureDetectorOnGestureListenerC3228pi;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
        if (interfaceC3322t9 == null) {
            return null;
        }
        kotlin.jvm.internal.s.g("kj", "TAG");
        ((C3348u9) interfaceC3322t9).b("kj", "View with ID: " + id2 + " not found.");
        return null;
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, C3435xi c3435xi) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t9).a("kj", "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        Context containerContext = gestureDetectorOnGestureListenerC3228piA != null ? gestureDetectorOnGestureListenerC3228piA.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26863b;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("kj", "TAG");
                ((C3348u9) interfaceC3322t10).b("kj", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof InMobiAdActivity)) {
            InterfaceC3322t9 interfaceC3322t11 = this.f26863b;
            if (interfaceC3322t11 != null) {
                kotlin.jvm.internal.s.g("kj", "TAG");
                ((C3348u9) interfaceC3322t11).b("kj", "Context is not an instance of InMobiAdActivity.");
            }
            a(gestureDetectorOnGestureListenerC3228pi, c3435xi.getRoute().f25563b, "loadWebView");
            return;
        }
        c3435xi.setFullScreenActivityContext((Activity) containerContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        InterfaceC3322t9 interfaceC3322t12 = this.f26863b;
        if (interfaceC3322t12 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t12).a("kj", "target View's Viewable ad - " + c3435xi.getViewableAd());
        }
        View viewC = c3435xi.getViewableAd().c();
        ViewGroup viewGroup = (ViewGroup) ((InMobiAdActivity) containerContext).findViewById(65534);
        Context context = viewGroup.getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if ((viewC != null ? viewC.getParent() : null) != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewC);
            }
        }
        relativeLayout.addView(viewC, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        c3435xi.a(relativeLayout);
        InterfaceC3322t9 interfaceC3322t13 = this.f26863b;
        if (interfaceC3322t13 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t13).a("kj", "Target View added - the inflatedView is - " + viewC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.inmobi.media.Wn] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.inmobi.media.pi] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        ?? viewableAd;
        InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t9).a("kj", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3228pi.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            gestureDetectorOnGestureListenerC3228pi = viewGroup;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA == null || (viewableAd = gestureDetectorOnGestureListenerC3228piA.getViewableAd()) == 0) {
            return;
        }
        viewableAd.a(gestureDetectorOnGestureListenerC3228pi, FriendlyObstructionPurpose.OTHER);
    }

    public final void a(String sourceId, String targetId, String html) throws JSONException {
        Context context;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA;
        kotlin.jvm.internal.s.h(sourceId, "sourceId");
        kotlin.jvm.internal.s.h(targetId, "targetId");
        kotlin.jvm.internal.s.h(html, "html");
        InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t9).a("kj", "loadWebView " + this);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA2 = a();
        Context containerContext = gestureDetectorOnGestureListenerC3228piA2 != null ? gestureDetectorOnGestureListenerC3228piA2.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26863b;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("kj", "TAG");
                ((C3348u9) interfaceC3322t10).b("kj", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (gestureDetectorOnGestureListenerC3228piA = a(sourceId)) == null) {
            return;
        }
        if (kotlin.jvm.internal.s.c(targetId, "default")) {
            a(gestureDetectorOnGestureListenerC3228piA, targetId, "loadWebView");
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA3 = a();
        if (gestureDetectorOnGestureListenerC3228piA3 == null) {
            gestureDetectorOnGestureListenerC3228piA.a("loadWebView", Gi.a(targetId, 304));
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA4 = a(targetId);
        if (gestureDetectorOnGestureListenerC3228piA4 != null) {
            int i10 = gestureDetectorOnGestureListenerC3228piA4.getWvStateMachine().f27868b;
            fl.k kVar = Gi.f24873a;
            JSONObject jSONObjectA = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", i10);
            gestureDetectorOnGestureListenerC3228piA.a("loadWebView", jSONObjectA);
            return;
        }
        C3435xi c3435xiA = a(gestureDetectorOnGestureListenerC3228piA3, targetId, this, gestureDetectorOnGestureListenerC3228piA, context, SystemClock.elapsedRealtime());
        if (c3435xiA != null) {
            c3435xiA.i(html);
        }
    }

    public final void b(String sourceId, String targetId, String message) throws JSONException {
        kotlin.jvm.internal.s.h(sourceId, "sourceId");
        kotlin.jvm.internal.s.h(targetId, "targetId");
        kotlin.jvm.internal.s.h(message, "message");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3228piA2 == null) {
            fl.k kVar = Gi.f24873a;
            JSONObject jSONObjectA = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3228piA.a("sendMessage", jSONObjectA);
            return;
        }
        int i10 = gestureDetectorOnGestureListenerC3228piA2.getWvStateMachine().f27868b;
        if (!kotlin.jvm.internal.s.c(gestureDetectorOnGestureListenerC3228piA2.getRoute().f25563b, "default") && gl.r.o(101, 104, 107).contains(Integer.valueOf(i10))) {
            InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
            if (interfaceC3322t9 != null) {
                kotlin.jvm.internal.s.g("kj", "TAG");
                ((C3348u9) interfaceC3322t9).b("kj", "WebView is not in state to receive messages: " + targetId);
            }
            int i11 = gestureDetectorOnGestureListenerC3228piA2.getWvStateMachine().f27868b;
            fl.k kVar2 = Gi.f24873a;
            JSONObject jSONObjectA2 = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", i11);
            gestureDetectorOnGestureListenerC3228piA.a("sendMessage", jSONObjectA2);
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f26863b;
        if (interfaceC3322t10 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t10).a("kj", "Sending message to WebView ID: " + targetId);
        }
        gestureDetectorOnGestureListenerC3228piA2.h(message);
    }

    public static final C3435xi a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, String str, C3099kj c3099kj, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2, Context context, long j10) {
        String str2;
        C3184o0 c3184o0A;
        C3184o0 c3184o0;
        C3331ti c3331ti;
        C3184o0 adMetaData = gestureDetectorOnGestureListenerC3228pi.getAdMetaData();
        if (adMetaData != null) {
            C3331ti c3331ti2 = gestureDetectorOnGestureListenerC3228pi.getAdMetaData().f27101s;
            if (c3331ti2 != null) {
                C3365v0 placement = c3331ti2.f27558a;
                String markupType = c3331ti2.f27559b;
                String impressionId = c3331ti2.f27560c;
                String telemetryMetadataBlob = c3331ti2.f27561d;
                int i10 = c3331ti2.f27562e;
                String creativeType = c3331ti2.f27563f;
                String creativeId = c3331ti2.f27564g;
                boolean z10 = c3331ti2.f27565h;
                int i11 = c3331ti2.f27566i;
                C3237q1 c3237q1 = c3331ti2.f27567j;
                C3460yi c3460yi = c3331ti2.f27568k;
                InlineParams inlineParams = c3331ti2.f27570m;
                kotlin.jvm.internal.s.h(placement, "placement");
                kotlin.jvm.internal.s.h(markupType, "markupType");
                kotlin.jvm.internal.s.h(impressionId, "impressionId");
                kotlin.jvm.internal.s.h(telemetryMetadataBlob, "telemetryMetadataBlob");
                kotlin.jvm.internal.s.h(creativeType, "creativeType");
                kotlin.jvm.internal.s.h(creativeId, "creativeId");
                c3184o0 = adMetaData;
                str2 = str;
                c3331ti = new C3331ti(placement, markupType, impressionId, telemetryMetadataBlob, i10, creativeType, creativeId, z10, i11, c3237q1, c3460yi, str2, inlineParams);
            } else {
                str2 = str;
                c3184o0 = adMetaData;
                c3331ti = null;
            }
            c3184o0A = C3184o0.a(c3184o0, c3331ti, 3665663);
        } else {
            str2 = str;
            c3184o0A = null;
        }
        if (c3184o0A == null) {
            InterfaceC3322t9 interfaceC3322t9 = c3099kj.f26863b;
            if (interfaceC3322t9 != null) {
                kotlin.jvm.internal.s.g("kj", "TAG");
                ((C3348u9) interfaceC3322t9).b("kj", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = c3099kj.f26862a.a(new Qi(gestureDetectorOnGestureListenerC3228pi2.getRoute().f25563b, str2), context, (short) 1, c3184o0A, gestureDetectorOnGestureListenerC3228pi.getAdConfig());
        C3435xi c3435xi = gestureDetectorOnGestureListenerC3228piA instanceof C3435xi ? (C3435xi) gestureDetectorOnGestureListenerC3228piA : null;
        if (c3435xi == null) {
            InterfaceC3322t9 interfaceC3322t10 = c3099kj.f26863b;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("kj", "TAG");
                ((C3348u9) interfaceC3322t10).b("kj", "Failed to create Sibling WebView with ID: " + str2);
            }
            gestureDetectorOnGestureListenerC3228pi2.a("loadWebView", Gi.a(str2, Sdk$SDKError.b.EVALUATE_JAVASCRIPT_FAILED_VALUE));
            return null;
        }
        Integer numA = c3435xi.getWvStateMachine().a(1);
        if (numA != null) {
            gestureDetectorOnGestureListenerC3228pi2.a("loadWebView", Gi.a(str2, numA.intValue()));
        }
        c3435xi.Z();
        C3485zi renderViewTelemetry = c3435xi.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            renderViewTelemetry.f28024b = j10;
        }
        return c3435xi;
    }

    public final void a(String sourceId, String targetId) throws JSONException {
        kotlin.jvm.internal.s.h(sourceId, "sourceId");
        kotlin.jvm.internal.s.h(targetId, "targetId");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3228piA2 == null) {
            fl.k kVar = Gi.f24873a;
            JSONObject jSONObjectA = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3228piA.a("destroyWebView", jSONObjectA);
            return;
        }
        if (kotlin.jvm.internal.s.c(targetId, "default")) {
            a(gestureDetectorOnGestureListenerC3228piA, targetId, "destroyWebView");
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3228piA2.getWvStateMachine().a(8);
        if (numA != null) {
            int iIntValue = numA.intValue();
            fl.k kVar2 = Gi.f24873a;
            JSONObject jSONObjectA2 = AbstractC3073jj.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", iIntValue);
            gestureDetectorOnGestureListenerC3228piA.a("destroyWebView", jSONObjectA2);
            return;
        }
        gestureDetectorOnGestureListenerC3228piA2.b();
        gestureDetectorOnGestureListenerC3228piA.a(gestureDetectorOnGestureListenerC3228piA, targetId);
        InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t9).a("kj", "WebView with ID: " + targetId + " removed from parent.");
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, String str, String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("kj", "TAG");
            ((C3348u9) interfaceC3322t9).b("kj", "Cannot perform operations on default WebView with ID: " + str);
        }
        gestureDetectorOnGestureListenerC3228pi.a(str2, Gi.a(str, HttpStatusCodes.STATUS_CODE_SEE_OTHER));
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2, String str) throws JSONException {
        ViewParent parent = gestureDetectorOnGestureListenerC3228pi.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = gestureDetectorOnGestureListenerC3228pi;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            gestureDetectorOnGestureListenerC3228pi2.a("showWebView", Gi.a(str, 307));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            InterfaceC3322t9 interfaceC3322t9 = this.f26863b;
            if (interfaceC3322t9 != null) {
                kotlin.jvm.internal.s.g("kj", "TAG");
                ((C3348u9) interfaceC3322t9).a("kj", "Sibling view brought to front: " + gestureDetectorOnGestureListenerC3228pi);
            }
        } else {
            InterfaceC3322t9 interfaceC3322t10 = this.f26863b;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("kj", "TAG");
                ((C3348u9) interfaceC3322t10).b("kj", "Sibling view not found in parent: " + gestureDetectorOnGestureListenerC3228pi);
            }
        }
        gestureDetectorOnGestureListenerC3228pi2.c(gestureDetectorOnGestureListenerC3228pi2, str);
    }
}
