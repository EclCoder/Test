package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.b1;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14988c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f14989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f14990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static o.b f14991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f14992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile String f14993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f14994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f14995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.facebook.internal.n0.a f14996k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.appevents.a f14998b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void p() {
            synchronized (s.g()) {
                if (s.c() != null) {
                    return;
                }
                s.k(new ScheduledThreadPoolExecutor(1));
                fl.g0 g0Var = fl.g0.f38750a;
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.q();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorC = s.c();
                if (scheduledThreadPoolExecutorC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutorC.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q() {
            HashSet hashSet = new HashSet();
            Iterator it = m.p().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.facebook.appevents.a) it.next()).g());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                com.facebook.internal.a0.v((String) it2.next(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r(d dVar, com.facebook.appevents.a aVar) {
            m.g(aVar, dVar);
            if (com.facebook.internal.s.g(com.facebook.internal.s.b.OnDevicePostInstallEventProcessing) && p7.c.d()) {
                p7.c.e(aVar.g(), dVar);
            }
            if (com.facebook.internal.s.g(com.facebook.internal.s.b.GPSARATriggers)) {
                i7.b.f41169a.i(aVar.g(), dVar);
            }
            if (com.facebook.internal.s.g(com.facebook.internal.s.b.GPSPACAProcessing)) {
                j7.i.f42101a.d(aVar.g(), dVar);
            }
            if (dVar.g() || s.h()) {
                return;
            }
            if (kotlin.jvm.internal.s.c(dVar.k(), "fb_mobile_activate_app")) {
                s.i(true);
            } else {
                com.facebook.internal.r0.f15352e.b(com.facebook.r0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void s(String str) {
            com.facebook.internal.r0.f15352e.b(com.facebook.r0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        private final String u() {
            return com.facebook.h0.m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final void f(Application application, String str) {
            kotlin.jvm.internal.s.h(application, "application");
            if (!com.facebook.h0.K()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            c.d();
            v0.e();
            if (str == null) {
                str = com.facebook.h0.n();
            }
            com.facebook.h0.P(application, str);
            n7.g.z(application, str);
            if (com.facebook.internal.s.g(com.facebook.internal.s.b.GPSPACAProcessing)) {
                j7.i.f42101a.e(str, "fb_mobile_app_install");
            }
            if (com.facebook.internal.s.g(com.facebook.internal.s.b.GPSARATriggers)) {
                i7.b.f41169a.i(str, new d("unknown", "MOBILE_INSTALL_EVENT", null, null, false, n7.g.p(), n7.g.n(), null));
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        public final fl.q g(Bundle bundle, p0 p0Var, boolean z10) {
            p0.a aVar;
            String str = n7.k.g() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL;
            p0.a aVar2 = p0.f14972b;
            q0 q0Var = q0.IAPParameters;
            fl.q qVarB = aVar2.b(q0Var, "is_implicit_purchase_logging_enabled", str, bundle, p0Var);
            Object objC = aVar2.c(q0Var, "fb_iap_product_id", bundle, p0Var);
            String str2 = objC instanceof String ? (String) objC : null;
            if (z10) {
                aVar = aVar2;
            } else {
                if ((bundle != null ? bundle.getString("fb_content_id") : null) != null || str2 == null) {
                    aVar = aVar2;
                } else {
                    aVar = aVar2;
                    fl.q qVarB2 = aVar.b(q0Var, "fb_content_id", str2, bundle, p0Var);
                    qVarB = aVar.b(q0Var, "android_dynamic_ads_content_id", "client_manual", (Bundle) qVarB2.h(), (p0) qVarB2.i());
                }
            }
            fl.q qVarB3 = aVar.b(q0Var, "is_autolog_app_events_enabled", b1.g() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL, (Bundle) qVarB.h(), (p0) qVarB.i());
            return new fl.q((Bundle) qVarB3.h(), (p0) qVarB3.i());
        }

        public final void h() {
            if (k() != o.b.EXPLICIT_ONLY) {
                m.l(l0.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor i() {
            if (s.c() == null) {
                p();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorC = s.c();
            if (scheduledThreadPoolExecutorC != null) {
                return scheduledThreadPoolExecutorC;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String j(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            if (s.b() == null) {
                synchronized (s.g()) {
                    try {
                        if (s.b() == null) {
                            s.j(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (s.b() == null) {
                                s.j("XZ" + UUID.randomUUID());
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", s.b()).apply();
                            }
                        }
                        fl.g0 g0Var = fl.g0.f38750a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            String strB = s.b();
            if (strB != null) {
                return strB;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final o.b k() {
            o.b bVarD;
            synchronized (s.g()) {
                bVarD = s.d();
            }
            return bVarD;
        }

        public final String l() {
            com.facebook.internal.n0.e(s.e());
            return u();
        }

        public final String m() {
            String strF;
            synchronized (s.g()) {
                strF = s.f();
            }
            return strF;
        }

        public final void t() {
            m.s();
        }

        public final void v(String str) {
            SharedPreferences sharedPreferences = com.facebook.h0.m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(Context context, s logger) {
            kotlin.jvm.internal.s.h(context, "$context");
            kotlin.jvm.internal.s.h(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", QGbBllacZSmHKn.UdErfpQSI, "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", mTFeqtajA.qQMuVzTPb};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            for (int i11 = 0; i11 < 11; i11++) {
                String str = strArr[i11];
                String str2 = strArr2[i11];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i10 |= 1 << i11;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i10) {
                sharedPreferences.edit().putInt("kitsBitmask", i10).apply();
                logger.s("fb_sdk_initialize", null, bundle);
            }
        }

        public final void n(final Context context, String str) {
            kotlin.jvm.internal.s.h(context, "context");
            if (com.facebook.h0.q()) {
                final s sVar = new s(context, str, (com.facebook.a) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorC = s.c();
                if (scheduledThreadPoolExecutorC == null) {
                    throw new IllegalStateException(trPLwhKZgZ.OZaNaYJfNFG);
                }
                scheduledThreadPoolExecutorC.execute(new Runnable() { // from class: com.facebook.appevents.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.o(context, sVar);
                    }
                });
            }
        }
    }

    static {
        String canonicalName = s.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f14989d = canonicalName;
        f14991f = o.b.AUTO;
        f14992g = new Object();
        f14996k = new com.facebook.internal.n0.a() { // from class: com.facebook.appevents.p
            @Override // com.facebook.internal.n0.a
            public final void a(String str) {
                s.m(str);
            }
        };
    }

    public s(String activityName, String str, com.facebook.a aVar) {
        kotlin.jvm.internal.s.h(activityName, "activityName");
        f1.o();
        this.f14997a = activityName;
        aVar = aVar == null ? com.facebook.a.f14853l.e() : aVar;
        if (aVar == null || aVar.s() || !(str == null || kotlin.jvm.internal.s.c(str, aVar.c()))) {
            str = str == null ? e1.K(com.facebook.h0.m()) : str;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.f14998b = new com.facebook.appevents.a(null, str);
        } else {
            this.f14998b = new com.facebook.appevents.a(aVar);
        }
        f14988c.p();
    }

    public static final /* synthetic */ String b() {
        if (x7.a.c(s.class)) {
            return null;
        }
        try {
            return f14993h;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor c() {
        if (x7.a.c(s.class)) {
            return null;
        }
        try {
            return f14990e;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ o.b d() {
        if (x7.a.c(s.class)) {
            return null;
        }
        try {
            return f14991f;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ com.facebook.internal.n0.a e() {
        if (x7.a.c(s.class)) {
            return null;
        }
        try {
            return f14996k;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ String f() {
        if (x7.a.c(s.class)) {
            return null;
        }
        try {
            return f14995j;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ Object g() {
        if (x7.a.c(s.class)) {
            return null;
        }
        try {
            return f14992g;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean h() {
        if (x7.a.c(s.class)) {
            return false;
        }
        try {
            return f14994i;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
            return false;
        }
    }

    public static final /* synthetic */ void i(boolean z10) {
        if (x7.a.c(s.class)) {
            return;
        }
        try {
            f14994i = z10;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
        }
    }

    public static final /* synthetic */ void j(String str) {
        if (x7.a.c(s.class)) {
            return;
        }
        try {
            f14993h = str;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
        }
    }

    public static final /* synthetic */ void k(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (x7.a.c(s.class)) {
            return;
        }
        try {
            f14990e = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(String str) {
        if (x7.a.c(s.class)) {
            return;
        }
        try {
            f14988c.v(str);
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
        }
    }

    public static /* synthetic */ void q(s sVar, String str, Double d10, Bundle bundle, boolean z10, UUID uuid, p0 p0Var, int i10, Object obj) {
        if (x7.a.c(s.class)) {
            return;
        }
        if ((i10 & 32) != 0) {
            p0Var = null;
        }
        try {
            sVar.p(str, d10, bundle, z10, uuid, p0Var);
        } catch (Throwable th2) {
            x7.a.b(th2, s.class);
        }
    }

    public final void l() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            m.l(l0.EXPLICIT);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void n(String str, double d10, Bundle bundle) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            try {
                q(this, str, Double.valueOf(d10), bundle, false, n7.g.n(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                x7.a.b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void o(String str, Bundle bundle) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            try {
                q(this, str, null, bundle, false, n7.g.n(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                x7.a.b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    public final void p(String str, Double d10, Bundle bundle, boolean z10, UUID uuid, p0 p0Var) {
        Bundle bundle2;
        p0 p0Var2 = p0Var;
        if (x7.a.c(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (!z10 && n7.k.g() && (kotlin.jvm.internal.s.c(str, "fb_mobile_purchase") || kotlin.jvm.internal.s.c(str, "Subscribe") || kotlin.jvm.internal.s.c(str, "StartTrial"))) {
                Log.w(f14989d, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                if ((com.facebook.internal.s.g(com.facebook.internal.s.b.AndroidManualImplicitPurchaseDedupe) && kotlin.jvm.internal.s.c(str, "fb_mobile_purchase")) || (com.facebook.internal.s.g(com.facebook.internal.s.b.AndroidManualImplicitSubsDedupe) && (kotlin.jvm.internal.s.c(str, "Subscribe") || kotlin.jvm.internal.s.c(str, "StartTrial")))) {
                    l7.p pVar = l7.p.f44021a;
                    Double dG = pVar.g(d10, bundle);
                    Currency currencyB = pVar.b(bundle);
                    if (dG == null || currencyB == null) {
                        bundle2 = bundle;
                    } else {
                        fl.q qVarA = pVar.a(l7.s.f(gl.r.e(new l7.a(str, dG.doubleValue(), currencyB)), System.currentTimeMillis(), false, gl.r.e(new fl.q(bundle, p0Var2))), bundle, p0Var2);
                        Bundle bundle3 = (Bundle) qVarA.d();
                        p0Var2 = (p0) qVarA.g();
                        bundle2 = bundle3;
                    }
                } else {
                    bundle2 = bundle;
                }
            } else {
                bundle2 = bundle;
            }
            if (com.facebook.internal.v.d("app_events_killswitch", com.facebook.h0.n(), false)) {
                com.facebook.internal.r0.f15352e.c(com.facebook.r0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            if (m7.b.b(str)) {
                return;
            }
            a aVar = f14988c;
            fl.q qVarG = aVar.g(bundle2, p0Var2, z10);
            Bundle bundle4 = (Bundle) qVarG.d();
            p0 p0Var3 = (p0) qVarG.g();
            try {
                try {
                    if (!m7.e.f45305a.g(bundle4)) {
                        m7.g.c(bundle4, str);
                    }
                    m7.a.d(bundle4);
                    m7.d.h(bundle4, str);
                    m7.h.g(bundle4);
                    m7.e.f(bundle4);
                    m7.i.i(str, bundle4);
                    aVar.r(new d(this.f14997a, str, d10, bundle4, z10, n7.g.p(), uuid, p0Var3), this.f14998b);
                } catch (JSONException e10) {
                    com.facebook.internal.r0.f15352e.c(com.facebook.r0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e10.toString());
                }
            } catch (FacebookException e11) {
                com.facebook.internal.r0.f15352e.c(com.facebook.r0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e11.toString());
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void r(String str, String str2) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            o(str, bundle);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void s(String str, Double d10, Bundle bundle) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            try {
                q(this, str, d10, bundle, true, n7.g.n(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                x7.a.b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void t(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, p0 p0Var) {
        Throwable th2;
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                e1.l0(f14989d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th3) {
                    th2 = th3;
                    x7.a.b(th2, this);
                }
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                p(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, n7.g.n(), p0Var);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                x7.a.b(th2, this);
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void u(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10, p0 p0Var) {
        Throwable th2;
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f14988c.s("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f14988c.s("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                try {
                    p("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, n7.g.n(), p0Var);
                    f14988c.h();
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    x7.a.b(th2, this);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    public final void v(BigDecimal bigDecimal, Currency currency, Bundle bundle, p0 p0Var) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            u(bigDecimal, currency, bundle, true, p0Var);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public s(Context context, String str, com.facebook.a aVar) {
        this(e1.u(context), str, aVar);
    }
}
