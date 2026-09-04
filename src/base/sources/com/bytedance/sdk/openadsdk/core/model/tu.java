package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class tu {
    private JSONObject bug;
    private int dkl;
    private boolean dnm;
    private JSONObject dse;
    private int gjv;
    private int hnj;
    private int mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private gm f13997oj;
    private String ojm;
    private int orl;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13998sk;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private hn f14000xn;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13996hn = 10;
    private int aq = 1;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private hnj f13999ta = new hnj();

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private int f13995fc = 1;
    private String jip = "Next Ad";
    private String uua = "Next ad in %1$ds";

    public static tu hnj(String str) {
        tu tuVar = new tu();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                tuVar.hnj = jSONObject.optInt("auto_switch");
                tuVar.f13996hn = jSONObject.optInt("playable_preload_count");
                tuVar.qor = jSONObject.optInt("disable_on_interaction");
                tuVar.gjv = jSONObject.optInt("ceiling_type");
                tuVar.f13998sk = jSONObject.optInt("can_loop");
                tuVar.dkl = jSONObject.optInt("multi_skip_time", -1);
                tuVar.aq = jSONObject.optInt("load_more_strategy");
                tuVar.f13995fc = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                tuVar.dse = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    gm gmVarHnj = gm.hnj(jSONObjectOptJSONObject);
                    tuVar.f13997oj = gmVarHnj;
                    if (gmVarHnj != null && !TextUtils.isEmpty(gmVarHnj.qor())) {
                        com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj(new com.bytedance.sdk.openadsdk.core.bug.aq.hnj().hnj(tuVar.f13997oj.hnj()).hn(tuVar.f13997oj.hn()).qor(tuVar.f13997oj.qor()).gjv(tuVar.f13997oj.gjv()), "guide");
                    }
                    int iOptInt = tuVar.dse.optInt("delay_show_time", 5);
                    tuVar.orl = iOptInt;
                    if (iOptInt < 0) {
                        tuVar.orl = 5;
                    }
                    int iOptInt2 = tuVar.dse.optInt("dismiss_after_idle_time", 3);
                    tuVar.mjg = iOptInt2;
                    if (iOptInt2 <= 0) {
                        tuVar.mjg = 3;
                    }
                }
                tuVar.ojm = jSONObject.optString("agg_endcard_url");
                tuVar.dnm = jSONObject.optBoolean("has_more");
                tuVar.bug = jSONObject.optJSONObject("session_params");
                tuVar.f13999ta = hnj.hnj(jSONObject.optJSONObject("layout_config"));
                tuVar.f14000xn = hn.hnj(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return tuVar;
    }

    public int aq() {
        return this.aq;
    }

    public JSONObject bug() {
        return this.bug;
    }

    public hnj dkl() {
        return this.f13999ta;
    }

    public boolean dnm() {
        return this.gjv == 1;
    }

    public String dse() {
        return this.ojm;
    }

    public boolean fc() {
        return this.hnj == 1;
    }

    public int gjv() {
        return this.orl;
    }

    public JSONObject hn() {
        gm gmVar = this.f13997oj;
        if (gmVar == null) {
            return null;
        }
        try {
            String strGjv = gmVar.gjv();
            if (!TextUtils.isEmpty(strGjv)) {
                return new JSONObject(strGjv);
            }
            String strHnj = com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj("guide", this.f13997oj.hnj(), this.f13997oj.hn());
            if (TextUtils.isEmpty(strHnj)) {
                return null;
            }
            return new JSONObject(strHnj);
        } catch (JSONException unused) {
            return null;
        }
    }

    public int jip() {
        return this.f13996hn;
    }

    public boolean mjg() {
        return this.qor == 1;
    }

    public int ojm() {
        return this.dkl;
    }

    public boolean orl() {
        return this.dnm;
    }

    public JSONObject qor() {
        gm gmVar = this.f13997oj;
        if (gmVar == null) {
            return null;
        }
        return gmVar.sk();
    }

    public int sk() {
        return this.mjg;
    }

    public boolean ta() {
        return this.f13998sk == 1;
    }

    public hn uua() {
        return this.f14000xn;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn {
        private float gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f14001hn;
        private int hnj;
        private String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private float f14002sk;

        public static hn hnj(JSONObject jSONObject) {
            hn hnVar = new hn();
            if (jSONObject == null) {
                return hnVar;
            }
            hnVar.hnj = jSONObject.optInt("progress_type", 0);
            hnVar.f14001hn = jSONObject.optString("progress_color");
            hnVar.qor = jSONObject.optString("progress_background_color");
            hnVar.gjv = jSONObject.optInt("progress_size", 0);
            hnVar.f14002sk = jSONObject.optInt("bar_radius", 0);
            return hnVar;
        }

        public float gjv() {
            return this.gjv;
        }

        public String hn() {
            return this.f14001hn;
        }

        public String qor() {
            return this.qor;
        }

        public float sk() {
            return this.f14002sk;
        }

        public int hnj() {
            return this.hnj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private int gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private int f14003hn;
        private int hnj;
        private int qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private int f14004sk;

        public static hnj hnj(JSONObject jSONObject) {
            hnj hnjVar = new hnj();
            if (jSONObject == null) {
                return hnjVar;
            }
            hnjVar.hnj = Math.max(0, jSONObject.optInt("padding_left", 0));
            hnjVar.f14003hn = Math.max(0, jSONObject.optInt("padding_right", 0));
            hnjVar.qor = Math.max(0, jSONObject.optInt("padding_top", 0));
            hnjVar.gjv = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            hnjVar.f14004sk = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return hnjVar;
        }

        public int gjv() {
            return this.f14003hn;
        }

        public int hn() {
            return this.qor;
        }

        public int qor() {
            return this.hnj;
        }

        public int sk() {
            return this.f14004sk;
        }

        public int hnj() {
            return this.gjv;
        }
    }

    public boolean hnj() {
        return this.f13995fc == 1;
    }
}
