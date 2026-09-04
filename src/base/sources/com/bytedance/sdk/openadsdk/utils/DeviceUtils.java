package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.coremedia.iso.boxes.UserBox;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSupport;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class DeviceUtils {
    private static int aq = 0;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private static int f14622fc = 0;
    public static String hnj = "";
    private static int jip;
    private static int mjg;
    private static int ojm;
    private static int orl;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile long f14623hn = System.currentTimeMillis();
    private static volatile boolean qor = false;
    private static volatile boolean gjv = false;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static volatile boolean f14625sk = false;
    private static volatile boolean dkl = true;
    private static long dse = 0;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private static String f14626ta = "";
    private static int dnm = 0;
    private static final AtomicBoolean bug = new AtomicBoolean(false);
    private static AtomicBoolean uua = new AtomicBoolean(false);

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private static final Object f14624oj = new Object();

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private static volatile String f14627xn = null;
    private static volatile String apu = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.orl.aq> hnj = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void hn(Context context) {
            if (DeviceUtils.gjv || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.ojm.hnj());
                boolean unused = DeviceUtils.gjv = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.f14622fc = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.orl = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!hnj.isEmpty()) {
                        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<com.bytedance.sdk.openadsdk.orl.aq> it = AudioInfoReceiver.hnj.iterator();
                                while (it.hasNext()) {
                                    it.next().qor(DeviceUtils.orl);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.ojm != 0) {
                        int unused3 = DeviceUtils.mjg = (int) ((((double) DeviceUtils.orl) / ((double) DeviceUtils.ojm)) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void hnj(com.bytedance.sdk.openadsdk.orl.aq aqVar) {
            if (aqVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.orl.aq> copyOnWriteArrayList = hnj;
                if (copyOnWriteArrayList.contains(aqVar)) {
                    return;
                }
                copyOnWriteArrayList.add(aqVar);
            }
        }

        public static void hn(com.bytedance.sdk.openadsdk.orl.aq aqVar) {
            if (aqVar == null) {
                return;
            }
            hnj.remove(aqVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hn extends BroadcastReceiver {
        hn() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.dkl = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.dkl = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.f14623hn = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj extends BroadcastReceiver {
        private hnj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void hn(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i10 >= 33) {
                    context.registerReceiver(new hnj(), intentFilter, 2);
                } else {
                    context.registerReceiver(new hnj(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.eum(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.jip = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    private static void apu(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            ojm = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            orl = streamVolume;
            mjg = (int) ((((double) streamVolume) / ((double) ojm)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    public static int aq(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.DeviceUtils", th2.getMessage());
            return -1;
        }
    }

    private static int as(Context context) {
        try {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase("XIAOMI")) {
                return Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0;
            }
            return (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void bug() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.oj.hnj().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            if (ringerMode == 2) {
                aq = 1;
            } else if (ringerMode == 1) {
                aq = 2;
            } else {
                aq = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static int dkl(Context context) {
        if (!bug.get()) {
            fc(context);
        }
        return dnm;
    }

    public static void dnm() {
        com.bytedance.sdk.openadsdk.core.settings.dnm.hnj(new com.bytedance.sdk.openadsdk.core.settings.ta.hnj() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ta.hnj
            public void hn() {
                com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(true);
                DeviceUtils.uua();
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ta.hnj
            public void hnj() {
                com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(true);
            }
        });
        Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
        if (contextHnj != null) {
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("cpu_count", ta.hnj());
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("cpu_max_frequency", ta.hnj(ta.hnj()));
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("cpu_min_frequency", ta.hn(ta.hnj()));
            String strDnm = orp.dnm();
            if (strDnm != null) {
                com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("total_memory", strDnm);
            }
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("total_internal_storage", orp.bug());
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("free_internal_storage", com.bytedance.sdk.component.utils.uua.hnj());
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("total_sdcard_storage", orp.fc());
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("is_root", orp.uua() ? 1 : 0);
            if (TextUtils.isEmpty(ta())) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    hnj = "unity";
                } catch (ClassNotFoundException unused) {
                    hnj = "native";
                }
                com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("framework_name", hnj);
            }
            bug();
            apu(contextHnj);
            jip = wu(contextHnj);
            aq.hnj(contextHnj);
            uua();
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static void m41do(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                DeviceUtils.eum(applicationContext);
            }
        });
    }

    public static JSONObject dse(Context context) {
        return hnj(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void eum(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.jip = DeviceUtils.wu(applicationContext);
            }
        });
    }

    private static float oj(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int ojm(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String sk(Context context) {
        if (!bug.get()) {
            fc(context);
        }
        return f14626ta;
    }

    public static int ta(Context context) {
        return aq;
    }

    private static int uua(Context context) {
        return f14622fc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int wu(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return as(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int xn(Context context) {
        return jip;
    }

    public static int dse() {
        return orl;
    }

    private static void fc(Context context) {
        if (context == null || !bug.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.as.sk.hnj("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                f14626ta = packageInfo.versionName;
                dnm = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static int gjv(Context context) {
        if (qor(context)) {
            return 3;
        }
        return hn(context) ? 2 : 1;
    }

    private static int jip(Context context) {
        try {
            int i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i10 == 32) {
                return 1;
            }
            return i10 == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    private static String oj() {
        try {
            return apu == null ? com.bytedance.sdk.openadsdk.core.qor.hnj().hn("bt_id", "") : apu;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int ojm() {
        return ojm;
    }

    public static boolean qor(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
        }
    }

    public static String ta() {
        if (TextUtils.isEmpty(hnj)) {
            hnj = com.bytedance.sdk.openadsdk.core.qor.hnj().hn("framework_name", "");
        }
        return hnj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uua() {
        if (com.bytedance.sdk.openadsdk.core.oj.gjv().xyo("bt_id")) {
            try {
                if (apu == null) {
                    synchronized (f14624oj) {
                        try {
                            if (apu == null) {
                                apu = hnj(PglSupport.getBootid(), com.bytedance.sdk.openadsdk.core.qor.hnj().hn("bt_id", ""), "bt_id");
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused) {
                apu = "";
            }
        }
    }

    private static String xn() {
        try {
            if (f14627xn == null) {
                synchronized (f14624oj) {
                    try {
                        if (f14627xn == null) {
                            f14627xn = hnj(String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), com.bytedance.sdk.openadsdk.core.qor.hnj().hn("bt_time", ""), "bt_time");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable unused) {
            f14627xn = "";
        }
        return f14627xn;
    }

    public static int aq() {
        return mjg;
    }

    public static boolean hn() {
        if (SystemClock.elapsedRealtime() - dse >= 20000) {
            dse = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.oj.hnj().getSystemService("power");
                if (powerManager != null) {
                    dkl = powerManager.isInteractive();
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("TTAD.DeviceUtils", th2.getMessage());
            }
        }
        return dkl;
    }

    private static void qor(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(jSONObject);
    }

    public static int dkl() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.oj.hnj().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static String gjv() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void hnj(Context context) {
        if (qor) {
            return;
        }
        try {
            hn hnVar = new hn();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(hnVar, intentFilter);
            qor = true;
        } catch (Throwable unused) {
        }
    }

    public static float sk() {
        int i10 = -1;
        try {
            Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
            if (contextHnj != null) {
                i10 = Settings.System.getInt(contextHnj.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.DeviceUtils", th2.getMessage());
        }
        if (i10 < 0) {
            return -1.0f;
        }
        return Math.round((i10 / 255.0f) * 10.0f) / 10.0f;
    }

    public static int qor() {
        return com.bytedance.sdk.openadsdk.core.qor.hnj().hn("limit_ad_track", -1);
    }

    public static void bug(Context context) {
        Context applicationContext;
        if (f14625sk || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                hnj.hn(applicationContext);
            } else {
                m41do(applicationContext);
            }
            f14625sk = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean hn(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
        }
    }

    private static void hn(JSONObject jSONObject) throws JSONException {
        qor(jSONObject);
    }

    public static long hnj() {
        return f14623hn;
    }

    public static JSONObject hnj(Context context, boolean z10) {
        String strTa;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", aq(context));
            hn(jSONObject);
            jSONObject.put("type", gjv(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", orp.aq(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.gjv.qor());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.gjv.hn());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.gjv.gjv());
            jSONObject.put("screen_scale", sq.dkl(context));
            jSONObject.put("density", sq.aq(context));
            jSONObject.put("screen_width", sq.qor(context));
            jSONObject.put("screen_height", sq.sk(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.dnm.qor.dkl());
            com.bytedance.sdk.openadsdk.core.settings.dnm dnmVarGjv = com.bytedance.sdk.openadsdk.core.oj.gjv();
            if (dnmVarGjv.xyo("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put(UserBox.TYPE, com.bytedance.sdk.openadsdk.core.orl.qor(context));
            jSONObject.put("rom_version", xyo.hnj());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.orl.hn(context));
            jSONObject.put("timezone", orp.tgn());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.orl.hn());
            jSONObject.put("carrier_name", hqh.hnj());
            if (z10) {
                strTa = orp.hnj(context);
                jSONObject.put("board", Build.BOARD);
                jSONObject.put("device_city", orp.as());
                hnj(jSONObject);
            } else {
                strTa = orp.ta();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strTa) * 1024));
            jSONObject.put("locale_language", gjv());
            jSONObject.put("screen_bright", Math.ceil(sk() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !hn() ? 1 : 0);
            jSONObject.put("cpu_num", ta.hn());
            jSONObject.put("cpu_max_freq", ta.qor());
            jSONObject.put("cpu_min_freq", ta.gjv());
            dse.hnj hnjVarHnj = dse.hnj();
            jSONObject.put("battery_remaining_pct", (int) hnjVarHnj.f14634hn);
            jSONObject.put("is_charging", hnjVarHnj.hnj);
            jSONObject.put("total_space", String.valueOf(orp.hn(context)));
            jSONObject.put("free_space_in", String.valueOf(orp.orl()));
            jSONObject.put("sdcard_size", String.valueOf(orp.mjg()));
            jSONObject.put("rooted", orp.jip());
            jSONObject.put("enable_assisted_clicking", dkl());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.wu.hnj(context, "tt_choose_language"));
            jSONObject.put("airplane", ojm(context));
            jSONObject.put("darkmode", jip(context));
            jSONObject.put("headset", uua(context));
            jSONObject.put("ringmute", ta(context));
            jSONObject.put("screenscale", oj(context));
            jSONObject.put("volume", aq());
            jSONObject.put("low_power_mode", xn(context));
            jSONObject.put("enable_draw_feed", orp.nyv());
            if (z10) {
                aq.hnj(jSONObject, context);
                jSONObject.put("gp_v_name", sk(context));
                jSONObject.put("gp_v_code", dkl(context));
            }
            if (dnmVarGjv.xyo("mnc")) {
                jSONObject.put("mnc", hqh.qor());
            }
            if (dnmVarGjv.xyo("mcc")) {
                jSONObject.put("mcc", hqh.hn());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.hnj.hnj.hn(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.hnj.hnj.hnj());
            String strQor = com.bytedance.sdk.openadsdk.core.dnm.qor.qor();
            com.bytedance.sdk.openadsdk.core.dnm.qor.gjv();
            if (!TextUtils.isEmpty(strQor)) {
                jSONObject.put("sof_chara", strQor);
            }
            String strHn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strHn.isEmpty()) {
                jSONObject.put("ipv6", strHn);
            }
            jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.eum.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void dnm(Context context) {
        AudioInfoReceiver.hn(context);
    }

    public static void hnj(JSONObject jSONObject) {
        try {
            com.bytedance.sdk.openadsdk.core.settings.dnm dnmVarGjv = com.bytedance.sdk.openadsdk.core.oj.gjv();
            if (dnmVarGjv.xyo("boot")) {
                jSONObject.put("bt_time", xn());
            } else {
                jSONObject.put("bt_time", "not_allowed");
                com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("bt_time");
            }
            if (dnmVarGjv.xyo("bt_id")) {
                jSONObject.put("bt_id", oj());
            } else {
                jSONObject.put("bt_id", "not_allowed");
                com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("bt_id");
            }
        } catch (Throwable unused) {
        }
    }

    private static String hnj(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str2.split(",");
            int iXyo = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().xyo();
            if (iXyo != 1) {
                if (str.equals(strArrSplit[0]) || ("bt_time".equals(str3) && Math.abs(Long.parseLong(str) - Long.parseLong(strArrSplit[0])) < 1000)) {
                    return str2;
                }
                if (strArrSplit.length < iXyo) {
                    str = str + "," + str2;
                } else {
                    int iLastIndexOf = str2.lastIndexOf(",");
                    if (iLastIndexOf != -1) {
                        str = str + "," + str2.substring(0, iLastIndexOf);
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.core.qor.hnj().hnj(str3, str);
        return str;
    }
}
