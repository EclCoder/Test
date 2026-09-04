package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.core.xyo;
import com.bytedance.sdk.openadsdk.utils.orp;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj implements com.bytedance.sdk.openadsdk.core.bug.qor.gjv.hnj, com.bytedance.sdk.openadsdk.core.bug.qor.hnj, com.bytedance.sdk.openadsdk.core.ojm.fc, xyo {
    private int aq;
    private ua dkl;
    private boolean dnm;
    private final com.bytedance.sdk.openadsdk.core.dkl.qor gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hnj f14295hn;
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj;
    private final com.bytedance.sdk.openadsdk.core.bug.qor.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.qor.hnj f14296sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f14297ta;
    private int dse = 0;
    private int ojm = 1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void dkl();

        int gjv();

        void hn();

        void hnj();

        void qor();

        void sk();
    }

    public oj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, hnj hnjVar2) {
        this.hnj = hnjVar;
        this.f14295hn = hnjVar2;
        this.gjv = new com.bytedance.sdk.openadsdk.core.dkl.qor(hnjVar.orp) { // from class: com.bytedance.sdk.openadsdk.core.widget.oj.1
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                oj.this.hnj(z10);
            }
        };
        com.bytedance.sdk.openadsdk.core.bug.qor.hn hnVar = new com.bytedance.sdk.openadsdk.core.bug.qor.hn(hnjVar.jbd, hnjVar.f13456hn, true);
        this.qor = hnVar;
        hnVar.hnj((com.bytedance.sdk.openadsdk.core.ojm.fc) this);
        hnVar.hnj((com.bytedance.sdk.openadsdk.core.bug.qor.hnj) this);
        com.bytedance.sdk.openadsdk.core.bug.qor.qor qorVarHnj = hnVar.hnj();
        if (qorVarHnj instanceof com.bytedance.sdk.openadsdk.core.bug.qor.gjv) {
            com.bytedance.sdk.openadsdk.core.bug.qor.gjv gjvVar = (com.bytedance.sdk.openadsdk.core.bug.qor.gjv) qorVarHnj;
            gjvVar.hnj((com.bytedance.sdk.openadsdk.core.bug.qor.gjv.hnj) this);
            ua uaVarSk = gjvVar.sk();
            this.dkl = uaVarSk;
            if (uaVarSk != null) {
                uaVarSk.hnj((xyo) this);
                this.dkl.hn(hnjVar.f13456hn.sk());
            }
        }
        Context context = hnjVar.jbd;
        as asVar = hnjVar.f13456hn;
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar3 = new com.bytedance.sdk.openadsdk.core.qor.hnj(context, asVar, asVar.sk(), orp.hn(hnjVar.f13456hn));
        this.f14296sk = hnjVar3;
        hnjVar3.hnj(com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), hnjVar.f13456hn.sk()));
        HashMap map = new HashMap();
        if (hqh.hn(hnjVar.f13456hn)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        hnjVar3.hnj(map);
    }

    private void bug() {
        this.gjv.setVisibility(8);
    }

    private boolean dnm() {
        return this.gjv.isAttachedToWindow() && this.gjv.getVisibility() == 0;
    }

    private void ta() {
        this.dse++;
        hnj hnjVar = this.f14295hn;
        if (hnjVar != null) {
            hnjVar.qor();
        }
        hnj(true);
        ua uaVar = this.dkl;
        if (uaVar != null) {
            uaVar.hnj("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            hnj hnjVar2 = this.f14295hn;
            if (hnjVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(hnjVar2.gjv(), 0));
            }
            jSONObject2.put("popup_sequence", this.dse);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.apu.qor("UserIdleAskDialog", e10.getMessage());
        }
        as asVar = this.hnj.f13456hn;
        com.bytedance.sdk.openadsdk.gjv.qor.hn(asVar, asVar.sk(), "show_popup", jSONObject);
    }

    public void aq() {
        this.f14297ta = true;
        ViewParent parent = this.gjv.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.gjv);
        }
        com.bytedance.sdk.openadsdk.core.bug.qor.hn hnVar = this.qor;
        if (hnVar != null) {
            hnVar.gjv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.qor.gjv.hnj
    public void dse() {
        if (this.aq != 1) {
            return;
        }
        this.aq = 3;
        View viewQor = this.qor.qor();
        if (viewQor != null) {
            ViewGroup viewGroup = (ViewGroup) viewQor.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.gjv) {
                    return;
                } else {
                    viewGroup.removeView(viewQor);
                }
            }
            if (this.gjv != null) {
                viewQor.setVisibility(0);
                this.gjv.addView(viewQor, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public long gjv() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hn() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.xyo
    public void n_() {
        if (this.f14297ta || !dnm()) {
            return;
        }
        bug();
        hnj hnjVar = this.f14295hn;
        if (hnjVar != null) {
            hnjVar.hn();
        }
        hnj(false);
        ua uaVar = this.dkl;
        if (uaVar != null) {
            uaVar.hnj("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.xyo
    public int o_() {
        hnj hnjVar = this.f14295hn;
        if (hnjVar != null) {
            return hnjVar.gjv();
        }
        return 0;
    }

    public boolean ojm() {
        if (this.f14297ta || !dnm()) {
            return false;
        }
        n_();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xyo
    public void p_() {
        hnj hnjVar = this.f14295hn;
        if (hnjVar != null) {
            hnjVar.sk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.xyo
    public void q_() {
        hnj hnjVar = this.f14295hn;
        if (hnjVar != null) {
            hnjVar.dkl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public long qor() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xyo
    public void r_() {
        this.ojm = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public int sk() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hn(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public boolean hn(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10, com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
    }

    private boolean hn(Activity activity) {
        if (!this.gjv.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.dnm = false;
                return false;
            }
            this.dnm = true;
            window.addContentView(this.gjv, new WindowManager.LayoutParams(-1, -1));
        }
        this.gjv.setVisibility(0);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(boolean z10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public boolean hnj(JSONObject jSONObject) {
        return false;
    }

    public void hnj(ViewGroup viewGroup) {
        View viewQor = this.qor.qor();
        if (viewQor == null) {
            return;
        }
        viewQor.setVisibility(4);
        viewGroup.addView(viewQor, new ViewGroup.LayoutParams(-1, -1));
        this.qor.hn();
        this.aq = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(boolean z10) {
        com.bytedance.sdk.openadsdk.core.bug.qor.qor qorVarHnj = this.qor.hnj();
        if (qorVarHnj instanceof com.bytedance.sdk.openadsdk.core.bug.qor.gjv) {
            ((com.bytedance.sdk.openadsdk.core.bug.qor.gjv) qorVarHnj).hnj(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void hnj(String str, JSONObject jSONObject) {
        hnj hnjVar;
        if (!"skipToNextAd".equals(str) || (hnjVar = this.f14295hn) == null) {
            return;
        }
        hnjVar.hnj();
    }

    public boolean hnj(Activity activity) {
        if (!this.f14297ta && activity != null && !activity.isFinishing()) {
            if (this.aq == 3 && this.ojm == 2) {
                if (this.gjv.isAttachedToWindow() && this.gjv.getVisibility() == 0) {
                    return true;
                }
                if (hn(activity)) {
                    ta();
                    return true;
                }
            }
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.aq);
                jSONObject.put("js_finish", this.ojm);
                jSONObject.put("has_window", this.dnm ? 1 : 0);
                map.put("pag_json_data", jSONObject.toString());
                as asVar = this.hnj.f13456hn;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj("show_popup_fail", asVar, asVar.sk(), map);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
    public void dkl() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.xyo
    public void m_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.qor.hnj
    public void hnj(View view, int i10, com.bytedance.sdk.component.adexpress.qor qorVar) {
        if (i10 == 2) {
            com.bytedance.sdk.openadsdk.core.model.jip jipVar = (com.bytedance.sdk.openadsdk.core.model.jip) qorVar;
            String str = jipVar.dse;
            if (jipVar.bug > 0) {
                com.bytedance.sdk.openadsdk.core.orp.hnj(true);
            }
            this.f14296sk.hnj(str);
            this.f14296sk.hnj(view, jipVar.hnj, jipVar.f13975hn, jipVar.qor, jipVar.gjv, jipVar.f13977ta, jipVar.dnm);
            this.hnj.sq.mkl();
            com.bytedance.sdk.openadsdk.core.orp.hnj(false);
            com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(this.hnj.f13456hn, 9);
        }
    }
}
