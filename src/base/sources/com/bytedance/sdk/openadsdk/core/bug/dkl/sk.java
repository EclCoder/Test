package com.bytedance.sdk.openadsdk.core.bug.dkl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.oj;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.xn;
import com.bytedance.sdk.openadsdk.utils.orp;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private final as aq;
    private final JSONObject bug;
    private JSONObject dnm;
    private final Context dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f13610fc;
    private com.bytedance.adsdk.ugeno.hn.qor gjv;
    private JSONArray jip;
    private boolean mjg;
    private final String ojm;
    private boolean orl;
    private com.bytedance.adsdk.ugeno.hn.qor qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.hn.qor f13612sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.sk f13613ta;
    private int hnj = -1;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13611hn = -1;
    private final String dkl = "UGenSwiperEvent";

    public sk(Context context, as asVar, String str, JSONObject jSONObject) {
        this.dse = context;
        this.aq = asVar;
        this.ojm = str;
        this.bug = jSONObject;
    }

    public JSONObject gjv() {
        return this.dnm;
    }

    public void hn() {
        int i10;
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.f13612sk;
        if (!(qorVar instanceof com.bytedance.adsdk.ugeno.qor) || (i10 = this.hnj) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.qor) qorVar).hnj(i10 - 1);
    }

    public void qor() {
        int i10;
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.f13612sk;
        if (!(qorVar instanceof com.bytedance.adsdk.ugeno.qor) || (i10 = this.hnj) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.qor) qorVar).hnj(i10 + 1);
    }

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor<View> qorVar) {
        com.bytedance.adsdk.ugeno.hn.qor<T> qorVarSk = qorVar.sk("swiperLayout");
        this.f13612sk = qorVarSk;
        if (qorVarSk instanceof com.bytedance.adsdk.ugeno.qor) {
            this.jip = this.bug.optJSONArray("dpa_data");
            this.qor = qorVar.sk("swiperLeftArrow");
            this.gjv = qorVar.sk("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.qor) this.f13612sk).hnj(new com.bytedance.adsdk.ugeno.dkl.qor() { // from class: com.bytedance.sdk.openadsdk.core.bug.dkl.sk.1
                @Override // com.bytedance.adsdk.ugeno.dkl.qor
                public void hnj(boolean z10, int i10) {
                }

                @Override // com.bytedance.adsdk.ugeno.dkl.qor
                public void hnj(boolean z10, int i10, float f10, int i11) {
                }

                @Override // com.bytedance.adsdk.ugeno.dkl.qor
                public void hnj(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                    sk.this.f13611hn = i10;
                    sk.this.hnj = i11;
                    sk.this.orl = z10;
                    sk.this.mjg = z11;
                    sk.this.f13610fc = z12;
                    sk.this.hnj(z10, z11, z12);
                    sk.this.hnj(i10);
                }
            });
        }
    }

    public void hnj() {
        hnj(this.orl, this.mjg, this.f13610fc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(boolean z10, boolean z11, boolean z12) {
        com.bytedance.adsdk.ugeno.hn.qor qorVar = this.qor;
        if (qorVar == null || this.gjv == null) {
            return;
        }
        View viewDnm = qorVar.dnm();
        View viewDnm2 = this.gjv.dnm();
        JSONArray jSONArray = this.jip;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewDnm.setVisibility(8);
            viewDnm2.setVisibility(8);
            return;
        }
        if (z10) {
            return;
        }
        if (z11) {
            if (viewDnm instanceof TextView) {
                hnj((TextView) viewDnm, 90);
            }
            if (viewDnm2 instanceof TextView) {
                hnj((TextView) viewDnm2, 255);
                return;
            }
            return;
        }
        if (z12) {
            if (viewDnm instanceof TextView) {
                hnj((TextView) viewDnm, 255);
            }
            if (viewDnm2 instanceof TextView) {
                hnj((TextView) viewDnm2, 90);
                return;
            }
            return;
        }
        if (viewDnm instanceof TextView) {
            hnj((TextView) viewDnm, 255);
        }
        if (viewDnm2 instanceof TextView) {
            hnj((TextView) viewDnm2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i10);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.aq, this.ojm, "carousel_show", jSONObject);
    }

    private void hnj(TextView textView, int i10) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i10, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.widget.sk skVar) {
        this.f13613ta = skVar;
    }

    public boolean hnj(orl orlVar) {
        JSONObject jSONObjectOptJSONObject;
        this.dnm = null;
        int i10 = this.f13611hn;
        if (i10 != -1 && i10 != 0) {
            try {
                JSONObject jSONObjectQor = orlVar.qor();
                if (jSONObjectQor != null && (jSONObjectOptJSONObject = jSONObjectQor.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.jip != null) {
                            String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectOptJSONObject.optString("url"), this.jip.optJSONObject(this.f13611hn));
                            String strHnj2 = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectOptJSONObject.optString("fallback_url"), this.jip.optJSONObject(this.f13611hn));
                            jSONObjectOptJSONObject.put("url", strHnj);
                            jSONObjectOptJSONObject.put("fallback_url", strHnj2);
                            hnj(jSONObjectOptJSONObject, this.jip.optJSONObject(this.f13611hn));
                        }
                        hnj(jSONObjectOptJSONObject, orlVar.hnj().dnm());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th2) {
                apu.qor("UGenSwiperEvent", th2.getMessage());
            }
        }
        return false;
    }

    private void hnj(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.dnm = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.dnm.putOpt(next, com.bytedance.adsdk.ugeno.qor.hn.hnj((String) this.dnm.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.dnm);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[RETURN] */
    private boolean hnj(int i10, String str, String str2) {
        if (i10 == 1) {
            if (!oj.hnj(str)) {
                return false;
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                if (!oj.hnj(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !oj.hnj(str2)) {
            return false;
        }
        return true;
    }

    private void hnj(JSONObject jSONObject, View view) {
        if (hnj(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            xn.hnj(hnj(view), this.dse instanceof Activity, jSONObject, this.aq, this.ojm, orp.hnj(this.ojm), null, this.f13613ta);
        }
    }

    private Context hnj(View view) {
        Activity activityHnj = view != null ? com.bytedance.sdk.component.utils.hn.hnj(view) : null;
        return activityHnj == null ? this.dse : activityHnj;
    }
}
