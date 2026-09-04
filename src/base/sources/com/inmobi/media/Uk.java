package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.Uk;
import java.util.HashMap;
import java.util.Map;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Uk extends AbstractC2978g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f25846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f25847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PublisherCallbacks f25848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f25849d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdMetaInfo f25850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3348u9 f25851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WatermarkData f25852g;

    public static final void a(AbstractC3107l1 abstractC3107l1, Uk uk2, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC3107l1 != null) {
            abstractC3107l1.b((byte) 1);
        }
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        C3348u9 c3348u10 = uk2.f25851f;
        if (c3348u10 != null) {
            c3348u10.a();
        }
    }

    public final void b(final AbstractC3107l1 abstractC3107l1, final InMobiAdRequestStatus status) {
        kotlin.jvm.internal.s.h(status, "status");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onLoadFailure " + this);
        }
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u10.d("Uk", "AdManager state - LOAD_FAILED");
        }
        this.f25846a = (byte) 3;
        this.f25849d.post(new Runnable() { // from class: yh.z4
            @Override // java.lang.Runnable
            public final void run() {
                Uk.a(abstractC3107l1, this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void c() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdWillShow " + this);
        }
        byte b10 = this.f25846a;
        if (b10 == 4 || b10 == 5) {
            return;
        }
        this.f25849d.post(new Runnable() { // from class: yh.d5
            @Override // java.lang.Runnable
            public final void run() {
                Uk.b(this.f57657a);
            }
        });
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u10.d("Uk", "AdManager state - WILL_DISPLAY");
        }
        this.f25846a = (byte) 4;
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void e() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onUserLeftApplication " + this);
        }
        this.f25849d.post(new Runnable() { // from class: yh.c5
            @Override // java.lang.Runnable
            public final void run() {
                Uk.c(this.f57639a);
            }
        });
    }

    public abstract AbstractC3107l1 f();

    public void g() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "submitAdLoadCalled " + this);
        }
        AbstractC3107l1 abstractC3107l1F = f();
        if (abstractC3107l1F != null) {
            abstractC3107l1F.P();
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void a(final InMobiAdRequestStatus status) {
        kotlin.jvm.internal.s.h(status, "status");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdFetchFailed " + this);
        }
        this.f25846a = (byte) 3;
        this.f25849d.post(new Runnable() { // from class: yh.g5
            @Override // java.lang.Runnable
            public final void run() {
                Uk.a(this.f57730a, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public void b(AdMetaInfo info) {
        AbstractC3107l1 abstractC3107l1F;
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdFetchSuccess " + this);
        }
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u10.d("Uk", "AdManager state - FETCHED");
        }
        this.f25846a = (byte) 7;
        PublisherCallbacks publisherCallbacks = this.f25848c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (abstractC3107l1F = f()) == null) {
            return;
        }
        abstractC3107l1F.b((byte) 2);
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdLoadSucceeded " + this);
        }
        this.f25850e = info;
        AbstractC3107l1 abstractC3107l1F = f();
        if (abstractC3107l1F != null) {
            abstractC3107l1F.b((byte) 1);
        }
    }

    public static final void a(Uk uk2, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        C3348u9 c3348u10 = uk2.f25851f;
        if (c3348u10 != null) {
            c3348u10.a();
        }
    }

    public static final void c(Uk uk2) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    public static final void b(Uk uk2) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public void a(final AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdDisplayed " + this);
        }
        if (this.f25846a != 5) {
            this.f25850e = info;
            this.f25849d.post(new Runnable() { // from class: yh.e5
                @Override // java.lang.Runnable
                public final void run() {
                    Uk.a(this.f57687a, info);
                }
            });
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("Uk", "TAG");
                c3348u10.d("Uk", "AdManager state - DISPLAYED");
            }
            this.f25846a = (byte) 5;
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void b(final HashMap rewards) {
        kotlin.jvm.internal.s.h(rewards, "rewards");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdRewardActionCompleted " + this);
        }
        this.f25849d.post(new Runnable() { // from class: yh.x4
            @Override // java.lang.Runnable
            public final void run() {
                Uk.b(this.f58001a, rewards);
            }
        });
    }

    public static final void b(Uk uk2, Map map) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(map);
        }
    }

    public static final void a(Uk uk2, AdMetaInfo adMetaInfo) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public void a(AbstractC3107l1 abstractC3107l1, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.s.h(status, "status");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdLoadFailed " + this);
        }
        b(abstractC3107l1, status);
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void a(final HashMap params) {
        kotlin.jvm.internal.s.h(params, "params");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdInteraction " + this);
        }
        this.f25849d.post(new Runnable() { // from class: yh.a5
            @Override // java.lang.Runnable
            public final void run() {
                Uk.a(this.f57595a, params);
            }
        });
    }

    public static final void a(Uk uk2, Map map) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public final void a(PublisherCallbacks callbacks) {
        kotlin.jvm.internal.s.h(callbacks, "callbacks");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "getSignals " + this);
        }
        if (f() != null) {
            this.f25848c = callbacks;
            callbacks.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        C3246qa c3246qa;
        kotlin.jvm.internal.s.h(callbacks, "callbacks");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "load " + this);
        }
        if (kotlin.jvm.internal.s.c(this.f25847b, Boolean.TRUE)) {
            Sb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("Uk", "TAG");
                c3348u10.a("Uk", "Cannot call load(byte[]) API after load() API is called");
            }
            C3297sa c3297sa = (C3297sa) this;
            b(c3297sa.f27454h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3246qa c3246qa2 = c3297sa.f27454h;
            if (c3246qa2 != null) {
                c3246qa2.b((short) 2140);
                return;
            }
            return;
        }
        this.f25847b = Boolean.FALSE;
        this.f25846a = (byte) 1;
        C3348u9 logger = this.f25851f;
        if (logger != null && (c3246qa = ((C3297sa) this).f27454h) != null) {
            kotlin.jvm.internal.s.h(logger, "logger");
            c3246qa.f26897i = logger;
            C2848b0 c2848b0 = c3246qa.f26909u;
            c2848b0.getClass();
            kotlin.jvm.internal.s.h(logger, "logger");
            c2848b0.f26241f = logger;
        }
        C3297sa c3297sa2 = (C3297sa) this;
        C3246qa c3246qa3 = c3297sa2.f27454h;
        if (c3246qa3 == null || !c3246qa3.d((byte) 1)) {
            return;
        }
        C3348u9 c3348u11 = this.f25851f;
        if (c3348u11 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u11.a("Uk", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.f25848c = callbacks;
        C3246qa c3246qa4 = c3297sa2.f27454h;
        if (c3246qa4 != null) {
            c3246qa4.a(bArr);
        }
    }

    public void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.f25852g = watermarkData;
    }

    public final boolean a(String tag, String placementString, PublisherCallbacks publisherCallbacks) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(placementString, "placementString");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            c3348u9.c(tag, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.f25848c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            Sb.a((byte) 1, "Uk", "preload() and load() cannot be called on the same instance, please use a different instance.");
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                c3348u10.b(tag, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            AbstractC3107l1 abstractC3107l1F = f();
            if (abstractC3107l1F != null) {
                abstractC3107l1F.b((short) 2005);
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b10 = this.f25846a;
        if (b10 == 8) {
            Sb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3348u9 c3348u11 = this.f25851f;
            if (c3348u11 != null) {
                c3348u11.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC3107l1 abstractC3107l1F2 = f();
            if (abstractC3107l1F2 != null) {
                abstractC3107l1F2.b((short) 2002);
            }
            return false;
        }
        if (b10 == 1) {
            Sb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3348u9 c3348u12 = this.f25851f;
            if (c3348u12 != null) {
                c3348u12.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC3107l1 abstractC3107l1F3 = f();
            if (abstractC3107l1F3 != null) {
                abstractC3107l1F3.b((short) 2001);
            }
            return false;
        }
        if (b10 != 5) {
            return true;
        }
        Sb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        C3348u9 c3348u13 = this.f25851f;
        if (c3348u13 != null) {
            c3348u13.b(tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        AbstractC3107l1 abstractC3107l1F4 = f();
        if (abstractC3107l1F4 != null) {
            abstractC3107l1F4.c((short) 2003);
        }
        return false;
    }

    public final boolean a(String tag, String placementString) {
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(placementString, "placementString");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "canRender " + this);
        }
        byte b10 = this.f25846a;
        if (b10 == 1) {
            Sb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("Uk", "TAG");
                c3348u10.b("Uk", "adload in progress");
            }
            AbstractC3107l1 abstractC3107l1F = f();
            if (abstractC3107l1F != null) {
                abstractC3107l1F.c((short) 2129);
            }
            return false;
        }
        if (b10 == 8) {
            Sb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3348u9 c3348u11 = this.f25851f;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("Uk", "TAG");
                c3348u11.b("Uk", "ad loading into view is in progress");
            }
            AbstractC3107l1 abstractC3107l1F2 = f();
            if (abstractC3107l1F2 != null) {
                abstractC3107l1F2.c((short) 2164);
            }
            return false;
        }
        if (b10 != 5) {
            if (b10 == 7) {
                return true;
            }
            C3348u9 c3348u12 = this.f25851f;
            if (c3348u12 != null) {
                kotlin.jvm.internal.s.g("Uk", "TAG");
                c3348u12.b("Uk", "ad in illegal state");
            }
            AbstractC3107l1 abstractC3107l1F3 = f();
            if (abstractC3107l1F3 != null) {
                abstractC3107l1F3.c((short) 2165);
            }
            AbstractC3107l1 abstractC3107l1F4 = f();
            if (abstractC3107l1F4 != null) {
                abstractC3107l1F4.K();
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        Sb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        C3348u9 c3348u13 = this.f25851f;
        if (c3348u13 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u13.b("Uk", "ad active before renderAd");
        }
        AbstractC3107l1 abstractC3107l1F5 = f();
        if (abstractC3107l1F5 != null) {
            abstractC3107l1F5.c((short) 2130);
        }
        AbstractC3107l1 abstractC3107l1F6 = f();
        if (abstractC3107l1F6 != null) {
            abstractC3107l1F6.K();
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        return false;
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public void a() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "onAdDismissed " + this);
        }
        this.f25849d.post(new Runnable() { // from class: yh.b5
            @Override // java.lang.Runnable
            public final void run() {
                Uk.a(this.f57615a);
            }
        });
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            c3348u10.a();
        }
    }

    public static final void a(Uk uk2) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        C3348u9 c3348u10 = uk2.f25851f;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u10.b("Uk", "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void a(final C3437xk c3437xk) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", XTkUEXuiK.OfGHogvYUJS);
            c3348u9.c("Uk", "onAdImpression " + this);
        }
        this.f25849d.post(new Runnable() { // from class: yh.f5
            @Override // java.lang.Runnable
            public final void run() {
                Uk.a(this.f57707a, c3437xk);
            }
        });
    }

    public static final void a(Uk uk2, C3437xk c3437xk) {
        if (uk2.f25848c == null) {
            C3348u9 c3348u9 = uk2.f25851f;
            if (c3348u9 != null) {
                kotlin.jvm.internal.s.g("Uk", "TAG");
                c3348u9.b("Uk", "callback is null");
            }
            if (c3437xk != null) {
                c3437xk.b();
                return;
            }
            return;
        }
        C3348u9 c3348u10 = uk2.f25851f;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u10.a("Uk", "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c3437xk);
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void a(final V1 audioStatusInternal) {
        kotlin.jvm.internal.s.h(audioStatusInternal, "audioStatusInternal");
        this.f25849d.post(new Runnable() { // from class: yh.y4
            @Override // java.lang.Runnable
            public final void run() {
                Uk.a(this.f58018a, audioStatusInternal);
            }
        });
    }

    public static final void a(Uk uk2, V1 v10) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onAudioStatusChanged - " + v10.f25868a);
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(v10);
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void a(final String log) {
        kotlin.jvm.internal.s.h(log, "log");
        this.f25849d.post(new Runnable() { // from class: yh.h5
            @Override // java.lang.Runnable
            public final void run() {
                Uk.a(this.f57750a, log);
            }
        });
    }

    public static final void a(Uk uk2, String str) {
        C3348u9 c3348u9 = uk2.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.a("Uk", "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = uk2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public void a(short s10) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            kotlin.jvm.internal.s.g("Uk", "TAG");
            c3348u9.c("Uk", "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC3107l1 abstractC3107l1F = f();
        if (abstractC3107l1F != null) {
            abstractC3107l1F.b(s10);
        }
    }
}
