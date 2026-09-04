package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.inmobi.media.Ca;
import com.inmobi.media.GestureDetectorOnGestureListenerC3228pi;
import com.inmobi.media.Ve;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qd.qPi.SVWsZyNSAChGIA;
import tn.xQIL.Saucuwx;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f24583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3322t9 f24585c;

    public Ca(int i10, GestureDetectorOnGestureListenerC3228pi mRenderView) {
        kotlin.jvm.internal.s.h(mRenderView, "mRenderView");
        this.f24583a = mRenderView;
        this.f24584b = i10;
    }

    public static final void b(Ca ca2, String str, String str2) {
        C2885cb.a(ca2.f24583a.getLandingPageHandler(), com.vungle.ads.internal.presenter.g.OPEN, str, str2, (C2988gb) null, 24);
    }

    public static final void c(Ca ca2, String str, String str2) {
        C2988gb c2988gb;
        try {
            C3014hb c3014hb = ca2.f24583a.getLandingPageHandler().f26321f;
            if (c3014hb != null) {
                String strA = Xa.a(str2);
                C2885cb landingPageHandler = ca2.f24583a.getLandingPageHandler();
                int i10 = landingPageHandler.f26324i + 1;
                landingPageHandler.f26324i = i10;
                c2988gb = new C2988gb(c3014hb, strA, i10, SystemClock.elapsedRealtime());
            } else {
                c2988gb = null;
            }
            if (c2988gb != null) {
                c2988gb.f26602f = "IN_NATIVE";
            }
            ca2.f24583a.getLandingPageHandler().d("openEmbedded", str, str2, c2988gb);
        } catch (Exception e10) {
            ca2.f24583a.a(str, "Unexpected error", "openEmbedded");
            Sb.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str3, "SDK encountered unexpected error in handling openEmbedded() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void d(Ca ca2, String str, String str2) {
        C2885cb.a(ca2.f24583a.getLandingPageHandler(), "openWithoutTracker", str, str2, (C2988gb) null, 8);
    }

    public static final void e(Ca ca2, String str, String str2) {
        try {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = ca2.f24583a;
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.s.i(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            gestureDetectorOnGestureListenerC3228pi.b(str, str2.subSequence(i10, length + 1).toString());
        } catch (Exception e10) {
            ca2.f24583a.a(str, "Unexpected error", "playVideo");
            Sb.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str3, "SDK encountered unexpected error in handling playVideo() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void f(Ca ca2, String str, String str2) {
        try {
            ca2.f24583a.getSiblingWebviewManager().b(ca2.f24583a.getRoute().f25563b, str, str2);
        } catch (Exception e10) {
            ca2.f24583a.a("sendMessage", Gi.a(str, Sdk$SDKError.b.AD_HTML_FAILED_TO_LOAD_VALUE));
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str3, "SDK encountered unexpected error in handling sendMessage() request from creative; " + e10.getMessage());
            }
        }
    }

    public final EnumC3000gn a(String str) {
        try {
            for (Object obj : EnumC3000gn.f26637c) {
                if (kotlin.jvm.internal.s.c(((EnumC3000gn) obj).f26638a, str)) {
                    return (EnumC3000gn) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
            if (interfaceC3322t9 == null) {
                return null;
            }
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "No matching action found for - " + str);
            return null;
        }
    }

    @JavascriptInterface
    public final void asyncPing(String str, String url) {
        kotlin.jvm.internal.s.h(url, "url");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "asyncPing called: " + url);
        }
        if (!URLUtil.isValidUrl(url)) {
            this.f24583a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            em.v0 v0VarA = ((B9) Pe.f25486c.getValue()).a(new Re(url, null, null, null, null, false, 62));
            Function1 onCompleted = new Function1() { // from class: yh.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ca.a(this.f57747a, (Ve) obj);
                }
            };
            kotlin.jvm.internal.s.h(v0VarA, "<this>");
            kotlin.jvm.internal.s.h(onCompleted, "onCompleted");
            em.k.d(H9.f24930c, null, null, new E3(v0VarA, onCompleted, null), 3, null);
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "asyncPing");
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "SDK encountered internal error in handling asyncPing() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(String str, String mediaId) {
        kotlin.jvm.internal.s.h(mediaId, "mediaId");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "cancelSaveContent called. mediaId:" + mediaId);
        }
    }

    @JavascriptInterface
    public final void close(final String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "close called");
        }
        final GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3228piA.P0) {
            ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
            Runnable runnable = new Runnable() { // from class: yh.j0
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.a(gestureDetectorOnGestureListenerC3228piA, this, str);
                }
            };
            executorC2937ec.getClass();
            kotlin.jvm.internal.s.h(runnable, "runnable");
            executorC2937ec.f26488a.post(runnable);
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null) {
            gestureDetectorOnGestureListenerC3228piA.h();
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "closeCustomExpand called.");
        }
        if (this.f24584b == 1) {
            if (this.f24583a != null) {
                new Handler(this.f24583a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: yh.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ca.a(this.f57860a);
                    }
                });
                return;
            }
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).b(str4, "closeCustomExpand called in incorrect Ad type: " + this.f24584b);
        }
    }

    @JavascriptInterface
    public final void createVideoPlayer(String str, String str2) throws JSONException {
        Object objD;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "createVideoPlayer is called with config - " + str2);
        }
        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid config");
        jSONObject.put("jsCommand", "createVideoPlayer");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
                kotlin.jvm.internal.s.h(HtmlVideoPlayerRequest.class, "type");
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = (HtmlVideoPlayerRequest) HtmlVideoPlayerRequest.class.cast(AbstractC3323ta.a(jsonObject, HtmlVideoPlayerRequest.class, null, null));
                if (htmlVideoPlayerRequest == null || (objD = em.k.d(H9.f24933f, null, null, new C3401wa(this, htmlVideoPlayerRequest, null), 3, null)) == null) {
                    EnumC3321t8 enumC3321t8 = EnumC3321t8.VIDEO_READY;
                    a(str, jSONObject);
                    obj = fl.g0.f38750a;
                } else {
                    obj = objD;
                }
            } catch (JSONException e10) {
                EnumC3321t8 enumC3321t9 = EnumC3321t8.VIDEO_READY;
                a(str, jSONObject);
                InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
                if (interfaceC3322t10 != null) {
                    String str4 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t10).a(str4, "Error while creating config Json.", e10);
                    obj = fl.g0.f38750a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3321t8 enumC3321t10 = EnumC3321t8.VIDEO_READY;
        a(str, jSONObject);
        fl.g0 g0Var = fl.g0.f38750a;
    }

    @JavascriptInterface
    public final void customExpand(String str, String str2, int i10, float f10, boolean z10, boolean z11) {
        C2988gb c2988gb;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "customExpand called");
        }
        if (this.f24583a.P0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f24584b != 1) {
            InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
            if (interfaceC3322t11 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).b(str5, "customExpand called in incorrect Ad type: " + this.f24584b);
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                boolean z13 = kotlin.jvm.internal.s.i(str2.charAt(!z12 ? i11 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z13) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            if (str2.subSequence(i11, length + 1).toString().length() != 0) {
                if (i10 < 0 || i10 >= V5.values().length) {
                    this.f24583a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f10 < 0.0f || f10 > 1.0f) {
                    this.f24583a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                C3014hb c3014hb = this.f24583a.getLandingPageHandler().f26321f;
                if (c3014hb != null) {
                    String strA = Xa.a(str2);
                    C2885cb landingPageHandler = this.f24583a.getLandingPageHandler();
                    int i12 = landingPageHandler.f26324i + 1;
                    landingPageHandler.f26324i = i12;
                    c2988gb = new C2988gb(c3014hb, strA, i12, SystemClock.elapsedRealtime());
                } else {
                    c2988gb = null;
                }
                C2988gb c2988gb2 = c2988gb;
                if (c2988gb2 != null) {
                    c2988gb2.f26602f = "IN_CUSTOM";
                }
                this.f24583a.getLandingPageHandler().a(Ua.LPClickStart, c2988gb2, (Integer) 8008);
                a(str, str2, i10, f10, z11, c2988gb2);
                return;
            }
        }
        this.f24583a.a(str, "Invalid " + i10, "customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(final String str, final String url, final float f10, final boolean z10) {
        kotlin.jvm.internal.s.h(url, "url");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi.P0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f24584b == 1) {
            if (f10 < 0.0f || f10 > 1.0f) {
                gestureDetectorOnGestureListenerC3228pi.a(str, "Invalid screenPercentage", "customExpandInNative");
                return;
            } else {
                AbstractC2971fk.a(new Runnable() { // from class: yh.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ca.a(this.f57628a, str, url, f10, z10);
                    }
                });
                return;
            }
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).b(str4, "customExpandInNative called in incorrect Ad type: " + this.f24584b);
        }
    }

    @JavascriptInterface
    public final void destroyVideoPlayer(String str) {
        em.k.d(H9.f24933f, null, null, new C3427xa(this, null), 3, null);
    }

    @JavascriptInterface
    public final void destroyWebView(String str, final String str2) throws JSONException {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null && gestureDetectorOnGestureListenerC3228piA.P0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
            if (str2 == null) {
                str2 = "";
            }
            fl.k kVar = Gi.f24873a;
            JSONObject jSONObjectA = AbstractC3073jj.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3228pi.a("destroyWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
            Runnable runnable = new Runnable() { // from class: yh.b0
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.a(this.f57608a, str2);
                }
            };
            executorC2937ec.getClass();
            kotlin.jvm.internal.s.h(runnable, "runnable");
            executorC2937ec.f26488a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = this.f24583a;
        if (str2 == null) {
            str2 = "";
        }
        fl.k kVar2 = Gi.f24873a;
        JSONObject jSONObjectA2 = AbstractC3073jj.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put("errorCode", 302);
        gestureDetectorOnGestureListenerC3228pi2.a("destroyWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void disableBackButton(String str, final boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "disableBackButton called");
        }
        this.f24583a.getWebViewFactory().a(new Function1() { // from class: yh.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ca.a(z10, (GestureDetectorOnGestureListenerC3228pi) obj);
            }
        });
    }

    @JavascriptInterface
    public final void disableCloseRegion(final String str, final boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "disableCloseRegion called");
        }
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        Runnable runnable = new Runnable() { // from class: yh.a0
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(this.f57588a, z10, str);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.post(runnable);
    }

    @JavascriptInterface
    public final void enableNativeGestures(String str, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "enableNativeGestures called with enabled: " + z10);
        }
        this.f24583a.setEnableNativeGestures(z10);
    }

    @JavascriptInterface
    public final void enableTouchBeginCallback(String str, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "enableTouchBeginCallback called with enabled: " + z10);
        }
        this.f24583a.setEnableTouchBeginCallback(z10);
    }

    @JavascriptInterface
    public final void enableTouchEndCallback(String str, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "enableTouchEndCallback called with enabled: " + z10);
        }
        this.f24583a.setEnableTouchEndCallback(z10);
    }

    @JavascriptInterface
    public final void executeVideoPlayerActions(String str, String action, String str2) throws JSONException {
        kotlin.jvm.internal.s.h(action, "action");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "executeVideoPlayerActions is called with action - " + action + ", " + str2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoCommand", action);
        jSONObject.put("config", str2);
        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMessage", "Invalid action");
        jSONObject2.put("jsCommand", "executeVideoPlayerActions");
        jSONObject2.put("params", String.valueOf(jSONObject));
        try {
            EnumC3000gn enumC3000gnA = a(action);
            if (enumC3000gnA != null && em.k.d(H9.f24933f, null, null, new C3452ya(this, enumC3000gnA, jSONObject, null), 3, null) != null) {
                return;
            }
            EnumC3321t8 enumC3321t8 = EnumC3321t8.VIDEO_READY;
            a(str, jSONObject2);
            fl.g0 g0Var = fl.g0.f38750a;
        } catch (JSONException e10) {
            EnumC3321t8 enumC3321t9 = EnumC3321t8.VIDEO_READY;
            a(str, jSONObject2);
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).a(str4, "Error while creating action Json.", e10);
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(String str) {
        fireAdFailed(str, "");
    }

    @JavascriptInterface
    public final void fireAdReady(String str) {
        try {
            InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
            if (interfaceC3322t9 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).a(str2, "fireAdReady called.");
            }
            this.f24583a.q();
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "fireAdReady");
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "SDK encountered unexpected error in handling fireAdReady() signal from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.i();
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireSkip(String str) {
        InterfaceC3322t9 interfaceC3322t9;
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).a(str2, "fireSkip is called");
        }
        if (this.f24583a == null && (interfaceC3322t9 = this.f24585c) != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).b(str3, "Found a null instance of render view!");
        }
        this.f24583a.P();
    }

    @JavascriptInterface
    public final String getAdContext(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getAdContext is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null) {
            InterfaceC3391w0 adPodHandler = gestureDetectorOnGestureListenerC3228piA.getAdPodHandler();
            if (adPodHandler != null) {
                return ((AbstractC3107l1) adPodHandler).v();
            }
            return null;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(String str, String str2) {
        F2 f10;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = gestureDetectorOnGestureListenerC3228pi.f27233i;
        if (interfaceC3322t11 != null) {
            String TAG = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t11).a(TAG, "getBlob");
        }
        if (str == null || str2 == null || (f10 = gestureDetectorOnGestureListenerC3228pi.f27238k0) == null) {
            return;
        }
        ((AbstractC3107l1) f10).a(str, str2, gestureDetectorOnGestureListenerC3228pi, gestureDetectorOnGestureListenerC3228pi.getImpressionId());
    }

    @JavascriptInterface
    public final String getCurrentPosition(String str) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi2 == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 == null) {
                return "";
            }
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC3228pi2.getCurrentPositionMonitor()) {
            this.f24583a.G = true;
            new Handler(this.f24583a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: yh.f0
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.b(this.f57702a);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC3228pi = this.f24583a;
                if (gestureDetectorOnGestureListenerC3228pi.G) {
                    try {
                        gestureDetectorOnGestureListenerC3228pi.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    fl.g0 g0Var = fl.g0.f38750a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC3228pi.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null) {
            return gestureDetectorOnGestureListenerC3228piA.getCurrentRenderingPodAdIndex();
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 == null) {
            return 0;
        }
        String str3 = Da.f24644a;
        kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
        ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    public final String getDefaultPosition(String str) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.f24583a.getDefaultPositionMonitor()) {
            this.f24583a.F = true;
            new Handler(this.f24583a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: yh.r0
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.c(this.f57898a);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC3228pi = this.f24583a;
                if (gestureDetectorOnGestureListenerC3228pi.F) {
                    try {
                        gestureDetectorOnGestureListenerC3228pi.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    fl.g0 g0Var = fl.g0.f38750a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC3228pi.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            Ec mediaProcessor = gestureDetectorOnGestureListenerC3228pi.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "getDeviceVolume");
            InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
            if (interfaceC3322t11 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).b(str4, "SDK encountered unexpected error in handling getDeviceVolume() request from creative; " + e10.getMessage());
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            B5 b10 = B5.f24500a;
            b10.getClass();
            return ((Number) B5.f24505f.getValue(b10, B5.f24501b[0])).intValue();
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "getMaxDeviceVolume");
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; " + e10.getMessage());
            }
            return 0;
        }
    }

    @JavascriptInterface
    public final String getMaxSize(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f24583a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.f24583a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.f24583a.getContainerContext();
                kotlin.jvm.internal.s.f(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
            i0Var.f43593a = J3.b(frameLayout.getWidth() / N5.b());
            kotlin.jvm.internal.i0 i0Var2 = new kotlin.jvm.internal.i0();
            i0Var2.f43593a = J3.b(frameLayout.getHeight() / N5.b());
            if (this.f24583a.getFullScreenActivity() != null && (i0Var.f43593a == 0 || i0Var2.f43593a == 0)) {
                kotlin.jvm.internal.s.e(frameLayout);
                ViewTreeObserverOnGlobalLayoutListenerC3375va viewTreeObserverOnGlobalLayoutListenerC3375va = new ViewTreeObserverOnGlobalLayoutListenerC3375va(frameLayout, this.f24585c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3375va);
                em.k.d(H9.f24930c, null, null, new C3477za(viewTreeObserverOnGlobalLayoutListenerC3375va, i0Var, i0Var2, null), 3, null);
            }
            try {
                jSONObject.put("width", i0Var.f43593a);
                jSONObject.put("height", i0Var2.f43593a);
            } catch (JSONException e10) {
                InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
                if (interfaceC3322t10 != null) {
                    String str3 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t10).a(str3, "Error while creating max size Json.", e10);
                }
            }
            InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
            if (interfaceC3322t11 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e11) {
            this.f24583a.a(str, "Unexpected error", "getMaxSize");
            InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
            if (interfaceC3322t12 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t12).b(str5, "SDK encountered unexpected error in handling getMaxSize() request from creative; " + e11.getMessage());
            }
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    public final String getOrientation(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getOrientation called");
        }
        byte bG = N5.g();
        if (bG == 1) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        if (bG == 3) {
            return "90";
        }
        if (bG == 2) {
            return "180";
        }
        return bG == 4 ? "270" : "-1";
    }

    @JavascriptInterface
    public final String getOrientationProperties(String str) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            gestureDetectorOnGestureListenerC3228piA = this.f24583a;
        }
        String str2 = gestureDetectorOnGestureListenerC3228piA.getOrientationProperties().f25352d;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "getOrientationProperties called: " + str2);
        }
        kotlin.jvm.internal.s.e(str2);
        return str2;
    }

    @JavascriptInterface
    public final String getPlacementType(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getPlacementType called");
        }
        return 1 == this.f24584b ? com.vungle.ads.internal.f.PLACEMENT_TYPE_INTERSTITIAL : "inline";
    }

    @JavascriptInterface
    public final String getPlatform(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 == null) {
            return "android";
        }
        String str2 = Da.f24644a;
        kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
        ((C3348u9) interfaceC3322t9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    public final String getPlatformVersion(String str) {
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getPlatformVersion. Version:" + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final String getPlaybackState(String str) {
        InterfaceC3322t9 interfaceC3322t9;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        em.k.d(H9.f24933f, null, null, new Aa(this, k0Var, countDownLatch, null), 3, null);
        if (!countDownLatch.await(1L, TimeUnit.SECONDS) && (interfaceC3322t9 = this.f24585c) != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        JSONObject jSONObject = (JSONObject) k0Var.f43597a;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getRenderableAdIndexes(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of ad render view!");
            }
            String string = new JSONArray().toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return string;
        }
        JSONArray renderableAdIndexes = gestureDetectorOnGestureListenerC3228piA.getRenderableAdIndexes();
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String string2 = renderableAdIndexes.toString();
        kotlin.jvm.internal.s.g(string2, "toString(...)");
        return string2;
    }

    @JavascriptInterface
    public final String getSafeArea(String str) {
        JSONObject safeArea = this.f24583a.getSafeArea();
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", N5.h().f25463a);
            jSONObject.put("height", N5.h().f25464b);
            InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
            if (interfaceC3322t9 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).c(str2, "Message:Width x Height : " + N5.h().f25463a + "x" + N5.h().f25464b);
            }
        } catch (JSONException unused) {
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "getScreenSize");
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "SDK encountered unexpected error while getting screen dimensions; " + e10.getMessage());
            }
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).a(str4, "getScreenSize called:" + string);
        }
        return string;
    }

    @JavascriptInterface
    public final String getSdkVersion(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 == null) {
            return "11.2.0";
        }
        String str2 = Da.f24644a;
        kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
        ((C3348u9) interfaceC3322t9).a(str2, "getSdkVersion called. Version:11.2.0");
        return "11.2.0";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 == null) {
                return 0L;
            }
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = gestureDetectorOnGestureListenerC3228piA.getShowTimeStamp();
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    public final String getState(String str) {
        String viewState = this.f24583a.getViewState();
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.s.g(ENGLISH, "ENGLISH");
        String lowerCase = viewState.toLowerCase(ENGLISH);
        kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).c(str2, "getState called:" + lowerCase);
        }
        return lowerCase;
    }

    @JavascriptInterface
    public final String getVersion(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 == null) {
            return MBridgeConstans.NATIVE_VIDEO_VERSION;
        }
        String str2 = Da.f24644a;
        kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
        ((C3348u9) interfaceC3322t9).a(str2, "getVersion called. Version:2.0");
        return MBridgeConstans.NATIVE_VIDEO_VERSION;
    }

    @JavascriptInterface
    public final void impressionFired(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "impressionFired is called");
        }
        this.f24583a.C();
    }

    @JavascriptInterface
    public final void incentCompleted(String str, String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "incentCompleted called. IncentData:" + str2);
        }
        if (str2 == null) {
            try {
                this.f24583a.getListener().b(new HashMap());
                return;
            } catch (Exception e10) {
                this.f24583a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
                if (interfaceC3322t10 != null) {
                    String str4 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t10).b(str4, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e10.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                kotlin.jvm.internal.s.g(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kotlin.jvm.internal.s.f(next, "null cannot be cast to non-null type kotlin.String");
                    String str5 = next;
                    map.put(str5, jSONObject.get(str5));
                }
                try {
                    this.f24583a.getListener().b(map);
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (Exception e11) {
                    this.f24583a.a(str, "Unexpected error", "incentCompleted");
                    InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
                    if (interfaceC3322t11 != null) {
                        String str6 = Da.f24644a;
                        kotlin.jvm.internal.s.g(str6, "access$getTAG$p(...)");
                        ((C3348u9) interfaceC3322t11).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                        fl.g0 g0Var2 = fl.g0.f38750a;
                    }
                }
            } catch (JSONException unused) {
                this.f24583a.getListener().b(new HashMap());
                fl.g0 g0Var3 = fl.g0.f38750a;
            }
        } catch (Exception e12) {
            this.f24583a.a(str, "Unexpected error", "incentCompleted");
            InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
            if (interfaceC3322t12 != null) {
                String str7 = Da.f24644a;
                kotlin.jvm.internal.s.g(str7, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t12).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                fl.g0 g0Var4 = fl.g0.f38750a;
            }
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            gestureDetectorOnGestureListenerC3228piA = this.f24583a;
        }
        return gestureDetectorOnGestureListenerC3228piA.L;
    }

    @JavascriptInterface
    public final String isDeviceMuted(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "isDeviceMuted called");
        }
        if (this.f24583a == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 == null) {
                return "false";
            }
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z10 = false;
        try {
            Ec mediaProcessor = this.f24583a.getMediaProcessor();
            kotlin.jvm.internal.s.e(mediaProcessor);
            InterfaceC3322t9 interfaceC3322t12 = mediaProcessor.f24709b;
            if (interfaceC3322t12 != null) {
                ((C3348u9) interfaceC3322t12).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context context = Xi.f26021a;
            if (context != null) {
                AudioManager audioManager = null;
                try {
                    Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                    if (!(systemService instanceof AudioManager)) {
                        systemService = null;
                    }
                    audioManager = (AudioManager) systemService;
                } catch (Throwable unused) {
                }
                if (audioManager != null && 2 != audioManager.getRingerMode()) {
                    z10 = true;
                }
            }
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t13 = this.f24585c;
            if (interfaceC3322t13 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t13).b(str5, "SDK encountered unexpected error in checking if device is muted; " + e10.getMessage());
            }
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    public final String isHeadphonePlugged(String str) {
        boolean zB;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "isHeadphonePlugged called");
        }
        if (this.f24583a == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 == null) {
                return "false";
            }
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            Ec mediaProcessor = this.f24583a.getMediaProcessor();
            kotlin.jvm.internal.s.e(mediaProcessor);
            mediaProcessor.getClass();
            zB = Ec.b();
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
            if (interfaceC3322t12 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t12).b(str5, "SDK encountered unexpected error in checking if headphones are plugged-in; " + e10.getMessage());
            }
            zB = false;
        }
        return String.valueOf(zB);
    }

    @JavascriptInterface
    public final boolean isViewable(String str) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            return gestureDetectorOnGestureListenerC3228pi.J == Yn.VISIBLE;
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(String str, int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "loadAd is called with index - " + i10);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null) {
            gestureDetectorOnGestureListenerC3228piA.b(i10);
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void loadWebView(String str, final String str2, final String str3) throws JSONException {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str4, "loadWebView called with html: " + str3);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null && gestureDetectorOnGestureListenerC3228piA.P0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
            if (str2 == null) {
                str2 = "";
            }
            fl.k kVar = Gi.f24873a;
            JSONObject jSONObjectA = AbstractC3073jj.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3228pi.a("loadWebView", jSONObjectA);
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA2 = a();
        if (gestureDetectorOnGestureListenerC3228piA2 == null || gestureDetectorOnGestureListenerC3228piA2.getPlacementType() != 1) {
            InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
            if (interfaceC3322t11 != null) {
                String str6 = Da.f24644a;
                kotlin.jvm.internal.s.g(str6, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = this.f24583a;
            if (str2 == null) {
                str2 = "";
            }
            fl.k kVar2 = Gi.f24873a;
            JSONObject jSONObjectA2 = AbstractC3073jj.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put("errorCode", Sdk$SDKError.b.DEEPLINK_OPEN_FAILED_VALUE);
            gestureDetectorOnGestureListenerC3228pi2.a("loadWebView", jSONObjectA2);
            return;
        }
        if (str2 == null || bm.r.h0(str2)) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi3 = this.f24583a;
            fl.k kVar3 = Gi.f24873a;
            JSONObject jSONObjectA3 = AbstractC3073jj.a("", "targetViewId", "id", "");
            jSONObjectA3.put("errorCode", 302);
            gestureDetectorOnGestureListenerC3228pi3.a("loadWebView", jSONObjectA3);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.f24583a.a("loadWebView", Gi.a(str2, 301));
            return;
        }
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        Runnable runnable = new Runnable() { // from class: yh.n0
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(this.f57844a, str2, str3);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.post(runnable);
    }

    @JavascriptInterface
    public final void log(String str, String message) {
        kotlin.jvm.internal.s.h(message, "message");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).c(str2, "Log called. Message:" + message);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        gestureDetectorOnGestureListenerC3228pi.getClass();
        Vh vh2 = GestureDetectorOnGestureListenerC3228pi.f27208g1;
        vh2.getClass();
        if (!((Boolean) GestureDetectorOnGestureListenerC3228pi.f27211j1.getValue(vh2, Vh.f25904a[0])).booleanValue() || message == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3228pi.getListener().a(message);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(String str, String eventType, String str2) {
        if (eventType == null) {
            InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
            if (interfaceC3322t9 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str3, "eventType is null");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).a(str4, "logTelemetryEvent is called: " + eventType);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        gestureDetectorOnGestureListenerC3228pi.getClass();
        kotlin.jvm.internal.s.h(eventType, "eventType");
        C3485zi c3485zi = gestureDetectorOnGestureListenerC3228pi.f27224e0;
        if (c3485zi != null) {
            c3485zi.a(eventType, str2);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(String str, int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "onAudioStateChanged is called: " + i10);
        }
        V1.f25863b.getClass();
        V1 v10 = (V1) V1.f25864c.get(i10);
        if (v10 == null) {
            v10 = V1.f25865d;
        }
        if (v10 != V1.f25865d) {
            this.f24583a.getListener().a(v10);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(String str, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "onAudioMuteInteraction is called: " + z10);
        }
        this.f24583a.getListener().a(z10);
    }

    @JavascriptInterface
    public final void onUserInteraction(String str, String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi != null && !gestureDetectorOnGestureListenerC3228pi.a()) {
            this.f24583a.a("onUserInteraction");
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).a(str4, "onUserInteraction called. Params:" + str2);
        }
        if (str2 == null) {
            try {
                this.f24583a.a(new HashMap());
                return;
            } catch (Exception e10) {
                this.f24583a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
                if (interfaceC3322t11 != null) {
                    String str5 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t11).b(str5, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e10.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                kotlin.jvm.internal.s.g(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kotlin.jvm.internal.s.f(next, "null cannot be cast to non-null type kotlin.String");
                    String str6 = next;
                    map.put(str6, jSONObject.get(str6));
                }
                try {
                    this.f24583a.a(map);
                    fl.g0 g0Var = fl.g0.f38750a;
                } catch (Exception e11) {
                    this.f24583a.a(str, "Unexpected error", "onUserInteraction");
                    InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
                    if (interfaceC3322t12 != null) {
                        String str7 = Da.f24644a;
                        kotlin.jvm.internal.s.g(str7, "access$getTAG$p(...)");
                        ((C3348u9) interfaceC3322t12).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                        fl.g0 g0Var2 = fl.g0.f38750a;
                    }
                }
            } catch (Exception e12) {
                this.f24583a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3322t9 interfaceC3322t13 = this.f24585c;
                if (interfaceC3322t13 != null) {
                    String str8 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str8, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t13).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                    fl.g0 g0Var3 = fl.g0.f38750a;
                }
            }
        } catch (JSONException unused) {
            this.f24583a.a(new HashMap());
            fl.g0 g0Var4 = fl.g0.f38750a;
        }
    }

    @JavascriptInterface
    public final void open(final String str, final String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "open called");
        }
        if (!this.f24583a.a()) {
            this.f24583a.a(com.vungle.ads.internal.presenter.g.OPEN);
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (!gestureDetectorOnGestureListenerC3228pi.P0) {
            gestureDetectorOnGestureListenerC3228pi.s();
            AbstractC2971fk.a(new Runnable() { // from class: yh.l0
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.b(this.f57810a, str, str2);
                }
            });
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str4, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openEmbedded(final String str, final String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "openEmbedded called");
        }
        if (!this.f24583a.a()) {
            this.f24583a.a("openEmbedded");
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (!gestureDetectorOnGestureListenerC3228pi.P0) {
            gestureDetectorOnGestureListenerC3228pi.s();
            AbstractC2971fk.a(new Runnable() { // from class: yh.d0
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.c(this.f57649a, str, str2);
                }
            });
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openExternal(String str, String url, String str2) {
        C2988gb c2988gb;
        kotlin.jvm.internal.s.h(url, "url");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "open External");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (gestureDetectorOnGestureListenerC3228pi.P0) {
            InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
            if (interfaceC3322t11 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).b(str5, "open called on unloaded ad");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3228pi.a()) {
            this.f24583a.a("openExternal");
            return;
        }
        this.f24583a.s();
        InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
        if (interfaceC3322t12 != null) {
            String str6 = Da.f24644a;
            kotlin.jvm.internal.s.g(str6, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t12).a(str6, "openExternal called with url: " + url + " , schema: " + Xa.a(url) + ", fallback - " + str2);
        }
        C3014hb c3014hb = this.f24583a.getLandingPageHandler().f26321f;
        if (c3014hb != null) {
            String strA = Xa.a(url);
            C2885cb landingPageHandler = this.f24583a.getLandingPageHandler();
            int i10 = landingPageHandler.f26324i + 1;
            landingPageHandler.f26324i = i10;
            c2988gb = new C2988gb(c3014hb, strA, i10, SystemClock.elapsedRealtime());
        } else {
            c2988gb = null;
        }
        if (c2988gb != null) {
            c2988gb.f26602f = "EX_NATIVE";
        }
        this.f24583a.getLandingPageHandler().a(Ua.LPClickStart, c2988gb, (Integer) null);
        C2885cb landingPageHandler2 = this.f24583a.getLandingPageHandler();
        landingPageHandler2.getClass();
        kotlin.jvm.internal.s.h("openExternal", "api");
        if (url != null) {
            landingPageHandler2.f(str, url, str2, c2988gb);
            return;
        }
        if (str2 != null) {
            landingPageHandler2.f(str, str2, null, c2988gb);
            return;
        }
        landingPageHandler2.a(Ua.LPStartFailed, c2988gb, (Integer) 2);
        Ta ta2 = landingPageHandler2.f26319d;
        if (ta2 != null) {
            ta2.a(str, "Empty url and fallback url", "openExternal");
        }
        InterfaceC3322t9 interfaceC3322t13 = landingPageHandler2.f26322g;
        if (interfaceC3322t13 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t13).b("cb", "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public final void openWithoutTracker(final String str, final String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "openWithoutTracker called");
        }
        if (!this.f24583a.a()) {
            this.f24583a.a("openWithoutTracker");
            return;
        }
        if (!this.f24583a.P0) {
            AbstractC2971fk.a(new Runnable() { // from class: yh.p0
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.d(this.f57872a, str, str2);
                }
            });
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void ping(String str, String url, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "ping called");
        }
        if (this.f24583a == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (url != null) {
            int length = url.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = kotlin.jvm.internal.s.i(url.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (url.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
                if (interfaceC3322t11 != null) {
                    String str4 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t11).a(str4, "JavaScript called ping() URL: >>> " + url + " <<<");
                }
                try {
                    A3 a10 = A3.f24440a;
                    InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
                    kotlin.jvm.internal.s.h(url, "url");
                    A3.a(url, z10, interfaceC3322t12);
                    return;
                } catch (Exception e10) {
                    this.f24583a.a(str, "Unexpected error", "ping");
                    Sb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3322t9 interfaceC3322t13 = this.f24585c;
                    if (interfaceC3322t13 != null) {
                        String str5 = Da.f24644a;
                        kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                        ((C3348u9) interfaceC3322t13).b(str5, "SDK encountered unexpected error in handling ping() request from creative; " + e10.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f24583a.a(str, "Invalid URL:" + url, "ping");
    }

    @JavascriptInterface
    public final void pingV2(String str, String pingJson) {
        kotlin.jvm.internal.s.h(pingJson, "pingJson");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "pingV2 called with JSON: >>> " + pingJson + " <<<");
        }
        try {
            this.f24583a.g(pingJson);
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "ping");
            this.f24583a.a(e10);
            Sb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "SDK encountered unexpected error in handling ping() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(final String str, final String str2) {
        if (this.f24583a == null) {
            InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
            if (interfaceC3322t9 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.s.i(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && bm.r.N(str2, "http", false, 2, null) && (bm.r.z(str2, "mp4", false, 2, null) || bm.r.z(str2, "avi", false, 2, null) || bm.r.z(str2, "m4v", false, 2, null))) {
                InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
                if (interfaceC3322t10 != null) {
                    String str4 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t10).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new Handler(this.f24583a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: yh.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ca.e(this.f58031a, str, str2);
                    }
                });
                return;
            }
        }
        this.f24583a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(String jsCallbackNamespace) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str = Da.f24644a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                Ec mediaProcessor = gestureDetectorOnGestureListenerC3228pi.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.s.h(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f24711d == null) {
                        C3041ic c3041ic = new C3041ic(new Ac(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f24711d = c3041ic;
                        c3041ic.b();
                    }
                }
            } catch (Exception e10) {
                this.f24583a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceMuteEventListener");
                InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
                if (interfaceC3322t11 != null) {
                    String str3 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t11).b(str3, "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(String jsCallbackNamespace) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str = Da.f24644a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                Ec mediaProcessor = gestureDetectorOnGestureListenerC3228pi.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.s.h(jsCallbackNamespace, "jsCallbackNamespace");
                    Context context = Xi.f26021a;
                    if (context != null && mediaProcessor.f24712e == null) {
                        C3041ic c3041ic = new C3041ic(new Cc(mediaProcessor, jsCallbackNamespace, context, new Handler(Looper.getMainLooper())));
                        mediaProcessor.f24712e = c3041ic;
                        c3041ic.b();
                    }
                }
            } catch (Exception e10) {
                this.f24583a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
                if (interfaceC3322t11 != null) {
                    String str3 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t11).b(str3, "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(String jsCallbackNamespace) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str = Da.f24644a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                Ec mediaProcessor = gestureDetectorOnGestureListenerC3228pi.getMediaProcessor();
                if (mediaProcessor != null) {
                    kotlin.jvm.internal.s.h(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f24713f == null) {
                        C3041ic c3041ic = new C3041ic(new C3479zc(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f24713f = c3041ic;
                        c3041ic.b();
                    }
                }
            } catch (Exception e10) {
                this.f24583a.a(jsCallbackNamespace, "Unexpected error", "registerHeadphonePluggedEventListener");
                InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
                if (interfaceC3322t11 != null) {
                    String str3 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t11).b(str3, "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void saveBlob(String str, String str2) {
        F2 f10;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = gestureDetectorOnGestureListenerC3228pi.f27233i;
        if (interfaceC3322t11 != null) {
            String TAG = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t11).a(TAG, "saveBlob");
        }
        if (str2 == null || (f10 = gestureDetectorOnGestureListenerC3228pi.f27238k0) == null) {
            return;
        }
        ((AbstractC3107l1) f10).a(str2, gestureDetectorOnGestureListenerC3228pi.getImpressionId());
    }

    @JavascriptInterface
    public final void sendMessage(String str, final String str2, final String str3) throws JSONException {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str4, "sendMessage called with message: " + str3);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null && gestureDetectorOnGestureListenerC3228piA.P0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
            if (str2 == null) {
                str2 = "";
            }
            fl.k kVar = Gi.f24873a;
            JSONObject jSONObjectA = AbstractC3073jj.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3228pi.a("sendMessage", jSONObjectA);
            return;
        }
        if (str2 == null || bm.r.h0(str2)) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = this.f24583a;
            if (str2 == null) {
                str2 = "";
            }
            fl.k kVar2 = Gi.f24873a;
            JSONObject jSONObjectA2 = AbstractC3073jj.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put("errorCode", 302);
            gestureDetectorOnGestureListenerC3228pi2.a("sendMessage", jSONObjectA2);
            return;
        }
        if (str3 == null || bm.r.h0(str3)) {
            this.f24583a.a("sendMessage", Gi.a(str2, 301));
            return;
        }
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        Runnable runnable = new Runnable() { // from class: yh.i0
            @Override // java.lang.Runnable
            public final void run() {
                Ca.f(this.f57763a, str2, str3);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.post(runnable);
    }

    @JavascriptInterface
    public final void setAdContext(String str, String podAdContext) {
        kotlin.jvm.internal.s.h(podAdContext, "podAdContext");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "setAdContext is called " + podAdContext);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null) {
            InterfaceC3391w0 adPodHandler = gestureDetectorOnGestureListenerC3228piA.getAdPodHandler();
            if (adPodHandler != null) {
                ((AbstractC3107l1) adPodHandler).b(podAdContext);
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(String str, final String orientationPropertiesString) {
        kotlin.jvm.internal.s.h(orientationPropertiesString, "orientationPropertiesString");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "setOrientationProperties called: " + orientationPropertiesString);
        }
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        Runnable runnable = new Runnable() { // from class: yh.m0
            @Override // java.lang.Runnable
            public final void run() {
                Ca.b(this.f57828a, orientationPropertiesString);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.post(runnable);
    }

    @JavascriptInterface
    public final void showAlert(String str, String alert) {
        kotlin.jvm.internal.s.h(alert, "alert");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "showAlert: " + alert);
        }
    }

    @JavascriptInterface
    public final void showWebView(String str, final String str2) throws JSONException {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null && gestureDetectorOnGestureListenerC3228piA.P0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
            if (str2 == null) {
                str2 = "";
            }
            fl.k kVar = Gi.f24873a;
            JSONObject jSONObjectA = AbstractC3073jj.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3228pi.a("showWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
            Runnable runnable = new Runnable() { // from class: yh.k0
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.c(this.f57796a, str2);
                }
            };
            executorC2937ec.getClass();
            kotlin.jvm.internal.s.h(runnable, "runnable");
            executorC2937ec.f26488a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = this.f24583a;
        if (str2 == null) {
            str2 = "";
        }
        fl.k kVar2 = Gi.f24873a;
        JSONObject jSONObjectA2 = AbstractC3073jj.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put("errorCode", 302);
        gestureDetectorOnGestureListenerC3228pi2.a("showWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void storePicture(String str, String str2) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(String str, String adQualityUrl, String enableUserAdReportScreenshot, String templateInfo) {
        kotlin.jvm.internal.s.h(adQualityUrl, "adQualityUrl");
        kotlin.jvm.internal.s.h(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        kotlin.jvm.internal.s.h(templateInfo, "templateInfo");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "submitAdReport called");
        }
        this.f24583a.a(adQualityUrl, templateInfo, kotlin.jvm.internal.s.c(enableUserAdReportScreenshot, "1"));
    }

    @JavascriptInterface
    public final String supports(String str, String feature) {
        kotlin.jvm.internal.s.h(feature, "feature");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "Checking support for: " + feature);
        }
        String strValueOf = String.valueOf(this.f24583a.n(feature));
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).c(str3, "Message:" + feature + " support: " + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null) {
            return gestureDetectorOnGestureListenerC3228piA.V();
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 == null) {
            return 0L;
        }
        String str3 = Da.f24644a;
        kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
        ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @JavascriptInterface
    public final void unload(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA == null) {
            gestureDetectorOnGestureListenerC3228piA = this.f24583a;
        }
        try {
            gestureDetectorOnGestureListenerC3228piA.E();
        } catch (Exception e10) {
            gestureDetectorOnGestureListenerC3228piA.a(str, "Unexpected error", "unload");
            Sb.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "SDK encountered an expected error in handling the unload() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3228pi.X();
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
            if (interfaceC3322t11 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).b(str4, "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f24583a == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).a(str4, "Unregister device mute event listener ...");
        }
        try {
            Ec mediaProcessor = this.f24583a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3041ic c3041ic = mediaProcessor.f24711d;
                if (c3041ic != null) {
                    c3041ic.a();
                }
                mediaProcessor.f24711d = null;
            }
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
            if (interfaceC3322t12 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t12).b(str5, "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f24583a == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).a(str4, "Unregister device volume change listener ...");
        }
        try {
            Ec mediaProcessor = this.f24583a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3041ic c3041ic = mediaProcessor.f24712e;
                if (c3041ic != null) {
                    c3041ic.a();
                }
                mediaProcessor.f24712e = null;
            }
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
            if (interfaceC3322t12 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t12).b(str5, "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f24583a == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
        if (interfaceC3322t11 != null) {
            String str4 = Da.f24644a;
            kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t11).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            Ec mediaProcessor = this.f24583a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3041ic c3041ic = mediaProcessor.f24713f;
                if (c3041ic != null) {
                    c3041ic.a();
                }
                mediaProcessor.f24713f = null;
            }
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
            if (interfaceC3322t12 != null) {
                String str5 = Da.f24644a;
                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t12).b(str5, "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void useCustomClose(final String str, final boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "useCustomClose called:" + z10);
        }
        new Handler(this.f24583a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: yh.s0
            @Override // java.lang.Runnable
            public final void run() {
                Ca.b(this.f57914a, z10, str);
            }
        });
    }

    @JavascriptInterface
    public final void zoom(String jsCallbackNamespace, final int i10) {
        kotlin.jvm.internal.s.h(jsCallbackNamespace, "jsCallbackNamespace");
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str = Da.f24644a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str, "zoom is called " + jsCallbackNamespace + " " + i10);
        }
        AbstractC2971fk.a(new Runnable() { // from class: yh.t0
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(this.f57930a, i10);
            }
        });
    }

    public static String b(String str) {
        return "TEMPLATE_" + str;
    }

    @JavascriptInterface
    public final void fireAdFailed(String str, String errorCode) {
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        try {
            InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
            if (interfaceC3322t9 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).a(str2, "fireAdFailed called with ec " + errorCode + NpmRNZ.lNuBoknTPMWBA);
            }
            if (bm.r.h0(errorCode)) {
                errorCode = "3100";
            }
            this.f24583a.d(b(errorCode));
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", "fireAdFailed");
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "SDK encountered unexpected error in handling fireAdFailed() signal from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void pingInWebView(String str, String url, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "openInWebView called");
        }
        String str3 = PvZsvNiPV.EJwwbpfaXDURyP;
        if (url != null) {
            int length = url.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = kotlin.jvm.internal.s.i(url.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (url.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
                if (interfaceC3322t10 != null) {
                    String str4 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t10).a(str4, "JavaScript called pingInWebView() URL: >>> " + url + " <<<");
                }
                try {
                    A3 a10 = A3.f24440a;
                    InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
                    kotlin.jvm.internal.s.h(url, "url");
                    Mg.a(Jg.REGULAR, new C3316t3(url, z10, interfaceC3322t11, null));
                    return;
                } catch (Exception e10) {
                    this.f24583a.a(str, "Unexpected error", str3);
                    Sb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3322t9 interfaceC3322t12 = this.f24585c;
                    if (interfaceC3322t12 != null) {
                        String str5 = Da.f24644a;
                        kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                        ((C3348u9) interfaceC3322t12).b(str5, "SDK encountered unexpected error in handling pingInWebView() request from creative; " + e10.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f24583a.a(str, "Invalid URL:" + url, str3);
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(String str) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24583a;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
            if (interfaceC3322t10 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3228pi.l(str);
        } catch (Exception e10) {
            this.f24583a.a(str, "Unexpected error", dmHT.MbUwFtZfWyJFgeF);
            InterfaceC3322t9 interfaceC3322t11 = this.f24585c;
            if (interfaceC3322t11 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).b(str4, "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void showAd(String str, int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "showAd is called with index " + i10);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piA = a();
        if (gestureDetectorOnGestureListenerC3228piA != null) {
            gestureDetectorOnGestureListenerC3228piA.c(i10);
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
        if (interfaceC3322t10 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t10).b(str3, SVWsZyNSAChGIA.TmjPzoFKkKEb);
        }
    }

    @JavascriptInterface
    public final void updateVideoPosition(String str, String str2) throws JSONException {
        Object objD;
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "updateVideoPosition is called with position - " + str2);
        }
        EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Saucuwx.kLbZBUBdwHscUot, "Invalid position");
        jSONObject.put("jsCommand", "updateVideoPlayerPosition");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
                kotlin.jvm.internal.s.h(VideoViewPosition.class, "type");
                VideoViewPosition videoViewPosition = (VideoViewPosition) VideoViewPosition.class.cast(AbstractC3323ta.a(jsonObject, VideoViewPosition.class, null, null));
                if (videoViewPosition == null || (objD = em.k.d(H9.f24933f, null, null, new Ba(this, videoViewPosition, str2, null), 3, null)) == null) {
                    EnumC3321t8 enumC3321t8 = EnumC3321t8.VIDEO_READY;
                    a(str, jSONObject);
                    obj = fl.g0.f38750a;
                } else {
                    obj = objD;
                }
            } catch (JSONException e10) {
                EnumC3321t8 enumC3321t9 = EnumC3321t8.VIDEO_READY;
                a(str, jSONObject);
                InterfaceC3322t9 interfaceC3322t10 = this.f24585c;
                if (interfaceC3322t10 != null) {
                    String str4 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t10).a(str4, "Error while creating position Json.", e10);
                    obj = fl.g0.f38750a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3321t8 enumC3321t10 = EnumC3321t8.VIDEO_READY;
        a(str, jSONObject);
        fl.g0 g0Var = fl.g0.f38750a;
    }

    public static final void b(Ca ca2) {
        try {
            ca2.f24583a.H();
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str = Da.f24644a;
                kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str, "SDK encountered unexpected error in getting/setting current position; " + e10.getMessage());
            }
        }
    }

    public final GestureDetectorOnGestureListenerC3228pi a() {
        if (!kotlin.jvm.internal.s.c(this.f24583a.getRoute().f25563b, "default")) {
            Bo webViewFactory = this.f24583a.getWebViewFactory();
            webViewFactory.getClass();
            kotlin.jvm.internal.s.h("default", "id");
            return (GestureDetectorOnGestureListenerC3228pi) webViewFactory.f24572b.get("default");
        }
        return this.f24583a;
    }

    public static final void b(final Ca ca2, String json) {
        Nf op2 = ca2.f24583a.getOrientationProperties();
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(op2, "op");
        final Nf nf2 = new Nf();
        nf2.f25352d = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            String strOptString = jSONObject.optString("forceOrientation", op2.f25350b);
            kotlin.jvm.internal.s.g(strOptString, "optString(...)");
            kotlin.jvm.internal.s.h(strOptString, "<set-?>");
            nf2.f25350b = strOptString;
            nf2.f25349a = jSONObject.optBoolean("allowOrientationChange", op2.f25349a);
            String strOptString2 = jSONObject.optString("direction", op2.f25351c);
            kotlin.jvm.internal.s.g(strOptString2, "optString(...)");
            kotlin.jvm.internal.s.h(strOptString2, "<set-?>");
            nf2.f25351c = strOptString2;
            if (!kotlin.jvm.internal.s.c(nf2.f25350b, "portrait") && !kotlin.jvm.internal.s.c(nf2.f25350b, "landscape")) {
                kotlin.jvm.internal.s.h(DevicePublicKeyStringDef.NONE, "<set-?>");
                nf2.f25350b = DevicePublicKeyStringDef.NONE;
            }
            if (!kotlin.jvm.internal.s.c(nf2.f25351c, TtmlNode.LEFT) && !kotlin.jvm.internal.s.c(nf2.f25351c, TtmlNode.RIGHT)) {
                kotlin.jvm.internal.s.h(TtmlNode.RIGHT, "<set-?>");
                nf2.f25351c = TtmlNode.RIGHT;
            }
        } catch (JSONException unused) {
            nf2 = null;
        }
        if (nf2 != null) {
            ca2.f24583a.getWebViewFactory().a(new Function1() { // from class: yh.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ca.a(this.f57721a, nf2, (GestureDetectorOnGestureListenerC3228pi) obj);
                }
            });
        }
    }

    public static final void a(Ca ca2, String str, String str2, float f10, boolean z10) {
        C2988gb c2988gb;
        C3014hb c3014hb = ca2.f24583a.getLandingPageHandler().f26321f;
        if (c3014hb != null) {
            String strA = Xa.a(str2);
            C2885cb landingPageHandler = ca2.f24583a.getLandingPageHandler();
            int i10 = landingPageHandler.f26324i + 1;
            landingPageHandler.f26324i = i10;
            c2988gb = new C2988gb(c3014hb, strA, i10, SystemClock.elapsedRealtime());
        } else {
            c2988gb = null;
        }
        C2988gb c2988gb2 = c2988gb;
        if (c2988gb2 != null) {
            c2988gb2.f26602f = "IN_NATIVE";
        }
        ca2.f24583a.getLandingPageHandler().a(Ua.LPClickStart, c2988gb2, (Integer) 8010);
        int iA = ca2.f24583a.getLandingPageHandler().a("customExpandInNative", str, str2, c2988gb2, new Q2(f10, z10));
        InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
        if (interfaceC3322t9 != null) {
            String str3 = Da.f24644a;
            kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str3, "customExpandInNativeRequest: " + iA);
        }
        if (iA == 3) {
            V5 v10 = V5.URL;
            ca2.a(str, str2, 0, f10, !z10, c2988gb2);
        }
    }

    public static final void c(Ca ca2) {
        try {
            ca2.f24583a.I();
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str = Da.f24644a;
                kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str, "SDK encountered unexpected error in getting/setting default position; " + e10.getMessage());
            }
        }
    }

    public static final void c(Ca ca2, String str) {
        try {
            ca2.f24583a.getSiblingWebviewManager().b(ca2.f24583a.getRoute().f25563b, str);
        } catch (Exception e10) {
            ca2.f24583a.a("showWebView", Gi.a(str, Sdk$SDKError.b.ASSET_FAILED_TO_DELETE_VALUE));
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str2, "SDK encountered unexpected error in handling showEndCard() request from creative; " + e10.getMessage());
            }
        }
    }

    public final void a(final String str, String str2, final int i10, final float f10, final boolean z10, final C2988gb c2988gb) {
        final kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        k0Var.f43597a = str2;
        if (c2988gb != null) {
            c2988gb.f26602f = "IN_CUSTOM";
        }
        new Handler(this.f24583a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: yh.e0
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(this.f57672a, c2988gb, k0Var, i10, str, f10, z10);
            }
        });
    }

    public static final void a(Ca ca2, C2988gb c2988gb, kotlin.jvm.internal.k0 k0Var, int i10, String str, float f10, boolean z10) {
        String str2;
        C2988gb c2988gb2;
        C2988gb c2988gb3 = c2988gb;
        try {
            if (ca2.f24583a.getEmbeddedBrowserJsCallbacks() == null) {
                InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
                if (interfaceC3322t9 != null) {
                    String str3 = Da.f24644a;
                    kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                    ((C3348u9) interfaceC3322t9).b(str3, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                ca2.f24583a.getLandingPageHandler().a(Ua.LPStartFailed, c2988gb3, (Integer) 8002);
                return;
            }
            InterfaceC3322t9 interfaceC3322t10 = ca2.f24585c;
            if (interfaceC3322t10 != null) {
                String str4 = Da.f24644a;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).a(str4, "Custom expand called. Url: " + k0Var.f43597a);
            }
            V5 v10 = V5.values()[i10];
            try {
                if (v10 == V5.URL) {
                    try {
                        int iA = ca2.f24583a.getLandingPageHandler().a("customExpand", str, (String) k0Var.f43597a, c2988gb3, (Q2) null);
                        str2 = str;
                        try {
                            InterfaceC3322t9 interfaceC3322t11 = ca2.f24585c;
                            if (interfaceC3322t11 != null) {
                                String str5 = Da.f24644a;
                                kotlin.jvm.internal.s.g(str5, "access$getTAG$p(...)");
                                ((C3348u9) interfaceC3322t11).a(str5, "processCustomExpandRequest: " + iA);
                            }
                            if (iA == 3) {
                                W5 embeddedBrowserJsCallbacks = ca2.f24583a.getEmbeddedBrowserJsCallbacks();
                                if (embeddedBrowserJsCallbacks != null) {
                                    c2988gb2 = c2988gb;
                                    ((P8) embeddedBrowserJsCallbacks).a((String) k0Var.f43597a, v10, f10, z10, ca2.f24583a.getViewTouchTimestamp(), c2988gb2);
                                } else {
                                    c2988gb2 = c2988gb;
                                }
                                ca2.f24583a.getLandingPageHandler().a(Ua.LPStartSuccess, c2988gb2, (Integer) null);
                                Ta ta2 = ca2.f24583a.getLandingPageHandler().f26319d;
                                if (ta2 != null) {
                                    ta2.b("customExpand", str2, (String) k0Var.f43597a);
                                    return;
                                }
                                return;
                            }
                            W5 embeddedBrowserJsCallbacks2 = ca2.f24583a.getEmbeddedBrowserJsCallbacks();
                            if (embeddedBrowserJsCallbacks2 != null) {
                                R8.a(((P8) embeddedBrowserJsCallbacks2).f25468a);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            c2988gb3 = c2988gb;
                            ca2.f24583a.a(str2, "Unexpected error", "customExpand");
                            ca2.f24583a.getLandingPageHandler().a(Ua.LPStartFailed, c2988gb3, (Integer) 9);
                            Sb.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
                            InterfaceC3322t9 interfaceC3322t12 = ca2.f24585c;
                            if (interfaceC3322t12 != null) {
                                String str6 = Da.f24644a;
                                kotlin.jvm.internal.s.g(str6, "access$getTAG$p(...)");
                                ((C3348u9) interfaceC3322t12).b(str6, "SDK encountered unexpected error in handling customExpand() request; " + e.getMessage());
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        str2 = str;
                        c2988gb3 = c2988gb3;
                    }
                } else {
                    W5 embeddedBrowserJsCallbacks3 = ca2.f24583a.getEmbeddedBrowserJsCallbacks();
                    if (embeddedBrowserJsCallbacks3 != null) {
                        ((P8) embeddedBrowserJsCallbacks3).a((String) k0Var.f43597a, v10, f10, z10, ca2.f24583a.getViewTouchTimestamp(), c2988gb3);
                    }
                    ca2.f24583a.getLandingPageHandler().a(Ua.LPStartSuccess, c2988gb3, (Integer) null);
                    Ta ta3 = ca2.f24583a.getLandingPageHandler().f26319d;
                    if (ta3 != null) {
                        ta3.b("customExpand", str, (String) k0Var.f43597a);
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            str2 = str;
        }
    }

    public static final void b(Ca ca2, boolean z10, String str) {
        try {
            ca2.f24583a.f(z10);
        } catch (Exception e10) {
            ca2.f24583a.a(str, "Unexpected error", "useCustomClose");
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str2, "SDK encountered internal error in handling useCustomClose() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(Ca ca2) {
        if (ca2.f24583a.getEmbeddedBrowserJsCallbacks() == null) {
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str = Da.f24644a;
                kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        W5 embeddedBrowserJsCallbacks = ca2.f24583a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            R8.a(((P8) embeddedBrowserJsCallbacks).f25468a);
        }
    }

    public static final fl.g0 a(Ca ca2, Nf nf2, GestureDetectorOnGestureListenerC3228pi it) {
        kotlin.jvm.internal.s.h(it, "it");
        if (it.P0) {
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str = Da.f24644a;
                kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str, "setOrientationProperties called on unloaded ad");
            }
            return fl.g0.f38750a;
        }
        it.a(nf2);
        return fl.g0.f38750a;
    }

    public static final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, Ca ca2, String str) {
        try {
            gestureDetectorOnGestureListenerC3228pi.n();
        } catch (Exception e10) {
            ca2.f24583a.a(str, "Unexpected error", "close");
            Sb.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str2, "SDK encountered an expected error in handling the close() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final fl.g0 a(Ca ca2, Ve response) {
        kotlin.jvm.internal.s.h(response, "response");
        if (AbstractC3438xl.a(response)) {
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str = Da.f24644a;
                kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).a(str, "asyncPing Successful");
            }
        } else {
            InterfaceC3322t9 interfaceC3322t10 = ca2.f24585c;
            if (interfaceC3322t10 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str2, "asyncPing Failed");
            }
        }
        return fl.g0.f38750a;
    }

    public static final void a(Ca ca2, boolean z10, String str) {
        try {
            ca2.f24583a.e(z10);
        } catch (Exception e10) {
            ca2.f24583a.a(str, "Unexpected error", "disableCloseRegion");
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str2, "SDK encountered unexpected error in handling disableCloseRegion() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final fl.g0 a(boolean z10, GestureDetectorOnGestureListenerC3228pi it) {
        kotlin.jvm.internal.s.h(it, "it");
        it.setDisableBackButton(z10);
        return fl.g0.f38750a;
    }

    public static final void a(Ca ca2, int i10) {
        ca2.f24583a.setInitialScale(i10);
    }

    public static final void a(Ca ca2, String str, String str2) {
        try {
            ca2.f24583a.getSiblingWebviewManager().a(ca2.f24583a.getRoute().f25563b, str, str2);
        } catch (Exception e10) {
            ca2.f24583a.a("loadWebView", Gi.a(str, Sdk$SDKError.b.AD_WIN_NOTIFICATION_ERROR_VALUE));
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str3 = Da.f24644a;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str3, "SDK encountered unexpected error in handling loadWebView() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(Ca ca2, String str) {
        try {
            ca2.f24583a.getSiblingWebviewManager().a(ca2.f24583a.getRoute().f25563b, str);
        } catch (Exception e10) {
            ca2.f24583a.a("destroyWebView", Gi.a(str, Sdk$SDKError.b.MRAID_JS_CALL_EMPTY_VALUE));
            InterfaceC3322t9 interfaceC3322t9 = ca2.f24585c;
            if (interfaceC3322t9 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).b(str2, "SDK encountered unexpected error in handling destroyWebView() request from creative; " + e10.getMessage());
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        InterfaceC3322t9 interfaceC3322t9 = this.f24585c;
        if (interfaceC3322t9 != null) {
            String str2 = Da.f24644a;
            kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str2, "fireVideoError " + this + " - " + jSONObject);
        }
        if (str != null) {
            this.f24583a.a(str, "broadcastEvent('VideoCommandError'," + jSONObject + ")");
        }
    }
}
