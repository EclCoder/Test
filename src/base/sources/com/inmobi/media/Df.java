package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Df extends Vn {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f24654g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wn f24655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2952f1 f24656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3322t9 f24657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Df(GestureDetectorOnGestureListenerC3228pi adContainer, Wn mViewableAd, InterfaceC2952f1 interfaceC2952f1, InterfaceC3322t9 interfaceC3322t9) {
        super(adContainer);
        kotlin.jvm.internal.s.h(adContainer, "adContainer");
        kotlin.jvm.internal.s.h(mViewableAd, "mViewableAd");
        this.f24655d = mViewableAd;
        this.f24656e = interfaceC2952f1;
        this.f24657f = interfaceC3322t9;
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        AdSession adSession;
        kotlin.jvm.internal.s.h(childView, "childView");
        kotlin.jvm.internal.s.h(obstructionCode, "obstructionCode");
        InterfaceC3322t9 interfaceC3322t9 = this.f24657f;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Df", "TAG");
            ((C3348u9) interfaceC3322t9).a("Df", "addFriendlyView with obstruction code: " + obstructionCode);
        }
        InterfaceC2952f1 interfaceC2952f1 = this.f24656e;
        if (interfaceC2952f1 != null) {
            C3276rf c3276rf = (C3276rf) interfaceC2952f1;
            kotlin.jvm.internal.s.h(childView, "childView");
            kotlin.jvm.internal.s.h(obstructionCode, "obstructionCode");
            if (C3276rf.a(c3276rf.f27400e) && (adSession = c3276rf.f27401f) != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
            }
        }
        this.f24655d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Wn
    public final View b() {
        return this.f24655d.b();
    }

    @Override // com.inmobi.media.Wn
    public final View c() {
        InterfaceC3322t9 interfaceC3322t9 = this.f24657f;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Df", "TAG");
            ((C3348u9) interfaceC3322t9).c("Df", "inflateView called");
        }
        return this.f24655d.c();
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
        try {
            InterfaceC3322t9 interfaceC3322t9 = this.f24657f;
            if (interfaceC3322t9 != null) {
                kotlin.jvm.internal.s.g("Df", "TAG");
                ((C3348u9) interfaceC3322t9).a("Df", "stopTrackingForImpression");
            }
            InterfaceC2952f1 interfaceC2952f1 = this.f24656e;
            if (interfaceC2952f1 != null) {
                C3276rf c3276rf = (C3276rf) interfaceC2952f1;
                AdSession adSession = c3276rf.f27401f;
                if (adSession != null) {
                    adSession.finish();
                }
                c3276rf.f27401f = null;
                c3276rf.f27400e = (byte) 3;
                c3276rf.f27398c = null;
            }
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24657f;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("Df", "TAG");
                ((C3348u9) interfaceC3322t10).b("Df", "Exception in stopTrackingForImpression with message : " + e10.getMessage());
            }
        } finally {
            this.f24655d.d();
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView) {
        AdSession adSession;
        kotlin.jvm.internal.s.h(childView, "childView");
        InterfaceC2952f1 interfaceC2952f1 = this.f24656e;
        if (interfaceC2952f1 != null) {
            C3276rf c3276rf = (C3276rf) interfaceC2952f1;
            kotlin.jvm.internal.s.h(childView, "childView");
            if (C3276rf.a(c3276rf.f27400e) && (adSession = c3276rf.f27401f) != null) {
                adSession.removeFriendlyObstruction(childView);
            }
        }
        this.f24655d.a(childView);
    }

    @Override // com.inmobi.media.Wn
    public final void a(Map map) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24657f;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Df", "TAG");
            ((C3348u9) interfaceC3322t9).a("Df", "startTrackingForImpression");
        }
        try {
            if (this.f25983c.getViewability().getOmidConfig().isOmidEnabled()) {
                Jf.f25068a.getClass();
                if (Omid.isActive()) {
                    View viewB = this.f24655d.b();
                    WebView webView = viewB instanceof WebView ? (WebView) viewB : null;
                    if (webView != null) {
                        InterfaceC3322t9 interfaceC3322t10 = this.f24657f;
                        if (interfaceC3322t10 != null) {
                            kotlin.jvm.internal.s.g("Df", "TAG");
                            ((C3348u9) interfaceC3322t10).a("Df", "creating OMSDK session");
                        }
                        InterfaceC2952f1 interfaceC2952f1 = this.f24656e;
                        if (interfaceC2952f1 != null) {
                            ((C3276rf) interfaceC2952f1).a(webView, map);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t11 = this.f24657f;
            if (interfaceC3322t11 != null) {
                kotlin.jvm.internal.s.g("Df", "TAG");
                ((C3348u9) interfaceC3322t11).b("Df", "Exception in startTrackingForImpression with message : " + e10.getMessage());
            }
        } finally {
            this.f24655d.a(map);
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.s.h(context, "context");
        this.f24655d.a(context, b10);
    }

    @Override // com.inmobi.media.Wn
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9 = this.f24657f;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("Df", "TAG");
            ((C3348u9) interfaceC3322t9).c("Df", "destroy");
        }
        WeakReference weakReference = this.f25982b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.f24656e = null;
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24657f;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("Df", "TAG");
                ((C3348u9) interfaceC3322t10).a("Df", "Exception in destroy with message", e10);
            }
        } finally {
            this.f24655d.a();
        }
    }
}
