package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3297sa;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3297sa extends Uk {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f27453j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3246qa f27454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27455i;

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void a() throws JSONException {
        this.f25849d.post(new Runnable() { // from class: yh.rb
            @Override // java.lang.Runnable
            public final void run() {
                C3297sa.a(this.f57912a);
            }
        });
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.f25846a = (byte) 0;
        this.f25847b = null;
        C3246qa c3246qa = this.f27454h;
        if (c3246qa != null) {
            c3246qa.d();
        }
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            c3348u10.a();
        }
    }

    public final void b(PublisherCallbacks callbacks) {
        C3246qa c3246qa;
        kotlin.jvm.internal.s.h(callbacks, "callbacks");
        if (this.f25848c == null) {
            this.f25848c = callbacks;
        }
        if (kotlin.jvm.internal.s.c(this.f25847b, Boolean.FALSE)) {
            C3246qa c3246qa2 = this.f27454h;
            if (c3246qa2 != null) {
                c3246qa2.b((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3348u9 c3348u9 = this.f25851f;
            if (c3348u9 != null) {
                c3348u9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Sb.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.f27455i) {
            C3246qa c3246qa3 = this.f27454h;
            if (c3246qa3 != null) {
                c3246qa3.b((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                c3348u10.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Sb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.f25847b = Boolean.TRUE;
        C3246qa c3246qa4 = this.f27454h;
        if (c3246qa4 == null || !a("InMobi", String.valueOf(c3246qa4.f26900l), callbacks) || (c3246qa = this.f27454h) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.f25848c;
        if (c3246qa.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.f25846a = (byte) 1;
            C3348u9 c3348u11 = this.f25851f;
            if (c3348u11 != null) {
                C3246qa c3246qa5 = this.f27454h;
                c3348u11.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3246qa5 != null ? c3246qa5.f26900l : null));
            }
            C3246qa c3246qa6 = this.f27454h;
            Sb.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3246qa6 != null ? c3246qa6.f26900l : null));
            C3246qa c3246qa7 = this.f27454h;
            if (c3246qa7 != null) {
                c3246qa7.e(this);
            }
            C3246qa c3246qa8 = this.f27454h;
            if (c3246qa8 != null) {
                c3246qa8.D();
            }
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void c(AdMetaInfo info) throws JSONException {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.f27454h != null) {
            d(info);
            return;
        }
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            c3348u10.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b10 = this.f25846a;
        if (b10 == 8 || b10 == 1) {
            b((AbstractC3107l1) null, inMobiAdRequestStatus);
            return;
        }
        if (b10 == 2) {
            Sb.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            C3348u9 c3348u11 = this.f25851f;
            if (c3348u11 != null) {
                c3348u11.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b10 != 5) {
            Sb.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            C3348u9 c3348u12 = this.f25851f;
            if (c3348u12 != null) {
                c3348u12.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        Sb.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        C3348u9 c3348u13 = this.f25851f;
        if (c3348u13 != null) {
            c3348u13.b("InMobi", "Ad will be dismissed, Internal error");
        }
        C3246qa c3246qa = this.f27454h;
        if (c3246qa != null) {
            c3246qa.b((byte) 4);
        }
        a();
    }

    public final void d(final AdMetaInfo adMetaInfo) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.c("InterstitialUnifiedAdManager", "onLoadSuccess");
        }
        super.c(adMetaInfo);
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            c3348u10.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.f25846a = (byte) 2;
        this.f25849d.post(new Runnable() { // from class: yh.tb
            @Override // java.lang.Runnable
            public final void run() {
                C3297sa.b(this.f57947a, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Uk
    public final AbstractC3107l1 f() {
        return this.f27454h;
    }

    public final boolean h() throws JSONException {
        byte b10 = this.f25846a;
        if (b10 == 1) {
            C3348u9 c3348u9 = this.f25851f;
            if (c3348u9 != null) {
                c3348u9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Sb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b10 == 7) {
            Sb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                c3348u10.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b10 != 5) {
            if (!this.f27455i) {
                return true;
            }
            C3246qa c3246qa = this.f27454h;
            if (c3246qa != null) {
                c3246qa.d((short) 2149);
            }
            Sb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            C3348u9 c3348u11 = this.f25851f;
            if (c3348u11 != null) {
                c3348u11.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            return false;
        }
        C3246qa c3246qa2 = this.f27454h;
        if (c3246qa2 != null) {
            Sb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c3246qa2.f26900l);
            C3348u9 c3348u12 = this.f25851f;
            if (c3348u12 != null) {
                C3246qa c3246qa3 = this.f27454h;
                c3348u12.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c3246qa3 != null ? c3246qa3.f26900l : null));
            }
            a(false, (short) 2148);
        }
        return false;
    }

    public final void i() throws JSONException {
        C3246qa c3246qa;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.a("InterstitialUnifiedAdManager", "render");
        }
        C3246qa c3246qa2 = this.f27454h;
        if (c3246qa2 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (c3246qa2.f26890b == 4 && this.f25850e != null) {
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                c3348u10.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfo = this.f25850e;
            kotlin.jvm.internal.s.e(adMetaInfo);
            d(adMetaInfo);
            return;
        }
        if (this.f27455i) {
            C3348u9 c3348u11 = this.f25851f;
            if (c3348u11 != null) {
                c3348u11.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Sb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.f27454h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3246qa c3246qa3 = this.f27454h;
            if (c3246qa3 != null) {
                c3246qa3.c((short) 2128);
                return;
            }
            return;
        }
        C3246qa c3246qa4 = this.f27454h;
        com.inmobi.media.ads.network.common.model.Ad adB = c3246qa4 != null ? c3246qa4.b(0) : null;
        C3246qa c3246qa5 = this.f27454h;
        boolean zA = a("InMobi", String.valueOf(c3246qa5 != null ? c3246qa5.f26900l : null));
        if (adB == null) {
            C3348u9 c3348u12 = this.f25851f;
            if (c3348u12 != null) {
                c3348u12.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.f27454h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3246qa c3246qa6 = this.f27454h;
            if (c3246qa6 != null) {
                c3246qa6.b((short) 2166);
            }
        }
        if (this.f25850e == null) {
            C3348u9 c3348u13 = this.f25851f;
            if (c3348u13 != null) {
                c3348u13.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.f27454h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3246qa c3246qa7 = this.f27454h;
            if (c3246qa7 != null) {
                c3246qa7.b((short) 2167);
            }
        }
        if (adB == null || !zA) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.f25848c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3246qa = this.f27454h) != null) {
            c3246qa.d((byte) 1);
        }
        C3348u9 c3348u14 = this.f25851f;
        if (c3348u14 != null) {
            c3348u14.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.f25846a = (byte) 8;
        C3246qa c3246qa8 = this.f27454h;
        if (c3246qa8 != null) {
            c3246qa8.Y();
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void d() throws JSONException {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        C3246qa c3246qa = this.f27454h;
        if (c3246qa != null) {
            if (c3246qa.f26890b != 6 && c3246qa.f26890b != 7) {
                a(true, (short) 2159);
            } else {
                c3246qa.f(this);
            }
        }
    }

    public static final void a(C3297sa c3297sa) {
        C3348u9 c3348u9 = c3297sa.f25851f;
        if (c3348u9 != null) {
            c3348u9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = c3297sa.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(C3297sa c3297sa, AdMetaInfo adMetaInfo) {
        C3348u9 c3348u9 = c3297sa.f25851f;
        if (c3348u9 != null) {
            c3348u9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3297sa.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(boolean z10, short s10) throws JSONException {
        C3246qa c3246qa;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s10 != 0 && (c3246qa = this.f27454h) != null) {
            c3246qa.d(s10);
        }
        this.f25849d.post(new Runnable() { // from class: yh.ub
            @Override // java.lang.Runnable
            public final void run() {
                C3297sa.c(this.f57963a);
            }
        });
        if (z10) {
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                c3348u10.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.f25846a = (byte) 6;
            C3246qa c3246qa2 = this.f27454h;
            if (c3246qa2 != null) {
                c3246qa2.d();
            }
        }
        C3348u9 c3348u11 = this.f25851f;
        if (c3348u11 != null) {
            c3348u11.a();
        }
    }

    public static final void c(C3297sa c3297sa) {
        C3348u9 c3348u9 = c3297sa.f25851f;
        if (c3348u9 != null) {
            c3348u9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3297sa.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3348u9 c3348u10 = c3297sa.f25851f;
        if (c3348u10 != null) {
            c3348u10.a();
        }
        C3246qa c3246qa = c3297sa.f27454h;
        if (c3246qa != null) {
            c3246qa.b((byte) 4);
        }
    }

    public final void a(Activity activity) throws JSONException {
        C2997gk c2997gk;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.a("InterstitialUnifiedAdManager", "show");
        }
        C3246qa c3246qa = this.f27454h;
        if (c3246qa != null && (c2997gk = c3246qa.H) != null) {
            c2997gk.f26632b = true;
        }
        if (c3246qa != null) {
            c3246qa.R();
        }
        if (h()) {
            if (!AbstractC2829a7.a()) {
                if (this.f27454h != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C3246qa c3246qa2 = this.f27454h;
            if (c3246qa2 == null || !c3246qa2.d((byte) 4)) {
                return;
            }
            this.f27455i = true;
            C3246qa c3246qa3 = this.f27454h;
            if (c3246qa3 != null) {
                c3246qa3.a(this, activity);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void b() throws JSONException {
        this.f25849d.post(new Runnable() { // from class: yh.sb
            @Override // java.lang.Runnable
            public final void run() {
                C3297sa.b(this.f57928a);
            }
        });
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.f25846a = (byte) 6;
        C3246qa c3246qa = this.f27454h;
        if (c3246qa != null) {
            c3246qa.d();
        }
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            c3348u10.a();
        }
    }

    public final void a(Sg pubSettings, Context context, boolean z10, String logType) {
        C3246qa c3246qa;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piJ;
        C3246qa c3246qa2;
        String str;
        kotlin.jvm.internal.s.h(pubSettings, "pubSettings");
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(logType, "logType");
        if (this.f27454h == null) {
            kotlin.jvm.internal.s.h("int", "mAdType");
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            long j10 = pubSettings.f25691a;
            String str2 = pubSettings.f25692b;
            Map map = pubSettings.f25693c;
            String str3 = pubSettings.f25697g;
            String str4 = pubSettings.f25695e;
            if (j10 != Long.MIN_VALUE) {
                if (map == null || (str = (String) map.get("tp")) == null) {
                    str = "";
                }
                C3365v0 c3365v0 = new C3365v0(j10, str, "int", str3);
                c3365v0.f27662d = str2;
                c3365v0.f27661c = map;
                kotlin.jvm.internal.s.h("", "<set-?>");
                c3365v0.f27666h = "";
                kotlin.jvm.internal.s.h("activity", "<set-?>");
                c3365v0.f27667i = "activity";
                c3365v0.f27665g = string;
                c3365v0.f27668j = false;
                c3365v0.f27669k = str4;
                this.f27454h = new C3246qa(context, c3365v0, this);
            } else {
                throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
            }
        }
        if (z10) {
            g();
        }
        String str5 = pubSettings.f25697g;
        if (str5 != null) {
            C3348u9 c3348u9 = this.f25851f;
            if (c3348u9 != null) {
                c3348u9.a();
            }
            C3348u9 c3348u9A = Sh.a(logType, str5);
            this.f25851f = c3348u9A;
            if (c3348u9A != null) {
                c3348u9A.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            C3348u9 logger = this.f25851f;
            if (logger != null && (c3246qa2 = this.f27454h) != null) {
                kotlin.jvm.internal.s.h(logger, "logger");
                c3246qa2.f26897i = logger;
                C2848b0 c2848b0 = c3246qa2.f26909u;
                c2848b0.getClass();
                kotlin.jvm.internal.s.h(logger, "logger");
                c2848b0.f26241f = logger;
            }
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                c3348u10.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C3246qa c3246qa3 = this.f27454h;
            kotlin.jvm.internal.s.e(c3246qa3);
            Sh.a(c3246qa3, this.f25851f);
        }
        C3246qa c3246qa4 = this.f27454h;
        if (c3246qa4 != null) {
            c3246qa4.a(context);
        }
        C3246qa c3246qa5 = this.f27454h;
        if (c3246qa5 != null) {
            c3246qa5.a(pubSettings.f25693c);
        }
        C3246qa c3246qa6 = this.f27454h;
        if (c3246qa6 != null) {
            c3246qa6.L();
        }
        if (pubSettings.f25694d && (c3246qa = this.f27454h) != null && (gestureDetectorOnGestureListenerC3228piJ = c3246qa.j()) != null) {
            c3246qa.G = true;
            gestureDetectorOnGestureListenerC3228piJ.l();
        }
        WatermarkData watermarkData = this.f25852g;
        if (watermarkData != null) {
            C3246qa c3246qa7 = this.f27454h;
            if (c3246qa7 != null) {
                kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
                c3246qa7.A = watermarkData;
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piR = c3246qa7.r();
                if (gestureDetectorOnGestureListenerC3228piR != null) {
                    gestureDetectorOnGestureListenerC3228piR.setWatermark(watermarkData);
                }
            }
            C3348u9 c3348u11 = this.f25851f;
            if (c3348u11 != null) {
                c3348u11.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void b(final AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.f25850e = info;
        if (this.f27454h == null) {
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                c3348u10.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((AbstractC3107l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        this.f25849d.post(new Runnable() { // from class: yh.qb
            @Override // java.lang.Runnable
            public final void run() {
                C3297sa.a(this.f57895a, info);
            }
        });
    }

    public static final void b(C3297sa c3297sa) {
        C3348u9 c3348u9 = c3297sa.f25851f;
        if (c3348u9 != null) {
            c3348u9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3297sa.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3246qa c3246qa = c3297sa.f27454h;
        if (c3246qa != null) {
            c3246qa.b((byte) 4);
        }
    }

    public static final void b(C3297sa c3297sa, AdMetaInfo adMetaInfo) {
        C3348u9 c3348u9 = c3297sa.f25851f;
        if (c3348u9 != null) {
            c3348u9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3297sa.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void a(AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        super.a(info);
        C3246qa c3246qa = this.f27454h;
        if (c3246qa != null) {
            c3246qa.S();
        }
        this.f27455i = false;
    }

    @Override // com.inmobi.media.Uk
    public final void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3246qa c3246qa = this.f27454h;
        if (c3246qa != null) {
            kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
            c3246qa.A = watermarkData;
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piR = c3246qa.r();
            if (gestureDetectorOnGestureListenerC3228piR != null) {
                gestureDetectorOnGestureListenerC3228piR.setWatermark(watermarkData);
            }
        }
    }
}
