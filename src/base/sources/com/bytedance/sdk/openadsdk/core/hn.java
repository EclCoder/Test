package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.Cdo;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hn {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public int f13768hn;
        public String hnj;

        public hnj(String str, int i10) {
            this.hnj = str;
            this.f13768hn = i10;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.aq aq(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.aq aqVar = new com.bytedance.sdk.openadsdk.core.model.aq();
        if (jSONObject == null) {
            aqVar.qor(0);
            aqVar.gjv(0);
            aqVar.hn(new ArrayList());
            aqVar.sk(0);
            aqVar.hnj(new ArrayList());
            aqVar.hn(0);
            aqVar.hnj(0);
            return aqVar;
        }
        aqVar.qor(jSONObject.optInt("interceptor_x", 0));
        aqVar.gjv(jSONObject.optInt("interceptor_y", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
            }
        }
        aqVar.hn(arrayList);
        aqVar.sk(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i11));
            }
        }
        aqVar.hnj(arrayList2);
        aqVar.hn(jSONObject.optInt("boc_index", 0));
        aqVar.hnj(jSONObject.optInt("is_act", 0));
        return aqVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.eum dkl(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.eum eumVar = new com.bytedance.sdk.openadsdk.core.model.eum();
        if (jSONObject == null) {
            eumVar.hnj(10L);
            eumVar.hn(20L);
            eumVar.qor(10L);
            eumVar.gjv(20L);
            eumVar.hnj("");
            return eumVar;
        }
        eumVar.hnj(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        eumVar.hn(jSONObject.optLong("straight_lp_showtime", 20L));
        eumVar.qor(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        eumVar.gjv(jSONObject.optLong("straight_agg_showtime", 20L));
        eumVar.hnj(jSONObject.optString("loading_text", ""));
        return eumVar;
    }

    private static Map<String, Object> dnm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }

    private static FilterWord gjv(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    FilterWord filterWordGjv = gjv(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (filterWordGjv != null && filterWordGjv.isValid()) {
                        filterWord.addOption(filterWordGjv);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.bug.aq.hnj hn(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.bug.aq.hnj();
        hnjVar.hnj(jSONObject.optString("id"));
        hnjVar.hn(jSONObject.optString("md5"));
        hnjVar.qor(jSONObject.optString("url"));
        return hnjVar;
    }

    private static boolean hnj(int i10) {
        return i10 == 2 || i10 == 3 || i10 == 8;
    }

    private static com.bytedance.sdk.openadsdk.core.model.mjg ojm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.mjg mjgVar = new com.bytedance.sdk.openadsdk.core.model.mjg();
        mjgVar.hnj(jSONObject.optInt("if_send_click", 0));
        return mjgVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.dse qor(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j10 = jOptLong >= 0 ? jOptLong : 0L;
        int iOptInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.dse dseVar = new com.bytedance.sdk.openadsdk.core.model.dse();
        dseVar.hn(iOptInt);
        dseVar.qor(iOptInt2);
        dseVar.hnj(j10);
        dseVar.hnj(iOptInt3);
        return dseVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.dkl sk(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.dkl dklVar = new com.bytedance.sdk.openadsdk.core.model.dkl();
        dklVar.hn(jSONObject.optString("app_name"));
        dklVar.qor(jSONObject.optString(CampaignEx.JSON_KEY_PACKAGE_NAME));
        dklVar.hnj(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        dklVar.hnj(jSONObject.optDouble("score", -1.0d));
        dklVar.hnj(jSONObject.optInt("comment_num", -1));
        dklVar.hn(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        dklVar.gjv(jSONObject.optString("app_category"));
        return dklVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.orl ta(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.orl orlVar = new com.bytedance.sdk.openadsdk.core.model.orl();
        orlVar.hnj(jSONObject.optString("deeplink_url"));
        orlVar.hn(jSONObject.optString("fallback_url"));
        orlVar.hnj(jSONObject.optInt("fallback_type"));
        return orlVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.xn dse(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.xn xnVar = new com.bytedance.sdk.openadsdk.core.model.xn();
        if (jSONObject == null) {
            xnVar.gjv(5);
            xnVar.sk(30);
            xnVar.dkl(70);
            xnVar.dse(1);
            xnVar.aq(com.bytedance.sdk.openadsdk.core.model.xn.hnj);
            xnVar.qor(0);
            xnVar.hn(0);
            xnVar.hnj(3);
            return xnVar;
        }
        xnVar.gjv(jSONObject.optInt("ceiling_time", 5));
        xnVar.sk(jSONObject.optInt("ceiling_ratio", 30));
        xnVar.dkl(jSONObject.optInt("expand_ratio", 70));
        xnVar.dse(jSONObject.optInt("back_type", 1));
        xnVar.aq(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.xn.hnj));
        xnVar.qor(jSONObject.optInt("pre_render_status", 0));
        xnVar.hn(jSONObject.optInt("pre_render_use_gecko", 0));
        xnVar.hnj(jSONObject.optInt(dOIDCKnIR.mHetoqQ, 3));
        return xnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair<com.bytedance.sdk.openadsdk.core.model.hnj, ArrayList<Integer>> hnj(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar) {
        Pair<com.bytedance.sdk.openadsdk.core.model.hnj, ArrayList<Integer>> pair;
        com.bytedance.sdk.openadsdk.core.model.as asVar;
        ArrayList arrayList;
        com.bytedance.sdk.openadsdk.core.model.as asVar2;
        com.bytedance.sdk.openadsdk.core.model.as asVar3 = null;
        asVar3 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.model.hnj();
            hnjVar.hnj(jSONObject.optString("request_id"));
            hnjVar.hnj(jSONObject.optInt("ret"));
            hnjVar.hn(jSONObject.optInt(mDXVAtwcaFMHJ.zHPa, 0));
            hnjVar.hn(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String strOptString = jSONObject.optString("gdid_encrypted");
            hnjVar.hnj(com.bytedance.sdk.openadsdk.core.model.wu.hnj(jSONObject.optJSONObject("loop_config")));
            String strOptString2 = jSONObject.optString("auction_price");
            if (hnjVar.qor() != 0) {
                return null;
            }
            hnjVar.hnj(com.bytedance.sdk.openadsdk.core.model.tu.hnj(jSONObject.optString("multi_ad_config")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                jSONArrayOptJSONArray.length();
                int i10 = 0;
                ArrayList arrayList3 = hnjVar.aq() ? new ArrayList() : null;
                while (i10 < jSONArrayOptJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.as asVarHnj = hnj(jSONArrayOptJSONArray.optJSONObject(i10), adSlot, xyoVar, hnjVar, i10);
                    if (!hnjVar.aq()) {
                        arrayList = arrayList3;
                        arrayList = asVar3;
                    }
                    arrayList = arrayList3;
                    int iHnj = hnj(asVarHnj);
                    if (iHnj != 200) {
                        if (asVarHnj != null) {
                            com.bytedance.sdk.openadsdk.gjv.qor.hn(asVarHnj, com.bytedance.sdk.openadsdk.utils.orp.qor(asVarHnj.xf()), iHnj);
                        } else {
                            com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar3, "", iHnj);
                        }
                        arrayList2.add(Integer.valueOf(iHnj));
                        if (arrayList == 0 || asVarHnj == null) {
                            asVar2 = asVar3;
                        } else {
                            asVar = asVar3;
                            try {
                                arrayList.add(new hnj(asVarHnj.pv(), iHnj));
                                asVar2 = asVar;
                            } catch (Throwable th2) {
                                th = th2;
                                pair = asVar;
                            }
                        }
                        if (asVarHnj != null && (asVarHnj.qb() == 39 || asVarHnj.qb() == 41)) {
                            hnjVar.hn(0);
                        }
                        jSONArrayOptJSONArray.remove(i10);
                        i10--;
                    } else {
                        asVar2 = asVar3;
                        asVarHnj.mjg(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            asVarHnj.ojm(strOptString);
                        }
                        hnjVar.hnj(asVarHnj);
                    }
                    i10++;
                    asVar3 = asVar2;
                    arrayList3 = arrayList;
                }
                asVar = asVar3;
                List<com.bytedance.sdk.openadsdk.core.model.as> listGjv = hnjVar.gjv();
                hnj(listGjv, hnjVar);
                if (listGjv != null) {
                    if (hnjVar.aq() && listGjv.size() == 1) {
                        hnjVar.hn(0);
                        com.bytedance.sdk.openadsdk.core.model.as asVar4 = listGjv.get(0);
                        if (asVar4 != null) {
                            asVar4.dnm(false);
                        }
                    }
                    int size = listGjv.size();
                    jSONObject.put("creatives", jSONArrayOptJSONArray);
                    for (int i11 = 0; i11 < size; i11++) {
                        com.bytedance.sdk.openadsdk.core.model.as asVar5 = listGjv.get(i11);
                        if (asVar5 != null) {
                            if (i11 > 0) {
                                asVar5.res();
                            }
                            asVar5.ul(jSONObject.toString());
                        }
                    }
                }
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    hnj((ArrayList<hnj>) arrayList3);
                }
            } else {
                asVar = null;
            }
            return new Pair<>(hnjVar, arrayList2);
        } catch (Throwable th3) {
            th = th3;
            pair = asVar3;
        }
        com.bytedance.sdk.component.utils.apu.qor("TTAD.AdInfoFactory", th.getMessage());
        return pair;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    private static int hn(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        int iHnj;
        String strQor = com.bytedance.sdk.openadsdk.utils.orp.qor(asVar.xf());
        if (asVar.vz() == 0) {
            iHnj = hnj(asVar.pdc());
            com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, iHnj);
        } else {
            iHnj = 200;
        }
        int iRg = asVar.rg();
        if (iRg == 2 || iRg == 3) {
            if (gjv(asVar) && TextUtils.isEmpty(asVar.xe())) {
                com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, TTAdConstant.LANDING_PAGE_TYPE_CODE);
                iHnj = 406;
            }
        } else if (iRg == 4) {
            com.bytedance.sdk.openadsdk.core.model.dkl dklVarZyh = asVar.zyh();
            if (dklVarZyh == null) {
                com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, TTAdConstant.DOWNLOAD_APP_INFO_CODE);
                iHnj = 407;
            } else if (TextUtils.isEmpty(dklVarZyh.qor()) && TextUtils.isEmpty(dklVarZyh.hnj())) {
                com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME);
                iHnj = 417;
            } else if (TextUtils.isEmpty(dklVarZyh.qor())) {
                iHnj = TTAdConstant.PACKAGE_NAME_CODE;
                com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, TTAdConstant.PACKAGE_NAME_CODE);
            } else if (TextUtils.isEmpty(dklVarZyh.hnj())) {
                iHnj = TTAdConstant.DOWNLOAD_URL_CODE;
                com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, TTAdConstant.DOWNLOAD_URL_CODE);
            }
        } else if (iRg == 8) {
            if (gjv(asVar)) {
                com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, TTAdConstant.LANDING_PAGE_TYPE_CODE);
                iHnj = 406;
            }
        }
        if (iHnj == 417 || iHnj == 407 || iHnj == 406) {
            return iHnj;
        }
        if (iHnj != 200) {
            com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, strQor, iHnj);
        }
        return 200;
    }

    private static int qor(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        int iHnj;
        String strQor = com.bytedance.sdk.openadsdk.utils.orp.qor(asVar.xf());
        if (asVar.vz() == 0) {
            iHnj = hnj(asVar.pdc());
            if (iHnj != 200) {
                com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, iHnj);
                return iHnj;
            }
        } else {
            iHnj = 200;
        }
        int iRg = asVar.rg();
        if (iRg != 2 && iRg != 3) {
            if (iRg == 4) {
                int iHnj2 = hnj(asVar.zyh());
                if (iHnj2 != 200) {
                    com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, iHnj2);
                }
                return iHnj2;
            }
            if (iRg != 8) {
                return iHnj;
            }
        }
        if (!gjv(asVar) || !TextUtils.isEmpty(asVar.xe())) {
            return iHnj;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, TTAdConstant.LANDING_PAGE_TYPE_CODE);
        return TTAdConstant.LANDING_PAGE_TYPE_CODE;
    }

    private static boolean gjv(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        return (asVar.qs() || asVar.ux()) ? false : true;
    }

    private static void hnj(List<com.bytedance.sdk.openadsdk.core.model.as> list, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.as asVar = list.get(0);
        if (!hnjVar.aq() || asVar == null || !asVar.xj() || com.bytedance.sdk.openadsdk.utils.orp.nyv() == 0) {
            return;
        }
        hnjVar.hn(0);
        asVar.dnm(false);
    }

    /* JADX WARN: Code duplicated, block: B:181:0x06d4 A[PHI: r0
      0x06d4: PHI (r0v88 int) = (r0v87 int), (r0v137 int) binds: [B:174:0x06c0, B:179:0x06d1] A[DONT_GENERATE, DONT_INLINE]] */
    public static com.bytedance.sdk.openadsdk.core.model.as hnj(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, int i10) {
        a aVarHnj;
        a aVarHnj2;
        int i11;
        String str;
        com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar2;
        com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj hnjVar3;
        com.bytedance.sdk.openadsdk.core.orl.hnj hnjVarHnj;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.as asVar = new com.bytedance.sdk.openadsdk.core.model.as();
        if (hnjVar != null) {
            asVar.hnj(hnjVar);
            if (hnjVar.aq()) {
                int iOptInt = jSONObject.optInt("interaction_method");
                if (iOptInt != 30 && iOptInt != 39 && iOptInt != 40 && iOptInt != 41 && iOptInt != 43 && iOptInt != 44) {
                    hnjVar.hn(0);
                    asVar.dnm(false);
                } else {
                    asVar.dnm(true);
                }
            }
        }
        asVar.hnj(i10);
        hnj(jSONObject, asVar);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("multi_ad_scene");
        if (jSONObjectOptJSONObject4 != null) {
            asVar.hnj(com.bytedance.sdk.openadsdk.core.model.tgn.hnj(jSONObjectOptJSONObject4));
        }
        if (jSONObject.has("raw_response_info")) {
            asVar.ul(jSONObject.optString("raw_response_info"));
        }
        asVar.mjg(jSONObject.optInt("proportion_watching", -1));
        asVar.uua(jSONObject.optBoolean("mate_disable_cache", false));
        asVar.nyv(jSONObject.optInt("interaction_type"));
        asVar.hqh(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.as.qor, 0));
        asVar.pty(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.as.f13880hn, 0));
        asVar.gm(jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.as.gjv, 0));
        asVar.oj(jSONObject.optString("target_url"));
        asVar.as(jSONObject.optString("ad_id"));
        asVar.m33do(jSONObject.optString("app_log_url"));
        asVar.tu(jSONObject.optString("settings_url"));
        asVar.jip(jSONObject.optString("source"));
        asVar.uua(jSONObject.optString("app_name"));
        asVar.orp(jSONObject.optInt("dislike_control", 0));
        asVar.m32do(jSONObject.optInt("play_bar_show_time", -200));
        asVar.xyo(jSONObject.optString("gecko_id"));
        asVar.hn(jSONObject.optInt("lp_cache_count", 0));
        if (jSONObject.has("set_click_type")) {
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("set_click_type");
            asVar.hn(jSONObjectOptJSONObject5.optDouble("cta", 2.0d));
            asVar.hnj(jSONObjectOptJSONObject5.optDouble("other", 1.0d));
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("extension");
        asVar.dkl(jSONObjectOptJSONObject6);
        if (jSONObjectOptJSONObject6 != null) {
            asVar.hnj(new com.bytedance.sdk.openadsdk.core.model.uua(jSONObjectOptJSONObject6));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject(RewardPlus.ICON);
        asVar.bug(jSONObject.optBoolean("screenshot", false));
        asVar.wu(jSONObject.optInt("play_bar_style", 0));
        asVar.vf(jSONObject.optString("market_url", ""));
        asVar.apu(jSONObject.optInt("video_adaptation", 0));
        asVar.uua(jSONObject.optInt("feed_video_opentype", 0));
        asVar.qor(jSONObject.optJSONObject("session_params"));
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("dynamic_configs");
        asVar.gjv(jSONObjectOptJSONObject8);
        if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject8.optJSONObject("speed_config")) != null) {
            com.bytedance.sdk.openadsdk.core.model.nyv nyvVar = new com.bytedance.sdk.openadsdk.core.model.nyv();
            nyvVar.hnj((float) jSONObjectOptJSONObject3.optDouble("speed", 1.0d));
            nyvVar.hnj(jSONObjectOptJSONObject3.optInt("type", 0));
            asVar.hnj(nyvVar);
        }
        asVar.mjg(jSONObject.optString("auction_price", ""));
        asVar.dzo(jSONObject.optInt("mrc_report", 0));
        if (jSONObject.optBoolean("isMrcReportFinish", false)) {
            asVar.rw();
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("render");
        if (jSONObjectOptJSONObject9 != null) {
            asVar.oj(jSONObjectOptJSONObject9.optInt("render_sequence", 0));
            asVar.xn(jSONObjectOptJSONObject9.optInt("backup_render_control", 1));
            asVar.pnz(jSONObjectOptJSONObject9.optInt("reserve_time", 100));
            asVar.pv(jSONObjectOptJSONObject9.optInt("render_thread", 0));
        }
        asVar.fc(jSONObject.optInt("render_control", xyoVar != null ? xyoVar.ojm : 1));
        if (jSONObjectOptJSONObject7 != null) {
            com.bytedance.sdk.openadsdk.core.model.oj ojVar = new com.bytedance.sdk.openadsdk.core.model.oj();
            ojVar.hnj(jSONObjectOptJSONObject7.optString("url"));
            ojVar.hn(jSONObjectOptJSONObject7.optInt("height"));
            ojVar.hnj(jSONObjectOptJSONObject7.optInt("width"));
            asVar.hnj(ojVar);
        }
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("reward_data");
        if (jSONObjectOptJSONObject10 != null) {
            asVar.orl(jSONObjectOptJSONObject10.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT, 0));
            asVar.bug(jSONObjectOptJSONObject10.optString(CampaignEx.JSON_KEY_REWARD_NAME, ""));
        }
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("cover_image");
        if (jSONObjectOptJSONObject11 != null) {
            com.bytedance.sdk.openadsdk.core.model.oj ojVar2 = new com.bytedance.sdk.openadsdk.core.model.oj();
            ojVar2.hnj(jSONObjectOptJSONObject11.optString("url"));
            ojVar2.hn(jSONObjectOptJSONObject11.optInt("height"));
            ojVar2.hnj(jSONObjectOptJSONObject11.optInt("width"));
            asVar.hn(ojVar2);
        }
        if (jSONObject.has("banner") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("banner")) != null) {
            asVar.hnj(new PAGBannerSize(jSONObjectOptJSONObject2.optInt("width", 0), jSONObjectOptJSONObject2.optInt("height", 0)));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
        if (jSONArrayOptJSONArray != null) {
            for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                com.bytedance.sdk.openadsdk.core.model.oj ojVar3 = new com.bytedance.sdk.openadsdk.core.model.oj();
                JSONObject jSONObjectOptJSONObject12 = jSONArrayOptJSONArray.optJSONObject(i12);
                ojVar3.hnj(jSONObjectOptJSONObject12.optString("url"));
                ojVar3.hn(jSONObjectOptJSONObject12.optInt("height"));
                ojVar3.hnj(jSONObjectOptJSONObject12.optInt("width"));
                ojVar3.hnj(jSONObjectOptJSONObject12.optBoolean("image_preview"));
                ojVar3.hn(jSONObjectOptJSONObject12.optString("image_key"));
                asVar.qor(ojVar3);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("show_url");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i13 = 0; i13 < jSONArrayOptJSONArray2.length(); i13++) {
                asVar.sl().add(jSONArrayOptJSONArray2.optString(i13));
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(CampaignEx.JSON_KEY_CLICK_URL);
        if (jSONArrayOptJSONArray3 != null) {
            for (int i14 = 0; i14 < jSONArrayOptJSONArray3.length(); i14++) {
                asVar.xd().add(jSONArrayOptJSONArray3.optString(i14));
            }
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("play_start");
        if (jSONArrayOptJSONArray4 != null) {
            for (int i15 = 0; i15 < jSONArrayOptJSONArray4.length(); i15++) {
                asVar.tb().add(jSONArrayOptJSONArray4.optString(i15));
            }
        }
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("click_area");
        if (jSONObjectOptJSONObject13 != null) {
            com.bytedance.sdk.openadsdk.core.model.dnm dnmVar = new com.bytedance.sdk.openadsdk.core.model.dnm();
            dnmVar.hnj = jSONObjectOptJSONObject13.optBoolean("click_upper_content_area", true);
            dnmVar.f13953hn = jSONObjectOptJSONObject13.optBoolean("click_upper_non_content_area", true);
            dnmVar.qor = jSONObjectOptJSONObject13.optBoolean("click_lower_content_area", true);
            dnmVar.gjv = jSONObjectOptJSONObject13.optBoolean("click_lower_non_content_area", true);
            dnmVar.f13954sk = jSONObjectOptJSONObject13.optBoolean("click_button_area", true);
            dnmVar.dkl = jSONObjectOptJSONObject13.optBoolean("click_video_area", true);
            asVar.hnj(dnmVar);
        }
        JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("adslot");
        if (jSONObjectOptJSONObject14 != null) {
            asVar.hnj(hnj(jSONObjectOptJSONObject14));
        } else {
            asVar.hnj(adSlot);
        }
        if (adSlot != null) {
            Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey("admob_watermark")) {
                asVar.ta(String.valueOf(requestExtraMap.get("admob_watermark")));
            }
        } else {
            asVar.ta(jSONObject.optString("identificationOverlayContent"));
        }
        asVar.as(jSONObject.optInt("intercept_flag", 0));
        asVar.xn(jSONObject.optString("phone_num"));
        asVar.apu(jSONObject.optString(CampaignEx.JSON_KEY_TITLE));
        asVar.eum(jSONObject.optString("description"));
        asVar.wu(jSONObject.optString("button_text"));
        asVar.eum(jSONObject.optInt("ad_logo", 1));
        asVar.tgn(jSONObject.optString("ext"));
        asVar.xyo(jSONObject.optInt("cover_click_area", 0));
        asVar.ul(jSONObject.optInt("image_mode"));
        asVar.fvt(jSONObject.optInt("orientation", 1));
        asVar.hnj((float) jSONObject.optDouble("aspect_ratio", 100.0d));
        asVar.xyo(jSONObject.optInt("cover_click_area", 0));
        JSONObject jSONObjectOptJSONObject15 = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        JSONObject jSONObjectOptJSONObject16 = jSONObject.optJSONObject(CampaignEx.JSON_KEY_DEEP_LINK_URL);
        JSONObject jSONObjectOptJSONObject17 = jSONObject.optJSONObject("oem");
        asVar.dkl(jSONObject.optInt("is_web_jump_ip", 0));
        asVar.hnj(com.bytedance.sdk.openadsdk.core.model.vf.hnj(jSONObjectOptJSONObject17));
        asVar.hnj(sk(jSONObjectOptJSONObject15));
        JSONObject jSONObjectOptJSONObject18 = jSONObject.optJSONObject("interaction_method_params");
        asVar.hnj(aq(jSONObject.optJSONObject("arbitrage_interceptor_params")));
        asVar.hnj(dkl(jSONObjectOptJSONObject18));
        asVar.hnj(dse(jSONObjectOptJSONObject18));
        asVar.hnj(ta(jSONObjectOptJSONObject16));
        asVar.hnj(new com.bytedance.sdk.openadsdk.core.model.hqh(jSONObject));
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("filter_words");
        if (jSONArrayOptJSONArray5 != null) {
            for (int i16 = 0; i16 < jSONArrayOptJSONArray5.length(); i16++) {
                FilterWord filterWordGjv = gjv(jSONArrayOptJSONArray5.optJSONObject(i16));
                if (filterWordGjv != null && filterWordGjv.isValid()) {
                    asVar.hnj(filterWordGjv);
                }
            }
        }
        asVar.ua(jSONObject.optInt("count_down"));
        asVar.qor(jSONObject.optLong("expiration_time"));
        asVar.rmr(jSONObject.optInt("video_encode_type", 0));
        asVar.lu(0);
        JSONObject jSONObjectOptJSONObject19 = jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO);
        if (jSONObjectOptJSONObject19 != null) {
            aVarHnj = hnj(jSONObjectOptJSONObject19, asVar, true);
            asVar.hn(aVarHnj);
            asVar.aq(jSONObjectOptJSONObject19.optInt("multi_played_percent", 50));
        } else {
            aVarHnj = null;
        }
        JSONObject jSONObjectOptJSONObject20 = jSONObject.optJSONObject("h265_video");
        if (jSONObjectOptJSONObject20 != null) {
            aVarHnj2 = hnj(jSONObjectOptJSONObject20, asVar, false);
            asVar.qor(aVarHnj2);
        } else {
            aVarHnj2 = null;
        }
        if (Build.VERSION.SDK_INT < 26 || asVar.qk() == 0) {
            asVar.hnj(aVarHnj);
            asVar.rmr(0);
        } else {
            if (aVarHnj2 != null && aVarHnj != null) {
                if (TextUtils.isEmpty(aVarHnj2.d())) {
                    aVarHnj2.o(aVarHnj.d());
                }
                if (TextUtils.isEmpty(aVarHnj2.C())) {
                    aVarHnj2.I(aVarHnj.C());
                }
                if (aVarHnj2.m() == -1) {
                    aVarHnj2.n(aVarHnj.m());
                }
            }
            if (aVarHnj2 != null) {
                asVar.hnj(aVarHnj2);
            } else {
                asVar.hnj(aVarHnj);
            }
        }
        JSONObject jSONObjectOptJSONObject21 = jSONObject.optJSONObject("download_conf");
        if (jSONObjectOptJSONObject21 != null) {
            asVar.hnj(ojm(jSONObjectOptJSONObject21));
        }
        asVar.hnj(dnm(jSONObject.optJSONObject("media_ext")));
        JSONObject jSONObjectOptJSONObject22 = jSONObject.optJSONObject("tpl_info");
        if (jSONObjectOptJSONObject22 != null) {
            com.bytedance.sdk.openadsdk.core.model.as.hnj hnjVar4 = new com.bytedance.sdk.openadsdk.core.model.as.hnj();
            hnjVar4.qor(jSONObjectOptJSONObject22.optString("id"));
            hnjVar4.gjv(jSONObjectOptJSONObject22.optString("md5"));
            hnjVar4.sk(jSONObjectOptJSONObject22.optString("url"));
            hnjVar4.dkl(jSONObjectOptJSONObject22.optString(DataSchemeDataSource.SCHEME_DATA));
            hnjVar4.dse(jSONObjectOptJSONObject22.optString("diff_data"));
            String strOptString = jSONObjectOptJSONObject22.optString("dynamic_creative");
            hnjVar4.aq(strOptString);
            hnjVar4.hn(jSONObjectOptJSONObject22.optString("version"));
            hnjVar4.ojm(jSONObjectOptJSONObject22.optString("media_view"));
            try {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject2 = new JSONObject(strOptString);
                JSONArray jSONArrayOptJSONArray6 = jSONObject2.optJSONArray("tag_ids");
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i17 = 0; i17 < jSONArrayOptJSONArray6.length(); i17++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray6.optInt(i17)));
                    }
                }
                String strOptString2 = jSONObject2.optString("music_url");
                hnjVar4.hnj(arrayList);
                hnjVar4.hnj(strOptString2);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.apu.qor("TTAD.AdInfoFactory", e10.getMessage());
            }
            hnjVar4.ta(jSONObjectOptJSONObject22.optString("engine_version"));
            hnjVar4.dnm(jSONObjectOptJSONObject22.optString("ugen_url"));
            hnjVar4.bug(jSONObjectOptJSONObject22.optString("ugen_md5"));
            hnjVar4.orl(jSONObjectOptJSONObject22.optString("ugen_data"));
            asVar.hnj(hnjVar4);
        }
        JSONObject jSONObjectOptJSONObject23 = jSONObject.optJSONObject("tpl_info_v3");
        if (jSONObjectOptJSONObject23 != null) {
            asVar.hnj(com.bytedance.sdk.openadsdk.core.model.gm.hnj(jSONObjectOptJSONObject23));
        }
        JSONObject jSONObjectOptJSONObject24 = jSONObject.optJSONObject("dynamic_creative");
        if (jSONObjectOptJSONObject24 != null) {
            asVar.hn(jSONObjectOptJSONObject24);
        }
        asVar.fc(jSONObject.optString("creative_extra"));
        asVar.jip(jSONObject.optInt("if_block_lp", 0));
        asVar.tu(jSONObject.optInt("cache_sort", 1));
        asVar.tgn(jSONObject.optInt("if_sp_cache", 0));
        JSONObject jSONObjectOptJSONObject25 = jSONObject.optJSONObject("splash_control");
        if (jSONObjectOptJSONObject25 != null) {
            asVar.hnj(qor(jSONObjectOptJSONObject25));
        }
        asVar.sq(jSONObject.optInt("is_package_open", 1));
        asVar.orl(jSONObject.optString("ad_info", null));
        asVar.vf(jSONObject.optInt("ua_policy", 2));
        asVar.jbd(jSONObject.optInt("playable_duration_time", 30));
        asVar.ff(jSONObject.optInt("playable_close_time", -1));
        asVar.xad(jSONObject.optInt("playable_endcard_close_time", -1));
        asVar.cm(jSONObject.optInt("endcard_close_time", -1));
        asVar.ta(jSONObject.optInt("interaction_method"));
        asVar.dnm(jSONObject.optInt("top_area_leave_blank", 0));
        asVar.ka(jSONObject.optInt("lp_click_type", -1));
        asVar.sk(jSONObject.optInt("lp_click_interval", -1));
        asVar.hqh(jSONObject.optString("dsp_html"));
        asVar.ojm(jSONObject.optInt("image_stay", 0));
        int iOptInt2 = jSONObject.optInt("dsp_material_type", 0);
        if (iOptInt2 < 0 || iOptInt2 > 3) {
            iOptInt2 = 0;
        }
        if (iOptInt2 == 0) {
            if (jSONObject.optBoolean("is_vast", false)) {
                iOptInt2 = 1;
            }
            i11 = jSONObject.optBoolean("is_html", false) ? 2 : iOptInt2;
        }
        asVar.zt(i11);
        if (i11 == 1 || i11 == 3) {
            int iXf = asVar.xf();
            if (iXf < 0) {
                if (asVar.aip() != null) {
                    iXf = asVar.aip().getDurationSlotType();
                } else {
                    iXf = asVar.iz();
                }
            }
            String strQor = com.bytedance.sdk.openadsdk.utils.orp.qor(iXf);
            if (jSONObject.has("vast_json")) {
                hnjVarHnj = com.bytedance.sdk.openadsdk.core.orl.hnj.hnj(jSONObject.optJSONObject("vast_json"));
                str = "";
            } else {
                String strOptString3 = jSONObject.optString("dsp_vast");
                if (TextUtils.isEmpty(strOptString3)) {
                    hnj(asVar, strQor);
                    return null;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Pair<com.bytedance.sdk.openadsdk.core.orl.hnj, com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj> pairHnj = hnj(strOptString3, asVar.zf(), iXf);
                if (pairHnj != null) {
                    hnjVar2 = (com.bytedance.sdk.openadsdk.core.orl.hnj) pairHnj.first;
                    str = "";
                    hnjVar3 = (com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj) pairHnj.second;
                } else {
                    str = "";
                    hnjVar2 = null;
                    hnjVar3 = null;
                }
                com.bytedance.sdk.openadsdk.core.orl.qor.gjv.hn(asVar, strQor, hnjVar2, jElapsedRealtime, hnjVar3);
                hnjVarHnj = hnjVar2;
            }
            if (hnjVarHnj == null) {
                return null;
            }
            hnj(hnjVarHnj, asVar);
        } else {
            str = "";
        }
        asVar.nyv(jSONObject.optString("deep_link_appname", str));
        asVar.eta(jSONObject.optInt("landing_page_download_clicktype", 1));
        JSONObject jSONObjectOptJSONObject26 = jSONObject.optJSONObject("dsp_style");
        if (jSONObjectOptJSONObject26 != null) {
            asVar.hnj(new com.bytedance.sdk.openadsdk.core.model.fc(jSONObjectOptJSONObject26));
        }
        JSONObject jSONObjectOptJSONObject27 = jSONObject.optJSONObject("dsp_adchoices");
        if (jSONObjectOptJSONObject27 != null) {
            asVar.dse(jSONObjectOptJSONObject27.optString("adchoices_icon", str));
            asVar.aq(jSONObjectOptJSONObject27.optString("adchoices_url", str));
        }
        String strOptString4 = jSONObject.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(strOptString4)) {
            asVar.ojm(strOptString4);
        }
        asVar.eta();
        JSONObject jSONObjectOptJSONObject28 = jSONObject.optJSONObject("ugen");
        if (jSONObjectOptJSONObject28 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject28.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) != null) {
            asVar.hnj(hn(jSONObjectOptJSONObject));
            JSONObject jSONObjectOptJSONObject29 = jSONObjectOptJSONObject.optJSONObject("overlay");
            if (jSONObjectOptJSONObject29 != null) {
                asVar.hn(hn(jSONObjectOptJSONObject29));
            }
        }
        asVar.dse(jSONObject.optInt("preload_h5_type", 0));
        asVar.ta(jSONObject.optBoolean("hasReportShow", false));
        asVar.dnm(jSONObject.optString("endcard_creative", str));
        asVar.dse(jSONObject.optJSONObject("ad_label"));
        JSONObject jSONObjectOptJSONObject30 = jSONObject.optJSONObject("ev");
        if (jSONObjectOptJSONObject30 != null) {
            asVar.oj(jSONObjectOptJSONObject30.optBoolean("enable", com.bytedance.sdk.openadsdk.p000do.hnj.qor.hnj));
            asVar.izk(jSONObjectOptJSONObject30.optInt("wait_time", com.bytedance.sdk.openadsdk.p000do.hnj.qor.f14332hn));
            asVar.ua(jSONObjectOptJSONObject30.optString("label", com.bytedance.sdk.openadsdk.p000do.hnj.qor.qor));
            asVar.hnj(new com.bytedance.sdk.openadsdk.p000do.hnj.hn(asVar));
        }
        JSONArray jSONArrayOptJSONArray7 = jSONObject.optJSONArray("ad_tracks");
        if (jSONArrayOptJSONArray7 != null && jSONArrayOptJSONArray7.length() > 0) {
            com.bytedance.sdk.openadsdk.core.model.sk skVar = new com.bytedance.sdk.openadsdk.core.model.sk(jSONArrayOptJSONArray7);
            if (skVar.qor()) {
                asVar.hnj(skVar);
            }
        }
        JSONObject jSONObjectOptJSONObject31 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject31 != null) {
            asVar.hnj(new Cdo(jSONObjectOptJSONObject31));
        }
        JSONArray jSONArrayOptJSONArray8 = jSONObject.optJSONArray("app_log_url_backup");
        if (jSONArrayOptJSONArray8 != null && jSONArrayOptJSONArray8.length() > 0) {
            for (int i18 = 0; i18 < jSONArrayOptJSONArray8.length(); i18++) {
                String strOptString5 = jSONArrayOptJSONArray8.optString(i18);
                if (!TextUtils.isEmpty(strOptString5)) {
                    asVar.fvt(strOptString5);
                }
            }
        }
        return asVar;
    }

    private static void hnj(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("iv_skip_time", -1);
            int iOptInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (iOptInt != -1) {
                asVar.mkl(iOptInt);
            }
            if (iOptInt2 != -1) {
                asVar.lhi(iOptInt2);
            }
        }
    }

    private static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.orl.hnj, com.bytedance.sdk.openadsdk.core.orl.hnj.hn.hnj> hnj(String str, int i10, int i11) {
        int iQor;
        int iSk;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i11 == 1 || i11 == 5) {
            iQor = 0;
            iSk = 0;
        } else {
            iQor = com.bytedance.sdk.openadsdk.utils.sq.qor(oj.hnj());
            iSk = com.bytedance.sdk.openadsdk.utils.sq.sk(oj.hnj());
            if (i10 == 2) {
                iSk = iQor;
                iQor = iSk;
            }
        }
        com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.orl.hnj.hnj.sk(oj.hnj(), iQor, iSk);
        return new Pair<>(skVar.hnj(str, (File) null, new ArrayList()), skVar.dkl);
    }

    private static void hnj(com.bytedance.sdk.openadsdk.core.orl.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        hnjVar.hnj(asVar);
        if (!hnj(asVar.rg())) {
            asVar.nyv(2);
        }
        asVar.fc(1);
        asVar.hnj(hnjVar);
        if (!TextUtils.isEmpty(hnjVar.gjv())) {
            asVar.apu(hnjVar.gjv());
        }
        if (!TextUtils.isEmpty(hnjVar.sk())) {
            asVar.eum(hnjVar.sk());
        }
        asVar.oj(hnjVar.dkl());
        asVar.hnj((com.bytedance.sdk.openadsdk.core.model.dkl) null);
        a aVarPwt = asVar.pwt();
        if (aVarPwt == null) {
            aVarPwt = new a();
        }
        aVarPwt.F(hnjVar.dse());
        aVarPwt.t(hnjVar.aq());
        aVarPwt.g(null);
        aVarPwt.r(null);
        aVarPwt.o(null);
        asVar.hnj(aVarPwt);
        if (hnjVar.hn() != null && !TextUtils.isEmpty(hnjVar.hn().gjv())) {
            com.bytedance.sdk.openadsdk.core.model.oj ojVar = new com.bytedance.sdk.openadsdk.core.model.oj();
            ojVar.hnj(hnjVar.hn().gjv());
            ojVar.hnj(hnjVar.hn().hnj());
            ojVar.hn(hnjVar.hn().hn());
            asVar.hnj(ojVar);
            return;
        }
        if (asVar.mn() == null) {
            com.bytedance.sdk.openadsdk.core.model.oj ojVar2 = new com.bytedance.sdk.openadsdk.core.model.oj();
            ojVar2.hnj("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            ojVar2.hnj(98);
            ojVar2.hn(98);
            asVar.hnj(ojVar2);
        }
    }

    public static AdSlot hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("mCodeId", "");
        int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float fOptDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float fOptDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
        int iOptInt3 = jSONObject.optInt("mAdCount", 6);
        boolean zOptBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String strOptString2 = jSONObject.optString("mRewardName", "");
        int iOptInt4 = jSONObject.optInt("mRewardAmount", 0);
        String strOptString3 = jSONObject.optString("mMediaExtra", "");
        String strOptString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int iOptInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean zOptBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean zOptBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String strOptString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt, iOptInt2).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt3).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt4).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt5).setIsAutoPlay(zOptBoolean2).isExpressAd(zOptBoolean3).withBid(strOptString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static a hnj(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.as asVar, boolean z10) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.q(jSONObject.optInt("cover_height"));
        aVar.E(jSONObject.optInt("cover_width"));
        aVar.w(jSONObject.optString("resolution"));
        aVar.v(jSONObject.optLong("size"));
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        aVar.t(dOptDouble);
        int i10 = 1;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && asVar.th() != 1 && com.bytedance.sdk.openadsdk.core.model.as.sk(asVar)) {
            i10 = iOptInt2;
        }
        aVar.K(i10);
        aVar.r(jSONObject.optString("cover_url"));
        aVar.F(jSONObject.optString(CampaignEx.JSON_KEY_VIDEO_URL));
        aVar.o(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        aVar.I(jSONObject.optString("playable_download_url"));
        aVar.g(jSONObject.optString("file_hash"));
        aVar.c(jSONObject.optInt("if_playable_loading_show", 0));
        aVar.B(jSONObject.optInt("remove_loading_page_type", 0));
        aVar.u(jSONObject.optInt("fallback_endcard_judge", 0));
        aVar.H(jSONObject.optInt("video_preload_size", 307200));
        aVar.f(jSONObject.optInt("reward_video_cached_type", 0));
        aVar.j(jSONObject.optInt("execute_cached_type", 0));
        String str = vHmGJpUTWNVV.zIAUbaIBgKOBIDE;
        if (z10) {
            iOptInt = jSONObject.optInt(str, 0);
        } else {
            iOptInt = jSONObject.optInt(str, -1);
        }
        aVar.n(iOptInt);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    private static int hnj(com.bytedance.sdk.openadsdk.core.model.as asVar) {
        int iHnj;
        int iHnj2;
        if (asVar == null) {
            com.bytedance.sdk.openadsdk.gjv.qor.qor((com.bytedance.sdk.openadsdk.core.model.as) null, "", 401);
            return 401;
        }
        String strQor = com.bytedance.sdk.openadsdk.utils.orp.qor(asVar.xf());
        if (!TextUtils.isEmpty(asVar.sp()) && asVar.sp().length() > 1) {
            if (asVar.ux()) {
                if (asVar.xf() < 0) {
                    if (asVar.aip() != null) {
                        asVar.aip().getDurationSlotType();
                    } else {
                        asVar.iz();
                    }
                }
                if (asVar.ouk()) {
                    strQor = "fullscreen_interstitial_ad";
                }
                if (TextUtils.isEmpty(asVar.cbn())) {
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, strQor, "load_html_fail", (JSONObject) null);
                    return 401;
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, strQor, "load_html_success", (JSONObject) null);
            }
            if (asVar.vz() == 0) {
                int iQri = asVar.qri();
                if (iQri == 2 || iQri == 3 || iQri == 4) {
                    iHnj = hnj(asVar.lx());
                    if (iHnj != 200) {
                        com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, iHnj);
                        return iHnj;
                    }
                } else if (iQri == 5 || iQri == 15) {
                    iHnj2 = hnj(asVar.pwt(), asVar.qs());
                    if (iHnj2 != 200) {
                        com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, iHnj2);
                        return iHnj2;
                    }
                } else if (iQri == 16) {
                    iHnj = hnj(asVar.lx());
                    if (iHnj != 200) {
                        com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, iHnj);
                        return iHnj;
                    }
                } else if (iQri == 50) {
                    iHnj2 = hnj(asVar.pwt(), asVar.qs());
                    if (iHnj2 != 200) {
                        com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, iHnj2);
                        return iHnj2;
                    }
                }
            }
            if (com.bytedance.sdk.openadsdk.core.settings.dnm.hn().as()) {
                return qor(asVar);
            }
            return hn(asVar);
        }
        com.bytedance.sdk.openadsdk.gjv.qor.qor(asVar, strQor, TTAdConstant.AD_ID_IS_NULL_CODE);
        return TTAdConstant.AD_ID_IS_NULL_CODE;
    }

    private static int hnj(com.bytedance.sdk.openadsdk.core.model.orl orlVar) {
        if (orlVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(orlVar.hnj())) {
            return 403;
        }
        if (TextUtils.isEmpty(orlVar.hn())) {
            return 404;
        }
        return (orlVar.qor() == 1 || orlVar.qor() == 2) ? 200 : 405;
    }

    private static int hnj(a aVar, boolean z10) {
        if (aVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(aVar.h())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z10 || !TextUtils.isEmpty(aVar.J())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int hnj(com.bytedance.sdk.openadsdk.core.model.dkl dklVar) {
        if (dklVar == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(dklVar.hnj())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        if (TextUtils.isEmpty(dklVar.qor())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int hnj(List<com.bytedance.sdk.openadsdk.core.model.oj> list) {
        if (list == null) {
            return 409;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.oj ojVar : list) {
            if (ojVar == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(ojVar.hnj())) {
                return 412;
            }
        }
        return 200;
    }

    private static void hnj(final ArrayList<hnj> arrayList) {
        com.bytedance.sdk.openadsdk.jip.gjv.hnj("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.hn.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    hnj hnjVar = (hnj) obj;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(BidResponsedEx.KEY_CID, hnjVar.hnj);
                    jSONObject2.put("error_msg", hnjVar.f13768hn);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("multiple_ads_parsing_error").hn(jSONObject.toString());
            }
        });
    }
}
