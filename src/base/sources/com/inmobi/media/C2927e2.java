package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C2927e2;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2927e2 extends Uk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26435h = "InMobi";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26436i = C2927e2.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2824a2 f26437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2824a2 f26438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2824a2 f26439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2824a2 f26440m;

    public final boolean a(long j10) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "checkForRefreshRate " + this);
        }
        C2824a2 c2824a2 = this.f26440m;
        if (c2824a2 == null) {
            return false;
        }
        AdConfig adConfig = c2824a2.f26891c;
        kotlin.jvm.internal.s.e(adConfig);
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            String TAG2 = this.f26436i;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            c3348u10.b(TAG2, "Early refresh request");
        }
        b(this.f26440m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String TAG3 = this.f26436i;
        kotlin.jvm.internal.s.g(TAG3, "TAG");
        C2824a2 c2824a3 = this.f26440m;
        Sb.a((byte) 1, TAG3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c2824a3 != null ? c2824a3.f26900l : null) + ")");
        C3348u9 c3348u11 = this.f25851f;
        if (c3348u11 != null) {
            String TAG4 = this.f26436i;
            kotlin.jvm.internal.s.g(TAG4, "TAG");
            C2824a2 c2824a4 = this.f26440m;
            c3348u11.b(TAG4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c2824a4 != null ? c2824a4.f26900l : null) + ")");
        }
        return false;
    }

    public final void b(InMobiBanner inMobiBanner) {
        C3365v0 c3365v0;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "displayInternal " + this);
        }
        C2824a2 c2824a2 = this.f26439l;
        if (c2824a2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piJ = c2824a2.j();
        if (gestureDetectorOnGestureListenerC3228piJ == null) {
            gestureDetectorOnGestureListenerC3228piJ = null;
        }
        if (gestureDetectorOnGestureListenerC3228piJ == null) {
            return;
        }
        Wn viewableAd = gestureDetectorOnGestureListenerC3228piJ.getViewableAd();
        C2824a2 c2824a3 = this.f26439l;
        if (c2824a3 != null && (c3365v0 = c2824a3.f26900l) != null && c3365v0.f27668j) {
            gestureDetectorOnGestureListenerC3228piJ.l();
        }
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        ViewParent parent = gestureDetectorOnGestureListenerC3228piJ.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void c(final AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f25846a = (byte) 0;
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            String TAG2 = this.f26436i;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            c3348u10.a(TAG2, "Ad load successful, providing callback");
        }
        this.f25849d.post(new Runnable() { // from class: yh.m8
            @Override // java.lang.Runnable
            public final void run() {
                C2927e2.b(this.f57837a, info);
            }
        });
    }

    @Override // com.inmobi.media.Uk
    public final AbstractC3107l1 f() {
        return q() ? this.f26439l : this.f26440m;
    }

    public final void h() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        C2824a2 c2824a2;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "canScheduleRefresh " + this);
        }
        C2824a2 c2824a3 = this.f26440m;
        if (c2824a3 == null) {
            return false;
        }
        byte b10 = c2824a3.f26890b;
        if (b10 != 4 && b10 != 1 && b10 != 2 && ((c2824a2 = this.f26439l) == null || c2824a2.f26890b != 7)) {
            return true;
        }
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            String TAG2 = this.f26436i;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            c3348u10.a(TAG2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "clear " + this);
        }
        t();
        C2824a2 c2824a2 = this.f26437j;
        if (c2824a2 != null) {
            c2824a2.d();
        }
        this.f26437j = null;
        C2824a2 c2824a3 = this.f26438k;
        if (c2824a3 != null) {
            c2824a3.d();
        }
        this.f26438k = null;
        this.f25851f = null;
        this.f26439l = null;
        this.f26440m = null;
        this.f25847b = null;
    }

    public final int k() {
        AdConfig adConfig;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "defaultRefreshInterval " + this);
        }
        AbstractC3107l1 abstractC3107l1F = f();
        if (abstractC3107l1F == null || (adConfig = abstractC3107l1F.f26891c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        String TAG = this.f26436i;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        kotlin.jvm.internal.s.c(this.f26439l, this.f26437j);
        String TAG2 = this.f26436i;
        kotlin.jvm.internal.s.g(TAG2, "TAG");
        kotlin.jvm.internal.s.c(this.f26440m, this.f26437j);
        String TAG3 = this.f26436i;
        kotlin.jvm.internal.s.g(TAG3, "TAG");
        kotlin.jvm.internal.s.c(this.f26439l, this.f26438k);
        String TAG4 = this.f26436i;
        kotlin.jvm.internal.s.g(TAG4, "TAG");
        kotlin.jvm.internal.s.c(this.f26440m, this.f26438k);
        String TAG5 = this.f26436i;
        kotlin.jvm.internal.s.g(TAG5, "TAG");
        Objects.toString(this.f26437j);
        String TAG6 = this.f26436i;
        kotlin.jvm.internal.s.g(TAG6, "TAG");
        Objects.toString(this.f26438k);
        C2824a2 c2824a2 = this.f26439l;
        return c2824a2 != null && c2824a2.f26890b == 7;
    }

    public final void m() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "pause " + this);
        }
        C2824a2 c2824a2 = this.f26439l;
        if (c2824a2 != null) {
            c2824a2.X();
        }
    }

    public final void n() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        C2824a2 c2824a2 = this.f26437j;
        if (c2824a2 != null) {
            c2824a2.Z();
        }
        C2824a2 c2824a3 = this.f26438k;
        if (c2824a3 != null) {
            c2824a3.Z();
        }
    }

    public final void o() {
        C2824a2 c2824a2;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "render " + this);
        }
        C2824a2 c2824a3 = this.f26440m;
        if (c2824a3 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(this.f26435h, String.valueOf(c2824a3.f26900l.f27659a))) {
            PublisherCallbacks publisherCallbacks = this.f25848c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c2824a2 = this.f26440m) != null) {
                c2824a2.d((byte) 1);
            }
            this.f25846a = (byte) 8;
            c2824a3.a0();
        }
    }

    public final void p() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "resume " + this);
        }
        C2824a2 c2824a2 = this.f26439l;
        if (c2824a2 != null) {
            c2824a2.Y();
        }
    }

    public final boolean q() {
        C2824a2 c2824a2 = this.f26439l;
        Byte bValueOf = c2824a2 != null ? Byte.valueOf(c2824a2.f26890b) : null;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "shouldUseForegroundUnit " + this + " state - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "submitAdShowFail " + this);
        }
        AbstractC3107l1 abstractC3107l1F = f();
        if (abstractC3107l1F != null) {
            abstractC3107l1F.d((short) 2239);
        }
    }

    public final void s() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "swapAdUnits " + this);
        }
        C2824a2 c2824a2 = this.f26439l;
        if (c2824a2 == null) {
            this.f26439l = this.f26437j;
            this.f26440m = this.f26438k;
        } else if (kotlin.jvm.internal.s.c(c2824a2, this.f26437j)) {
            this.f26439l = this.f26438k;
            this.f26440m = this.f26437j;
        } else if (kotlin.jvm.internal.s.c(c2824a2, this.f26438k)) {
            this.f26439l = this.f26437j;
            this.f26440m = this.f26438k;
        }
    }

    public final void t() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        C2824a2 c2824a2 = this.f26437j;
        if (c2824a2 != null) {
            c2824a2.c0();
        }
        C2824a2 c2824a3 = this.f26438k;
        if (c2824a3 != null) {
            c2824a3.c0();
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void b(final AdMetaInfo info) {
        kotlin.jvm.internal.s.h(info, "info");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onAdFetchSuccess " + this);
        }
        this.f25850e = info;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C2824a2 c2824a2 = this.f26440m;
        if ((c2824a2 != null ? c2824a2.b(0) : null) == null) {
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                String TAG2 = this.f26436i;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u10.b(TAG2, "backgroundAdUnit ad object is null");
            }
            a((AbstractC3107l1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        C3348u9 c3348u11 = this.f25851f;
        if (c3348u11 != null) {
            String TAG3 = this.f26436i;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            c3348u11.a(TAG3, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        this.f25849d.post(new Runnable() { // from class: yh.l8
            @Override // java.lang.Runnable
            public final void run() {
                C2927e2.a(this.f57821a, info);
            }
        });
    }

    public final void a(InMobiBanner banner) {
        C3365v0 c3365v0;
        kotlin.jvm.internal.s.h(banner, "banner");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "displayAd " + this);
        }
        C2824a2 c2824a2 = this.f26439l;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piJ = c2824a2 != null ? c2824a2.j() : null;
        if (gestureDetectorOnGestureListenerC3228piJ == null) {
            gestureDetectorOnGestureListenerC3228piJ = null;
        }
        if (gestureDetectorOnGestureListenerC3228piJ == null) {
            return;
        }
        Wn viewableAd = gestureDetectorOnGestureListenerC3228piJ.getViewableAd();
        C2824a2 c2824a3 = this.f26439l;
        if (c2824a3 != null && (c3365v0 = c2824a3.f26900l) != null && c3365v0.f27668j) {
            gestureDetectorOnGestureListenerC3228piJ.l();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3228piJ.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        C2824a2 c2824a4 = this.f26440m;
        if (c2824a4 != null) {
            c2824a4.X();
        }
        C2824a2 c2824a5 = this.f26439l;
        if (c2824a5 != null && c2824a5.f26890b == 8) {
            View view = new View(banner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(-16777216);
            if (viewGroup == null) {
                banner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            banner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        C2824a2 c2824a6 = this.f26440m;
        if (c2824a6 != null) {
            c2824a6.d();
        }
    }

    public static final void b(C2927e2 c2927e2, AdMetaInfo adMetaInfo) {
        C3348u9 c3348u9 = c2927e2.f25851f;
        if (c3348u9 != null) {
            String TAG = c2927e2.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c2927e2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            c2927e2.b((short) 2184);
        }
    }

    public final void b(short s10) {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "submitAdLoadFailed " + this);
        }
        AbstractC3107l1 abstractC3107l1F = f();
        if (abstractC3107l1F != null) {
            abstractC3107l1F.c(s10);
        }
    }

    public final int a(int i10, int i11) {
        AdConfig adConfig;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "getRefreshInterval " + this);
        }
        C2824a2 c2824a2 = this.f26440m;
        if (c2824a2 == null || (adConfig = c2824a2.f26891c) == null) {
            return i11;
        }
        return i10 < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i10;
    }

    public final void a(PublisherCallbacks callbacks, String adSize, boolean z10) {
        C2824a2 c2824a2;
        kotlin.jvm.internal.s.h(callbacks, "callbacks");
        kotlin.jvm.internal.s.h(adSize, "adSize");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "load 1 " + this);
        }
        if (kotlin.jvm.internal.s.c(this.f25847b, Boolean.FALSE)) {
            b(this.f26440m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C2824a2 c2824a3 = this.f26440m;
            if (c2824a3 != null) {
                c2824a3.b((short) 2006);
            }
            Sb.a((byte) 1, this.f26435h, "Cannot call load() API after calling load(byte[])");
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                String TAG2 = this.f26436i;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u10.b(TAG2, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.f25847b = Boolean.TRUE;
        if (this.f25848c == null) {
            this.f25848c = callbacks;
        }
        C2824a2 c2824a4 = this.f26440m;
        if (c2824a4 == null || !a(this.f26435h, String.valueOf(c2824a4.f26900l), callbacks) || (c2824a2 = this.f26440m) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.f25848c;
        if (c2824a2.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            C3348u9 c3348u11 = this.f25851f;
            if (c3348u11 != null) {
                String TAG3 = this.f26436i;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                c3348u11.d(TAG3, "AdManager state - LOADING");
            }
            this.f25846a = (byte) 1;
            this.f25850e = null;
            C2824a2 c2824a5 = this.f26440m;
            kotlin.jvm.internal.s.e(c2824a5);
            c2824a5.c(adSize);
            C2824a2 c2824a6 = this.f26440m;
            kotlin.jvm.internal.s.e(c2824a6);
            c2824a6.b(z10);
        }
    }

    @Override // com.inmobi.media.Uk
    public final void a(byte[] bArr, PublisherCallbacks callbacks) {
        C2824a2 c2824a2;
        kotlin.jvm.internal.s.h(callbacks, "callbacks");
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "load 2 " + this);
        }
        if (kotlin.jvm.internal.s.c(this.f25847b, Boolean.TRUE)) {
            Sb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3348u9 c3348u10 = this.f25851f;
            if (c3348u10 != null) {
                String TAG2 = this.f26436i;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u10.b(TAG2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.f25847b = Boolean.FALSE;
        this.f25846a = (byte) 1;
        this.f25848c = callbacks;
        if (this.f26440m != null) {
            C2824a2 c2824a3 = this.f26439l;
            if ((c2824a3 == null || !c2824a3.C()) && (c2824a2 = this.f26440m) != null && c2824a2.d((byte) 1)) {
                C3348u9 c3348u11 = this.f25851f;
                if (c3348u11 != null) {
                    String TAG3 = this.f26436i;
                    kotlin.jvm.internal.s.g(TAG3, "TAG");
                    c3348u11.a(TAG3, "timer started - load banner");
                }
                C2824a2 c2824a4 = this.f26440m;
                if (c2824a4 != null) {
                    c2824a4.E();
                }
                C2824a2 c2824a5 = this.f26440m;
                if (c2824a5 != null) {
                    c2824a5.a(bArr);
                }
            }
        }
    }

    @Override // com.inmobi.media.Uk, com.inmobi.media.AbstractC2978g1
    public final void a() {
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onAdDismissed " + this);
        }
        this.f25846a = (byte) 0;
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            String TAG2 = this.f26436i;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            c3348u10.d(TAG2, "AdManager state - CREATED");
        }
        super.a();
    }

    public static final void a(C2927e2 c2927e2, AdMetaInfo adMetaInfo) {
        C3348u9 c3348u9 = c2927e2.f25851f;
        if (c3348u9 != null) {
            String TAG = c2927e2.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c2927e2.f25848c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        C3348u9 c3348u10 = c2927e2.f25851f;
        if (c3348u10 != null) {
            String TAG2 = c2927e2.f26436i;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            c3348u10.b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC2978g1
    public final void a(int i10, final int i11, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        ViewParent parent;
        C3348u9 c3348u9 = this.f25851f;
        if (c3348u9 != null) {
            String TAG = this.f26436i;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onShowNextPodAd " + this);
        }
        C3348u9 c3348u10 = this.f25851f;
        if (c3348u10 != null) {
            String TAG2 = this.f26436i;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            c3348u10.a(TAG2, "on Show next pod ad index: " + i10);
        }
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            try {
                parent = gestureDetectorOnGestureListenerC3228pi.getParent();
            } catch (Exception unused) {
                C2824a2 c2824a2 = this.f26439l;
                if (c2824a2 != null) {
                    c2824a2.e(i11);
                }
                C2824a2 c2824a3 = this.f26439l;
                if (c2824a3 != null) {
                    c2824a3.b(i11, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C2824a2 c2824a4 = this.f26439l;
            if (c2824a4 != null) {
                c2824a4.b(i11, true);
            }
            b(inMobiBanner);
            this.f25849d.post(new Runnable() { // from class: yh.k8
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C2927e2.a(this.f57803a, i11);
                }
            });
            return;
        }
        C2824a2 c2824a5 = this.f26439l;
        if (c2824a5 != null) {
            c2824a5.e(i11);
        }
        C2824a2 c2824a6 = this.f26439l;
        if (c2824a6 != null) {
            c2824a6.b(i11, false);
        }
    }

    public final void a(Context context, Sg pubSettings, String adSize) {
        String m10Context;
        String str;
        String str2;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(pubSettings, "pubSettings");
        kotlin.jvm.internal.s.h(adSize, "adSize");
        kotlin.jvm.internal.s.h("banner", "logType");
        String TAG = this.f26436i;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        kotlin.jvm.internal.s.h("banner", "mAdType");
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
            C3365v0 c3365v0 = new C3365v0(j10, str, "banner", str4);
            c3365v0.f27662d = str3;
            c3365v0.f27661c = map;
            kotlin.jvm.internal.s.h(adSize, "<set-?>");
            c3365v0.f27666h = adSize;
            kotlin.jvm.internal.s.h(m10Context, "<set-?>");
            c3365v0.f27667i = m10Context;
            c3365v0.f27665g = string;
            c3365v0.f27668j = z10;
            c3365v0.f27669k = str5;
            String str6 = pubSettings.f25697g;
            if (str6 != null) {
                C3348u9 c3348u9 = this.f25851f;
                if (c3348u9 != null) {
                    c3348u9.a();
                }
                this.f25851f = Sh.a("banner", str6);
            }
            C2824a2 c2824a2 = this.f26437j;
            if (c2824a2 != null && this.f26438k != null) {
                c2824a2.a(context, c3365v0, this);
                C2824a2 c2824a3 = this.f26438k;
                if (c2824a3 != null) {
                    c2824a3.a(context, c3365v0, this);
                }
            } else {
                this.f26437j = new C2824a2(context, c3365v0, this);
                C2824a2 c2824a4 = new C2824a2(context, c3365v0, this);
                this.f26438k = c2824a4;
                this.f26440m = this.f26437j;
                this.f26439l = c2824a4;
            }
            C3348u9 logger = this.f25851f;
            if (logger != null) {
                C2824a2 c2824a5 = this.f26437j;
                if (c2824a5 != null) {
                    kotlin.jvm.internal.s.h(logger, "logger");
                    c2824a5.f26897i = logger;
                    C2848b0 c2848b0 = c2824a5.f26909u;
                    c2848b0.getClass();
                    kotlin.jvm.internal.s.h(logger, "logger");
                    c2848b0.f26241f = logger;
                }
                C2824a2 c2824a6 = this.f26438k;
                if (c2824a6 != null) {
                    kotlin.jvm.internal.s.h(logger, "logger");
                    c2824a6.f26897i = logger;
                    C2848b0 c2848b1 = c2824a6.f26909u;
                    c2848b1.getClass();
                    kotlin.jvm.internal.s.h(logger, "logger");
                    c2848b1.f26241f = logger;
                }
                C3348u9 c3348u10 = this.f25851f;
                if (c3348u10 != null) {
                    String str7 = this.f26436i;
                    str2 = "TAG";
                    kotlin.jvm.internal.s.g(str7, str2);
                    c3348u10.a(str7, "adding mBannerAdUnit1 to reference tracker");
                } else {
                    str2 = "TAG";
                }
                Ib ib2 = Sh.f25698a;
                C2824a2 c2824a7 = this.f26437j;
                kotlin.jvm.internal.s.e(c2824a7);
                Sh.a(c2824a7, this.f25851f);
                C3348u9 c3348u11 = this.f25851f;
                if (c3348u11 != null) {
                    String str8 = this.f26436i;
                    kotlin.jvm.internal.s.g(str8, str2);
                    c3348u11.a(str8, KPtaxpyICj.Wej);
                }
                C2824a2 c2824a8 = this.f26438k;
                kotlin.jvm.internal.s.e(c2824a8);
                Sh.a(c2824a8, this.f25851f);
            }
            WatermarkData watermarkData = this.f25852g;
            if (watermarkData != null) {
                C2824a2 c2824a9 = this.f26437j;
                if (c2824a9 != null) {
                    kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
                    c2824a9.A = watermarkData;
                    GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piR = c2824a9.r();
                    if (gestureDetectorOnGestureListenerC3228piR != null) {
                        gestureDetectorOnGestureListenerC3228piR.setWatermark(watermarkData);
                    }
                }
                C2824a2 c2824a10 = this.f26438k;
                if (c2824a10 != null) {
                    kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
                    c2824a10.A = watermarkData;
                    GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piR2 = c2824a10.r();
                    if (gestureDetectorOnGestureListenerC3228piR2 != null) {
                        gestureDetectorOnGestureListenerC3228piR2.setWatermark(watermarkData);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(C2927e2 c2927e2, int i10) throws JSONException {
        C2824a2 c2824a2 = c2927e2.f26439l;
        if (c2824a2 != null) {
            c2824a2.a(i10, false);
        }
    }

    @Override // com.inmobi.media.Uk
    public final void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
        super.a(watermarkData);
        C2824a2 c2824a2 = this.f26437j;
        if (c2824a2 != null) {
            kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
            c2824a2.A = watermarkData;
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piR = c2824a2.r();
            if (gestureDetectorOnGestureListenerC3228piR != null) {
                gestureDetectorOnGestureListenerC3228piR.setWatermark(watermarkData);
            }
        }
        C2824a2 c2824a3 = this.f26438k;
        if (c2824a3 != null) {
            kotlin.jvm.internal.s.h(watermarkData, "watermarkData");
            c2824a3.A = watermarkData;
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piR2 = c2824a3.r();
            if (gestureDetectorOnGestureListenerC3228piR2 != null) {
                gestureDetectorOnGestureListenerC3228piR2.setWatermark(watermarkData);
            }
        }
    }
}
