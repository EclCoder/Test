package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.W1;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class W1 extends Uk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public N1 f25917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N1 f25918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public N1 f25919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public N1 f25920k;

    public W1(InMobiAudio.a callbacks) {
        kotlin.jvm.internal.s.h(callbacks, "callbacks");
        this.f25848c = callbacks;
    }

    public static final void a(W1 w10, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w10.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(W1 w10, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w10.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void c(final AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f25846a = (byte) 0;
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            String str2 = X1.f25991a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            c3348u10.d(str2, "AdManager state - CREATED");
        }
        C3348u9 c3348u11 = this.f25851f;
        if (c3348u11 != null) {
            String str3 = X1.f25991a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            c3348u11.a(str3, "Ad load successful, providing callback");
        }
        this.f25849d.post(new Runnable() { // from class: yh.m5
            @Override // java.lang.Runnable
            public final void run() {
                W1.b(this.f57834a, info);
            }
        });
    }

    @Override // com.inmobi.media.Uk
    public final AbstractC3107l1 f() {
        return m() ? this.f25919j : this.f25920k;
    }

    @Override // com.inmobi.media.Uk
    public final void g() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "submitAdLoadCalled " + this);
        }
        N1 n10 = this.f25920k;
        if (n10 != null) {
            n10.P();
        }
    }

    public final void h() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "clear " + this);
        }
        p();
        N1 n10 = this.f25917h;
        if (n10 != null) {
            n10.d();
        }
        this.f25917h = null;
        N1 n11 = this.f25918i;
        if (n11 != null) {
            n11.d();
        }
        this.f25918i = null;
        this.f25919j = null;
        this.f25920k = null;
        this.f25847b = null;
    }

    public final void i() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "pause " + this);
        }
        N1 n10 = this.f25919j;
        if (n10 != null) {
            n10.X();
        }
    }

    public final void j() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.c(str, "registerLifeCycleCallbacks " + this);
        }
        N1 n10 = this.f25917h;
        if (n10 != null) {
            n10.Z();
        }
        N1 n11 = this.f25918i;
        if (n11 != null) {
            n11.Z();
        }
    }

    public final void k() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "loadIntoView " + this);
        }
        N1 n10 = this.f25920k;
        if (n10 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a("InMobi", String.valueOf(n10.f26900l.f27659a))) {
            this.f25846a = (byte) 8;
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                String str2 = X1.f25991a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                c3348u10.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            n10.a0();
        }
    }

    public final void l() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "resume " + this);
        }
        N1 n10 = this.f25919j;
        if (n10 != null) {
            n10.Y();
        }
    }

    public final boolean m() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.c(str, "shouldUseForegroundUnit " + this);
        }
        N1 n10 = this.f25919j;
        Byte bValueOf = n10 != null ? Byte.valueOf(n10.f26890b) : null;
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            String str2 = X1.f25991a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            c3348u10.d(str2, "State - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "submitAdShowCalled " + this);
        }
        N1 n10 = this.f25920k;
        if (n10 != null) {
            n10.R();
        }
    }

    public final void o() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "swapAdUnits " + this);
        }
        N1 n10 = this.f25919j;
        if (kotlin.jvm.internal.s.c(n10, this.f25917h)) {
            this.f25919j = this.f25918i;
            this.f25920k = this.f25917h;
        } else if (kotlin.jvm.internal.s.c(n10, this.f25918i) || n10 == null) {
            this.f25919j = this.f25917h;
            this.f25920k = this.f25918i;
        }
    }

    public final void p() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        N1 n10 = this.f25917h;
        if (n10 != null) {
            n10.c0();
        }
        N1 n11 = this.f25918i;
        if (n11 != null) {
            n11.c0();
        }
    }

    public final boolean a(long j10) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.c(str, "checkForRefreshRate " + this);
        }
        if (this.f25920k == null) {
            return false;
        }
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        int minRefreshInterval = ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getAudio().getMinRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.f25920k, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        String str2 = X1.f25991a;
        kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
        N1 n10 = this.f25920k;
        Sb.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n10 != null ? n10.f26900l : null) + ")");
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            N1 n11 = this.f25920k;
            c3348u10.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n11 != null ? n11.f26900l : null) + ")");
        }
        return false;
    }

    public final void b(String adSize) {
        kotlin.jvm.internal.s.h(adSize, "adSize");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "load 1 " + this);
        }
        N1 n10 = this.f25920k;
        if (n10 != null && a("InMobi", String.valueOf(n10.f26900l.f27659a), this.f25848c) && n10.d((byte) 1)) {
            this.f25846a = (byte) 1;
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                String str2 = X1.f25991a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                c3348u10.d(str2, "AdManager state - LOADING");
            }
            this.f25850e = null;
            n10.c(adSize);
            n10.b(false);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void b(final AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.c(str, "onAdFetchSuccess " + this);
        }
        N1 n10 = this.f25920k;
        if ((n10 != null ? n10.b(0) : null) == null) {
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                String str2 = X1.f25991a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                c3348u10.b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC3107l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        C3348u9 c3348u11 = this.f25851f;
        if (c3348u11 != null) {
            String str3 = X1.f25991a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            c3348u11.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        this.f25849d.post(new Runnable() { // from class: yh.n5
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f57849a, info);
            }
        });
    }

    public final void a(RelativeLayout relativeLayout) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piJ;
        C3365v0 c3365v0;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "displayAd " + this);
        }
        N1 n10 = this.f25919j;
        if (n10 == null || (gestureDetectorOnGestureListenerC3228piJ = n10.j()) == null) {
            return;
        }
        Wn viewableAd = gestureDetectorOnGestureListenerC3228piJ.getViewableAd();
        N1 n11 = this.f25919j;
        if (n11 != null && (c3365v0 = n11.f26900l) != null && c3365v0.f27668j) {
            gestureDetectorOnGestureListenerC3228piJ.l();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3228piJ.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a((Map) null);
        N1 n12 = this.f25920k;
        if (n12 != null) {
            n12.X();
        }
        if (viewGroup == null) {
            relativeLayout.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        N1 n13 = this.f25920k;
        if (n13 != null) {
            n13.d();
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void b() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "onAdShowFailed " + this);
        }
        this.f25849d.post(new Runnable() { // from class: yh.k5
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f57801a);
            }
        });
    }

    public final void b(RelativeLayout relativeLayout) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "showAudioAd");
        }
        N1 n10 = this.f25919j;
        if (n10 != null && n10.f26890b == 7) {
            String str2 = X1.f25991a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            Sb.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                c3348u10.b(str2, "ad is active");
            }
            N1 n11 = this.f25920k;
            if (n11 != null) {
                n11.f((short) 15);
                return;
            }
            return;
        }
        N1 n12 = this.f25920k;
        if (n12 != null) {
            C3348u9 c3348u11 = n12.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u11.c("l1", "canProceedToShow");
            }
            if (n12.A()) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                Sb.a((byte) 1, "l1", "Ad Show has failed because current ad is expired. Please call load() again.");
                C3348u9 c3348u12 = n12.f26897i;
                if (c3348u12 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u12.b("l1", "ad is expired");
                }
                n12.d0();
                return;
            }
            byte b10 = n12.f26890b;
            if (b10 == 1 || b10 == 2) {
                Sb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                C3348u9 c3348u13 = n12.f26897i;
                if (c3348u13 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u13.b("l1", "ad is not ready");
                }
                C3348u9 c3348u14 = n12.f26897i;
                if (c3348u14 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u14.a("l1", "callback - onShowFailure");
                }
                n12.f((short) 2152);
                return;
            }
            if (b10 == 3) {
                Sb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n12.f((short) 0);
                C3348u9 c3348u15 = n12.f26897i;
                if (c3348u15 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u15.a("l1", "callback - onShowFailure");
                }
                C3348u9 c3348u16 = n12.f26897i;
                if (c3348u16 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u16.b("l1", "ad is failed");
                    return;
                }
                return;
            }
            if (b10 == 8) {
                Sb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n12.f((short) 0);
                C3348u9 c3348u17 = n12.f26897i;
                if (c3348u17 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u17.a("l1", "callback - onShowFailure");
                }
                C3348u9 c3348u18 = n12.f26897i;
                if (c3348u18 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u18.b("l1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b10 == 0) {
                Sb.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                n12.f((short) 0);
                C3348u9 c3348u19 = n12.f26897i;
                if (c3348u19 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u19.a("l1", "callback - onShowFailure");
                }
                C3348u9 c3348u20 = n12.f26897i;
                if (c3348u20 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u20.b("l1", "show called before load");
                    return;
                }
                return;
            }
            o();
            a(relativeLayout);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void a() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "onAdDismissed " + this);
        }
        this.f25846a = (byte) 0;
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            String str2 = X1.f25991a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            c3348u10.d(str2, "AdManager state - CREATED");
        }
        C3348u9 c3348u11 = this.f25851f;
        if (c3348u11 != null) {
            c3348u11.a();
        }
        super.a();
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void a(AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "onAdDisplayed");
        }
        super.a(info);
        AbstractC3107l1 abstractC3107l1F = f();
        if (abstractC3107l1F != null) {
            abstractC3107l1F.S();
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void a(AbstractC3107l1 abstractC3107l1, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.s.h(status, "status");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.b(str, "onAdLoadFailed");
        }
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            c3348u10.a();
        }
    }

    public static final void a(W1 w10) {
        C3348u9 c3348u9 = w10.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = w10.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3348u9 c3348u10 = w10.f25851f;
        if (c3348u10 != null) {
            c3348u10.a();
        }
    }

    public final void a(final InMobiAudio audio) {
        kotlin.jvm.internal.s.h(audio, "audio");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(audio);
            } else {
                this.f25849d.post(new Runnable() { // from class: yh.l5
                    @Override // java.lang.Runnable
                    public final void run() {
                        W1.a(this.f57818a, audio);
                    }
                });
            }
        } catch (Exception e10) {
            N1 n10 = this.f25920k;
            if (n10 != null) {
                n10.f((short) 26);
            }
            String str2 = X1.f25991a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            Sb.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                c3348u10.b(str2, "Show failed with unexpected error: " + e10.getMessage());
            }
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    public final void b(short s10) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.b(str, "submitAdLoadFailed " + this);
        }
        N1 n10 = this.f25920k;
        if (n10 != null) {
            n10.c((short) 15);
        }
    }

    @Override // com.inmobi.media.Uk
    public final void a(short s10) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String str = X1.f25991a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            c3348u9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        N1 n10 = this.f25920k;
        if (n10 != null) {
            n10.b(s10);
        }
    }

    public final void a(Context context, Sg pubSettings, String adSize) {
        String m10Context;
        String str;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(pubSettings, "pubSettings");
        kotlin.jvm.internal.s.h(adSize, "adSize");
        String str2 = X1.f25991a;
        kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
        kotlin.jvm.internal.s.h(MimeTypes.BASE_TYPE_AUDIO, "mAdType");
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        kotlin.jvm.internal.s.h(context, "context");
        if (context instanceof Activity) {
            m10Context = "activity";
        } else {
            m10Context = "others";
        }
        kotlin.jvm.internal.s.h(m10Context, "m10Context");
        long j10 = pubSettings.f25691a;
        String str3 = pubSettings.f25692b;
        Map map = pubSettings.f25693c;
        kotlin.jvm.internal.s.h(adSize, "adSize");
        boolean z10 = pubSettings.f25694d;
        String str4 = pubSettings.f25697g;
        String str5 = pubSettings.f25695e;
        if (j10 != Long.MIN_VALUE) {
            if (map == null || (str = (String) map.get("tp")) == null) {
                str = "";
            }
            C3365v0 c3365v0 = new C3365v0(j10, str, MimeTypes.BASE_TYPE_AUDIO, str4);
            c3365v0.f27662d = str3;
            c3365v0.f27661c = map;
            kotlin.jvm.internal.s.h(adSize, "<set-?>");
            c3365v0.f27666h = adSize;
            kotlin.jvm.internal.s.h(m10Context, "<set-?>");
            c3365v0.f27667i = m10Context;
            c3365v0.f27665g = string;
            c3365v0.f27668j = z10;
            c3365v0.f27669k = str5;
            N1 n10 = this.f25917h;
            if (n10 != null && this.f25918i != null) {
                n10.a(context, c3365v0, this);
                N1 n11 = this.f25918i;
                if (n11 != null) {
                    n11.a(context, c3365v0, this);
                }
            } else {
                this.f25917h = new N1(context, c3365v0, this);
                this.f25918i = new N1(context, c3365v0, this);
                this.f25920k = this.f25917h;
            }
            String str6 = pubSettings.f25697g;
            if (str6 != null) {
                C3348u9 c3348u9 = this.f25851f;
                if (c3348u9 != null) {
                    c3348u9.a();
                }
                C3348u9 c3348u9A = Sh.a(MimeTypes.BASE_TYPE_AUDIO, str6);
                this.f25851f = c3348u9A;
                if (c3348u9A != null) {
                    kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                    c3348u9A.a(str2, "adding audioAdUnit1 to reference tracker");
                }
                N1 n12 = this.f25917h;
                kotlin.jvm.internal.s.e(n12);
                Sh.a(n12, this.f25851f);
                C3348u9 c3348u10 = this.f25851f;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                    c3348u10.a(str2, "adding audioAdUnit2 to reference tracker");
                }
                N1 n13 = this.f25918i;
                kotlin.jvm.internal.s.e(n13);
                Sh.a(n13, this.f25851f);
                return;
            }
            return;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(W1 w10, RelativeLayout relativeLayout) {
        w10.b(relativeLayout);
    }
}
