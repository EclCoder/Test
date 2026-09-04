package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.b;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import o4.Wz.OGoz;
import org.json.JSONArray;
import org.json.JSONObject;
import w6.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ul implements pty {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final Map<Integer, String> f14242hn = new HashMap<Integer, String>(59) { // from class: com.bytedance.sdk.openadsdk.core.ul.1
        {
            put(1, "is_init");
            put(2, "abtest");
            put(3, "language");
            put(4, "ad_sdk_version");
            put(5, CampaignEx.JSON_KEY_PACKAGE_NAME);
            put(6, "user_data");
            put(7, CampaignEx.JSON_KEY_ST_TS);
            put(8, "ipv4");
            put(9, "ipv6");
            put(10, "adx_id");
            put(11, "target_region");
            put(12, "gaid");
            put(13, "banner");
            put(14, "app_reg");
            put(15, "apk-sign");
            put(16, "screen_scale");
            put(17, "app_set_id_scope");
            put(18, "app_set_id");
            put(19, "installed_source");
            put(20, "app_running_time");
            put(21, "js_render_ver");
            put(22, "js_render_v3_ver");
            put(23, "gp_v_name");
            put(24, "gp_v_code");
            put(25, "vendor");
            put(26, "model");
            put(27, "user_agent_device");
            put(28, "user_agent_webview");
            put(29, "sys_compiling_time");
            put(30, "screen_height");
            put(31, OGoz.HrZTh);
            put(32, "rom_version");
            put(33, "carrier_name");
            put(34, "os_version");
            put(35, "conn_type");
            put(36, "boot");
            put(37, "oem_store");
            put(38, "board");
            put(39, "timezone");
            put(40, "device_city");
            put(41, "cpu_num");
            put(42, "density");
            put(43, "bt_time");
            put(44, "bt_id");
            put(45, "sec_did");
            put(46, "X-Armors");
            put(47, "url");
            put(48, "pangle_m");
            put(49, "ec");
            put(50, "pglx");
            put(51, "md");
            put(52, "bp");
            put(53, "t_ver");
            put(54, "is_fold");
            put(55, CampaignEx.JSON_KEY_AAB);
            put(56, "abi");
            put(57, "is_multi");
            put(58, "w_ver");
            put(59, "feature_data");
        }
    };
    private final AtomicReference<JSONObject> hnj = new AtomicReference<>();
    private int qor = 0;

    private static void aq(final String str) {
        try {
            com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ul.4
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("bidding_token");
                    hnjVar.dse(ul.dnm(str).toString());
                    return hnjVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAdManagerImpl", th2.getMessage());
        }
    }

    public static boolean dkl(String str) {
        return "TX".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject dnm(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static void ojm(final String str) {
        try {
            com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ul.5
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("bidding_token");
                    hnjVar.dse(ul.dnm(str).toString());
                    return hnjVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAdManagerImpl", th2.getMessage());
        }
    }

    private static void ta(final String str) {
        try {
            com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.ul.6
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("bidding_token");
                    hnjVar.dse(ul.dnm(str).toString());
                    return hnjVar;
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("TTAdManagerImpl", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public ul hnj(String str) {
        ta.hn().hnj(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public String qor() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    /* JADX INFO: renamed from: sk, reason: merged with bridge method [inline-methods] */
    public ul hn(String str) {
        ta.hn().qor(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public pty gjv(int i10) {
        ta.hn().gjv(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public pty hn() {
        com.bytedance.sdk.component.utils.fc.hnj("PangleSDK-7913");
        d.d("PangleSDK-7913");
        com.bytedance.sdk.component.utils.apu.hnj("PangleSDK-7913");
        com.bytedance.sdk.component.utils.fc.hnj();
        com.bytedance.sdk.component.dse.hnj.hnj();
        d.b();
        com.bytedance.sdk.component.utils.apu.hnj();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public pty hnj(int i10) {
        ta.hn().sk(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public pty qor(int i10) {
        ta.hn().qor(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public int sk() {
        return ta.hn().ta();
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public int gjv() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public void hnj(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.orp.ta("getBiddingToken");
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            try {
                aq(adxId);
                String strXo = oj.gjv().xo();
                int size = 2;
                AdSlot adSlotBuild = null;
                if (!com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dkl()) {
                    pAGBidError = new PAGBidError(40060, ojm.hnj(40060));
                } else if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().gjv()) {
                    pAGBidError = new PAGBidError(10007, ojm.hnj(10007));
                } else if (!com.bytedance.sdk.openadsdk.core.ta.hn.hnj().ojm()) {
                    pAGBidError = new PAGBidError(10008, ojm.hnj(10008));
                } else if (TextUtils.isEmpty(strXo)) {
                    pAGBidError = new PAGBidError(10011, ojm.hnj(10011));
                    hnj(5, pAGBiddingRequest);
                } else if (!dkl(strXo) || oj.gjv().vf(adxId)) {
                    pAGBidError = null;
                } else {
                    pAGBidError = new PAGBidError(10006, ojm.hnj(10006));
                    hnj(2, pAGBiddingRequest);
                }
                if (pAGBidError != null) {
                    pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                    ta(adxId);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dnm() && ta.hn().dnm()) {
                    pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, ojm.hnj(10004)));
                    ta(adxId);
                    hnj(3, pAGBiddingRequest);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.dnm.qor.hnj();
                JSONObject jSONObject = new JSONObject();
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
                jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, com.bytedance.sdk.openadsdk.utils.orp.dkl());
                if (pAGBiddingRequest != null) {
                    if (!TextUtils.isEmpty(pAGBiddingRequest.getSlotId())) {
                        adSlotBuild = new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build();
                    }
                    jSONObject.put("user_data", Cdo.hnj(adSlotBuild));
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
                jSONObject.put("adx_id", adxId);
                Object objMw = oj.gjv().mw();
                jSONObject.put("target_region", objMw);
                if (jSONObject.toString().getBytes().length <= 2680) {
                    com.bytedance.sdk.openadsdk.core.settings.dnm dnmVarGjv = oj.gjv();
                    com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(jSONObject);
                    if (pAGBiddingRequest != null) {
                        jSONObject.put("banner", hnj(pAGBiddingRequest));
                    }
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
                    size = f14242hn.size();
                }
                while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                    jSONObject.remove(f14242hn.get(Integer.valueOf(size)));
                    size--;
                }
                com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj(jSONObject);
                JSONObject jSONObjectHnj = hnj(jSONObject);
                while (size > 0 && jSONObjectHnj.toString().getBytes().length > 12288) {
                    jSONObject.remove(f14242hn.get(Integer.valueOf(size)));
                    jSONObjectHnj = hnj(jSONObject);
                    size--;
                }
                if (jSONObjectHnj.length() > 0) {
                    jSONObjectHnj.put("target_region", objMw);
                }
                if (com.bytedance.sdk.component.utils.fc.qor()) {
                    jSONObjectHnj.toString();
                    int length = jSONObjectHnj.toString().getBytes().length;
                }
                jSONObjectHnj.toString();
                pAGBidCallback.onBiddingTokenCollected(jSONObjectHnj.toString());
                ojm(adxId);
            } catch (Throwable unused) {
                str = adxId;
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
                hnj(4, pAGBiddingRequest);
                ta(str);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public pty qor(String str) {
        ta.hn().aq(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pty
    public pty hn(int i10) {
        this.qor = i10;
        return this;
    }

    protected void hnj(int i10, PAGBiddingRequest pAGBiddingRequest) {
        try {
            String strWu = ta.hn().wu();
            String str = "";
            String adxId = pAGBiddingRequest != null ? pAGBiddingRequest.getAdxId() : "";
            boolean zLf = oj.gjv().lf();
            Set<String> setYo = oj.gjv().yo();
            JSONArray jSONArray = new JSONArray();
            if (setYo != null) {
                Iterator<String> it = setYo.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            String strXo = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().xo();
            int iSk = sk();
            int iGjv = fc.gjv();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_adx_id", strWu);
            jSONObject.put("bidding_adx_id", adxId);
            jSONObject.put("token_enable", zLf ? 1 : 0);
            String str2 = qEagQqzJZsd.kaOwtG;
            if (!TextUtils.isEmpty(strXo)) {
                str = strXo;
            }
            jSONObject.put(str2, str);
            jSONObject.put("setting_token_adx_ids", jSONArray);
            jSONObject.put("init_pa_consent", iSk);
            jSONObject.put("init_state", iGjv);
            jSONObject.put("reason", i10);
            if (fc.sk()) {
                com.bytedance.sdk.openadsdk.jip.gjv.hnj("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.ul.2
                    @Override // com.bytedance.sdk.openadsdk.jip.hn
                    public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                        return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("biddingtoken_error").hn(jSONObject.toString());
                    }
                });
                final JSONObject andSet = this.hnj.getAndSet(null);
                if (andSet != null) {
                    com.bytedance.sdk.openadsdk.jip.gjv.hnj("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.ul.3
                        @Override // com.bytedance.sdk.openadsdk.jip.hn
                        public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                            return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("biddingtoken_error").hn(andSet.toString());
                        }
                    });
                    return;
                }
                return;
            }
            b.a(this.hnj, null, jSONObject);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static JSONObject hnj(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static JSONObject hnj(JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new tu(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
        tgn.hnj(jSONObjectEncryptType4);
        return jSONObjectEncryptType4 != null ? jSONObjectEncryptType4 : new JSONObject();
    }
}
