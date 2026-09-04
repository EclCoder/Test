package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class xyo {
    private static int dkl = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static boolean f14723hn;
    public static boolean hnj;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static String f14724sk;
    private static final CharSequence qor = "amigo";
    private static final CharSequence gjv = "funtouch";
    private static final ConcurrentHashMap<String, String> dse = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hnj implements Callable<String> {
        private final String hnj;

        public hnj(String str) {
            this.hnj = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public String call() {
            String str = (String) xyo.dse.get(this.hnj);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strQor = xyo.qor(this.hnj);
            System.currentTimeMillis();
            if (strQor != null) {
                xyo.dse.put(this.hnj, strQor);
            }
            return strQor;
        }
    }

    public static boolean aq() {
        String strGjv = gjv("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strGjv) && strGjv.toLowerCase().contains(gjv);
    }

    private static String as() {
        if (jip()) {
            return uua();
        }
        if (dkl()) {
            return orl();
        }
        if (qor()) {
            return oj();
        }
        if (xn()) {
            return apu();
        }
        String strMjg = mjg();
        if (!TextUtils.isEmpty(strMjg)) {
            return strMjg;
        }
        if (aq()) {
            return dse();
        }
        if (ojm()) {
            return ta();
        }
        if (sk()) {
            return gjv();
        }
        String strDnm = dnm();
        return !TextUtils.isEmpty(strDnm) ? strDnm : Build.DISPLAY;
    }

    public static boolean bug() {
        return !TextUtils.isEmpty(gjv("ro.letv.release.version"));
    }

    public static boolean dkl() {
        if (!f14723hn) {
            try {
                Class.forName("miui.os.Build");
                hnj = true;
                f14723hn = true;
                return true;
            } catch (Exception unused) {
                f14723hn = true;
            }
        }
        return hnj;
    }

    public static String dnm() {
        if (!bug()) {
            return "";
        }
        return "eui_" + gjv("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static String dse() {
        return gjv("ro.vivo.os.build.display.id") + "_" + gjv("ro.vivo.product.version");
    }

    public static boolean eum() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2) || !str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String fc() {
        return gjv("ro.build.version.emui");
    }

    public static String gjv() {
        return gjv("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static String hnj() {
        if (!TextUtils.isEmpty(f14724sk)) {
            return f14724sk;
        }
        String strHnj = com.bytedance.sdk.openadsdk.core.ta.hnj("sdk_local_rom_info", 604800000L);
        f14724sk = strHnj;
        if (TextUtils.isEmpty(strHnj)) {
            String strAs = as();
            f14724sk = strAs;
            com.bytedance.sdk.openadsdk.core.ta.hnj("sdk_local_rom_info", strAs);
        }
        return f14724sk;
    }

    public static boolean jip() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String mjg() {
        String strFc = fc();
        if (strFc == null || !strFc.toLowerCase().contains("emotionui")) {
            return "";
        }
        return strFc + "_" + Build.DISPLAY;
    }

    public static String oj() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean ojm() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(qor);
    }

    public static String orl() {
        if (!dkl()) {
            return "";
        }
        return "miui_" + gjv("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static boolean qor() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static boolean sk() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String ta() {
        return Build.DISPLAY + "_" + gjv("ro.gn.sv.version");
    }

    public static String uua() {
        if (jip()) {
            try {
                return "smartisan_".concat(String.valueOf(gjv("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static boolean xn() {
        if (dkl == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strAq = orp.aq("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strAq)) {
                dkl = 0;
            } else {
                dkl = 1;
            }
        }
        return dkl == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String gjv(String str) {
        String str2;
        String str3 = dse.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            if (TextUtils.isEmpty("")) {
                final com.bytedance.sdk.component.aq.hn.hn hnVar = new com.bytedance.sdk.component.aq.hn.hn(new hnj(str), 5, 2);
                ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.xyo.1
                    @Override // java.lang.Runnable
                    public void run() {
                        hnVar.run();
                    }
                });
                str2 = (String) hnVar.get(1L, TimeUnit.SECONDS);
            } else {
                str2 = "";
            }
        } catch (Throwable unused) {
        }
        return str2 == null ? "" : str2;
    }

    public static boolean hn() {
        try {
            String strHnj = hnj();
            if (TextUtils.isEmpty(strHnj) || !strHnj.startsWith("miui")) {
                return false;
            }
            String str = Build.VERSION.INCREMENTAL;
            return !TextUtils.isEmpty(str) && str.toLowerCase().startsWith("v12");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String qor(String str) {
        BufferedReader bufferedReader;
        Throwable th2;
        String line = "";
        Process process = null;
        try {
            try {
                try {
                    Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), UserVerificationMethods.USER_VERIFY_ALL);
                        try {
                            line = bufferedReader.readLine();
                            processExec.exitValue();
                        } catch (IllegalThreadStateException unused) {
                            process = processExec;
                            try {
                                process.destroy();
                            } catch (Throwable unused2) {
                            }
                            if (bufferedReader != null) {
                            }
                            return line;
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                com.bytedance.sdk.component.utils.apu.hnj("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th2);
                                return line;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e10) {
                                        com.bytedance.sdk.component.utils.apu.hnj("ToolUtils", "Exception while closing InputStream", e10);
                                    }
                                }
                            }
                        }
                    } catch (IllegalThreadStateException unused3) {
                        bufferedReader = null;
                    }
                } catch (Throwable th4) {
                    bufferedReader = null;
                    th2 = th4;
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            bufferedReader.close();
        } catch (IOException e11) {
            com.bytedance.sdk.component.utils.apu.hnj("ToolUtils", "Exception while closing InputStream", e11);
        }
        return line;
    }

    public static String apu() {
        if (!xn()) {
            return HqKnbV.cETTraeMzIaht;
        }
        return "coloros_" + gjv(orp.aq("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    public static boolean hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            str = fc();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || eum();
    }
}
