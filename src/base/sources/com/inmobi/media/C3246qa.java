package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3246qa;
import com.inmobi.media.EnumC2931e6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import tn.xQIL.Saucuwx;

/* JADX INFO: renamed from: com.inmobi.media.qa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3246qa extends AbstractC3107l1 {
    public int F;
    public boolean G;
    public final C2997gk H;
    public tl.a I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3246qa(Context context, C3365v0 adPlacement, C3297sa c3297sa) {
        super(context, adPlacement, c3297sa);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(adPlacement, "adPlacement");
        this.H = new C2997gk();
        kotlin.jvm.internal.s.g("qa", "TAG");
        long j10 = adPlacement.f27659a;
        a(context, adPlacement, c3297sa);
        kotlin.jvm.internal.s.h("activity", "monetizationContext");
        super.L();
    }

    public static final void c(C3246qa c3246qa) {
        c3246qa.g(c3246qa.n());
    }

    public static final fl.g0 d(C3246qa c3246qa) throws JSONException {
        c3246qa.Z();
        return fl.g0.f38750a;
    }

    public static final void e(C3246qa c3246qa) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c3246qa.O();
        if (c3246qa.f26907s) {
            AdSet adSetS = c3246qa.s();
            int size = (adSetS == null || (ads = adSetS.getAds()) == null) ? 0 : ads.size();
            for (int i10 = 1; i10 < size; i10++) {
                c3246qa.f26903o++;
                c3246qa.O();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void D() {
        if (W()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void G() {
        super.G();
        if (!kotlin.jvm.internal.s.c(t(), "html") && !kotlin.jvm.internal.s.c(t(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.f26890b == 2) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                c3348u9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.f26900l);
            }
            AbstractC2978g1 abstractC2978g1N = n();
            if (abstractC2978g1N != null) {
                C3348u9 c3348u10 = this.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("qa", "TAG");
                    c3348u10.a("qa", "callback - onFetchSuccess");
                }
                c(abstractC2978g1N);
                return;
            }
            c((short) 2188);
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u11.b("qa", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void J() throws JSONException {
        super.J();
        this.F = 0;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void L() {
        kotlin.jvm.internal.s.h("activity", "monetizationContext");
        super.L();
    }

    public final boolean W() throws JSONException {
        if (F()) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u9.a("qa", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N == null || h(abstractC2978g1N)) {
            return false;
        }
        if (4 == this.f26890b) {
            if (!A()) {
                C3348u9 c3348u10 = this.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("qa", "TAG");
                    c3348u10.a("qa", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC2978g1 abstractC2978g1N2 = n();
                if (abstractC2978g1N2 == null) {
                    C3348u9 c3348u11 = this.f26897i;
                    if (c3348u11 != null) {
                        c3348u11.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(abstractC2978g1N2);
                    d(abstractC2978g1N2);
                }
                return false;
            }
            super.d();
            this.I = null;
        }
        E();
        return true;
    }

    public final int X() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetS = s();
        if (adSetS != null) {
            int podSuccessCount = adSetS.getPodSuccessCount();
            Integer numValueOf = Integer.valueOf(podSuccessCount);
            if (podSuccessCount < 1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        AdSet adSetS2 = s();
        if (adSetS2 != null && (ads = adSetS2.getAds()) != null) {
            int size = ads.size();
            Integer numValueOf2 = size > 0 ? Integer.valueOf(size) : null;
            if (numValueOf2 != null) {
                return numValueOf2.intValue();
            }
        }
        return 1;
    }

    public final void Y() throws JSONException {
        AdConfig adConfig;
        if (kotlin.jvm.internal.s.c(this.f26900l.f27664f, "AB") && (adConfig = this.f26891c) != null && adConfig.getSkipNetCheckHB()) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u9.a("qa", "renderAd without internet check");
            }
            Z();
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("qa", "TAG");
            c3348u10.a("qa", "renderAd");
        }
        a(new tl.a() { // from class: yh.bb
            @Override // tl.a
            public final Object invoke() {
                return C3246qa.d(this.f57623a);
            }
        }, new Function1() { // from class: yh.cb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3246qa.a(this.f57646a, (EnumC2931e6) obj);
            }
        });
    }

    public final void Z() throws JSONException {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("qa", "TAG");
            c3348u9.a("qa", "renderAdPostInternetCheck");
        }
        super.J();
        this.F = 0;
        try {
            if (N()) {
                return;
            }
            C3262r1 c3262r1 = this.f26914z;
            c3262r1.getClass();
            c3262r1.f27367g = SystemClock.elapsedRealtime();
            String strT = t();
            if (!kotlin.jvm.internal.s.c(strT, "html") && !kotlin.jvm.internal.s.c(strT, "htmlUrl")) {
                C3348u9 c3348u10 = this.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("qa", "TAG");
                    c3348u10.a("qa", "Cannot handle markupType: " + t());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.ib
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3246qa.e(this.f57780a);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u11.a("qa", "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.InterfaceC3391w0
    public final void a(int i10, GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
    }

    public final void a0() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("qa", "TAG");
            c3348u9.d("qa", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        C3262r1 c3262r1 = this.f26914z;
        c3262r1.getClass();
        c3262r1.f27369i = SystemClock.elapsedRealtime();
        Q();
        T();
        this.H.f26631a = true;
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u10.a("qa", "signaling Success");
            }
            d(abstractC2978g1N);
        }
    }

    public final short b(Context context) {
        int i10;
        try {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u9.a("qa", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            GestureDetectorOnGestureListenerC3228pi container = j();
            if (container == null) {
                return (short) 2155;
            }
            if (kotlin.jvm.internal.s.c("unknown", container.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.f24404t;
            kotlin.jvm.internal.s.h(container, "container");
            int iHashCode = container.hashCode();
            InMobiAdActivity.f24404t.put(iHashCode, container);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            C3348u9 obj = this.f26897i;
            if (obj != null) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.s.g(string, "toString(...)");
                HashMap map = U8.f25815a;
                String key = string.toString();
                kotlin.jvm.internal.s.h(key, "key");
                kotlin.jvm.internal.s.h(obj, "obj");
                U8.f25815a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", string.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String strT = t();
            if (kotlin.jvm.internal.s.c(strT, "html")) {
                i10 = 200;
            } else {
                i10 = kotlin.jvm.internal.s.c(strT, "htmlUrl") ? 202 : 201;
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", i10);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.f26907s) {
                if (this.f26905q == -1) {
                    this.f26905q = System.currentTimeMillis();
                }
                if (this.f26903o > 0) {
                    intent.setFlags(603979776);
                }
            }
            Context context2 = Xi.f26021a;
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(intent, "intent");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
            return (short) 0;
        } catch (Exception e10) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                c3348u10.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
            return (short) 2154;
        }
    }

    public final void b0() {
        short s10;
        MetaInfo metaInfo;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
            c3348u9.c("l1", "submitAdNotReady " + this);
        }
        C2997gk c2997gk = this.H;
        C3262r1 c3262r1 = this.f26914z;
        com.inmobi.media.ads.network.common.model.Ad adQ = q();
        String creativeType = (adQ == null || (metaInfo = adQ.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        AdSet adSetS = s();
        Boolean boolValueOf = adSetS != null ? Boolean.valueOf(adSetS.getIsRewarded()) : null;
        String strT = t();
        String impressionId = null;
        Boolean bool = boolValueOf;
        byte b10 = this.f26890b;
        com.inmobi.media.ads.network.common.model.Ad adQ2 = q();
        if (adQ2 != null) {
            impressionId = adQ2.getImpressionId();
        }
        C3313t0 adNotReadyMetadata = new C3313t0(c3262r1, creativeType, bool, strT, b10, impressionId);
        c2997gk.getClass();
        kotlin.jvm.internal.s.h(adNotReadyMetadata, "adNotReadyMetadata");
        HashMap map = new HashMap();
        long j10 = c3262r1.f27363c;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        if (b10 == 0) {
            s10 = 2204;
        } else if (b10 == 1) {
            s10 = 2282;
        } else if (b10 == 2) {
            s10 = 2283;
        } else if (b10 == 3) {
            s10 = 2284;
        } else if (b10 == 6) {
            s10 = 2285;
        } else if (b10 == 7) {
            s10 = 2209;
        } else {
            s10 = b10 == 8 ? (short) 2242 : (short) 2210;
        }
        map.put("errorCode", Short.valueOf(s10));
        map.put("markupType", strT);
        if (creativeType != null) {
            map.put("creativeType", creativeType);
        }
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        if (bool != null) {
            map.put("isRewarded", bool);
        }
        String strA = c3262r1.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", c3262r1.f27361a.m());
        map.put("networkType", B5.o());
        map.put("plId", Long.valueOf(c3262r1.f27361a.f26900l.f27659a));
        map.put("isAdLoaded", Boolean.valueOf(c2997gk.f26631a));
        String str = c3262r1.f27361a.f26900l.f27664f;
        if (str != null) {
            map.put("plType", str);
        }
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("AdNotReady", map, EnumC3281rk.SDK);
    }

    public final void c0() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            c3348u9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.f26900l);
        }
        h();
        a0();
    }

    public final void f(short s10) {
        if (this.f26890b == 2) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                c3348u9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.f26900l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    public final void g(AbstractC2978g1 abstractC2978g1) {
        if (this.f26890b != 6) {
            if (this.f26890b == 7) {
                this.F++;
                return;
            }
            return;
        }
        int i10 = this.F + 1;
        this.F = i10;
        if (i10 != 1) {
            c((byte) 7);
            return;
        }
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            c3348u9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.f26900l);
        }
        if (abstractC2978g1 != null) {
            b((byte) 4);
            a(abstractC2978g1);
        }
    }

    public final boolean h(AbstractC2978g1 abstractC2978g1) {
        byte b10 = this.f26890b;
        if (b10 == 1) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                c3348u9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.f26900l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b10 == 7 || b10 == 6) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                c3348u10.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f26900l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        if (kotlin.jvm.internal.s.c("html", t()) || kotlin.jvm.internal.s.c("htmlUrl", t())) {
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                c3348u11.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.f26900l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC2978g1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void i() {
        if (this.f26896h.isEmpty()) {
            return;
        }
        int size = this.f26896h.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f26906r.contains(Integer.valueOf(i10))) {
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(i10);
                if (kotlin.jvm.internal.s.c(gestureDetectorOnGestureListenerC3228pi != null ? gestureDetectorOnGestureListenerC3228pi.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC3228pi, AbstractC3107l1.p(gestureDetectorOnGestureListenerC3228pi));
                    gestureDetectorOnGestureListenerC3228pi.g();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final String m() {
        return "int";
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void n(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        if (!this.f26907s || !a(renderView)) {
            V();
        }
        super.n(renderView);
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final GestureDetectorOnGestureListenerC3228pi r() {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (this.f26896h.size() <= 0 || this.f26904p >= this.f26896h.size()) ? null : (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(this.f26904p);
        if (this.G && gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.l();
        }
        return gestureDetectorOnGestureListenerC3228pi;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final byte u() {
        return (byte) 1;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void a(byte[] bArr) {
        if (W()) {
            super.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void m(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        super.m(gestureDetectorOnGestureListenerC3228pi);
        if (!this.f26907s) {
            if (this.f26890b == 2) {
                b((byte) 1);
                c0();
                return;
            }
            return;
        }
        int iIndexOf = this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi);
        if (iIndexOf < this.f26904p) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u9.a("qa", "Ignoring loaded ad with index " + iIndexOf + " as current rendering index is " + this.f26904p);
                return;
            }
            return;
        }
        this.f26906r.add(Integer.valueOf(iIndexOf));
        if (this.f26890b == 2) {
            int iX = X();
            for (int i10 = 0; i10 < iX && i10 < this.f26896h.size(); i10++) {
                if (this.f26896h.get(i10) == null || !this.f26906r.contains(Integer.valueOf(i10))) {
                    return;
                }
            }
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u10.a("qa", "Providing success based on index " + iIndexOf);
            }
            b((byte) 1);
            this.f26904p = 0;
            c0();
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void d() throws JSONException {
        super.d();
        this.I = null;
    }

    public final void a(final C3297sa c3297sa, final Activity activity) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a((AbstractC2978g1) c3297sa, (Context) activity);
        } else {
            ((ExecutorC2937ec) AbstractC3293s6.f27440e.getValue()).f26488a.post(new Runnable() { // from class: yh.fb
                @Override // java.lang.Runnable
                public final void run() {
                    C3246qa.a(this.f57717a, c3297sa, activity);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final synchronized void e(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        super.e(renderView);
        Handler handler = this.f26898j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yh.ab
                @Override // java.lang.Runnable
                public final void run() {
                    C3246qa.b(this.f57605a);
                }
            });
        }
    }

    public final void f(AbstractC2978g1 abstractC2978g1) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("qa", "TAG");
            c3348u9.c("qa", "handleAdScreenDismissed " + ((int) this.f26890b));
        }
        if (this.f26890b == 7) {
            int i10 = this.F - 1;
            this.F = i10;
            if (i10 == 1) {
                c((byte) 6);
                C3348u9 c3348u10 = this.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("qa", "TAG");
                    c3348u10.d("qa", QGbBllacZSmHKn.GpDGeNkXEFldzM + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (this.f26890b == 6 || this.f26890b == 8) {
            this.F--;
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                c3348u11.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.f26900l);
            }
            if (abstractC2978g1 != null) {
                abstractC2978g1.a();
                return;
            }
            C3348u9 c3348u12 = this.f26897i;
            if (c3348u12 != null) {
                c3348u12.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    public static final void a(C3246qa c3246qa, AbstractC2978g1 abstractC2978g1, Context context) {
        c3246qa.a(abstractC2978g1, context);
    }

    public static final void a(final C3246qa c3246qa, final GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, Context context) {
        final int iIndexOf = c3246qa.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi);
        CopyOnWriteArrayList list = c3246qa.f26896h;
        kotlin.jvm.internal.s.h(list, "list");
        if (iIndexOf < 0 || iIndexOf >= list.size()) {
            return;
        }
        short sB = c3246qa.b(context);
        if (sB != 0) {
            c3246qa.e(iIndexOf);
        }
        c3246qa.b(iIndexOf, sB == 0);
        Handler handler = c3246qa.f26898j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yh.gb
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3246qa.a(gestureDetectorOnGestureListenerC3228pi, c3246qa, iIndexOf);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1, com.inmobi.media.InterfaceC3391w0
    public final void a(GestureDetectorOnGestureListenerC3228pi renderView, Activity activity) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
            c3348u9.c("l1", "closeCurrentPodAd " + this);
        }
        if (this.f26907s) {
            Integer num = (Integer) this.f26906r.higher(Integer.valueOf(this.f26896h.indexOf(renderView)));
            if (num != null) {
                a(num.intValue(), renderView, activity);
            } else {
                b();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final synchronized void f(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        super.f(renderView);
        Handler handler = this.f26898j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yh.eb
                @Override // java.lang.Runnable
                public final void run() {
                    C3246qa.c(this.f57697a);
                }
            });
        }
    }

    public final void a(AbstractC2978g1 abstractC2978g1, Context context) {
        if (abstractC2978g1 == null) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                c3348u9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        tl.a aVar = this.I;
        if (aVar != null) {
            aVar.invoke();
            return;
        }
        if (this.f26890b == 8) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u10.b("qa", "unload has been called on this ad. Dont show. ");
            }
            kotlin.jvm.internal.s.g("qa", "TAG");
            Sb.a((byte) 2, "qa", IAoPeRfJn.gxwRxvVsoDuHHF);
            a((short) 2239);
            return;
        }
        if (this.f26890b == 4) {
            e(abstractC2978g1);
            c((byte) 6);
            if (A()) {
                a((short) 2153);
                c((byte) 0);
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piJ = j();
                if (gestureDetectorOnGestureListenerC3228piJ != null) {
                    gestureDetectorOnGestureListenerC3228piJ.b();
                    return;
                }
                return;
            }
            if (context == null) {
                context = o();
            }
            short sB = b(context);
            if (sB != 0) {
                a(sB);
                return;
            } else {
                abstractC2978g1.c();
                return;
            }
        }
        Sb.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        C3348u9 c3348u11 = this.f26897i;
        if (c3348u11 != null) {
            kotlin.jvm.internal.s.g("qa", "TAG");
            c3348u11.b("qa", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        }
        kotlin.jvm.internal.s.g("qa", "TAG");
        Sb.a((byte) 1, "qa", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        a((short) 2152);
    }

    @Override // com.inmobi.media.InterfaceC3391w0
    public final void b() {
        if (this.f26907s) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u9.a("qa", "Closing the ad as closeAll is called");
            }
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.za
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        C3246qa.a(this.f58047a);
                    }
                });
            }
        }
    }

    public static final void b(C3246qa c3246qa) {
        c3246qa.f(c3246qa.n());
    }

    @Override // com.inmobi.media.AbstractC3107l1, com.inmobi.media.InterfaceC3391w0
    public final boolean a(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        if (this.f26907s) {
            if (((Integer) this.f26906r.higher(Integer.valueOf(this.f26896h.indexOf(renderView)))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC3107l1, com.inmobi.media.Dk
    public final void a(byte b10) throws JSONException {
        if (b10 == 1) {
            if (this.f26907s) {
                if (this.f26890b == 2) {
                    C3348u9 c3348u9 = this.f26897i;
                    if (c3348u9 != null) {
                        kotlin.jvm.internal.s.g("qa", "TAG");
                        c3348u9.b("qa", "RenderView time out");
                    }
                    int iX = X();
                    int i10 = 0;
                    for (int i11 = 0; i11 < iX; i11++) {
                        if (!this.f26906r.contains(Integer.valueOf(i11))) {
                            i10 = i11;
                            break;
                        }
                    }
                    a((GestureDetectorOnGestureListenerC3228pi) null, Integer.valueOf(i10), 2);
                    i();
                    f();
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                    return;
                }
                f();
                return;
            }
            super.a(b10);
            return;
        }
        super.a(b10);
    }

    @Override // com.inmobi.media.AbstractC3107l1, com.inmobi.media.InterfaceC3391w0
    public final void a(int i10, final GestureDetectorOnGestureListenerC3228pi renderView, final Context context) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        kotlin.jvm.internal.s.h(renderView, "renderView");
        if (!this.f26907s) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                kotlin.jvm.internal.s.g("qa", "TAG");
                c3348u9.a("qa", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (this.f26906r.contains(Integer.valueOf(i10)) && i10 > this.f26896h.indexOf(renderView) && i10 < this.f26896h.size() && this.f26896h.get(i10) != null && ((gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(i10)) == null || gestureDetectorOnGestureListenerC3228pi.C0)) {
            if (context == null) {
                context = o();
            }
            super.a(i10, renderView, context);
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.hb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3246qa.a(this.f57758a, renderView, context);
                    }
                });
                return;
            }
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("qa", "TAG");
            c3348u10.a("qa", "Cannot show an pod ad with invalid index passed");
        }
        b(this.f26896h.indexOf(renderView), false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public static final fl.g0 a(C3246qa c3246qa, EnumC2931e6 it) {
        short s10;
        kotlin.jvm.internal.s.h(it, "it");
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        kotlin.jvm.internal.s.h(it, Saucuwx.ISyryehNc);
        int iOrdinal = it.ordinal();
        if (iOrdinal == 0) {
            s10 = 2122;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s10 = 2123;
                    break;
                case 13:
                    s10 = 2124;
                    break;
                case 14:
                    s10 = 2125;
                    break;
                case 15:
                    s10 = 2126;
                    break;
                case 16:
                    s10 = 2127;
                    break;
                default:
                    s10 = 2122;
                    break;
            }
        } else {
            s10 = 2229;
        }
        c3246qa.a(inMobiAdRequestStatus, true, s10);
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, short s10, String failureErrorCode) throws JSONException {
        kotlin.jvm.internal.s.h(failureErrorCode, "failureErrorCode");
        super.a(gestureDetectorOnGestureListenerC3228pi, s10, failureErrorCode);
        if (this.f26907s) {
            int iIndexOf = this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi);
            if (iIndexOf < X()) {
                a(gestureDetectorOnGestureListenerC3228pi, (Integer) null, s10 == 2137 ? 1 : 3);
                f(s10);
            }
            a(iIndexOf, true);
            return;
        }
        f(s10);
    }

    public static final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, C3246qa c3246qa, int i10) throws JSONException {
        gestureDetectorOnGestureListenerC3228pi.m();
        c3246qa.a(i10, false);
    }

    public static final void a(C3246qa c3246qa) throws JSONException {
        c3246qa.e();
        C3348u9 c3348u9 = c3246qa.f26897i;
        if (c3348u9 != null) {
            c3348u9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c3246qa.f26900l);
        }
        if (c3246qa.n() != null) {
            AbstractC2978g1 abstractC2978g1N = c3246qa.n();
            if (abstractC2978g1N != null) {
                abstractC2978g1N.a();
                return;
            }
            return;
        }
        C3348u9 c3348u10 = c3246qa.f26897i;
        if (c3348u10 != null) {
            c3348u10.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1, com.inmobi.media.AbstractC3279ri
    public final void a(GestureDetectorOnGestureListenerC3228pi renderView, boolean z10) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        super.a(renderView, z10);
        byte b10 = this.f26890b;
        if (b10 == 4) {
            final short s10 = z10 ? (short) 2220 : (short) 2219;
            this.I = new tl.a() { // from class: yh.db
                @Override // tl.a
                public final Object invoke() {
                    return C3246qa.a(this.f57668a, s10);
                }
            };
            return;
        }
        if (b10 != 6) {
            if (b10 == 7) {
                short s11 = z10 ? (short) 2224 : (short) 2223;
                Sb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                C3348u9 c3348u9 = this.f26897i;
                if (c3348u9 != null) {
                    kotlin.jvm.internal.s.g("qa", "TAG");
                    c3348u9.b("qa", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z10, s11);
                renderView.x();
                f(n());
                return;
            }
            return;
        }
        short s12 = z10 ? (short) 2222 : (short) 2221;
        Sb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("qa", "TAG");
            c3348u10.b("qa", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        renderView.x();
        if (this.F == 0) {
            a(s12);
        } else {
            renderView.a(z10, s12);
            f(n());
        }
    }

    public static final fl.g0 a(C3246qa c3246qa, short s10) {
        Sb.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        C3348u9 c3348u9 = c3246qa.f26897i;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("qa", "TAG");
            c3348u9.b("qa", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c3246qa.a(s10);
        c3246qa.I = null;
        return fl.g0.f38750a;
    }
}
