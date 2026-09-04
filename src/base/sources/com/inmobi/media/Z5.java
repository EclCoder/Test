package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.CookieManager;
import com.inmobi.media.Z5;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Z5 extends AbstractC3469z2 implements InterfaceC3408wh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f26114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f26118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3322t9 f26119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y5 f26120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2988gb f26122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26124l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z5(Context context, long j10, String placementType, String impressionId, String creativeId, Function1 onLpLifecycleEvent, InterfaceC3322t9 interfaceC3322t9) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placementType, "placementType");
        kotlin.jvm.internal.s.h(impressionId, "impressionId");
        kotlin.jvm.internal.s.h(creativeId, "creativeId");
        kotlin.jvm.internal.s.h(onLpLifecycleEvent, "onLpLifecycleEvent");
        this.f26114b = j10;
        this.f26115c = placementType;
        this.f26116d = impressionId;
        this.f26117e = creativeId;
        this.f26118f = onLpLifecycleEvent;
        this.f26119g = interfaceC3322t9;
        this.f26121i = Z5.class.getSimpleName();
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        e();
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    public static final fl.g0 a(Z5 z10) {
        X5 x10;
        ViewParent parent = z10.getParent();
        U5 u10 = parent instanceof U5 ? (U5) parent : null;
        if (u10 != null && (x10 = u10.f25808d) != null) {
            C c10 = ((Q8) x10).f25543a.f25615b;
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = c10 instanceof GestureDetectorOnGestureListenerC3228pi ? (GestureDetectorOnGestureListenerC3228pi) c10 : null;
            if (gestureDetectorOnGestureListenerC3228pi != null) {
                gestureDetectorOnGestureListenerC3228pi.D();
            }
        }
        return fl.g0.f38750a;
    }

    private final AdConfig getAdConfig() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return (AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class);
    }

    private final AdConfig.RenderingConfig getRenderingConfig() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getRendering();
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final boolean c() {
        String TAG = this.f26121i;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.AbstractC3469z2
    public final C2885cb d() {
        C2911db c2911db = new C2911db(true, null, getAdConfig().getCctEnabled(), 18);
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        return new C2885cb(context, c2911db, null, this, null, this.f26119g, 140);
    }

    public final void e() {
        Y5 y10 = new Y5("IN_CUSTOM_EXPAND", new tl.a() { // from class: yh.r6
            @Override // tl.a
            public final Object invoke() {
                return Z5.a(this.f57908a);
            }
        }, new Function1() { // from class: yh.s6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z5.a(this.f57923a, (JSONObject) obj);
            }
        }, new tl.o() { // from class: yh.t6
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return Z5.a(this.f57938a, (String) obj, (Map) obj2);
            }
        }, this.f26119g, null, 0L);
        setWebViewClient(y10);
        this.f26120h = y10;
    }

    public final C2988gb getLandingPageTelemetryControlInfo() {
        return this.f26122j;
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public long getViewTouchTimestamp() {
        return this.f26114b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String data, String str, String str2) {
        kotlin.jvm.internal.s.h(data, "data");
        super.loadData(data, str, str2);
        Y5 y10 = this.f26120h;
        if (y10 != null) {
            y10.f24438d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        kotlin.jvm.internal.s.h(url, "url");
        super.loadUrl(url);
        Y5 y10 = this.f26120h;
        if (y10 != null) {
            y10.f24438d = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (!this.f26124l) {
            this.f26124l = true;
            Function1 function1 = this.f26118f;
            GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
            function1.invoke(Vh.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.f26123k) {
            this.f26123k = true;
            Function1 function1 = this.f26118f;
            GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
            function1.invoke(Vh.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(C2988gb c2988gb) {
        this.f26122j = c2988gb;
        Y5 y10 = this.f26120h;
        if (y10 != null) {
            y10.f26063k = c2988gb;
            y10.f26064l = new C2936eb(c2988gb, y10);
        }
    }

    public void setViewTouchTimestamp(long j10) {
        this.f26114b = j10;
    }

    public static final fl.g0 a(Z5 z10, JSONObject it) {
        kotlin.jvm.internal.s.h(it, "it");
        z10.f26118f.invoke(it);
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(Z5 z10, String trackerName, Map macros) {
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
        ViewParent parent = z10.getParent();
        U5 u10 = parent instanceof U5 ? (U5) parent : null;
        if (u10 != null) {
            kotlin.jvm.internal.s.h(trackerName, "trackerName");
            kotlin.jvm.internal.s.h(macros, "macros");
            X5 x10 = u10.f25808d;
            if (x10 != null) {
                kotlin.jvm.internal.s.h(trackerName, "trackerName");
                kotlin.jvm.internal.s.h(macros, "macros");
                C c10 = ((Q8) x10).f25543a.f25615b;
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = c10 instanceof GestureDetectorOnGestureListenerC3228pi ? (GestureDetectorOnGestureListenerC3228pi) c10 : null;
                if (gestureDetectorOnGestureListenerC3228pi != null) {
                    gestureDetectorOnGestureListenerC3228pi.b(trackerName, macros);
                }
            }
        }
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final boolean a() {
        String TAG = this.f26121i;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final void a(String api) {
        kotlin.jvm.internal.s.h(api, "api");
        HashMap map = new HashMap();
        map.put("creativeId", this.f26117e);
        map.put("trigger", api);
        map.put("impressionId", this.f26116d);
        map.put("adType", this.f26115c);
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("BlockAutoRedirection", map, EnumC3281rk.SDK);
    }
}
