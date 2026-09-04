package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.inmobi.ads.rendering.InMobiInAppBrowserActivity;
import com.inmobi.media.C2885cb;
import com.inmobi.media.ads.network.common.model.InlineParams;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2885cb {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f26315j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2911db f26317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2840ai f26318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ta f26319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3408wh f26320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3014hb f26321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3322t9 f26322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f26323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26324i;

    public /* synthetic */ C2885cb(Context context, C2911db c2911db, C3223pd c3223pd, InterfaceC3408wh interfaceC3408wh, C3014hb c3014hb, InterfaceC3322t9 interfaceC3322t9, int i10) {
        this(context, c2911db, null, (i10 & 8) != 0 ? null : c3223pd, interfaceC3408wh, c3014hb, interfaceC3322t9, null);
    }

    public static /* synthetic */ C2859bb a(C2885cb c2885cb, String str, String str2, String str3, C2988gb c2988gb, int i10) {
        if ((i10 & 8) != 0) {
            c2988gb = null;
        }
        return c2885cb.a(str, str2, str3, c2988gb, (i10 & 16) == 0);
    }

    public final C2859bb b(String str, String str2, String str3, C2988gb c2988gb) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).c("cb", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            Ta ta2 = this.f26319d;
            if (ta2 != null) {
                ta2.a(str2, "Invalid URL", str);
            }
            InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t10).c("cb", "InMobiNativeBrowserScheme url is Empty or null");
            }
            a(Ua.LPStartFailed, c2988gb, (Integer) 8001);
            return new C2859bb(3, 8001);
        }
        if (c2988gb != null) {
            c2988gb.f26602f = "EX_NATIVE";
        }
        boolean zA = AbstractC3215p5.a(str3, this.f26316a, this.f26320e, this.f26322g);
        InterfaceC3322t9 interfaceC3322t11 = this.f26322g;
        if (interfaceC3322t11 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t11).c("cb", "openDefaultApplication result = " + zA + " for url = " + str3);
        }
        if (zA) {
            a(Ua.LPStartSuccess, c2988gb, (Integer) null);
            c(str, str2, str3);
            InterfaceC3322t9 interfaceC3322t12 = this.f26322g;
            if (interfaceC3322t12 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t12).c("cb", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new C2859bb(1);
        }
        InterfaceC3322t9 interfaceC3322t13 = this.f26322g;
        if (interfaceC3322t13 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t13).c("cb", "Trying appLinkOrDeepLinkHandled with urlEndpoint = " + queryParameter);
        }
        int iA = AbstractC3215p5.a(this.f26316a, queryParameter, this.f26320e, str, this.f26322g);
        if (iA == 0 || iA == 1) {
            a(Ua.LPStartSuccess, c2988gb, (Integer) null);
            c(str, str2, str3);
            InterfaceC3322t9 interfaceC3322t14 = this.f26322g;
            if (interfaceC3322t14 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t14).c("cb", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new C2859bb(1);
        }
        Ta ta3 = this.f26319d;
        if (ta3 != null) {
            ta3.a(str2, "Invalid URL", str);
        }
        InterfaceC3322t9 interfaceC3322t15 = this.f26322g;
        if (interfaceC3322t15 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t15).c("cb", "processedResult = " + iA);
        }
        InterfaceC3322t9 interfaceC3322t16 = this.f26322g;
        if (interfaceC3322t16 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t16).c("cb", "InmobiNativeBrowser scheme url handling failed");
        }
        a(Ua.LPBrowserOpenFailed, c2988gb, Integer.valueOf(iA));
        return new C2859bb(2, Integer.valueOf(iA));
    }

    public final int c(String str, String str2, String str3, C2988gb c2988gb) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).a("cb", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, c2988gb);
        } catch (Exception e10) {
            Ta ta2 = this.f26319d;
            if (ta2 != null) {
                ta2.a(str2, "Unexpected error", com.vungle.ads.internal.presenter.g.OPEN);
            }
            Sb.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
            if (interfaceC3322t10 == null) {
                return 9;
            }
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t10).b("cb", "SDK encountered unexpected error in handling open() request from creative " + e10.getMessage());
            return 9;
        }
    }

    public final int d(String api, String str, String str2, C2988gb c2988gb) {
        String strA;
        kotlin.jvm.internal.s.h(api, "api");
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).c("cb", "processOpenCCTRequest - url - " + str2);
        }
        if (c2988gb != null) {
            c2988gb.f26602f = "IN_NATIVE";
        }
        if (str2 == null || (bm.r.N(str2, "http", false, 2, null) && !URLUtil.isValidUrl(str2))) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t10).c("cb", api + " called with invalid url (" + str2 + ")");
            }
            Ta ta2 = this.f26319d;
            if (ta2 != null) {
                ta2.a(str, "Invalid URL", api);
            }
            a(Ua.LPStartFailed, c2988gb, (Integer) 3);
            return 3;
        }
        String strA2 = AbstractC3085k5.a(this.f26316a);
        try {
            try {
                boolean z10 = this.f26317b.f26405c;
                if (strA2 != null && z10) {
                    U2 u10 = new U2(str2, null, this.f26316a, this.f26318c, this.f26320e, c2988gb, api);
                    C3034i5 c3034i5 = u10.f25798e;
                    Context context = u10.f25799f;
                    if (c3034i5.f26721a == null && context != null && (strA = AbstractC3085k5.a(context)) != null) {
                        C2982g5 c2982g5 = new C2982g5(c3034i5);
                        c3034i5.f26722b = c2982g5;
                        androidx.browser.customtabs.c.a(context, strA, c2982g5);
                    }
                    InterfaceC3322t9 interfaceC3322t11 = this.f26322g;
                    if (interfaceC3322t11 != null) {
                        kotlin.jvm.internal.s.g("cb", "TAG");
                        ((C3348u9) interfaceC3322t11).c("cb", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                InterfaceC3322t9 interfaceC3322t12 = this.f26322g;
                if (interfaceC3322t12 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t12).a("cb", "ChromeCustomTab fallback to Embedded");
                }
                if (c2988gb != null) {
                    c2988gb.f26602f = "IN_CUSTOM";
                }
                return a(str2, api, c2988gb);
            } catch (Exception e10) {
                InterfaceC3322t9 interfaceC3322t13 = this.f26322g;
                if (interfaceC3322t13 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t13).a("cb", "Exception occurred while opening External ", e10);
                }
                return 9;
            }
        } catch (Exception unused) {
            int iA = B3.a(this.f26316a, str2, this.f26320e, api);
            if (iA != 0 && iA != 1) {
                return iA;
            }
            c(api, str, str2);
            if (c2988gb != null) {
                c2988gb.f26602f = "EX_NATIVE";
            }
            a(Ua.LPStartSuccess, c2988gb, (Integer) null);
            return iA;
        }
    }

    public final int e(String str, String str2, String str3, C2988gb c2988gb) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).a("cb", "In processOpenExternalNativeRequest");
        }
        int iA = AbstractC3215p5.a(this.f26316a, str3, this.f26320e, str, this.f26322g);
        if (iA != 0 && iA != 1) {
            return d(str, str2, str3, c2988gb);
        }
        if (c2988gb != null) {
            c2988gb.f26602f = "EX_NATIVE";
        }
        a(Ua.LPStartSuccess, c2988gb, (Integer) null);
        c(str, str2, str3);
        InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
        if (interfaceC3322t10 == null) {
            return 0;
        }
        kotlin.jvm.internal.s.g("cb", "TAG");
        ((C3348u9) interfaceC3322t10).c("cb", "External Native handled successfully");
        return 0;
    }

    public final void f(String str, String str2, String str3, C2988gb c2988gb) {
        String strEncode;
        try {
            try {
                try {
                    int iA = B3.a(this.f26316a, str2, this.f26320e, "openExternal");
                    if (iA != 0 && iA != 1) {
                        a(Ua.LPBrowserOpenFailed, c2988gb, Integer.valueOf(iA));
                        Ta ta2 = this.f26319d;
                        if (ta2 != null) {
                            try {
                                strEncode = URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                                kotlin.jvm.internal.s.e(strEncode);
                            } catch (UnsupportedEncodingException unused) {
                                strEncode = str2;
                            }
                            ta2.a(str, "Cannot resolve URI (" + strEncode + ")", "openExternal");
                            return;
                        }
                        return;
                    }
                    a(Ua.LPStartSuccess, c2988gb, (Integer) null);
                    c("openExternal", str, str2);
                } catch (ActivityNotFoundException e10) {
                    e = e10;
                    a(this, str, str2, str3, c2988gb, e);
                } catch (URISyntaxException e11) {
                    e = e11;
                    a(this, str, str2, str3, c2988gb, e);
                }
            } catch (NullPointerException e12) {
                a(this, str, str2, str3, c2988gb, e12);
            } catch (Exception e13) {
                a(Ua.LPBrowserOpenFailed, c2988gb, (Integer) 9);
                Ta ta3 = this.f26319d;
                if (ta3 != null) {
                    ta3.a(str, "Unexpected error", "openExternal");
                }
                kotlin.jvm.internal.s.g("cb", "TAG");
                Sb.a((byte) 1, "cb", "Could not open URL SDK encountered an unexpected error");
                InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
                if (interfaceC3322t9 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t9).b("cb", "SDK encountered unexpected error in handling openExternal() request from creative " + e13.getMessage());
                }
            }
        } catch (ActivityNotFoundException e14) {
            e = e14;
        } catch (URISyntaxException e15) {
            e = e15;
        }
    }

    public C2885cb(Context context, C2911db landingPageState, C2840ai c2840ai, Ta ta2, InterfaceC3408wh redirectionValidator, C3014hb c3014hb, InterfaceC3322t9 interfaceC3322t9, WeakReference weakReference) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(landingPageState, "landingPageState");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        this.f26316a = context;
        this.f26317b = landingPageState;
        this.f26318c = c2840ai;
        this.f26319d = ta2;
        this.f26320e = redirectionValidator;
        this.f26321f = c3014hb;
        this.f26322g = interfaceC3322t9;
        this.f26323h = weakReference;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e6  */
    public final C2859bb a(String api, String str, String str2, C2988gb c2988gb, boolean z10) {
        C2988gb c2988gb2;
        InterfaceC3322t9 interfaceC3322t9;
        int iC;
        InterfaceC3322t9 interfaceC3322t10;
        InterfaceC3322t9 interfaceC3322t11;
        kotlin.jvm.internal.s.h(api, "api");
        InterfaceC3322t9 interfaceC3322t12 = this.f26322g;
        if (interfaceC3322t12 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t12).c("cb", "processing URL - " + str2);
        }
        if (c2988gb == null) {
            C3014hb c3014hb = this.f26321f;
            if (c3014hb == null || this.f26317b.f26403a || z10) {
                c2988gb2 = null;
            } else {
                String strA = Xa.a(str2);
                int i10 = this.f26324i + 1;
                this.f26324i = i10;
                c2988gb2 = new C2988gb(c3014hb, strA, i10, SystemClock.elapsedRealtime());
            }
        } else {
            c2988gb2 = c2988gb;
        }
        a(Ua.LPClickStart, c2988gb2, (Integer) null);
        if (str2 == null || str2.length() == 0) {
            C2988gb c2988gb3 = c2988gb2;
            InterfaceC3322t9 interfaceC3322t13 = this.f26322g;
            if (interfaceC3322t13 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t13).c("cb", "url is empty");
            }
            a(Ua.LPStartFailed, c2988gb3, (Integer) 2);
            b(api, str, str2);
            return new C2859bb(3, 2);
        }
        Uri uri = Uri.parse(str2);
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            C2988gb c2988gb4 = c2988gb2;
            InterfaceC3322t9 interfaceC3322t14 = this.f26322g;
            if (interfaceC3322t14 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t14).c("cb", "url scheme is empty");
            }
            a(Ua.LPStartFailed, c2988gb4, (Integer) 4);
            b(api, str, str2);
            return new C2859bb(3, 4);
        }
        if (kotlin.jvm.internal.s.c(this.f26317b.f26404b, "SKSTORE")) {
            InterfaceC3322t9 interfaceC3322t15 = this.f26322g;
            if (interfaceC3322t15 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t15).c("cb", "inline installer");
            }
            return a(api, str, this.f26317b.f26407e, str2, c2988gb2);
        }
        C2988gb c2988gb5 = c2988gb2;
        if (kotlin.jvm.internal.s.c(uri.getScheme(), "inmobinativebrowser")) {
            InterfaceC3322t9 interfaceC3322t16 = this.f26322g;
            if (interfaceC3322t16 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t16).c("cb", "inmobi native browser scheme");
            }
            return b(api, str, str2, c2988gb5);
        }
        if (kotlin.jvm.internal.s.c(uri.getScheme(), qEagQqzJZsd.WWSK)) {
            InterfaceC3322t9 interfaceC3322t17 = this.f26322g;
            if (interfaceC3322t17 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t17).c("cb", "inmobi deeplink scheme");
            }
            return a(api, str, str2, c2988gb5);
        }
        if (F1.a(this.f26316a, str2, this.f26320e, api, this.f26322g) || AbstractC3215p5.a(str2, this.f26316a, this.f26320e, this.f26322g)) {
            InterfaceC3322t9 interfaceC3322t18 = this.f26322g;
            if (interfaceC3322t18 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t18).c("cb", "appstore link");
            }
            c(api, str, str2);
            if (c2988gb5 != null) {
                c2988gb5.f26602f = "EX_NATIVE";
            }
            a(Ua.LPStartSuccess, c2988gb5, (Integer) null);
            return new C2859bb(1);
        }
        kotlin.jvm.internal.s.e(uri);
        if (!B3.a(uri)) {
            int iA = AbstractC3215p5.a(this.f26316a, str2, this.f26320e, api, this.f26322g);
            if (c2988gb5 != null) {
                c2988gb5.f26602f = "EX_NATIVE";
            }
            if (iA == 0 || iA == 1) {
                a(Ua.LPStartSuccess, c2988gb5, (Integer) null);
                c(api, str, str2);
                InterfaceC3322t9 interfaceC3322t19 = this.f26322g;
                if (interfaceC3322t19 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t19).c("cb", "Deeplink url handled successfully");
                }
                return new C2859bb(1);
            }
            InterfaceC3322t9 interfaceC3322t20 = this.f26322g;
            if (interfaceC3322t20 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t20).c("cb", "In processOpenRequest else");
            }
            b(api, str, str2);
            a(Ua.LPBrowserOpenFailed, c2988gb5, Integer.valueOf(iA));
            return new C2859bb(2, Integer.valueOf(iA));
        }
        InterfaceC3322t9 interfaceC3322t21 = this.f26322g;
        if (interfaceC3322t21 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t21).c("cb", "http link");
        }
        C2911db c2911db = this.f26317b;
        if (c2911db.f26403a) {
            return new C2859bb(0);
        }
        String str3 = c2911db.f26404b;
        int iHashCode = str3.hashCode();
        if (iHashCode != -2032180703) {
            if (iHashCode != -702637789) {
                if (iHashCode != 112775115) {
                    if (iHashCode == 409244785 && str3.equals("IN_NATIVE")) {
                        interfaceC3322t10 = this.f26322g;
                        if (interfaceC3322t10 != null) {
                            kotlin.jvm.internal.s.g("cb", "TAG");
                            ((C3348u9) interfaceC3322t10).c("cb", "default - internal native");
                        }
                        iC = c(api, str, str2, c2988gb5);
                    }
                } else if (str3.equals("IN_CUSTOM")) {
                    InterfaceC3322t9 interfaceC3322t22 = this.f26322g;
                    if (interfaceC3322t22 != null) {
                        kotlin.jvm.internal.s.g("cb", "TAG");
                        ((C3348u9) interfaceC3322t22).c("cb", "open internal custom");
                    }
                    InterfaceC3322t9 interfaceC3322t23 = this.f26322g;
                    if (interfaceC3322t23 != null) {
                        kotlin.jvm.internal.s.g("cb", "TAG");
                        ((C3348u9) interfaceC3322t23).a("cb", "In processOpenInternalCustomRequest");
                    }
                    iC = a(str2, api, c2988gb5);
                    if ((iC == 0 || iC == 1) && (interfaceC3322t11 = this.f26322g) != null) {
                        kotlin.jvm.internal.s.g("cb", "TAG");
                        ((C3348u9) interfaceC3322t11).c("cb", "Internal Custom handled successfully");
                    }
                }
                interfaceC3322t9 = this.f26322g;
                if (interfaceC3322t9 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t9).c("cb", "invalid scheme - open internal native");
                }
                iC = c(api, str, str2, c2988gb5);
            } else if (str3.equals("EX_NATIVE")) {
                InterfaceC3322t9 interfaceC3322t24 = this.f26322g;
                if (interfaceC3322t24 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t24).c("cb", "open external native");
                }
                iC = e(api, str, str2, c2988gb5);
            } else {
                interfaceC3322t9 = this.f26322g;
                if (interfaceC3322t9 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t9).c("cb", "invalid scheme - open internal native");
                }
                iC = c(api, str, str2, c2988gb5);
            }
        } else if (str3.equals("DEFAULT")) {
            interfaceC3322t10 = this.f26322g;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t10).c("cb", "default - internal native");
            }
            iC = c(api, str, str2, c2988gb5);
        } else {
            interfaceC3322t9 = this.f26322g;
            if (interfaceC3322t9 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t9).c("cb", "invalid scheme - open internal native");
            }
            iC = c(api, str, str2, c2988gb5);
        }
        if (iC == 0 || iC == 1) {
            return new C2859bb(1);
        }
        if (c2988gb5 != null) {
            c2988gb5.f26602f = this.f26317b.f26404b;
        }
        a(Ua.LPBrowserOpenFailed, c2988gb5, Integer.valueOf(iC));
        return new C2859bb(2, Integer.valueOf(iC));
    }

    public final void c(String str, String str2, String str3) {
        Ta ta2 = this.f26319d;
        if (ta2 != null) {
            ta2.a();
        }
        Ta ta3 = this.f26319d;
        if (ta3 != null) {
            ta3.b(str, str2, str3);
        }
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).c("cb", str + " called with invalid url (" + str3 + ")");
        }
        Ta ta2 = this.f26319d;
        if (ta2 != null) {
            ta2.a(str2, "Invalid URL", str);
        }
    }

    public final boolean a(String str, String str2, C2988gb c2988gb, Q2 q10) {
        String strA;
        try {
            if (!this.f26317b.f26406d || q10 == null) {
                return false;
            }
            String strA2 = AbstractC3085k5.a(this.f26316a);
            if (strA2 != null) {
                try {
                    boolean zB = Mf.b(Mf.a(N5.g()));
                    Class cls = Integer.TYPE;
                    if (zB) {
                        androidx.browser.customtabs.d.C0018d.class.getDeclaredMethod("j", cls);
                    } else {
                        androidx.browser.customtabs.d.C0018d.class.getDeclaredMethod("h", cls);
                    }
                    U2 u10 = new U2(str2, q10, this.f26316a, this.f26318c, this.f26320e, c2988gb, str);
                    C3034i5 c3034i5 = u10.f25798e;
                    Context context = u10.f25799f;
                    if (c3034i5.f26721a == null && context != null && (strA = AbstractC3085k5.a(context)) != null) {
                        C2982g5 c2982g5 = new C2982g5(c3034i5);
                        c3034i5.f26722b = c2982g5;
                        androidx.browser.customtabs.c.a(context, strA, c2982g5);
                        return true;
                    }
                    return true;
                } catch (Error | Exception unused) {
                }
            }
            InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
            if (interfaceC3322t9 == null) {
                return false;
            }
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).c("cb", "Partial tabs not supported: packageName - " + strA2);
            return false;
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
            if (interfaceC3322t10 == null) {
                return false;
            }
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t10).c("cb", "Error while opening partial tab: " + e10.getMessage());
            return false;
        }
    }

    public final int a(String api, String str, String str2, C2988gb c2988gb, Q2 q10) {
        kotlin.jvm.internal.s.h(api, "api");
        if (str2 != null && str2.length() != 0) {
            Uri uri = Uri.parse(str2);
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (kotlin.jvm.internal.s.c(uri.getScheme(), "inmobinativebrowser")) {
                    b(api, str, str2, c2988gb);
                    return 2;
                }
                if (kotlin.jvm.internal.s.c(uri.getScheme(), "inmobideeplink")) {
                    return a(api, str, str2, c2988gb).f26255a == 1 ? 2 : 4;
                }
                if (F1.a(this.f26316a, str2, this.f26320e, api, this.f26322g) | AbstractC3215p5.a(str2, this.f26316a, this.f26320e, this.f26322g)) {
                    c(api, str, str2);
                    if (c2988gb != null) {
                        c2988gb.f26602f = "EX_NATIVE";
                    }
                    a(Ua.LPStartSuccess, c2988gb, (Integer) null);
                    return 2;
                }
                kotlin.jvm.internal.s.e(uri);
                if (B3.a(uri) && a(api, str2, c2988gb, q10)) {
                    return 5;
                }
                if (B3.a(uri)) {
                    return 3;
                }
                int iA = AbstractC3215p5.a(this.f26316a, str2, this.f26320e, api, this.f26322g);
                if (c2988gb != null) {
                    c2988gb.f26602f = "EX_NATIVE";
                }
                if (iA != 0 && iA != 1) {
                    InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
                    if (interfaceC3322t9 != null) {
                        kotlin.jvm.internal.s.g("cb", "TAG");
                        ((C3348u9) interfaceC3322t9).b("cb", "CustomExpand handling failed");
                    }
                    a(Ua.LPCompleteFailed, c2988gb, (Integer) null);
                    return 4;
                }
                c(api, str, str2);
                a(Ua.LPStartSuccess, c2988gb, (Integer) null);
                InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
                if (interfaceC3322t10 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t10).c("cb", "Deeplink url handled successfully");
                }
                return 2;
            }
            b(api, str, str2);
            a(Ua.LPStartFailed, c2988gb, (Integer) 4);
            return 1;
        }
        b(api, str, str2);
        a(Ua.LPStartFailed, c2988gb, (Integer) 2);
        return 1;
    }

    public final C2859bb a(String str, String str2, String str3, C2988gb c2988gb) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).a("cb", "In processInMobiDeepLinkScheme");
        }
        Uri uri = Uri.parse(str3);
        int iA = a(str, uri.getQueryParameter("primaryUrl"), uri.getQueryParameter("primaryTrackingUrl"));
        if (iA != 0 && iA != 1) {
            int iA2 = a(str, uri.getQueryParameter("fallbackUrl"), uri.getQueryParameter("fallbackTrackingUrl"));
            if (c2988gb != null) {
                c2988gb.f26602f = "EX_NATIVE";
            }
            if (iA2 != 0 && iA2 != 1) {
                Ta ta2 = this.f26319d;
                if (ta2 != null) {
                    ta2.a(str2, "Invalid URL", str);
                }
                InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
                if (interfaceC3322t10 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t10).c("cb", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                a(Ua.LPBrowserOpenFailed, c2988gb, Integer.valueOf(iA2));
                return new C2859bb(2, Integer.valueOf(iA2));
            }
            InterfaceC3322t9 interfaceC3322t11 = this.f26322g;
            if (interfaceC3322t11 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t11).c("cb", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            a(Ua.LPStartSuccess, c2988gb, (Integer) null);
            c(str, str2, str3);
            return new C2859bb(1);
        }
        InterfaceC3322t9 interfaceC3322t12 = this.f26322g;
        if (interfaceC3322t12 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t12).c("cb", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (c2988gb != null) {
            c2988gb.f26602f = "EX_NATIVE";
        }
        a(Ua.LPStartSuccess, c2988gb, (Integer) null);
        c(str, str2, str3);
        return new C2859bb(1);
    }

    public final int a(String str, String str2, String url) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).c("cb", "inMobiDeepLinkSchemeUrlHandled - url - " + str2 + " trackingUrl " + url);
        }
        if (str2 != null && str2.length() != 0) {
            if (AbstractC3215p5.a(str2, this.f26316a, this.f26320e, this.f26322g)) {
                if (J3.a(url)) {
                    A3 a10 = A3.f24440a;
                    kotlin.jvm.internal.s.e(url);
                    InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
                    kotlin.jvm.internal.s.h(url, "url");
                    A3.a(url, true, interfaceC3322t10);
                } else {
                    InterfaceC3322t9 interfaceC3322t11 = this.f26322g;
                    if (interfaceC3322t11 != null) {
                        kotlin.jvm.internal.s.g("cb", "TAG");
                        ((C3348u9) interfaceC3322t11).b("cb", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                InterfaceC3322t9 interfaceC3322t12 = this.f26322g;
                if (interfaceC3322t12 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t12).c("cb", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int iA = AbstractC3215p5.a(this.f26316a, str2, this.f26320e, str, this.f26322g);
            if (iA != 0 && iA != 1) {
                InterfaceC3322t9 interfaceC3322t13 = this.f26322g;
                if (interfaceC3322t13 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t13).c("cb", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return iA;
            }
            if (J3.a(url)) {
                A3 a11 = A3.f24440a;
                kotlin.jvm.internal.s.e(url);
                InterfaceC3322t9 interfaceC3322t14 = this.f26322g;
                kotlin.jvm.internal.s.h(url, "url");
                A3.a(url, true, interfaceC3322t14);
            } else {
                InterfaceC3322t9 interfaceC3322t15 = this.f26322g;
                if (interfaceC3322t15 != null) {
                    kotlin.jvm.internal.s.g("cb", "TAG");
                    ((C3348u9) interfaceC3322t15).b("cb", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            InterfaceC3322t9 interfaceC3322t16 = this.f26322g;
            if (interfaceC3322t16 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t16).c("cb", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        InterfaceC3322t9 interfaceC3322t17 = this.f26322g;
        if (interfaceC3322t17 == null) {
            return 2;
        }
        kotlin.jvm.internal.s.g("cb", "TAG");
        ((C3348u9) interfaceC3322t17).b("cb", "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    public final int a(String url, String api, C2988gb c2988gb) {
        C2988gb c2988gbA;
        C2988gb c2988gbA2;
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(api, "api");
        if (c2988gb != null) {
            c2988gb.f26602f = "IN_CUSTOM";
        }
        if (url.length() == 0) {
            InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
            if (interfaceC3322t9 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t9).b("cb", "processOpenEmbeddedRequest failed due to empty URL");
            }
            a(Ua.LPStartFailed, c2988gb, (Integer) null);
            return 2;
        }
        Uri uri = Uri.parse(url);
        kotlin.jvm.internal.s.g(uri, PAFNPq.FpNSnlYKoYzAreE);
        if (B3.a(uri)) {
            Intent intent = new Intent(this.f26316a, (Class<?>) InMobiInAppBrowserActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.f26320e.getViewTouchTimestamp());
            if (c2988gb != null) {
                c2988gbA = C2988gb.a(c2988gb);
                Ua ua2 = Ua.LPClickStart;
                c2988gbA.f26601e = 2;
                fl.g0 g0Var = fl.g0.f38750a;
            } else {
                c2988gbA = null;
            }
            intent.putExtra("lpTelemetryControlInfo", c2988gbA);
            if (c2988gb != null) {
                c2988gbA2 = C2988gb.a(c2988gb);
                Ua ua3 = Ua.LPClickStart;
                c2988gbA2.f26601e = 2;
                fl.g0 g0Var2 = fl.g0.f38750a;
            } else {
                c2988gbA2 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", c2988gbA2);
            InterfaceC3322t9 obj = this.f26322g;
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
            Ta ta2 = this.f26319d;
            if (ta2 != null) {
                ta2.a(intent);
            }
            a(Ua.LPStartSuccess, c2988gb, (Integer) null);
            Ta ta3 = this.f26319d;
            if (ta3 == null) {
                return 1;
            }
            ta3.b(null, null, url);
            return 1;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
        if (interfaceC3322t10 == null) {
            return 10;
        }
        kotlin.jvm.internal.s.g("cb", "TAG");
        ((C3348u9) interfaceC3322t10).b("cb", "Embedded request unable to handle " + url);
        return 10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    public final C2859bb a(String api, String str, InlineParams inlineParams, String url, C2988gb c2988gb) {
        boolean z10;
        kotlin.jvm.internal.s.h(api, "api");
        kotlin.jvm.internal.s.h(url, "url");
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).a("cb", "inline installer called with URL: " + url);
        }
        if (c2988gb != null) {
            c2988gb.f26602f = "SKSTORE";
        }
        AbstractC2833ab abstractC2833abA = a(inlineParams);
        if (abstractC2833abA instanceof Za) {
            Za za2 = (Za) abstractC2833abA;
            if (inlineParams != null) {
                z10 = inlineParams.getPingInWebView();
            }
            return a(api, str, c2988gb, url, za2, z10);
        }
        if (abstractC2833abA instanceof Ya) {
            return a(url, api, str, c2988gb, ((Ya) abstractC2833abA).f26075a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AbstractC2833ab a(InlineParams inlineParams) {
        Activity fullScreenActivity;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        if (inlineParams == null) {
            return new Ya(8700);
        }
        WeakReference weakReference = this.f26323h;
        if (weakReference == null || (gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) weakReference.get()) == null) {
            fullScreenActivity = null;
        } else {
            fullScreenActivity = gestureDetectorOnGestureListenerC3228pi.getFullScreenActivity();
            if (fullScreenActivity == null) {
                fullScreenActivity = gestureDetectorOnGestureListenerC3228pi.getBannerHolderActivity().get();
            }
        }
        String packageName = this.f26316a.getPackageName();
        String targetBundleId = inlineParams.getTargetBundleId();
        boolean overlay = inlineParams.getOverlay();
        String url = inlineParams.getUrl();
        if (targetBundleId != null && targetBundleId.length() != 0) {
            kotlin.jvm.internal.s.e(packageName);
            if (packageName.length() == 0) {
                return new Ya(8703);
            }
            if (fullScreenActivity == null) {
                return new Ya(8704);
            }
            if (url != null && url.length() != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(url);
                sb2.append("id=" + targetBundleId);
                String referrer = inlineParams.getReferrer();
                String listing = inlineParams.getListing();
                if (referrer != null && !bm.r.h0(referrer)) {
                    sb2.append('&');
                    sb2.append("referrer=" + referrer);
                }
                if (listing != null && !bm.r.h0(listing)) {
                    sb2.append('&');
                    sb2.append("listing=" + listing);
                }
                return new Za(fullScreenActivity, sb2.toString(), packageName, overlay);
            }
            return new Ya(2);
        }
        return new Ya(8702);
    }

    public final C2859bb a(String str, String str2, String str3, C2988gb c2988gb, int i10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).a("cb", "Executing inline installer fallback flow for URL: " + str);
        }
        a(i10, c2988gb);
        if (c2988gb != null) {
            c2988gb.f26602f = "EX_NATIVE";
        }
        if (F1.a(this.f26316a, str, this.f26320e, str2, this.f26322g)) {
            a(Ua.LPStartSuccess, c2988gb, (Integer) null);
            c(str2, str3, str);
            return new C2859bb(1);
        }
        if (AbstractC3215p5.a(str, this.f26316a, this.f26320e, this.f26322g)) {
            a(Ua.LPStartSuccess, c2988gb, (Integer) null);
            c(str2, str3, str);
            return new C2859bb(1);
        }
        int iE = e(str2, str3, str, c2988gb);
        if (iE != 0 && iE != 1) {
            a(Ua.LPBrowserOpenFailed, c2988gb, Integer.valueOf(iE));
            Ta ta2 = this.f26319d;
            if (ta2 != null) {
                ta2.a(str3, "Launch failed", str2);
            }
            return new C2859bb(2, Integer.valueOf(iE));
        }
        return new C2859bb(1);
    }

    public final C2859bb a(String str, String str2, C2988gb c2988gb, String url, Za za2, boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).a("cb", "Executing inline installer flow for URL: " + url);
        }
        int iA = B3.a(za2, this.f26320e, str);
        if (iA != 0 && iA != 1) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26322g;
            if (interfaceC3322t10 != null) {
                kotlin.jvm.internal.s.g("cb", "TAG");
                ((C3348u9) interfaceC3322t10).a("cb", "Inline installer launch failed; executing fallback for URL: " + url + ", errorCode: " + iA);
            }
            return a(url, str, str2, c2988gb, iA);
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f26322g;
        if (interfaceC3322t11 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t11).a("cb", "Inline installer launch succeeded for URL: " + url);
        }
        if (z10) {
            A3 a10 = A3.f24440a;
            InterfaceC3322t9 interfaceC3322t12 = this.f26322g;
            kotlin.jvm.internal.s.h(url, "url");
            Mg.a(Jg.REGULAR, new C3316t3(url, true, interfaceC3322t12, null));
        } else {
            A3 a11 = A3.f24440a;
            InterfaceC3322t9 interfaceC3322t13 = this.f26322g;
            kotlin.jvm.internal.s.h(url, "url");
            A3.a(url, true, interfaceC3322t13);
        }
        a(Ua.LPStartSuccess, c2988gb, (Integer) null);
        Ta ta2 = this.f26319d;
        if (ta2 != null) {
            ta2.b(str, str2, url);
        }
        return new C2859bb(1);
    }

    public final void a(int i10, C2988gb c2988gb) {
        Object objB;
        InterfaceC3322t9 interfaceC3322t9;
        C3014hb c3014hb;
        try {
            fl.r.a aVar = fl.r.f38769b;
            if (c2988gb == null || (c3014hb = c2988gb.f26597a) == null) {
                c3014hb = this.f26321f;
            }
            Map mapM = gl.l0.m(fl.w.a("errorCode", Integer.valueOf(i10)));
            if (c3014hb != null) {
                mapM.put("plType", c3014hb.f26668c);
                mapM.put("impressionId", c3014hb.f26667b);
                mapM.put("plId", Long.valueOf(c3014hb.f26666a));
                mapM.put("adType", c3014hb.f26669d);
                mapM.put("markupType", c3014hb.f26670e);
                mapM.put("creativeType", c3014hb.f26671f);
                mapM.put("metadataBlob", c3014hb.f26672g);
                mapM.put("isRewarded", Boolean.valueOf(c3014hb.f26673h));
            }
            if (c2988gb != null) {
                String str = c2988gb.f26602f;
                if (str == null) {
                    str = c2988gb.f26597a.f26674i;
                }
                mapM.put("trigger", str);
                mapM.put("urlType", c2988gb.f26598b);
                long j10 = c2988gb.f26600d;
                if (j10 != 0) {
                    em.o0 o0Var = AbstractC3488zl.f28033a;
                    mapM.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                }
            }
            mapM.put("networkType", B5.g());
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("InlineInstallFailed", mapM, EnumC3281rk.SDK);
            objB = fl.r.b(fl.g0.f38750a);
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        Throwable thE = fl.r.e(objB);
        if (thE == null || (interfaceC3322t9 = this.f26322g) == null) {
            return;
        }
        kotlin.jvm.internal.s.g("cb", "TAG");
        ((C3348u9) interfaceC3322t9).b("cb", "Failed to submit inline install failed telemetry: " + thE.getMessage());
    }

    public static final void a(C2885cb c2885cb, String str, String str2, String str3, C2988gb c2988gb, Exception exc) {
        InterfaceC3322t9 interfaceC3322t9 = c2885cb.f26322g;
        if (interfaceC3322t9 != null) {
            kotlin.jvm.internal.s.g("cb", "TAG");
            ((C3348u9) interfaceC3322t9).b("cb", "Error message in processing openExternal: " + exc.getMessage());
        }
        Ta ta2 = c2885cb.f26319d;
        if (ta2 != null) {
            try {
                String strEncode = URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                kotlin.jvm.internal.s.e(strEncode);
                str2 = strEncode;
            } catch (UnsupportedEncodingException unused) {
            }
            ta2.a(str, "Cannot resolve URI (" + str2 + ")", "openExternal");
        }
        if (str3 != null) {
            c2885cb.f(str, str3, null, c2988gb);
        }
    }

    public final void a(Ua funnelState, C2988gb c2988gb, Integer num) {
        kotlin.jvm.internal.s.h(funnelState, "funnelState");
        Xa.a(funnelState, c2988gb, num, new tl.o() { // from class: yh.g7
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return C2885cb.a(this.f57737a, (String) obj, (Map) obj2);
            }
        });
    }

    public static final fl.g0 a(C2885cb c2885cb, String trackerName, Map macros) {
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
        Ta ta2 = c2885cb.f26319d;
        if (ta2 != null) {
            ta2.a(trackerName, macros);
        }
        return fl.g0.f38750a;
    }
}
