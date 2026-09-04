package com.bytedance.sdk.component.adexpress.dynamic.sk;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.hn.orl;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class dkl {
    private static HashMap<String, String> dse;
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.gjv dkl;
    private hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private JSONObject f12663hn;
    private JSONObject hnj;
    private com.bytedance.sdk.component.adexpress.dynamic.gjv.qor qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private qor f12664sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        float f12665hn;
        float hnj;
        boolean qor;

        public static hnj hnj(JSONObject jSONObject) {
            hnj hnjVar = new hnj();
            if (jSONObject != null) {
                hnjVar.hnj = (float) jSONObject.optDouble("width");
                hnjVar.f12665hn = (float) jSONObject.optDouble("height");
                hnjVar.qor = jSONObject.optBoolean("isLandscape");
            }
            return hnjVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        dse = map;
        map.put("subtitle", "description");
        dse.put("source", "source|app.app_name");
        dse.put("screenshot", "dynamic_creative.screenshot");
    }

    public dkl(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.hnj = jSONObject;
        this.f12663hn = jSONObject2;
        this.qor = new com.bytedance.sdk.component.adexpress.dynamic.gjv.qor(jSONObject2);
        this.gjv = hnj.hnj(jSONObject3);
        this.dkl = com.bytedance.sdk.component.adexpress.dynamic.gjv.gjv.hnj(jSONObject4);
    }

    private void hn(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        com.bytedance.sdk.component.adexpress.dynamic.gjv.qor qorVar;
        Object objHnj;
        Object objHnj2;
        Object objHnj3;
        Object objHnj4;
        if (aqVar == null || (qorVar = this.qor) == null || (objHnj = qorVar.hnj("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objHnj);
        if (TextUtils.isEmpty(strValueOf) || (objHnj2 = this.qor.hnj(CampaignEx.JSON_KEY_TITLE)) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objHnj2);
        if (TextUtils.isEmpty(strValueOf2) || (objHnj3 = this.qor.hnj("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objHnj3);
        if (TextUtils.isEmpty(strValueOf3) || (objHnj4 = this.qor.hnj(RewardPlus.ICON)) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objHnj4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objHnj5 = this.qor.hnj("app.app_name");
        Object objHnj6 = this.qor.hnj("source");
        if (objHnj5 == null && objHnj6 == null) {
            return;
        }
        if (objHnj5 == null) {
            objHnj5 = objHnj6;
        }
        String strValueOf5 = String.valueOf(objHnj5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        aqVar.hnj("imageUrl", strValueOf);
        aqVar.hnj(CampaignEx.JSON_KEY_TITLE, strValueOf2);
        aqVar.hnj("description", strValueOf3);
        aqVar.hnj(RewardPlus.ICON, strValueOf4);
        aqVar.hnj("app_name", strValueOf5);
        aqVar.hnj(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.gjv.aq hnj(double d10, int i10, double d11, String str, orl orlVar) {
        JSONObject jSONObject;
        this.qor.hnj();
        try {
            jSONObject = new JSONObject(this.dkl.f12601hn);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVarHnj = hnj(gjv.hnj(this.hnj, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq) null);
        hnj(aqVarHnj);
        sk skVar = new sk(d10, i10, d11, str, orlVar);
        sk.hnj hnjVar = new sk.hnj();
        hnj hnjVar2 = this.gjv;
        hnjVar.hnj = hnjVar2.hnj;
        hnjVar.f12675hn = hnjVar2.f12665hn;
        hnjVar.qor = 0.0f;
        skVar.hnj(hnjVar);
        skVar.hnj(aqVarHnj, 0.0f, 0.0f);
        skVar.hnj();
        com.bytedance.sdk.component.adexpress.dynamic.gjv.hn hnVar = skVar.hnj;
        if (hnVar.gjv == 65536.0f) {
            return null;
        }
        return hnVar.dkl;
    }

    private void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        int iHnj;
        if (aqVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor() != null) {
            iHnj = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().jip();
        } else {
            iHnj = com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj());
        }
        int iHn = com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), iHnj);
        hnj hnjVar = this.gjv;
        float fMin = hnjVar.qor ? hnjVar.hnj : Math.min(hnjVar.hnj, iHn);
        if (this.gjv.f12665hn == 0.0f) {
            aqVar.sk(fMin);
            aqVar.ta().sk().ta("auto");
            aqVar.dkl(0.0f);
        } else {
            aqVar.sk(fMin);
            int iHn2 = com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj()));
            hnj hnjVar2 = this.gjv;
            aqVar.dkl(hnjVar2.qor ? hnjVar2.f12665hn : Math.min(hnjVar2.f12665hn, iHn2));
            aqVar.ta().sk().ta("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.gjv.aq hnj(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.dkl != null) {
                qor qorVar = new qor();
                this.f12664sk = qorVar;
                JSONObject jSONObjectHnj = qorVar.hnj(this.dkl.hnj, iOptInt, jSONObject);
                if (jSONObjectHnj != null) {
                    jSONObject = jSONObjectHnj;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVarHnj = hnj(jSONObject);
        aqVarHnj.hnj(aqVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            aqVarHnj.hnj((List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq>) null);
            return aqVarHnj;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i10);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = aqVarHnj.ta().sk().tll();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVarHnj2 = hnj(jSONArrayOptJSONArray2.optJSONObject(i11), aqVarHnj);
                    if (com.bytedance.sdk.component.adexpress.gjv.hn() && "skip-with-time".equals(aqVarHnj.ta().hn()) && !"transparent".equals(aqVarHnj.as()) && !TextUtils.isEmpty(aqVarHnj.as())) {
                        aqVarHnj2.qor(aqVarHnj.as());
                    }
                    arrayList.add(aqVarHnj2);
                    arrayList3.add(aqVarHnj2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            aqVarHnj.hnj(arrayList);
        }
        if (arrayList2.size() > 0) {
            aqVarHnj.hn(arrayList2);
        }
        return aqVarHnj;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.gjv.aq hnj(JSONObject jSONObject) {
        String strHnj;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        ojm.hnj(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectHnj = ojm.hnj(strOptString, ojm.hnj(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar = new com.bytedance.sdk.component.adexpress.dynamic.gjv.aq();
        if (TextUtils.isEmpty(strOptString2)) {
            aqVar.hn(String.valueOf(aqVar.hashCode()));
        } else {
            aqVar.hn(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            hn(aqVar);
            aqVar.qor((float) jSONObjectOptJSONObject.optDouble("x"));
            aqVar.gjv((float) jSONObjectOptJSONObject.optDouble("y"));
            aqVar.sk((float) jSONObjectOptJSONObject.optDouble("width"));
            aqVar.dkl((float) jSONObjectOptJSONObject.optDouble("height"));
            aqVar.dse(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.gjv.sk skVar = new com.bytedance.sdk.component.adexpress.dynamic.gjv.sk();
            skVar.hnj(strOptString);
            skVar.hn(jSONObjectOptJSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
            skVar.qor(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarHnj = com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl.hnj(jSONObjectOptJSONObject);
            skVar.hnj(dklVarHnj);
            com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarHnj2 = com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl.hnj(jSONObjectHnj);
            if (dklVarHnj2 == null) {
                skVar.hn(dklVarHnj);
            } else {
                skVar.hn(dklVarHnj2);
            }
            hnj(dklVarHnj);
            hnj(dklVarHnj2);
            if (TextUtils.equals(strOptString, mTFeqtajA.GcUS) && (jSONObject2 = this.f12663hn) != null) {
                hnj(skVar, jSONObject2.optInt("image_mode"));
            }
            String strHn = skVar.hn();
            com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = skVar.sk();
            if (dse.containsKey(strHn) && !dklVarSk.zt()) {
                dklVarSk.apu(dse.get(strHn));
            }
            if (dklVarSk.zt()) {
                strHnj = skVar.qor();
            } else {
                strHnj = hnj(skVar.qor());
            }
            if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                if (TextUtils.equals(strHn, "star") || TextUtils.equals(strHn, "text_star")) {
                    strHnj = hnj("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strHn, "score-count") || TextUtils.equals(strHn, "score-count-type-1") || TextUtils.equals(strHn, "score-count-type-2")) {
                    strHnj = hnj("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strHn) && dklVarHnj.rg()) {
                    strHnj = hnj("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(hnj()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                skVar.hn(strHnj + "adx:" + hnj());
            } else {
                skVar.hn(strHnj);
            }
            aqVar.hnj(skVar);
        }
        return aqVar;
    }

    private void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.sk skVar, int i10) {
        int iLastIndexOf;
        if (i10 != 5 && i10 != 15 && i10 != 50 && i10 != 154) {
            skVar.hnj("image");
            String strHnj = ojm.hnj("image");
            com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk = skVar.sk();
            dklVarSk.apu(strHnj);
            skVar.dse().apu(strHnj);
            String strHnj2 = ojm.hnj("image", "clickArea");
            if (!TextUtils.isEmpty(strHnj2)) {
                dklVarSk.fc(strHnj2);
                skVar.dse().fc(strHnj2);
            }
            JSONObject jSONObjectLx = dklVarSk.lx();
            if (jSONObjectLx != null) {
                dklVarSk.as(jSONObjectLx.optString("imageLottieTosPath"));
                dklVarSk.bug(jSONObjectLx.optBoolean("animationsLoop"));
                dklVarSk.tgn(jSONObjectLx.optInt("lottieAppNameMaxLength"));
                dklVarSk.vf(jSONObjectLx.optInt("lottieAdDescMaxLength"));
                dklVarSk.xyo(jSONObjectLx.optInt("lottieAdTitleMaxLength"));
            }
            skVar.hn(strHnj);
            if (strHnj != null && (iLastIndexOf = strHnj.lastIndexOf(".")) > 0) {
                String strSubstring = strHnj.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", hnj(strSubstring + ".width"));
                    jSONObject.put("height", hnj(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                skVar.qor(jSONObject.toString());
            }
            dklVarSk.xd();
            return;
        }
        skVar.hnj(MimeTypes.BASE_TYPE_VIDEO);
        String strHnj3 = ojm.hnj(MimeTypes.BASE_TYPE_VIDEO);
        skVar.sk().apu(strHnj3);
        String strHnj4 = ojm.hnj(MimeTypes.BASE_TYPE_VIDEO, "clickArea");
        if (!TextUtils.isEmpty(strHnj4)) {
            skVar.sk().fc(strHnj4);
            skVar.dse().fc(strHnj4);
        }
        skVar.dse().apu(strHnj3);
        skVar.hn(strHnj3);
        skVar.sk().sl();
    }

    private String hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.qor.hn(str2)) {
                String strValueOf = String.valueOf(this.qor.hnj(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String hnj() {
        Object objHnj;
        com.bytedance.sdk.component.adexpress.dynamic.gjv.qor qorVar = this.qor;
        return (qorVar == null || (objHnj = qorVar.hnj("adx_name")) == null) ? "" : String.valueOf(objHnj);
    }

    private void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        String strHqh = dklVar.hqh();
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            String strQor = com.bytedance.sdk.component.adexpress.gjv.dse.qor(com.bytedance.sdk.component.adexpress.gjv.hnj());
            if ("zh".equals(strQor)) {
                strQor = "cn";
            }
            if (!TextUtils.isEmpty(strQor) && dklVar.dkl() != null) {
                String strOptString = dklVar.dkl().optString(strQor);
                if (!TextUtils.isEmpty(strOptString)) {
                    strHqh = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strHqh)) {
            return;
        }
        int iIndexOf = strHqh.indexOf("{{");
        int iIndexOf2 = strHqh.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strHnj = hnj(strHqh.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb2 = new StringBuilder(strHqh.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strHnj)) {
                sb2.append(strHnj);
            }
            sb2.append(strHqh.substring(iIndexOf2 + 2));
            dklVar.bug(sb2.toString());
            return;
        }
        dklVar.bug(strHqh);
    }
}
