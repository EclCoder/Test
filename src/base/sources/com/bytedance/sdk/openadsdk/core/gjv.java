package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class gjv extends ul {
    private static volatile ArrayList<String> hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13729hn = 12288;

    private void aq(final String str) {
        try {
            com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.gjv.1
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("bidding_token");
                    hnjVar.sk("new");
                    hnjVar.dse(gjv.this.dnm(str).toString());
                    return hnjVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("BiddingTokenGenerator", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject dnm(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private void ojm(final String str) {
        try {
            com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.gjv.2
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("bidding_token");
                    hnjVar.sk("new");
                    hnjVar.dse(gjv.this.dnm(str).toString());
                    return hnjVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("BiddingTokenGenerator", th2.getMessage());
        }
    }

    private void ta(final String str) {
        try {
            com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.gjv.3
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("bidding_token");
                    hnjVar.sk("new");
                    hnjVar.dse(gjv.this.dnm(str).toString());
                    return hnjVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("BiddingTokenGenerator", th2.getMessage());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class hnj extends JSONObject {
        private ArrayList<String> hnj;

        public hnj(boolean z10) {
            if (z10) {
                this.hnj = new ArrayList<>();
            }
        }

        public ArrayList<String> hnj() {
            return this.hnj;
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, boolean z10) {
            ArrayList<String> arrayList = this.hnj;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, z10);
        }

        @Override // org.json.JSONObject
        public JSONObject putOpt(String str, Object obj) {
            ArrayList<String> arrayList = this.hnj;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.putOpt(str, obj);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, double d10) {
            ArrayList<String> arrayList = this.hnj;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, d10);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, int i10) {
            ArrayList<String> arrayList = this.hnj;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, i10);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, long j10) {
            ArrayList<String> arrayList = this.hnj;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, j10);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, Object obj) {
            ArrayList<String> arrayList = this.hnj;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, obj);
        }
    }

    private static void hnj(JSONObject jSONObject, PAGBiddingRequest pAGBiddingRequest, String str) throws JSONException {
        jSONObject.put("is_init", fc.sk() ? 1 : 0);
        String strTa = oj.gjv().ta();
        String strHqh = oj.gjv().hqh();
        if (strTa != null && strHqh != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", strTa);
            jSONObject2.put("param", strHqh);
            jSONObject.put("abtest", jSONObject2);
        }
        jSONObject.put("language", orl.hn());
        jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
        jSONObject.put(YSHErhbVu.EaWTnIxbHVfCsR, com.bytedance.sdk.openadsdk.utils.orp.dkl());
        if (pAGBiddingRequest != null) {
            jSONObject.put("user_data", Cdo.hnj(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
        }
        jSONObject.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis() / 1000);
        String strHn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
        if (!strHn.isEmpty()) {
            jSONObject.put("ipv6", strHn);
        } else {
            String strHn2 = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("ttopenadsdk", "key_ipv4", "");
            if (!strHn2.isEmpty()) {
                jSONObject.put("ipv4", strHn2);
            }
        }
        jSONObject.put("adx_id", str);
        jSONObject.put("target_region", oj.gjv().mw());
        com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(jSONObject);
        if (pAGBiddingRequest != null) {
            jSONObject.put("banner", ul.hnj(pAGBiddingRequest));
        }
        com.bytedance.sdk.openadsdk.core.settings.dnm dnmVarGjv = oj.gjv();
        jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dkl() ? 1 : 0);
        Context contextHnj = oj.hnj();
        jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.qor.dse());
        jSONObject.put("screen_scale", com.bytedance.sdk.openadsdk.utils.sq.dkl(contextHnj));
        jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.gjv.hn());
        jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.gjv.qor());
        jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.gjv.gjv());
        jSONObject.put("app_running_time", (System.currentTimeMillis() - fc.hnj()) / 1000);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.ojm.bug.qor());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.ojm.bug.gjv());
        jSONObject.put("gp_v_name", DeviceUtils.sk(contextHnj));
        jSONObject.put("gp_v_code", DeviceUtils.dkl(contextHnj));
        jSONObject.put("vendor", Build.MANUFACTURER);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.orp.hn());
        jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.orp.gjv());
        jSONObject.put("sys_compiling_time", orl.hn(contextHnj));
        jSONObject.put("screen_height", com.bytedance.sdk.openadsdk.utils.sq.sk(contextHnj));
        jSONObject.put("screen_width", com.bytedance.sdk.openadsdk.utils.sq.qor(contextHnj));
        jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.xyo.hnj());
        jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.hqh.hnj());
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.orp.aq(contextHnj));
        if (dnmVarGjv.xyo("boot")) {
            jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        }
        com.bytedance.sdk.openadsdk.utils.orp.hnj(jSONObject);
        jSONObject.put("board", Build.BOARD);
        jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.orp.tgn());
        jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.orp.as());
        jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.ta.hn());
        jSONObject.put("density", com.bytedance.sdk.openadsdk.utils.sq.aq(contextHnj));
        DeviceUtils.hnj(jSONObject);
        com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(jSONObject);
        com.bytedance.sdk.openadsdk.utils.aq.hnj(jSONObject, contextHnj);
        jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.eum.hnj(contextHnj));
        com.bytedance.sdk.openadsdk.utils.aq.hn(jSONObject, contextHnj);
        com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj(jSONObject);
    }

    private void hnj(final int i10, final int i11, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.jip.gjv.hnj("bid_tok_len_over_lim", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.gjv.4
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("len_bef_rm", i10);
                jSONObject.put("len_af_rm", i11);
                jSONObject.put("len_lm", gjv.this.f13729hn);
                jSONObject.put("re_f_key", str2);
                jSONObject.put(YSHErhbVu.BuSxNXKvjYhu, str);
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("bid_tok_len_over_lim").hn(jSONObject.toString());
            }
        });
    }

    public boolean hnj() {
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.as.sk.hnj("bid_tok_con", (Object) null, com.bytedance.sdk.openadsdk.as.hn.hnj);
        if (jSONObject == null) {
            return false;
        }
        this.f13729hn = jSONObject.optInt("en_m_l", this.f13729hn);
        return jSONObject.optInt("enable", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ul, com.bytedance.sdk.openadsdk.core.pty
    public void hnj(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        int length;
        String adxId = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.orp.ta("getBiddingToken");
            if (pAGBiddingRequest != null && pAGBiddingRequest.getAdxId() != null) {
                adxId = pAGBiddingRequest.getAdxId();
            }
            ojm(adxId);
            String strXo = oj.gjv().xo();
            String str = null;
            if (!com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dkl()) {
                pAGBidError = new PAGBidError(40060, ojm.hnj(40060));
            } else if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().gjv()) {
                pAGBidError = new PAGBidError(10007, ojm.hnj(10007));
            } else if (!com.bytedance.sdk.openadsdk.core.ta.hn.hnj().ojm()) {
                pAGBidError = new PAGBidError(10008, ojm.hnj(10008));
            } else if (TextUtils.isEmpty(strXo)) {
                pAGBidError = new PAGBidError(10011, ojm.hnj(10011));
                hnj(5, pAGBiddingRequest);
            } else if (!ul.dkl(strXo) || oj.gjv().vf(adxId)) {
                pAGBidError = null;
            } else {
                pAGBidError = new PAGBidError(10006, ojm.hnj(10006));
                hnj(2, pAGBiddingRequest);
            }
            if (pAGBidError != null) {
                pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                aq(adxId);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dnm() && ta.hn().dnm()) {
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, ojm.hnj(10004)));
                aq(adxId);
                hnj(3, pAGBiddingRequest);
                return;
            }
            com.bytedance.sdk.openadsdk.core.dnm.qor.hnj();
            hnj hnjVar = new hnj(hnj == null);
            hnj(hnjVar, pAGBiddingRequest, adxId);
            ArrayList<String> arrayListHnj = hnjVar.hnj();
            if (arrayListHnj != null) {
                hnj = arrayListHnj;
            }
            JSONObject jSONObjectHnj = ul.hnj(hnjVar);
            int i10 = -1;
            int size = hnj != null ? hnj.size() - 1 : -1;
            while (true) {
                length = jSONObjectHnj.toString().getBytes().length;
                if (length > this.f13729hn) {
                    if (i10 < 0) {
                        i10 = length;
                    }
                    if (size < 0) {
                        break;
                    }
                    str = hnj.get(size);
                    hnjVar.remove(str);
                    size--;
                    jSONObjectHnj = ul.hnj(hnjVar);
                } else {
                    break;
                }
            }
            if (jSONObjectHnj.length() > 0) {
                jSONObjectHnj.put("target_region", oj.gjv().mw());
            }
            pAGBidCallback.onBiddingTokenCollected(jSONObjectHnj.toString());
            ta(adxId);
            if (i10 >= 0) {
                hnj(i10, length, adxId, str);
            }
        } catch (Throwable unused) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
            hnj(4, pAGBiddingRequest);
            aq("");
        }
    }
}
