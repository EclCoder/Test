package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import c1.pGX.geAgcEazw;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.signals.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class orp {
    private static final byte[] bug;
    private static final HashSet<String> dnm;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private static String f14702fc;
    public static Integer hnj;
    private static String mjg;
    private static final byte[] orl;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final ExecutorService f14703hn = Executors.newSingleThreadExecutor();
    private static volatile boolean qor = false;
    private static final AtomicInteger gjv = new AtomicInteger(0);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static volatile String f14704sk = "";
    private static final ReentrantLock dkl = new ReentrantLock();
    private static String dse = null;
    private static String aq = null;
    private static String ojm = null;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private static final HashSet<String> f14705ta = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.orp$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(orp.f14704sk)) {
                    com.bytedance.sdk.component.ojm.dkl dklVar = new com.bytedance.sdk.component.ojm.dkl(com.bytedance.sdk.openadsdk.core.oj.hnj(), com.bytedance.sdk.component.ojm.dkl.qor.USER_AGENT);
                    dklVar.setWebViewClient(new com.bytedance.sdk.component.ojm.dkl.hnj());
                    String unused = orp.f14704sk = dklVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.vf.hnj(dklVar);
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "", e10);
            } catch (NoClassDefFoundError e11) {
                com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "", e11);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hn {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final int f14706hn;
        public final ComponentName hnj;

        public hn(ComponentName componentName, int i10) {
            this.hnj = componentName;
            this.f14706hn = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hnj implements Callable<String> {
        private final int hnj;

        hnj(int i10) {
            this.hnj = i10;
        }

        private String hn() {
            String property;
            Throwable th2;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("android_system_ua", property);
                            return property;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.bytedance.sdk.component.utils.apu.qor("getUA", "e:" + th2.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th4) {
                property = "unKnow";
                th2 = th4;
            }
        }

        private synchronized String qor() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.orp.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = orp.ul();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", e10.getMessage());
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public synchronized String call() {
            String strHn;
            try {
                strHn = "unKnow";
                int i10 = this.hnj;
                if (i10 == 1) {
                    strHn = qor();
                } else if (i10 == 2) {
                    strHn = hn();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return strHn;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class qor {
        private static final int hnj;

        static {
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i10 = 2;
            try {
                int i11 = RecyclerView.g0.f6724a;
                if (RecyclerView.g0.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i10 = 0;
                }
            } catch (ClassNotFoundException unused) {
                i10 = 1;
            } catch (NoSuchMethodException unused2) {
            }
            hnj = i10;
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i10)));
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        dnm = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        hnj = null;
        bug = new byte[]{108, 111, 97, 100, 105, 110, 103};
        orl = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static String apu() {
        String strSg = com.bytedance.sdk.openadsdk.core.settings.dnm.sg();
        if (!TextUtils.isEmpty(strSg)) {
            return strSg;
        }
        String strFf = com.bytedance.sdk.openadsdk.core.oj.gjv().ff();
        return TextUtils.isEmpty(strFf) ? wu.hnj() : strFf;
    }

    public static synchronized String aq() {
        try {
            if (TextUtils.isEmpty(ojm) && com.bytedance.sdk.openadsdk.core.oj.hnj() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.oj.hnj().getPackageManager().getPackageInfo(dkl(), 0);
                    aq = String.valueOf(packageInfo.versionCode);
                    ojm = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return ojm;
    }

    public static String as() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static long bug() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean dkl(int i10) {
        return i10 == 6;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static int m42do() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (f14705ta.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 == null || !id2.startsWith("Europe/")) {
                return (id2 == null || !id2.startsWith("America/") || dnm.contains(id2)) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", th2.toString());
            return 0;
        }
    }

    public static int dse(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 != 6) {
            return i10;
        }
        return 5;
    }

    public static String eum() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static long fc() {
        try {
            if (!ua()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", th2.getMessage());
            return 0L;
        }
    }

    public static boolean gjv(int i10) {
        return i10 == 4;
    }

    public static boolean hn(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.hn.hnj(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, View view) {
    }

    public static String hqh() {
        String str = f14702fc;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(orl);
        f14702fc = str2;
        return str2;
    }

    public static int jip() {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("is_root", -1);
    }

    public static long mjg() {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("total_sdcard_storage", 0L).longValue();
    }

    public static int nyv() {
        return qor.hnj;
    }

    public static String oj() {
        String strJbd = com.bytedance.sdk.openadsdk.core.oj.gjv().jbd();
        return TextUtils.isEmpty(strJbd) ? wu.hnj() : strJbd;
    }

    public static String ojm() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.oj.hnj().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            if (j10 > 0) {
                return String.valueOf(j10 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long orl() {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("free_internal_storage", 0L).longValue();
    }

    public static String qor(int i10) {
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 == 2) {
            return "interaction";
        }
        if (i10 == 3 || i10 == 4) {
            return "open_ad";
        }
        if (i10 != 7) {
            return i10 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public static boolean sk(int i10) {
        return i10 == 5;
    }

    public static String ta() {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("total_memory", MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    public static String tgn() {
        int i10 = -tu();
        return i10 >= 0 ? "Etc/GMT+".concat(String.valueOf(i10)) : "Etc/GMT".concat(String.valueOf(i10));
    }

    public static int tu() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private static boolean ua() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ul() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.oj.hnj());
            webView.setWebViewClient(new com.bytedance.sdk.component.ojm.dkl.hnj());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString == null || "unKnow".equals(userAgentString)) {
                return userAgentString;
            }
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("webview_ua", userAgentString);
            return userAgentString;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("getUA", "e:" + th2.getMessage());
            return "unKnow";
        }
    }

    public static boolean uua() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String vf() {
        String str = mjg;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(bug);
        mjg = str2;
        return str2;
    }

    public static String wu() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static String xn() {
        String strJle = com.bytedance.sdk.openadsdk.core.oj.gjv().jle();
        if (!TextUtils.isEmpty(strJle)) {
            return strJle;
        }
        String strHnj = wu.hnj();
        if (TextUtils.isEmpty(strHnj)) {
            return strJle;
        }
        return "https://" + strHnj + "/service/2/dual_events/";
    }

    public static boolean xyo() {
        return gjv.get() == 1;
    }

    public static synchronized String dkl() {
        Context contextHnj;
        try {
            if (TextUtils.isEmpty(dse) && (contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj()) != null) {
                try {
                    dse = contextHnj.getPackageName();
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return dse;
    }

    public static String dnm() {
        return qor("MemTotal");
    }

    public static synchronized String dse() {
        try {
            if (TextUtils.isEmpty(aq) && com.bytedance.sdk.openadsdk.core.oj.hnj() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.oj.hnj().getPackageManager().getPackageInfo(dkl(), 0);
                    aq = String.valueOf(packageInfo.versionCode);
                    ojm = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return aq;
    }

    public static boolean gjv(Context context) {
        return false;
    }

    public static Intent hnj(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static String sk() {
        return tgn.hnj();
    }

    public static void ta(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.apu.qor("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.", new Object[0]);
    }

    public static String gjv() {
        if (!TextUtils.isEmpty(f14704sk)) {
            return f14704sk;
        }
        com.bytedance.sdk.openadsdk.xn.hnj.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj());
        String strHnj = com.bytedance.sdk.openadsdk.core.ta.hnj("sdk_local_web_ua", b.TWENTY_FOUR_HOURS_MILLIS);
        f14704sk = strHnj;
        if (TextUtils.isEmpty(strHnj)) {
            ReentrantLock reentrantLock = dkl;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(f14704sk)) {
                            f14704sk = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.oj.hnj());
                        }
                        com.bytedance.sdk.openadsdk.core.ta.hnj("sdk_local_web_ua", f14704sk);
                        reentrantLock.unlock();
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "", e10);
                        dkl.unlock();
                    } catch (NoClassDefFoundError e11) {
                        com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "", e11);
                        dkl.unlock();
                    }
                }
            } catch (Throwable th2) {
                dkl.unlock();
                throw th2;
            }
        }
        return f14704sk;
    }

    public static String sk(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.oj.gjv().xad();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static int ta(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = hnj;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        hnj = Integer.valueOf(size);
        return size;
    }

    private static String bug(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", dse()).toString();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", e10.getMessage());
            return str;
        }
    }

    public static String dkl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static String hn(int i10) {
        if (i10 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i10 == 2) {
            return "banner_ad_landingpage";
        }
        if (i10 == 3) {
            return "interaction_landingpage";
        }
        if (i10 == 4) {
            return geAgcEazw.IDIjxm;
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static boolean ojm(String str) {
        if (com.bytedance.sdk.openadsdk.core.fc.sk()) {
            return true;
        }
        com.bytedance.sdk.component.utils.apu.qor("You must use method '" + str + "' after initialization, please check.", new Object[0]);
        return false;
    }

    public static void qor() {
        com.bytedance.sdk.openadsdk.jip.gjv.hnj("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.utils.orp.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", orp.nyv());
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("recycle_version_not_valid").hn(jSONObject.toString());
            }
        });
    }

    public static hn hnj(Context context, Intent intent) {
        return new hn(null, 0);
    }

    public static String qor(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", th.getMessage());
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static boolean sk(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
        }
    }

    public static boolean hnj() {
        return (com.bytedance.sdk.openadsdk.core.jip.hnj() == null || com.bytedance.sdk.openadsdk.core.jip.hnj().gjv()) ? false : true;
    }

    public static void ojm(Context context) {
        try {
            AtomicInteger atomicInteger = gjv;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.jip.gjv.hnj().qor();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            gjv.set(2);
        }
    }

    public static String aq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static String hnj(int i10) {
        if (i10 == 1) {
            return "embeded_ad";
        }
        if (i10 == 2) {
            return "banner_ad";
        }
        if (i10 == 3) {
            return "interaction";
        }
        if (i10 == 4) {
            return "open_ad";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static int dkl(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", th2.getMessage());
            return -1;
        }
    }

    public static boolean dse(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long dse(Context context) {
        int i10;
        try {
            i10 = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", th2.getMessage());
            i10 = -1;
        }
        return i10;
    }

    public static int hn(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar == null) {
            return -1;
        }
        int iIz = asVar.iz();
        int i10 = 1;
        if (iIz == 1) {
            return 2;
        }
        if (iIz == 3) {
            return 4;
        }
        if (iIz != 5) {
            i10 = 7;
            if (iIz != 7) {
                return iIz != 8 ? -1 : 5;
            }
        }
        return i10;
    }

    public static int aq(Context context) {
        return dse(com.bytedance.sdk.component.utils.tgn.hnj(context, 0L));
    }

    public static String hn() {
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.xn.hnj.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj());
        try {
            String strHn = com.bytedance.sdk.openadsdk.core.qor.hnj().hn("android_system_ua", "unKnow");
            if (strHn != null && !"unKnow".equals(strHn)) {
                return strHn;
            }
            FutureTask futureTask = new FutureTask(new hnj(2));
            f14703hn.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        com.bytedance.sdk.component.utils.apu.qor("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar == null) {
            return null;
        }
        try {
            return qor(asVar.iz());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean aq(int i10) {
        if (i10 <= 0) {
            return false;
        }
        return i10 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i10;
    }

    public static String gjv(String str) {
        return hnj(str, false, false);
    }

    public static int hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static boolean gjv(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        return asVar != null && asVar.rg() == 3 && asVar.hw() && (asVar.qi() == 4 || asVar.qi() == 5);
    }

    public static String hnj(Context context) {
        String strHn = com.bytedance.sdk.openadsdk.core.qor.hnj().hn("total_memory", (String) null);
        if (strHn != null && hn(strHn) > 0) {
            return strHn;
        }
        String strQor = qor("MemTotal");
        if (hn(strQor) <= 0) {
            strQor = ojm();
        }
        com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("total_memory", strQor);
        return strQor;
    }

    public static long hn(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long hn(Context context) {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("total_internal_storage", 0L).longValue();
    }

    public static String qor(Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static String hnj(String str, boolean z10, boolean z11) {
        String strOj;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z11) {
            strOj = apu();
        } else {
            strOj = oj();
        }
        if (TextUtils.isEmpty(strOj)) {
            strOj = "api16-access-ttp.tiktokpangle.us";
        }
        String strHnj = "https://" + strOj + str;
        if (!TextUtils.isEmpty(str) && (str.equals("/api/ad/union/sdk/compliance_status/") || str.equals("/api/ad/union/sdk/register_status/"))) {
            return strHnj;
        }
        if (ul.hnj() && !z10) {
            strHnj = ul.hnj(strHnj);
        }
        return z10 ? bug(strHnj) : strHnj;
    }

    public static boolean qor(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (asVar == null) {
            return true;
        }
        int iHn = com.bytedance.sdk.openadsdk.core.oj.gjv().hn(asVar.atw());
        int iQor = com.bytedance.sdk.component.utils.oj.qor(com.bytedance.sdk.openadsdk.core.oj.hnj());
        if (iHn == 1) {
            return gjv(iQor);
        }
        if (iHn == 2) {
            return sk(iQor) || gjv(iQor) || dkl(iQor);
        }
        if (iHn != 3) {
            return iHn != 5 || gjv(iQor) || dkl(iQor);
        }
        return false;
    }

    public static List<String> hnj(String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        Set<String> setPwt = com.bytedance.sdk.openadsdk.core.oj.gjv().pwt();
        if (setPwt != null && !setPwt.isEmpty()) {
            for (String str2 : setPwt) {
                if (!TextUtils.isEmpty(str2)) {
                    String strBug = "https://" + str2 + str;
                    if (ul.hnj() && !z10) {
                        strBug = ul.hnj(strBug);
                    }
                    if (z10) {
                        strBug = bug(strBug);
                    }
                    arrayList.add(strBug);
                }
            }
        }
        return arrayList;
    }

    public static JSONObject hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, long j10, u6.b bVar) {
        if (asVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, asVar.sp());
            jSONObject.put("buffers_time", j10);
            a aVarPwt = asVar.pwt();
            if (aVarPwt != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, aVarPwt.G());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, aVarPwt.A());
            }
            hnj(jSONObject, bVar);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.hnj("TTAD.ToolUtils", "getVideoAction json error", e10);
            return jSONObject;
        }
    }

    private static void hnj(JSONObject jSONObject, u6.b bVar) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || bVar == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(bVar.gjv()), Integer.valueOf(bVar.sk())));
        } catch (Throwable unused) {
        }
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, String str) {
        if (asVar != null) {
            try {
                String strXe = asVar.xe();
                if (TextUtils.isEmpty(strXe) && asVar.pdc() != null && asVar.pdc().qor() == 1 && !TextUtils.isEmpty(asVar.pdc().hn())) {
                    strXe = asVar.pdc().hn();
                }
                String str2 = strXe;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.orp.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), str2, asVar, hnj(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void hnj(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || !sk(context)) {
            return;
        }
        int length = str2.length();
        int i11 = 1;
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        int i12 = 3572;
        int i13 = 0;
        while (i11 <= i10) {
            if (i12 < length) {
                Log.d(str, i10 + "-" + i11 + ":" + str2.substring(i13, i12));
                i11++;
                i13 = i12;
                i12 += 3572;
            } else {
                Log.d(str, i10 + "-" + i11 + ":" + str2.substring(i13));
                return;
            }
        }
    }

    public static void hnj(StringBuilder sb2, String str, String str2) {
        int iIndexOf;
        if (sb2 == null || TextUtils.isEmpty(str) || (iIndexOf = sb2.indexOf(str)) <= 0) {
            return;
        }
        sb2.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.sk hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, com.bytedance.sdk.component.ojm.dkl dklVar, Context context, String str) {
        int iQi = asVar.qi();
        if (!asVar.hw()) {
            return null;
        }
        if (iQi != 1 && iQi != 3) {
            return null;
        }
        dklVar.hnj(true, (View) new com.bytedance.sdk.openadsdk.common.gjv(context));
        return new com.bytedance.sdk.openadsdk.common.sk(asVar, dklVar, str, false);
    }

    public static void hnj(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairGjv = com.bytedance.sdk.openadsdk.core.ta.gjv("oem_store");
            int i10 = -1;
            if (pairGjv != null && ((iIntValue = Integer.valueOf((String) pairGjv.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairGjv.second).longValue() < com.bytedance.sdk.openadsdk.as.sk.hnj("oem_store_state_time", 259200000))) {
                i10 = iIntValue;
            }
            jSONObject.put("oem_store", i10);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", th2.getMessage());
        }
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, com.bytedance.sdk.component.ojm.dkl dklVar) {
        hnj(asVar, dklVar, false);
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, com.bytedance.sdk.component.ojm.dkl dklVar, boolean z10) {
        com.bytedance.sdk.component.ojm.dkl dklVar2;
        com.bytedance.sdk.openadsdk.core.model.aq aqVarTu;
        List<Integer> list;
        if (asVar == null || dklVar == null) {
            return;
        }
        int iQi = asVar.qi();
        if (!asVar.hw() || (!(iQi == 2 || iQi == 3 || iQi == 5) || (aqVarTu = asVar.tu()) == null)) {
            dklVar2 = dklVar;
        } else {
            List<Integer> listDkl = aqVarTu.dkl();
            ArrayList arrayList = new ArrayList();
            if (z10) {
                for (int i10 = 0; i10 < listDkl.size(); i10++) {
                    arrayList.add(Integer.valueOf(listDkl.get(i10).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listDkl;
            }
            dklVar2 = dklVar;
            dklVar2.hnj(true, aqVarTu.gjv(), aqVarTu.sk(), list, aqVarTu.dse(), aqVarTu.qor());
        }
        int iZod = asVar.zod();
        long jPq = asVar.pq();
        if ((iZod == 1 || iZod == 2) && jPq > 0) {
            dklVar2.hnj(iZod, jPq);
        }
    }

    public static int hnj(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i10);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.ToolUtils", th2.toString());
            return -1;
        }
    }

    public static JSONObject hnj(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
