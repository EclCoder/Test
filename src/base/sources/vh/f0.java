package vh;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f55584a = {"huawei"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f55585b = {"vivo"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f55586c = {"xiaomi"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f55587d = {"oppo"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f55588e = {"leeco", "letv"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f55589f = {"360", "qiku"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f55590g = {"zte"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f55591h = {"oneplus"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f55592i = {"nubia"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f55593j = {"samsung"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f55594k = {"honor"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f55595l = {"ro.build.version.opporom", "ro.build.version.oplusrom.display"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f55596m = {"msc.config.magic.version", "ro.build.version.magic"};

    private static String a() {
        return Build.BRAND.toLowerCase();
    }

    private static String b() {
        return Build.MANUFACTURER.toLowerCase();
    }

    private static String c(String str) {
        return !TextUtils.isEmpty(str) ? e(str) : "";
    }

    static String d() {
        String strA = a();
        String strB = b();
        if (q(strA, strB, f55584a)) {
            String strC = c("ro.build.version.emui");
            String[] strArrSplit = strC.split("_");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
            return strC.contains("EmotionUI") ? strC.replaceFirst("EmotionUI\\s*", "") : strC;
        }
        if (q(strA, strB, f55585b)) {
            return c("ro.vivo.os.build.display.id");
        }
        if (q(strA, strB, f55586c)) {
            return c("ro.build.version.incremental");
        }
        int i10 = 0;
        if (q(strA, strB, f55587d)) {
            String[] strArr = f55595l;
            int length = strArr.length;
            while (i10 < length) {
                String str = strArr[i10];
                String strC2 = c(str);
                if (!TextUtils.isEmpty(str)) {
                    return strC2;
                }
                i10++;
            }
            return "";
        }
        if (q(strA, strB, f55588e)) {
            return c("ro.letv.release.version");
        }
        if (q(strA, strB, f55589f)) {
            return c("ro.build.uiversion");
        }
        if (q(strA, strB, f55590g)) {
            return c("ro.build.MiFavor_version");
        }
        if (q(strA, strB, f55591h)) {
            return c("ro.rom.version");
        }
        if (q(strA, strB, f55592i)) {
            return c("ro.build.rom.id");
        }
        if (!q(strA, strB, f55594k)) {
            return c("");
        }
        String[] strArr2 = f55596m;
        int length2 = strArr2.length;
        while (i10 < length2) {
            String str2 = strArr2[i10];
            String strC3 = c(str2);
            if (!TextUtils.isEmpty(str2)) {
                return strC3;
            }
            i10++;
        }
        return "";
    }

    private static String e(String str) throws Throwable {
        String strG = g(str);
        if (!TextUtils.isEmpty(strG)) {
            return strG;
        }
        String strH = h(str);
        return (TextUtils.isEmpty(strH) && Build.VERSION.SDK_INT < 28) ? f(str) : strH;
    }

    private static String f(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return "";
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
            return "";
        } catch (NoSuchMethodException e12) {
            e12.printStackTrace();
            return "";
        } catch (InvocationTargetException e13) {
            e13.printStackTrace();
            return "";
        }
    }

    private static String g(String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), UserVerificationMethods.USER_VERIFY_ALL);
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            bufferedReader2.close();
                            return "";
                        }
                        try {
                            bufferedReader2.close();
                            return line;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            return line;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        if (bufferedReader == null) {
                            return "";
                        }
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
            return "";
        }
    }

    private static String h(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            return "";
        } catch (IOException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    static boolean i() {
        for (String str : f55595l) {
            if (!TextUtils.isEmpty(c(str))) {
                return true;
            }
        }
        return false;
    }

    static boolean k() {
        if (!c.c()) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "Harmony".equalsIgnoreCase(String.valueOf(cls.getMethod("getOsBrand", null).invoke(cls, null)));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    static boolean l() {
        return q(a(), b(), f55594k);
    }

    static boolean m() {
        return !TextUtils.isEmpty(c("ro.miui.ui.version.name"));
    }

    static boolean n() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return Boolean.parseBoolean(String.valueOf(cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, "persist.sys.miui_optimization", Boolean.valueOf(!"1".equals(String.valueOf(cls.getMethod("get", String.class, String.class).invoke(cls, "ro.miui.cts", "")))))));
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return true;
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
            return true;
        } catch (NoSuchMethodException e12) {
            e12.printStackTrace();
            return true;
        } catch (InvocationTargetException e13) {
            e13.printStackTrace();
            return true;
        }
    }

    static boolean o() {
        return q(a(), b(), f55593j);
    }

    static boolean p() {
        return !TextUtils.isEmpty(c("ro.vivo.os.build.display.id"));
    }

    private static boolean q(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    static boolean j() {
        return !TextUtils.isEmpty(c(CIdIVqKnNZ.LZGlpacGGgeL));
    }
}
