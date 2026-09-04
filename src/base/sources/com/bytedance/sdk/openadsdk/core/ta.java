package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ta {
    private static boolean dnm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final Set<String> f14204hn = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ta.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static mjg hnj;
    private String aq;
    private String bug;
    private String dkl;
    private int dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.mjg.qor.qor f14205fc;
    private String gjv;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.gjv.dse.hnj> jip;
    private String mjg;
    private int ojm;
    private boolean orl;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f14206sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f14207ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class hnj {
        private static final ta hnj = new ta();
    }

    public static boolean apu() {
        return dnm;
    }

    public static int dkl() {
        try {
            String strHnj = hnj("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strHnj)) {
                return 0;
            }
            return Integer.valueOf(strHnj).intValue();
        } catch (Throwable th2) {
            th2.getMessage();
            return 0;
        }
    }

    public static void eum() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            dnm = true;
        }
    }

    public static ta hn() {
        return hnj.hnj;
    }

    public static int sk() {
        try {
            String strHnj = hnj("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strHnj)) {
                return 0;
            }
            return Integer.valueOf(strHnj).intValue();
        } catch (Throwable th2) {
            th2.getMessage();
            return 0;
        }
    }

    public String aq() {
        if (TextUtils.isEmpty(this.dkl)) {
            this.dkl = hnj(oj.hnj());
        }
        return this.dkl;
    }

    public String bug() {
        return this.aq;
    }

    public boolean dnm() {
        int i10 = this.f14207ta;
        return i10 < -1 || i10 > 1;
    }

    public String dse() {
        String str = this.f14206sk;
        if (str != null) {
            return str;
        }
        String strHnj = hnj("mediation_info", Long.MAX_VALUE);
        this.f14206sk = strHnj;
        if (strHnj == null) {
            this.f14206sk = "";
        }
        return this.f14206sk;
    }

    public boolean fc() {
        return f14204hn.contains(this.gjv);
    }

    public String gjv() {
        if (TextUtils.isEmpty(this.gjv)) {
            String strHnj = hnj(MBridgeConstans.APP_ID, Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strHnj)) {
                this.gjv = strHnj;
            }
        }
        return this.gjv;
    }

    public boolean jip() {
        return "5001121".contains(this.gjv);
    }

    public boolean mjg() {
        return true;
    }

    public String oj() {
        if (!TextUtils.isEmpty(this.mjg)) {
            return this.mjg;
        }
        String strHnj = com.bytedance.sdk.openadsdk.utils.bug.hnj();
        this.mjg = strHnj;
        if (!TextUtils.isEmpty(strHnj)) {
            return this.mjg;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.bug.hnj(strValueOf);
        this.mjg = strValueOf;
        return strValueOf;
    }

    public int ojm() {
        return this.dse;
    }

    public com.bytedance.sdk.openadsdk.core.mjg.qor.qor orl() {
        if (this.f14205fc == null) {
            this.f14205fc = new com.bytedance.sdk.openadsdk.core.mjg.qor.qor(10, 8);
        }
        return this.f14205fc;
    }

    public boolean qor() {
        return com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_global_file", "sdk_activate_init", true);
    }

    public int ta() {
        return this.f14207ta;
    }

    public boolean uua() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.orp.dkl());
    }

    public String wu() {
        return this.bug;
    }

    public void xn() {
        try {
            if (this.jip == null || this.jip.size() != 0) {
                return;
            }
            this.jip = null;
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private ta() {
        this.qor = false;
        this.ojm = 0;
        this.f14207ta = -1;
        this.jip = null;
    }

    private static JSONObject bug(String str) {
        String strHn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("sp_global_file", str, (String) null);
        if (TextUtils.isEmpty(strHn)) {
            return null;
        }
        try {
            return new JSONObject(strHn);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    private static void dnm(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        mjg mjgVar = hnj;
        if (mjgVar != null) {
            mjgVar.hnj(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.apu.qor("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public static void hnj(mjg mjgVar) {
        hnj = mjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojm(String str) {
        if (TextUtils.isEmpty(this.aq)) {
            this.aq = str;
            return;
        }
        try {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray(this.aq);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        map.put(strOptString, jSONObjectOptJSONObject);
                    }
                }
            }
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                    String strOptString3 = jSONObjectOptJSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                        map.put(strOptString2, jSONObjectOptJSONObject2);
                    }
                }
            }
            Collection collectionValues = map.values();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                jSONArray3.put((JSONObject) it.next());
            }
            this.aq = jSONArray3.toString();
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private static void ta(String str) {
        mjg mjgVar;
        if (TextUtils.isEmpty(str) && (mjgVar = hnj) != null) {
            mjgVar.hnj(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.apu.qor("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public void hn(boolean z10) {
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_global_file", "sdk_activate_init", Boolean.valueOf(z10));
    }

    public void qor(int i10) {
        this.dse = i10;
    }

    public static void hn(int i10) {
        if (i10 >= 0) {
            hnj("config_fail_times", String.valueOf(i10));
        }
    }

    public boolean hnj() {
        return this.orl;
    }

    public void qor(final String str) {
        dnm(str);
        if (com.bytedance.sdk.openadsdk.utils.ua.dkl()) {
            fc.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ta.2
                @Override // java.lang.Runnable
                public void run() {
                    ta.this.ojm(str);
                }
            });
        } else {
            ojm(str);
        }
    }

    public void aq(String str) {
        this.bug = str;
    }

    public void hn(String str) {
        this.f14206sk = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hnj("mediation_info", str);
    }

    public void hnj(boolean z10) {
        this.orl = z10;
    }

    public static boolean dse(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public static void hnj(int i10) {
        if (i10 >= 0) {
            hnj("domain_index", String.valueOf(i10));
        }
    }

    public void dkl(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.jip == null) {
                return;
            }
            this.jip.remove(str);
        } catch (Throwable unused) {
        }
    }

    public void sk(int i10) {
        this.ojm = i10;
    }

    public void gjv(int i10) {
        this.f14207ta = i10;
    }

    public void hnj(String str) {
        ta(str);
        this.gjv = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hnj(MBridgeConstans.APP_ID, str);
    }

    public com.bytedance.sdk.openadsdk.core.gjv.dse.hnj sk(String str) {
        try {
            if (this.jip == null || str == null) {
                return null;
            }
            return this.jip.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Pair<String, Long> gjv(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectBug = bug(str);
            if (jSONObjectBug == null) {
                return null;
            }
            return new Pair<>(jSONObjectBug.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE), Long.valueOf(jSONObjectBug.getLong("time")));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public void qor(boolean z10) {
        this.qor = z10;
    }

    private String hnj(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return PvZsvNiPV.pudrPBsfyXaVNa;
        }
    }

    public static void hnj(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    public static String hnj(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectBug = bug(str);
            if (jSONObjectBug == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectBug.getLong("time") <= j10) {
                return jSONObjectBug.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor("TTAD.GlobalInfo", e10.getMessage());
        }
        return null;
    }

    public void hnj(String str, com.bytedance.sdk.openadsdk.core.gjv.dse.hnj hnjVar) {
        try {
            if (TextUtils.isEmpty(str) || hnjVar == null) {
                return;
            }
            if (this.jip == null) {
                synchronized (ta.class) {
                    try {
                        if (this.jip == null) {
                            this.jip = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (this.jip != null) {
                this.jip.put(str, hnjVar);
            }
        } catch (Throwable unused) {
        }
    }
}
