package com.bytedance.sdk.openadsdk.jip.hnj;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.oj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.jip.hnj.gjv;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv<T extends gjv> implements qor {
    private String bug;
    private String dnm;
    private String dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f14541hn;
    private String hnj;
    private String ojm;
    private String orl;
    private String qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f14543ta;
    private final String gjv = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f14542sk = System.currentTimeMillis() / 1000;
    private int dkl = 0;
    private int aq = 0;

    private gjv() {
        try {
            this.orl = tgn.hnj();
        } catch (Throwable unused) {
            this.orl = "default";
        }
    }

    private JSONObject fc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, orp.dkl());
            jSONObject.put("ua", orp.gjv());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static gjv<gjv> hn() {
        return new gjv<>();
    }

    public long aq() {
        return this.f14542sk;
    }

    public String bug() {
        return this.ojm;
    }

    public String dkl() {
        return this.qor;
    }

    public int dnm() {
        return this.aq;
    }

    public String dse() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String gjv() {
        return this.dnm;
    }

    @Override // com.bytedance.sdk.openadsdk.jip.hnj.qor
    public JSONObject hnj() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", dse());
            jSONObject2.put("app_version", orp.aq());
            jSONObject2.put(CampaignEx.JSON_KEY_TIMESTAMP, aq());
            jSONObject2.put("conn_type", oj.hn(com.bytedance.sdk.openadsdk.core.oj.hnj()));
            jSONObject2.put("appid", TextUtils.isEmpty(ta.hn().gjv()) ? "" : ta.hn().gjv());
            jSONObject2.put("device_info", fc());
            if (!TextUtils.isEmpty(qor())) {
                jSONObject2.put("type", qor());
            }
            jSONObject2.put("error_code", dnm());
            if (!TextUtils.isEmpty(bug())) {
                jSONObject2.put("error_msg", bug());
            }
            if (!TextUtils.isEmpty(sk())) {
                jSONObject2.put("rit", sk());
            }
            if (!TextUtils.isEmpty(dkl())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, dkl());
            }
            if (ojm() > 0) {
                jSONObject2.put("adtype", ojm());
            }
            if (!TextUtils.isEmpty(ta())) {
                jSONObject2.put("req_id", ta());
            }
            if (!TextUtils.isEmpty(orl())) {
                jSONObject2.put("extra", orl());
            }
            String strGjv = gjv();
            if (TextUtils.isEmpty(strGjv)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strGjv);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.orl + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strGjv)) {
                jSONObject2.put("event_extra", strGjv);
            }
            if (!TextUtils.isEmpty(mjg())) {
                jSONObject2.put("duration", mjg());
            }
        } catch (Throwable th2) {
            apu.qor("LogStatsBase", th2.getMessage());
        }
        return jSONObject2;
    }

    public String mjg() {
        return this.bug;
    }

    public int ojm() {
        return this.dkl;
    }

    public String orl() {
        return this.f14543ta;
    }

    public String qor() {
        return this.hnj;
    }

    public String sk() {
        return this.f14541hn;
    }

    public String ta() {
        return this.dse;
    }

    public T aq(String str) {
        this.bug = str;
        return (T) jip();
    }

    public T dkl(String str) {
        this.ojm = str;
        return (T) jip();
    }

    public T dse(String str) {
        this.f14543ta = str;
        return (T) jip();
    }

    public T gjv(String str) {
        this.qor = str;
        return (T) jip();
    }

    public T hn(String str) {
        this.dnm = str;
        return (T) jip();
    }

    public T qor(String str) {
        this.f14541hn = str;
        return (T) jip();
    }

    public T sk(String str) {
        this.dse = str;
        return (T) jip();
    }

    public T hn(int i10) {
        this.aq = i10;
        return (T) jip();
    }

    private T jip() {
        return this;
    }

    public T hnj(String str) {
        this.hnj = str;
        return (T) jip();
    }

    public T hnj(int i10) {
        this.dkl = i10;
        return (T) jip();
    }
}
