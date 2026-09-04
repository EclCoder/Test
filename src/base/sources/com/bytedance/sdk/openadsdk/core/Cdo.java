package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w6.b;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class Cdo implements as<com.bytedance.sdk.openadsdk.gjv.hnj> {
    private final Context hnj;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.do$hn */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hn {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final boolean f13719hn;
        public final int hnj;
        public final com.bytedance.sdk.openadsdk.core.model.ul qor;

        private hn(int i10, boolean z10, com.bytedance.sdk.openadsdk.core.model.ul ulVar) {
            this.hnj = i10;
            this.f13719hn = z10;
            this.qor = ulVar;
        }

        public static hn hnj(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            com.bytedance.sdk.openadsdk.core.model.ul ulVar = new com.bytedance.sdk.openadsdk.core.model.ul();
            if (jSONObjectOptJSONObject != null) {
                try {
                    ulVar.hnj(jSONObjectOptJSONObject.optInt("reason"));
                    ulVar.hn(jSONObjectOptJSONObject.optInt("corp_type"));
                    ulVar.qor(jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    ulVar.hnj(jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", th2.getMessage());
                }
            }
            return new hn(iOptInt, zOptBoolean, ulVar);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.do$hnj */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hnj {
        public final com.bytedance.sdk.openadsdk.core.model.hnj aq;
        final int dkl;
        final String dse;
        final int gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        final long f13720hn;
        final int hnj;
        final String ojm;
        final long qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        final String f13721sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        final ArrayList<Integer> f13722ta;

        private hnj(String str, int i10, int i11, String str2, int i12, String str3, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, long j10, long j11, ArrayList<Integer> arrayList) {
            this.hnj = i10;
            this.gjv = i11;
            this.f13721sk = str2;
            this.dse = str3;
            this.aq = hnjVar;
            this.ojm = str;
            this.dkl = i12;
            this.f13720hn = j10;
            this.qor = j11;
            this.f13722ta = arrayList;
        }

        public static hnj hnj(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.hnj, ArrayList<Integer>> pairHnj = com.bytedance.sdk.openadsdk.core.hn.hnj(jSONObject, adSlot, xyoVar);
            return pairHnj == null ? new hnj(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new hnj(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.hnj) pairHnj.first, jOptLong, jOptLong2, (ArrayList) pairHnj.second);
        }
    }

    Cdo(Context context) {
        this.hnj = context;
    }

    private boolean dkl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    @DungeonFlag
    private void dse(JSONObject jSONObject) {
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, com.bytedance.sdk.openadsdk.utils.orp.dkl());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.orp.dse());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.orp.aq());
        } catch (Exception unused) {
        }
    }

    private boolean gjv(String str) {
        if (com.bytedance.sdk.openadsdk.core.aq.hn.hnj()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.aq.hn.hnj(str)) {
            return false;
        }
        String strHn = com.bytedance.sdk.openadsdk.core.aq.hn.hn();
        if (!TextUtils.isEmpty(strHn)) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(strHn, System.currentTimeMillis());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, final int i10, final as.hnj hnjVar) {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVar2;
        if (!com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dkl()) {
            hnjVar.hnj(40060, ojm.hnj(40060));
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().gjv()) {
            hnjVar.hnj(10007, ojm.hnj(10007));
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.ta.hn.hnj().ojm()) {
            hnjVar.hnj(10008, ojm.hnj(10008));
            return;
        }
        boolean zQor = com.bytedance.sdk.openadsdk.as.sk.qor();
        final com.bytedance.sdk.openadsdk.core.model.qor qorVar = new com.bytedance.sdk.openadsdk.core.model.qor();
        qorVar.hnj(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.dse.hnj()) {
            if (hnjVar != null) {
                hnjVar.hnj(1000, "Ad request is temporarily paused, Please contact your AM");
                qorVar.hnj(1000);
                com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
                return;
            }
            return;
        }
        if (!oj.gjv().rmr()) {
            if (hnjVar != null) {
                hnjVar.hnj(-16, ojm.hnj(-16));
                qorVar.hnj(1001);
                com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
                return;
            }
            return;
        }
        if (hnjVar == null) {
            return;
        }
        if (gjv(adSlot.getCodeId())) {
            hnjVar.hnj(-8, ojm.hnj(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !xyoVar.dkl) {
            qorVar.hn(2);
            qorVar.hnj(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.fc.qor()) {
                b.a(adSlot.getBidAdm());
            }
            if (oj.gjv().izk() && gm.hnj().gjv() == 1) {
                com.bytedance.sdk.openadsdk.utils.orp.hnj("Pangle_Debug_Mode", adSlot.getBidAdm(), this.hnj);
            }
            try {
                JSONObject jSONObjectHnj = hnj(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectHnj == null) {
                    qorVar.qor(12);
                    hnj(hnjVar, qorVar);
                    return;
                }
                hnj hnjVarHnj = hnj.hnj(jSONObjectHnj, adSlot, xyoVar);
                qorVar.hnj(hnjVarHnj.f13722ta);
                orl.hnj(hnjVarHnj.ojm);
                int i11 = hnjVarHnj.gjv;
                if (i11 != 20000) {
                    hnjVar.hnj(i11, hnjVarHnj.f13721sk);
                    qorVar.hnj(hnjVarHnj.gjv);
                    qorVar.qor(9);
                    com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.hnj hnjVar3 = hnjVarHnj.aq;
                if (hnjVar3 == null) {
                    qorVar.qor(13);
                    hnj(hnjVar, qorVar);
                    return;
                }
                if (hnjVar3.gjv() != null && !hnjVarHnj.aq.gjv().isEmpty()) {
                    com.bytedance.sdk.openadsdk.jip.gjv.hnj(hnjVarHnj.aq.gjv().get(0));
                }
                hnj(hnjVarHnj.aq);
                if (hnj(hnjVarHnj.aq, hnjVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.orl.qor.gjv.hnj(hnjVarHnj.aq);
                hnjVar.hnj(hnjVarHnj.aq, qorVar);
                Map<String, com.bytedance.sdk.openadsdk.core.model.as> mapHnj = com.bytedance.sdk.openadsdk.core.model.hnj.hnj(hnjVarHnj.aq);
                if (mapHnj != null) {
                    com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(mapHnj);
                }
                hnj(hnjVarHnj.aq, i10);
                com.bytedance.sdk.openadsdk.core.sk.hnj.hnj().hnj(hnjVarHnj.aq);
                return;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.hnj("NetApiImpl", "get ad error: ", th2);
                qorVar.qor(14);
                qorVar.hn(th2.getMessage());
                hnj(hnjVar, qorVar);
                return;
            }
        }
        if (xyoVar != null && !TextUtils.isEmpty(xyoVar.bug)) {
            try {
                JSONObject jSONObjectHnj2 = hnj(new JSONObject(xyoVar.bug));
                if (jSONObjectHnj2 != null) {
                    hnj hnjVarHnj2 = hnj.hnj(jSONObjectHnj2, adSlot, xyoVar);
                    eum eumVar = xyoVar.orl;
                    if (eumVar != null && (hnjVar2 = hnjVarHnj2.aq) != null && eumVar.hnj(hnjVar2)) {
                        com.bytedance.sdk.openadsdk.core.orl.qor.gjv.hnj(hnjVar2);
                        hnjVar.hnj(hnjVar2, qorVar);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectHnj3 = hnj(adSlot, xyoVar, i10);
        if (jSONObjectHnj3 == null) {
            hnjVar.hnj(-9, ojm.hnj(-9));
            qorVar.hnj(-9);
            com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
            return;
        }
        if (oj.gjv().izk() && gm.hnj().gjv() == 1) {
            com.bytedance.sdk.openadsdk.utils.orp.hnj("Pangle_Debug_Mode", jSONObjectHnj3.toString(), this.hnj);
        }
        String strHnj = com.bytedance.sdk.openadsdk.utils.orp.hnj("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
        List<String> listHnj = null;
        try {
            gjvVarHn.qor(com.bytedance.sdk.openadsdk.ojm.gjv.hnj(gjvVarHn, strHnj));
            if (com.bytedance.sdk.openadsdk.utils.hn.hnj()) {
                listHnj = com.bytedance.sdk.openadsdk.utils.orp.hnj("/api/ad/union/sdk/get_ads/", true);
                if (!listHnj.isEmpty()) {
                    gjvVarHn.hnj(listHnj);
                    gjvVarHn.hnj(60L, TimeUnit.SECONDS);
                }
            }
        } catch (Exception unused2) {
        }
        gjvVarHn.hnj(jSONObjectHnj3.toString(), oj.gjv().uua());
        Map<String, String> mapHnj2 = com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(strHnj, jSONObjectHnj3.toString());
        if (mapHnj2 != null && mapHnj2.size() > 0) {
            for (String str : mapHnj2.keySet()) {
                try {
                    gjvVarHn.hn(str, mapHnj2.get(str));
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e10.getMessage());
                }
            }
        }
        try {
            gjvVarHn.hn(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.orp.gjv());
            hnj(gjvVarHn, jSONObjectHnj3);
        } catch (Exception unused3) {
        }
        final com.bytedance.sdk.openadsdk.utils.fvt fvtVarHn = com.bytedance.sdk.openadsdk.utils.fvt.hn();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z10 = ta.hn().fc() && requestExtraMap != null;
        if (z10) {
            requestExtraMap.put("pgad_start", fvtVarHn);
        }
        gjvVarHn.hnj(10);
        gjvVarHn.hn("get_ad");
        com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.8
            @Override // com.bytedance.sdk.openadsdk.oj.gjv
            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar4 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                hnjVar4.hn("get_ad");
                hnjVar4.qor(adSlot.getCodeId());
                hnjVar4.gjv(com.bytedance.sdk.openadsdk.utils.orp.qor(adSlot.getDurationSlotType()));
                return hnjVar4;
            }
        });
        if (com.bytedance.sdk.component.utils.fc.qor()) {
            Thread.currentThread().getName();
        }
        if (zQor) {
            List<String> list = listHnj;
            try {
                com.bytedance.sdk.component.dse.hn hnVarHnj = gjvVarHn.hnj();
                com.bytedance.sdk.component.dse.hn hnVar = hnVarHnj == null ? new com.bytedance.sdk.component.dse.hn(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L) : hnVarHnj;
                if (hnVar.dkl()) {
                    boolean z11 = z10;
                    try {
                        hnj(gjvVarHn, hnVar, z11, requestExtraMap, fvtVarHn, adSlot, qorVar, hnjVar, xyoVar, i10, list);
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = z11;
                        requestExtraMap = requestExtraMap;
                        qorVar = qorVar;
                        list = list;
                        hnj(gjvVarHn, new IOException(th.getMessage()), new com.bytedance.sdk.component.dse.hn(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z10, requestExtraMap, hnjVar, qorVar, list);
                    }
                } else {
                    hnj(gjvVarHn, new IOException(hnVar.hn()), hnVar, adSlot, z10, requestExtraMap, hnjVar, qorVar, list);
                    com.bytedance.sdk.openadsdk.utils.wu.hnj(gjvVarHn.sk());
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            final boolean z12 = z10;
            final List<String> list2 = listHnj;
            gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hn() { // from class: com.bytedance.sdk.openadsdk.core.do.9
                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar2, com.bytedance.sdk.component.dse.hn hnVar2) {
                    Cdo.this.hnj(qorVar2, hnVar2, z12, requestExtraMap, fvtVarHn, adSlot, qorVar, hnjVar, xyoVar, i10, list2);
                }

                @Override // com.bytedance.sdk.component.dse.hnj.hn
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar2, IOException iOException, com.bytedance.sdk.component.dse.hn hnVar2) {
                    Cdo.this.hnj(gjvVarHn, iOException, hnVar2, adSlot, z12, requestExtraMap, hnjVar, qorVar, list2);
                    if (qorVar2 != null) {
                        com.bytedance.sdk.openadsdk.utils.wu.hnj(qorVar2.sk());
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(false);
    }

    private boolean qor(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    private Map<String, String> sk(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json; charset=utf-8");
        if (qor(jSONObject)) {
            map.put("Content-Encoding", "union_sdk_encode");
        }
        return map;
    }

    public static JSONArray qor(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.bug.hnj.hnj> setHnj = com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj(str);
            if (setHnj != null && setHnj.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.bug.hnj.hnj hnjVar : setHnj) {
                    if (hnjVar != null && !TextUtils.isEmpty(hnjVar.sk())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = hnjVar.hnj().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", hnjVar.hn());
                            jSONArray.put(jSONObject);
                        } else {
                            continue;
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.hnj("NetApiImpl", "getUgenParentTplIds: ", e10);
            return null;
        }
    }

    @DungeonFlag
    private JSONObject hnj(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, int i10) {
        int i11;
        int i12;
        int i13;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strSk = (xyoVar == null || TextUtils.isEmpty(xyoVar.hnj)) ? com.bytedance.sdk.openadsdk.utils.orp.sk() : xyoVar.hnj;
            if (i10 == 7) {
                if (xyoVar != null && (i13 = xyoVar.f14017hn) > 0) {
                    jSONObject2.put("req_type", i13);
                }
            } else if (i10 == 8) {
                if (xyoVar != null && (i12 = xyoVar.qor) > 0) {
                    jSONObject2.put("req_type", i12);
                }
            } else if (i10 == 3 && xyoVar != null && (i11 = xyoVar.gjv) > 0) {
                jSONObject2.put("req_type", i11);
            }
            try {
                String strTa = oj.gjv().ta();
                String strHqh = oj.gjv().hqh();
                if (strTa != null && strHqh != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strTa);
                    jSONObject3.put("param", strHqh);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("request_id", strSk);
            com.bytedance.sdk.openadsdk.utils.orp.hnj(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("js_render_ver", com.bytedance.sdk.openadsdk.core.ojm.bug.qor());
            jSONObject2.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.ojm.bug.gjv());
            jSONObject2.put("source_type", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, hn());
            jSONObject2.put("device", DeviceUtils.hnj(this.hnj, true));
            jSONObject2.put("user", hnj(adSlot));
            jSONObject2.put("ua", com.bytedance.sdk.openadsdk.utils.orp.gjv());
            jSONObject2.put("channel", "main");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(hnj(adSlot, i10, xyoVar));
            jSONObject2.put("adslots", jSONArray);
            hnj(jSONObject2, xyoVar);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strSk != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strSk);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.sk.hnj(strConcat));
            if (com.bytedance.sdk.openadsdk.core.dnm.qor.sk() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.dnm.qor.sk()));
            }
            jSONObject2.put("adx_id", ta.hn().wu());
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj(jSONObject2);
            jSONObject = hnj(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("body data exception", th2);
        }
        return jSONObject;
    }

    private byte[] sk(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(str.getBytes("utf-8"));
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException e10) {
                            com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e10.toString());
                        }
                    } catch (IOException e11) {
                        e = e11;
                        gZIPOutputStream = gZIPOutputStream2;
                        com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e.toString());
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e12) {
                                com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e12.toString());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        return byteArray;
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e13) {
                                com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e13.toString());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e14) {
                                com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e14.toString());
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IOException e15) {
                    e = e15;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e16) {
            e = e16;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e17) {
            com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e17.toString());
        }
        return byteArray;
    }

    private void gjv(JSONObject jSONObject) {
        byte[] bArr;
        Object obj;
        if (ta.hn().jip()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", "reportETEvent error", e10.getMessage());
            }
            com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
            gjvVarHn.qor(com.bytedance.sdk.openadsdk.utils.orp.eum());
            Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(sk(jSONObject.toString()));
            if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                bArr = (byte[]) obj;
                tgn.hn(true);
            } else {
                int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                tgn.hn(false);
                tgn.hnj(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                bArr = null;
            }
            if (bArr != null) {
                gjvVarHn.hn("Content-Encoding", "union_sdk_encode");
                gjvVarHn.hn("x-pgli18n", "4");
                gjvVarHn.hnj("application/octet-stream;tt-data=a", bArr);
            }
            if (bArr == null) {
                JSONObject jSONObjectHnj = com.bytedance.sdk.component.utils.hnj.hnj(jSONObject);
                if (qor(jSONObjectHnj)) {
                    jSONObject = jSONObjectHnj;
                }
                hnj(sk(jSONObject), gjvVarHn);
                gjvVarHn.hnj(jSONObject.toString(), oj.gjv().uua());
            }
            gjvVarHn.hnj(7);
            gjvVarHn.hn("et_applog");
            gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.do.15
                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                    if (hnVar == null || !hnVar.dkl()) {
                        return;
                    }
                    hnVar.gjv();
                }

                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    private void hnj(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar) {
        JSONArray jSONArray;
        if (xyoVar == null || (jSONArray = xyoVar.f14018sk) == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    public void hnj(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, int i10, eum eumVar) {
        if (!xyoVar.dkl && TextUtils.isEmpty(adSlot.getBidAdm())) {
            if (!hnj(xyoVar) && eumVar != null) {
                String strHnj = eumVar.hnj();
                if (!TextUtils.isEmpty(strHnj)) {
                    xyoVar.bug = strHnj;
                    xyoVar.orl = eumVar;
                }
            }
            hnj(adSlot, xyoVar, i10, (as.hnj) eumVar);
            return;
        }
        hnj(adSlot, xyoVar, i10, (as.hnj) eumVar);
    }

    private boolean hnj(com.bytedance.sdk.openadsdk.core.model.xyo xyoVar) {
        if (xyoVar != null) {
            return xyoVar.f14017hn == 2 || xyoVar.qor == 2 || xyoVar.gjv == 2;
        }
        return false;
    }

    public void hnj(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, final int i10, as.hnj hnjVar) {
        if (xyoVar != null && (xyoVar.f14017hn == 2 || xyoVar.qor == 2 || xyoVar.gjv == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.hn.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.core.hn.hnj(hnjVar, adSlot, (adSlot.isPreload() || xyoVar == null || xyoVar.dkl) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fc.hn().post(new com.bytedance.sdk.component.aq.hn.qor("getAd") { // from class: com.bytedance.sdk.openadsdk.core.do.1
                @Override // java.lang.Runnable
                public void run() {
                    Cdo.this.hn(adSlot, xyoVar, i10, hnjVar2);
                }
            });
        } else {
            hn(adSlot, xyoVar, i10, hnjVar2);
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        com.bytedance.sdk.openadsdk.core.model.as asVarDkl;
        if (hnjVar == null || (asVarDkl = hnjVar.dkl()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.dnm.hqh(asVarDkl.cvc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.component.dse.hn.gjv gjvVar, IOException iOException, com.bytedance.sdk.component.dse.hn hnVar, final AdSlot adSlot, boolean z10, Map<String, Object> map, as.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar, List<String> list) {
        String message;
        int iHnj;
        com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.10
            @Override // com.bytedance.sdk.openadsdk.oj.gjv
            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar2 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                hnjVar2.hn("get_ad");
                hnjVar2.qor(adSlot.getCodeId());
                hnjVar2.gjv(com.bytedance.sdk.openadsdk.utils.orp.qor(adSlot.getDurationSlotType()));
                hnjVar2.hnj(BuildConfig.VERSION_NAME);
                return hnjVar2;
            }
        });
        if (hnVar != null) {
            message = hnVar.hn();
        } else if (iOException != null) {
            message = iOException.getMessage();
        } else {
            message = "";
        }
        String str = message;
        com.bytedance.sdk.openadsdk.utils.fvt fvtVarHn = com.bytedance.sdk.openadsdk.utils.fvt.hn();
        if (z10) {
            map.put("pgad_end", Long.valueOf(fvtVarHn.hnj));
        }
        if (oj.gjv().izk() && gm.hnj().gjv() == 1) {
            com.bytedance.sdk.openadsdk.utils.orp.hnj("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.hnj);
        }
        if (hnVar != null) {
            iHnj = hnVar.hnj();
        } else {
            iHnj = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? Sdk$SDKError.b.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE : 602;
        }
        int i10 = iHnj;
        if (hnjVar != null) {
            hnjVar.hnj(i10, str);
        }
        qorVar.hnj(i10);
        qorVar.qor(10);
        qorVar.hn(str);
        com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
        com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("get_ad", gjvVar.sk(), i10, str, gjvVar.qor(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar, boolean z10, Map<String, Object> map, com.bytedance.sdk.openadsdk.utils.fvt fvtVar, final AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qor qorVar2, as.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, int i10, List<String> list) {
        JSONObject jSONObject;
        com.bytedance.sdk.openadsdk.core.model.pty ptyVar;
        com.bytedance.sdk.openadsdk.core.model.qor qorVar3 = qorVar2;
        as.hnj hnjVar2 = hnjVar;
        if (z10) {
            map.put("pgad_end", fvtVar);
        }
        if (hnVar == null) {
            return;
        }
        if (hnVar.dkl()) {
            com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.11
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar3.hn("get_ad");
                    hnjVar3.qor(adSlot.getCodeId());
                    hnjVar3.gjv(com.bytedance.sdk.openadsdk.utils.orp.qor(adSlot.getDurationSlotType()));
                    hnjVar3.hnj(BuildConfig.VERSION_NAME);
                    return hnjVar3;
                }
            });
            try {
                com.bytedance.sdk.openadsdk.utils.fvt fvtVarHn = com.bytedance.sdk.openadsdk.utils.fvt.hn();
                String strGjv = hnVar.gjv();
                qorVar3.hnj(strGjv);
                JSONObject jSONObject2 = new JSONObject(strGjv);
                if (oj.gjv().izk() && gm.hnj().gjv() == 1) {
                    com.bytedance.sdk.openadsdk.utils.orp.hnj("Pangle_Debug_Mode", jSONObject2.toString(), this.hnj);
                }
                JSONObject jSONObjectHnj = hnj(jSONObject2);
                if (jSONObjectHnj == null) {
                    qorVar3.qor(12);
                    hnj(hnjVar2, qorVar3);
                    return;
                }
                hnj hnjVarHnj = hnj.hnj(jSONObjectHnj, adSlot, xyoVar);
                qorVar3.hnj(hnjVarHnj.f13722ta);
                orl.hnj(hnjVarHnj.ojm);
                int i11 = hnjVarHnj.gjv;
                if (i11 != 20000) {
                    qorVar3.hnj(i11);
                    if (!oj.gjv().sq() && hnjVarHnj.gjv == 40029) {
                        hnjVar2.hnj(-100, ojm.hnj(-100));
                    } else {
                        hnjVar2.hnj(hnjVarHnj.gjv, hnjVarHnj.f13721sk);
                    }
                    qorVar3.qor(9);
                    com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar3);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.hnj hnjVar3 = hnjVarHnj.aq;
                if (hnjVar3 == null) {
                    qorVar3.qor(13);
                    hnj(hnjVar2, qorVar3);
                    return;
                }
                if (hnj(hnjVar3, hnjVar2)) {
                    return;
                }
                hnjVarHnj.aq.qor(strGjv);
                com.bytedance.sdk.openadsdk.utils.fvt fvtVarHn2 = com.bytedance.sdk.openadsdk.utils.fvt.hn();
                if (xyoVar != null && (ptyVar = xyoVar.dnm) != null) {
                    ptyVar.hnj(fvtVar, fvtVarHn, hnjVarHnj.hnj, fvtVarHn2);
                }
                Object[] objArr = com.bytedance.sdk.openadsdk.as.sk.gjv() && i10 == 1;
                if (objArr != false) {
                    try {
                        if (hnjVarHnj.aq.gjv() != null && !hnjVarHnj.aq.gjv().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.as asVar = hnjVarHnj.aq.gjv().get(0);
                            String strQor = com.bytedance.sdk.openadsdk.utils.orp.qor(i10);
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            long jHnj = 0;
                            if (xyoVar != null) {
                                try {
                                    com.bytedance.sdk.openadsdk.utils.fvt fvtVar2 = xyoVar.f14019ta;
                                    jSONObject = jSONObject3;
                                    if (fvtVar2.hnj > 0) {
                                        jHnj = fvtVarHn2.hnj(fvtVar2);
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                jSONObject = jSONObject3;
                            }
                            if (asVar != null) {
                                boolean zBgg = asVar.bgg();
                                jSONObject4.put("is_new_engine", zBgg ? 1 : 0);
                                jSONObject4.put("webview_cache_size", zBgg ? com.bytedance.sdk.component.adexpress.sk.sk.hnj().gjv() : com.bytedance.sdk.component.adexpress.sk.sk.hnj().qor());
                            }
                            JSONObject jSONObject5 = jSONObject;
                            hnj(hnVar.dse(), xyoVar, fvtVar, fvtVarHn, hnjVarHnj.hnj, fvtVarHn2, asVar, strQor, jSONObject4, true);
                            jSONObject5.put("duration", jHnj);
                            jSONObject5.put("extra_data", jSONObject4);
                            jSONObject5.put("tag", strQor);
                            jSONObject5.put("callback_start", fvtVarHn2.hnj());
                            hnjVarHnj.aq.hnj(jSONObject5);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        qorVar3 = qorVar2;
                        hnjVar2 = hnjVar;
                        com.bytedance.sdk.component.utils.apu.hnj("NetApiImpl", "get ad error: ", th);
                        qorVar3.hn(th.getMessage());
                        qorVar3.qor(14);
                        hnj(hnjVar2, qorVar3);
                        com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("get_ad", qorVar.sk(), -9, th.getMessage(), qorVar.qor(), list);
                        ApmHelper.reportCustomError("", "parse_error", th);
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.core.orl.qor.gjv.hnj(hnjVarHnj.aq);
                hnjVar.hnj(hnjVarHnj.aq, qorVar2);
                hnj(hnjVarHnj.aq, i10);
                com.bytedance.sdk.openadsdk.core.sk.hnj.hnj().hnj(hnjVarHnj.aq);
                Map<String, com.bytedance.sdk.openadsdk.core.model.as> mapHnj = com.bytedance.sdk.openadsdk.core.model.hnj.hnj(hnjVarHnj.aq);
                if (mapHnj != null) {
                    com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(mapHnj);
                }
                if (hnjVarHnj.aq.gjv() == null || hnjVarHnj.aq.gjv().isEmpty() || objArr == true) {
                    return;
                }
                hnj(hnVar.dse(), xyoVar, fvtVar, fvtVarHn, hnjVarHnj.hnj, fvtVarHn2, hnjVarHnj.aq.gjv().get(0), com.bytedance.sdk.openadsdk.utils.orp.qor(i10));
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.12
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar4 = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar4.hn("get_ad");
                    hnjVar4.qor(adSlot.getCodeId());
                    hnjVar4.gjv(com.bytedance.sdk.openadsdk.utils.orp.qor(adSlot.getDurationSlotType()));
                    hnjVar4.hnj(BuildConfig.VERSION_NAME);
                    return hnjVar4;
                }
            });
            int iHnj = hnVar.hnj();
            String strHn = hnVar.hn();
            hnjVar2.hnj(iHnj, strHn);
            qorVar3.hnj(iHnj);
            qorVar3.qor(11);
            qorVar3.hn(strHn);
            com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar3);
            com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("get_ad", qorVar.sk(), iHnj, strHn, qorVar.qor(), list);
        }
    }

    @DungeonFlag
    private JSONObject hn(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(CampaignEx.JSON_KEY_TIMESTAMP, System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put("gaid", com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", hnj(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.hnj.hnj(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0080 A[Catch: JSONException -> 0x00af, TryCatch #0 {JSONException -> 0x00af, blocks: (B:3:0x0005, B:9:0x0047, B:11:0x0080, B:22:0x00a1, B:8:0x0030, B:5:0x002a), top: B:25:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0093  */
    /* JADX WARN: Code duplicated, block: B:15:0x0096  */
    /* JADX WARN: Code duplicated, block: B:17:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e A[PHI: r2
      0x009e: PHI (r2v15 int) = (r2v14 int), (r2v18 int) binds: [B:12:0x0091, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    @DungeonFlag
    private JSONObject hn() {
        int i10;
        int rotation;
        int i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", ta.hn().gjv());
            jSONObject.put("name", ta.hn().aq());
            dse(jSONObject);
            Context contextHnj = oj.hnj();
            String packageResourcePath = "";
            if (contextHnj != null) {
                try {
                    packageResourcePath = contextHnj.getPackageResourcePath();
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", "failed to get the application installation package path. error: " + th2.getMessage());
                }
                jSONObject.put("package_install_path", packageResourcePath);
                i10 = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.qor.dse());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - fc.hnj()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.ta());
                jSONObject.put("is_init", fc.sk() ? 1 : 0);
                if (contextHnj != null) {
                    rotation = ((WindowManager) contextHnj.getSystemService("window")).getDefaultDisplay().getRotation();
                    i11 = 1;
                    if (rotation == 0) {
                        i10 = i11;
                    } else if (rotation != 1) {
                        i11 = 2;
                        if (rotation != 2) {
                            i10 = i11;
                        } else if (rotation != 3) {
                            i10 = 4;
                        }
                    } else {
                        i10 = 3;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i10));
                }
            } else {
                jSONObject.put("package_install_path", packageResourcePath);
                i10 = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.qor.dse());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - fc.hnj()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.ta());
                jSONObject.put("is_init", fc.sk() ? 1 : 0);
                if (contextHnj != null) {
                    rotation = ((WindowManager) contextHnj.getSystemService("window")).getDefaultDisplay().getRotation();
                    i11 = 1;
                    if (rotation == 0) {
                        i10 = i11;
                    } else if (rotation != 1) {
                        i11 = 2;
                        if (rotation != 2) {
                            i10 = i11;
                        } else if (rotation != 3) {
                            i10 = 4;
                        }
                    } else {
                        i10 = 3;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i10));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static String hn(AdSlot adSlot) {
        String strBug = ta.hn().bug();
        if (adSlot == null) {
            if (TextUtils.isEmpty(strBug)) {
                return "";
            }
        } else {
            String userData = adSlot.getUserData();
            if (TextUtils.isEmpty(strBug)) {
                return userData;
            }
            if (!TextUtils.isEmpty(userData)) {
                HashSet hashSet = new HashSet();
                try {
                    JSONArray jSONArray = new JSONArray(userData);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        if (jSONObject != null) {
                            hashSet.add(jSONObject.optString("name", null));
                        }
                    }
                    try {
                        JSONArray jSONArray2 = new JSONArray(strBug);
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                            if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                                jSONArray.put(jSONObject2);
                            }
                        }
                        return jSONArray.toString();
                    } catch (Throwable unused) {
                        return userData;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return strBug;
    }

    private boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, as.hnj hnjVar2) {
        if (hnjVar == null) {
            hnjVar2.hnj(40053, ojm.hnj(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.as> listGjv = hnjVar.gjv();
        if (listGjv.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.as asVar : listGjv) {
            if (TextUtils.isEmpty(asVar.gmt().hn()) || TextUtils.isEmpty(asVar.gmt().qor())) {
                hnjVar2.hnj(40053, ojm.hnj(40053));
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, com.bytedance.sdk.openadsdk.utils.orp.hnj(asVar), "material_error", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.do.13
                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hnj() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", asVar.gmt().dkl());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    public com.bytedance.sdk.openadsdk.gjv.sk hn(JSONObject jSONObject) {
        int i10;
        boolean z10;
        boolean z11;
        List<String> listHnj;
        String strHn = "error unknown";
        if (!com.bytedance.sdk.openadsdk.core.settings.dse.hnj() || com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
        boolean z12 = false;
        int iHnj = 0;
        try {
            JSONObject jSONObjectHnj = hnj(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            gjvVarHn.hnj(jSONObjectHnj.toString(), oj.gjv().uua());
            gjvVarHn.qor(com.bytedance.sdk.openadsdk.utils.orp.gjv("/api/ad/union/sdk/stats/batch/"));
            if (com.bytedance.sdk.openadsdk.utils.hn.hnj() && (listHnj = com.bytedance.sdk.openadsdk.utils.orp.hnj("/api/ad/union/sdk/stats/batch/", false)) != null && !listHnj.isEmpty()) {
                gjvVarHn.hnj(listHnj);
                gjvVarHn.hnj(60L, TimeUnit.SECONDS);
            }
            hnj(gjvVarHn, jSONObjectHnj);
            gjvVarHn.hn(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.orp.gjv());
            if (com.bytedance.sdk.openadsdk.core.settings.dnm.hn().aip()) {
                gjvVarHn.hn("_disable_retry", "1");
            }
            com.bytedance.sdk.component.dse.hn hnVarHnj = gjvVarHn.hnj();
            try {
                if (hnVarHnj == null) {
                    return new com.bytedance.sdk.openadsdk.gjv.sk(false, 0, "error unknown", false);
                }
                if (!hnVarHnj.dkl() || TextUtils.isEmpty(hnVarHnj.gjv())) {
                    z11 = false;
                    z10 = false;
                } else {
                    JSONObject jSONObject2 = new JSONObject(hnVarHnj.gjv());
                    int iOptInt = jSONObject2.optInt("code", -1);
                    strHn = jSONObject2.optString(DataSchemeDataSource.SCHEME_DATA, "");
                    z10 = true;
                    z11 = iOptInt == 20000;
                    if (iOptInt != 60005) {
                        z10 = false;
                    }
                }
                try {
                    iHnj = hnVarHnj.hnj();
                    if (!hnVarHnj.dkl()) {
                        strHn = hnVarHnj.hn();
                        com.bytedance.sdk.openadsdk.utils.wu.hnj(gjvVarHn.sk());
                    }
                } catch (Throwable unused) {
                    i10 = iHnj;
                    z12 = z11;
                    z11 = z12;
                    iHnj = i10;
                }
                return new com.bytedance.sdk.openadsdk.gjv.sk(z11, iHnj, strHn, z10);
            } catch (Throwable unused2) {
                i10 = 0;
                z10 = false;
            }
        } catch (Throwable unused3) {
            return new com.bytedance.sdk.openadsdk.gjv.sk(false, 0, "error unknown", false);
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, int i10) {
        List<com.bytedance.sdk.openadsdk.core.model.oj> listLx;
        List<com.bytedance.sdk.openadsdk.core.model.as> listGjv = hnjVar.gjv();
        if (listGjv != null && listGjv.size() != 0) {
            for (int i11 = 0; i11 < listGjv.size(); i11++) {
                com.bytedance.sdk.openadsdk.core.model.as asVar = listGjv.get(i11);
                if (asVar != null && asVar.zt() == null) {
                    hnj(mDXVAtwcaFMHJ.cbONxPtZxt, 0, 0, asVar.mn(), asVar);
                    if (i10 == 3) {
                        hnj(giNWGaNAgVQoO.nPRYF, 0, 0, asVar.tq(), asVar);
                    }
                    if (asVar.pwt() != null) {
                        hnj(asVar.pwt().J(), asVar.pwt().D(), asVar.pwt().p(), (com.bytedance.sdk.openadsdk.core.model.oj) null, asVar);
                    }
                    if ((i10 != 1 || asVar.pwt() == null) && (listLx = asVar.lx()) != null && listLx.size() > 0) {
                        for (int i12 = 0; i12 < listLx.size(); i12++) {
                            hnj(asVar, listLx.get(i12));
                        }
                    }
                }
            }
        }
    }

    private void hnj(String str, int i10, int i11, com.bytedance.sdk.openadsdk.core.model.oj ojVar, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.ta.gjv.hnj(str).hnj(i10).hn(i11).sk(com.bytedance.sdk.openadsdk.utils.sq.sk(oj.hnj())).gjv(com.bytedance.sdk.openadsdk.utils.sq.qor(oj.hnj())).qor(1).hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, str, null), 4);
        } else {
            if (ojVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.ta.gjv.hnj(ojVar).qor(1).hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, ojVar.hnj(), null), 4);
        }
    }

    private void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, com.bytedance.sdk.openadsdk.core.model.oj ojVar) {
        if (ojVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ta.gjv.hnj(ojVar).qor(1).hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, ojVar.hnj(), new com.bytedance.sdk.component.sk.jip() { // from class: com.bytedance.sdk.openadsdk.core.do.14
            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(int i10, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.sk.jip
            public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
            }
        }), 4);
    }

    public static JSONArray hn(String str) {
        try {
            Set<String> setHn = com.bytedance.sdk.component.adexpress.hnj.hn.hn.hn(str);
            if (setHn != null && setHn.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setHn.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.hnj.qor.hn hnVarHnj = com.bytedance.sdk.component.adexpress.hnj.hn.hn.hnj(it.next());
                    if (hnVarHnj != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", hnVarHnj.hn());
                        jSONObject.put("md5", hnVarHnj.qor());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.hnj("NetApiImpl", "getParentTplIds: ", e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    private void hnj(com.bytedance.sdk.component.hn.hnj.ta taVar, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, com.bytedance.sdk.openadsdk.utils.fvt fvtVar, com.bytedance.sdk.openadsdk.utils.fvt fvtVar2, int i10, com.bytedance.sdk.openadsdk.utils.fvt fvtVar3, com.bytedance.sdk.openadsdk.core.model.as asVar, String str) {
        com.bytedance.sdk.openadsdk.utils.fvt fvtVar4;
        if (oj.gjv().qb()) {
            JSONObject jSONObject = new JSONObject();
            long jHnj = 0;
            if (xyoVar != null) {
                try {
                    com.bytedance.sdk.openadsdk.utils.fvt fvtVar5 = xyoVar.f14019ta;
                    if (fvtVar5.hnj > 0) {
                        fvtVar4 = fvtVar3;
                        jHnj = fvtVar4.hnj(fvtVar5);
                    } else {
                        fvtVar4 = fvtVar3;
                    }
                } catch (Exception unused) {
                    return;
                }
            } else {
                fvtVar4 = fvtVar3;
            }
            long j10 = jHnj;
            hnj(taVar, xyoVar, fvtVar, fvtVar2, i10, fvtVar4, asVar, str, jSONObject, false);
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, "load_ad_time", j10, jSONObject);
        }
    }

    private static void hnj(com.bytedance.sdk.component.hn.hnj.ta taVar, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, com.bytedance.sdk.openadsdk.utils.fvt fvtVar, com.bytedance.sdk.openadsdk.utils.fvt fvtVar2, int i10, com.bytedance.sdk.openadsdk.utils.fvt fvtVar3, com.bytedance.sdk.openadsdk.core.model.as asVar, String str, JSONObject jSONObject, boolean z10) throws JSONException {
        if (xyoVar != null) {
            com.bytedance.sdk.openadsdk.utils.fvt fvtVar4 = xyoVar.f14019ta;
            if (fvtVar4.hnj > 0) {
                jSONObject.put("client_start_time", fvtVar.hnj(fvtVar4));
            }
        }
        jSONObject.put("network_time", fvtVar2.hnj(fvtVar));
        jSONObject.put("sever_time", i10);
        jSONObject.put("client_end_time", fvtVar3.hnj(fvtVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", asVar.nyv() ? 1 : 0);
        }
        if (asVar != null) {
            jSONObject.put("render_control_type", asVar.th());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.sk.sk.hnj().qor());
        jSONObject.put("sync_barrier_open", z10 ? 1 : 0);
        long j10 = taVar.f12885hn;
        if (j10 > 0) {
            jSONObject.put("enqueue_2_run_ts", taVar.qor - j10);
            jSONObject.put("run_2_connect_end_ts", taVar.f12886sk - taVar.f12885hn);
            jSONObject.put("connect_end_2_response_end_ts", taVar.dkl - taVar.f12886sk);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - taVar.dkl);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.gjv.sk hnj(JSONObject jSONObject, String str, List<String> list) {
        String str2;
        boolean z10;
        int i10;
        Object obj;
        try {
            byte[] bArr = null;
            if (com.bytedance.sdk.openadsdk.core.settings.dse.hnj() && !com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
                com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
                gjvVarHn.qor(str);
                if (com.bytedance.sdk.openadsdk.utils.hn.hnj() && list != null && !list.isEmpty()) {
                    gjvVarHn.hnj(list);
                    gjvVarHn.hnj(60L, TimeUnit.SECONDS);
                }
                if (com.bytedance.sdk.openadsdk.core.settings.dnm.hn().dl()) {
                    gjvVarHn.hn("_disable_retry", "1");
                }
                Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(sk(jSONObject.toString()));
                if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                    bArr = (byte[]) obj;
                    tgn.hn(true);
                } else {
                    int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                    tgn.hn(false);
                    tgn.hnj(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                }
                if (bArr != null) {
                    gjvVarHn.hn("Content-Encoding", "union_sdk_encode");
                    gjvVarHn.hn("x-pgli18n", "4");
                    gjvVarHn.hnj("application/octet-stream;tt-data=a", bArr);
                }
                if (bArr == null) {
                    try {
                        JSONObject jSONObjectHnj = com.bytedance.sdk.component.utils.hnj.hnj(jSONObject);
                        if (!qor(jSONObjectHnj)) {
                            jSONObjectHnj = jSONObject;
                        }
                        hnj(sk(jSONObjectHnj), gjvVarHn);
                        gjvVarHn.hnj(jSONObjectHnj.toString(), oj.gjv().uua());
                    } catch (OutOfMemoryError e10) {
                        com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e10.toString());
                        return new com.bytedance.sdk.openadsdk.gjv.sk(false, -2, "encrypt_error", false);
                    }
                }
                com.bytedance.sdk.component.dse.hn hnVarHnj = gjvVarHn.hnj();
                boolean zDkl = (hnVarHnj == null || !hnVarHnj.dkl() || TextUtils.isEmpty(hnVarHnj.gjv())) ? false : dkl(new JSONObject(hnVarHnj.gjv()));
                String strHn = "error unknown";
                int iHnj = hnVarHnj != null ? hnVarHnj.hnj() : 0;
                if (!zDkl && iHnj == 200) {
                    str2 = "server say not success";
                    z10 = true;
                } else {
                    if (hnVarHnj != null && hnVarHnj.hn() != null) {
                        strHn = hnVarHnj.hn();
                    }
                    str2 = strHn;
                    z10 = false;
                }
                if (hnVarHnj == null) {
                    com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("applog", str, -1, "response is null", gjvVarHn.qor(), list);
                } else {
                    if (!hnVarHnj.dkl()) {
                        i10 = iHnj;
                        com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("applog", str, i10, hnVarHnj.hn(), gjvVarHn.qor(), list);
                    }
                    gjv(jSONObject);
                    return new com.bytedance.sdk.openadsdk.gjv.sk(zDkl, i10, str2, z10);
                }
                i10 = iHnj;
                gjv(jSONObject);
                return new com.bytedance.sdk.openadsdk.gjv.sk(zDkl, i10, str2, z10);
            }
            return null;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj("NetApiImpl", "uploadEvent error", th2);
            return new com.bytedance.sdk.openadsdk.gjv.sk(false, 509, "service_busy", false);
        }
    }

    private void hnj(Map<String, String> map, com.bytedance.sdk.component.dse.hn.gjv gjvVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    gjvVar.hn(entry.getKey(), entry.getValue());
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", "ADD header exceptopn", e10.getMessage());
                }
            }
        }
        try {
            gjvVar.hn(Command.HTTP_HEADER_USER_AGENT, com.bytedance.sdk.openadsdk.utils.orp.gjv());
        } catch (Exception e11) {
            com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", "ADD header exceptopn", e11.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    public void hnj(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        if (!com.bytedance.sdk.openadsdk.core.settings.dse.hnj() || com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            return;
        }
        JSONObject jSONObjectHn = hn(str, list, jSONObject, str2, str3);
        if (jSONObjectHn == null) {
            return;
        }
        com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
        final String strGjv = com.bytedance.sdk.openadsdk.utils.orp.gjv("/api/ad/union/dislike_event/");
        JSONObject jSONObjectHnj = hnj(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectHn);
        String string = jSONObjectHnj != null ? jSONObjectHnj.toString() : null;
        hnj(gjvVarHn, jSONObjectHnj);
        gjvVarHn.qor(strGjv);
        gjvVarHn.sk(string);
        gjvVarHn.hnj(7);
        gjvVarHn.hn("dislike");
        com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.2
            @Override // com.bytedance.sdk.openadsdk.oj.gjv
            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                hnjVar.hn("dislike");
                return hnjVar;
            }
        });
        gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.do.3
            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                if (hnVar == null) {
                    com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("dislike", strGjv, -1, "response is null", null, null);
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.3.3
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("dislike");
                            return hnjVar;
                        }
                    });
                } else if (hnVar.dkl()) {
                    com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.3.1
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("dislike");
                            return hnjVar;
                        }
                    });
                } else {
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.3.2
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("dislike");
                            return hnjVar;
                        }
                    });
                    com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("dislike", strGjv, hnVar.hnj(), hnVar.hn(), null, null);
                }
            }

            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("dislike", strGjv, -1, iOException != null ? iOException.getMessage() : "null", null, null);
                if (qorVar != null) {
                    com.bytedance.sdk.openadsdk.utils.wu.hnj(qorVar.sk());
                }
                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.3.4
                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                        hnjVar.hn("dislike");
                        return hnjVar;
                    }
                });
            }
        });
        try {
            String strOptString = new JSONObject(str).optString(BidResponsedEx.KEY_CID, "");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj("dislike", strOptString, (String) null, (String) null);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor(e10.getMessage(), new Object[0]);
        }
    }

    public static JSONObject hnj(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new tu(cryptDataScene));
        tgn.hnj(jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    private JSONArray hnj(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private void hnj(as.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar) {
        hnjVar.hnj(-1, ojm.hnj(-1));
        qorVar.hnj(-1);
        com.bytedance.sdk.openadsdk.core.model.qor.hnj(qorVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(as.hn hnVar) {
        hnVar.hnj(-1, ojm.hnj(-1));
    }

    public static JSONObject hnj(AdSlot adSlot) {
        vf vfVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", oj.gjv().eta());
            jSONObject.put("lmt", DeviceUtils.qor());
            if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dnm()) {
                jSONObject.put("pa_consent", ta.hn().ta());
            }
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.ta.hn.hnj().aq());
            jSONObject.put("tcstring", com.bytedance.sdk.openadsdk.core.settings.dnm.hn(oj.hnj()));
            jSONObject.put("tcf_gdpr", com.bytedance.sdk.openadsdk.core.settings.dnm.hnj(oj.hnj()));
            if (adSlot != null && vf.hnj.containsKey(Integer.valueOf(adSlot.getCodeId())) && (vfVar = vf.hnj.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", vfVar.hn());
                jSONObject.put("lastbundle", vfVar.qor());
                jSONObject.put("lastclick", vfVar.gjv());
                jSONObject.put("lastskip", vfVar.sk());
            }
            hnj(jSONObject, DataSchemeDataSource.SCHEME_DATA, hn(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void hnj(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject hnj(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar) {
        Object obj;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i10);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (xyoVar != null) {
                jSONObject.put("render_method", xyoVar.ojm);
                int i11 = xyoVar.ojm;
                if (i11 == 1) {
                    hnj(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i11 == 2) {
                    hnj(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                hnj(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", hn(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", qor(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", qor(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i10));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i10 == 1 || i10 == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (xyoVar != null && (obj2 = xyoVar.dse) != null) {
                jSONObject.put("session_params", obj2);
            }
            if (xyoVar != null && (obj = xyoVar.aq) != null) {
                jSONObject.put("common_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i10 == 7 || i10 == 8) {
                adCount = 1;
            }
            if (xyoVar != null && xyoVar.f14018sk != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i10 == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject3.put("type", adSlot.getBannerType());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void hnj(JSONObject jSONObject, String str, int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i10);
            jSONObject2.put("height", i11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void hnj(JSONObject jSONObject, String str, float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f10);
            jSONObject2.put("height", (int) f11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    public void hnj(JSONObject jSONObject, final as.hn hnVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.dse.hnj() || com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            if (hnVar != null) {
                hnVar.hnj(1000, "Ad request is temporarily paused, Please contact your AM");
            }
        } else {
            if (jSONObject == null || hnVar == null) {
                return;
            }
            JSONObject jSONObjectHnj = hnj(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
            com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
            try {
                gjvVarHn.qor(com.bytedance.sdk.openadsdk.ojm.gjv.hnj(gjvVarHn, com.bytedance.sdk.openadsdk.utils.orp.gjv("/api/ad/union/sdk/reward_video/reward/")));
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e10.getMessage());
            }
            hnj(gjvVarHn, jSONObjectHnj);
            gjvVarHn.sk(jSONObjectHnj != null ? jSONObjectHnj.toString() : "");
            gjvVarHn.hnj(10);
            gjvVarHn.hn("reward");
            com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.4
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("reward");
                    return hnjVar;
                }
            });
            gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.do.5
                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar2) {
                    if (hnVar2 == null) {
                        com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.5.3
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar.hn("reward");
                                return hnjVar;
                            }
                        });
                        com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("reward", qorVar.sk(), -1, "response is null", null, null);
                        Cdo.this.hnj(hnVar);
                        return;
                    }
                    if (!hnVar2.dkl() || TextUtils.isEmpty(hnVar2.gjv())) {
                        String strHnj = ojm.hnj(-2);
                        int iHnj = hnVar2.hnj();
                        if (!hnVar2.dkl() && !TextUtils.isEmpty(hnVar2.hn())) {
                            strHnj = hnVar2.hn();
                        }
                        String str = strHnj;
                        hnVar.hnj(iHnj, str);
                        com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.5.2
                            @Override // com.bytedance.sdk.openadsdk.oj.gjv
                            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                hnjVar.hn("reward");
                                return hnjVar;
                            }
                        });
                        if (hnVar2.dkl()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("reward", qorVar.sk(), iHnj, str, null, null);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(hnVar2.gjv());
                        String strHnj2 = Cdo.hnj(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strHnj2)) {
                            try {
                                jSONObject2 = new JSONObject(strHnj2);
                            } catch (Throwable unused) {
                            }
                        }
                        hn hnVarHnj = hn.hnj(jSONObject2);
                        int i10 = hnVarHnj.hnj;
                        if (i10 != 20000) {
                            hnVar.hnj(i10, ojm.hnj(i10));
                        } else if (hnVarHnj.qor == null) {
                            Cdo.this.hnj(hnVar);
                        } else {
                            hnVar.hnj(hnVarHnj);
                            com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.5.1
                                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                    hnjVar.hn("reward");
                                    return hnjVar;
                                }
                            });
                        }
                    } catch (JSONException e11) {
                        com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", e11.getMessage());
                        Cdo.this.hnj(hnVar);
                    }
                }

                @Override // com.bytedance.sdk.component.dse.hnj.hnj
                public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                    String message;
                    if (iOException != null) {
                        message = iOException.getMessage();
                    } else {
                        message = "";
                    }
                    String str = message;
                    hnVar.hnj(-2, str);
                    if (qorVar != null) {
                        String strSk = qorVar.sk();
                        com.bytedance.sdk.openadsdk.utils.wu.hnj(strSk);
                        com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("reward", strSk, -1, str, null, null);
                    }
                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.do.5.4
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn("reward");
                            return hnjVar;
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    public JSONObject hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strHnj = hnj(iOptInt, strOptString);
            if (TextUtils.isEmpty(strHnj)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strHnj);
            try {
                jSONObject2.put("auction_price", strOptString2);
                return jSONObject2;
            } catch (Throwable unused) {
                return jSONObject2;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    public static String hnj(int i10, String str) {
        Object obj;
        if (i10 == 3) {
            return com.bytedance.sdk.component.utils.hnj.qor(str);
        }
        if (i10 == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                tgn.hnj(true);
                return str2;
            }
            tgn.hnj(false);
            tgn.hnj(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    private void hnj(com.bytedance.sdk.component.dse.hn.gjv gjvVar, JSONObject jSONObject) {
        try {
            if (qor(jSONObject) && jSONObject.optInt("cypher") == 4) {
                gjvVar.hn("x-pgli18n", "4");
                gjvVar.hn("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    public com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnj() {
        com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVarHnj = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.dse.hnj() || com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tpl_fetch_model", "date", 0L);
        String strPnz = oj.gjv().pnz();
        String strHn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= oj.gjv().fvt() && jCurrentTimeMillis >= 0 && TextUtils.equals(strPnz, strHn)) {
            String strHn2 = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(strHn2)) {
                    return com.bytedance.sdk.component.adexpress.hnj.qor.hnj.sk(strHn2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
            String strHnj = com.bytedance.sdk.openadsdk.ojm.gjv.hnj(hnVarQor, strPnz);
            hnVarQor.qor(strHnj);
            com.bytedance.sdk.component.dse.hn hnVarHnj = hnVarQor.hnj();
            if (hnVarHnj == null || !hnVarHnj.dkl()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(hnVarHnj.gjv());
            jSONObject.put("template_fetch_url", strHnj);
            hnjVarHnj = com.bytedance.sdk.component.adexpress.hnj.qor.hnj.hnj(jSONObject);
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tpl_fetch_model", "model", jSONObject.toString());
            com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("tpl_fetch_model", "last_url", strPnz);
            return hnjVarHnj;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("NetApiImpl", th2.getMessage());
            return hnjVarHnj;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    public void hnj(String str) {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            return;
        }
        com.bytedance.sdk.component.dse.hn.hn hnVarQor = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().qor();
        hnVarQor.qor(str);
        hnVarQor.hn("upload_bidding");
        hnVarQor.hnj(7);
        hnVarQor.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.do.6
            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                hnVar.gjv();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.as
    public void hnj(JSONObject jSONObject, String str) {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            return;
        }
        com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
        gjvVarHn.qor(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        gjvVarHn.hn("cypher", (String) pairGenerateRequestHeader.first);
        gjvVarHn.hn("transfer-param", (String) pairGenerateRequestHeader.second);
        gjvVarHn.hn("x-pangle-target-idc", oj.gjv().mw());
        gjvVarHn.hnj(jSONObject);
        gjvVarHn.hnj(5);
        gjvVarHn.hn("apm_pv");
        gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.do.7
            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                hnVar.gjv();
            }
        });
    }
}
