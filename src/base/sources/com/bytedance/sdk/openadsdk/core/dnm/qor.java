package com.bytedance.sdk.openadsdk.core.dnm;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.sk;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class qor {
    private static boolean hnj;

    public static String dkl() {
        if (oj.gjv().ka()) {
            return hn.hn().gjv();
        }
        return null;
    }

    public static long gjv() {
        if (oj.gjv().ka()) {
            return hn.hn().dkl();
        }
        return 0L;
    }

    public static void hn(String str) {
        if (TextUtils.isEmpty(str) || !oj.gjv().ka()) {
            return;
        }
        hn.hn().hn(str);
    }

    public static void hnj() {
        if (!hnj && oj.gjv().ka()) {
            hn.hn();
            hnj = hn.hn().qor();
        }
    }

    public static String qor() {
        return oj.gjv().ka() ? hn.hn().sk() : "";
    }

    public static int sk() {
        if (oj.gjv().ka()) {
            return hn.hn().dse();
        }
        return 6;
    }

    public static void hn() {
        if (oj.gjv().ka()) {
            hn.hn().hnj();
        }
    }

    public static void hnj(String str) {
        if (oj.gjv().ka()) {
            hn.hn().hnj(str);
        }
    }

    public static void hnj(Map<String, Object> map) {
        if (oj.gjv().ka()) {
            hn.hn().hnj(map);
        }
    }

    public static void hnj(as asVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (oj.gjv().ka()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (asVar != null) {
                String strJp = asVar.jp();
                String strOptString = "-1";
                if (!TextUtils.isEmpty(strJp)) {
                    map.put("request_id", strJp);
                } else {
                    map.put("request_id", "-1");
                }
                try {
                    long j10 = -1;
                    if (asVar.azk() != null) {
                        jOptLong = asVar.azk().optLong("ad_id", -1L);
                        jOptLong2 = asVar.azk().optLong("rit", -1L);
                        jOptLong3 = asVar.azk().optLong("ad_slot_type", -1L);
                        strOptString = asVar.azk().optString("ad_type", "-1");
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> mapJd = asVar.jd();
                    if (mapJd != null && (obj = mapJd.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j10 = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j10));
                    hn.hn().hnj("AdShow", map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> hnj(String str, String str2) {
        if (oj.gjv().ka()) {
            return hn.hn().hnj(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void hnj(MotionEvent motionEvent) {
        if (oj.gjv().ka()) {
            hn.hn().hnj(motionEvent);
        }
    }

    public static void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (oj.gjv().ka()) {
                hnj();
                if (sk() == 0) {
                    jSONObject.put("sec_did", hn.hn().gjv());
                    String strHnj = sk.hnj(jSONObject.toString());
                    Map<String, String> mapHnj = hn.hn().hnj("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strHnj != null ? strHnj.getBytes() : new byte[0]);
                    if (mapHnj != null && mapHnj.size() > 0) {
                        for (String str : mapHnj.keySet()) {
                            jSONObject.put(str, mapHnj.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strHnj);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put(trPLwhKZgZ.MsllPTvSlZ, hn.hn().dkl());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(sk()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th2) {
            apu.qor("SecSdkHelperUtil", th2.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
