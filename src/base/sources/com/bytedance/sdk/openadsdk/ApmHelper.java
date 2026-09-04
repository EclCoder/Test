package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.aq.hn.qor;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.as.sk;
import com.bytedance.sdk.openadsdk.common.dkl;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ApmHelper {
    private static hnj dkl;
    private static boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final AtomicBoolean f13022hn = new AtomicBoolean(false);
    private static volatile boolean hnj;
    private static String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static hn f13023sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private interface hn {
        void hnj(String str, String str2, Throwable th2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final String f13027hn;
        public final String hnj;
        public final Throwable qor;

        public hnj(String str, String str2, Throwable th2) {
            this.hnj = str;
            this.f13027hn = str2;
            this.qor = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> dse() {
        HashMap map = new HashMap();
        as asVarQor = com.bytedance.sdk.openadsdk.utils.hn.qor();
        if (asVarQor != null) {
            map.put("adType", String.valueOf(asVarQor.xf()));
            map.put("aid", String.valueOf(asVarQor.yrd()));
            map.put(BidResponsedEx.KEY_CID, asVarQor.sp());
            map.put("reqId", asVarQor.jp());
            map.put("rit", asVarQor.pty("-1"));
            int iRq = asVarQor.rq();
            if (asVarQor.th() != 2) {
                iRq = -1;
            }
            map.put("render_type", String.valueOf(iRq));
        }
        return map;
    }

    public static void initAPM() {
        if (dkl.hnj()) {
            return;
        }
        try {
            String strGjv = ta.hn().gjv();
            if (TextUtils.isEmpty(strGjv)) {
                return;
            }
            initApm(oj.hnj(), strGjv);
        } catch (Exception unused) {
        }
    }

    public static void initApm(final Context context, final String str) {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk() || !f13022hn.compareAndSet(false, true) || hnj) {
            return;
        }
        ua.hnj(new qor("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.hnj) {
                    dnm dnmVarGjv = oj.gjv();
                    boolean unused = ApmHelper.gjv = dnmVarGjv.lko();
                    String strOj = orp.oj();
                    if (ApmHelper.gjv && !TextUtils.isEmpty(strOj)) {
                        String unused2 = ApmHelper.qor = str;
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String strHnj = orl.hnj(context);
                        try {
                            Npth.setCrashWaitTime(sk.hnj("apm_crash_wait_time", 10000));
                            Npth.enableLoopMonitor(false);
                            Npth.enableAnrInfo(false);
                            Npth.enableNativeDump(false);
                            Npth.enableActivityDump(false);
                            Npth.enableMessageDump(false);
                            MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.CustomRequestHeader
                                public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                    Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                    httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                    httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                    httpURLConnection.setRequestProperty("x-pangle-target-idc", oj.gjv().mw());
                                }
                            });
                            final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7913L, BuildConfig.VERSION_NAME, strArr);
                            monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.apm.insight.AttachUserData
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> mapDse = ApmHelper.dse();
                                    if (mapDse.containsKey("render_type")) {
                                        monitorCrashInitSDK.addTags("render_type", mapDse.get("render_type"));
                                        return mapDse;
                                    }
                                    monitorCrashInitSDK.addTags("render_type", "-2");
                                    return mapDse;
                                }
                            });
                            if (dnmVarGjv.zt()) {
                                monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                            }
                            monitorCrashInitSDK.config().setDeviceId(strHnj);
                            monitorCrashInitSDK.setReportUrl(strOj);
                            monitorCrashInitSDK.addTags("host_appid", str);
                            monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            hn unused3 = ApmHelper.f13023sk = new hn() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.hn
                                public void hnj(String str2, String str3, Throwable th2) {
                                    monitorCrashInitSDK.reportCustomErr(str2, str3, th2);
                                }
                            };
                            boolean unused4 = ApmHelper.hnj = true;
                            ApmHelper.qor(strHnj, strOj);
                            hnj hnjVar = ApmHelper.dkl;
                            hnj unused5 = ApmHelper.dkl = null;
                            if (hnjVar != null) {
                                ApmHelper.f13023sk.hnj(hnjVar.hnj, hnjVar.f13027hn, hnjVar.qor);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.hnj = false;
                        }
                    }
                }
                ApmHelper.f13022hn.set(false);
            }
        });
    }

    public static boolean isIsInit() {
        return hnj;
    }

    public static void reportCustomError(String str, String str2, Throwable th2) {
        hn hnVar = f13023sk;
        if (hnVar != null) {
            hnVar.hnj(str, str2, th2);
        } else {
            dkl = new hnj(str, str2, th2);
        }
    }

    public static void reportPvFromBackGround() {
        if (gjv) {
            hn(orl.hnj(oj.hnj()), orp.oj());
        }
    }

    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
            jSONObject.put("ipv6", com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put(TtmlNode.TAG_REGION, oj.gjv().pv());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new tu(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = Saucuwx.DAAroNvv;
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void qor(String str, String str2) {
        hn(str, str2);
    }

    private static void hn(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk() || TextUtils.isEmpty(str2)) {
            return;
        }
        oj.qor().hnj(hn(str), "https://" + str2 + "/monitor/collect/c/session?version_code=7913&device_platform=android&aid=10000001");
    }

    private static JSONObject hn(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", qor);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            apu.qor("ApmHelper", e10.getMessage());
            return jSONObject;
        }
    }
}
