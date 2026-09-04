package com.bytedance.sdk.openadsdk.gjv.hnj;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.hqh;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.tu;
import com.bytedance.sdk.openadsdk.utils.xyo;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj {
    private static volatile hnj dkl;
    private final boolean gjv = qor();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14373hn;
    private long hnj;
    private Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f14374sk;

    private hnj() {
        Context contextHnj = oj.hnj();
        if (contextHnj != null) {
            this.qor = contextHnj.getApplicationContext();
        }
        this.f14374sk = sk();
    }

    private String dkl() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (xyo.dkl()) {
                sb2.append("MIUI-");
            } else if (xyo.qor()) {
                sb2.append("FLYME-");
            } else {
                String strFc = xyo.fc();
                if (xyo.hnj(strFc)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strFc)) {
                    sb2.append(strFc);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    private int gjv() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static hnj hnj() {
        if (dkl == null) {
            synchronized (hnj.class) {
                try {
                    if (dkl == null) {
                        dkl = new hnj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return dkl;
    }

    public List<String> hn(List<com.bytedance.sdk.openadsdk.gjv.hnj> list) {
        JSONArray jSONArrayOptJSONArray = (list.isEmpty() || list.get(0) == null || list.get(0).qor() == null) ? null : list.get(0).qor().optJSONArray("app_log_url_back");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                String strDkl = orp.dkl(jSONArrayOptJSONArray.optString(i10));
                if (!TextUtils.isEmpty(strDkl)) {
                    arrayList.add(strDkl);
                }
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.openadsdk.gjv.hnj> qor(List<com.bytedance.sdk.openadsdk.gjv.hnj> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.gjv.hnj hnjVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectQor = hnjVar.qor();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, jSONObjectQor.optString("label"));
                long jOptLong = jSONObjectQor.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.gjv.dkl.qor.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectQor.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectQor.opt(next));
                    }
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.gjv.dkl(hnjVar.hnj, jSONObject));
            } catch (Exception e10) {
                apu.qor("AdLogParamsGenerate", e10.getMessage());
            }
        }
        return arrayList;
    }

    private String sk() {
        if (DeviceUtils.qor(this.qor)) {
            return "tv";
        }
        return DeviceUtils.hn(this.qor) ? "android_pad" : YSHErhbVu.DRw;
    }

    public String hnj(List<com.bytedance.sdk.openadsdk.gjv.hnj> list) {
        String strOptString;
        if (list.size() > 0 && list.get(0) != null && list.get(0).qor() != null) {
            strOptString = list.get(0).qor().optString("app_log_url");
        } else {
            strOptString = "";
        }
        return orp.sk(strOptString);
    }

    public JSONObject hn() {
        Context contextHnj;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.qor == null && (contextHnj = oj.hnj()) != null) {
                this.qor = contextHnj.getApplicationContext();
            }
            jSONObject.put("ua", orp.gjv());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", orp.aq());
            jSONObject.put("sim_op", hnj(this.qor));
            jSONObject.put("root", this.gjv ? 1 : 0);
            jSONObject.put("timezone", gjv());
            jSONObject.put("access", tu.hnj(this.qor));
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.f14374sk);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", sq.sk(this.qor) + "x" + sq.qor(this.qor));
            jSONObject.put("display_density", hnj(sq.ta(this.qor)));
            jSONObject.put("density_dpi", sq.ta(this.qor));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", orl.hnj(this.qor));
            jSONObject.put("rom", dkl());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.f14373hn);
            jSONObject.put("uid", this.hnj);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
            jSONObject.put("locale_language", DeviceUtils.gjv());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.sk() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.hn() ? 1 : 0);
            dnm dnmVarGjv = oj.gjv();
            Context context = this.qor;
            if (context != null) {
                jSONObject.put("force_language", wu.hnj(context, "tt_choose_language"));
            }
            if (dnmVarGjv.xyo("mnc")) {
                jSONObject.put("mnc", hqh.qor());
            }
            if (dnmVarGjv.xyo("mcc")) {
                jSONObject.put("mcc", hqh.hn());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void hnj(com.bytedance.sdk.openadsdk.gjv.hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        try {
            String strOptString = hnjVar.qor().optJSONObject("params").optString("log_extra", "");
            long jHnj = as.hnj(strOptString);
            int iGjv = as.gjv(strOptString);
            if (jHnj == 0) {
                jHnj = this.hnj;
            }
            this.hnj = jHnj;
            if (iGjv == 0) {
                iGjv = this.f14373hn;
            }
            this.f14373hn = iGjv;
        } catch (Exception e10) {
            apu.qor("AdLogParamsGenerate", "getInfoFromLogExtra exception", e10.getMessage());
        }
    }

    public JSONObject hnj(List<com.bytedance.sdk.openadsdk.gjv.hnj> list, long j10, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            hnj(list.get(0));
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.gjv.hnj> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().gjv());
            }
            jSONObject2.put("event_v3", jSONArray);
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("_gen_time", j10);
            jSONObject2.put("local_time", j10 / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    private boolean qor() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    private String hnj(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String hnj(int i10) {
        if (i10 == 120) {
            return "ldpi";
        }
        if (i10 == 160) {
            return "mdpi";
        }
        if (i10 == 240) {
            return "hdpi";
        }
        if (i10 == 320) {
            return "xhdpi";
        }
        if (i10 == 480) {
            return "xxhdpi";
        }
        if (i10 != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }
}
