package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.bug;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.a;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.vungle.ads.internal.signals.b;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm implements ojm.hnj {
    private static String tu;
    private final Runnable apu;
    sk.hn<com.bytedance.sdk.openadsdk.gjv.hnj.ta> aq;
    private final sk.hn<Set<String>> as;
    private final com.bytedance.sdk.openadsdk.core.settings.hnj bug;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private sk.hn<JSONObject> f45do;
    private final sk.hn<Map<String, Integer>> eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private volatile boolean f14180fc;
    private int jip;
    private final AtomicBoolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private boolean f14181oj;
    private final aq orl;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private Set<String> f14182ta;
    private int uua;
    private final Set<String> wu;
    public static final String hnj = a.a("_", new CharSequence[]{"bus_con_collect", orp.hqh()});

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static final String f14177hn = a.a("_", new CharSequence[]{"bus_con", orp.hqh(), orp.vf(), "timeout"});
    public static final String qor = a.a("_", new CharSequence[]{"bus_con", orp.hqh(), orp.vf(), "alpha"});
    private static final String ojm = orp.wu();
    public static String gjv = "";

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public static int f14178sk = -2;
    public static String dkl = "IABTCF_TCString";
    private static boolean dnm = false;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private static final ConcurrentLinkedQueue<ta.hnj> f14179xn = new ConcurrentLinkedQueue<>();
    static final ConcurrentHashMap<String, Integer> dse = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class hnj {
        static final dnm hnj = new dnm();
    }

    public static boolean bgg() {
        return dnm;
    }

    private String hw() {
        return this.orl.hnj("force_language", "");
    }

    private Set<String> qi() {
        return (Set) this.orl.hnj("perf_con_applog_send", this.wu, this.as);
    }

    public static String sg() {
        if (tu == null) {
            String strHn = com.bytedance.sdk.openadsdk.core.qor.hnj().hn("settings_host_from_meta", "");
            tu = strHn;
            if (strHn == null) {
                tu = "";
            }
        }
        return tu;
    }

    public Set<String> af() {
        return (Set) this.orl.hnj("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, sk.f14195hn);
    }

    public boolean aip() {
        return this.orl.hnj("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public String apu() {
        return this.orl.hnj("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public void aq() {
        this.orl.hn().hnj("ab_test_param").hnj();
    }

    public boolean as() {
        return this.orl.hnj("bus_con_url_check", 1) != 0;
    }

    public int bug() {
        return this.orl.hnj("perf_con_drawable_code", 0);
    }

    public String cm() {
        return this.orl.hnj("policy_url", "");
    }

    public JSONObject dkl() {
        return (JSONObject) this.orl.hnj("digest", null, sk.hnj);
    }

    public boolean dl() {
        return this.orl.hnj("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public void dlk() {
        sk.hnj hnjVarHn = this.orl.hn();
        hnjVarHn.hnj("settings_url", "");
        hnjVarHn.hnj();
        hqh("");
    }

    public int dnm() {
        return this.orl.hnj("splash_video_load_strategy", 0);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public boolean m37do() {
        return this.orl.hnj(hnj, false);
    }

    public long dse() {
        return this.orl.hnj("data_time", 0L);
    }

    public int dy() {
        int iHnj = this.orl.hnj("perf_con_webview_cache_count_v3", 0);
        if (iHnj < 0) {
            return 0;
        }
        return iHnj;
    }

    public int dzo() {
        return this.orl.hnj("ivrv_downward", 0);
    }

    public int eta() {
        int iHnj = this.orl.hnj("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iHnj != Integer.MAX_VALUE) {
            return iHnj;
        }
        int iM42do = orp.m42do();
        if (iM42do == 1 || iM42do == 2) {
            return 2;
        }
        return iM42do != 3 ? 0 : 1;
    }

    public int eum() {
        return this.orl.hnj("bus_con_behavior_count", HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
    }

    public int fc() {
        qi();
        return this.jip;
    }

    public String ff() {
        return this.orl.hnj("settings_url", "");
    }

    public boolean fr() {
        return this.orl.hnj("read_video_from_cache", 1) == 1;
    }

    public int fvt() {
        int iHnj = this.orl.hnj("fetch_tpl_second", 0);
        if (iHnj <= 0) {
            return 0;
        }
        return iHnj;
    }

    void fzb() {
        fc.hn().removeCallbacks(this.apu);
        fc.hn().postDelayed(this.apu, th());
    }

    public String gjv() {
        return this.orl.hnj("aes_key", "");
    }

    public int gm() {
        return this.orl.hnj("max", 50);
    }

    public int gn() {
        int iHnj = this.orl.hnj("perf_con_webview_cache_count", 0);
        if (iHnj < 0) {
            return 0;
        }
        return iHnj;
    }

    public int hkr() {
        return this.orl.hnj("blank_detect_rate", 30);
    }

    public String hqh() {
        return this.orl.hnj("ab_test_param", "");
    }

    public String[] idl() {
        try {
            Set<String> set = this.f14182ta;
            if (set == null || set.size() == 0) {
                JSONArray jSONArray = new JSONArray(this.orl.hnj("gecko_hosts", (String) null));
                if (jSONArray.length() != 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        this.f14182ta.add(jSONArray.getString(i10));
                    }
                }
                Set<String> setHnj = aq.hnj(this.f14182ta);
                this.f14182ta = setHnj;
                if (setHnj != null) {
                    if (setHnj.size() == 0) {
                    }
                }
                return null;
            }
            return (String[]) this.f14182ta.toArray(new String[0]);
        } catch (Throwable unused) {
        }
    }

    public boolean iwu() {
        return this.orl.hnj("bus_con_video_keep_screen_on", 1) == 1;
    }

    public boolean izk() {
        return this.orl.hnj("privacy_debug_unlock", 1) != 0;
    }

    public String jbd() {
        return this.orl.hnj("ads_url", "");
    }

    public boolean jip() {
        return this.orl.hnj("allow_blind_mode_request_ad", false);
    }

    public String jle() {
        return this.orl.hnj("dual_event_url", (String) null);
    }

    public long jo() {
        return this.orl.hnj("last_req_time", 0L);
    }

    public boolean ka() {
        return this.orl.hnj("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    public int ko() {
        return this.orl.hnj("perf_con_close_button_delay_check_time", -1);
    }

    public boolean krm() {
        return this.orl.hnj("perf_con_is_new_net_thread", 0) == 1;
    }

    public boolean lf() {
        return this.orl.hnj("token_enable", 0) == 1;
    }

    public boolean lhi() {
        return this.f14180fc;
    }

    public boolean lko() {
        int iHnj = this.bug.hnj("perf_con_apm", 100);
        if (iHnj == 0) {
            return false;
        }
        return iHnj < 0 || iHnj >= 100 || iHnj > ((int) (Math.random() * 100.0d));
    }

    public int lu() {
        return this.orl.hnj("vbtt", 5);
    }

    public long meb() {
        return this.orl.hnj("perf_con_adlog_expire_time", 0L);
    }

    public int mjg() {
        qi();
        return this.uua;
    }

    public String mkl() {
        return this.orl.hnj("privacy_app_reg", "");
    }

    public String mw() {
        return this.orl.hnj("target_region", "");
    }

    public boolean nyv() {
        return this.orl.hnj("landingpage_new_style", -1) == 1;
    }

    public boolean oj() {
        return this.orl.hnj("ad_revenue_enable", true);
    }

    public boolean ojm() {
        return this.orl.hnj("if_both_open", 0) == 1;
    }

    public Set<String> orl() {
        return qi();
    }

    public void orp() {
        String strHw = hw();
        if (TextUtils.isEmpty(strHw)) {
            return;
        }
        if (strHw.equals("zh-Hant")) {
            bug.hnj(oj.hnj(), "zh", "tw");
        } else {
            bug.hnj(oj.hnj(), strHw, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th2) {
            apu.qor("TTAD.SdkSettings", th2.getMessage());
        }
    }

    public String pnz() {
        return this.orl.hnj("dyn_draw_engine_url", ojm);
    }

    public long pty() {
        return this.orl.hnj("duration", 10000L);
    }

    public String pv() {
        return this.orl.hnj("dc", "TX");
    }

    public Set<String> pwt() {
        aq aqVar = this.orl;
        Set<String> set = Collections.EMPTY_SET;
        Set<String> set2 = (Set) aqVar.hnj("ads_url_backup", set, sk.f14195hn);
        return (set2 == null || set2.size() == 0) ? set : set2;
    }

    public boolean qb() {
        return this.orl.hnj("global_rate", 1.0f) == 1.0f;
    }

    public int rd() {
        int iHnj = this.orl.hnj("bus_con_auto_click_delay", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        return iHnj <= 0 ? AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS : iHnj;
    }

    public boolean rmr() {
        int iHnj = this.orl.hnj("privacy_ad_enable", Integer.MAX_VALUE);
        if (iHnj == 1) {
            return true;
        }
        if (iHnj == 0) {
            return false;
        }
        int iM42do = orp.m42do();
        return iM42do == 1 || iM42do == 2 || iM42do == 3;
    }

    public boolean rq() {
        if (com.bytedance.sdk.component.adexpress.gjv.hn.hnj(oj.hnj())) {
            return this.orl.hnj("support_rtl", false);
        }
        return false;
    }

    public int sk() {
        return this.orl.hnj("max_tpl_cnts", 100);
    }

    public boolean sq() {
        return this.orl.qor();
    }

    public String ta() {
        return this.orl.hnj("ab_test_version", "");
    }

    public float tgn() {
        return this.orl.hnj(qor, 1.0f);
    }

    public long th() {
        long jHnj = this.orl.hnj("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jHnj < 0 || jHnj > b.TWENTY_FOUR_HOURS_MILLIS) ? TTAdConstant.AD_MAX_EVENT_TIME : jHnj;
    }

    public JSONObject tll() {
        return (JSONObject) this.orl.hnj("video_cache_config", null, sk.hnj);
    }

    public int tu() {
        return this.orl.hnj(f14177hn, 10000);
    }

    public int ua() {
        int iHnj = this.orl.hnj("fetch_tpl_timeout_ctrl", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        return iHnj <= 0 ? AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS : iHnj;
    }

    public dkl ul() {
        return (dkl) this.orl.hnj("insert_js_config", dkl.hnj, new sk.hn<dkl>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hn
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public dkl hn(String str) {
                return new dkl(str);
            }
        });
    }

    public boolean uua() {
        return this.orl.hnj("support_gzip", false);
    }

    public int vf() {
        return this.orl.hnj("loadedCallbackOpportunity", 0);
    }

    public JSONObject vh() {
        return (JSONObject) this.orl.hnj("perf_con_thread_pool_config", new JSONObject(), this.f45do);
    }

    public Set<String> vk() {
        return (Set) this.orl.hnj("privacy_fields_allowed", Collections.EMPTY_SET, sk.f14195hn);
    }

    public String wu() {
        return this.orl.hnj("bus_con_check_clz", "");
    }

    public String xad() {
        return this.orl.hnj("app_log_url", "");
    }

    public boolean xn() {
        return this.orl.hnj("bus_con_adshow_check_enable", true);
    }

    public String xo() {
        return this.orl.hnj("dc", "");
    }

    public com.bytedance.sdk.openadsdk.gjv.hnj.ta xw() {
        return (com.bytedance.sdk.openadsdk.gjv.hnj.ta) this.orl.hnj("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.gjv.hnj.ta.hnj, this.aq);
    }

    public int xyo() {
        return this.orl.hnj("bus_con_slide_num", 2);
    }

    public Set<String> yo() {
        return (Set) this.orl.hnj("token_adx_ids", Collections.EMPTY_SET, sk.f14195hn);
    }

    public int zd() {
        return this.orl.hnj("perf_con_sync_gaid", 0);
    }

    public boolean znr() {
        return this.mjg.get();
    }

    public boolean zt() {
        return this.orl.hnj("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    private dnm() {
        this.f14182ta = Collections.synchronizedSet(new HashSet());
        this.bug = new com.bytedance.sdk.openadsdk.core.settings.hnj();
        this.orl = new aq(new ta.hnj() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ta.hnj
            public void hn() {
                com.bytedance.sdk.openadsdk.core.ta.hn.hnj().fc();
                if (dnm.f14179xn == null || dnm.f14179xn.isEmpty()) {
                    return;
                }
                Iterator it = dnm.f14179xn.iterator();
                while (it.hasNext()) {
                    ((ta.hnj) it.next()).hn();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ta.hnj
            public void hnj() {
                ta.hnj[] hnjVarArr;
                boolean unused = dnm.dnm = true;
                com.bytedance.sdk.openadsdk.core.ta.hn.hnj().mjg();
                if (dnm.f14179xn == null || dnm.f14179xn.size() == 0 || (hnjVarArr = (ta.hnj[]) dnm.f14179xn.toArray()) == null) {
                    return;
                }
                for (ta.hnj hnjVar : hnjVarArr) {
                    hnjVar.hnj();
                }
            }
        });
        this.mjg = new AtomicBoolean(false);
        this.f14180fc = false;
        this.jip = 5000;
        this.uua = 10;
        this.apu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.7
            @Override // java.lang.Runnable
            public void run() {
                dnm.this.hnj(2, false);
                dnm.this.fzb();
            }
        };
        this.eum = new sk.hn<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hn
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> hn(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt < 0 || iOptInt > 100) {
                                map.put(next, 100);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    return map;
                } catch (Exception e10) {
                    apu.qor("get applog rate from sp failed:" + e10.getMessage(), new Object[0]);
                    return null;
                }
            }
        };
        this.wu = new HashSet();
        this.as = new sk.hn<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hn
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public Set<String> hn(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            dnm.this.uua = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            dnm.this.jip = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                String string = jSONArray.getString(i10);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        Log.i("TTAD.SdkSettings", e10.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.f45do = new sk.hn<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hn
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public JSONObject hn(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th2) {
                    apu.qor("TTAD.SdkSettings", th2.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.aq = new sk.hn<com.bytedance.sdk.openadsdk.gjv.hnj.ta>() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.sk.hn
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.gjv.hnj.ta hn(String str) {
                com.bytedance.sdk.openadsdk.gjv.hnj.ta taVar = new com.bytedance.sdk.openadsdk.gjv.hnj.ta();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    taVar.hnj(jSONObject.optInt("enable_strategy", 0) == 1);
                    taVar.hnj(hnj(jSONObject.optJSONObject("default")));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            taVar.hnj(next, hnj(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return taVar;
            }

            private com.bytedance.sdk.openadsdk.gjv.hnj.ta.hnj hnj(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new com.bytedance.sdk.openadsdk.gjv.hnj.ta.hnj(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
    }

    public static void hqh(String str) {
        if (str == null) {
            str = "";
        }
        String strSg = sg();
        if (strSg == null || !strSg.equals(str)) {
            com.bytedance.sdk.openadsdk.core.qor.hnj().hnj("settings_host_from_meta", str);
            tu = str;
            hn().hnj(8, true);
        }
    }

    private static SharedPreferences qor(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean apu(String str) {
        return tgn(str).eum;
    }

    public boolean aq(String str) {
        return str == null || tgn(str).mjg == 1;
    }

    public int as(String str) {
        return tgn(str).xyo;
    }

    public boolean bug(String str) {
        try {
            return tgn(str).as != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean dkl(String str) {
        return tgn(str).dse == 1;
    }

    public int dnm(String str) {
        return tgn(str).bug;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public boolean m38do(String str) {
        return tgn(str).nyv;
    }

    public int dse(String str) {
        return tgn(str).f14189oj;
    }

    public int eum(String str) {
        return tgn(str).tu;
    }

    public boolean gjv(String str) {
        return tgn(str).f14192vf;
    }

    public boolean jip(String str) {
        return tgn(str).wu == 0;
    }

    public JSONObject oj(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.orl.hnj("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", tgn(str).f14187gm);
                return jSONObject2;
            } catch (JSONException e10) {
                e = e10;
                jSONObject = jSONObject2;
                apu.qor("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    public int ojm(String str) {
        if (str == null) {
            return 1500;
        }
        return tgn(str).jip;
    }

    public int orl(String str) {
        return tgn(String.valueOf(str)).aq;
    }

    public boolean sk(String str) {
        int i10 = tgn(str).f14190sk;
        if (i10 != 1) {
            return i10 == 2 && com.bytedance.sdk.component.utils.oj.qor(oj.hnj()) != 0;
        }
        return com.bytedance.sdk.component.utils.oj.gjv(oj.hnj());
    }

    public int ta(String str) {
        return tgn(str).dnm;
    }

    public hn tgn(String str) {
        return qor.hnj(str);
    }

    public boolean tu(String str) {
        return oj.gjv().tgn(str).f14186fc == 1;
    }

    public boolean uua(String str) {
        return str == null || DeviceUtils.ta(oj.hnj()) == 0 || tgn(str).orl == 1;
    }

    public boolean vf(String str) {
        Set<String> setYo;
        if (TextUtils.isEmpty(str) || (setYo = yo()) == null || setYo.size() == 0) {
            return false;
        }
        return setYo.contains(str);
    }

    public int wu(String str) {
        return tgn(str).tgn;
    }

    public int xn(String str) {
        return tgn(str).apu;
    }

    public boolean xyo(String str) {
        Set set = (Set) this.orl.hnj("privacy_fields_allowed", Collections.EMPTY_SET, sk.f14195hn);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iM42do = orp.m42do();
        if (iM42do != 1) {
            if (iM42do != 2 && iM42do != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public int fc(String str) {
        return tgn(str).f14191ta;
    }

    public void hnj() {
        try {
            qor.hnj();
            this.orl.gjv();
            this.bug.gjv();
            Context contextHnj = oj.hnj();
            File file = new File(new File(contextHnj.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                contextHnj.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    public boolean mjg(String str) {
        return orl(str) != 1;
    }

    public synchronized void qor() {
        SystemClock.elapsedRealtime();
        boolean z10 = this.f14180fc;
        this.bug.hnj(this.f14180fc);
        this.orl.hnj(this.f14180fc);
        qor.hnj(!z10);
        this.f14180fc = true;
        SystemClock.elapsedRealtime();
        if (!z10) {
            fc.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.3
                @Override // java.lang.Runnable
                public void run() {
                    dnm.this.hnj(1, com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dse() || com.bytedance.sdk.openadsdk.core.ta.hn.hnj().ta());
                    dnm.this.fzb();
                }
            }, 1000L);
        }
    }

    public static String hn(Context context) {
        SharedPreferences sharedPreferencesQor;
        return (context == null || (sharedPreferencesQor = qor(context)) == null) ? "" : sharedPreferencesQor.getString(dkl, "");
    }

    public static dnm hn() {
        return hnj.hnj;
    }

    public int hn(String str) {
        Integer num;
        Map map = (Map) this.orl.hnj("perf_con_applog_rate", null, this.eum);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public int hn(int i10) {
        return tgn(String.valueOf(i10)).f14188hn;
    }

    public boolean qor(String str) {
        return tgn(str).qor == 1;
    }

    public static int hnj(Context context) {
        if (context == null) {
            return -2;
        }
        try {
            SharedPreferences sharedPreferencesQor = qor(context);
            if (sharedPreferencesQor == null) {
                return -2;
            }
            int i10 = sharedPreferencesQor.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
            int i11 = sharedPreferencesQor.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
            if (i10 == Integer.MIN_VALUE && i11 == Integer.MIN_VALUE) {
                return -2;
            }
            return sharedPreferencesQor.getInt("IABTCF_gdprApplies", -1);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public int qor(int i10) {
        return tgn(String.valueOf(i10)).ojm;
    }

    public void hnj(JSONObject jSONObject, sk.hnj hnjVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        aq aqVar = this.orl;
        String str = ojm;
        String strHnj = aqVar.hnj("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strHnj) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strHnj)) {
            fc.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(dnm.this.orl.hnj("dyn_draw_engine_url", dnm.ojm), strOptString)) {
                        com.bytedance.sdk.component.adexpress.hnj.hn.sk.hn().qor();
                    }
                }
            }, 5000L);
        }
        hnjVar.hnj("dyn_draw_engine_url", strOptString);
    }

    public int hnj(String str) {
        if (str == null) {
            return 0;
        }
        return oj.gjv().tgn(str).f14193xn;
    }

    public int hnj(int i10) {
        return tgn(String.valueOf(i10)).pty;
    }

    public void hnj(long j10) {
        this.orl.hn().hnj("last_req_time", j10).hnj();
    }

    public void hnj(final int i10, boolean z10) {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().gjv()) {
            return;
        }
        if (!fc.sk() && i10 != 1 && i10 != 2) {
            if (z10) {
                this.f14181oj = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ta.hn().gjv())) {
                return;
            }
            if (this.f14181oj) {
                this.f14181oj = false;
                if (!z10) {
                    z10 = true;
                }
            }
            long jJo = jo();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jTh = th();
            long j10 = jCurrentTimeMillis - jJo;
            if ((z10 || j10 >= jTh) && this.mjg.compareAndSet(false, true)) {
                ua.qor((Runnable) new com.bytedance.sdk.component.aq.hn.qor("setting_req") { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.ta.hn.hnj().hnj(new com.bytedance.sdk.openadsdk.core.ta.gjv() { // from class: com.bytedance.sdk.openadsdk.core.settings.dnm.6.1
                            @Override // com.bytedance.sdk.openadsdk.core.ta.gjv
                            public void hnj(boolean z11) {
                                if (!z11) {
                                    dnm.this.mjg.set(false);
                                } else {
                                    dnm dnmVar = dnm.this;
                                    new ojm(dnmVar, dnmVar.orl, dnm.this.bug).run();
                                }
                            }
                        }, i10 == 6);
                    }
                });
                fc.hn().removeCallbacks(this.apu);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("settings request error", "settings", th2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ojm.hnj
    public void hnj(boolean z10) {
        this.mjg.set(false);
        fzb();
        if (z10) {
            HashMap map = new HashMap();
            Set<String> setVk = vk();
            if (setVk != null && !setVk.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setVk);
            }
            String strOj = orp.oj();
            if (!TextUtils.isEmpty(strOj)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strOj);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, mw());
            com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(map);
        }
    }

    public static void hnj(ta.hnj hnjVar) {
        ConcurrentLinkedQueue<ta.hnj> concurrentLinkedQueue = f14179xn;
        if (concurrentLinkedQueue.contains(hnjVar)) {
            return;
        }
        concurrentLinkedQueue.add(hnjVar);
    }
}
