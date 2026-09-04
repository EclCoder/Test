package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.b;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import f8.Ygx.FuoITeVPeXAj;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import r7.pgx.XTkUEXuiK;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class aq {
    private static final AtomicReference<Boolean> hnj = new AtomicReference<>(null);

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final AtomicReference<String> f14630hn = new AtomicReference<>(null);

    private static boolean aq(Context context) {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static PackageInfo dkl(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : dnm(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static PackageInfo dnm(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x004e. Please report as an issue. */
    public static boolean dse(Context context) {
        boolean z10;
        boolean zSk;
        boolean zSk2;
        try {
            AtomicReference<Boolean> atomicReference = hnj;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                return bool.booleanValue();
            }
            String lowerCase = Build.BRAND;
            if (!TextUtils.isEmpty(lowerCase)) {
                lowerCase = lowerCase.toLowerCase();
            }
            String lowerCase2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(lowerCase2)) {
                lowerCase2 = lowerCase2.toLowerCase();
            }
            if (TextUtils.isEmpty(lowerCase) && TextUtils.isEmpty(lowerCase2)) {
                b.a(atomicReference, null, Boolean.FALSE);
                return false;
            }
            boolean zIsEmpty = TextUtils.isEmpty(lowerCase);
            String str = XTkUEXuiK.uBYmPtRecAMZArY;
            if (!zIsEmpty) {
                switch (lowerCase.hashCode()) {
                    case -759499589:
                        if (!lowerCase.equals("xiaomi")) {
                            z10 = true;
                            zSk = false;
                        } else {
                            zSk2 = sk();
                            zSk = zSk2;
                            z10 = false;
                        }
                        break;
                    case 3418016:
                        if (!lowerCase.equals("oppo")) {
                            z10 = true;
                            zSk = false;
                        } else {
                            zSk2 = ojm();
                            zSk = zSk2;
                            z10 = false;
                        }
                        break;
                    case 3620012:
                        if (!lowerCase.equals(str)) {
                            z10 = true;
                            zSk = false;
                        } else {
                            zSk2 = dkl();
                            zSk = zSk2;
                            z10 = false;
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase.equals("samsung")) {
                            z10 = true;
                            zSk = false;
                        } else {
                            zSk2 = gjv();
                            zSk = zSk2;
                            z10 = false;
                        }
                        break;
                    default:
                        z10 = true;
                        zSk = false;
                        break;
                }
            } else {
                z10 = false;
                zSk = false;
            }
            if (z10 && !TextUtils.isEmpty(lowerCase2)) {
                switch (lowerCase2.hashCode()) {
                    case -759499589:
                        if (!lowerCase2.equals("xiaomi")) {
                            zSk = false;
                        } else {
                            zSk = sk();
                        }
                        break;
                    case 3418016:
                        if (!lowerCase2.equals("oppo")) {
                            zSk = false;
                        } else {
                            zSk = ojm();
                        }
                        break;
                    case 3620012:
                        if (!lowerCase2.equals(str)) {
                            zSk = false;
                        } else {
                            zSk = dkl();
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase2.equals("samsung")) {
                            zSk = false;
                        } else {
                            zSk = gjv();
                        }
                        break;
                    default:
                        zSk = false;
                        break;
                }
            }
            b.a(atomicReference, null, Boolean.valueOf(zSk));
            return zSk;
        } catch (Throwable unused) {
            b.a(hnj, null, Boolean.FALSE);
            return false;
        }
    }

    public static int gjv(Context context) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static int hn(Context context) {
        if (aq(context)) {
            return 1;
        }
        if (ojm(context)) {
            return 2;
        }
        return ta(context) ? 3 : 4;
    }

    public static void hnj(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (hn()) {
                com.bytedance.sdk.openadsdk.core.qor qorVarHnj = com.bytedance.sdk.openadsdk.core.qor.hnj();
                qorVarHnj.hnj("w_ver", sk(context));
                qorVarHnj.hnj("bp", hn(context));
                qorVarHnj.hnj("is_fold", dse(context) ? 1 : 0);
                qorVarHnj.hnj("abi", hnj());
                qorVarHnj.hnj("t_ver", qor(context));
                qorVarHnj.hnj(CampaignEx.JSON_KEY_AAB, gjv(context));
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean ojm(Context context) {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static String qor(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String sk(Context context) {
        try {
            AtomicReference<String> atomicReference = f14630hn;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoDkl = dkl(context);
            String str2 = packageInfoDkl != null ? packageInfoDkl.versionName : "";
            b.a(atomicReference, null, str2);
            return str2;
        } catch (Throwable unused) {
            b.a(f14630hn, null, "");
            return "";
        }
    }

    private static boolean ta(Context context) {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean gjv() {
        if (dnm()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 12; i10++) {
                    if (lowerCase.contains(strArr2[i10])) {
                        return true;
                    }
                }
            }
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (TextUtils.isEmpty(lowerCase2)) {
                return false;
            }
            for (int i11 = 0; i11 < 12; i11++) {
                if (lowerCase2.contains(strArr[i11])) {
                    return true;
                }
            }
            if (hn()) {
                String strHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strHnj)) {
                    return false;
                }
                for (String str : strHnj.split(",")) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean aq() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("BED", "isXiaomiFold return false " + th2.getMessage());
            return false;
        }
    }

    public static void hn(JSONObject jSONObject, Context context) {
        try {
            if (hn()) {
                String strHn = com.bytedance.sdk.openadsdk.core.qor.hnj().hn("w_ver", sk(context));
                if (TextUtils.isEmpty(strHn)) {
                    return;
                }
                jSONObject.put("w_ver", strHn);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean ojm() {
        if (ta()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", CIdIVqKnNZ.mXuedRyStZ, "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 9; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (hn()) {
                    String strQor = qor();
                    if (TextUtils.isEmpty(strQor)) {
                        return false;
                    }
                    for (String str : strQor.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String qor() {
        return com.bytedance.sdk.openadsdk.as.sk.hnj("fold_config", "fold_default", "");
    }

    private static boolean ta() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.apu.qor("BED", "get oppo fold properties error, msg: " + e10.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean sk() {
        if (aq()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", vHmGJpUTWNVV.bnFwWeHP, "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 6; i10++) {
                    if (lowerCase.contains(strArr[i10])) {
                        return true;
                    }
                }
                if (hn()) {
                    String strQor = qor();
                    if (TextUtils.isEmpty(strQor)) {
                        return false;
                    }
                    for (String str : strQor.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean dnm() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod("getInstance", null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD")) || "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.apu.qor("PAG_BANNER", "get ss fold device error: " + e10.getMessage());
            return false;
        }
    }

    private static boolean dkl() {
        if (dse()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", mTFeqtajA.ouUv, "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 7; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (hn()) {
                    String strQor = qor();
                    if (TextUtils.isEmpty(strQor)) {
                        return false;
                    }
                    for (String str : strQor.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean hn() {
        return com.bytedance.sdk.openadsdk.as.sk.hnj("fold_config", "enable", 0) == 1;
    }

    public static String hnj() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void hnj(JSONObject jSONObject, Context context) {
        String str = FuoITeVPeXAj.ASkVFcu;
        if (context == null) {
            return;
        }
        try {
            if (hn()) {
                com.bytedance.sdk.openadsdk.core.qor qorVarHnj = com.bytedance.sdk.openadsdk.core.qor.hnj();
                String strHn = qorVarHnj.hn("md", com.bytedance.sdk.openadsdk.core.ta.hn().dse());
                if (!TextUtils.isEmpty(strHn)) {
                    jSONObject.put("md", strHn);
                }
                int iHn = qorVarHnj.hn("bp", hn(context));
                if (iHn != 4) {
                    jSONObject.put("bp", iHn);
                }
                String strHn2 = qorVarHnj.hn("t_ver", qor(context));
                if (!TextUtils.isEmpty(strHn2)) {
                    jSONObject.put("t_ver", strHn2);
                }
                jSONObject.put("is_fold", qorVarHnj.hn("is_fold", dse(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, qorVarHnj.hn(CampaignEx.JSON_KEY_AAB, gjv(context)));
                String strHn3 = qorVarHnj.hn(str, hnj());
                if (TextUtils.isEmpty(strHn3)) {
                    return;
                }
                jSONObject.put(str, strHn3);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean dse() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("BED", "isVIVOFoldDevice return false " + th2.getMessage());
            return false;
        }
    }
}
