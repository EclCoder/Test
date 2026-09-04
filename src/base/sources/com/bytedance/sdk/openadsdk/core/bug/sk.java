package com.bytedance.sdk.openadsdk.core.bug;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.core.ta;
import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class sk {
    private static String hnj = "";

    public static boolean hn(as asVar) {
        return asVar != null && asVar.rq() == 10;
    }

    public static boolean hnj(int i10) {
        return i10 == 10 || i10 == 9;
    }

    private static JSONArray qor(as asVar) {
        try {
            as.hnj hnjVarZd = asVar.zd();
            if (hnjVarZd == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(hnjVarZd.ojm());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", asVar.cq());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                        jSONObject3.put("button_text", asVar.cq());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static JSONObject hnj(as asVar, String str) {
        JSONObject jSONObjectOrl = asVar.orl(false);
        try {
            jSONObjectOrl.put("show_dislike", asVar.ij());
            jSONObjectOrl.put("language", orl.hn());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strAq = ta.hn().aq();
                int iOjm = ta.hn().ojm();
                jSONObject.put("app_name", strAq);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iOjm)));
                jSONObjectOrl.put("open_app_info", jSONObject);
            }
            jSONObjectOrl.put("os", "Android");
            JSONArray jSONArrayQor = qor(asVar);
            if (jSONArrayQor != null) {
                jSONObjectOrl.put("dpa_data", jSONArrayQor);
            }
            return jSONObjectOrl;
        } catch (Throwable th2) {
            apu.qor("UgenUtils", "parseUGenDataInfo exception", th2.getMessage());
            return jSONObjectOrl;
        }
    }

    public static boolean hnj(as asVar) {
        return asVar != null && asVar.rq() == 7;
    }

    public static String hnj() {
        return hnj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static JSONObject hnj(as asVar, com.bytedance.sdk.openadsdk.core.bug.dse.qor qorVar) {
        qorVar.hnj("ad");
        String strFc = "";
        hnj = "";
        ?? r10 = 0;
        try {
            as.hnj hnjVarZd = asVar.zd();
            if (hnjVarZd != null) {
                strFc = hnjVarZd.fc();
                if (TextUtils.isEmpty(strFc) && !TextUtils.isEmpty(hnjVarZd.mjg()) && !TextUtils.isEmpty(hnjVarZd.gjv())) {
                    strFc = com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj("ad", hnjVarZd.gjv(), hnjVarZd.mjg());
                }
            }
            try {
                if (!TextUtils.isEmpty(strFc)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strFc);
                        try {
                            hnj = "getTemplate success";
                            qorVar.hn(ImagesContract.LOCAL);
                            return jSONObject;
                        } catch (JSONException unused) {
                            String strConcat = "parse json exception data is ".concat(String.valueOf(strFc));
                            hnj = strConcat;
                            qorVar.hnj(2, strConcat, ImagesContract.LOCAL);
                            return null;
                        }
                    } catch (JSONException unused2) {
                    }
                } else {
                    String str = "local data is null id is " + hnjVarZd.gjv() + " md5 is " + hnjVarZd.mjg();
                    hnj = str;
                    qorVar.hnj(3, str, HqKnbV.GnXyDIC);
                    return null;
                }
            } catch (Throwable th2) {
                r10 = hnjVarZd;
                th = th2;
                String str2 = "get template error " + th.getMessage();
                hnj = str2;
                qorVar.hnj(2, str2, ImagesContract.LOCAL);
                return r10;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
