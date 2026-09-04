package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.tgn;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Cdo;
import com.bytedance.sdk.openadsdk.core.bug;
import com.bytedance.sdk.openadsdk.core.gm;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.hqh;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.wu;
import com.coremedia.iso.boxes.UserBox;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import w6.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends com.bytedance.sdk.component.aq.hn.qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final aq f14194hn;
    private final hnj hnj;
    private final Set<sk> qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(boolean z10);
    }

    public ojm(hnj hnjVar, aq aqVar, sk... skVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.qor = hashSet;
        this.hnj = hnjVar;
        this.f14194hn = aqVar;
        hashSet.addAll(Arrays.asList(skVarArr));
    }

    private JSONObject hn(JSONObject jSONObject) {
        return Cdo.hnj(PangleEncryptConstant.CryptDataScene.SETTINGS, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iHnj = tgn.hnj(oj.hnj(), 0L);
        if (iHnj == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.hnj.hnj(false);
            return;
        }
        JSONObject jSONObjectHnj = hnj(iHnj);
        com.bytedance.sdk.component.dse.hn.gjv gjvVarHn = com.bytedance.sdk.openadsdk.apu.hn.hn().qor().hn();
        try {
            gjvVarHn.qor(com.bytedance.sdk.openadsdk.ojm.gjv.hnj(gjvVarHn, orp.hnj("/api/ad/union/sdk/settings/", false, true)));
            gjvVarHn.hn(Command.HTTP_HEADER_USER_AGENT, orp.gjv());
        } catch (Exception unused) {
        }
        String string = hn(jSONObjectHnj).toString();
        if (oj.gjv().izk() && gm.hnj().gjv() == 1) {
            orp.hnj("Pangle_Debug_Mode", string, oj.hnj());
        }
        gjvVarHn.hnj(string, oj.gjv().uua());
        gjvVarHn.hnj(6);
        gjvVarHn.hn("setting");
        com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.settings.ojm.1
            @Override // com.bytedance.sdk.openadsdk.oj.gjv
            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                hnjVar.hn("settings_fetch");
                return hnjVar;
            }
        });
        gjvVarHn.hnj(new com.bytedance.sdk.component.dse.hnj.hnj() { // from class: com.bytedance.sdk.openadsdk.core.settings.ojm.2
            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, com.bytedance.sdk.component.dse.hn hnVar) {
                JSONObject jSONObject;
                int iHnj2 = hnVar.hnj();
                String strGjv = hnVar.gjv();
                if (oj.gjv().izk() && gm.hnj().gjv() == 1) {
                    orp.hnj("Pangle_Debug_Mode", strGjv, oj.hnj());
                }
                if (hnVar.dkl() && !TextUtils.isEmpty(strGjv)) {
                    try {
                        jSONObject = new JSONObject(strGjv);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        String strHnj = Cdo.hnj(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strHnj)) {
                            try {
                                jSONObject = new JSONObject(strHnj);
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            ojm.this.hnj(strHnj, hnVar.qor());
                        } catch (Throwable unused4) {
                        }
                        try {
                            ojm.this.hnj(jSONObject);
                            oj.gjv().hnj(System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.settings.ojm.2.1
                                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                                    hnjVar.hn("settings_fetch");
                                    return hnjVar;
                                }
                            });
                            wu.hn();
                        } catch (Throwable unused5) {
                        }
                        ojm.this.hnj.hnj(true);
                        return;
                    }
                } else if (qorVar != null) {
                    wu.hnj(qorVar.sk());
                }
                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.settings.ojm.2.2
                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                        hnjVar.hn("settings_fetch");
                        return hnjVar;
                    }
                });
                if (!hnVar.dkl()) {
                    com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("settings_fetch", qorVar.sk(), iHnj2, hnVar.hn(), null, null);
                }
                ojm.this.hnj.hnj(false);
            }

            @Override // com.bytedance.sdk.component.dse.hnj.hnj
            public void hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, IOException iOException) {
                ojm.this.hnj.hnj(false);
                com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.core.settings.ojm.2.3
                    @Override // com.bytedance.sdk.openadsdk.oj.gjv
                    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                        hnjVar.hn("settings_fetch");
                        return hnjVar;
                    }
                });
                if (qorVar != null) {
                    wu.hnj(qorVar.sk());
                    com.bytedance.sdk.openadsdk.jip.hnj.sk.hnj("settings_fetch", qorVar.sk(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                }
            }
        });
        bug.hn(orl.hnj(oj.hnj()));
        DeviceUtils.bug();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(String str, Map<String, String> map) {
        int i10 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str2 = (String) map2.get("active-control");
                if (str2 != null) {
                    int i11 = Integer.parseInt(str2);
                    String str3 = (String) map2.get(CampaignEx.JSON_KEY_ST_TS);
                    if (str3 != null) {
                        long j10 = Long.parseLong(str3);
                        String str4 = (String) map2.get("pst");
                        String strA = b.a(str + i11 + j10);
                        if (strA != null && strA.equalsIgnoreCase(str4)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        dse.hnj(i10);
    }

    public static JSONObject hnj(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            dnm dnmVarGjv = oj.gjv();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", orp.as());
            com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hnj(jSONObject);
            if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().dnm()) {
                jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.ta.hn().ta());
            }
            if (dnmVarGjv.xyo("mcc")) {
                jSONObject.put("mcc", hqh.hn());
            }
            Context contextHnj = oj.hnj();
            jSONObject.put("conn_type", orp.dse(i10));
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", orl.hn());
            jSONObject.put("time_zone", orp.tgn());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, orp.dkl());
            jSONObject.put("position", orp.hnj() ? 1 : 2);
            jSONObject.put("app_version", orp.aq());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put(UserBox.TYPE, orl.qor(contextHnj));
            String strGjv = com.bytedance.sdk.openadsdk.core.ta.hn().gjv();
            if (strGjv != null) {
                jSONObject.put(MBridgeConstans.APP_ID, strGjv);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(CampaignEx.JSON_KEY_ST_TS, jCurrentTimeMillis);
            String strConcat = "";
            if (strGjv != null) {
                strConcat = strGjv.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.sk.hnj(strConcat));
            jSONObject.put("tcstring", dnm.hn(contextHnj));
            jSONObject.put("tcf_gdpr", dnm.hnj(contextHnj));
            jSONObject.put("lmt", DeviceUtils.qor());
            jSONObject.put("locale_language", DeviceUtils.gjv());
            jSONObject.put("channel", "main");
            JSONObject jSONObjectDkl = dnmVarGjv.dkl();
            if (jSONObjectDkl != null) {
                jSONObject.put("digest", jSONObjectDkl);
            }
            jSONObject.put("data_time", dnmVarGjv.dse());
            jSONObject.put("app_set_id_scope", gjv.hn());
            jSONObject.put("app_set_id", gjv.qor());
            jSONObject.put("installed_source", gjv.gjv());
            jSONObject.put("did", orl.hnj(oj.hnj()));
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
            String strDse = com.bytedance.sdk.openadsdk.core.ta.hn().dse();
            if (!TextUtils.isEmpty(strDse)) {
                jSONObject.put("mediation", strDse);
            }
            jSONObject.put("device", DeviceUtils.hnj(contextHnj, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.ta.hn().wu());
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.ta.hn.hnj().aq());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean hnj(JSONObject jSONObject) throws Throwable {
        this.f14194hn.hnj(jSONObject);
        for (sk skVar : this.qor) {
            if (skVar != null) {
                skVar.hnj(jSONObject);
            }
        }
        return this.f14194hn.qor;
    }
}
