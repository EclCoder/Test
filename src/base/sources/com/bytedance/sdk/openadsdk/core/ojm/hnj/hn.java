package com.bytedance.sdk.openadsdk.core.ojm.hnj;

import android.text.TextUtils;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.a;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.bug.dse.qor;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.core.model.oj;
import com.bytedance.sdk.openadsdk.core.model.xn;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.core.ua;
import com.google.android.gms.common.internal.ImagesContract;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static String f14064hn = "";
    public static String hnj = "https://pag_open_icon_id/appicon.png";

    public static JSONObject hn() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", orl.hn());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            ua.hn(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e10) {
            apu.qor("TemplateUtils", e10.getMessage());
            return jSONObject;
        }
    }

    public static String hnj() {
        return f14064hn;
    }

    public static boolean qor() {
        return true;
    }

    public static JSONObject hnj(float f10, float f11, boolean z10, as asVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", hnj(false, asVar));
            jSONObject.put("template_Plugin", hn(asVar.zd()));
            jSONObject.put("diff_template_Plugin", hnj(asVar.zd()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject qor(as asVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            ua.hnj(jSONObject, asVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String hn(as.hnj hnjVar) {
        com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVarQor;
        if (hnjVar != null) {
            String strDse = hnjVar.dse();
            return (!TextUtils.isEmpty(strDse) || (hnVarQor = com.bytedance.sdk.component.adexpress.hnj.hn.hn.qor(hnjVar.gjv())) == null) ? strDse : hnVarQor.sk();
        }
        return "";
    }

    public static JSONObject hnj(as asVar) {
        return hnj(asVar, false, (JSONObject) null);
    }

    public static JSONObject hnj(as asVar, boolean z10, JSONObject jSONObject) {
        JSONObject jSONObjectHnj = null;
        if (asVar == null) {
            return null;
        }
        try {
            jSONObjectHnj = hnj(asVar, false, z10);
            if (jSONObjectHnj == null) {
                jSONObjectHnj = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            ua.hn(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObjectHnj.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectHnj.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectHn = ua.hn(asVar);
            jSONObjectHn.put("language", orl.hn());
            jSONObjectHnj.put("xSetting", jSONObjectHn);
            return jSONObjectHnj;
        } catch (Throwable th2) {
            th2.getMessage();
            return jSONObjectHnj;
        }
    }

    public static Map<String, String> hn(as asVar) {
        HashMap map = null;
        if (asVar == null) {
            return null;
        }
        List<oj> listLx = asVar.lx();
        if (listLx != null && listLx.size() > 0) {
            map = new HashMap();
            for (oj ojVar : listLx) {
                if (ojVar != null) {
                    map.put(ojVar.hnj(), ojVar.dse());
                }
            }
            oj ojVarMn = asVar.mn();
            if (ojVarMn != null) {
                map.put(ojVarMn.hnj(), ojVarMn.dse());
            }
        }
        return map;
    }

    private static JSONObject hnj(as asVar, boolean z10, boolean z11) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (asVar != null) {
            try {
                String strTm = asVar.tm();
                if (strTm != null) {
                    JSONObject jSONObject2 = new JSONObject(strTm);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z10 && !z11) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= asVar.qor() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(asVar.qor())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th2) {
                apu.hnj("TemplateUtils", "filterTemplateInfo", th2);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject hnj(float f10, float f11, boolean z10, as asVar, String str, qor qorVar) {
        f14064hn = "";
        if (asVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectHnj = hnj(f10, f11, z10, asVar, str);
            if (qorVar != null) {
                qorVar.hnj("adv3");
            }
            gm gmVarVk = asVar.vk();
            if (gmVarVk != null) {
                String strGjv = gmVarVk.gjv();
                if (!TextUtils.isEmpty(strGjv)) {
                    jSONObjectHnj.put("xTemplate", new JSONObject(strGjv));
                    f14064hn = "getTemplate success by local data";
                    if (qorVar != null) {
                        qorVar.hn(ImagesContract.LOCAL);
                        return jSONObjectHnj;
                    }
                } else {
                    String strHnj = com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj("adv3", gmVarVk.hnj(), gmVarVk.hn());
                    if (!TextUtils.isEmpty(strHnj)) {
                        jSONObjectHnj.put("xTemplate", new JSONObject(strHnj));
                        f14064hn = "getTemplate success by db data";
                        if (qorVar != null) {
                            qorVar.hn(ImagesContract.LOCAL);
                            return jSONObjectHnj;
                        }
                    } else {
                        String str2 = "local db data is null id is " + gmVarVk.hnj() + " md5 is " + gmVarVk.hn();
                        f14064hn = str2;
                        if (qorVar != null) {
                            qorVar.hnj(3, str2, "net");
                        }
                    }
                }
            }
            return jSONObjectHnj;
        } catch (Exception e10) {
            String str3 = "load template exception " + e10.getMessage();
            f14064hn = str3;
            if (qorVar != null) {
                qorVar.hnj(3, str3, "net");
            }
            return null;
        }
    }

    public static JSONObject hnj(float f10, float f11, boolean z10, as asVar, String str) {
        if (asVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectHnj = hnj(asVar, true, true);
            if (jSONObjectHnj == null) {
                return null;
            }
            try {
                hnj(jSONObjectHnj, asVar, str);
                JSONObject jSONObjectHn = ua.hn(asVar);
                jSONObjectHn.put("language", orl.hn());
                jSONObjectHnj.put("xSetting", jSONObjectHn);
                jSONObjectHnj.put("xAdInfo", hnj(str, qor(asVar), asVar));
                JSONObject jSONObject = new JSONObject();
                ua.hn(jSONObject);
                jSONObject.put("platform", "android");
                jSONObjectHnj.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f10);
                jSONObject2.put("height", f11);
                if (z10) {
                    jSONObject2.put("isLandscape", true);
                }
                jSONObjectHnj.put("xSize", jSONObject2);
                return jSONObjectHnj;
            } catch (Throwable unused) {
                return jSONObjectHnj;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void hnj(JSONObject jSONObject, as asVar, String str) {
        if (asVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            a aVarPwt = asVar.pwt();
            if (aVarPwt != null) {
                JSONObject jSONObjectZ = aVarPwt.z();
                jSONObjectZ.put("video_duration", aVarPwt.e() * ((double) aVarPwt.M()));
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObjectZ);
            } else if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_duration", com.bytedance.sdk.openadsdk.core.oj.gjv().as(String.valueOf(asVar.atw())));
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObject2);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private static JSONObject hnj(String str, JSONObject jSONObject, as asVar) {
        if (asVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", ta.hn().aq());
                    int iOjm = ta.hn().ojm();
                    if (iOjm != 0) {
                        int iRq = asVar.rq();
                        if (9 == iRq) {
                            jSONObject2.put("app_icon", hnj);
                        } else if (10 == iRq) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iOjm)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject hnj(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String hnj(as.hnj hnjVar) {
        if (hnjVar != null) {
            return hnjVar.aq();
        }
        return "";
    }

    public static JSONObject hnj(boolean z10, as asVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", asVar.cq());
            if (asVar.mn() != null) {
                if (asVar.mn() != null && !TextUtils.isEmpty(asVar.mn().hnj())) {
                    jSONObject.put(RewardPlus.ICON, asVar.mn().hnj());
                } else {
                    jSONObject.put(RewardPlus.ICON, "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (asVar.lx() != null) {
                for (int i10 = 0; i10 < asVar.lx().size(); i10++) {
                    oj ojVar = asVar.lx().get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", ojVar.qor());
                    jSONObject2.put("width", ojVar.hn());
                    jSONObject2.put("url", ojVar.hnj());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", asVar.qri());
            jSONObject.put("interaction_type", asVar.rg());
            jSONObject.put("interaction_method", asVar.fr());
            jSONObject.put("is_compliance_template", qor());
            jSONObject.put(CampaignEx.JSON_KEY_TITLE, asVar.kby());
            jSONObject.put("description", asVar.br());
            jSONObject.put("source", asVar.mw());
            JSONObject jSONObject3 = new JSONObject();
            xn xnVarTgn = asVar.tgn();
            if (xnVarTgn == null) {
                xnVarTgn = new xn();
            }
            jSONObject3.put("ceiling_time", xnVarTgn.gjv());
            jSONObject3.put("ceiling_ratio", xnVarTgn.sk());
            jSONObject3.put("expand_ratio", xnVarTgn.dkl());
            jSONObject.put("interaction_params", jSONObject3);
            if (asVar.zyh() != null) {
                jSONObject.put("comment_num", asVar.zyh().sk());
                jSONObject.put("score", asVar.zyh().gjv());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, asVar.zyh().dkl());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, asVar.zyh().aq());
            }
            a aVarPwt = asVar.pwt();
            if (aVarPwt != null) {
                JSONObject jSONObjectZ = aVarPwt.z();
                jSONObjectZ.put("video_duration", aVarPwt.e() * ((double) aVarPwt.M()));
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObjectZ);
            }
            if (asVar.zd() != null) {
                jSONObject.put("dynamic_creative", asVar.zd().ojm());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String hnj(as asVar, String str) {
        List<oj> listLx;
        if (asVar != null && (listLx = asVar.lx()) != null && listLx.size() > 0) {
            for (oj ojVar : listLx) {
                if (ojVar != null && TextUtils.equals(str, ojVar.hnj())) {
                    return ojVar.dse();
                }
            }
        }
        return null;
    }
}
