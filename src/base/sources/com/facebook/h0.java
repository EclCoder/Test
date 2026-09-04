package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Executor f15083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f15084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile String f15085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f15086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f15087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile String f15088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile Boolean f15089j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile boolean f15091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f15092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static com.facebook.internal.q0 f15093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Context f15094o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f15098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f15099t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f15100u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f15105z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f15080a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15081b = h0.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f15082c = gl.s0.e(r0.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static AtomicLong f15090k = new AtomicLong(65536);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f15095p = 64206;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ReentrantLock f15096q = new ReentrantLock();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f15097r = com.facebook.internal.x0.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f15101v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static volatile String f15102w = "instagram.com";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static volatile String f15103x = "facebook.com";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static a f15104y = new a() { // from class: com.facebook.y
        @Override // com.facebook.h0.a
        public final j0 a(a aVar, String str, JSONObject jSONObject, j0.b bVar) {
            return h0.G(aVar, str, jSONObject, bVar);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        j0 a(com.facebook.a aVar, String str, JSONObject jSONObject, j0.b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();
    }

    public static final String A() {
        return f15102w;
    }

    public static final String B() {
        f1.o();
        String str = f15087h;
        return str == null ? "" : str;
    }

    public static final boolean C(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        f1.o();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final long D() {
        f1.o();
        return f15090k.get();
    }

    public static final String E() {
        f1.o();
        String str = f15086g;
        return str == null ? "" : str;
    }

    public static final String F() {
        return "18.3.0";
    }

    public static final j0 G(com.facebook.a aVar, String str, JSONObject jSONObject, j0.b bVar) {
        return j0.f15486n.A(aVar, str, jSONObject, bVar);
    }

    public static final boolean H() {
        return f15091l;
    }

    public static final boolean I(int i10) {
        int i11 = f15095p;
        return i10 >= i11 && i10 < i11 + 100;
    }

    public static final synchronized boolean J() {
        return f15105z;
    }

    public static final boolean K() {
        return f15101v.get();
    }

    public static final boolean L() {
        return f15092m;
    }

    public static final boolean M(r0 behavior) {
        boolean z10;
        kotlin.jvm.internal.s.h(behavior, "behavior");
        HashSet hashSet = f15082c;
        synchronized (hashSet) {
            z10 = H() && hashSet.contains(behavior);
        }
        return z10;
    }

    public static final void N(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.s.g(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f15084e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.s.g(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (bm.r.N(lowerCase, "fb", false, 2, null)) {
                        String strSubstring = str.substring(2);
                        kotlin.jvm.internal.s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
                        f15084e = strSubstring;
                    } else {
                        f15084e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            f15086g = applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            f15087h = applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (f15085f == null) {
                f15085f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f15088i == null) {
                f15088i = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f15095p == 64206) {
                f15095p = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f15089j == null) {
                f15089j = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final void P(Context context, final String applicationId) {
        if (x7.a.c(h0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(context, "context");
            kotlin.jvm.internal.s.h(applicationId, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            if (!com.facebook.internal.v.d("app_events_killswitch", n(), false)) {
                v().execute(new Runnable() { // from class: com.facebook.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h0.Q(applicationContext, applicationId);
                    }
                });
            }
            if (com.facebook.internal.s.g(com.facebook.internal.s.b.OnDeviceEventProcessing) && p7.c.d()) {
                p7.c.g(applicationId, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th2) {
            x7.a.b(th2, h0.class);
        }
    }

    public static final void Q(Context applicationContext, String applicationId) {
        kotlin.jvm.internal.s.h(applicationContext, "$applicationContext");
        kotlin.jvm.internal.s.h(applicationId, "$applicationId");
        f15080a.O(applicationContext, applicationId);
    }

    public static final synchronized void R(Context applicationContext) {
        kotlin.jvm.internal.s.h(applicationContext, "applicationContext");
        S(applicationContext, null);
    }

    public static final synchronized void S(Context applicationContext, final b bVar) {
        kotlin.jvm.internal.s.h(applicationContext, "applicationContext");
        if (f15101v.get()) {
            if (bVar != null) {
                bVar.a();
            }
            return;
        }
        try {
            FacebookActivity.Companion aVar = FacebookActivity.INSTANCE;
            f1.g(applicationContext, false);
        } catch (ClassNotFoundException unused) {
        }
        f1.i(applicationContext, false);
        Context applicationContext2 = applicationContext.getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext2, "applicationContext.applicationContext");
        f15094o = applicationContext2;
        com.facebook.appevents.o.f14964b.b(applicationContext);
        Context context = f15094o;
        Context context2 = null;
        if (context == null) {
            kotlin.jvm.internal.s.w("applicationContext");
            context = null;
        }
        N(context);
        String str = f15084e;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = f15088i;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        f15101v.set(true);
        if (p()) {
            j();
        }
        Context context3 = f15094o;
        if (context3 == null) {
            kotlin.jvm.internal.s.w("applicationContext");
            context3 = null;
        }
        if ((context3 instanceof Application) && b1.g()) {
            Context context4 = f15094o;
            if (context4 == null) {
                kotlin.jvm.internal.s.w("applicationContext");
                context4 = null;
            }
            n7.g.z((Application) context4, f15084e);
        } else {
            l7.r.i();
        }
        n7.j jVarA = n7.j.f46891b.a();
        if (jVarA != null) {
            Context context5 = f15094o;
            if (context5 == null) {
                kotlin.jvm.internal.s.w("applicationContext");
                context5 = null;
            }
            jVarA.j((Application) context5);
        }
        com.facebook.internal.a0.h();
        com.facebook.internal.u0.G();
        com.facebook.internal.c.a aVar2 = com.facebook.internal.c.f15143b;
        Context context6 = f15094o;
        if (context6 == null) {
            kotlin.jvm.internal.s.w("applicationContext");
        } else {
            context2 = context6;
        }
        aVar2.a(context2);
        f15093n = new com.facebook.internal.q0(new Callable() { // from class: com.facebook.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h0.T();
            }
        });
        com.facebook.internal.s.a(com.facebook.internal.s.b.Instrument, new com.facebook.internal.s.a() { // from class: com.facebook.a0
            @Override // com.facebook.internal.s.a
            public final void a(boolean z10) {
                h0.U(z10);
            }
        });
        com.facebook.internal.s.a(com.facebook.internal.s.b.AppEvents, new com.facebook.internal.s.a() { // from class: com.facebook.b0
            @Override // com.facebook.internal.s.a
            public final void a(boolean z10) {
                h0.V(z10);
            }
        });
        com.facebook.internal.s.a(com.facebook.internal.s.b.ChromeCustomTabsPrefetching, new com.facebook.internal.s.a() { // from class: com.facebook.c0
            @Override // com.facebook.internal.s.a
            public final void a(boolean z10) {
                h0.W(z10);
            }
        });
        com.facebook.internal.s.a(com.facebook.internal.s.b.IgnoreAppSwitchToLoggedOut, new com.facebook.internal.s.a() { // from class: com.facebook.d0
            @Override // com.facebook.internal.s.a
            public final void a(boolean z10) {
                h0.X(z10);
            }
        });
        com.facebook.internal.s.a(com.facebook.internal.s.b.BypassAppSwitch, new com.facebook.internal.s.a() { // from class: com.facebook.e0
            @Override // com.facebook.internal.s.a
            public final void a(boolean z10) {
                h0.Y(z10);
            }
        });
        v().execute(new FutureTask(new Callable(bVar) { // from class: com.facebook.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h0.Z(null);
            }
        }));
    }

    public static final File T() {
        Context context = f15094o;
        if (context == null) {
            kotlin.jvm.internal.s.w("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    public static final void U(boolean z10) {
        if (z10) {
            u7.g.d();
        }
    }

    public static final void V(boolean z10) {
        if (z10) {
            com.facebook.appevents.k0.a();
        }
    }

    public static final void W(boolean z10) {
        if (z10) {
            f15098s = true;
        }
    }

    public static final void X(boolean z10) {
        if (z10) {
            f15099t = true;
        }
    }

    public static final void Y(boolean z10) {
        if (z10) {
            f15100u = true;
        }
    }

    public static final Void Z(b bVar) {
        k.f15515f.e().n();
        u0.f16069d.a().d();
        if (com.facebook.a.f14853l.g()) {
            s0.b bVar2 = s0.f16003h;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        com.facebook.appevents.o.a aVar = com.facebook.appevents.o.f14964b;
        aVar.e(m(), f15084e);
        b1.o();
        Context applicationContext = m().getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext().applicationContext");
        aVar.f(applicationContext).a();
        return null;
    }

    public static final void j() {
        f15105z = true;
    }

    public static final Boolean k() {
        return b1.d();
    }

    public static final boolean l() {
        return b1.e();
    }

    public static final Context m() {
        f1.o();
        Context context = f15094o;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.s.w("applicationContext");
        return null;
    }

    public static final String n() {
        f1.o();
        String str = f15084e;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String o() {
        f1.o();
        return f15085f;
    }

    public static final boolean p() {
        return b1.f();
    }

    public static final boolean q() {
        return b1.g();
    }

    public static final File r() {
        f1.o();
        com.facebook.internal.q0 q0Var = f15093n;
        if (q0Var == null) {
            kotlin.jvm.internal.s.w("cacheDir");
            q0Var = null;
        }
        return (File) q0Var.c();
    }

    public static final int s() {
        f1.o();
        return f15095p;
    }

    public static final String t() {
        f1.o();
        String str = f15088i;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean u() {
        return b1.h();
    }

    public static final Executor v() {
        ReentrantLock reentrantLock = f15096q;
        reentrantLock.lock();
        try {
            if (f15083d == null) {
                f15083d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            fl.g0 g0Var = fl.g0.f38750a;
            reentrantLock.unlock();
            Executor executor = f15083d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String w() {
        return f15103x;
    }

    public static final String x() {
        return "fb.gg";
    }

    public static final String y() {
        String str = f15081b;
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f15097r}, 1));
        kotlin.jvm.internal.s.g(str2, "format(format, *args)");
        e1.l0(str, str2);
        return f15097r;
    }

    public static final String z() {
        com.facebook.a aVarE = com.facebook.a.f14853l.e();
        return e1.F(aVarE != null ? aVarE.j() : null);
    }

    private final void O(Context context, String str) {
        try {
            if (!x7.a.c(this)) {
                try {
                    com.facebook.internal.b bVarE = com.facebook.internal.b.f15130f.e(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String str2 = str + "ping";
                    long j10 = sharedPreferences.getLong(str2, 0L);
                    try {
                        JSONObject jSONObjectA = n7.i.a(n7.i.a.MOBILE_INSTALL_EVENT, bVarE, com.facebook.appevents.o.f14964b.b(context), C(context), context);
                        String strL = com.facebook.appevents.s.f14988c.l();
                        if (strL != null) {
                            jSONObjectA.put("install_referrer", strL);
                        }
                        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                        String str3 = String.format(PAFNPq.nCpN, Arrays.copyOf(new Object[]{str}, 1));
                        kotlin.jvm.internal.s.g(str3, "format(format, *args)");
                        j0 j0VarA = f15104y.a(null, str3, jSONObjectA, null);
                        if (j10 == 0 && j0VarA.k().b() == null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putLong(str2, System.currentTimeMillis());
                            editorEdit.apply();
                            com.facebook.internal.r0.a aVar = com.facebook.internal.r0.f15352e;
                            r0 r0Var = r0.APP_EVENTS;
                            String TAG = f15081b;
                            kotlin.jvm.internal.s.g(TAG, "TAG");
                            aVar.b(r0Var, TAG, "MOBILE_APP_INSTALL has been logged");
                        }
                    } catch (JSONException e10) {
                        throw new FacebookException("An error occurred while publishing install.", e10);
                    }
                } catch (Exception e11) {
                    e1.k0("Facebook-publish", e11);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
