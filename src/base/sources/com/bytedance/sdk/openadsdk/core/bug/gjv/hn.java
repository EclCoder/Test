package com.bytedance.sdk.openadsdk.core.bug.gjv;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.jip;
import com.bytedance.adsdk.ugeno.core.orl;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.bytedance.adsdk.ugeno.hn.qor;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hn implements jip, hnj.InterfaceC0208hnj {
    protected static int hnj = 8;
    private boolean apu = true;
    private String aq;
    private String bug;
    private String dkl;
    private com.bytedance.sdk.openadsdk.core.bug.dse.hnj dnm;
    private String dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private float f13614fc;
    private final as gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private hnj f13615hn;
    private float jip;
    private float mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private long f13616oj;
    private JSONObject ojm;
    private View orl;
    private final Activity qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.bug.aq.hnj f13617sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.bug.dse.hn f13618ta;
    private float uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private long f13619xn;

    public hn(Activity activity, as asVar, com.bytedance.sdk.openadsdk.core.bug.aq.hnj hnjVar, String str, com.bytedance.sdk.openadsdk.core.bug.dse.hn hnVar) {
        this.qor = activity;
        this.bug = str;
        this.gjv = asVar;
        this.f13618ta = hnVar;
        this.f13617sk = hnjVar;
    }

    private void hn() {
        int iRg = this.gjv.rg();
        if (iRg != 2 && iRg != 3) {
            if (iRg == 4) {
                gjv.hnj(this.qor, this.bug).hnj(this.gjv);
                return;
            } else {
                if (iRg != 5) {
                    return;
                }
                orp.hn(this.qor, this.gjv.sh());
                return;
            }
        }
        if (iRg == 3) {
            String strXe = this.gjv.xe();
            if (!TextUtils.isEmpty(strXe) && strXe.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn.hnj(this.qor, strXe, strXe.substring(strXe.indexOf("?id=") + 4), this.bug, this.gjv)) {
                    return;
                }
            }
        }
        Activity activity = this.qor;
        as asVar = this.gjv;
        int iHnj = orp.hnj(this.bug);
        String str = this.bug;
        com.bytedance.sdk.openadsdk.core.orp.hnj(activity, asVar, iHnj, null, null, str, gjv.hnj(this.qor, str), true, 0);
    }

    public void hnj() {
        if (this.gjv == null) {
            this.f13618ta.hnj(1, "material is null", "net");
            return;
        }
        if (this.f13617sk == null) {
            this.f13618ta.hnj(1, "material ugen template is null", "net");
            return;
        }
        this.f13615hn = new hnj(this.qor);
        this.aq = this.f13617sk.qor();
        this.dkl = this.f13617sk.hnj();
        this.dse = this.f13617sk.hn();
        this.ojm = this.gjv.orl(true);
        this.f13618ta.hnj(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj().hnj(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.aq, this.dkl, this.dse, "", new com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.core.bug.gjv.hn.1
            @Override // com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj
            public void hnj(JSONObject jSONObject, String str) {
                hn hnVar = hn.this;
                hnVar.hnj(jSONObject, hnVar.ojm);
                hn.this.f13618ta.hn(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.hnj.hn.hnj
            public void hnj(int i10, String str, String str2) {
                hn.this.f13618ta.hnj(i10, str, str2);
            }
        });
    }

    public void hnj(View view) {
        this.orl = view;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.bug.dse.hnj hnjVar) {
        this.dnm = hnjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f13615hn.hnj((hnj.InterfaceC0208hnj) this);
        this.f13615hn.hnj((jip) this);
        this.f13618ta.hnj();
        this.f13615hn.hnj(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.bug.dse.gjv() { // from class: com.bytedance.sdk.openadsdk.core.bug.gjv.hn.2
            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.gjv
            public void hnj(int i10, String str) {
                if (hn.this.f13618ta != null) {
                    hn.this.f13618ta.hnj(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.bug.dse.gjv
            public void hnj(qor<View> qorVar) {
                if (hn.this.f13618ta != null) {
                    hn.this.f13618ta.hnj(qorVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.gjv.hnj.InterfaceC0208hnj
    public void hnj(orl orlVar) {
        String strOptString = orlVar.qor().optString("type");
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                if (this.qor != null && !TextUtils.isEmpty(oj.gjv().cm())) {
                    TTWebsiteActivity.hnj(this.qor, this.gjv, this.bug);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.bug.dse.hnj hnjVar = this.dnm;
                if (hnjVar != null) {
                    hnjVar.hn();
                    break;
                }
                break;
            case "creative":
                if (this.qor != null && this.gjv != null) {
                    hn();
                    ComponentCallbacks2 componentCallbacks2 = this.qor;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hn) {
                        ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hn) componentCallbacks2).mkl();
                    }
                    hnj(orlVar, this.gjv);
                    break;
                }
                break;
        }
    }

    private void hnj(orl orlVar, as asVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.mjg);
            jSONObject.put("down_y", this.f13614fc);
            jSONObject.put(WwUgngZLNA.fNwPRQuUkDii, this.f13616oj);
            jSONObject.put("up_x", this.jip);
            jSONObject.put("up_y", this.uua);
            jSONObject.put("up_time", this.f13619xn);
            View viewDnm = orlVar.hnj().dnm();
            int i10 = 1;
            if (viewDnm != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewDnm.getWidth();
                float height = viewDnm.getHeight();
                viewDnm.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(TtmlNode.LEFT, f10);
                jSONObject2.put("top", f11);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.orl;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.orl.getWidth());
                jSONObject.put("button_height", this.orl.getHeight());
            }
            View viewFindViewById = this.qor.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", orlVar.hnj().ua());
            jSONObject.put("brick_id", orlVar.hnj().ul());
            jSONObject.put(PvZsvNiPV.ntOFPjajXAK, this.dkl);
            jSONObject.put("click_scence", 2);
            if (!this.apu) {
                i10 = 2;
            }
            jSONObject.put("user_behavior_type", i10);
            com.bytedance.sdk.openadsdk.core.bug.dse.hnj hnjVar = this.dnm;
            if (hnjVar != null) {
                jSONObject.put("endcard_type", hnjVar.hnj());
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, this.bug, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.jip
    public void hnj(qor qorVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13616oj = System.currentTimeMillis();
            this.mjg = motionEvent.getRawX();
            this.f13614fc = motionEvent.getRawY();
            this.apu = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.mjg) >= hnj || Math.abs(motionEvent.getRawY() - this.f13614fc) >= hnj) {
                this.apu = false;
                return;
            }
            return;
        }
        this.jip = motionEvent.getRawX();
        this.uua = motionEvent.getRawY();
        if (Math.abs(this.jip - this.mjg) >= hnj || Math.abs(this.uua - this.f13614fc) >= hnj) {
            this.apu = false;
        }
        this.f13619xn = System.currentTimeMillis();
    }
}
