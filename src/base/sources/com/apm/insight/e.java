package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f10632a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f10633b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f10634c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f10635d = "default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f10636e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static com.apm.insight.nativecrash.b f10637f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f10640i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f10645n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConfigManager f10638g = new ConfigManager();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f10639h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static g f10641j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile String f10642k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f10643l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile int f10644m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f10646o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f10647p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f10648q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f10649r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f10650s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f10651t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f10652u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f10637f == null) {
            f10637f = g.a(f10632a);
        }
        return f10637f;
    }

    public static a b() {
        return f10639h;
    }

    public static g c() {
        if (f10641j == null) {
            synchronized (e.class) {
                f10641j = new g();
            }
        }
        return f10641j;
    }

    public static void d(boolean z10) {
        f10650s = z10;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f10642k == null) {
            synchronized (f10643l) {
                try {
                    if (f10642k == null) {
                        f10642k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f10642k;
    }

    public static Context g() {
        return f10632a;
    }

    public static Application h() {
        return f10633b;
    }

    public static ConfigManager i() {
        return f10638g;
    }

    public static long j() {
        return f10634c;
    }

    public static String k() {
        return f10635d;
    }

    public static void l() {
        f10646o = 1;
    }

    public static int m() {
        return f10646o;
    }

    public static boolean n() {
        return f10636e;
    }

    static void o() {
        f10636e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f10640i;
    }

    public static int q() {
        return f10644m;
    }

    public static String r() {
        return f10645n;
    }

    public static boolean s() {
        return f10647p;
    }

    public static boolean t() {
        return f10648q;
    }

    public static boolean u() {
        return f10649r;
    }

    public static boolean v() {
        return f10650s;
    }

    public static boolean w() {
        return f10652u;
    }

    public static boolean x() {
        return f10651t;
    }

    static void b(int i10, String str) {
        f10644m = i10;
        f10645n = str;
    }

    public static boolean d() {
        if (!f10638g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z10) {
        f10652u = z10;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f10637f = bVar;
    }

    public static void b(boolean z10) {
        f10648q = z10;
    }

    public static void a(Application application) {
        if (application != null) {
            f10633b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f10633b == null) {
            f10634c = System.currentTimeMillis();
            f10632a = context;
            f10633b = application;
            f10642k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void c(boolean z10) {
        f10649r = z10;
    }

    public static void f(boolean z10) {
        f10651t = z10;
    }

    static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f10637f = new com.apm.insight.nativecrash.b(f10632a, iCommonParams, a());
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(f10634c);
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    static void a(String str) {
        f10635d = str;
    }

    static void a(int i10, String str) {
        if (f10640i == null) {
            synchronized (e.class) {
                try {
                    if (f10640i == null) {
                        f10640i = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        f10640i.put(Integer.valueOf(i10), str);
    }

    public static void a(boolean z10) {
        f10647p = z10;
    }
}
