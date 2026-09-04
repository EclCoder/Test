package com.bytedance.sdk.openadsdk.gjv;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.utils.tgn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import f8.Ygx.FuoITeVPeXAj;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj implements com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hn {
    private com.bytedance.sdk.openadsdk.gjv.hn.hnj apu;
    private int aq;
    private int as;
    private final AtomicBoolean bug;
    private final String dkl;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private String f49do;
    private int dse;
    private String eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private String f14354fc;
    private long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final JSONObject f14355hn;
    public final String hnj;
    private String jip;
    private String mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private String f14356oj;
    private int ojm;
    private JSONObject orl;
    private boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private long f14357sk;
    private List<String> tu;
    private String uua;
    private String wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private String f14358xn;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private static final Set<String> f14353ta = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> dnm = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.gjv.hnj.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.gjv.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C0242hnj {
        private String apu;
        private String aq;
        private final int bug;
        private String dkl;
        private String dnm;
        private String dse;
        private List<String> eum;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.gjv.hn.hnj f14359fc;
        private String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f14360hn;
        public int hnj;
        private final long jip;
        private com.bytedance.sdk.openadsdk.gjv.hn.hn mjg;

        /* JADX INFO: renamed from: oj, reason: collision with root package name */
        private int f14361oj;
        private String ojm;
        private String orl;
        private String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private String f14362sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private JSONObject f14363ta;
        private int uua;

        /* JADX INFO: renamed from: xn, reason: collision with root package name */
        private boolean f14364xn;

        public C0242hnj(long j10, as asVar) {
            this.uua = -1;
            this.f14361oj = -1;
            this.hnj = -1;
            if (asVar != null) {
                this.f14364xn = hqh.hn(asVar);
                this.uua = asVar.fr();
                this.f14361oj = asVar.qb();
                this.hnj = asVar.qri();
            }
            this.jip = j10;
            this.bug = com.bytedance.sdk.component.utils.oj.qor(com.bytedance.sdk.openadsdk.core.oj.hnj());
        }

        public C0242hnj aq(String str) {
            this.apu = str;
            return this;
        }

        public C0242hnj dkl(String str) {
            this.ojm = str;
            return this;
        }

        public C0242hnj dse(String str) {
            this.dse = str;
            return this;
        }

        public C0242hnj gjv(String str) {
            this.f14362sk = str;
            return this;
        }

        public C0242hnj hn(String str) {
            this.qor = str;
            return this;
        }

        public C0242hnj qor(String str) {
            this.gjv = str;
            return this;
        }

        public C0242hnj sk(String str) {
            this.aq = str;
            return this;
        }

        public C0242hnj hnj(String str) {
            this.orl = str;
            return this;
        }

        public C0242hnj hnj(List<String> list) {
            this.eum = list;
            return this;
        }

        public C0242hnj hnj(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f14363ta = jSONObject;
            return this;
        }

        public void hnj(com.bytedance.sdk.openadsdk.gjv.hn.hnj hnjVar) {
            com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj(this.gjv, this.apu, this.dse, this.qor);
            this.f14359fc = hnjVar;
            hnj hnjVar2 = new hnj(this);
            try {
                com.bytedance.sdk.openadsdk.gjv.hn.hn hnVar = this.mjg;
                if (hnVar != null) {
                    hnVar.hnj(hnjVar2.f14355hn, this.jip);
                } else {
                    new com.bytedance.sdk.openadsdk.gjv.hn.qor().hnj(hnjVar2.f14355hn, this.jip);
                }
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj(hnjVar2);
        }
    }

    public hnj(String str, JSONObject jSONObject) {
        this.dkl = "adiff";
        this.bug = new AtomicBoolean(false);
        this.orl = new JSONObject();
        this.hnj = str;
        this.f14355hn = jSONObject;
    }

    private void dse() {
        JSONObject jSONObject = this.orl;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String strOptString2 = this.orl.optString("category");
            String strOptString3 = this.orl.optString("log_extra");
            if (hnj(this.uua, this.jip, this.wu)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !hn(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, MBridgeConstans.ENDCARD_URL_TYPE_PL)) && (TextUtils.isEmpty(this.uua) || TextUtils.equals(this.uua, MBridgeConstans.ENDCARD_URL_TYPE_PL))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.jip) || !hn(this.jip)) && (TextUtils.isEmpty(strOptString2) || !hn(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.wu) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!hnj(this.uua, this.jip, this.wu)) {
            return;
        }
        this.gjv = com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj.incrementAndGet();
    }

    private boolean hn(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean hnj(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, MBridgeConstans.ENDCARD_URL_TYPE_PL) || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    public boolean dkl() {
        Set<String> setOrl;
        if (this.f14355hn == null || (setOrl = com.bytedance.sdk.openadsdk.core.oj.gjv().orl()) == null) {
            return false;
        }
        String strOptString = this.f14355hn.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setOrl.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.f14354fc)) {
            return false;
        }
        return setOrl.contains(this.f14354fc);
    }

    public JSONObject gjv() {
        JSONObject jSONObjectQor = qor();
        try {
            JSONObject jSONObject = new JSONObject(jSONObjectQor.toString());
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject == null) {
                return jSONObject;
            }
            jSONObjectOptJSONObject.remove("app_log_url");
            jSONObjectOptJSONObject.remove("app_log_url_back");
            return jSONObject;
        } catch (JSONException e10) {
            apu.qor("AdEvent", e10.getMessage());
            return jSONObjectQor;
        }
    }

    public JSONObject qor() {
        if (this.bug.get()) {
            return this.f14355hn;
        }
        try {
            aq();
            if (this.f14355hn.has("ad_extra_data")) {
                Object objOpt = this.f14355hn.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.f14355hn.put("ad_extra_data", hnj((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.f14355hn.put("ad_extra_data", hnj(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e10) {
                        apu.qor("AdEvent", "json error", e10.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.hnj);
                    if (this.qor) {
                        jSONObject.put("interaction_method", this.dse);
                        jSONObject.put("real_interaction_method", this.aq);
                        jSONObject.put("image_mode", this.ojm);
                    }
                    this.f14355hn.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e11) {
                    apu.qor("AdEvent", "json error", e11.getMessage());
                }
            }
            this.bug.set(true);
        } catch (Throwable unused) {
        }
        return this.f14355hn;
    }

    public String sk() {
        return this.hnj;
    }

    private void aq() throws JSONException {
        this.f14355hn.putOpt("app_log_url", this.f49do);
        List<String> list = this.tu;
        if (list != null && !list.isEmpty()) {
            try {
                this.f14355hn.putOpt("app_log_url_back", new JSONArray((Collection) this.tu));
            } catch (Throwable th2) {
                apu.qor("AdEvent", th2.getMessage());
            }
        }
        this.f14355hn.putOpt("tag", this.mjg);
        this.f14355hn.putOpt("label", this.f14354fc);
        this.f14355hn.putOpt("category", this.jip);
        if (!TextUtils.isEmpty(this.uua)) {
            try {
                this.f14355hn.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(Long.parseLong(this.uua)));
            } catch (NumberFormatException unused) {
                this.f14355hn.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
            }
        }
        if (!TextUtils.isEmpty(this.f14358xn)) {
            try {
                this.f14355hn.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f14358xn)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.wu)) {
            this.f14355hn.putOpt(NpmRNZ.hnMSBcgGrZByJ, this.wu);
        }
        if (!TextUtils.isEmpty(this.eum)) {
            try {
                this.f14355hn.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.eum)));
            } catch (NumberFormatException unused3) {
            }
        }
        hnj(this.f14355hn, this.f14354fc);
        try {
            if (!this.f14355hn.has("nt")) {
                this.f14355hn.putOpt("nt", Integer.valueOf(this.as));
            }
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.orl.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f14355hn.putOpt(next, this.orl.opt(next));
        }
    }

    private void hn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : dnm.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(dnm.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject hnj(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.hnj);
            }
            if (this.qor) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.dse);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.aq);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.ojm);
                }
            }
            hn(jSONObject);
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.hnj + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            apu.qor("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    hnj(C0242hnj c0242hnj) {
        this.dkl = "adiff";
        this.bug = new AtomicBoolean(false);
        this.orl = new JSONObject();
        if (!TextUtils.isEmpty(c0242hnj.f14360hn)) {
            this.hnj = c0242hnj.f14360hn;
        } else {
            this.hnj = tgn.hnj();
        }
        this.apu = c0242hnj.f14359fc;
        this.wu = c0242hnj.dkl;
        this.mjg = c0242hnj.qor;
        this.f14354fc = c0242hnj.gjv;
        if (!TextUtils.isEmpty(c0242hnj.f14362sk)) {
            this.jip = c0242hnj.f14362sk;
        } else {
            this.jip = "app_union";
        }
        this.eum = c0242hnj.dnm;
        this.uua = c0242hnj.aq;
        this.f14358xn = c0242hnj.ojm;
        this.f14356oj = c0242hnj.dse;
        this.as = c0242hnj.bug;
        this.f49do = c0242hnj.orl;
        this.orl = c0242hnj.f14363ta = c0242hnj.f14363ta != null ? c0242hnj.f14363ta : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f14355hn = jSONObject;
        if (!TextUtils.isEmpty(c0242hnj.orl)) {
            try {
                jSONObject.put("app_log_url", c0242hnj.orl);
            } catch (JSONException e10) {
                apu.qor("AdEvent", e10.getMessage());
            }
        }
        this.tu = c0242hnj.eum;
        if (c0242hnj.eum != null && !c0242hnj.eum.isEmpty()) {
            try {
                this.f14355hn.putOpt("app_log_url_back", new JSONArray((Collection) c0242hnj.eum));
            } catch (Throwable th2) {
                apu.qor("AdEvent", th2.getMessage());
            }
        }
        this.dse = c0242hnj.uua;
        this.aq = c0242hnj.f14361oj;
        this.ojm = c0242hnj.hnj;
        this.qor = c0242hnj.f14364xn;
        this.f14357sk = System.currentTimeMillis();
        dse();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hn
    public long hn() {
        return this.gjv;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hn
    public JSONObject hnj(String str) {
        return qor();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hn
    public long hnj() {
        return this.f14357sk;
    }

    private static void hnj(JSONObject jSONObject, String str) {
        try {
            Set<String> set = f14353ta;
            if (!set.contains(str) && !set.contains(jSONObject.get(FuoITeVPeXAj.nPx))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th2) {
            apu.qor("AdEvent", th2);
        }
    }
}
