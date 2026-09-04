package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.inmobi.media.B5;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class B5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f24503d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I1 f24505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I1 f24506g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f24508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fl.q f24509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f24510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f24511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f24512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile boolean f24513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile long f24514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final fl.k f24515p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final fl.k f24516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final fl.k f24517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final JSONArray f24518s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ zl.k[] f24501b = {kotlin.jvm.internal.l0.g(new kotlin.jvm.internal.c0(B5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), kotlin.jvm.internal.l0.g(new kotlin.jvm.internal.c0(B5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0)), kotlin.jvm.internal.l0.g(new kotlin.jvm.internal.c0(B5.class, "asyncNetworkInfo", "getAsyncNetworkInfo()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B5 f24500a = new B5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f24502c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24504e = B5.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final I1 f24507h = new I1("", new tl.a() { // from class: yh.q
        @Override // tl.a
        public final Object invoke() {
            return B5.a();
        }
    }, true, true);

    static {
        int i10 = 15;
        f24505f = new I1(i10, new tl.a() { // from class: yh.o
            @Override // tl.a
            public final Object invoke() {
                return Integer.valueOf(B5.C());
            }
        }, 12);
        f24506g = new I1(i10, new tl.a() { // from class: yh.p
            @Override // tl.a
            public final Object invoke() {
                return Integer.valueOf(B5.c());
            }
        }, 8);
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.s.g(RELEASE, "RELEASE");
        f24508i = RELEASE;
        int i11 = Build.VERSION.SDK_INT;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        f24509j = new fl.q("d-api-lev", sb2.toString());
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.s.g(MANUFACTURER, "MANUFACTURER");
        f24510k = MANUFACTURER;
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.s.g(MODEL, "MODEL");
        f24511l = MODEL;
        String HARDWARE = Build.HARDWARE;
        kotlin.jvm.internal.s.g(HARDWARE, "HARDWARE");
        f24512m = HARDWARE;
        fl.o oVar = fl.o.PUBLICATION;
        f24515p = fl.l.a(oVar, new tl.a() { // from class: yh.r
            @Override // tl.a
            public final Object invoke() {
                return B5.D();
            }
        });
        f24516q = fl.l.a(oVar, new tl.a() { // from class: yh.s
            @Override // tl.a
            public final Object invoke() {
                return Boolean.valueOf(B5.d());
            }
        });
        fl.k kVarA = fl.l.a(oVar, new tl.a() { // from class: yh.t
            @Override // tl.a
            public final Object invoke() {
                return B5.b();
            }
        });
        f24517r = kVarA;
        f24518s = (JSONArray) kVarA.getValue();
    }

    public static boolean A() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean B() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static final int C() {
        Context context = Xi.f26021a;
        Object systemService = context != null ? context.getSystemService(MimeTypes.BASE_TYPE_AUDIO) : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    public static final C3472z5 D() {
        boolean z10;
        String str;
        f24500a.getClass();
        try {
            Context context = Xi.f26021a;
            if (context == null) {
                return new C3472z5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            try {
                z10 = packageManager.getApplicationEnabledSetting("com.android.vending") >= 2;
            } catch (Exception unused) {
            }
            try {
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
            } catch (Exception unused2) {
                str = null;
            }
            return new C3472z5(str, z10);
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            return new C3472z5(null, false);
        }
    }

    public static void E() {
        Runnable runnable = new Runnable() { // from class: yh.m
            @Override // java.lang.Runnable
            public final void run() {
                B5.F();
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void F() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            f24502c = availableBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        } catch (Exception e10) {
            AbstractC3219p9.a(e10);
        }
    }

    public static void G() {
        Runnable runnable = new Runnable() { // from class: yh.l
            @Override // java.lang.Runnable
            public final void run() {
                B5.H();
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void H() {
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = yh.i.a(systemService);
        Object systemService2 = context.getSystemService("storage");
        kotlin.jvm.internal.s.f(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.s.g(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            try {
                UUID uuidFromString = UUID.fromString(String.valueOf(storageVolume.getUuid()));
                kotlin.jvm.internal.s.e(uuidFromString);
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        freeBytes += storageStatsManagerA.getFreeBytes(uuidFromString);
                    } catch (Exception e10) {
                        M2 m10 = new M2(e10);
                        fl.k kVar = W9.f25935a;
                        W9.a(m10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        f24502c = freeBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public static void I() {
        Runnable runnable = new Runnable() { // from class: yh.n
            @Override // java.lang.Runnable
            public final void run() {
                B5.J();
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void J() {
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = yh.i.a(systemService);
        Object systemService2 = context.getSystemService("storage");
        kotlin.jvm.internal.s.f(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.s.g(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManagerA.getFreeBytes(storageUuid);
                } catch (Exception e10) {
                    M2 m10 = new M2(e10);
                    fl.k kVar = W9.f25935a;
                    W9.a(m10);
                }
            }
        }
        f24502c = freeBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
    }

    public static void K() {
        Runnable runnable = new Runnable() { // from class: yh.v
            @Override // java.lang.Runnable
            public final void run() {
                B5.L();
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void L() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(blockCountLong / 1048576);
            f24503d = sb2.toString();
        } catch (Exception e10) {
            AbstractC3219p9.a(e10);
        }
    }

    public static void M() {
        Runnable runnable = new Runnable() { // from class: yh.k
            @Override // java.lang.Runnable
            public final void run() {
                B5.N();
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void N() {
        UUID uuidFromString;
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = yh.i.a(systemService);
        Object systemService2 = context.getSystemService("storage");
        kotlin.jvm.internal.s.f(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.s.g(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                kotlin.jvm.internal.s.e(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    kotlin.jvm.internal.s.e(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerA.getTotalBytes(uuidFromString);
                } catch (Exception e10) {
                    M2 m10 = new M2(e10);
                    fl.k kVar = W9.f25935a;
                    W9.a(m10);
                }
            }
        }
        long j10 = totalBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        f24503d = sb2.toString();
    }

    public static void O() {
        Runnable runnable = new Runnable() { // from class: yh.u
            @Override // java.lang.Runnable
            public final void run() {
                B5.P();
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void P() {
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManagerA = yh.i.a(systemService);
        Object systemService2 = context.getSystemService("storage");
        kotlin.jvm.internal.s.f(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.s.g(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManagerA.getTotalBytes(storageUuid);
                } catch (Exception e10) {
                    M2 m10 = new M2(e10);
                    fl.k kVar = W9.f25935a;
                    W9.a(m10);
                }
            }
        }
        long j10 = totalBytes / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        f24503d = sb2.toString();
    }

    public static final int c() {
        Context context = Xi.f26021a;
        Object systemService = context != null ? context.getSystemService(MimeTypes.BASE_TYPE_AUDIO) : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean d() {
        f24500a.getClass();
        try {
            String FINGERPRINT = Build.FINGERPRINT;
            kotlin.jvm.internal.s.g(FINGERPRINT, "FINGERPRINT");
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.s.g(ROOT, "ROOT");
            String lowerCase = FINGERPRINT.toLowerCase(ROOT);
            kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
            String MODEL = Build.MODEL;
            kotlin.jvm.internal.s.g(MODEL, "MODEL");
            kotlin.jvm.internal.s.g(ROOT, "ROOT");
            String lowerCase2 = MODEL.toLowerCase(ROOT);
            kotlin.jvm.internal.s.g(lowerCase2, "toLowerCase(...)");
            String MANUFACTURER = Build.MANUFACTURER;
            kotlin.jvm.internal.s.g(MANUFACTURER, "MANUFACTURER");
            kotlin.jvm.internal.s.g(ROOT, "ROOT");
            String lowerCase3 = MANUFACTURER.toLowerCase(ROOT);
            kotlin.jvm.internal.s.g(lowerCase3, "toLowerCase(...)");
            String BRAND = Build.BRAND;
            kotlin.jvm.internal.s.g(BRAND, "BRAND");
            kotlin.jvm.internal.s.g(ROOT, "ROOT");
            String lowerCase4 = BRAND.toLowerCase(ROOT);
            kotlin.jvm.internal.s.g(lowerCase4, "toLowerCase(...)");
            String DEVICE = Build.DEVICE;
            kotlin.jvm.internal.s.g(DEVICE, "DEVICE");
            kotlin.jvm.internal.s.g(ROOT, "ROOT");
            String lowerCase5 = DEVICE.toLowerCase(ROOT);
            kotlin.jvm.internal.s.g(lowerCase5, "toLowerCase(...)");
            String HARDWARE = Build.HARDWARE;
            kotlin.jvm.internal.s.g(HARDWARE, "HARDWARE");
            kotlin.jvm.internal.s.g(ROOT, "ROOT");
            String lowerCase6 = HARDWARE.toLowerCase(ROOT);
            kotlin.jvm.internal.s.g(lowerCase6, "toLowerCase(...)");
            String PRODUCT = Build.PRODUCT;
            kotlin.jvm.internal.s.g(PRODUCT, "PRODUCT");
            kotlin.jvm.internal.s.g(ROOT, "ROOT");
            String lowerCase7 = PRODUCT.toLowerCase(ROOT);
            kotlin.jvm.internal.s.g(lowerCase7, "toLowerCase(...)");
            if (bm.r.N(lowerCase, "generic", false, 2, null) || bm.r.N(lowerCase, "unknown", false, 2, null) || bm.r.T(lowerCase2, "google_sdk", false, 2, null) || bm.r.T(lowerCase2, "emu", false, 2, null) || bm.r.T(lowerCase2, "Android SDK built for x86", false, 2, null) || bm.r.T(lowerCase3, "Genymotion", false, 2, null) || bm.r.T(lowerCase7, "sdk", false, 2, null) || bm.r.T(lowerCase7, "vbox86p", false, 2, null) || bm.r.T(lowerCase7, "emu", false, 2, null) || kotlin.jvm.internal.s.c(lowerCase6, "goldfish") || kotlin.jvm.internal.s.c(lowerCase6, "ranchu") || kotlin.jvm.internal.s.c(lowerCase6, "vbox86p") || bm.r.T(lowerCase6, "nox", false, 2, null)) {
                return true;
            }
            return bm.r.N(lowerCase4, "generic", false, 2, null) && bm.r.N(lowerCase5, "generic", false, 2, null);
        } catch (Exception unused) {
            return false;
        }
    }

    public static String e() {
        Context context = Xi.f26021a;
        if (context == null || !Sf.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g(B5.class.getSimpleName(), "getSimpleName(...)");
            e10.toString();
        }
        if (activeNetworkInfo == null) {
            return "";
        }
        return Build.VERSION.SDK_INT < 28 ? a(activeNetworkInfo) : a(connectivityManager, activeNetworkInfo);
    }

    public static fl.q f() {
        Context context = Xi.f26021a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new fl.q("d-airplane-m", "1") : new fl.q("d-airplane-m", MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    public static final String g() {
        B5 b10 = f24500a;
        b10.getClass();
        String str = (String) f24507h.getValue(b10, f24501b[2]);
        if (bm.r.N(str, MBridgeConstans.ENDCARD_URL_TYPE_PL, false, 2, null)) {
            return "carrier";
        }
        return bm.r.N(str, "1", false, 2, null) ? "wifi" : "NIL";
    }

    public static fl.q h() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            I();
        } else if (i10 >= 26) {
            G();
        } else {
            E();
        }
        long j10 = f24502c;
        if (j10 != -1) {
            return new fl.q("d-av-disk", String.valueOf(j10));
        }
        return null;
    }

    public static fl.q i() {
        Context context = Xi.f26021a;
        Integer numValueOf = null;
        if (context == null) {
            return null;
        }
        Intent intentA = J3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentA != null) {
            numValueOf = Integer.valueOf((int) ((intentA.getIntExtra("level", -1) * 100) / intentA.getIntExtra("scale", -1)));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(numValueOf);
        return new fl.q("d-bat-lev", sb2.toString());
    }

    public static fl.q j() {
        Context context = Xi.f26021a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new fl.q("d-bat-sav", "1") : new fl.q("d-bat-sav", MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    public static fl.q k() {
        String str;
        int i10 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i10 == 16) {
            str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        } else {
            if (i10 != 32) {
                return null;
            }
            str = "1";
        }
        return new fl.q("d-drk-m", str);
    }

    public static fl.q l() {
        Context context = Xi.f26021a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new fl.q("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int n() {
        String strE = e();
        if (bm.r.N(strE, MBridgeConstans.ENDCARD_URL_TYPE_PL, false, 2, null)) {
            return 0;
        }
        return bm.r.N(strE, "1", false, 2, null) ? 1 : 2;
    }

    public static final String o() {
        f24500a.getClass();
        int iN = n();
        if (iN != 0) {
            return iN != 1 ? "NIL" : "wifi";
        }
        return "carrier";
    }

    public static HashMap p() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap map = new HashMap();
        try {
            if (enabled) {
                map.put("d-t1", f24518s.toString());
                return map;
            }
            String TAG = f24504e;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            return map;
        } catch (Exception unused) {
        }
    }

    public static fl.q q() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            O();
        } else if (i10 >= 26) {
            M();
        } else {
            K();
        }
        String str = f24503d;
        if (str != null) {
            return new fl.q("d-tot-disk", str);
        }
        return null;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean u() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return true;
    }

    public static boolean z() {
        return true;
    }

    public final int a(Context context, boolean z10) {
        if (context == null || z10) {
            return 0;
        }
        I1 i10 = f24506g;
        zl.k[] kVarArr = f24501b;
        int iIntValue = ((Number) i10.getValue(this, kVarArr[1])).intValue();
        int iIntValue2 = ((Number) f24505f.getValue(this, kVarArr[0])).intValue();
        if (iIntValue2 > 0) {
            return (iIntValue * 100) / iIntValue2;
        }
        kotlin.jvm.internal.s.g(B5.class.getSimpleName(), "getSimpleName(...)");
        return 0;
    }

    public final HashMap b(boolean z10) {
        int iAvailableProcessors;
        HashMap map = new HashMap();
        map.put("os-v", f24508i);
        map.put("d-brand-name", Build.BRAND);
        map.put("d-manufacturer-name", f24510k);
        map.put("d-model-name", f24511l);
        map.put("d-nettype-raw", e());
        String string = Locale.getDefault().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        map.put("d-localization", string);
        String language = Locale.getDefault().getLanguage();
        kotlin.jvm.internal.s.g(language, "getLanguage(...)");
        map.put("d-language", language);
        map.put("d-devicemachinehw", f24512m);
        if (System.currentTimeMillis() >= f24514o) {
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
            SignalsConfig signalsConfig = (SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class);
            f24514o = (((long) signalsConfig.getLowMemoryFreq()) * 1000) + System.currentTimeMillis();
            em.k.d(H9.f24930c, null, null, new A5(null), 3, null);
        }
        map.put("d-lowmem", String.valueOf(f24513n));
        try {
            iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
            iAvailableProcessors = 0;
        }
        map.put("d-pcount", String.valueOf(iAvailableProcessors));
        map.put("d-emu", String.valueOf(((Boolean) f24516q.getValue()).booleanValue()));
        fl.k kVar2 = f24515p;
        map.put("d-ps-disabled", String.valueOf(((C3472z5) kVar2.getValue()).f27976a));
        String str = ((C3472z5) kVar2.getValue()).f27977b;
        if (str == null) {
            str = "N/A";
        }
        map.put("d-ps-v", str);
        map.put("d-media-volume", String.valueOf(a(Xi.f26021a, z10)));
        return map;
    }

    public static fl.q m() {
        ArrayList arrayList = new ArrayList();
        Context context = Xi.f26021a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("input_method");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        kotlin.jvm.internal.s.g(enabledInputMethodList, "getEnabledInputMethodList(...)");
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            kotlin.jvm.internal.s.g(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (kotlin.jvm.internal.s.c(inputMethodSubtype.getMode(), "keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    kotlin.jvm.internal.s.g(languageTag, "getLanguageTag(...)");
                    String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                    kotlin.jvm.internal.s.e(language);
                    if (language.length() > 0) {
                        arrayList.add(language);
                    }
                }
            }
        }
        return new fl.q(PvZsvNiPV.McraeIG, new JSONArray((Collection) arrayList).toString());
    }

    public static final String a() {
        f24500a.getClass();
        return e();
    }

    public static String a(NetworkInfo networkInfo) {
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type != 0) {
            if (type != 1) {
                return String.valueOf(type);
            }
            return "1";
        }
        return type + "|" + subtype;
    }

    public static String a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "0|" + networkInfo.getSubtype();
        }
        if (networkCapabilities.hasTransport(1)) {
            return "1";
        }
        if (networkCapabilities.hasTransport(2)) {
            return "7";
        }
        if (networkCapabilities.hasTransport(3)) {
            return "9";
        }
        if (networkCapabilities.hasTransport(4)) {
            return "17";
        }
        if (networkCapabilities.hasTransport(5)) {
            return "10";
        }
        return networkCapabilities.hasTransport(6) ? "11" : "8";
    }

    public final HashMap a(boolean z10) {
        HashMap map = new HashMap();
        try {
            map.putAll(b(z10));
            map.putAll(p());
            return map;
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g(B5.class.getSimpleName(), "getSimpleName(...)");
            e10.getMessage();
            return map;
        }
    }

    public static final JSONArray b() {
        f24500a.getClass();
        Context context = Xi.f26021a;
        if (context != null) {
            try {
                C3136m4 c3136m4 = AbstractC2878c4.f26300a;
                kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
                SignalsConfig signalsConfig = (SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "boot_time");
                kotlin.jvm.internal.s.h("bt", "key");
                JSONArray jSONArray = new JSONArray(laA.f25198a.getString("bt", "[]"));
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long lValueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (lValueOf != null) {
                    if (Math.abs(lValueOf.longValue() - jCurrentTimeMillis) <= ((long) signalsConfig.getBts().getThreshold()) * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(jCurrentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                laA.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e10) {
                fl.k kVar = W9.f25935a;
                AbstractC3219p9.a(e10);
            }
        }
        return new JSONArray();
    }
}
