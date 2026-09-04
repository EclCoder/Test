package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;

/* JADX INFO: renamed from: com.inmobi.media.rd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3274rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3300sd f27390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2885cb f27394e;

    public C3274rd(C3300sd landingPageModel) {
        kotlin.jvm.internal.s.h(landingPageModel, "landingPageModel");
        this.f27390a = landingPageModel;
        C3223pd c3223pd = new C3223pd(this);
        C3249qd c3249qd = new C3249qd(this);
        this.f27394e = new C2885cb(landingPageModel.f27459a, new C2911db(false, landingPageModel.f27462d.f26674i, landingPageModel.f27460b.f24811a.f27160b.getCctEnabled(), 16), c3223pd, c3249qd, landingPageModel.f27462d, landingPageModel.f27465g, 128);
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f27391b = jElapsedRealtime;
        InterfaceC3322t9 interfaceC3322t9 = this.f27390a.f27465g;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + jElapsedRealtime + ", lastClickedAssetUrl=" + this.f27392c);
        }
        String str = this.f27392c;
        if (str != null) {
            a(str, this.f27393d);
        }
    }

    public final void b(String url, String str) {
        kotlin.jvm.internal.s.h(url, "url");
        InterfaceC3322t9 interfaceC3322t9 = this.f27390a.f27465g;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("PublisherViewClickHandler", "handleNativeAssetClickUrl: url=" + url + KPtaxpyICj.GWKUNNDzm + str);
        }
        this.f27392c = url;
        this.f27393d = str;
        C3300sd c3300sd = this.f27390a;
        if (c3300sd.f27460b.f24811a.f27159a.f25696f) {
            InterfaceC3322t9 interfaceC3322t10 = c3300sd.f27465g;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            ((AbstractC3002h) this.f27390a.f27464f).a(gl.l0.h());
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = c3300sd.f27465g;
        if (interfaceC3322t11 != null) {
            ((C3348u9) interfaceC3322t11).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        ((AbstractC3002h) this.f27390a.f27464f).a(gl.l0.h());
        a();
    }

    public final void a(String str, String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f27390a.f27465g;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + URLUtil.isNetworkUrl(str));
        }
        C2859bb c2859bbA = C2885cb.a(this.f27394e, "nativeOpen", (String) null, str, (C2988gb) null, 24);
        InterfaceC3322t9 interfaceC3322t10 = this.f27390a.f27465g;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a("PublisherViewClickHandler", "processOpenRequest result: " + c2859bbA.f26255a);
        }
        if (c2859bbA.f26255a == 1) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27390a.f27465g;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        if (str2 != null) {
            InterfaceC3322t9 interfaceC3322t12 = this.f27390a.f27465g;
            if (interfaceC3322t12 != null) {
                ((C3348u9) interfaceC3322t12).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: " + str2);
            }
            a(str2, null);
            return;
        }
        InterfaceC3322t9 interfaceC3322t13 = this.f27390a.f27465g;
        if (interfaceC3322t13 != null) {
            ((C3348u9) interfaceC3322t13).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
        }
    }

    public final void b() {
        C3300sd c3300sd = this.f27390a;
        InterfaceC3322t9 interfaceC3322t9 = c3300sd.f27465g;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("PublisherViewClickHandler", "takeAction called, isLockScreen=" + c3300sd.f27460b.f24811a.f27159a.f25696f);
        }
        if (this.f27390a.f27460b.f24811a.f27159a.f25696f) {
            a();
        }
    }

    public final void a(Intent intent) {
        C3300sd c3300sd = this.f27390a;
        InterfaceC3322t9 interfaceC3322t9 = c3300sd.f27465g;
        if (interfaceC3322t9 != null) {
            G g10 = c3300sd.f27460b;
            ((C3348u9) interfaceC3322t9).a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + g10.f24815e + ", placementId=" + g10.f24811a.f27159a.f25691a);
        }
        intent.putExtra("creativeId", this.f27390a.f27460b.f24815e);
        intent.putExtra("impressionId", this.f27390a.f27460b.f24823m.f24740b);
        intent.putExtra("placementId", this.f27390a.f27460b.f24811a.f27159a.f25691a);
        intent.putExtra("supportLockScreen", this.f27390a.f27461c);
        Context context = Xi.f26021a;
        Context context2 = this.f27390a.f27459a;
        kotlin.jvm.internal.s.h(context2, "context");
        kotlin.jvm.internal.s.h(intent, "intent");
        if (!(context2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context2.startActivity(intent);
        InterfaceC3322t9 interfaceC3322t10 = this.f27390a.f27465g;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }
}
