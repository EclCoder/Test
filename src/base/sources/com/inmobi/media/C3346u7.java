package com.inmobi.media;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3346u7 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3268r7 f27601k = new C3268r7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f27602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3322t9 f27607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public N8 f27608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X7 f27609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f27610i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3294s7 f27611j = new C3294s7(this);

    public C3346u7(byte b10, String str, int i10, int i11, int i12, InterfaceC3322t9 interfaceC3322t9) {
        this.f27602a = b10;
        this.f27603b = str;
        this.f27604c = i10;
        this.f27605d = i11;
        this.f27606e = i12;
        this.f27607f = interfaceC3322t9;
    }

    public final void a(View view) {
        N8 n10;
        kotlin.jvm.internal.s.h(view, "view");
        InterfaceC3322t9 interfaceC3322t9 = this.f27607f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (kotlin.jvm.internal.s.c(this.f27603b, MimeTypes.BASE_TYPE_VIDEO) || kotlin.jvm.internal.s.c(this.f27603b, MimeTypes.BASE_TYPE_AUDIO) || (n10 = this.f27608g) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(view, "view");
        n10.f25324a.remove(view);
        n10.f25325b.remove(view);
        n10.f25326c.a(view);
        if (n10.f25324a.isEmpty()) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27607f;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            N8 n11 = this.f27608g;
            if (n11 != null) {
                n11.f25324a.clear();
                n11.f25325b.clear();
                n11.f25326c.a();
                n11.f25328e.removeMessages(0);
                n11.f25326c.b();
            }
            this.f27608g = null;
        }
    }

    public final void b(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        InterfaceC3322t9 interfaceC3322t9 = this.f27607f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        X7 x10 = this.f27609h;
        if (x10 != null) {
            x10.a(view);
            if (x10.f26875a.isEmpty()) {
                InterfaceC3322t9 interfaceC3322t10 = this.f27607f;
                if (interfaceC3322t10 != null) {
                    ((C3348u9) interfaceC3322t10).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                X7 x11 = this.f27609h;
                if (x11 != null) {
                    x11.b();
                }
                this.f27609h = null;
            }
        }
        this.f27610i.remove(view);
    }

    public final void a(View view, View token, InterfaceC2898co listener, AdConfig.ViewabilityConfig config, boolean z10) {
        int companionVisibilityMinPercentageViewed;
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(token, "token");
        kotlin.jvm.internal.s.h(listener, "listener");
        kotlin.jvm.internal.s.h(config, "config");
        InterfaceC3322t9 interfaceC3322t9 = this.f27607f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        X7 x10 = this.f27609h;
        if (x10 == null) {
            if (z10) {
                x10 = new W3(config, this.f27607f);
            } else {
                x10 = new X7(config, (byte) 1, this.f27607f);
            }
            this.f27609h = x10;
        }
        C3320t7 c3320t7 = new C3320t7(this);
        InterfaceC3322t9 interfaceC3322t10 = x10.f26878d;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        x10.f26882h = c3320t7;
        this.f27610i.put(view, listener);
        if (z10) {
            companionVisibilityMinPercentageViewed = config.getCompanionVisibilityMinPercentageViewed();
        } else {
            companionVisibilityMinPercentageViewed = this.f27606e;
        }
        kotlin.jvm.internal.s.h(view, "view");
        x10.a(view, view, token, companionVisibilityMinPercentageViewed);
    }

    public final void a() {
        InterfaceC3322t9 interfaceC3322t9 = this.f27607f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("HtmlAdTracker", "onActivityStarted");
        }
        N8 n10 = this.f27608g;
        if (n10 != null) {
            String TAG = n10.f25327d;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            for (Map.Entry entry : n10.f25324a.entrySet()) {
                View view = (View) entry.getKey();
                L8 l10 = (L8) entry.getValue();
                X7 x10 = n10.f25326c;
                View view2 = l10.f25192a;
                int i10 = l10.f25193b;
                x10.getClass();
                kotlin.jvm.internal.s.h(view, "view");
                x10.a(view, view, view2, i10);
            }
            if (!n10.f25328e.hasMessages(0)) {
                n10.f25328e.postDelayed(n10.f25329f, n10.f25330g);
            }
            n10.f25326c.f();
        }
        X7 x11 = this.f27609h;
        if (x11 != null) {
            x11.f();
        }
    }

    public final N8 a(byte b10, AdConfig.ViewabilityConfig viewabilityConfig) {
        N8 n10 = this.f27608g;
        if (n10 != null) {
            return n10;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f27607f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("HtmlAdTracker", "creating Visibility Tracker for " + ((int) b10));
        }
        X7 x10 = new X7(viewabilityConfig, b10, this.f27607f);
        InterfaceC3322t9 interfaceC3322t10 = this.f27607f;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).c("HtmlAdTracker", "creating Impression Tracker for " + ((int) b10));
        }
        N8 n11 = new N8(viewabilityConfig, x10, this.f27611j);
        this.f27608g = n11;
        return n11;
    }
}
