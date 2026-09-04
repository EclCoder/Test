package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcessClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import c1.pGX.geAgcEazw;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.google.api.client.http.HttpStatusCodes;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3435xi;
import com.inmobi.media.GestureDetectorOnGestureListenerC3228pi;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.media.videoPlayer.model.HtmlOmidTracker;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: renamed from: com.inmobi.media.pi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class GestureDetectorOnGestureListenerC3228pi extends AbstractC3469z2 implements C, G2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Of, InterfaceC3408wh {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final Vh f27208g1 = new Vh();

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final Uh f27209h1 = new Uh();

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f27210i1 = GestureDetectorOnGestureListenerC3228pi.class.getSimpleName();

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final I1 f27211j1 = new I1(Boolean.FALSE, new tl.a() { // from class: yh.ga
        @Override // tl.a
        public final Object invoke() {
            return Boolean.valueOf(GestureDetectorOnGestureListenerC3228pi.y());
        }
    }, false, true);
    public String A;
    public final GestureDetector A0;
    public Ec B;
    public final Mk B0;
    public boolean C;
    public boolean C0;
    public JSONObject D;
    public boolean D0;
    public JSONObject E;
    public Y5 E0;
    public boolean F;
    public W5 F0;
    public boolean G;
    public String G0;
    public boolean H;
    public Nf H0;
    public boolean I;
    public L0 I0;
    public Yn J;
    public final AtomicBoolean J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public U L0;
    public String M;
    public String M0;
    public final AtomicBoolean N;
    public boolean N0;
    public final Object O;
    public Oo O0;
    public final Object P;
    public boolean P0;
    public boolean Q;
    public Map Q0;
    public final boolean R;
    public final Zh R0;
    public View S;
    public final C3202oi S0;
    public WebChromeClient.CustomViewCallback T;
    public String T0;
    public int U;
    public final C2943ei U0;
    public boolean V;
    public final C2840ai V0;
    public boolean W;
    public final Xh W0;
    public boolean X0;
    public H4 Y0;
    public C3475z8 Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f27212a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f27213a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f27214b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f27215b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public C3176ni f27216b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f27217c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final AtomicBoolean f27218c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public O8 f27219c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27220d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f27221d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final C3046ii f27222d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27223e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C3485zi f27224e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final Th f27225e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27226f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final fl.k f27227f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Mo f27228f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f27229g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public C3148mg f27230g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3331ti f27231h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final fl.k f27232h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3322t9 f27233i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f27234i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Qi f27235j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Map f27236j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bo f27237k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public F2 f27238k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3184o0 f27239l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public C f27240l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdConfig f27241m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f27242m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f27243n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public InterfaceC3391w0 f27244n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f27245o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Wn f27246o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f27247p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f27248p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC3070jg f27249q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f27250q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f27251r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f27252r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C3436xj f27253s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int[] f27254s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fl.k f27255t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f27256t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public WeakReference f27257u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f27258u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f27259v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Yh f27260v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f27261w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final C2892ci f27262w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC3279ri f27263x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f27264x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final nm.a f27265y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f27266y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile em.z1 f27267z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public C3403wc f27268z0;

    public /* synthetic */ GestureDetectorOnGestureListenerC3228pi(Context context, byte b10, LinkedHashSet linkedHashSet, String str, String str2, long j10, C3331ti c3331ti, InterfaceC3322t9 interfaceC3322t9, Qi qi2, Bo bo2, C3184o0 c3184o0, AdConfig adConfig, int i10) {
        this(context, b10, (i10 & 4) != 0 ? null : linkedHashSet, (i10 & 8) != 0 ? null : str, (i10 & 16) == 0, (i10 & 32) != 0 ? "DEFAULT" : str2, (i10 & 64) != 0 ? -1L : j10, (i10 & 128) != 0 ? null : c3331ti, interfaceC3322t9, qi2, bo2, c3184o0, adConfig);
    }

    public static final TelemetryConfig.LandingPageConfig A() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
        return ((TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class)).getLpConfig();
    }

    public static final C3099kj c(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        return new C3099kj(gestureDetectorOnGestureListenerC3228pi.f27237k, gestureDetectorOnGestureListenerC3228pi.f27233i);
    }

    public static final fl.g0 f() {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = InMobiAdActivity.f24405u;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.D();
        }
        return fl.g0.f38750a;
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.f27232h0.getValue();
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraid();
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    private final Ck getScrollThrottler() {
        return (Ck) this.f27227f0.getValue();
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    public static final short m(String str) {
        kotlin.jvm.internal.s.e(str);
        return Short.parseShort(str);
    }

    private final void setAdSize(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setAdSize " + this);
        }
        P5 p10 = N5.f25313a;
        this.f27250q0 = (int) (N5.b() * Integer.parseInt(((String[]) new bm.o("x").j(str, 0).toArray(new String[0]))[0]));
        this.f27256t0 = ((int) (N5.b() * Integer.parseInt(((String[]) new bm.o("x").j(str, 0).toArray(new String[0]))[1]))) * this.f27250q0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    private final void setOmidViewableAd(Nk trackerAttr) {
        Wn wn2;
        boolean z10;
        Wn df2;
        if (this.f27213a1) {
            C3475z8 c3475z8 = this.Z0;
            if (c3475z8 != null) {
                Wn viewableAd = this.f27246o0;
                kotlin.jvm.internal.s.e(viewableAd);
                String str = this.f27252r0;
                kotlin.jvm.internal.s.h(this, "adContainer");
                kotlin.jvm.internal.s.h(viewableAd, "viewableAd");
                kotlin.jvm.internal.s.h(trackerAttr, "trackerAttr");
                Context context = (Context) c3475z8.f27993h.get();
                if (context != null) {
                    c3475z8.f27994i = getAdConfig().getViewability().getOmidConfig().getOmidEnabled();
                    em.o0 o0Var = c3475z8.f27989d;
                    Context context2 = context;
                    Ie ie2 = new Ie(c3475z8.f27989d, c3475z8.f27988c);
                    HashMap map = trackerAttr.f25365b;
                    Object obj = map.get("customReferenceData");
                    String str2 = obj instanceof String ? (String) obj : null;
                    Object obj2 = map.get("isolateVerificationScripts");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    Object obj3 = map.get("macros");
                    Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                    List<HtmlOmidTracker> omidTrackers = c3475z8.f27986a.getOmidTrackers();
                    ArrayList arrayList = new ArrayList(gl.r.v(omidTrackers, 10));
                    for (HtmlOmidTracker htmlOmidTracker : omidTrackers) {
                        arrayList.add(new Hf(htmlOmidTracker.getVendor(), htmlOmidTracker.getVerificationParams(), htmlOmidTracker.getUrl()));
                        map2 = map2;
                        context2 = context2;
                    }
                    Map map3 = map2;
                    Context context3 = context2;
                    Map mapH = map3 == null ? gl.l0.h() : map3;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Gf gf2 = new Gf(context3, this, viewableAd, o0Var, ie2, new C3373v8(arrayList, mapH, str2, str, kotlin.jvm.internal.s.c(bool, Boolean.TRUE)), c3475z8.f27988c);
                    c3475z8.f28001p = gf2;
                    df2 = gf2;
                }
            }
            wn2 = null;
            df2 = wn2;
        } else {
            wn2 = null;
            Object obj4 = trackerAttr.f25365b.get("omidAdSession");
            InterfaceC2952f1 interfaceC2952f1 = obj4 instanceof InterfaceC2952f1 ? (InterfaceC2952f1) obj4 : null;
            if (trackerAttr.f25365b.containsKey("deferred")) {
                Object obj5 = trackerAttr.f25365b.get("deferred");
                kotlin.jvm.internal.s.f(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj5).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            Object obj6 = trackerAttr.f25365b.get("customReferenceData");
            String str3 = obj6 instanceof String ? (String) obj6 : null;
            if (z10 && interfaceC2952f1 != null) {
                String str4 = this.f27252r0;
                Kf kf2 = Jf.f25068a;
                kf2.getClass();
                kotlin.jvm.internal.s.h(this, "webView");
                AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(kf2.f25120b, this, str4, str3);
                kotlin.jvm.internal.s.g(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                C3276rf c3276rf = (C3276rf) interfaceC2952f1;
                if (adSessionContextCreateHtmlAdSessionContext != null) {
                    c3276rf.f27398c = adSessionContextCreateHtmlAdSessionContext;
                }
            }
            if (interfaceC2952f1 != null) {
                Wn wn3 = this.f27246o0;
                kotlin.jvm.internal.s.e(wn3);
                df2 = new Df(this, wn3, interfaceC2952f1, this.f27233i);
            } else {
                df2 = wn2;
            }
        }
        if (df2 != null) {
            this.f27246o0 = df2;
            return;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).b(TAG, this.f27213a1 ? "Failed to create OMID tracked hybrid video ad." : "Did not find a OMID ad session; the IAB decorator will not be applied.");
        }
    }

    public static final boolean y() {
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.e(context);
        La laA = Ka.a(context, "default");
        kotlin.jvm.internal.s.h("enableImraidLogs", "key");
        return laA.f25198a.getBoolean("enableImraidLogs", false);
    }

    public final void B() {
        Activity activity;
        if (getPlacementType() == 0) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            toString();
            if (((Activity) this.f27259v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                kotlin.jvm.internal.s.h(this, "<this>");
                int i10 = 0;
                View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i10 >= upperBoundForActivityContext) {
                        break;
                    }
                    Context context = view.getContext();
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break loop0;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Object parent = view.getParent();
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                    i10++;
                }
                if (activity != null) {
                    this.f27259v = new WeakReference(activity);
                    fl.g0 g0Var = fl.g0.f38750a;
                }
            }
        }
    }

    public void C() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onImpressionFired " + this);
        }
        F();
        C3475z8 c3475z8 = this.Z0;
        if (c3475z8 != null) {
            HtmlVideoPlayerConfig htmlVideoPlayerConfig = c3475z8.f27995j;
            Gf gf2 = c3475z8.f28001p;
            if (gf2 != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                if (skippable) {
                    Ie ie2 = gf2.f24863e;
                    if (ie2 != null) {
                        ie2.a(skipOffset, autoplay);
                    }
                } else {
                    Ie ie3 = gf2.f24863e;
                    if (ie3 != null) {
                        ie3.a(autoplay);
                    }
                }
                Ie ie4 = gf2.f24863e;
                if (ie4 != null) {
                    if (ie4.f26434e == null) {
                        InterfaceC3322t9 interfaceC3322t10 = ie4.f26431b;
                        if (interfaceC3322t10 != null) {
                            ((C3348u9) interfaceC3322t10).a(AbstractC2926e1.f26429f, "Failed to registerImpression: AdEvent is null");
                        }
                    } else {
                        InterfaceC3322t9 interfaceC3322t11 = ie4.f26431b;
                        if (interfaceC3322t11 != null) {
                            ((C3348u9) interfaceC3322t11).a(AbstractC2926e1.f26429f, "registerImpression");
                        }
                        T4.a(ie4.f26430a, new Z0(ie4, null));
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void D() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onUserLandingCompleted " + this);
        }
        h("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void E() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "processUnload " + this);
        }
        if (this.N.get()) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).b(TAG2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!z()) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
            if (interfaceC3322t11 != null) {
                String TAG3 = f27210i1;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                ((C3348u9) interfaceC3322t11).b(TAG3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.D0) {
            InterfaceC3322t9 interfaceC3322t12 = this.f27233i;
            if (interfaceC3322t12 != null) {
                String TAG4 = f27210i1;
                kotlin.jvm.internal.s.g(TAG4, "TAG");
                ((C3348u9) interfaceC3322t12).b(TAG4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.P0) {
            return;
        }
        this.P0 = true;
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        Runnable runnable = new Runnable() { // from class: yh.ta
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC3228pi.a(this.f57946a);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.post(runnable);
    }

    public final void F() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "recordContextualData " + this);
        }
        H4 h10 = this.Y0;
        if (h10 != null) {
            h10.a();
        }
    }

    public final void G() {
        String str;
        C3365v0 c3365v0;
        String str2;
        String str3;
        String str4;
        C3365v0 c3365v1;
        String str5;
        C3237q1 c3237q1;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "sendTelemetryEventForNetworkLoad " + this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put("errorCode", Short.valueOf(this.C0 ? (short) 2212 : (short) 2211));
        C3331ti c3331ti = this.f27231h;
        if (c3331ti != null && (c3237q1 = c3331ti.f27567j) != null) {
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - c3237q1.f27301a.f27363c));
        }
        C3331ti c3331ti2 = this.f27231h;
        if (c3331ti2 != null && (c3365v1 = c3331ti2.f27558a) != null && (str5 = c3365v1.f27664f) != null) {
            linkedHashMap.put("plType", str5);
        }
        C3331ti c3331ti3 = this.f27231h;
        if (c3331ti3 != null && (str4 = c3331ti3.f27563f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        C3331ti c3331ti4 = this.f27231h;
        if (c3331ti4 != null && (str3 = c3331ti4.f27559b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        C3331ti c3331ti5 = this.f27231h;
        if (c3331ti5 != null && (c3365v0 = c3331ti5.f27558a) != null && (str2 = c3365v0.f27663e) != null) {
            linkedHashMap.put("adType", str2);
        }
        C3331ti c3331ti6 = this.f27231h;
        if (c3331ti6 != null && (str = c3331ti6.f27561d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        C3331ti c3331ti7 = this.f27231h;
        if (c3331ti7 != null) {
            linkedHashMap.put("isRewarded", Boolean.valueOf(c3331ti7.f27565h));
        }
        a("NetworkLoadLimitExceeded", (HashMap) linkedHashMap);
    }

    public final void H() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "setCurrentPosition " + this);
        }
        this.E = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            JSONObject jSONObject = this.E;
            if (jSONObject != null) {
                jSONObject.put("x", J3.b(iArr[0] / N5.b()));
            }
            JSONObject jSONObject2 = this.E;
            if (jSONObject2 != null) {
                jSONObject2.put("y", J3.b(iArr[1] / N5.b()));
            }
            int iB = J3.b(getWidth() / N5.b());
            int iB2 = J3.b(getHeight() / N5.b());
            JSONObject jSONObject3 = this.E;
            if (jSONObject3 != null) {
                jSONObject3.put("width", iB);
            }
            JSONObject jSONObject4 = this.E;
            if (jSONObject4 != null) {
                jSONObject4.put("height", iB2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.P) {
            this.G = false;
            this.P.notifyAll();
            fl.g0 g0Var = fl.g0.f38750a;
        }
    }

    public final void I() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "setDefaultPosition " + this);
        }
        int[] iArr = new int[2];
        this.D = new JSONObject();
        if (this.f27261w == null) {
            ViewParent parent = getParent();
            this.f27261w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.f27261w;
        if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
            WeakReference weakReference2 = this.f27261w;
            if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                JSONObject jSONObject = this.D;
                if (jSONObject != null) {
                    jSONObject.put("x", J3.b(iArr[0] / N5.b()));
                }
                JSONObject jSONObject2 = this.D;
                if (jSONObject2 != null) {
                    jSONObject2.put("y", J3.b(iArr[1] / N5.b()));
                }
                WeakReference weakReference3 = this.f27261w;
                int iB = J3.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / N5.b());
                WeakReference weakReference4 = this.f27261w;
                int iB2 = J3.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / N5.b());
                JSONObject jSONObject3 = this.D;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", iB);
                }
                JSONObject jSONObject4 = this.D;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", iB2);
                }
            } catch (JSONException unused) {
                fl.g0 g0Var = fl.g0.f38750a;
            }
        } else {
            try {
                JSONObject jSONObject5 = this.D;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                JSONObject jSONObject6 = this.D;
                if (jSONObject6 != null) {
                    jSONObject6.put("y", 0);
                }
                JSONObject jSONObject7 = this.D;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.D;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (JSONException unused2) {
                fl.g0 g0Var2 = fl.g0.f38750a;
            }
        }
        synchronized (this.O) {
            this.F = false;
            this.O.notifyAll();
            fl.g0 g0Var3 = fl.g0.f38750a;
        }
    }

    public final void J() {
        int webImpressionMinPercentageViewed;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setFallbackImpressionMinPercentageViewed " + this);
        }
        if (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_VIDEO, this.G0)) {
            webImpressionMinPercentageViewed = getAdConfig().getViewability().getVideoImpressionMinPercentageViewed();
        } else {
            webImpressionMinPercentageViewed = (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, this.G0) && kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
        }
        this.f27266y0 = webImpressionMinPercentageViewed;
    }

    public final void K() {
        int webImpressionMinTimeViewed;
        if (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_VIDEO, this.G0)) {
            webImpressionMinTimeViewed = getAdConfig().getViewability().getVideoImpressionMinTimeViewed();
        } else {
            webImpressionMinTimeViewed = (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, this.G0) && kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
        }
        this.f27264x0 = webImpressionMinTimeViewed;
    }

    public final void L() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setFallbackImpressionParams " + this);
        }
        K();
        J();
        M();
    }

    public final void M() {
        byte audioImpressionType;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setFallbackImpressionType " + this);
        }
        String adType = getAdType();
        if (kotlin.jvm.internal.s.c(adType, "banner")) {
            audioImpressionType = getAdConfig().getViewability().getBannerImpressionType();
        } else {
            audioImpressionType = kotlin.jvm.internal.s.c(adType, MimeTypes.BASE_TYPE_AUDIO) ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
        }
        this.f27251r = audioImpressionType;
    }

    public final void N() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setImpressionParams " + this);
        }
        if (this.f27217c == null) {
            L();
            return;
        }
        try {
            L();
            for (Nk nk2 : this.f27217c) {
                if (nk2.f25364a == 2) {
                    if (nk2.f25365b.containsKey("type")) {
                        Object obj = nk2.f25365b.get("type");
                        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlin.Int");
                        this.f27251r = (byte) ((Integer) obj).intValue();
                    } else {
                        M();
                    }
                    if (nk2.f25365b.containsKey("time")) {
                        Object obj2 = nk2.f25365b.get("time");
                        kotlin.jvm.internal.s.f(obj2, "null cannot be cast to non-null type kotlin.Int");
                        this.f27264x0 = ((Integer) obj2).intValue();
                    } else {
                        K();
                    }
                    if (nk2.f25365b.containsKey(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                        Object obj3 = nk2.f25365b.get(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                        kotlin.jvm.internal.s.f(obj3, "null cannot be cast to non-null type kotlin.Int");
                        this.f27266y0 = ((Integer) obj3).intValue();
                    } else {
                        J();
                    }
                    if (this.f27251r == 2) {
                        if (nk2.f25365b.containsKey("pixel")) {
                            Object obj4 = nk2.f25365b.get("pixel");
                            kotlin.jvm.internal.s.f(obj4, "null cannot be cast to non-null type kotlin.Int");
                            this.f27258u0 = ((Integer) obj4).intValue();
                        } else {
                            M();
                        }
                        if (nk2.f25365b.containsKey("frame")) {
                            Object obj5 = nk2.f25365b.get("frame");
                            this.f27254s0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            M();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).b(TAG2, "Exception in parsing the impressionType and pixel frame");
            }
            L();
        } catch (Exception unused2) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
            if (interfaceC3322t11 != null) {
                String TAG3 = f27210i1;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                ((C3348u9) interfaceC3322t11).b(TAG3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            L();
        }
    }

    public final void O() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "setIsViewHardwareAccelerated " + this);
        }
        this.C = isHardwareAccelerated();
    }

    public final void P() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "skipFromInterActive " + this);
        }
        H4 h10 = this.Y0;
        if (h10 != null) {
            h10.h();
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "skipFromInterActive");
        }
    }

    public final void Q() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "startTrackingAudioVolume " + this);
        }
        if (!z() || this.f27223e) {
            return;
        }
        C3235q c3235q = C3235q.f27289a;
        Yh listener = this.f27260v0;
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        kotlin.jvm.internal.s.h(listener, "listener");
        em.k.d(C3235q.f27295g, null, null, new C3105l(interfaceC3322t10, listener, null), 3, null);
    }

    public final void R() {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        Set linkedHashSet;
        Set<View> setKeySet;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "startTrackingExposure " + this);
        }
        if (!z() || this.f27223e) {
            gestureDetectorOnGestureListenerC3228pi = this;
            InterfaceC3322t9 interfaceC3322t10 = gestureDetectorOnGestureListenerC3228pi.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).b(TAG2, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (setKeySet = friendlyViews.keySet()) == null || (linkedHashSet = gl.r.M0(setKeySet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            gestureDetectorOnGestureListenerC3228pi = this;
            gestureDetectorOnGestureListenerC3228pi.L0 = new U(gestureDetectorOnGestureListenerC3228pi, linkedHashSet, getAdConfig().getMraid3().getExposureChangeInterval(), this.f27262w0, this.f27233i);
        }
        U u10 = gestureDetectorOnGestureListenerC3228pi.L0;
        if (u10 != null) {
            u10.a();
        }
    }

    public final void S() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "stopTrackingAudioVolume " + this);
        }
        C3235q c3235q = C3235q.f27289a;
        Yh listener = this.f27260v0;
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        kotlin.jvm.internal.s.h(listener, "listener");
        em.k.d(C3235q.f27295g, null, null, new C3157n(interfaceC3322t10, listener, null), 3, null);
    }

    public final void T() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "stopTrackingExposure " + this);
        }
        U u10 = this.L0;
        if (u10 != null) {
            u10.b();
        }
    }

    public final void U() {
        new C3(this, !this.H, !this.K, this.f27233i).a(this.f27228f1);
    }

    public final long V() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "timeSincePodShow " + this);
        }
        InterfaceC3391w0 interfaceC3391w0 = this.f27244n0;
        if (interfaceC3391w0 != null) {
            return ((AbstractC3107l1) interfaceC3391w0).U();
        }
        return 0L;
    }

    public final void W() {
        getListener().e(this);
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "ad dismissed");
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a();
        }
        L0 l10 = this.I0;
        if (l10 == null) {
            kotlin.jvm.internal.s.w("adQualityManager");
            l10 = null;
        }
        if (l10.f25156d.get()) {
            l10.a("session end is already triggered");
            return;
        }
        if (!l10.f25153a.getEnabled()) {
            l10.a("config kill switch - false. ad quality will skip");
        } else if (l10.f25159g == null) {
            l10.a("setup not done. ignore trigger");
        } else {
            l10.f25156d.set(true);
            l10.a(false);
        }
    }

    public final void X() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "unregisterBackButtonPressedEventListener " + this);
        }
        this.M = null;
    }

    public final void Y() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "updateActivitiesOrientationProperties " + this);
        }
        Activity activity = (Activity) this.f27257u.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Nf orientationProperties = this.H0;
        kotlin.jvm.internal.s.h(orientationProperties, "orientationProperties");
        T8 t10 = ((InMobiAdActivity) activity).f24406a;
        if (t10 == null) {
            kotlin.jvm.internal.s.w("orientationHandler");
            t10 = null;
        }
        t10.a(orientationProperties);
    }

    public final void a(C3403wc movementGestureDetector) {
        kotlin.jvm.internal.s.h(movementGestureDetector, "movementGestureDetector");
        if (this.f27223e || !getRenderingConfig().getSupportedGestures().contains(2)) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "Pan gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            JSONArray jSONArray = movementGestureDetector.f27789j;
            Integer numValueOf = jSONArray != null ? Integer.valueOf(jSONArray.length()) : null;
            ((C3348u9) interfaceC3322t10).a(TAG2, bm.r.j("onPanDetected\n " + numValueOf + " \n " + movementGestureDetector.f27789j));
        }
        h("window.imraidview.onGestureDetected('2', '" + movementGestureDetector.f27789j + "');");
    }

    public final void b(C3403wc rotationDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        kotlin.jvm.internal.s.h(rotationDetector, "rotationDetector");
        kotlin.jvm.internal.s.h(initialEvent, "initialEvent");
        kotlin.jvm.internal.s.h(endEvent, "endEvent");
        if (this.f27223e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, bm.r.j(" Rotation detected " + rotationDetector.f27788i + " \n " + initialEvent + " \n " + endEvent));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(initialEvent.getX())), Integer.valueOf(J3.c(initialEvent.getY())))));
        jSONArray.put(new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(initialEvent.getX(1))), Integer.valueOf(J3.c(initialEvent.getY(1))))));
        jSONArray.put(new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(endEvent.getX())), Integer.valueOf(J3.c(endEvent.getY())))));
        jSONArray.put(new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(endEvent.getX(1))), Integer.valueOf(J3.c(endEvent.getY(1))))));
        h("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void d(boolean z10) {
        Yn yn2 = z10 ? Yn.VISIBLE : Yn.HIDDEN;
        if (this.J != yn2) {
            if (!this.Q) {
                this.J = yn2;
                if (z10) {
                    getListener().i(this);
                }
                c(z10);
                L0 l10 = this.I0;
                if (l10 != null) {
                    Yn adViewableStatus = this.J;
                    kotlin.jvm.internal.s.h(adViewableStatus, "adViewableStatus");
                    l10.f25160h = adViewableStatus;
                }
                p();
            }
            C3475z8 c3475z8 = this.Z0;
            if (c3475z8 == null || c3475z8.f27992g.get() || !C3475z8.a(c3475z8, new EnumC3399w8[]{EnumC3399w8.LOADED, EnumC3399w8.PLAYING, EnumC3399w8.PAUSED}, null, null, null, 14) || c3475z8.f27997l == z10) {
                return;
            }
            c3475z8.f27997l = z10;
            if (!z10) {
                if (!c3475z8.f27992g.get() && c3475z8.f27996k.f25603p.isPlaying()) {
                    c3475z8.f27996k.f();
                    R7 r10 = c3475z8.f27996k;
                    Bg state = Bg.STATE_PAUSED;
                    r10.getClass();
                    kotlin.jvm.internal.s.h(state, "state");
                    r10.f25607t = state;
                    return;
                }
                return;
            }
            if (c3475z8.f27992g.get()) {
                return;
            }
            R7 r11 = c3475z8.f27996k;
            if (r11.f25607t == Bg.STATE_PAUSED) {
                r11.e();
                R7 r12 = c3475z8.f27996k;
                Bg state2 = Bg.STATE_PLAYING;
                r12.getClass();
                kotlin.jvm.internal.s.h(state2, "state");
                r12.f25607t = state2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.s.h(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.K0) {
                InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
                if (interfaceC3322t9 != null) {
                    String TAG = f27210i1;
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    ((C3348u9) interfaceC3322t9).b(TAG, "dispatchTouchEvent Invalid Coordinates " + event);
                }
                this.K0 = true;
            }
            return super.dispatchTouchEvent(event);
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "dispatchTouchEvent " + this);
        }
        this.B0.a(event);
        if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.dispatchTouchEvent(event);
    }

    public final void e() {
        int audioNetworkLoadsLimit;
        WebViewClient webViewClient;
        if (this.f27223e) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            Y5 y10 = new Y5("IN_CUSTOM_BROWSER", new tl.a() { // from class: yh.ia
                @Override // tl.a
                public final Object invoke() {
                    return GestureDetectorOnGestureListenerC3228pi.f();
                }
            }, new Function1() { // from class: yh.ja
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC3228pi.a((JSONObject) obj);
                }
            }, new tl.o() { // from class: yh.ka
                @Override // tl.o
                public final Object invoke(Object obj, Object obj2) {
                    return GestureDetectorOnGestureListenerC3228pi.a((String) obj, (Map) obj2);
                }
            }, this.f27233i, this.f27219c1, getAdConfig().getCustomBrowser().getInt().getLoadCompletionDeBounce());
            this.E0 = y10;
            webViewClient = y10;
        } else {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).c(TAG2, "view is ad. Using RenderViewClient");
            }
            C3254qi c3254qi = new C3254qi(this.f27224e0, this.f27233i, new Function1() { // from class: yh.la
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC3228pi.a(this.f57824a, ((Boolean) obj).booleanValue());
                }
            });
            String adType = getAdType();
            if (kotlin.jvm.internal.s.c(adType, "banner")) {
                audioNetworkLoadsLimit = getAdConfig().getRendering().getBannerNetworkLoadsLimit();
            } else {
                audioNetworkLoadsLimit = kotlin.jvm.internal.s.c(adType, MimeTypes.BASE_TYPE_AUDIO) ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            }
            c3254qi.f24436b = audioNetworkLoadsLimit;
            webViewClient = c3254qi;
        }
        setWebViewClient(webViewClient);
    }

    public final void g() {
        String TAG = f27210i1;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        toString();
        em.z1 z1Var = this.f27267z;
        if (z1Var != null) {
            em.z1.c0(z1Var, null, 1, null);
        }
        this.f27267z = null;
    }

    public AdConfig getAdConfig() {
        return this.f27241m;
    }

    public final C3184o0 getAdMetaData() {
        return this.f27239l;
    }

    public final InterfaceC3391w0 getAdPodHandler() {
        return this.f27244n0;
    }

    public final L0 getAdQualityManager() {
        L0 l10 = this.I0;
        if (l10 != null) {
            return l10;
        }
        kotlin.jvm.internal.s.w("adQualityManager");
        return null;
    }

    public String getAdType() {
        return this.f27234i0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f27242m0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    public final WeakReference<Activity> getBannerHolderActivity() {
        return this.f27259v;
    }

    public final String getBeaconUrl() {
        return this.M0;
    }

    public final Mo getCloseAssetArea() {
        return this.f27228f1;
    }

    public final long getConfiguredArea() {
        return this.f27256t0;
    }

    public Context getContainerContext() {
        Activity activity = (Activity) this.f27257u.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        return context;
    }

    public final String getContentURL() {
        return this.f27252r0;
    }

    public final H4 getContextualDataHandler() {
        return this.Y0;
    }

    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    public String getCreativeId() {
        return this.f27215b0;
    }

    public final String getCurrentPosition() {
        String string;
        JSONObject jSONObject = this.E;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    public final Object getCurrentPositionMonitor() {
        return this.P;
    }

    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC3391w0 interfaceC3391w0 = this.f27244n0;
        if (interfaceC3391w0 != null) {
            return ((AbstractC3107l1) interfaceC3391w0).l(this);
        }
        return 0;
    }

    public Object getDataModel() {
        return null;
    }

    public final String getDefaultPosition() {
        String string;
        JSONObject jSONObject = this.D;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    public final Object getDefaultPositionMonitor() {
        return this.O;
    }

    public final W5 getEmbeddedBrowserJsCallbacks() {
        return this.F0;
    }

    public final U getExposureTracker() {
        return this.L0;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.f27236j0;
    }

    public final Activity getFullScreenActivity() {
        return (Activity) this.f27257u.get();
    }

    public B getFullScreenEventsListener() {
        return this.f27222d1;
    }

    public String getImpressionId() {
        return this.f27220d;
    }

    public final byte getImpressionType() {
        return this.f27251r;
    }

    public final O8 getInAppActivityBrowserClientListener() {
        return this.f27219c1;
    }

    public final String getLandingScheme() {
        return this.f27226f;
    }

    public final AbstractC3279ri getListener() {
        AbstractC3279ri abstractC3279ri = this.f27263x;
        if (abstractC3279ri != null) {
            return abstractC3279ri;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "listener getter " + this);
        }
        Uh uh2 = f27209h1;
        this.f27263x = uh2;
        return uh2;
    }

    public final String getMCreativeType() {
        return this.G0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.f27266y0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.f27264x0;
    }

    public final Wn getMViewableAd() {
        return this.f27246o0;
    }

    public String getMarkupType() {
        return this.T0;
    }

    public final String getMarkupTypeAdUnit() {
        return this.T0;
    }

    public final Ec getMediaProcessor() {
        return this.B;
    }

    public final int getMinimumPixelsPainted() {
        return this.f27258u0;
    }

    public final String getMraidJsString() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "mraidJsString getter " + this);
        }
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h("mraid_js_store", "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "mraid_js_store");
        kotlin.jvm.internal.s.h("mraid_js_string", "key");
        kotlin.jvm.internal.s.h("mraid_js_string", "key");
        String string = laA.f25198a.getString("mraid_js_string", null);
        if (string == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).a(TAG2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(d){}};this.remove=function(a){var d=!1,e=this;b=b.filter(function(b){if(b=b===a)--e.count,\nd=!0;return!b});return d};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(d){try{d.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(d){this.log(d)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var d=this.listeners;d[c]||(d[c]=new EventListeners(c));d[c].broadcast(b)}catch(e){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var d=arguments[c],d=JSON.parse(d);b[c]=d}else b[c]=arguments[c];d=b[1];\"success\"!=d&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){d={};d.command=a;d.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)e=arguments[c+1],null!=e&&(b[arguments[c]]=\"\"+e);d.params=b}else for(var d=this.urlScheme+\"://\"+a,e,b=!0,c=1;c<arguments.length;c+=2)e=arguments[c+1],null!=e&&(b?(d+=\"?\",b=!1):d+=\"&\",d+=arguments[c]+\"=\"+escape(e));__im__iosNativeCall.executeNativeCall(d);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(d){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(d);return!1};a.popupBlocked=function(d){a.firePopupBlockedBeacon(d)};a.zeroPad=function(a){var b=\"\";10>a&&(b+=\"0\");return b+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"use CustomClose: \"+b)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,e){c?b.push(a):(eval(a),e&&(c=!0))};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nb.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(e){imraidview.showAlert(\"setOrientationProperties: \"+e+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"open: \"+b)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+a)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+\na)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var b=\"\";null!=a&&(b=a);try{sdkController.playVideo(\"window.mraidview\",b)}catch(c){imraidview.showAlert(\"playVideo: \"+c)}};a.stringify=function(b){if(\"undefined\"===\ntypeof JSON){var c=\"\",h;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(h=0;h<b.length;h++)0<h&&(c+=\",\"),c+=a.stringifyArg(b[h]);return c+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(a){var b,c,f;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(f in a)null!==a[f]&&(c||(b+=\",\"),b=b+'\"'+f+'\":',c=typeof a[f],b=\"number\"===c||\"boolean\"===c?b+a[f]:\"function\"===typeof a[f]?b+'\"\"':a[f]instanceof\nObject?b+this.stringify(args[i][f]):b+'\"'+a[f]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var b;switch(a.orientation){case 0:case 180:b=\"portrait\";break;case 90:case 270:b=\"landscape\";break;default:b=\"none\"}return{orientation:b,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var c={};c.allowOrientationChange=!b.lockOrientation;c.forceOrientation=b.orientation;a.setOrientationProperties(c)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(h){imraidview.showAlert(\"executeNativesetExpandProperties: \"+h+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(b){var c,h;try{c=parseInt(b.width);h=parseInt(b.height);if(isNaN(c)||isNaN(h)||1>c||1>h)throw\"Invalid\";b.width=c;b.height=h;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(f){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",f=0;f<b;f++)c+=a[f];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0);\"function\"===typeof b.iosBannerExposureChange&&b.iosBannerExposureChange(a)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=\nfunction(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(c){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=\na.getState())&&a.useCustomClose(c.useCustomClose),window.mraid.broadcastEvent(\"error\",\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(c))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):\n(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),b.expand(a))}catch(c){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=function(){try{1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};\na.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=\nb.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+c+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var d=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var d=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var d={name:\"timeupdate\",target:{}};d.target.currentTime=b;d.target.duration=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+a;d.width=b;d.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+\na;d.width=b;d.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(a,b,c){var d={name:\"close\"};d.viaUserInteraction=b;d.target={};d.target.currentTime=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.fireMediaVolumeChangeEvent=function(a,b,c){var d={name:\"volumechange\",target:{}};d.target.volume=b;d.target.muted=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",b,c):sdkController.openExternal(\"window.imraidview\",\nb)}catch(d){a.showAlert(\"openExternal: \"+d)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,d=\"\",e=0;e<c;e++)d+=b[e];return parseInt(d)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,d,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==\na||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(d){}};a.customExpand=function(b,c,d,e,f){try{void 0==d||\"number\"!=typeof d?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):\nvoid 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==f||\"boolean\"!=typeof f?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,d,e,f)}catch(h){a.showAlert(\"executeNativeCustomExpand: \"+h+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+d+\", bottomNavBarVisible = \"+f+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};\na.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=function(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",\na)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,void 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=\nc&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(d){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=function(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=\nmraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(d){a.showAlert(\"checkFallbackViewable: \"+d)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};a.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",\nb,c)}catch(d){a.showAlert(\"loadWebView: \"+d)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"sendMessage: \"+\nd)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===typeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):\nsdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};var d=function(){try{var a=window.mraidview.getSdkVersionInt();return 1110===a||1111===a}catch(b){return!1}},e=0,h=function(a,b){var c=Number(a);return!isNaN(c)&&isFinite(c)?Math.round(c*b):a};a.createVideoPlayer=function(b){try{if(!(0<e))try{e=\"number\"===typeof window.devicePixelRatio&&0<window.devicePixelRatio?window.devicePixelRatio:1}catch(c){e=1}if(d())try{var f=b.config;\"undefined\"!==typeof f.playbackUpdateInterval&&null!==f.playbackUpdateInterval&&\n(f.playbackInterval=f.playbackUpdateInterval);var g=f.videoViewPosition;null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==typeof g.x&&null!==g.x)&&(g.x=h(g.x,e));null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==typeof g.y&&null!==g.y)&&(g.y=h(g.y,e))}catch(l){a.showAlert(\"applyCreateVideoPlayerContractPatch: \"+l)}k();sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(r){a.showAlert(\"createVideoPlayer: \"+r)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",\nJSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,d){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");sdkController.executeVideoPlayerActions(\"window.imraidview\",b,JSON.stringify(d))}catch(e){a.showAlert(\"executeVideoPlayerActions: \"+e)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{l(),\nsdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}};var f=null,g=!1,k=function(){if(!g&&d())try{f=window.imraid.broadcastEvent,window.imraid.broadcastEvent=function(b){try{if(1<arguments.length&&\"VideoPlayerPosition\"===arguments[0]&&window.mraidview){var c=arguments[1];c&&(\"undefined\"!==typeof c.x&&null!==c.x)&&(c.x=h(c.x,1/e));c&&(\"undefined\"!==typeof c.y&&null!==c.y)&&(c.y=h(c.y,1/e))}if(\"function\"===typeof f)return f.apply(this,arguments)}catch(d){a.showAlert(\"originalBroadcastEvent failed: \"+\nd)}},g=!0}catch(b){l(),a.showAlert(\"Registering listener failed: \"+b)}},l=function(){try{g&&(window.imraid.broadcastEvent=f,f=null,g=!1)}catch(b){a.showAlert(\"Unregistering listener failed: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,h){var f=arguments.length,g,k=null;if(3>f){if(\"function\"===typeof arguments[f-1])g=arguments[f-1];else return;k={reason:1}}else a.saveContentIDMap[c]&&(g=arguments[2],k={reason:11,url:arguments[1]});\"function\"!==!g&&(k?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,g),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(k))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,h)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,h,f){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,h,f)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=b.impressionFired;a.getImraidVersion=\nb.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=b.showWebView;a.sendMessage=b.sendMessage;\na.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(d){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(a){try{\"number\"===typeof a&&Number.isFinite(a)&&1120<=getSdkVersionInt()?sdkController.fireAdFailed(\"window.imaiview\",a):sdkController.fireAdFailed(\"window.imaiview\")}catch(c){sdkController.fireAdFailed(\"window.imaiview\")}};\na.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var e=-1;try{e=a.indexOf(b)}catch(h){}return e};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,d,e){if(!imIsObjValid(d)||!imIsObjValid(e))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+d+\",\"+e):a+(\"&u-tap-o=\"+d+\",\"+e));return a};b.performAdClick=function(a,d){d=d||event;if(imIsObjValid(a)){var e=a.clickConfig,h=a.landingConfig;if(!imIsObjValid(e)&&!imIsObjValid(h))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,k=null,l=null,n=null,m=null,q=null,p=null;if(imIsObjValid(d))try{l=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(s){n=\nl=0}imIsObjValid(h)?imIsObjValid(e)?(m=h.url,q=h.fallbackUrl,p=h.urlType,f=e.url,g=e.pingWV,k=e.fr):(m=h.url,p=h.urlType):(m=e.url,p=e.urlType);e=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=!0;if(0>g||1<g)g=!0;if(\"number\"!=typeof p||null==p)p=0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,k):b.ping(f,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(m))switch(imIsObjValid(f)||\n(m=b.appendTapParams(m,l,n)),p){case 1:b.openEmbedded(m);break;case 2:\"ios\"==e?b.ios.openItunesProductView(m):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+e);break;default:b.openExternal(m,q)}else b.log(\"Landing url provided is null.\")}catch(r){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,d){d=d||event;if(imIsObjValid(a)){var e=a.clickConfig,h=a.landingConfig;\nif(!imIsObjValid(e)&&!imIsObjValid(h))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,k=null,l=null,n=null;if(imIsObjValid(d))try{l=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(m){n=l=0}imIsObjValid(e)&&(f=e.url,g=e.pingWV,k=e.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=\n!0;if(0>g||1<g)g=!0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,k):b.ping(f,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(h)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,d){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,d)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
        if (interfaceC3322t11 != null) {
            String TAG3 = f27210i1;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            ((C3348u9) interfaceC3322t11).a(TAG3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    public final Nf getOrientationProperties() {
        return this.H0;
    }

    public final long getPlacementId() {
        return this.f27212a0;
    }

    public byte getPlacementType() {
        return this.f27214b;
    }

    public final HtmlVideoPlaybackState getPlaybackState() {
        C3475z8 c3475z8 = this.Z0;
        if (c3475z8 == null) {
            return null;
        }
        if (c3475z8.f27992g.get()) {
            return new HtmlVideoPlaybackState();
        }
        if (c3475z8.f28002q.get() == EnumC3399w8.INIT) {
            EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
            c3475z8.a("getVideoPlayerState", "Playback state requested before load", (String) null);
        }
        return c3475z8.f27996k.a();
    }

    public C getReferenceContainer() {
        return this.f27240l0;
    }

    public final C3485zi getRenderViewTelemetry() {
        return this.f27224e0;
    }

    public final JSONArray getRenderableAdIndexes() {
        InterfaceC3391w0 interfaceC3391w0 = this.f27244n0;
        return interfaceC3391w0 != null ? ((AbstractC3107l1) interfaceC3391w0).w() : new JSONArray();
    }

    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    public final Qi getRoute() {
        return this.f27235j;
    }

    public final JSONObject getSafeArea() {
        Oo oo2 = this.O0;
        if (oo2 != null) {
            Integer numF = N5.f();
            No no2 = (numF == null && (numF = N5.f25319g) == null) ? null : (No) oo2.f25445d.get(numF);
            if (no2 != null) {
                return no2.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.N0;
    }

    public final long getShowTimeStamp() {
        InterfaceC3391w0 interfaceC3391w0 = this.f27244n0;
        if (interfaceC3391w0 != null) {
            return ((AbstractC3107l1) interfaceC3391w0).x();
        }
        return 0L;
    }

    public final C3099kj getSiblingWebviewManager() {
        return (C3099kj) this.f27255t.getValue();
    }

    public Map<String, C3262r1> getTelemetryManagerMap() {
        return this.Q0;
    }

    public C3437xk getTelemetryOnAdImpression() {
        Map<String, C3262r1> telemetryManagerMap = getTelemetryManagerMap();
        return new C3437xk(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.G0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    public final boolean getUnloaded() {
        return this.P0;
    }

    public final InterfaceC2898co getVISIBILITY_CHANGE_LISTENER() {
        return this.W0;
    }

    public View getVideoContainerView() {
        return null;
    }

    public final String getViewState() {
        return this.A;
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public long getViewTouchTimestamp() {
        return this.f27229g;
    }

    @Override // com.inmobi.media.C
    public Wn getViewableAd() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "viewableAd getter " + this);
        }
        if (this.f27246o0 == null) {
            this.f27246o0 = new J9(this, new Xn(this), new C3346u7(this.f27251r, this.G0, this.f27264x0, this.f27266y0, getVisibilityTrackingMinPercentage(), this.f27233i), this.f27233i);
            Set<Nk> set = this.f27217c;
            if (set != null) {
                for (Nk nk2 : set) {
                    try {
                        if (nk2.f25364a == 3) {
                            setOmidViewableAd(nk2);
                        }
                        fl.g0 g0Var = fl.g0.f38750a;
                    } catch (Exception e10) {
                        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
                        if (interfaceC3322t10 != null) {
                            String TAG2 = f27210i1;
                            kotlin.jvm.internal.s.g(TAG2, "TAG");
                            ((C3348u9) interfaceC3322t10).b(TAG2, "Exception occurred while creating the HTML viewable ad : " + e10.getMessage());
                            fl.g0 g0Var2 = fl.g0.f38750a;
                        }
                    }
                }
            }
        }
        Wn wn2 = this.f27246o0;
        kotlin.jvm.internal.s.e(wn2);
        return wn2;
    }

    public final int[] getViewableFrameArray() {
        return this.f27254s0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final Bo getWebViewFactory() {
        return this.f27237k;
    }

    public final Lo getWindowInsetListener() {
        return this.S0;
    }

    public final C3436xj getWvStateMachine() {
        return this.f27253s;
    }

    public final void h(final String value) {
        kotlin.jvm.internal.s.h(value, "js");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "injectJavaScript " + this + " - " + value);
        }
        kotlin.jvm.internal.s.h(value, "value");
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        Runnable runnable = new Runnable() { // from class: yh.oa
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC3228pi.d(this.f57869a, value);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.postAtFrontOfQueue(runnable);
    }

    public final void i(String content) {
        kotlin.jvm.internal.s.h(content, "content");
        C3485zi c3485zi = this.f27224e0;
        if (c3485zi != null) {
            c3485zi.b();
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "loadDataInWebView " + this);
        }
        this.Q = false;
        if (this.N.get()) {
            return;
        }
        loadDataWithBaseURL("", content, "text/html", com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, null);
    }

    public final void j() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "deferredDestroy " + this);
        }
        super.destroy();
    }

    public final void k() throws JSONException {
        if (this.N.get()) {
            return;
        }
        if (!this.I) {
            this.I = true;
            return;
        }
        g();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f27221d0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f27221d0 = null;
        }
        this.N.set(true);
        this.f27237k.a(this.f27235j.f25563b);
        Oo oo2 = this.O0;
        if (oo2 != null) {
            oo2.a();
        }
        H4 h10 = this.Y0;
        if (h10 != null) {
            h10.b();
        }
        this.Q = true;
        this.U = -1;
        C3475z8 c3475z8 = this.Z0;
        if (c3475z8 != null) {
            InterfaceC3322t9 interfaceC3322t9 = c3475z8.f27988c;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).a("HybridVideoPlayerHandler", "destroy");
            }
            c3475z8.a();
            Gf gf2 = c3475z8.f28001p;
            if (gf2 != null) {
                InterfaceC3322t9 interfaceC3322t10 = gf2.f24865g;
                if (interfaceC3322t10 != null) {
                    kotlin.jvm.internal.s.g("Gf", "TAG");
                    ((C3348u9) interfaceC3322t10).c("Gf", "stopOmidSession");
                }
                Ie ie2 = gf2.f24863e;
                if (ie2 != null) {
                    if (ie2.f26432c == null) {
                        InterfaceC3322t9 interfaceC3322t11 = ie2.f26431b;
                        if (interfaceC3322t11 != null) {
                            ((C3348u9) interfaceC3322t11).a(AbstractC2926e1.f26429f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3322t9 interfaceC3322t12 = ie2.f26431b;
                        if (interfaceC3322t12 != null) {
                            ((C3348u9) interfaceC3322t12).a(AbstractC2926e1.f26429f, "stopAdSession");
                        }
                        AdSession adSession = ie2.f26432c;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        ie2.f26432c = null;
                    }
                }
            }
            c3475z8.f28001p = null;
            J3.a(c3475z8.f27989d);
        }
        this.Z0 = null;
        removeJavascriptInterface("sdkController");
        Ec ec2 = this.B;
        if (ec2 != null) {
            C3041ic c3041ic = ec2.f24711d;
            if (c3041ic != null) {
                c3041ic.a();
            }
            ec2.f24711d = null;
            C3041ic c3041ic2 = ec2.f24712e;
            if (c3041ic2 != null) {
                c3041ic2.a();
            }
            ec2.f24712e = null;
            C3041ic c3041ic3 = ec2.f24713f;
            if (c3041ic3 != null) {
                c3041ic3.a();
            }
            ec2.f24713f = null;
        }
        this.f27257u.clear();
        this.f27259v.clear();
        WeakReference weakReference = this.f27261w;
        if (weakReference != null) {
            weakReference.clear();
        }
        Wn wn2 = this.f27246o0;
        if (wn2 != null) {
            wn2.d();
        }
        Wn wn3 = this.f27246o0;
        if (wn3 != null) {
            wn3.a();
        }
        C3148mg c3148mg = this.f27230g0;
        if (c3148mg != null) {
            J8 j10 = C2890cg.f26334b;
            if (j10 != null) {
                String id2 = c3148mg.f26999c;
                kotlin.jvm.internal.s.h(id2, "id");
                j10.f27339b.remove(id2);
                Iterator it = j10.f27339b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    kotlin.jvm.internal.s.g(next, "next(...)");
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            C3318t5 c3318t5 = C2890cg.f26335c;
            if (c3318t5 != null) {
                String id3 = c3148mg.f26999c;
                kotlin.jvm.internal.s.h(id3, "id");
                c3318t5.f27339b.remove(id3);
                Iterator it2 = c3318t5.f27339b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    kotlin.jvm.internal.s.g(next2, "next(...)");
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            c3148mg.f27000d.set(true);
        }
        this.f27230g0 = null;
        T();
        S();
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.F0 = null;
        this.f27263x = null;
        this.f27240l0 = null;
        this.f27244n0 = null;
        this.C0 = false;
        this.f27219c1 = null;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            em.k.d(H9.f24933f, null, null, new C2866bi(viewGroup, this, null), 3, null);
        }
    }

    public final void l(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "registerBackButtonPressedEventListener " + this);
        }
        this.M = str;
    }

    public void n() {
        InterfaceC3391w0 interfaceC3391w0;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "dismissCurrentViewContainer " + this);
        }
        Ec ec2 = this.B;
        if (ec2 != null) {
            C3222pc c3222pc = ec2.f24710c;
            if (c3222pc != null) {
                c3222pc.b();
            }
            ec2.f24710c = null;
        }
        if (kotlin.jvm.internal.s.c("Default", this.A)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z10 = parent instanceof ViewGroup;
            if (z10) {
                this.f27237k.b(new Function1() { // from class: yh.ma
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC3228pi.c((C3435xi) obj);
                    }
                });
            }
            if (1 == this.f27214b) {
                o();
            } else if (z10) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.J != Yn.VISIBLE || (interfaceC3391w0 = this.f27244n0) == null) {
            return;
        }
        interfaceC3391w0.a(this, getFullScreenActivity());
    }

    public final void o() {
        Activity fullScreenActivity;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "finishFullScreenActivity " + this);
        }
        SparseArray sparseArray = InMobiAdActivity.f24404t;
        kotlin.jvm.internal.s.h(this, "container");
        InMobiAdActivity.f24404t.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if (kotlin.jvm.internal.s.c("Default", this.A)) {
                setAndUpdateViewState("Hidden");
            }
            W();
            return;
        }
        InterfaceC3391w0 interfaceC3391w0 = this.f27244n0;
        if (interfaceC3391w0 == null || !interfaceC3391w0.a(this)) {
            Activity fullScreenActivity2 = getFullScreenActivity();
            kotlin.jvm.internal.s.f(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            ((InMobiAdActivity) fullScreenActivity2).f24410e = true;
            Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.U == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.U);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Ph ph2;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onAttachedToWindow " + this);
        }
        super.onAttachedToWindow();
        if (!this.f27223e) {
            if (kotlin.jvm.internal.s.c(this.f27235j.f25563b, "default")) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                B();
            }
        }
        Ec ec2 = this.B;
        if (ec2 != null) {
            C3041ic c3041ic = ec2.f24711d;
            if (c3041ic != null) {
                c3041ic.b();
            }
            C3041ic c3041ic2 = ec2.f24712e;
            if (c3041ic2 != null) {
                c3041ic2.b();
            }
            C3041ic c3041ic3 = ec2.f24713f;
            if (c3041ic3 != null) {
                c3041ic3.b();
            }
        }
        O();
        if (this.f27261w == null) {
            ViewParent parent = getParent();
            this.f27261w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        U();
        R();
        Q();
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
        if (interfaceC3322t11 == null || (ph2 = ((C3348u9) interfaceC3322t11).f27613a) == null) {
            return;
        }
        ph2.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onDetachedFromWindow " + this);
        }
        Y5 y10 = this.E0;
        if (y10 != null) {
            Y5.a(y10, 8, true, null, 12);
            C3022hj c3022hj = y10.f26065m;
            if (!c3022hj.f26692f && c3022hj.f26687a > 0) {
                c3022hj.f26692f = true;
                c3022hj.f26693g = EnumC2970fj.DONE;
                c3022hj.a();
            }
            em.p0.c(c3022hj.f26690d, null, 1, null);
        }
        Ec ec2 = this.B;
        if (ec2 != null) {
            C3041ic c3041ic = ec2.f24711d;
            if (c3041ic != null) {
                c3041ic.a();
            }
            C3041ic c3041ic2 = ec2.f24712e;
            if (c3041ic2 != null) {
                c3041ic2.a();
            }
            C3041ic c3041ic3 = ec2.f24713f;
            if (c3041ic3 != null) {
                c3041ic3.a();
            }
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "Detached from window");
        }
        L0 l10 = this.I0;
        if (l10 == null) {
            kotlin.jvm.internal.s.w("adQualityManager");
            l10 = null;
        }
        if (l10.f25156d.get()) {
            l10.a("session end is already triggered");
        } else if (!l10.f25153a.getEnabled()) {
            l10.a("config kill switch - false. ad quality will skip");
        } else if (l10.f25159g == null) {
            l10.a("setup not done. ignore trigger");
        } else {
            l10.f25156d.set(true);
            l10.a(false);
        }
        if (this.J0.get()) {
            em.k.d(H9.f24930c, null, null, new C3072ji(this, null), 3, null);
        }
        U();
        T();
        S();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e10) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
            if (interfaceC3322t11 != null) {
                String TAG3 = f27210i1;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                ((C3348u9) interfaceC3322t11).b(TAG3, "Detaching WebView from window encountered an error ( " + e10.getMessage() + " )");
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e10) {
        kotlin.jvm.internal.s.h(e10, "e");
        if (!this.f27243n) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f27223e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).c(TAG2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
        if (interfaceC3322t11 != null) {
            String TAG3 = f27210i1;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            ((C3348u9) interfaceC3322t11).a(TAG3, "onDoubleTapEvent detected \n " + e10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (e10.getAction() == 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(J3.c(e10.getX()));
                jSONArray.put(J3.c(e10.getY()));
            } catch (JSONException e11) {
                InterfaceC3322t9 interfaceC3322t12 = this.f27233i;
                if (interfaceC3322t12 != null) {
                    String TAG4 = f27210i1;
                    kotlin.jvm.internal.s.g(TAG4, "TAG");
                    ((C3348u9) interfaceC3322t12).a(TAG4, "Exception in onDoubleTap", e11);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            h("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e10) {
        kotlin.jvm.internal.s.h(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e10) {
        kotlin.jvm.internal.s.h(e10, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e10, float f10, float f11) {
        kotlin.jvm.internal.s.h(e10, "e2");
        if (!this.f27243n) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f27223e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).c(TAG2, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(motionEvent.getX())), Integer.valueOf(J3.c(motionEvent.getY())))));
            jSONArray.put(new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(e10.getX())), Integer.valueOf(J3.c(e10.getY())))));
            jSONArray.put(new JSONArray((Collection) gl.r.o(Float.valueOf(f10), Float.valueOf(f11))));
        } catch (Exception e11) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
            if (interfaceC3322t11 != null) {
                String TAG3 = f27210i1;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                ((C3348u9) interfaceC3322t11).a(TAG3, "Exception in onFling", e11);
            }
        }
        h("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e10) {
        kotlin.jvm.internal.s.h(e10, "e");
        if (!this.f27243n) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.f27223e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).c(TAG2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
        if (interfaceC3322t11 != null) {
            String TAG3 = f27210i1;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            ((C3348u9) interfaceC3322t11).a(TAG3, "onLongPress detected \n " + e10);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(J3.c(e10.getX()));
            jSONArray.put(J3.c(e10.getY()));
        } catch (JSONException e11) {
            InterfaceC3322t9 interfaceC3322t12 = this.f27233i;
            if (interfaceC3322t12 != null) {
                String TAG4 = f27210i1;
                kotlin.jvm.internal.s.g(TAG4, "TAG");
                ((C3348u9) interfaceC3322t12).a(TAG4, "Exception in onLongPress", e11);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e10, float f10, float f11) {
        kotlin.jvm.internal.s.h(e10, "e2");
        if (this.f27223e && !this.W) {
            this.W = true;
            SparseArray sparseArray = InMobiAdActivity.f24404t;
            f27208g1.getClass();
            JSONObject jsonObject = Vh.a("IN_CUSTOM_BROWSER", "onScroll");
            kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = InMobiAdActivity.f24405u;
            if (gestureDetectorOnGestureListenerC3228pi != null) {
                gestureDetectorOnGestureListenerC3228pi.c(jsonObject);
            }
            return false;
        }
        if (!this.f27243n) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "onScroll detected \n " + motionEvent + " \n " + e10);
        }
        if (!this.f27223e) {
            Ck scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - scrollThrottler.f24624b < scrollThrottler.f24623a) {
                scrollThrottler.f24624b = jElapsedRealtime;
            } else {
                scrollThrottler.f24624b = jElapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(motionEvent.getX())), Integer.valueOf(J3.c(motionEvent.getY())))));
                        jSONArray.put(new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(e10.getX())), Integer.valueOf(J3.c(e10.getY())))));
                    } catch (Exception e11) {
                        InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
                        if (interfaceC3322t11 != null) {
                            String TAG3 = f27210i1;
                            kotlin.jvm.internal.s.g(TAG3, "TAG");
                            ((C3348u9) interfaceC3322t11).a(TAG3, "Exception in onScroll", e11);
                        }
                    }
                    h("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e10) {
        kotlin.jvm.internal.s.h(e10, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e10) {
        kotlin.jvm.internal.s.h(e10, "e");
        if (!this.f27243n) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f27223e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).c(TAG2, "Click gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
        if (interfaceC3322t11 != null) {
            String TAG3 = f27210i1;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            ((C3348u9) interfaceC3322t11).a(TAG3, "onSingleTapConfirmed detected \n " + e10);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(J3.c(e10.getX()));
            jSONArray.put(J3.c(e10.getY()));
        } catch (JSONException e11) {
            InterfaceC3322t9 interfaceC3322t12 = this.f27233i;
            if (interfaceC3322t12 != null) {
                String TAG4 = f27210i1;
                kotlin.jvm.internal.s.g(TAG4, "TAG");
                ((C3348u9) interfaceC3322t12).a(TAG4, "Exception in onSingleTapConfirmed", e11);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e10) {
        kotlin.jvm.internal.s.h(e10, "e");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onSingleTapUp detected \n " + e10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "onSizeChanged " + this);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "onSizeChanged (" + i10 + ", " + i11 + ")");
        }
        if (i10 == 0 || i11 == 0) {
            return;
        }
        a(J3.b(i10 / N5.b()), J3.b(i11 / N5.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.s.h(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.K0) {
                InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
                if (interfaceC3322t9 != null) {
                    String TAG = f27210i1;
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    ((C3348u9) interfaceC3322t9).b(TAG, "onTouchEvent Invalid Coordinates " + event);
                }
                this.K0 = true;
            }
            return super.onTouchEvent(event);
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "onTouchEvent " + this);
        }
        if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(event);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onWindowFocusChanged " + this + " - " + z10);
        }
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (isShown()) {
                C3268r7 c3268r7 = C3346u7.f27601k;
                if (c3268r7.b(this, this, this.f27266y0) && c3268r7.a(this, this, this.f27266y0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity == null || !fullScreenActivity.isInMultiWindowMode()) {
            d(z10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "onWindowVisibilityChanged " + this + " " + i10);
        }
        super.onWindowVisibilityChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (z11) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                C3268r7 c3268r7 = C3346u7.f27601k;
                if (c3268r7.b(this, this, visibilityTrackingMinPercentage) && c3268r7.a(this, this, visibilityTrackingMinPercentage)) {
                    z10 = true;
                }
            }
        } else {
            z10 = z11;
        }
        d(z10);
    }

    public final void p() {
        L0 l10;
        AdQualityControl adQualityControl;
        Activity activity;
        L0 l11;
        AdQualityControl adQualityControl2;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireAQSession - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
        }
        if (!kotlin.jvm.internal.s.c(getAdType(), "int") || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.f27257u.get()) == null) {
            L0 l12 = this.I0;
            if (l12 == null) {
                kotlin.jvm.internal.s.w("adQualityManager");
                l10 = null;
            } else {
                l10 = l12;
            }
            l10.getClass();
            kotlin.jvm.internal.s.h(this, "adView");
            if (!l10.a()) {
                l10.a("session state invalid");
                return;
            }
            l10.a("session start trigger...");
            l10.f25155c.set(true);
            AdQualityControl adQualityControl3 = l10.f25159g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = l10.f25159g) == null) {
                return;
            }
            l10.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (Zh) null);
            return;
        }
        L0 l13 = this.I0;
        if (l13 == null) {
            kotlin.jvm.internal.s.w("adQualityManager");
            l11 = null;
        } else {
            l11 = l13;
        }
        l11.getClass();
        kotlin.jvm.internal.s.h(activity, "activity");
        if (!l11.a()) {
            l11.a("session state invalid");
            return;
        }
        l11.a("session start trigger...");
        l11.f25155c.set(true);
        AdQualityControl adQualityControl4 = l11.f25159g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = l11.f25159g) == null) {
            return;
        }
        l11.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (Zh) null);
    }

    public final void q() {
        if (this.N.get()) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).b(TAG, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.P0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).a(TAG2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        C3485zi c3485zi = this.f27224e0;
        if (c3485zi != null) {
            Map mapA = c3485zi.a();
            long j10 = c3485zi.f28025c;
            em.o0 o0Var = AbstractC3488zl.f28033a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
            mapA.put("latency", Long.valueOf(jElapsedRealtime));
            c3485zi.f28030h = jElapsedRealtime;
            String strA = c3485zi.a("FireAdReady");
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b(strA, mapA, EnumC3281rk.SDK);
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
        if (interfaceC3322t11 != null) {
            String TAG3 = f27210i1;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            ((C3348u9) interfaceC3322t11).a(TAG3, "fireAdReady " + this);
        }
        this.C0 = true;
        if (this.f27251r == 0) {
            u();
        }
        em.k.d(H9.f24930c, null, null, new C3150mi(this, null), 3, null);
        getListener().h(this);
    }

    public final void r() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireBackButtonPressedEvent " + this);
        }
        String str = this.M;
        if (str != null) {
            a(str, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void s() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireClickTrackers " + this);
        }
        H4 h10 = this.Y0;
        if (h10 != null) {
            h10.f();
        }
        v();
        getListener().b(this);
    }

    public final void setAdPodHandler(InterfaceC3391w0 interfaceC3391w0) {
        this.f27244n0 = interfaceC3391w0;
    }

    public void setAdType(String str) {
        this.f27234i0 = str;
    }

    public final void setAllowAutoRedirection(boolean z10) {
        this.f27242m0 = z10;
    }

    public final void setAndUpdateViewState(String state) {
        kotlin.jvm.internal.s.h(state, "state");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "setAndUpdateViewState " + this);
        }
        this.A = state;
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "set state:" + this.A);
        }
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.s.g(ENGLISH, "ENGLISH");
        String lowerCase = state.toLowerCase(ENGLISH);
        kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
        f(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z10) {
        this.L = z10;
    }

    public final void setBannerHolderActivity(WeakReference<Activity> weakReference) {
        kotlin.jvm.internal.s.h(weakReference, "<set-?>");
        this.f27259v = weakReference;
    }

    public final void setBeaconUrl(String str) {
        this.M0 = str;
    }

    public final void setBlobProvider(F2 f10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "setBlobProvider " + this);
        }
        this.f27238k0 = f10;
    }

    public final void setCloseAssetArea(Mo value) {
        kotlin.jvm.internal.s.h(value, "value");
        if (!this.X0) {
            Context context = getContext();
            kotlin.jvm.internal.s.g(context, "getContext(...)");
            if (!J3.a(context)) {
                return;
            }
        }
        this.f27228f1 = new Mo(0, value.f25296b, value.f25297c, 0);
    }

    public final void setConfiguredArea(long j10) {
        this.f27256t0 = ((long) getWidth()) * ((long) getHeight());
    }

    public final void setContentURL(String str) {
        this.f27252r0 = str;
    }

    public final void setContextualDataHandler(H4 h10) {
        this.Y0 = h10;
    }

    public void setCreativeId(String str) {
        this.f27215b0 = str;
    }

    public final void setDisableBackButton(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setDisableBackButton " + this);
        }
        this.L = z10;
    }

    public final void setEmbeddedBrowserJsCallbacks(W5 w10) {
        this.F0 = w10;
    }

    public final void setEnableNativeGestures(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "enableNativeGestures " + this + " " + z10);
        }
        boolean z11 = this.f27243n;
        this.f27243n = z10;
        if (z10 && !z11) {
            if (this.f27268z0 == null) {
                this.f27268z0 = new C3403wc(this);
            }
        } else {
            if (z10 || !z11) {
                return;
            }
            this.f27268z0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setEnableTouchBeginCallback " + this + " " + z10);
        }
        this.f27247p = z10;
    }

    public final void setEnableTouchEndCallback(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setEnableTouchEndCallback " + this + " " + z10);
        }
        this.f27245o = z10;
    }

    public void setExitAnimation(int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "setExitAnimation " + this);
        }
        this.U = i10;
    }

    public final void setExposureTracker(U u10) {
        this.L0 = u10;
    }

    public void setFriendlyViews(Map<View, FriendlyObstructionPurpose> map) {
        this.f27236j0 = map;
    }

    public void setFullScreenActivityContext(Activity activity) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setFullScreenActivityContext " + this);
        }
        this.f27257u = new WeakReference(activity);
        Y();
        if (this.f27223e || activity == null) {
            return;
        }
        Oo oo2 = this.O0;
        if (oo2 != null) {
            oo2.a();
        }
        this.O0 = new Oo(activity, this.S0, this.f27233i);
    }

    public final void setImmersiveMode(boolean z10) {
        this.X0 = z10;
    }

    public void setImpressionId(String str) {
        this.f27220d = str;
    }

    public final void setInAppActivityBrowserClientListener(O8 o10) {
        this.f27219c1 = o10;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(C2988gb c2988gb) {
        Y5 y10 = this.E0;
        if (y10 != null) {
            y10.f26063k = c2988gb;
            y10.f26064l = new C2936eb(c2988gb, y10);
        }
    }

    public final void setLandingScheme(String str) {
        kotlin.jvm.internal.s.h(str, "<set-?>");
        this.f27226f = str;
    }

    public final void setMCreativeType(String str) {
        this.G0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i10) {
        this.f27266y0 = i10;
    }

    public final void setMImpressionMinTimeViewed(int i10) {
        this.f27264x0 = i10;
    }

    public final void setMViewableAd(Wn wn2) {
        this.f27246o0 = wn2;
    }

    public final void setMarkupTypeAdUnit(String str) {
        kotlin.jvm.internal.s.h(str, "<set-?>");
        this.T0 = str;
    }

    public final void setOrientationProperties(Nf nf2) {
        kotlin.jvm.internal.s.h(nf2, "<set-?>");
        this.H0 = nf2;
    }

    public final void setPingAckListener(InterfaceC3070jg pingAckListener) {
        kotlin.jvm.internal.s.h(pingAckListener, "pingAckListener");
        this.f27249q = pingAckListener;
    }

    public final void setPingManager(C3148mg pingManager) {
        kotlin.jvm.internal.s.h(pingManager, "pingManager");
        this.f27230g0 = pingManager;
    }

    public final void setPlacementId(long j10) {
        this.f27212a0 = j10;
    }

    public final void setPreloadView(boolean z10) {
    }

    public void setReferenceContainer(C c10) {
        this.f27240l0 = c10;
    }

    public final void setRenderViewEventListener(AbstractC3279ri abstractC3279ri) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "setRenderViewEventListener " + this);
        }
        this.f27263x = abstractC3279ri;
    }

    public final void setRenderViewTelemetry(C3485zi c3485zi) {
        this.f27224e0 = c3485zi;
    }

    public final void setScrollable(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "setScrollable " + this);
        }
        setScrollContainer(z10);
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public final void setShouldFireLandingPageBeacons(boolean z10) {
        this.N0 = z10;
    }

    public void setTelemetryManagerMap(Map<String, C3262r1> map) {
        this.Q0 = map;
    }

    public final void setUnloaded(boolean z10) {
        this.P0 = z10;
    }

    public final void setUseCustomClose(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setUseCustomClose " + this + " " + z10);
        }
        this.H = z10;
    }

    public void setViewTouchTimestamp(long j10) {
        this.f27229g = j10;
    }

    public final void setWatermark(final WatermarkData watermarkData) {
        kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
        if (!getAdConfig().getWatermarkEnabled()) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        final byte[] bArrDecode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        kotlin.jvm.internal.s.g(bArrDecode, "decode(...)");
        if (!this.f27218c0.get()) {
            this.f27218c0.set(true);
            this.f27221d0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: yh.na
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    GestureDetectorOnGestureListenerC3228pi.a(this.f57856a, bArrDecode, watermarkData);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.f27221d0);
        } else {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).c(TAG2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "stopLoading " + this);
        }
        if (this.N.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireEvent " + this + " 2");
        }
    }

    public void u() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireImpression " + this);
        }
        if (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_VIDEO, this.G0) || kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, this.G0)) {
            return;
        }
        F();
        h("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void v() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireOnUserInteraction " + this);
        }
        h("window.imraidview.onUserInteraction();");
    }

    public final void w() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "firePopupBlockedEvent " + this);
        }
        h("window.mraidview.popupBlocked('popupBlocked')");
    }

    public final void x() {
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "fullScreenActivity is not null and finishing");
            }
            InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof InMobiAdActivity ? (InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.b();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean z() {
        if (kotlin.jvm.internal.s.c(getAdType(), "banner") && getAdConfig().getMraid3().getBannerEnabled()) {
            return true;
        }
        return kotlin.jvm.internal.s.c(getAdType(), "int") && getAdConfig().getMraid3().getInterstitialEnabled();
    }

    public final void m() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "dismissCurrentIntAdViewContainerInShowNextPodFlow " + this);
        }
        Ec ec2 = this.B;
        if (ec2 != null) {
            C3222pc c3222pc = ec2.f24710c;
            if (c3222pc != null) {
                c3222pc.b();
            }
            ec2.f24710c = null;
        }
        if (kotlin.jvm.internal.s.c("Default", this.A)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof ViewGroup) {
                this.f27237k.b(new Function1() { // from class: yh.sa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC3228pi.b((C3435xi) obj);
                    }
                });
            }
            SparseArray sparseArray = InMobiAdActivity.f24404t;
            kotlin.jvm.internal.s.h(this, "container");
            InMobiAdActivity.f24404t.remove(hashCode());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GestureDetectorOnGestureListenerC3228pi(Context context, byte b10, Set set, String str, boolean z10, String landingScheme, long j10, C3331ti c3331ti, InterfaceC3322t9 interfaceC3322t9, Qi route, Bo webViewFactory, C3184o0 c3184o0, AdConfig adConfig) {
        Th wh2;
        Mo mo2;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(landingScheme, "landingScheme");
        kotlin.jvm.internal.s.h(route, "route");
        kotlin.jvm.internal.s.h(webViewFactory, "webViewFactory");
        kotlin.jvm.internal.s.h(adConfig, "adConfig");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
        super(applicationContext);
        this.f27214b = b10;
        this.f27217c = set;
        this.f27220d = str;
        this.f27223e = z10;
        this.f27226f = landingScheme;
        this.f27229g = j10;
        this.f27231h = c3331ti;
        this.f27233i = interfaceC3322t9;
        this.f27235j = route;
        this.f27237k = webViewFactory;
        this.f27239l = c3184o0;
        this.f27241m = adConfig;
        this.f27247p = true;
        this.f27249q = new C3124li(this);
        this.f27253s = new C3436xj(interfaceC3322t9);
        this.f27255t = fl.l.b(new tl.a() { // from class: yh.pa
            @Override // tl.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3228pi.c(this.f57883a);
            }
        });
        this.f27257u = new WeakReference(null);
        this.f27259v = new WeakReference(null);
        this.f27265y = nm.g.b(false, 1, null);
        this.A = "Default";
        this.F = true;
        this.G = true;
        this.I = true;
        this.J = Yn.UNKNOWN;
        this.N = new AtomicBoolean(false);
        this.O = new Object();
        this.P = new Object();
        this.R = true;
        this.U = -1;
        this.f27212a0 = Long.MIN_VALUE;
        this.f27218c0 = new AtomicBoolean(false);
        this.f27227f0 = fl.l.a(fl.o.PUBLICATION, new tl.a() { // from class: yh.qa
            @Override // tl.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3228pi.b(this.f57894a);
            }
        });
        this.f27232h0 = fl.l.b(new tl.a() { // from class: yh.ra
            @Override // tl.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3228pi.A();
            }
        });
        this.f27260v0 = new Yh(this);
        this.f27262w0 = new C2892ci(this);
        this.f27264x0 = Integer.MIN_VALUE;
        this.f27266y0 = Integer.MIN_VALUE;
        this.J0 = new AtomicBoolean(true);
        this.R0 = new Zh(this);
        this.S0 = new C3202oi(this);
        this.T0 = "html";
        this.U0 = new C2943ei(this, context);
        this.V0 = new C2840ai(this);
        this.W0 = new Xh(this);
        String TAG = f27210i1;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        toString();
        f27208g1.getClass();
        f27211j1.a();
        this.f27240l0 = this;
        this.f27248p0 = true;
        this.H0 = new Nf();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b10 == 1);
        this.A0 = gestureDetector;
        this.B0 = new Mk(this);
        if (this.f27243n && this.f27268z0 == null) {
            this.f27268z0 = new C3403wc(this);
        }
        if (c3331ti != null) {
            this.f27224e0 = new C3485zi(c3331ti);
        }
        Sh.a(this, interfaceC3322t9);
        if (c3184o0 != null) {
            setAdType(c3184o0.f27083a);
            this.X0 = c3184o0.f27084b;
            this.f27212a0 = c3184o0.f27085c;
            this.f27242m0 = c3184o0.f27086d;
            setCreativeId(c3184o0.f27087e);
            this.f27244n0 = c3184o0.f27091i;
            this.f27252r0 = c3184o0.f27092j;
            this.T0 = c3184o0.f27089g;
            String str2 = c3184o0.f27090h;
            if (str2 != null) {
                setAdSize(str2);
            }
            setTelemetryManagerMap(c3184o0.f27093k);
            b(c3184o0.f27088f);
        }
        this.f27216b1 = new C3176ni(this);
        this.f27219c1 = new C2918di(this);
        this.f27222d1 = new C3046ii(this);
        if (getAdConfig().getRendering().getDisableShowCustomView()) {
            wh2 = new Th(this);
        } else {
            wh2 = new Wh(this);
        }
        this.f27225e1 = wh2;
        if (!this.X0 && !J3.a(context)) {
            mo2 = new Mo(0, 0, 0, 0);
        } else {
            mo2 = new Mo(0, 44, 44, 0);
        }
        this.f27228f1 = mo2;
    }

    public final void j(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "loadScript " + this);
        }
        loadUrl(str);
    }

    public final void l() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "disableHardwareAcceleration called. " + this);
        }
        try {
            setLayerType(1, null);
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    public final void f(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireStateChange " + this + " " + str);
        }
        h("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void g(String json) {
        kotlin.jvm.internal.s.h(json, "json");
        if (getAdConfig().getPingV2().getEnabled()) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).a(TAG, "handlePing " + this);
            }
            if (this.f27230g0 == null) {
                this.f27230g0 = new C3148mg(this.f27249q, this.f27224e0);
            }
            C3148mg c3148mg = this.f27230g0;
            kotlin.jvm.internal.s.e(c3148mg);
            c3148mg.getClass();
            kotlin.jvm.internal.s.h(json, "json");
            em.k.d(H9.f24931d, null, null, new C3096kg(c3148mg, json, null), 3, null);
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "pings v2 is disabled " + this);
        }
        C3485zi c3485zi = this.f27224e0;
        if (c3485zi != null) {
            kotlin.jvm.internal.s.h("unknown", "priority");
            Map mapA = c3485zi.a();
            mapA.put("errorCode", (short) 2257);
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC3277rg.a("PingFailed", mapA);
        }
        InterfaceC3070jg interfaceC3070jg = this.f27249q;
        EnumC2906d6[] enumC2906d6Arr = EnumC2906d6.f26393a;
        ((C3124li) interfaceC3070jg).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    public final void c(String str, String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "sendTelemetryForAutoRedirectFraud " + this + " " + str + " " + str2);
        }
        HashMap map = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            map.put("creativeId", creativeId);
        }
        map.put("trigger", str);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            map.put(WwUgngZLNA.iZukqmAYeANdng, impressionId);
        }
        map.put("adType", str2);
        a("BlockAutoRedirection", map);
    }

    public final void f(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "processUseCustomCloseRequest " + this + " " + z10);
        }
        setUseCustomClose(z10);
        U();
    }

    public final void i() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "completeFromInterActive " + this);
        }
        H4 h10 = this.Y0;
        if (h10 != null) {
            h10.g();
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "completeFromInterActive");
        }
    }

    public final void h() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "closeAll " + this);
        }
        InterfaceC3391w0 interfaceC3391w0 = this.f27244n0;
        if (interfaceC3391w0 != null) {
            interfaceC3391w0.b();
        }
        x();
    }

    public final void c(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireViewableChange " + this + " " + z10);
        }
        h("window.mraidview.broadcastEvent('viewableChange'," + z10 + ");");
    }

    public final void a(C3403wc movementGestureDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        kotlin.jvm.internal.s.h(movementGestureDetector, "movementGestureDetector");
        kotlin.jvm.internal.s.h(initialEvent, "initialEvent");
        kotlin.jvm.internal.s.h(endEvent, "endEvent");
        if (!this.f27223e && getRenderingConfig().getSupportedGestures().contains(4)) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).a(TAG, bm.r.j(" onScaleDetected\n " + initialEvent + " \n " + endEvent));
            }
            JSONArray jSONArray = new JSONArray();
            float f10 = 2;
            jSONArray.put(new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c((endEvent.getX(1) + endEvent.getX()) / f10)), Integer.valueOf(J3.c((endEvent.getY(1) + endEvent.getY()) / f10)))));
            h("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).c(TAG2, "Pinch gesture is disabled from config");
        }
    }

    public static final fl.g0 c(C3435xi it) {
        kotlin.jvm.internal.s.h(it, "it");
        it.n();
        return fl.g0.f38750a;
    }

    public final void b(float f10, float f11) {
        if (!this.f27245o) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "onTouchEnd detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(J3.c(f10));
            jSONArray.put(J3.c(f11));
        } catch (JSONException e10) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
            if (interfaceC3322t11 != null) {
                String TAG3 = f27210i1;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                ((C3348u9) interfaceC3322t11).a(TAG3, "Exception in onTouchEnd", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x0150 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r6.equals("html5video") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
    
        if (r6.equals("inlineVideo") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        if (r5.C == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        if (r5.R == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0126, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        r6 = r5.f27233i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC3228pi.f27210i1;
        kotlin.jvm.internal.s.g(r2, "TAG");
        ((com.inmobi.media.C3348u9) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3228pi.n(java.lang.String):boolean");
    }

    public final void c(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "evaluateScript " + this);
        }
        evaluateJavascript(str, null);
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final boolean c() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    public final void e(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireDetectAutoRedirectFraud " + this + " " + str);
        }
        h("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void c(String jsCallbackNamespace, String callback, String blob) {
        kotlin.jvm.internal.s.h(jsCallbackNamespace, "jsCallbackNamespace");
        kotlin.jvm.internal.s.h(callback, "callback");
        kotlin.jvm.internal.s.h(blob, "blob");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "retrievedBlob");
        }
        a(jsCallbackNamespace, callback + "(" + blob + ");");
    }

    public final void e(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "processDisableCloseRegionRequest " + this + " " + z10);
        }
        this.K = z10;
        U();
    }

    public final void c(int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "showPodAdAtIndex " + this + " " + i10);
        }
        if (this.J == Yn.VISIBLE && this.f27244n0 != null && !this.N.get()) {
            InterfaceC3391w0 interfaceC3391w0 = this.f27244n0;
            if (interfaceC3391w0 != null) {
                interfaceC3391w0.a(i10, this, getFullScreenActivity());
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    public static final Ck b(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        return new Ck(gestureDetectorOnGestureListenerC3228pi.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    public final void a(float f10, float f11) {
        if (!this.f27247p) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).c(TAG, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "onTouchBegin detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(J3.c(f10));
            jSONArray.put(J3.c(f11));
        } catch (JSONException e10) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
            if (interfaceC3322t11 != null) {
                String TAG3 = f27210i1;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                ((C3348u9) interfaceC3322t11).a(TAG3, "Exception in onTouchBegin", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    @Override // com.inmobi.media.C
    public void b() throws JSONException {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "destroyContainer " + this);
        }
        k();
        this.f27237k.b(new Function1() { // from class: yh.ua
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GestureDetectorOnGestureListenerC3228pi.a((C3435xi) obj);
            }
        });
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.f27248p0 && omidConfig.isOmidEnabled()) {
            Jf.f25068a.getClass();
            if (Omid.isActive()) {
                new C3357ui(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void c(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).a(TAG, "onLpLifeCycleEvent " + this);
            }
            h("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jsonObject + ");");
        }
    }

    public final void c(GestureDetectorOnGestureListenerC3228pi sourceView, String targetId) throws JSONException {
        kotlin.jvm.internal.s.h(sourceView, "sourceView");
        kotlin.jvm.internal.s.h(targetId, "targetId");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "fireShowWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.h("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    @Override // com.inmobi.media.AbstractC3469z2
    public final C2885cb d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C3365v0 c3365v0;
        C3365v0 c3365v1;
        C3365v0 c3365v2;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "initLandingPageHandler " + this);
        }
        boolean z10 = this.f27223e;
        String str6 = this.f27226f;
        boolean cctEnabled = getAdConfig().getCctEnabled();
        boolean partialTabsEnabled = getAdConfig().getPartialTabsEnabled();
        C3331ti c3331ti = this.f27231h;
        C2911db c2911db = new C2911db(z10, str6, cctEnabled, partialTabsEnabled, c3331ti != null ? c3331ti.f27570m : null);
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        C2840ai c2840ai = this.V0;
        C3014hb c3014hb = null;
        C2943ei c2943ei = this.U0;
        if (!this.f27223e) {
            C3331ti c3331ti2 = this.f27231h;
            long j10 = (c3331ti2 == null || (c3365v2 = c3331ti2.f27558a) == null) ? 0L : c3365v2.f27659a;
            String impressionId = getImpressionId();
            String str7 = impressionId == null ? "" : impressionId;
            C3331ti c3331ti3 = this.f27231h;
            if (c3331ti3 == null || (c3365v1 = c3331ti3.f27558a) == null || (str = c3365v1.f27664f) == null) {
                str = "";
            }
            if (c3331ti3 == null || (c3365v0 = c3331ti3.f27558a) == null || (str2 = c3365v0.f27663e) == null) {
                str2 = "";
            }
            if (c3331ti3 == null || (str3 = c3331ti3.f27559b) == null) {
                str3 = "";
            }
            if (c3331ti3 == null || (str4 = c3331ti3.f27563f) == null) {
                str4 = "";
            }
            c3014hb = new C3014hb(j10, str7, str, str2, str3, str4, (c3331ti3 == null || (str5 = c3331ti3.f27561d) == null) ? "" : str5, c3331ti3 != null ? c3331ti3.f27565h : false, this.f27226f);
        }
        return new C2885cb(context, c2911db, c2840ai, c2943ei, this, c3014hb, this.f27233i, new WeakReference(this));
    }

    public static final void a(GestureDetectorOnGestureListenerC3228pi renderView, byte[] bArr, WatermarkData watermarkData) {
        InterfaceC3322t9 interfaceC3322t9 = renderView.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "adding overlay to renderview");
        }
        Context context = renderView.getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        FrameLayout overlayLayout = AbstractC3285ro.a(context, bArr, watermarkData.getAlpha());
        kotlin.jvm.internal.s.h(overlayLayout, "overlayLayout");
        kotlin.jvm.internal.s.h(renderView, "renderView");
        if (renderView.getParent() != null) {
            ViewParent parent = renderView.getParent();
            kotlin.jvm.internal.s.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(overlayLayout, 0);
        }
        renderView.getViewableAd().a(overlayLayout, FriendlyObstructionPurpose.NOT_VISIBLE);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = renderView.f27221d0;
        if (onGlobalLayoutListener != null) {
            renderView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            renderView.f27221d0 = null;
        }
    }

    public final void b(Lf orientation) {
        kotlin.jvm.internal.s.h(orientation, "orientation");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "handle orientationChange " + this + " " + orientation);
        }
        a(Mf.a(orientation));
    }

    public final void b(String str, String url) {
        kotlin.jvm.internal.s.h(url, "url");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "processMediaPlaybackRequest " + this);
        }
        if (this.P0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).b(TAG2, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.f27214b) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27233i;
            if (interfaceC3322t11 != null) {
                String TAG3 = f27210i1;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                ((C3348u9) interfaceC3322t11).b(TAG3, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f27257u.get();
        if (activity == null) {
            InterfaceC3322t9 interfaceC3322t12 = this.f27233i;
            if (interfaceC3322t12 != null) {
                String TAG4 = f27210i1;
                kotlin.jvm.internal.s.g(TAG4, "TAG");
                ((C3348u9) interfaceC3322t12).b(TAG4, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        Ec ec2 = this.B;
        if (ec2 != null) {
            ec2.a(url, activity);
        }
    }

    public final void a(String url, String templateInfoStr, boolean z10) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        Exception exc;
        Activity activity;
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(templateInfoStr, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(templateInfoStr);
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                try {
                    String TAG = f27210i1;
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    ((C3348u9) interfaceC3322t9).a(TAG, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
                } catch (Exception e10) {
                    exc = e10;
                    gestureDetectorOnGestureListenerC3228pi = this;
                }
            }
            if (kotlin.jvm.internal.s.c(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.f27257u.get()) != null) {
                fl.k kVar = E0.f24683a;
                try {
                    E0.a(activity, this, url, z10, jSONObject, this.R0);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    gestureDetectorOnGestureListenerC3228pi = this;
                }
            } else {
                gestureDetectorOnGestureListenerC3228pi = this;
                try {
                    fl.k kVar2 = E0.f24683a;
                    E0.a(gestureDetectorOnGestureListenerC3228pi, this, url, z10, jSONObject, gestureDetectorOnGestureListenerC3228pi.R0);
                    return;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        } catch (Exception e13) {
            e = e13;
            gestureDetectorOnGestureListenerC3228pi = this;
        }
        exc = e;
        InterfaceC3322t9 interfaceC3322t10 = gestureDetectorOnGestureListenerC3228pi.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "issue wile reporting ad", exc);
        }
    }

    public static final fl.g0 b(C3435xi it) {
        kotlin.jvm.internal.s.h(it, "it");
        it.n();
        return fl.g0.f38750a;
    }

    public final void b(int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "loadPodAd " + this);
        }
        if (this.J == Yn.VISIBLE && this.f27244n0 != null && !this.N.get()) {
            InterfaceC3391w0 interfaceC3391w0 = this.f27244n0;
            if (interfaceC3391w0 != null) {
                interfaceC3391w0.a(i10, this);
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).b(TAG2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void a(MotionEvent motionEvent) {
        C3403wc c3403wc;
        if (this.f27223e && !this.V) {
            this.V = true;
            SparseArray sparseArray = InMobiAdActivity.f24404t;
            f27208g1.getClass();
            JSONObject jsonObject = Vh.a("IN_CUSTOM_BROWSER", "onInteraction");
            kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = InMobiAdActivity.f24405u;
            if (gestureDetectorOnGestureListenerC3228pi != null) {
                gestureDetectorOnGestureListenerC3228pi.c(jsonObject);
            }
        }
        if (this.f27214b == 1 && (c3403wc = this.f27268z0) != null) {
            c3403wc.a(motionEvent);
        }
        this.A0.onTouchEvent(motionEvent);
    }

    public final void b(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "fireNextAdShowComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adShowSuccess'," + z10 + ");";
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        h(str);
    }

    public final void b(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "creativeType " + this + " " + str);
        }
        this.G0 = str;
    }

    public final void a(AbstractC3279ri abstractC3279ri) {
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "initialize " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (kotlin.jvm.internal.s.c(this.T0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        N();
        this.f27263x = abstractC3279ri;
        ViewParent parent = getParent();
        this.f27261w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        C3454yc c3454yc = new C3454yc(url, maxRetries, retryInterval, expiry, interfaceC3322t10);
        if (url != null) {
            em.k.d(H9.f24930c, null, null, new C3429xc(c3454yc, null), 3, null);
        } else if (interfaceC3322t10 != null) {
            String TAG2 = c3454yc.f27942f;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).b(TAG2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.f27223e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.f27225e1);
        if (!this.f27223e) {
            Ca ca2 = new Ca(this.f27214b, this);
            InterfaceC3322t9 logger = this.f27233i;
            if (logger != null) {
                kotlin.jvm.internal.s.h(logger, "logger");
                ca2.f24585c = logger;
            }
            addJavascriptInterface(ca2, "sdkController");
        }
        this.B = new Ec(this, this.f27233i);
        this.I0 = new L0(getAdConfig().getAdQuality(), this.f27233i);
        if (i10 >= 29) {
            WebViewRenderProcessClient c3383vi = new C3383vi(this.f27233i, this.f27224e0);
            Object value = AbstractC3293s6.f27438c.getValue();
            kotlin.jvm.internal.s.g(value, "getValue(...)");
            setWebViewRenderProcessClient((ExecutorService) value, c3383vi);
        }
        C3184o0 c3184o0 = this.f27239l;
        if (c3184o0 != null && (adQualityControl = c3184o0.f27096n) != null) {
            L0 l10 = this.I0;
            if (l10 == null) {
                kotlin.jvm.internal.s.w("adQualityManager");
                l10 = null;
            }
            l10.getClass();
            kotlin.jvm.internal.s.h(adQualityControl, "adQualityControl");
            l10.a("adQuality session setup");
            if (!l10.f25153a.getEnabled()) {
                l10.a("config kill switch while setup - false. ad quality will skip");
            } else if (l10.f25155c.get()) {
                l10.a("session already started. skip");
            } else {
                l10.a("verifying control flags");
                String beacon = adQualityControl.getBeacon();
                if (beacon != null && beacon.length() == 0) {
                    l10.a("no beacon received. aborting...");
                    em.o0 o0Var = E0.f24687e;
                    if (o0Var != null) {
                        em.p0.b(o0Var, new CancellationException("Shutdown"));
                    }
                    E0.f24687e = null;
                    l10.a("session end - cleanup");
                    l10.f25159g = null;
                    l10.f25158f.clear();
                    l10.f25155c.set(false);
                    l10.f25156d.set(false);
                    l10.a("ad quality session is already in progress. skipping...");
                } else {
                    l10.f25159g = adQualityControl;
                }
            }
        }
        C3184o0 c3184o1 = this.f27239l;
        if (c3184o1 != null && (watermarkData = c3184o1.f27095m) != null) {
            setWatermark(watermarkData);
        }
        C3184o0 c3184o2 = this.f27239l;
        if (c3184o2 != null ? kotlin.jvm.internal.s.c(c3184o2.f27094l, Boolean.TRUE) : false) {
            l();
        }
    }

    public final void d(JSONObject jSONObject) {
        short s10;
        final String strOptString = jSONObject.optString("errorCode");
        Object objA = L3.a(new tl.a() { // from class: yh.ha
            @Override // tl.a
            public final Object invoke() {
                return Short.valueOf(GestureDetectorOnGestureListenerC3228pi.m(strOptString));
            }
        });
        if (fl.r.i(objA)) {
            short sShortValue = ((Number) objA).shortValue();
            C3485zi c3485zi = this.f27224e0;
            if (c3485zi != null) {
                Map mapA = c3485zi.a();
                switch (sShortValue) {
                    case 101:
                        s10 = 2261;
                        break;
                    case 102:
                        s10 = 2262;
                        break;
                    case 103:
                        s10 = 2263;
                        break;
                    case 104:
                        s10 = 2267;
                        break;
                    case 105:
                        s10 = 2266;
                        break;
                    case 106:
                        s10 = 2265;
                        break;
                    case 107:
                        s10 = 2264;
                        break;
                    default:
                        switch (sShortValue) {
                            case 301:
                                s10 = 2268;
                                break;
                            case 302:
                                s10 = 2269;
                                break;
                            case HttpStatusCodes.STATUS_CODE_SEE_OTHER /* 303 */:
                                s10 = 2270;
                                break;
                            case 304:
                                s10 = 2271;
                                break;
                            case MRAID_BRIDGE_ERROR_VALUE:
                                s10 = 2272;
                                break;
                            case 306:
                                s10 = 2273;
                                break;
                            case 307:
                                s10 = 2274;
                                break;
                            case AD_WIN_NOTIFICATION_ERROR_VALUE:
                                s10 = 2275;
                                break;
                            case ASSET_FAILED_TO_DELETE_VALUE:
                                s10 = 2276;
                                break;
                            case AD_HTML_FAILED_TO_LOAD_VALUE:
                                s10 = 2277;
                                break;
                            case MRAID_JS_CALL_EMPTY_VALUE:
                                s10 = 2278;
                                break;
                            case DEEPLINK_OPEN_FAILED_VALUE:
                                s10 = 2280;
                                break;
                            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                s10 = 2281;
                                break;
                            default:
                                s10 = sShortValue;
                                break;
                        }
                        break;
                }
                mapA.put("errorCode", Short.valueOf(s10));
                long j10 = c3485zi.f28025c;
                em.o0 o0Var = AbstractC3488zl.f28033a;
                mapA.put(UHbHibBvYxKnPE.jtwRgHRL, Long.valueOf(SystemClock.elapsedRealtime() - j10));
                C3178nk c3178nk = C3178nk.f27064a;
                C3178nk.b("CompanionWebViewLoadFailed", mapA, EnumC3281rk.SDK);
            }
        }
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.f27223e);
        }
        h("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void b(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onCTLifeCycleEvent " + this);
        }
        h("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jsonObject + ");");
    }

    public final void b(String trackerName, Map macros) {
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireLandingPageTracker " + this);
        }
        getListener().a(this, trackerName, macros);
    }

    public final void b(GestureDetectorOnGestureListenerC3228pi sourceView, String targetId) throws JSONException {
        kotlin.jvm.internal.s.h(sourceView, "sourceView");
        kotlin.jvm.internal.s.h(targetId, "targetId");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "fireLoadWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        C3485zi c3485zi = this.f27224e0;
        jSONObject.put("latency", c3485zi != null ? c3485zi.f28030h : 0L);
        sourceView.h("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public final void k(String url) {
        kotlin.jvm.internal.s.h(url, "url");
        C3485zi c3485zi = this.f27224e0;
        if (c3485zi != null) {
            c3485zi.b();
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "loadUrlInWebView " + this);
        }
        this.Q = false;
        if (this.N.get()) {
            return;
        }
        loadUrl(url);
    }

    public static final void d(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, String str) {
        try {
            if (gestureDetectorOnGestureListenerC3228pi.N.get()) {
                return;
            }
            String str2 = "javascript:try{" + str + "}catch(e){}";
            InterfaceC3322t9 interfaceC3322t9 = gestureDetectorOnGestureListenerC3228pi.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).a(TAG, "Injecting javascript");
            }
            gestureDetectorOnGestureListenerC3228pi.c(str2);
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t10 = gestureDetectorOnGestureListenerC3228pi.f27233i;
            if (interfaceC3322t10 != null) {
                String TAG2 = f27210i1;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).b(TAG2, "SDK encountered an unexpected error injecting JavaScript in the Ad container; " + e10.getMessage());
            }
        }
    }

    public final void d(String errorCode) {
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        if (this.P0) {
            InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
            if (interfaceC3322t9 != null) {
                String TAG = f27210i1;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).a(TAG, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.D0 = true;
        C3485zi c3485zi = this.f27224e0;
        if (c3485zi != null) {
            Map mapA = c3485zi.a();
            long j10 = c3485zi.f28025c;
            em.o0 o0Var = AbstractC3488zl.f28033a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3485zi.a("FireAdFailed");
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b(strA, mapA, EnumC3281rk.SDK);
        }
        getListener().a(this, errorCode);
    }

    public static String d(int i10) {
        return "SDK_" + i10;
    }

    public final void a(RelativeLayout adView) {
        Gf gf2;
        kotlin.jvm.internal.s.h(adView, "adBackgroundView");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        C3475z8 c3475z8 = this.Z0;
        if (c3475z8 != null) {
            kotlin.jvm.internal.s.h(adView, "parentView");
            if (c3475z8.f27992g.get()) {
                return;
            }
            InterfaceC3322t9 interfaceC3322t10 = c3475z8.f27988c;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).b("HybridVideoPlayerHandler", "Inflate called");
            }
            if (c3475z8.f27994i && (gf2 = c3475z8.f28001p) != null) {
                kotlin.jvm.internal.s.h(adView, "parentView");
                InterfaceC3322t9 interfaceC3322t11 = gf2.f24865g;
                if (interfaceC3322t11 != null) {
                    kotlin.jvm.internal.s.g("Gf", "TAG");
                    ((C3348u9) interfaceC3322t11).c("Gf", "startOmidSession");
                }
                Ie ie2 = gf2.f24863e;
                if (ie2 != null) {
                    kotlin.jvm.internal.s.h(adView, "adView");
                    if (ie2.f26432c == null) {
                        InterfaceC3322t9 interfaceC3322t12 = ie2.f26431b;
                        if (interfaceC3322t12 != null) {
                            ((C3348u9) interfaceC3322t12).a(AbstractC2926e1.f26429f, "Failed to registerAdView. adSession is null");
                        }
                    } else {
                        InterfaceC3322t9 interfaceC3322t13 = ie2.f26431b;
                        if (interfaceC3322t13 != null) {
                            ((C3348u9) interfaceC3322t13).a(AbstractC2926e1.f26429f, "registerAdView");
                        }
                        T4.a(ie2.f26430a, new Y0(ie2, adView, null));
                    }
                }
                Ie ie3 = gf2.f24863e;
                if (ie3 != null) {
                    if (ie3.f26432c == null) {
                        InterfaceC3322t9 interfaceC3322t14 = ie3.f26431b;
                        if (interfaceC3322t14 != null) {
                            ((C3348u9) interfaceC3322t14).a(AbstractC2926e1.f26429f, "Failed to startAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3322t9 interfaceC3322t15 = ie3.f26431b;
                        if (interfaceC3322t15 != null) {
                            ((C3348u9) interfaceC3322t15).a(AbstractC2926e1.f26429f, "startAdSession");
                        }
                        T4.a(ie3.f26430a, new C2849b1(ie3, null));
                    }
                }
            }
            c3475z8.f27996k.a(adView);
            c3475z8.f27996k.e();
            c3475z8.f28000o = true;
        }
    }

    public final void a(EnumC3321t8 enumC3321t8, Object obj) {
        if (obj instanceof String) {
            obj = "'" + obj + "'";
        }
        String str = "window.imraid.broadcastEvent('" + enumC3321t8.f27535a + "', " + obj + ");";
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).b(TAG, "fireHtmlVideoEvents: " + str);
        }
        h(str);
    }

    public final void a(HashMap params) {
        Gf gf2;
        Ie ie2;
        kotlin.jvm.internal.s.h(params, "params");
        getListener().a(params);
        C3475z8 c3475z8 = this.Z0;
        if (c3475z8 == null || (gf2 = c3475z8.f28001p) == null || (ie2 = gf2.f24863e) == null) {
            return;
        }
        ie2.a(InteractionType.CLICK);
    }

    public static final fl.g0 a(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "it");
        SparseArray sparseArray = InMobiAdActivity.f24404t;
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = InMobiAdActivity.f24405u;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.c(jsonObject);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(String trackerName, Map macros) {
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
        SparseArray sparseArray = InMobiAdActivity.f24404t;
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = InMobiAdActivity.f24405u;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.b(trackerName, macros);
        }
        return fl.g0.f38750a;
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "initContextualData " + this);
        }
        this.Y0 = new H4(ad2 != null ? ad2.getContextData() : null, this.f27212a0);
    }

    public static final fl.g0 a(C3435xi it) {
        kotlin.jvm.internal.s.h(it, "it");
        it.b();
        return fl.g0.f38750a;
    }

    public final void a(String url, boolean z10) {
        kotlin.jvm.internal.s.h(url, "url");
        if (!z10) {
            k(url);
            return;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "loadHtmlUrl: prefetching URL content before WebView load");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C3485zi c3485zi = this.f27224e0;
        if (c3485zi != null) {
            Map mapA = c3485zi.a();
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("HtmlUrlPrefetchStarted", mapA, EnumC3281rk.SDK);
        }
        this.f27267z = em.k.d(H9.f24930c, null, null, new C2995gi(url, this, jElapsedRealtime, null), 3, null);
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final void a(String mraidApi) {
        kotlin.jvm.internal.s.h(mraidApi, "mraidApi");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "sendFraudBeaconAndTelemetryEvent " + this);
        }
        e(mraidApi);
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(mraidApi, adType);
    }

    public final void a(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireNextAdLoadComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adLoadSuccess'," + z10 + ");";
        InterfaceC3322t9 interfaceC3322t10 = this.f27233i;
        if (interfaceC3322t10 != null) {
            String TAG2 = f27210i1;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).c(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        h(str);
    }

    public final void a(int i10, int i11) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, geAgcEazw.qbQnTkfBzD + this + " w-" + i10 + " h-" + i11);
        }
        h("window.mraidview.broadcastEvent('sizeChange'," + i10 + "," + i11 + ");");
    }

    public final void a(int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireOrientationChange " + this + " " + i10);
        }
        h("window.imraid.broadcastEvent('orientationChange','" + i10 + "');");
    }

    public final void a(String str, JSONObject message) {
        kotlin.jvm.internal.s.h(message, "message");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireError " + this + " - " + message);
        }
        h("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
        d(message);
    }

    public final void a(String str, String message, String str2) {
        kotlin.jvm.internal.s.h(message, "message");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireError " + this + " - " + message + " - " + str2);
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + message + "\", \"" + str2 + "\")");
    }

    public final void a(String str, String callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "fireJavaScriptCallback " + this);
        }
        if (str == null) {
            return;
        }
        h(str + "." + callback);
    }

    public final void a(String str, HashMap map) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "processTelemetryEvent " + this);
        }
        getListener().a(str, map);
    }

    public void a(Nf orientationProperties) {
        kotlin.jvm.internal.s.h(orientationProperties, "orientationProperties");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "setOrientationProperties " + this);
        }
        this.H0 = orientationProperties;
        Y();
    }

    public static final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        gestureDetectorOnGestureListenerC3228pi.getListener().j(gestureDetectorOnGestureListenerC3228pi);
    }

    @Override // com.inmobi.media.Of
    public final void a(Lf orientation) {
        kotlin.jvm.internal.s.h(orientation, "orientation");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onOrientationUpdate " + this);
        }
    }

    public final void a(Lf orientation, No no2) {
        JSONObject jSONObjectA;
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "fireOnSafeAreaChanged " + this);
        }
        kotlin.jvm.internal.s.h(no2, "<this>");
        kotlin.jvm.internal.s.h(orientation, "orientation");
        try {
            no2.getClass();
            kotlin.jvm.internal.s.h(orientation, "orientation");
            Mo mo2 = (Mo) no2.f25373a.get(orientation);
            if (mo2 != null) {
                jSONObjectA = mo2.a();
                jSONObjectA.put("orientation", Mf.a(orientation));
            } else {
                jSONObjectA = null;
            }
        } catch (Exception unused) {
        }
        h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObjectA + ")");
    }

    public final boolean a(JsResult jsResult) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "shouldRenderPopup " + this);
        }
        if (getRenderingConfig().getShouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        w();
        return false;
    }

    @Override // com.inmobi.media.InterfaceC3408wh
    public final boolean a() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "hasUserInteracted " + getViewTouchTimestamp() + " " + getRenderingConfig().getUserTouchResetTime());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.f27242m0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final void a(Exception e10) {
        kotlin.jvm.internal.s.h(e10, "e");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "handlePingException " + this, e10);
        }
        InterfaceC3070jg interfaceC3070jg = this.f27249q;
        EnumC2906d6[] enumC2906d6Arr = EnumC2906d6.f26393a;
        ((C3124li) interfaceC3070jg).a("", -107, "Ping exception occurred", System.currentTimeMillis(), 0);
        fl.k kVar = W9.f25935a;
        AbstractC3219p9.a(e10);
    }

    public static final fl.g0 a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = gestureDetectorOnGestureListenerC3228pi.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC3228pi.getListener().a(gestureDetectorOnGestureListenerC3228pi, z10);
        return fl.g0.f38750a;
    }

    public final void a(boolean z10, short s10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "fireRenderProcessGoneTelemetry");
        }
        C3485zi c3485zi = this.f27224e0;
        if (c3485zi != null) {
            c3485zi.a(z10, s10);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi sourceView, String targetId) throws JSONException {
        kotlin.jvm.internal.s.h(sourceView, "sourceView");
        kotlin.jvm.internal.s.h(targetId, "targetId");
        InterfaceC3322t9 interfaceC3322t9 = this.f27233i;
        if (interfaceC3322t9 != null) {
            String TAG = f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).c(TAG, "fireDestroyWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.h("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }
}
