package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.orp;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f13434hn;
    private hnj hnj;

    public dkl(hnj hnjVar) {
        this.hnj = hnjVar;
    }

    private void hn() {
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        hnj hnjVar = this.hnj;
        Activity activity = hnjVar.orp;
        as asVar = hnjVar.f13456hn;
        String str = hnjVar.f13461sk;
        com.bytedance.sdk.openadsdk.core.ojm.ojm ojmVar = new com.bytedance.sdk.openadsdk.core.ojm.ojm(activity, asVar, str, orp.hnj(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dkl.3
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
            public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, boolean z10) {
                super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        ojmVar.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dkl.4
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i10) {
                dkl.this.hnj.sq.ul();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        hnj hnjVar2 = this.hnj;
        if (hnjVar2.dy && (aqVar = hnjVar2.f13463th) != null) {
            int i10 = aqVar.dnm + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        ojmVar.hnj(map);
        hnj hnjVar3 = this.hnj;
        Activity activity2 = hnjVar3.orp;
        as asVar2 = hnjVar3.f13456hn;
        String str2 = hnjVar3.f13461sk;
        com.bytedance.sdk.openadsdk.core.ojm.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.ojm.aq(activity2, asVar2, str2, orp.hnj(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dkl.5
            @Override // com.bytedance.sdk.openadsdk.core.qor.hnj, com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
            public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.qor.qor.hnj> sparseArray, boolean z10) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(dkl.this.hnj.eum.orl()));
                if (dkl.this.hnj.f13463th != null) {
                    dkl.this.hnj.f13463th.hnj(map2, f10, f11);
                }
                hnj(map2);
                super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
                dkl.this.hnj.eum.cm();
            }
        };
        aqVar2.hnj(new com.bytedance.sdk.openadsdk.core.qor.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dkl.6
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn.hnj
            public void hnj(View view, int i11) {
                dkl.this.hnj.sq.ul();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        aqVar2.hnj(map2);
        this.hnj.f33do.hnj(ojmVar, aqVar2);
    }

    public void hnj(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar;
        this.f13434hn = true;
        Arrays.toString(fArr);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.hnj.f13456hn.atw())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        hnj hnjVar = this.hnj;
        hnjVar.f33do.hnj(adSlotBuild, hnjVar.f13464ua.f13541fc);
        hnj hnjVar2 = this.hnj;
        bug bugVar = hnjVar2.f13454gm;
        if (bugVar != null && (ojmVar = hnjVar2.f33do) != null) {
            bugVar.hnj(ojmVar.hnj());
        }
        this.hnj.f33do.hnj(new com.bytedance.sdk.openadsdk.core.ojm.fc() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dkl.1
            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void dkl() {
                dkl.this.hnj.f13466vf.hnj(dkl.this.hnj.f13460qb);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public long gjv() {
                return dkl.this.hnj.eum.hnj();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public boolean hn(JSONObject jSONObject) {
                return com.bytedance.sdk.openadsdk.component.reward.hn.hnj(dkl.this.hnj);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void hnj(boolean z10, String str) {
                if (dkl.this.hnj.dzo != z10) {
                    dkl.this.hnj.f13454gm.hnj(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public long qor() {
                return dkl.this.hnj.eum.mjg();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public int sk() {
                if (dkl.this.hnj.f33do.qor()) {
                    return 4;
                }
                if (dkl.this.hnj.f33do.gjv()) {
                    return 5;
                }
                if (dkl.this.hnj.eum.ta()) {
                    return 1;
                }
                if (dkl.this.hnj.eum.dkl()) {
                    return 2;
                }
                dkl.this.hnj.eum.ojm();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void hn() {
                if (dkl.this.hnj.f13464ua == null || dkl.this.hnj.f13464ua.ta() == null) {
                    return;
                }
                dkl.this.hnj.f13464ua.ta().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void hnj() {
                dkl.this.hnj.f13454gm.gjv();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void hn(int i10) {
                dkl.this.hnj.pv = i10;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void hnj(String str, JSONObject jSONObject) {
                if (dkl.this.hnj == null || dkl.this.hnj.sq == null) {
                    return;
                }
                dkl.this.hnj.sq.hnj(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public boolean hnj(JSONObject jSONObject) {
                if (dkl.this.hnj == null || dkl.this.hnj.eum == null) {
                    return false;
                }
                return dkl.this.hnj.eum.hnj(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void hnj(int i10) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        dkl.this.hnj.eum.fvt();
                        return;
                    }
                    if (i10 == 3) {
                        dkl.this.hnj.eum.hnj(dkl.this.hnj.sq);
                        return;
                    } else if (i10 == 4) {
                        dkl.this.hnj.eum.xn();
                        return;
                    } else if (i10 != 5) {
                        return;
                    }
                }
                if (dkl.this.hnj.eum.dkl() || dkl.this.hnj.eum.ojm()) {
                    return;
                }
                dkl.this.hnj.sq.hnj(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void hnj(int i10, String str) {
                dkl.this.hnj.eum.hnj(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ojm.fc
            public void hnj(int i10, com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
                dkl.this.hnj.f13464ua.hnj(i10, mjgVar);
            }
        });
        this.hnj.f33do.hnj(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dkl.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (dkl.this.hnj == null || dkl.this.hnj.f13456hn == null || !dkl.this.hnj.f13456hn.ux()) {
                    return;
                }
                dkl.this.hnj.sq.ul();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                boolean z10 = -1024 == i10;
                dkl.this.hnj.hnj(i10, str, z10 ? 1002 : 1001);
                dkl.this.hnj.tgn.hnj();
                if (z10) {
                    return;
                }
                if (!dkl.this.hnj.f13456hn.ouk()) {
                    dkl.this.hnj.nyv.hnj(true);
                    dkl.this.hnj.nyv.sk();
                }
                dkl.this.hnj.f33do.sk().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dkl.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dkl.this.hnj.f13460qb.hnj(false, false, false, 90);
                    }
                });
                dkl.this.hnj.f13464ua.orl();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                apu apuVar;
                if (!dkl.this.hnj.f13456hn.ouk()) {
                    if (dkl.this.hnj.f33do.ojm()) {
                        dkl.this.hnj.f13460qb.hnj(true);
                        dkl.this.hnj.eum.gjv(false);
                    } else {
                        dkl.this.hnj.eum.gjv(true);
                    }
                    dkl.this.hnj.f13464ua.hnj(8);
                    dkl.this.hnj.nyv.hnj(true);
                    dkl.this.hnj.nyv.sk();
                    if (dkl.this.hnj.f33do.ojm()) {
                        dkl.this.hnj.f33do.hn().setBackgroundColor(-16777216);
                        dkl.this.hnj.f13460qb.hnj(dkl.this.hnj.f13464ua.dkl());
                    } else if (dkl.this.hnj.f13456hn.pwt() != null && dkl.this.hnj.f13460qb.hnj()) {
                        dkl.this.hnj.f13469xo = true;
                    }
                }
                dkl.this.hnj.f13460qb.as();
                if (apu.qor(dkl.this.hnj.f13456hn) && (apuVar = dkl.this.hnj.f13464ua.f13541fc) != null) {
                    apuVar.qor();
                }
                dkl.this.hnj.f13464ua.orl();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }
        });
        hn();
        FrameLayout.LayoutParams layoutParams = (this.hnj.f13456hn.ouk() || com.bytedance.sdk.openadsdk.core.bug.sk.hnj(this.hnj.f13456hn.rq()) || apu.qor(this.hnj.f13456hn)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.hnj.f13464ua.dkl().addView(this.hnj.f33do.hnj(), layoutParams);
        if (!this.hnj.f33do.ojm()) {
            this.hnj.f13460qb.hnj(false);
        }
        this.hnj.f33do.mjg();
    }

    public void hnj(as asVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.hnj.f33do;
        if (ojmVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.view.qor qorVarHnj = ojmVar.hnj();
            ViewParent parent = qorVarHnj.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(qorVarHnj);
            }
            this.hnj.f13464ua.dkl().addView(qorVarHnj);
            if (!this.hnj.f33do.ojm()) {
                this.hnj.f13460qb.hnj(false);
            }
            this.hnj.f33do.hnj(asVar);
            hn();
        }
    }

    public boolean hnj() {
        return this.f13434hn;
    }

    public void hnj(hnj hnjVar) {
        this.hnj = hnjVar;
    }
}
