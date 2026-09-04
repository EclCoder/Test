package com.bytedance.sdk.openadsdk.as;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.aq;
import com.bytedance.sdk.component.utils.eum;
import com.bytedance.sdk.component.utils.tgn;
import com.bytedance.sdk.openadsdk.core.Cdo;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.core.settings.ojm;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.bytedance.sdk.openadsdk.utils.wu;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.pgl.ssdk.ces.out.PglSSConfig;
import f8.Ygx.FuoITeVPeXAj;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class sk {
    private static volatile gjv gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static String f13259hn;
    private static final AtomicBoolean qor = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, Object> hnj = new ConcurrentHashMap<>();

    public static boolean aq() {
        return hnj("no_call_close", 0) == 1;
    }

    public static int dkl() {
        if (hn()) {
            return hnj("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    private static gjv dnm() {
        return hnj(oj.hnj(), ta.hn().gjv());
    }

    public static boolean dse() {
        return hnj("jsb_opt_enable", 0) == 1;
    }

    public static boolean gjv() {
        return hn() && hnj("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    public static boolean hn() {
        return hnj("ad_load_and_render_opt", "enable", 0) == 1;
    }

    public static gjv hnj(final Context context, final String str) {
        if (gjv == null) {
            synchronized (sk.class) {
                try {
                    if (gjv == null) {
                        try {
                            gjv gjvVar = new gjv(new dkl() { // from class: com.bytedance.sdk.openadsdk.as.sk.1
                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public boolean aq() {
                                    return com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk();
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public JSONObject dkl() {
                                    try {
                                        JSONObject jSONObjectHnj = ojm.hnj(tgn.hnj(oj.hnj(), 0L));
                                        if (!jSONObjectHnj.has(MBridgeConstans.APP_ID)) {
                                            if (!TextUtils.isEmpty(str)) {
                                                jSONObjectHnj.put(MBridgeConstans.APP_ID, str);
                                            } else {
                                                if (TextUtils.isEmpty(ta.hn().gjv())) {
                                                    return null;
                                                }
                                                jSONObjectHnj.put(MBridgeConstans.APP_ID, ta.hn().gjv());
                                            }
                                        }
                                        return Cdo.hnj(PangleEncryptConstant.CryptDataScene.STRATEGY, jSONObjectHnj);
                                    } catch (Throwable th2) {
                                        apu.qor("StrategyUtils", th2.getMessage());
                                        return null;
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public Map<String, String> dse() {
                                    HashMap map = new HashMap();
                                    map.put(Command.HTTP_HEADER_USER_AGENT, orp.gjv());
                                    String strHn = com.bytedance.sdk.openadsdk.xn.gjv.hnj.hn("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                    if (!strHn.isEmpty()) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ipv6", strHn);
                                        } catch (JSONException unused) {
                                        }
                                        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new tu(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                        if (jSONObjectEncryptType4 != null) {
                                            map.put("transfer-param", jSONObjectEncryptType4.optString(PglCryptUtils.KEY_MESSAGE));
                                            if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                                map.put("cypher", "4");
                                            } else {
                                                map.put("cypher", "3");
                                            }
                                        }
                                    }
                                    try {
                                        map.put("x-pangle-target-idc", dnm.hn().mw());
                                    } catch (Throwable unused2) {
                                    }
                                    return map;
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public Handler gjv() {
                                    return fc.hn();
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public Context hn() {
                                    Context context2 = context;
                                    return context2 != null ? context2 : oj.hnj();
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public ExecutorService hnj() {
                                    return ua.sk();
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public String qor() {
                                    if (eum.hnj(hn())) {
                                        return "pag_adn_strategy_center";
                                    }
                                    return "pag_adn_strategy_center_" + eum.qor(hn());
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public String sk() {
                                    String strHnj = orp.hnj("/api/ad/union/sdk/strategies/adn", false, true);
                                    sk.f13259hn = strHnj;
                                    return strHnj;
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public JSONObject hnj(JSONObject jSONObject) {
                                    String strHnj = Cdo.hnj(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                                    if (!TextUtils.isEmpty(strHnj)) {
                                        try {
                                            return new JSONObject(strHnj);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    return jSONObject;
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.dkl
                                public HandlerThread hnj(String str2, int i10) {
                                    return aq.hnj(str2, i10);
                                }
                            });
                            gjv = gjvVar;
                            gjvVar.hnj(new hnj() { // from class: com.bytedance.sdk.openadsdk.as.sk.2
                                @Override // com.bytedance.sdk.openadsdk.as.hnj
                                public void hn() {
                                    com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.as.sk.2.2
                                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                            hnjVar.hn("strategy_fetch");
                                            return hnjVar;
                                        }
                                    });
                                    com.bytedance.sdk.openadsdk.dkl.hnj.hnj().hn();
                                    com.bytedance.sdk.openadsdk.wu.hnj.qor.hnj().hn();
                                    wu.hn();
                                    HashMap map = new HashMap();
                                    String strHnj = sk.hnj(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                    if (!TextUtils.isEmpty(strHnj)) {
                                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strHnj);
                                    }
                                    com.bytedance.sdk.openadsdk.core.dnm.qor.hnj(map);
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.hnj
                                public void hnj() {
                                    com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.as.sk.2.1
                                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                            hnjVar.hn("strategy_fetch");
                                            return hnjVar;
                                        }
                                    });
                                }

                                @Override // com.bytedance.sdk.openadsdk.as.hnj
                                public void hnj(int i10, String str2) {
                                    com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.as.sk.2.3
                                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                            hnjVar.hn("strategy_fetch");
                                            return hnjVar;
                                        }
                                    });
                                    wu.hnj(sk.f13259hn);
                                }
                            });
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return gjv;
    }

    public static boolean ojm() {
        return hnj("iv_rv_listen_new_arch", 0) == 1;
    }

    public static boolean qor() {
        return hn() && hnj("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static int sk() {
        if (hn()) {
            return hnj("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    public static boolean ta() {
        return hnj("iv_rv_top_bar_listen_new", 0) == 1;
    }

    public static int hnj(String str, int i10) {
        gjv gjvVarDnm = dnm();
        return gjvVarDnm != null ? gjvVarDnm.hnj(str, i10) : i10;
    }

    public static boolean hnj(String str, boolean z10) {
        gjv gjvVarDnm = dnm();
        return gjvVarDnm != null ? gjvVarDnm.hnj(str, z10) : z10;
    }

    public static String hnj(String str, String str2) {
        gjv gjvVarDnm = dnm();
        return gjvVarDnm != null ? gjvVarDnm.hnj(str, str2) : str2;
    }

    public static <T> T hnj(String str, T t10, hn.hnj<T> hnjVar) {
        gjv gjvVarDnm = dnm();
        return gjvVarDnm != null ? (T) gjvVarDnm.hnj(str, t10, hnjVar) : t10;
    }

    public static int hnj(String str, String str2, int i10) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + FuoITeVPeXAj.zwFNJVPgYBx + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = hnj;
            Object obj = concurrentHashMap.get(str3);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strHnj = dnm().hnj(str, "");
                if (!TextUtils.isEmpty(strHnj)) {
                    int iOptInt = new JSONObject(strHnj).optInt(str2, i10);
                    concurrentHashMap.put(str3, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th2) {
                apu.qor("StrategyUtils", th2.getMessage());
            }
        }
        return i10;
    }

    public static String hnj(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str4 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = hnj;
            Object obj = concurrentHashMap.get(str4);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strHnj = dnm().hnj(str, "");
                if (!TextUtils.isEmpty(strHnj)) {
                    String strOptString = new JSONObject(strHnj).optString(str2, str3);
                    concurrentHashMap.put(str4, strOptString);
                    return strOptString;
                }
            } catch (Throwable th2) {
                apu.qor("StrategyUtils", th2.getMessage());
            }
        }
        return str3;
    }

    public static void hnj() {
        gjv gjvVarDnm;
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk() || (gjvVarDnm = dnm()) == null || qor.getAndSet(true)) {
            return;
        }
        gjvVarDnm.hnj();
    }
}
