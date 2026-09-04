package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import c1.pGX.geAgcEazw;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.AbstractC3107l1;
import com.inmobi.media.EnumC2931e6;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.common.model.Viewability;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;

/* JADX INFO: renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3107l1 extends AbstractC3279ri implements F2, Dk, InterfaceC3391w0, Io {
    public static final /* synthetic */ int E = 0;
    public WatermarkData A;
    public final fl.k B;
    public boolean C;
    public final fl.k D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile byte f26890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f26891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f26892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeoutConfigurations f26893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f26894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Fa f26895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CopyOnWriteArrayList f26896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3348u9 f26897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f26898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C3365v0 f26900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AdResponse f26901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Fk f26902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f26905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TreeSet f26906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f26907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f26908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C2848b0 f26909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C3142ma f26910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C3377vc f26911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f26912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f26913y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3262r1 f26914z;

    public AbstractC3107l1(Context context, C3365v0 adPlacement, Uk uk2) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(adPlacement, "adPlacement");
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        this.f26889a = string;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        this.f26891c = (AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class);
        this.f26895g = (Fa) Ga.f24848a.getValue();
        this.f26896h = new CopyOnWriteArrayList();
        this.f26900l = adPlacement;
        this.f26905q = -1L;
        this.f26906r = new TreeSet();
        this.f26912x = new Handler(Looper.getMainLooper());
        this.f26913y = new LinkedHashMap();
        this.f26914z = new C3262r1(this);
        this.B = fl.l.b(new tl.a() { // from class: yh.k9
            @Override // tl.a
            public final Object invoke() {
                return AbstractC3107l1.d(this.f57805a);
            }
        });
        this.f26892d = new WeakReference(context);
        this.f26894f = new WeakReference(uk2);
        Ib ib2 = Sh.f25698a;
        Sh.a(uk2, this.f26897i);
        WeakReference weakReference = this.f26894f;
        String strM = m();
        AdSet adSetS = s();
        this.f26909u = new C2848b0(weakReference, strM, adSetS != null ? adSetS.getIsRewarded() : false);
        M();
        this.D = fl.l.b(new tl.a() { // from class: yh.l9
            @Override // tl.a
            public final Object invoke() {
                return AbstractC3107l1.e(this.f57823a);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0017, B:10:0x001d, B:13:0x0028, B:12:0x0023), top: B:21:0x0017, outer: #1 }] */
    public static final void c(AbstractC3107l1 abstractC3107l1) {
        AdConfig.OmidConfig omidConfig;
        Kf kf2 = Jf.f25068a;
        Context contextO = abstractC3107l1.o();
        AdConfig adConfig = abstractC3107l1.f26891c;
        kf2.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(contextO);
                return;
            }
            if (adConfig != null) {
                try {
                    AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    if (viewability == null || (omidConfig = viewability.getOmidConfig()) == null) {
                        omidConfig = new AdConfig.OmidConfig();
                    }
                } catch (Exception e10) {
                    fl.k kVar = W9.f25935a;
                    W9.a(new M2(e10));
                    return;
                }
            } else {
                omidConfig = new AdConfig.OmidConfig();
            }
            kf2.f25120b = Partner.createPartner(omidConfig.getPartnerKey(), kf2.a());
        } catch (Exception e11) {
            fl.k kVar2 = W9.f25935a;
            AbstractC3219p9.a(e11);
        }
    }

    public static final Bo d(AbstractC3107l1 abstractC3107l1) {
        return new Bo(abstractC3107l1.f26897i);
    }

    public final boolean A() {
        AdConfig.CacheConfig cacheConfig;
        C3348u9 c3348u9;
        boolean z10 = false;
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB == null) {
            return false;
        }
        AdConfig adConfig = this.f26891c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(m())) != null) {
            z10 = ((adB.getExpiryTimestampInMillis() > (-1L) ? 1 : (adB.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + adB.getInsertionTimestampInMillis() : adB.getExpiryTimestampInMillis()) - System.currentTimeMillis() < 0;
            if (z10 && (c3348u9 = this.f26897i) != null) {
                String TAG = UHbHibBvYxKnPE.HNgHzHJfhX;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                c3348u9.b(TAG, "Top ad has expired, failing show of ad.");
            }
        }
        return z10;
    }

    public final void B() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "initTelemetry " + this);
        }
        this.f26913y.put("AdImpressionSuccessful", this.f26914z);
    }

    public final boolean C() throws JSONException {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.f26890b));
        }
        if (!AbstractC2829a7.a()) {
            d();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (F()) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.b("l1", "Some of the dependency libraries for " + m() + " not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b10 = this.f26890b;
        if (b10 == 1) {
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u11.b("l1", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b10 != 7) {
            return false;
        }
        C3348u9 c3348u12 = this.f26897i;
        if (c3348u12 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u12.b("l1", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void D() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "load  " + this);
        }
        C3262r1 c3262r1 = this.f26914z;
        c3262r1.getClass();
        c3262r1.f27363c = SystemClock.elapsedRealtime();
        a(new tl.a() { // from class: yh.i9
            @Override // tl.a
            public final Object invoke() {
                return AbstractC3107l1.a(this.f57779a);
            }
        }, new Function1() { // from class: yh.j9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC3107l1.a(this.f57793a, (EnumC2931e6) obj);
            }
        });
    }

    public final void E() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "makeUnitActive " + this);
        }
        this.f26899k = false;
    }

    public void G() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onDidParseAfterFetch " + this);
        }
        c((byte) 2);
        Handler handler = this.f26898j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yh.h9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3107l1.c(this.f57756a);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    public final Te H() {
        boolean z10;
        Integer num;
        Integer num2;
        Integer num3;
        AdConfig.RenderingConfig rendering;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "prepareAdRequest " + this);
        }
        Context contextO = o();
        C3173nf c3173nf = contextO != null ? new C3173nf(contextO, this.f26897i) : null;
        String str = this.f26900l.f27665g;
        kotlin.jvm.internal.s.e(str);
        this.f26900l.getClass();
        C3365v0 c3365v0 = this.f26900l;
        Map map = c3365v0.f27661c;
        long j10 = c3365v0.f27659a;
        String str2 = c3365v0.f27667i;
        String strM = m();
        HashMap mapL = l();
        String str3 = this.f26900l.f27662d;
        AdConfig adConfig = this.f26891c;
        if (adConfig != null && (rendering = adConfig.getRendering()) != null) {
            z10 = rendering.getEnablePubMuteControl() && Xi.f26026f;
        }
        C3158n0 c3158n0 = new C3158n0(str, map, j10, str2, strM, mapL, str3, z10);
        C3377vc c3377vc = this.f26911w;
        int iIntValue = 15000;
        long jIntValue = (c3377vc == null || (num3 = c3377vc.f27715d) == null) ? 15000 : num3.intValue();
        C3377vc c3377vc2 = this.f26911w;
        long jIntValue2 = (c3377vc2 == null || (num2 = c3377vc2.f27715d) == null) ? 15000 : num2.intValue();
        C3377vc c3377vc3 = this.f26911w;
        if (c3377vc3 != null && (num = c3377vc3.f27715d) != null) {
            iIntValue = num.intValue();
        }
        Gk gk2 = new Gk(jIntValue, jIntValue2, iIntValue);
        AdConfig adConfig2 = this.f26891c;
        String url = adConfig2 != null ? adConfig2.getUrl() : null;
        AdConfig adConfig3 = this.f26891c;
        kotlin.jvm.internal.s.e(adConfig3);
        Rk rk2 = new Rk(adConfig3.getIncludeIds());
        C3121lf c3121lfA = c3173nf != null ? c3173nf.a() : null;
        C3348u9 c3348u10 = this.f26897i;
        AdConfig adConfig4 = this.f26891c;
        return new C3210p0(url, rk2, c3158n0, gk2, c3121lfA, c3348u10, adConfig4 != null ? adConfig4.getApplyGzipReq() : false).a();
    }

    public final void I() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "printPublisherTestId " + this);
        }
        Qk.b();
    }

    public void J() throws JSONException {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "resetContainersForNextAd " + this);
        }
        int size = this.f26896h.size();
        int i10 = this.f26904p;
        if (size <= i10 || this.f26896h.get(i10) == null) {
            return;
        }
        a(this.f26904p, false);
    }

    public final void K() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void L() {
        kotlin.jvm.internal.s.h("activity", "monetizationContext");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "setMonetizationContext " + this);
        }
        C3365v0 c3365v0 = this.f26900l;
        c3365v0.getClass();
        kotlin.jvm.internal.s.h("activity", "<set-?>");
        c3365v0.f27667i = "activity";
    }

    public final void M() {
        kotlin.jvm.internal.s.g("l1", "TAG");
        toString();
        this.f26893e = z();
        c((byte) 0);
        this.f26898j = new Handler(Looper.getMainLooper());
        this.f26902n = new Fk(this);
    }

    public final boolean N() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "shouldBlockLoadAd " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null && 4 == this.f26890b && !A()) {
            AbstractC2978g1 abstractC2978g1N = n();
            if (abstractC2978g1N != null) {
                C3348u9 c3348u10 = this.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u10.a("l1", "ad is ready - load success");
                }
                d(abstractC2978g1N);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (adB == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u11.b("l1", "ad no longer available");
            }
            return true;
        }
        if (2 == this.f26890b) {
            if (!A()) {
                return false;
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            C3348u9 c3348u12 = this.f26897i;
            if (c3348u12 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u12.b("l1", "ad is expired");
            }
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        C3348u9 c3348u13 = this.f26897i;
        if (c3348u13 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u13.b("l1", "ad no longer available. state - " + ((int) this.f26890b));
        }
        return true;
    }

    public final void O() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        int i10;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "startLoadingHTMLAd " + this);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = null;
        try {
            AdSet adSetS = s();
            com.inmobi.media.ads.network.common.model.Ad ad3 = (adSetS == null || (i10 = this.f26903o) < 0 || i10 >= adSetS.getAds().size()) ? null : adSetS.getAds().get(this.f26903o);
            d(this.f26903o);
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                AdSet adSetS2 = s();
                c3348u10.a("l1", "Loading ad with impressionId : " + ((adSetS2 == null || (ads = adSetS2.getAds()) == null || (ad2 = ads.get(this.f26903o)) == null) ? null : ad2.getImpressionId()));
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(this.f26903o);
            if (ad3 != null) {
                Pg pubContent = ad3.getPubContent();
                if (pubContent instanceof Y7) {
                    C3348u9 c3348u11 = this.f26897i;
                    if (c3348u11 != null) {
                        kotlin.jvm.internal.s.g("l1", "TAG");
                        c3348u11.a("l1", "Loading HTML content into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC3228pi2 != null) {
                        gestureDetectorOnGestureListenerC3228pi2.i(((Y7) pubContent).f26069a);
                    }
                } else if (pubContent instanceof Z7) {
                    String string = bm.r.V0(((Z7) pubContent).f26131a).toString();
                    C3348u9 c3348u12 = this.f26897i;
                    if (c3348u12 != null) {
                        kotlin.jvm.internal.s.g("l1", "TAG");
                        c3348u12.a("l1", "Loading HTML URL into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC3228pi2 != null) {
                        gestureDetectorOnGestureListenerC3228pi2.a(string, this.f26891c.getRendering().getEnableHtmlUrlPrefetch());
                    }
                }
            }
            if (gestureDetectorOnGestureListenerC3228pi2 == null || !kotlin.jvm.internal.s.c(t(), "htmlUrl")) {
                return;
            }
            k(gestureDetectorOnGestureListenerC3228pi2);
        } catch (Exception e10) {
            C3348u9 c3348u13 = this.f26897i;
            if (c3348u13 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u13.a("l1", "Loading ad markup into container encountered an unexpected error: " + e10.getMessage());
            }
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
            int i11 = this.f26903o;
            if (i11 >= 0 && i11 < this.f26896h.size()) {
                gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(this.f26903o);
            }
            a(gestureDetectorOnGestureListenerC3228pi, (short) 2135, e((short) 2135));
        }
    }

    public final void P() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "submitAdLoadCalled " + this);
        }
        HashMap map = new HashMap();
        c(map);
        c("AdLoadCalled", map);
    }

    public final void Q() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + t() + " " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f26914z.f27363c;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3142ma c3142ma = this.f26910v;
        if (c3142ma != null) {
            map.put("retryCount", Integer.valueOf(c3142ma.f26991b));
        }
        AdSet adSetS = s();
        if (adSetS != null) {
            map.put("isRewarded", Boolean.valueOf(adSetS.getIsRewarded()));
        }
        if (y().length() > 0) {
            map.put("metadataBlob", y());
        }
        c(map);
        c("AdLoadSuccessful", map);
    }

    public final void R() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "submitAdShowCalled " + this);
        }
        C3262r1 c3262r1 = this.f26914z;
        c3262r1.getClass();
        c3262r1.f27366f = SystemClock.elapsedRealtime();
        HashMap map = new HashMap();
        map.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad adQ = q();
        if (adQ == null || (impressionId = adQ.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j10 = this.f26914z.f27369i;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        com.inmobi.media.ads.network.common.model.Ad adQ2 = q();
        if (adQ2 != null && (metaInfo = adQ2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetS = s();
        if (adSetS != null) {
            map.put("isRewarded", Boolean.valueOf(adSetS.getIsRewarded()));
        }
        if (y().length() > 0) {
            map.put("metadataBlob", y());
        }
        c(map);
        c("AdShowCalled", map);
    }

    public final void S() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "submitAdShowSuccess " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f26914z.f27366f;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad adQ = q();
        if (adQ == null || (impressionId = adQ.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adQ2 = q();
        if (adQ2 != null && (metaInfo = adQ2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetS = s();
        if (adSetS != null) {
            map.put("isRewarded", Boolean.valueOf(adSetS.getIsRewarded()));
        }
        if (y().length() > 0) {
            map.put("metadataBlob", y());
        }
        c(map);
        c("AdShowSuccessful", map);
    }

    public final long U() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "timeSincePodShow " + this);
        }
        if (this.f26907s) {
            return System.currentTimeMillis() - this.f26905q;
        }
        return -1L;
    }

    public final void V() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.b("l1", "ad unloaded with current state - " + ((int) this.f26890b));
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.d("l1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public void a(GestureDetectorOnGestureListenerC3228pi renderView, boolean z10) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onRenderProcessGone didCrash=" + z10 + " state=" + ((int) this.f26890b));
        }
        byte b10 = this.f26890b;
        if (b10 == 0) {
            short s10 = z10 ? (short) 2214 : (short) 2213;
            K();
            renderView.a(z10, s10);
            return;
        }
        if (b10 == 1) {
            short s11 = z10 ? (short) 2216 : (short) 2215;
            K();
            c(s11);
            AbstractC2978g1 abstractC2978g1N = n();
            if (abstractC2978g1N != null) {
                abstractC2978g1N.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 3) {
            renderView.a(z10, z10 ? (short) 2226 : (short) 2225);
            return;
        }
        if (b10 == 2) {
            K();
            c(z10 ? (short) 2218 : (short) 2217);
            AbstractC2978g1 abstractC2978g1N2 = n();
            if (abstractC2978g1N2 != null) {
                abstractC2978g1N2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 4 || b10 == 6 || b10 == 7 || b10 != 8) {
            return;
        }
        renderView.a(z10, z10 ? (short) 2240 : (short) 2241);
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i10) {
        Iterable iterableL;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        kotlin.jvm.internal.s.g("l1", "TAG");
        toString();
        AdSet adSetS = s();
        if (adSetS == null || (ads3 = adSetS.getAds()) == null || (iterableL = gl.r.m(ads3)) == null) {
            iterableL = gl.r.l();
        }
        if (gl.r.U(iterableL, Integer.valueOf(i10))) {
            AdSet adSetS2 = s();
            if (adSetS2 == null || (ads2 = adSetS2.getAds()) == null) {
                return null;
            }
            return ads2.get(i10);
        }
        AdSet adSetS3 = s();
        if (adSetS3 == null || (ads = adSetS3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void e(AbstractC2978g1 abstractC2978g1) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "adUnitEventListener setter " + this);
        }
        WeakReference weakReference = new WeakReference(abstractC2978g1);
        this.f26894f = weakReference;
        AdSet adSetS = s();
        C2848b0 c2848b0 = new C2848b0(weakReference, "int", adSetS != null ? adSetS.getIsRewarded() : false);
        this.f26909u = c2848b0;
        C3348u9 logger = this.f26897i;
        if (logger != null) {
            kotlin.jvm.internal.s.h(logger, "logger");
            c2848b0.f26241f = logger;
        }
    }

    public final void f() throws JSONException {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "destroyAllContainer " + this);
        }
        int size = this.f26896h.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(i10, true);
        }
    }

    public final void g() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "doAdLoadWork " + this);
        }
        try {
            c((byte) 1);
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.d("l1", "AdUnit " + this + " state - LOADING");
            }
            I();
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
            if (((RootConfig) AbstractC2878c4.f26300a.a(RootConfig.class)).getMonetizationDisabled()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                C3348u9 c3348u11 = this.f26897i;
                if (c3348u11 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u11.b("l1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.f26895g.a(this.f26889a, new C3004h1(this, null));
                C3348u9 c3348u12 = this.f26897i;
                if (c3348u12 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u12.a("l1", "Fresh ad requested");
                }
            }
        } catch (Exception e10) {
            C3348u9 c3348u13 = this.f26897i;
            if (c3348u13 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u13.b("l1", "Load failed with unexpected error: " + e10.getMessage());
            }
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    public final void h() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "fireAdServedBeacon " + this);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piJ = j();
        if (gestureDetectorOnGestureListenerC3228piJ == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3228piJ.t();
    }

    public abstract void i();

    @Override // com.inmobi.media.AbstractC3279ri
    public void i(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "RenderView visible, for index " + this.f26896h.indexOf(renderView) + " " + this);
        }
    }

    public final GestureDetectorOnGestureListenerC3228pi j() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "adMarkupContainer getter " + this);
        }
        byte b10 = this.f26890b;
        String strT = t();
        if (kotlin.jvm.internal.s.c(strT, "html")) {
            if (b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
                return null;
            }
            return r();
        }
        if (!kotlin.jvm.internal.s.c(strT, "htmlUrl") || b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
            return null;
        }
        return r();
    }

    public final AdMetaInfo k() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "adMetaInfo getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null) {
            return new AdMetaInfo(adB.getCreativeId(), adB.getTransaction());
        }
        return null;
    }

    public HashMap l() {
        return new HashMap();
    }

    public abstract String m();

    public void m(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        Ph ph2;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "Render view signaled ad ready, for index " + this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi) + " " + this);
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.a("l1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        C3348u9 c3348u11 = this.f26897i;
        if (c3348u11 == null || (ph2 = c3348u11.f27613a) == null) {
            return;
        }
        ph2.a();
    }

    public final AbstractC2978g1 n() {
        C3348u9 c3348u9;
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.c("l1", "adUnitEventListener getter " + this);
        }
        AbstractC2978g1 abstractC2978g1 = (AbstractC2978g1) this.f26894f.get();
        if (abstractC2978g1 == null && (c3348u9 = this.f26897i) != null) {
            c3348u9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC2978g1;
    }

    public final Context o() {
        WeakReference weakReference = this.f26892d;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        return this.f26907s ? b(this.f26903o) : b(0);
    }

    public final com.inmobi.media.ads.network.common.model.Ad q() {
        return this.f26907s ? b(this.f26904p) : b(0);
    }

    public abstract GestureDetectorOnGestureListenerC3228pi r();

    public final AdSet s() {
        List<AdSet> adSets;
        AdResponse adResponse = this.f26901m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (AdSet) gl.r.d0(adSets);
    }

    public final String t() {
        String markupType;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "markupType getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        return (adB == null || (markupType = adB.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public abstract byte u();

    public final String v() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "getPodAdContext " + this);
        }
        if (this.f26907s) {
            return this.f26908t;
        }
        return null;
    }

    public final JSONArray w() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "getRenderableAdIndexes " + this);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f26906r.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.s.g(next, "next(...)");
            jSONArray.put(((Number) next).intValue());
        }
        return jSONArray;
    }

    public final long x() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "getShowTimeStamp " + this);
        }
        if (this.f26907s) {
            return this.f26905q;
        }
        return -1L;
    }

    public final String y() {
        String telemetryMetadataBlob;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetS = s();
        com.inmobi.media.ads.network.common.model.Ad ad2 = (adSetS == null || (ads = adSetS.getAds()) == null) ? null : (com.inmobi.media.ads.network.common.model.Ad) gl.r.d0(ads);
        return (ad2 == null || (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public final TimeoutConfigurations z() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "timeOutConfiguration getter " + this);
        }
        AdConfig adConfig = this.f26891c;
        kotlin.jvm.internal.s.e(adConfig);
        return adConfig.getTimeouts();
    }

    public boolean F() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", PAFNPq.WkPPU + this);
        }
        try {
            kotlin.jvm.internal.l0.b(androidx.browser.customtabs.c.class).k();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void T() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = mTFeqtajA.BTEHjxBG;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "submitRenderSuccessEvent ADunit markuptype : " + t() + " " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f26914z.f27367g;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad adQ = q();
        if (adQ == null || (impressionId = adQ.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adQ2 = q();
        if (adQ2 != null && (metaInfo = adQ2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3142ma c3142ma = this.f26910v;
        if (c3142ma != null) {
            map.put("retryCount", Integer.valueOf(c3142ma.f26991b));
        }
        map.put("plType", Byte.valueOf(u()));
        AdSet adSetS = s();
        if (adSetS != null) {
            map.put("isRewarded", Boolean.valueOf(adSetS.getIsRewarded()));
        }
        if (y().length() > 0) {
            map.put("metadataBlob", y());
        }
        c(map);
        a(q(), map);
        c("RenderSuccess", map);
    }

    public final int l(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "getCurrentRenderingPodAdIndex " + this);
        }
        if (!this.f26907s) {
            return -1;
        }
        int iIndexOf = this.f26896h.indexOf(renderView);
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.c("l1", "getCurrentRenderingPodAdIndex " + iIndexOf);
        }
        return iIndexOf;
    }

    public void o(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onAdUnloadedAfterShowSuccess");
        }
        renderView.n();
        b((byte) 4);
    }

    public final void d(int i10) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "initializeHtmlAdContainer " + this);
        }
        Context contextO = o();
        if (contextO == null) {
            return;
        }
        try {
            if (this.f26896h.get(i10) != null && ((gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(i10)) == null || !gestureDetectorOnGestureListenerC3228pi.N.get())) {
                return;
            }
            com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
            C3184o0 c3184o0A = a(i10);
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = ((Bo) this.B.getValue()).a(new Qi("adUnit-" + i10, "default"), contextO, (short) 0, c3184o0A, this.f26891c);
            a(gestureDetectorOnGestureListenerC3228piA, c3184o0A.f27098p);
            this.f26896h.set(i10, gestureDetectorOnGestureListenerC3228piA);
            gestureDetectorOnGestureListenerC3228piA.a(this);
            gestureDetectorOnGestureListenerC3228piA.a(adB);
        } catch (Exception e10) {
            a((GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(this.f26903o), (short) 2136, e((short) 2136));
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.a("l1", "Exception while initializing WebView", e10);
            }
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    public static String p(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        em.z1 z1Var = renderView.f27267z;
        return e((z1Var == null || !z1Var.isActive()) ? (short) 3103 : (short) 3102);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void h(final GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "onRenderViewSignaledAdReady " + this);
        }
        if (!this.f26899k && o() != null) {
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.g9
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3107l1.a(this.f57739a, renderView);
                    }
                });
                return;
            } else {
                c((short) 2187);
                return;
            }
        }
        c((short) 2186);
    }

    public final void k(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        int iIndexOf = this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi);
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "fireLoadAdTokenUrlSuccessful : " + iIndexOf + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String url : Li.a(adB, "load_ad_token_url")) {
                A3 a10 = A3.f24440a;
                C3348u9 c3348u10 = this.f26897i;
                kotlin.jvm.internal.s.h(url, "url");
                A3.a(url, true, c3348u10);
            }
        }
    }

    public void n(GestureDetectorOnGestureListenerC3228pi renderView) {
        int iL;
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onAdUnloadedAfterLoadSuccess");
        }
        if (this.f26907s && (iL = l(renderView)) > this.f26904p) {
            this.f26906r.remove(Integer.valueOf(iL));
        } else {
            V();
        }
    }

    public final void b(AbstractC2978g1 abstractC2978g1) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "onAdShowFailed " + this);
        }
        d((short) 85);
        abstractC2978g1.b();
    }

    public final void b(InMobiAdRequestStatus requestStatus, short s10) {
        kotlin.jvm.internal.s.h(requestStatus, "requestStatus");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "onAdFetchFailed " + this);
        }
        if (!this.f26899k && o() != null && this.f26890b != 3) {
            a(requestStatus, s10);
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.b("l1", "callback ignored - isDestroyed - " + this.f26899k + " context - " + o() + " state- " + ((int) this.f26890b));
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void j(GestureDetectorOnGestureListenerC3228pi renderView) throws JSONException {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        byte b10 = this.f26890b;
        if (b10 == 2) {
            V();
            b((byte) 1);
            AbstractC2978g1 abstractC2978g1N = n();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (abstractC2978g1N != null) {
                abstractC2978g1N.a(this, inMobiAdRequestStatus);
            } else {
                C3348u9 c3348u9 = this.f26897i;
                if (c3348u9 != null) {
                    c3348u9.a();
                }
            }
            c((short) 2238);
            renderView.b();
            return;
        }
        if (b10 == 4) {
            n(renderView);
            renderView.b();
            b((byte) 4);
        } else {
            if (b10 != 6 && b10 != 7) {
                C3348u9 c3348u10 = this.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u10.b("l1", "onUnloadCalled - invalid state - " + ((int) this.f26890b));
                    return;
                }
                return;
            }
            o(renderView);
        }
    }

    public final void e() throws JSONException {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "clearAdPods " + this);
        }
        if (this.f26907s) {
            f();
            this.f26896h.clear();
            this.f26903o = 0;
            this.f26904p = 0;
            this.f26906r.clear();
        }
    }

    public final void c(byte b10) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.d("l1", "STATE UPDATE: from " + ((int) this.f26890b) + " to " + ((int) b10));
        }
        this.f26890b = b10;
    }

    public final boolean c(int i10) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "getAllowAutoRedirectionForIndex " + this + " index - " + i10);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
        return adB != null && adB.getAllowAutoRedirection();
    }

    public final void b(InMobiAdRequestStatus requestStatus, boolean z10, short s10) {
        kotlin.jvm.internal.s.h(requestStatus, "requestStatus");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.b("l1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f26890b == 1 && z10) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.b("l1", "load failed - " + ((int) s10));
            }
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u11.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.a(this, requestStatus);
        } else {
            C3348u9 c3348u12 = this.f26897i;
            if (c3348u12 != null) {
                c3348u12.a();
            }
        }
        if (s10 != 0) {
            c(s10);
        }
    }

    public final void c(AbstractC2978g1 listener) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        kotlin.jvm.internal.s.h(listener, "listener");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onFetchSuccess " + this);
        }
        HashMap map = new HashMap();
        c(map);
        map.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j10 = this.f26914z.f27368h;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put(PAFNPq.VJqodlla, y());
        C3142ma c3142ma = this.f26910v;
        if (c3142ma != null) {
            map.put("retryCount", Integer.valueOf(c3142ma.f26991b));
        }
        AdSet adSetS = s();
        if (adSetS != null) {
            map.put("isRewarded", Boolean.valueOf(adSetS.getIsRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        c("ParseSuccess", map);
        AdMetaInfo adMetaInfoK = k();
        if (adMetaInfoK == null) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.b("l1", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        C3348u9 c3348u11 = this.f26897i;
        if (c3348u11 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u11.a("l1", "callback - onAdFetchSuccess");
        }
        listener.b(adMetaInfoK);
    }

    public final void e(int i10) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "resetCurrentRenderingIndex " + this);
        }
        this.f26904p = i10;
    }

    public static final void a(AbstractC3107l1 abstractC3107l1, W w10) {
        abstractC3107l1.getClass();
        if (w10 instanceof C3195ob) {
            C3262r1 c3262r1 = abstractC3107l1.f26914z;
            c3262r1.getClass();
            c3262r1.f27364d = SystemClock.elapsedRealtime();
            return;
        }
        if (w10 instanceof Qf) {
            C3262r1 c3262r2 = abstractC3107l1.f26914z;
            c3262r2.getClass();
            c3262r2.f27368h = SystemClock.elapsedRealtime();
        } else {
            if (w10 instanceof C2893cj) {
                Map map = ((C2893cj) w10).f26352a;
                Map mapM = gl.l0.m(fl.w.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3107l1.f26914z.f27364d)), fl.w.a("networkType", B5.g()), fl.w.a("plId", Long.valueOf(abstractC3107l1.f26900l.f27659a)));
                mapM.putAll(map);
                String str = abstractC3107l1.f26900l.f27664f;
                if (str != null) {
                    mapM.put("plType", str);
                }
                String str2 = abstractC3107l1.f26900l.f27663e;
                if (str2 != null) {
                    mapM.put("adType", str2);
                }
                abstractC3107l1.b("ServerFill", mapM);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static String e(short s10) {
        return "SDK_" + ((int) s10);
    }

    public static final Go e(AbstractC3107l1 abstractC3107l1) {
        com.inmobi.media.ads.network.common.model.Ad adB = abstractC3107l1.b(0);
        if (adB == null || abstractC3107l1.A()) {
            adB = null;
        }
        C3348u9 c3348u9 = abstractC3107l1.f26897i;
        kotlin.jvm.internal.s.g("l1", "TAG");
        return new Go(adB, c3348u9);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void g(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "RenderView completed loading ad content, for index " + this.f26896h.indexOf(renderView) + " " + this);
        }
    }

    public final void b(String podAdContext) {
        kotlin.jvm.internal.s.h(podAdContext, "podAdContext");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "setPodAdContext " + this);
        }
        if (this.f26907s) {
            this.f26908t = podAdContext;
        }
    }

    public final void d(AbstractC2978g1 listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "onLoadSuccess " + this);
        }
        AdMetaInfo adMetaInfoK = k();
        if (adMetaInfoK == null) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.b("l1", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        C3348u9 c3348u11 = this.f26897i;
        if (c3348u11 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u11.a("l1", "callback - onAdLoadSucceeded");
        }
        listener.c(adMetaInfoK);
    }

    public static final void b(AbstractC3107l1 abstractC3107l1) {
        if (6 == abstractC3107l1.f26890b) {
            abstractC3107l1.a((short) 2158);
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void b(HashMap rewards) {
        kotlin.jvm.internal.s.h(rewards, "rewards");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onAdRewardActionCompleted " + this);
        }
        if (this.f26899k || o() == null) {
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.a("l1", "Ad reward action completed. Params:" + rewards);
        }
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.b(rewards);
        }
    }

    public void d() throws JSONException {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "clear " + this);
        }
        if (this.f26899k) {
            return;
        }
        this.f26899k = true;
        Handler handler = this.f26898j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        C3142ma c3142ma = this.f26910v;
        if (c3142ma != null) {
            c3142ma.f26991b = 0;
        }
        J();
        c((byte) 0);
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.d("l1", "AdUnit " + this + " state - CREATED");
        }
        Fa fa2 = this.f26895g;
        String id2 = this.f26889a;
        fa2.getClass();
        kotlin.jvm.internal.s.h(id2, "id");
        try {
            List list = (List) fa2.f24767c.get(id2);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    em.z1.c0((em.z1) it.next(), null, 1, null);
                }
            }
            List list2 = (List) fa2.f24767c.remove(id2);
            if (list2 != null) {
                list2.clear();
            }
        } catch (Exception unused) {
        }
        this.f26901m = null;
        this.f26907s = false;
    }

    public final void b(short s10) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "submitAdLoadDroppedAtSDK " + this);
        }
        HashMap map = new HashMap();
        map.put("errorCode", Short.valueOf(s10));
        c(map);
        c("AdLoadDroppedAtSDK", map);
    }

    public final void b(Map map) {
        MetaInfo metaInfo;
        String creativeType;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f26914z.f27364d));
        map.put("networkType", B5.g());
        map.put("plId", Long.valueOf(this.f26900l.f27659a));
        AdSet adSetS = s();
        map.put("isRewarded", Boolean.valueOf(adSetS != null ? adSetS.getIsRewarded() : false));
        String str = this.f26900l.f27663e;
        if (str != null) {
            map.put("adType", str);
        }
        String str2 = this.f26900l.f27664f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        C3142ma c3142ma = this.f26910v;
        if (c3142ma != null) {
            map.put("retryCount", Integer.valueOf(c3142ma.f26991b));
        }
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP != null && (metaInfo = adP.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put(NhHRaDJCHtCTJR.mcAxhUOhD, creativeType);
        }
        a(p(), map);
        b("ServerError", map);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void c() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onAdScreenDisplayFailed " + this);
        }
        if (this.f26899k || o() == null) {
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.b("l1", "Ad failed to display");
        }
        Handler handler = this.f26898j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yh.m9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3107l1.b(this.f57839a);
                }
            });
        }
    }

    public final void a(Context context, C3365v0 adPlacement, Uk uk2) {
        C3365v0 c3365v0;
        String str;
        String str2;
        C3348u9 c3348u9;
        C3348u9 c3348u10;
        C3348u9 c3348u11;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(adPlacement, "adPlacement");
        kotlin.jvm.internal.s.g("l1", "TAG");
        toString();
        a(context);
        this.f26894f = new WeakReference(uk2);
        Ib ib2 = Sh.f25698a;
        Sh.a(uk2, this.f26897i);
        WeakReference weakReference = this.f26894f;
        String strM = m();
        AdSet adSetS = s();
        this.f26909u = new C2848b0(weakReference, strM, adSetS != null ? adSetS.getIsRewarded() : false);
        this.f26900l = adPlacement;
        B();
        C3348u9 c3348u12 = this.f26897i;
        if (c3348u12 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u12.c("l1", "initInternetAvailabilityAdRetry");
        }
        if (this.f26891c == null && (c3348u11 = this.f26897i) != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u11.c("l1", "adConfig is null");
            fl.g0 g0Var = fl.g0.f38750a;
        }
        if (this.f26900l.f27664f == null && (c3348u10 = this.f26897i) != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.c("l1", "placement.placementType is null");
            fl.g0 g0Var2 = fl.g0.f38750a;
        }
        if (this.f26900l.f27663e == null && (c3348u9 = this.f26897i) != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "placement.adType is null");
            fl.g0 g0Var3 = fl.g0.f38750a;
        }
        AdConfig adConfig = this.f26891c;
        if (adConfig != null && (str = (c3365v0 = this.f26900l).f27664f) != null && (str2 = c3365v0.f27663e) != null) {
            C3377vc c3377vcA = AbstractC3351uc.a(adConfig.getTimeouts().X(), str, str2, Yi.f26090b);
            this.f26910v = new C3142ma(c3377vcA);
            this.f26911w = c3377vcA;
        }
        if (N5.f25320h != null) {
            kotlin.jvm.internal.s.g("N5", "TAG");
        } else {
            N5.f25320h = Float.valueOf(new TextView(context).getTextSize());
            kotlin.jvm.internal.s.g("N5", "TAG");
        }
        M();
    }

    public final void c(HashMap map) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "constructTelemetryPayload " + this);
        }
        map.put(dOIDCKnIR.qAaDubeBFB, m());
        map.put("networkType", B5.g());
        map.put("plId", Long.valueOf(this.f26900l.f27659a));
        String str = this.f26900l.f27664f;
        if (str != null) {
            map.put("plType", str);
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void d(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        if (this.C) {
            return;
        }
        this.C = true;
        C3485zi c3485zi = renderView.f27224e0;
        if (c3485zi != null) {
            Map mapA = c3485zi.a();
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("AttachedToWindow", mapA, EnumC3281rk.SDK);
        }
    }

    public final void c(short s10) {
        long j10;
        long jElapsedRealtime;
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "submitAdLoadFailedEvent " + this);
        }
        HashMap map = new HashMap();
        if (s10 == 2138 || s10 == 2109) {
            j10 = this.f26914z.f27365e;
            em.o0 o0Var = AbstractC3488zl.f28033a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s10 == 2139) {
            j10 = this.f26914z.f27367g;
            em.o0 o0Var2 = AbstractC3488zl.f28033a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = this.f26914z.f27363c;
            em.o0 o0Var3 = AbstractC3488zl.f28033a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        map.put("latency", Long.valueOf(jElapsedRealtime - j10));
        map.put("errorCode", Short.valueOf(s10));
        map.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3142ma c3142ma = this.f26910v;
        if (c3142ma != null) {
            map.put("retryCount", Integer.valueOf(c3142ma.f26991b));
        }
        AdSet adSetS = s();
        if (adSetS != null) {
            map.put("isRewarded", Boolean.valueOf(adSetS.getIsRewarded()));
        }
        if (y().length() > 0) {
            map.put("metadataBlob", y());
        }
        c(map);
        a(p(), map);
        c(geAgcEazw.gwqOUTn, map);
    }

    public final void d(short s10) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "submitAdShowFailed " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f26914z.f27366f;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("errorCode", Short.valueOf(s10));
        map.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad adQ = q();
        if (adQ == null || (impressionId = adQ.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adQ2 = q();
        if (adQ2 != null && (metaInfo = adQ2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetS = s();
        if (adSetS != null) {
            map.put("isRewarded", Boolean.valueOf(adSetS.getIsRewarded()));
        }
        if (y().length() > 0) {
            map.put("metadataBlob", y());
        }
        c(map);
        a(q(), map);
        c("AdShowFailed", map);
    }

    public final void b(String str, Map map) {
        com.inmobi.media.ads.network.common.model.Ad adP;
        MetaInfo metaInfo;
        String creativeType;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onTelemetryEvent " + this + " adState=" + ((int) this.f26890b));
        }
        if (this.f26890b != 3) {
            a(str, map);
            if ((kotlin.jvm.internal.s.c(str, "ServerFill") || kotlin.jvm.internal.s.c(str, "ServerError")) && (adP = p()) != null && (metaInfo = adP.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "updateAd " + this);
        }
        AdSet adSetS = s();
        if (adSetS == null || (ads = adSetS.getAds()) == null) {
            return;
        }
        ads.set(0, ad2);
    }

    public final void b(byte b10) {
        Fk fk2;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "cancelTimer " + this);
        }
        if (b10 == 1 && (fk2 = this.f26902n) != null) {
            fk2.a((byte) 2);
        }
        Fk fk3 = this.f26902n;
        if (fk3 != null) {
            fk3.a(b10);
        }
    }

    public final void b(int i10, boolean z10) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "fireAdPodShowResult " + this);
        }
        CopyOnWriteArrayList list = this.f26896h;
        kotlin.jvm.internal.s.h(list, "list");
        if (i10 < 0 || i10 >= list.size() || (gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(i10)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3228pi.b(z10);
    }

    public final void a(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "setContext " + this);
        }
        this.f26892d = new WeakReference(context);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    public final C3184o0 a(int i10) {
        String markupType;
        String openMode;
        InlineParams inlineParams;
        String creativeId;
        MetaInfo metaInfo;
        String creativeType;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        AdConfig.ViewabilityConfig viewability;
        AdConfig.OmidConfig omidConfig;
        MetaInfo metaInfo2;
        com.inmobi.media.ads.network.common.model.Ad ad2 = b(i10);
        if (ad2 == null || (markupType = ad2.getMarkupType()) == null) {
            markupType = "html";
        }
        String str = markupType;
        boolean zC = kotlin.jvm.internal.s.c(this.f26900l.f27663e, "banner");
        String str2 = MimeTypes.BASE_TYPE_AUDIO;
        String str3 = (zC || kotlin.jvm.internal.s.c(this.f26900l.f27663e, MimeTypes.BASE_TYPE_AUDIO)) ? this.f26900l.f27666h : null;
        String str4 = this.f26900l.f27663e;
        boolean zA = a(ad2);
        long j10 = this.f26900l.f27659a;
        boolean zC2 = c(i10);
        String str5 = this.f26900l.f27669k;
        String creativeType2 = (ad2 == null || (metaInfo2 = ad2.getMetaInfo()) == null) ? null : metaInfo2.getCreativeType();
        AdMetaInfo adMetaInfoK = k();
        String creativeID = adMetaInfoK != null ? adMetaInfoK.getCreativeID() : null;
        boolean z10 = this.f26900l.f27668j;
        String str6 = creativeType2;
        LinkedHashMap linkedHashMap = this.f26913y;
        WatermarkData watermarkData = this.A;
        AdQualityControl adQualityControl = ad2 != null ? ad2.getAdQualityControl() : null;
        byte bU = u();
        kotlin.jvm.internal.s.e(ad2);
        AdConfig adConfig = this.f26891c;
        kotlin.jvm.internal.s.h(ad2, "ad");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MetaInfo metaInfo3 = ad2.getMetaInfo();
        if (kotlin.jvm.internal.s.c((adConfig == null || (viewability = adConfig.getViewability()) == null || (omidConfig = viewability.getOmidConfig()) == null) ? null : Boolean.valueOf(omidConfig.isOmidEnabled()), Boolean.TRUE)) {
            if ((metaInfo3 != null ? metaInfo3.getOmsdkInfo() : null) != null) {
                OmSdkInfo omsdkInfo = metaInfo3.getOmsdkInfo();
                if (omsdkInfo.getOmidEnabled()) {
                    Nk nk2 = new Nk((byte) 3);
                    boolean isolateVerificationScripts = omsdkInfo.getIsolateVerificationScripts();
                    String customReferenceData = omsdkInfo.getCustomReferenceData();
                    HashMap<String, String> obj = omsdkInfo.getMacros();
                    kotlin.jvm.internal.s.h(obj, "obj");
                    JSONObject jSONObjectA = AbstractC3323ta.a(obj, obj.getClass());
                    byte impressionType = omsdkInfo.getImpressionType();
                    String creativeType3 = metaInfo3.getCreativeType();
                    int iHashCode = creativeType3.hashCode();
                    if (iHashCode != 93166550) {
                        if (iHashCode == 112202875) {
                            str2 = MimeTypes.BASE_TYPE_VIDEO;
                            if (!creativeType3.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                                str2 = "unknown";
                            }
                        } else if (iHashCode != 1425678798) {
                            str2 = "unknown";
                        } else {
                            str2 = "nonvideo";
                            if (!creativeType3.equals("nonvideo")) {
                                str2 = "unknown";
                            }
                        }
                    } else if (!creativeType3.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                        str2 = "unknown";
                    }
                    HashMap map = new HashMap();
                    if (jSONObjectA != null) {
                        for (Iterator<String> itKeys = jSONObjectA.keys(); itKeys.hasNext(); itKeys = itKeys) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectA.optString(next));
                        }
                    }
                    HashMap mapJ = gl.l0.j(fl.w.a("creativeType", str2), fl.w.a("customReferenceData", customReferenceData), fl.w.a("impressionType", Byte.valueOf(impressionType)), fl.w.a("macros", map), fl.w.a("isolateVerificationScripts", Boolean.valueOf(isolateVerificationScripts)));
                    if (mapJ == null) {
                        mapJ = null;
                    }
                    if (mapJ == null) {
                        mapJ = new HashMap();
                    }
                    nk2.f25365b = mapJ;
                    linkedHashSet.add(nk2);
                }
            }
        }
        for (Viewability viewability2 : ad2.getViewability()) {
            if (viewability2.getInmobi() != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int iA = Ok.a(viewability2.getInmobi().getTime());
                if (iA != -1) {
                    linkedHashMap2.put("time", Integer.valueOf(iA));
                }
                int iA2 = Ok.a(viewability2.getInmobi().getView());
                if (iA2 != -1) {
                    linkedHashMap2.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, Integer.valueOf(iA2));
                }
                int iA3 = Ok.a(viewability2.getInmobi().getPixel());
                if (iA3 != -1) {
                    linkedHashMap2.put("pixel", Integer.valueOf(iA3));
                }
                byte type = viewability2.getInmobi().getType();
                linkedHashMap2.put("type", Integer.valueOf(type));
                if (type == 2) {
                    if (viewability2.getInmobi().getFrame().length == 4) {
                        linkedHashMap2.put("frame", viewability2.getInmobi().getFrame());
                    } else {
                        linkedHashMap2.put("frame", new JSONArray("[0,0,0,0]"));
                    }
                }
                Nk nk3 = new Nk((byte) 2);
                nk3.f25365b = linkedHashMap2;
                linkedHashSet.add(nk3);
                break;
            }
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
        String impressionId = adB != null ? adB.getImpressionId() : null;
        MetaInfo metaInfo4 = ad2.getMetaInfo();
        if (metaInfo4 == null || (landingPageParams2 = metaInfo4.getLandingPageParams()) == null || (landingPageParam2 = (LandingPageParam) gl.r.e0(landingPageParams2, 0)) == null || (openMode = landingPageParam2.getOpenMode()) == null) {
            openMode = "DEFAULT";
        }
        String str7 = openMode;
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
        C3460yi c3460yi = new C3460yi(((TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class)).getMaxTemplateEvents());
        MetaInfo metaInfo5 = ad2.getMetaInfo();
        if (metaInfo5 == null || (landingPageParams = metaInfo5.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) gl.r.e0(landingPageParams, 0)) == null || (inlineParams = landingPageParam.getAParams()) == null) {
            inlineParams = new InlineParams(null, null, null, false, null, null, false, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null);
        }
        inlineParams.setTargetBundleId(ad2.getBidBundle());
        inlineParams.setCallerBundleId(A1.f24429a);
        inlineParams.setPingInWebView(this.f26891c.getInlineInstaller().getShouldPingInWebView());
        C3365v0 c3365v0 = this.f26900l;
        String strT = t();
        String impressionId2 = ad2.getImpressionId();
        String str8 = impressionId2 == null ? "" : impressionId2;
        String telemetryMetadataBlob = ad2.getTelemetryMetadataBlob();
        String str9 = telemetryMetadataBlob == null ? "" : telemetryMetadataBlob;
        C3142ma c3142ma = this.f26910v;
        int i11 = c3142ma != null ? c3142ma.f26991b : 0;
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        String str10 = (adP == null || (metaInfo = adP.getMetaInfo()) == null || (creativeType = metaInfo.getCreativeType()) == null) ? "" : creativeType;
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        String str11 = (adP2 == null || (creativeId = adP2.getCreativeId()) == null) ? "" : creativeId;
        AdSet adSetS = s();
        return new C3184o0(str4, zA, j10, zC2, creativeID, str6, str, str3, this, str5, linkedHashMap, Boolean.valueOf(z10), watermarkData, adQualityControl, bU, linkedHashSet, impressionId, str7, new C3331ti(c3365v0, strT, str8, str9, i11, str10, str11, adSetS != null ? adSetS.getIsRewarded() : false, i10, this.f26914z.f27370j, c3460yi, "default", inlineParams), this.f26897i);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void b(GestureDetectorOnGestureListenerC3228pi renderView) {
        MetaInfo metaInfo;
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "fireClickTracker " + this);
        }
        kotlin.jvm.internal.s.h(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f26896h.indexOf(renderView));
        if (kotlin.jvm.internal.s.c((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), MimeTypes.BASE_TYPE_VIDEO) || adB == null) {
            return;
        }
        for (String url : Li.a(adB, CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
            A3 a10 = A3.f24440a;
            C3348u9 c3348u10 = this.f26897i;
            kotlin.jvm.internal.s.h(url, "url");
            A3.a(url, true, c3348u10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    public final boolean d(byte b10) {
        int iY;
        Integer num;
        long j10;
        Integer num2;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", UHbHibBvYxKnPE.QrfNz + this);
        }
        if (b10 == 0) {
            C3377vc c3377vc = this.f26911w;
            if (c3377vc == null || (num2 = c3377vc.f27715d) == null) {
                j10 = MBInterstitialActivity.WEB_LOAD_TIME;
            } else {
                iY = num2.intValue();
                j10 = iY;
            }
        } else if (b10 == 1) {
            C3377vc c3377vc2 = this.f26911w;
            if (c3377vc2 != null) {
                iY = c3377vc2.f27714c;
                j10 = iY;
            } else {
                j10 = MBInterstitialActivity.WEB_LOAD_TIME;
            }
        } else {
            if (b10 == 2) {
                C3377vc c3377vc3 = this.f26911w;
                if (c3377vc3 == null || (num = c3377vc3.f27716e) == null) {
                    j10 = MBInterstitialActivity.WEB_LOAD_TIME;
                } else {
                    iY = num.intValue();
                }
            } else if (b10 == 4) {
                TimeoutConfigurations timeoutConfigurations = this.f26893e;
                kotlin.jvm.internal.s.e(timeoutConfigurations);
                iY = timeoutConfigurations.Y();
            } else {
                C3348u9 c3348u10 = this.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u10.b("l1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j10 = iY;
        }
        Fk fk2 = this.f26902n;
        return fk2 != null && fk2.a(b10, j10);
    }

    public final void b(GestureDetectorOnGestureListenerC3228pi renderView, String errorCode) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        int iIndexOf = this.f26896h.indexOf(renderView);
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.b("l1", "fireLoadAdTokenUrlFailed : " + iIndexOf + " " + this + " errorCode: " + errorCode);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            List<String> listA = Li.a(adB, "load_ad_token_url_failure");
            boolean zContains = this.f26891c.getDisableAppendingKeysForBeacons().contains("load_ad_token_url_failure");
            for (String url : listA) {
                if (!zContains) {
                    Uri uri = Uri.parse(url);
                    kotlin.jvm.internal.s.g(uri, "Uri.parse(this)");
                    url = uri.buildUpon().appendQueryParameter("error", errorCode).build().toString();
                    kotlin.jvm.internal.s.g(url, "toString(...)");
                }
                A3 a10 = A3.f24440a;
                C3348u9 c3348u10 = this.f26897i;
                kotlin.jvm.internal.s.h(url, "url");
                A3.a(url, true, c3348u10);
            }
        }
    }

    public final void c(String eventType, Map kv) {
        kotlin.jvm.internal.s.h(eventType, "eventType");
        kotlin.jvm.internal.s.h(kv, "kv");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "submitTelemetryEvent " + this);
        }
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b(eventType, kv, EnumC3281rk.SDK);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void c(GestureDetectorOnGestureListenerC3228pi renderView) {
        MetaInfo metaInfo;
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "fireImpressionTracker " + this);
        }
        kotlin.jvm.internal.s.h(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f26896h.indexOf(renderView));
        if (kotlin.jvm.internal.s.c((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), MimeTypes.BASE_TYPE_VIDEO) || adB == null) {
            return;
        }
        for (String url : Li.a(adB, "impression")) {
            C3437xk telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            kotlin.jvm.internal.s.h("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f27876f = "adResponseTracker";
            A3 a10 = A3.f24440a;
            C2822a0 c2822a0 = new C2822a0(this.f26909u, telemetryOnAdImpression);
            C3348u9 c3348u10 = this.f26897i;
            kotlin.jvm.internal.s.h(url, "url");
            Mg.a(Jg.HIGHEST, new C3290s3(url, c3348u10, c2822a0, null));
        }
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        Short sh2;
        fl.q qVar;
        O0 features;
        boolean enableImmersive = this.f26891c.getRendering().getEnableImmersive();
        boolean z10 = N5.f25321i;
        boolean zA = (ad2 == null || (features = ad2.getFeatures()) == null) ? false : features.a(false);
        boolean z11 = enableImmersive && z10 && zA;
        if (!z11) {
            StringBuilder sb2 = new StringBuilder("Immersive not supported on");
            BitSet bitSet = new BitSet(3);
            ArrayList arrayList = new ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z10) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!zA) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb2.append(gl.r.l0(arrayList, ",", null, null, 0, null, null, 62, null));
            kotlin.jvm.internal.s.h(bitSet, "bitSet");
            if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
                sh2 = (short) 2202;
            } else if (bitSet.get(0) && bitSet.get(1)) {
                sh2 = (short) 2200;
            } else if (bitSet.get(0) && bitSet.get(2)) {
                sh2 = (short) 2199;
            } else if (bitSet.get(1) && bitSet.get(2)) {
                sh2 = (short) 2201;
            } else if (bitSet.get(0)) {
                sh2 = (short) 2196;
            } else if (bitSet.get(1)) {
                sh2 = (short) 2197;
            } else {
                sh2 = bitSet.get(2) ? (short) 2198 : null;
            }
            short sShortValue = sh2 != null ? sh2.shortValue() : (short) -1;
            if (sShortValue == -1) {
                qVar = new fl.q("Invalid Reason", (short) -1);
            } else {
                qVar = new fl.q(sb2.toString(), Short.valueOf(sShortValue));
            }
            String str = (String) qVar.d();
            short sShortValue2 = ((Number) qVar.g()).shortValue();
            HashMap map = new HashMap();
            map.put("reason", str);
            map.put("errorCode", Short.valueOf(sShortValue2));
            c("ImmersiveNotSupported", map);
        }
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "Immersive support - config, device, adResponse - (" + enableImmersive + " " + z10 + " " + zA + ")");
        }
        return z11;
    }

    public final void a(AbstractC2978g1 listener) {
        kotlin.jvm.internal.s.h(listener, "listener");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onAdDisplayed " + this);
        }
        AdMetaInfo adMetaInfoK = k();
        if (adMetaInfoK == null) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.b("l1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(listener);
            return;
        }
        C3348u9 c3348u11 = this.f26897i;
        if (c3348u11 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u11.a("l1", "callback - onAdDisplayed");
        }
        listener.a(adMetaInfoK);
    }

    public final void a(AdResponse adResponse) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        kotlin.jvm.internal.s.h(adResponse, "adResponse");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "handleAdFetchSuccessful " + this);
        }
        if (!this.f26899k && o() != null) {
            if (this.f26890b == 1) {
                this.f26901m = adResponse;
                AdSet adSetS = s();
                this.f26907s = adSetS != null ? adSetS.getIsPod() : false;
                this.f26896h = new CopyOnWriteArrayList();
                AdSet adSetS2 = s();
                if (adSetS2 != null && (ads = adSetS2.getAds()) != null) {
                    for (com.inmobi.media.ads.network.common.model.Ad ad2 : ads) {
                        this.f26896h.add(null);
                    }
                }
                G();
                return;
            }
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.b("l1", "incorrect state - " + ((int) this.f26890b));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        c((short) 2185);
        C3348u9 c3348u11 = this.f26897i;
        if (c3348u11 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u11.b("l1", "adUnit is destroyed");
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "handleMarkupFetchFailure " + this);
        }
        try {
            if (this.f26890b == 1) {
                C3348u9 c3348u10 = this.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u10.b("l1", "Failed to fetch ad for placement id: " + this.f26900l + ", reason - " + inMobiAdRequestStatus.getMessage());
                }
                String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getMessage();
                C3348u9 c3348u11 = this.f26897i;
                if (c3348u11 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u11.b("l1", str);
                }
                C3348u9 c3348u12 = this.f26897i;
                if (c3348u12 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u12.d("l1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s10 != 0) {
                    b(s10);
                }
                AbstractC2978g1 abstractC2978g1N = n();
                if (abstractC2978g1N != null) {
                    abstractC2978g1N.a(inMobiAdRequestStatus);
                    return;
                }
                C3348u9 c3348u13 = this.f26897i;
                if (c3348u13 != null) {
                    c3348u13.a();
                }
            }
        } catch (Exception e10) {
            C3348u9 c3348u14 = this.f26897i;
            if (c3348u14 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u14.a("l1", "onAdFetchFailed with error: ", e10);
            }
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    public final void a(short s10) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.b("l1", "handleAdShowFailure " + this + " errorCode - " + ((int) s10));
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.b();
        }
        if (s10 != 0) {
            d(s10);
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, boolean z10, short s10) {
        kotlin.jvm.internal.s.h(requestStatus, "requestStatus");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.b("l1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f26890b == 3 && z10) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.a(this, requestStatus);
        }
        if (s10 != 0) {
            b(s10);
        }
    }

    public final void a(Map map) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.f26900l.f27661c = map;
    }

    public static final fl.g0 a(AbstractC3107l1 abstractC3107l1) {
        C3262r1 c3262r1 = abstractC3107l1.f26914z;
        c3262r1.getClass();
        c3262r1.f27365e = SystemClock.elapsedRealtime();
        abstractC3107l1.g();
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public static final fl.g0 a(AbstractC3107l1 abstractC3107l1, EnumC2931e6 errorCode) {
        short s10;
        kotlin.jvm.internal.s.h(errorCode, Saucuwx.dqfBN);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        int iOrdinal = errorCode.ordinal();
        if (iOrdinal == 0) {
            s10 = 2100;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s10 = 2101;
                    break;
                case 13:
                    s10 = 2102;
                    break;
                case 14:
                    s10 = 2103;
                    break;
                case 15:
                    s10 = 2104;
                    break;
                case 16:
                    s10 = 2105;
                    break;
                default:
                    s10 = 2100;
                    break;
            }
        } else {
            s10 = 2228;
        }
        abstractC3107l1.a(inMobiAdRequestStatus, true, s10);
        return fl.g0.f38750a;
    }

    public final void a(final tl.a onSuccess, final Function1 onMaxRetryReached) {
        kotlin.jvm.internal.s.h(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.h(onMaxRetryReached, "onMaxRetryReached");
        C3348u9 c3348u9 = this.f26897i;
        Object c2886cc = null;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            C3142ma c3142ma = this.f26910v;
            c3348u9.c("l1", "loadWithRetry " + (c3142ma != null ? Integer.valueOf(c3142ma.f26991b) : null));
        }
        C3142ma c3142ma2 = this.f26910v;
        if (c3142ma2 != null) {
            EnumC2931e6 enumC2931e6A = Ze.a();
            if (enumC2931e6A == null) {
                c2886cc = Pf.f25493a;
            } else {
                int i10 = c3142ma2.f26991b + 1;
                c3142ma2.f26991b = i10;
                if (i10 >= c3142ma2.f26990a.f27713b) {
                    c2886cc = new C2886cc(enumC2931e6A);
                } else {
                    c2886cc = C3382vh.f27727a;
                }
            }
        }
        if (c2886cc instanceof C2886cc) {
            onMaxRetryReached.invoke(((C2886cc) c2886cc).f26325a);
            return;
        }
        if (c2886cc instanceof Pf) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.c("l1", "load with retry success");
            }
            onSuccess.invoke();
            return;
        }
        if (!(c2886cc instanceof C3382vh)) {
            if (c2886cc == null) {
                C3348u9 c3348u11 = this.f26897i;
                if (c3348u11 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u11.c("l1", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.invoke();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        C3348u9 c3348u12 = this.f26897i;
        if (c3348u12 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u12.c("l1", "load failed, retrying");
        }
        Handler handler = this.f26912x;
        Runnable runnable = new Runnable() { // from class: yh.p9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3107l1.a(this.f57880a, onSuccess, onMaxRetryReached);
            }
        };
        C3377vc c3377vc = this.f26911w;
        handler.postDelayed(runnable, c3377vc != null ? c3377vc.f27712a : 1000L);
    }

    public static final void a(AbstractC3107l1 abstractC3107l1, tl.a aVar, Function1 function1) {
        C3348u9 c3348u9 = abstractC3107l1.f26897i;
        if (c3348u9 != null) {
            String TAG = PAFNPq.gkvwQ;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            C3142ma c3142ma = abstractC3107l1.f26910v;
            c3348u9.c(TAG, "Loading from retry Handler " + (c3142ma != null ? Integer.valueOf(c3142ma.f26991b) : null));
        }
        abstractC3107l1.a(aVar, function1);
    }

    public void a(byte[] bArr) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "load response " + this);
        }
        C3262r1 c3262r1 = this.f26914z;
        c3262r1.getClass();
        c3262r1.f27363c = SystemClock.elapsedRealtime();
        if (C()) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.a("l1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            c((byte) 1);
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u11.d("l1", "AdUnit " + this + " state - LOADING");
            }
            this.f26895g.a(this.f26889a, new C3055j1(bArr, this, null));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        C3348u9 c3348u12 = this.f26897i;
        if (c3348u12 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u12.a("l1", Saucuwx.BtVwXLFC);
        }
    }

    public static final void a(AbstractC3107l1 abstractC3107l1, Y y10) {
        kotlin.jvm.internal.s.g("l1", "TAG");
        Objects.toString(y10);
        V v10 = y10.f26048b;
        if (v10 instanceof C2919dj) {
            abstractC3107l1.getClass();
            Map mapM = gl.l0.m(fl.w.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3107l1.f26914z.f27364d)), fl.w.a("networkType", B5.g()), fl.w.a("plId", Long.valueOf(abstractC3107l1.f26900l.f27659a)));
            String str = abstractC3107l1.f26900l.f27664f;
            if (str != null) {
                mapM.put("plType", str);
            }
            String str2 = abstractC3107l1.f26900l.f27663e;
            if (str2 != null) {
                mapM.put("adType", str2);
            }
            abstractC3107l1.b("ServerNoFill", mapM);
            abstractC3107l1.b(y10.f26047a, (short) 0);
            return;
        }
        if (v10 instanceof N6) {
            abstractC3107l1.b(y10.f26047a, ((N6) v10).f25322a);
            return;
        }
        if (v10 instanceof O6) {
            abstractC3107l1.b(gl.l0.m(fl.w.a("errorCode", Integer.valueOf(((O6) v10).f25401a))));
            abstractC3107l1.b(y10.f26047a, (short) 2205);
        } else {
            if (v10 instanceof C2867bj) {
                abstractC3107l1.b(((C2867bj) v10).f26270a);
                abstractC3107l1.b(y10.f26047a, (short) 0);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void a(AbstractC3107l1 abstractC3107l1, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        abstractC3107l1.m(gestureDetectorOnGestureListenerC3228pi);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(final GestureDetectorOnGestureListenerC3228pi renderView, final String errorCode) {
        Handler handler;
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "onRenderViewSignaledAdFailed " + this);
        }
        if (this.f26899k || o() == null || (handler = this.f26898j) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: yh.n9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3107l1.a(this.f57853a, renderView, errorCode);
            }
        });
    }

    public static final void a(AbstractC3107l1 abstractC3107l1, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, String str) {
        abstractC3107l1.a(gestureDetectorOnGestureListenerC3228pi, (short) 2137, str);
    }

    public void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, short s10, String failureErrorCode) {
        kotlin.jvm.internal.s.h(failureErrorCode, "failureErrorCode");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.b("l1", "Render view signaled ad failed, for index " + this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi) + " " + this);
        }
        if (gestureDetectorOnGestureListenerC3228pi == null || !kotlin.jvm.internal.s.c(gestureDetectorOnGestureListenerC3228pi.getMarkupType(), "htmlUrl")) {
            return;
        }
        b(gestureDetectorOnGestureListenerC3228pi, failureErrorCode);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(HashMap params) {
        kotlin.jvm.internal.s.h(params, "params");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onAdInteraction " + this);
        }
        if (this.f26899k || o() == null) {
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.a("l1", "Ad interaction. Params: " + params);
        }
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(final C3437xk telemetryOnAdImpression) {
        C3462yk c3462yk;
        AtomicBoolean atomicBoolean;
        kotlin.jvm.internal.s.h(telemetryOnAdImpression, "telemetryOnAdImpression");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onImpressionFiredFromTemplate " + this);
        }
        telemetryOnAdImpression.getClass();
        kotlin.jvm.internal.s.h("imraid_impressionFired", "<set-?>");
        telemetryOnAdImpression.f27876f = "imraid_impressionFired";
        if (!this.f26899k && o() != null) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.a("l1", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.o9
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3107l1.a(this.f57867a, telemetryOnAdImpression);
                    }
                });
                return;
            }
            return;
        }
        C3262r1 c3262r1 = telemetryOnAdImpression.f27871a;
        if (c3262r1 == null || (c3462yk = c3262r1.f27362b) == null || (atomicBoolean = c3462yk.f27960a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = telemetryOnAdImpression.a();
            linkedHashMapA.put("networkType", B5.g());
            linkedHashMapA.put("errorCode", (short) 2180);
            String str = telemetryOnAdImpression.f27874d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("AdImpressionSuccessful", linkedHashMapA, EnumC3281rk.SDK);
        }
    }

    public static final void a(AbstractC3107l1 abstractC3107l1, C3437xk c3437xk) {
        abstractC3107l1.f26909u.a(c3437xk);
    }

    @Override // com.inmobi.media.AbstractC3279ri, com.inmobi.media.InterfaceC3282rl
    public final void a() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onUserLeaveApplication " + this);
        }
        if (this.f26899k || o() == null) {
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u10.a("l1", "User left application");
        }
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.e();
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2, Map map) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "updateIdsInTelemetryPayload " + this);
        }
        if (ad2 != null) {
            map.put("creativeId", ad2.getCreativeId());
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(String eventType, HashMap kv) {
        kotlin.jvm.internal.s.h(eventType, "eventType");
        kotlin.jvm.internal.s.h(kv, "kv");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "onRenderViewRequestedAction " + this);
        }
        c(eventType, kv);
    }

    public final void a(String str, Map map) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals(QGbBllacZSmHKn.uMyReneOTla)) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        C3142ma c3142ma = this.f26910v;
        if (c3142ma != null) {
            map.put("retryCount", Integer.valueOf(c3142ma.f26991b));
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, LinkedHashSet linkedHashSet) {
        AdConfig.ViewabilityConfig viewability;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "omidSessionForHtmlMarkup " + this);
        }
        AdConfig adConfig = this.f26891c;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            Jf.f25068a.getClass();
            if (Omid.isActive()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    Nk nk2 = (Nk) it.next();
                    if (3 == nk2.f25364a) {
                        try {
                            kotlin.jvm.internal.s.h("creativeType", "key");
                            kotlin.jvm.internal.s.h(String.class, "classType");
                            Object obj = nk2.f25365b.get("creativeType");
                            String str = (String) (String.class.isInstance(obj) ? String.class.cast(obj) : null);
                            kotlin.jvm.internal.s.h("customReferenceData", "key");
                            kotlin.jvm.internal.s.h(String.class, "classType");
                            Object obj2 = nk2.f25365b.get("customReferenceData");
                            String str2 = (String) (String.class.isInstance(obj2) ? String.class.cast(obj2) : null);
                            kotlin.jvm.internal.s.h("isolateVerificationScripts", "key");
                            kotlin.jvm.internal.s.h(Boolean.class, "classType");
                            Object obj3 = nk2.f25365b.get("isolateVerificationScripts");
                            Boolean bool = (Boolean) (Boolean.class.isInstance(obj3) ? Boolean.class.cast(obj3) : null);
                            kotlin.jvm.internal.s.h("impressionType", "key");
                            kotlin.jvm.internal.s.h(Byte.class, "classType");
                            Object obj4 = nk2.f25365b.get("impressionType");
                            Byte b10 = (Byte) (Byte.class.isInstance(obj4) ? Byte.class.cast(obj4) : null);
                            C3276rf c3276rfA = (str == null || bool == null || b10 == null) ? null : Cf.a(str, gestureDetectorOnGestureListenerC3228pi, bool.booleanValue(), this.f26900l.f27669k, b10.byteValue(), str2);
                            if (c3276rfA != null) {
                                nk2.f25365b.put("omidAdSession", c3276rfA);
                                nk2.f25365b.put("deferred", Boolean.TRUE);
                                C3348u9 c3348u10 = this.f26897i;
                                if (c3348u10 != null) {
                                    kotlin.jvm.internal.s.g("l1", "TAG");
                                    c3348u10.a("l1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                C3348u9 c3348u11 = this.f26897i;
                                if (c3348u11 != null) {
                                    kotlin.jvm.internal.s.g("l1", "TAG");
                                    c3348u11.a("l1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e10) {
                            C3348u9 c3348u12 = this.f26897i;
                            if (c3348u12 != null) {
                                kotlin.jvm.internal.s.g("l1", "TAG");
                                c3348u12.b("l1", "Setting up impression tracking for IAB encountered an unexpected error: " + e10.getMessage());
                            }
                            fl.k kVar = W9.f25935a;
                            AbstractC3219p9.a(e10);
                        }
                    }
                }
            }
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2, String str) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "updateAdForBlob " + this);
        }
        ad2.setWebVast(str);
        b(ad2);
    }

    public final void a(String blob, String str) {
        kotlin.jvm.internal.s.h(blob, "blob");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "saveBlob " + this);
        }
        this.f26895g.a(this.f26889a, new C3081k1(this, str, blob, null));
    }

    public final void a(String jsCallbackNamespace, String callback, G2 receiver, String str) {
        kotlin.jvm.internal.s.h(jsCallbackNamespace, "jsCallbackNamespace");
        kotlin.jvm.internal.s.h(callback, "callback");
        kotlin.jvm.internal.s.h(receiver, "receiver");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "getBlob " + this);
        }
        this.f26895g.a(this.f26889a, new C3030i1(this, str, receiver, jsCallbackNamespace, callback, null));
    }

    public void a(int i10, GestureDetectorOnGestureListenerC3228pi renderView, Context context) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "Show pod ad with index : " + i10 + " from creative: " + this.f26896h.indexOf(renderView) + " " + this);
        }
        if (i10 >= 0) {
            this.f26904p = i10;
        } else {
            this.f26904p++;
        }
    }

    @Override // com.inmobi.media.InterfaceC3391w0
    public void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, Activity activity) {
        kotlin.jvm.internal.s.h(gestureDetectorOnGestureListenerC3228pi, Lykgign.yeBkgGPlQjLc);
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.c("l1", "closeCurrentPodAd " + this);
        }
    }

    @Override // com.inmobi.media.InterfaceC3391w0
    public boolean a(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 == null) {
            return false;
        }
        kotlin.jvm.internal.s.g("l1", "TAG");
        c3348u9.c("l1", "hasNextAdInAdPod " + this);
        return false;
    }

    @Override // com.inmobi.media.Dk
    public void a(byte b10) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "onTimeOut " + this);
        }
        if (b10 == 0) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u10.a("l1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.f26890b));
            }
            if (this.f26890b != 3) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b10 != 2 && b10 != 1) {
            if (b10 == 4) {
                C3348u9 c3348u11 = this.f26897i;
                if (c3348u11 != null) {
                    kotlin.jvm.internal.s.g("l1", "TAG");
                    c3348u11.a("l1", "Show RequestTimeOut by show timer");
                }
                AbstractC2978g1 abstractC2978g1N = n();
                if (abstractC2978g1N != null) {
                    abstractC2978g1N.d();
                    return;
                }
                return;
            }
            C3348u9 c3348u12 = this.f26897i;
            if (c3348u12 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u12.a("l1", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        C3348u9 c3348u13 = this.f26897i;
        if (c3348u13 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u13.a("l1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.f26890b));
        }
        if (this.f26890b != 3) {
            this.f26912x.removeCallbacksAndMessages(null);
            C3348u9 c3348u14 = this.f26897i;
            if (c3348u14 != null) {
                kotlin.jvm.internal.s.g("l1", "TAG");
                c3348u14.a("l1", "adUnitEventListener=" + n() + ", Adstate=" + ((int) this.f26890b));
            }
            if (2 == this.f26890b) {
                K();
                i();
                c(Ze.a() == null ? (short) 2139 : (short) 2203);
                AbstractC2978g1 abstractC2978g1N2 = n();
                if (abstractC2978g1N2 != null) {
                    abstractC2978g1N2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == this.f26890b) {
                K();
                c((short) 2138);
                AbstractC2978g1 abstractC2978g1N3 = n();
                if (abstractC2978g1N3 != null) {
                    abstractC2978g1N3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(int i10, boolean z10) throws JSONException {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", "Destroying container for index " + i10 + " " + this);
        }
        CopyOnWriteArrayList list = this.f26896h;
        kotlin.jvm.internal.s.h(list, "list");
        if (i10 < 0 || i10 >= list.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(i10);
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.J0.set(z10);
            gestureDetectorOnGestureListenerC3228pi.stopLoading();
            gestureDetectorOnGestureListenerC3228pi.b();
        }
        this.f26896h.set(i10, null);
    }

    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, Integer num, int i10) {
        int iIntValue;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            iIntValue = this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi);
        } else if (num == null) {
            return;
        } else {
            iIntValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIntValue);
        if (adB != null) {
            Iterator it = Li.a(adB, "pod_abort").iterator();
            while (it.hasNext()) {
                String url = bm.r.I(bm.r.I((String) it.next(), "$PODINDEX", String.valueOf(iIntValue), false, 4, null), "$REASON", String.valueOf(i10), false, 4, null);
                A3 a10 = A3.f24440a;
                C3348u9 c3348u9 = this.f26897i;
                kotlin.jvm.internal.s.h(url, "url");
                A3.a(url, true, c3348u9);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(GestureDetectorOnGestureListenerC3228pi renderView, String trackerName, Map macros) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u9.a("l1", QGbBllacZSmHKn.PzWS + trackerName + " " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f26896h.indexOf(renderView));
        if (adB != null) {
            for (String str : Li.a(adB, trackerName)) {
                String url = str;
                for (Map.Entry entry : macros.entrySet()) {
                    url = bm.r.I(url, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
                A3 a10 = A3.f24440a;
                C3348u9 c3348u10 = this.f26897i;
                kotlin.jvm.internal.s.h(url, "url");
                A3.a(url, true, c3348u10);
            }
            return;
        }
        C3348u9 c3348u11 = this.f26897i;
        if (c3348u11 != null) {
            kotlin.jvm.internal.s.g("l1", "TAG");
            c3348u11.a("l1", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(String log) {
        kotlin.jvm.internal.s.h(log, "log");
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.a(log);
        }
    }

    @Override // com.inmobi.media.Io
    public final String a(int i10, double d10) {
        return ((Io) this.D.getValue()).a(i10, d10);
    }

    @Override // com.inmobi.media.Io
    public final String a(double d10) {
        return ((Io) this.D.getValue()).a(d10);
    }
}
