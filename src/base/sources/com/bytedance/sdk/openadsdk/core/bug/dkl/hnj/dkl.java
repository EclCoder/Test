package com.bytedance.sdk.openadsdk.core.bug.dkl.hnj;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.bug.dkl.dse;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.ojm.Cdo;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends dse {
    private static Boolean hqh;
    private float tgn;
    private float tu;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private final hn f13603vf;
    private boolean xyo;

    public dkl(Context context, as asVar, boolean z10, com.bytedance.sdk.openadsdk.core.bug.dkl.hnj hnjVar, ViewGroup viewGroup, float f10, float f11, boolean z11, String str) {
        super(context, asVar, z10, hnjVar, viewGroup);
        this.f13603vf = hn.hnj.hnj(asVar, hnjVar);
        this.wu = str;
        this.tu = f10;
        this.tgn = f11;
        this.xyo = z11;
    }

    private JSONObject hnj(float f10, float f11, boolean z10, as asVar, String str) {
        JSONObject jSONObjectHnj = com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(f10, f11, z10, asVar, str);
        this.f35do = jSONObjectHnj;
        if (jSONObjectHnj == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObjectHnj.optJSONObject("xSize");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("imageModeRatio", bug());
            }
            JSONObject jSONObjectOptJSONObject2 = this.f35do.optJSONObject("xAdInfo");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.put("isVideoImageMode", as.sk(this.f13592sk));
                jSONObjectOptJSONObject2.put("feed_draw_purePlayable", orl());
                jSONObjectOptJSONObject2.put("isFeedDraw", mjg());
            }
            hn hnVar = this.f13603vf;
            if (hnVar != null) {
                hnVar.hnj(this.f35do);
            }
        } catch (Exception unused) {
        }
        return this.f35do;
    }

    private boolean mjg() {
        as asVar = this.f13592sk;
        if (asVar == null) {
            return false;
        }
        int iXf = asVar.xf();
        boolean z10 = iXf == 7 || iXf == 8;
        int iQb = this.f13592sk.qb();
        return z10 && (iQb == 43 || iQb == 44);
    }

    private boolean orl() {
        return this.f13592sk != null && mjg() && hqh.qor(this.f13592sk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.dse, com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    protected com.bytedance.adsdk.ugeno.hn.qor aq() {
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = this.qor;
        if (qorVar == null) {
            return null;
        }
        return qorVar.dse("VideoV3");
    }

    public float bug() {
        as asVar = this.f13592sk;
        if (asVar == null) {
            return 1.0f;
        }
        int iQri = asVar.qri();
        if (iQri == 3) {
            return 1.91f;
        }
        if (iQri == 5) {
            return 1.78f;
        }
        if (iQri == 15 || iQri == 173) {
            return 0.5625f;
        }
        if (iQri != 33 && iQri != 50) {
            if (iQri == 1010) {
                return 1.2f;
            }
            if (iQri == 1011) {
                return 6.4f;
            }
            if (iQri == 1012) {
                return 3.2f;
            }
        }
        return 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.dse, com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    protected JSONObject hn() {
        return hnj(this.tu, this.tgn, this.xyo, this.f13592sk, this.wu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.gjv, com.bytedance.sdk.component.adexpress.hn.gjv
    public int qor() {
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.dse, com.bytedance.sdk.openadsdk.core.bug.dkl.gjv
    protected JSONObject hnj() {
        hn hnVar = this.f13603vf;
        if (hnVar != null) {
            try {
                return new JSONObject(hnVar.hnj());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dkl.dse
    public JSONObject hnj(gm gmVar) {
        hn hnVar = this.f13603vf;
        if (hnVar != null) {
            return hnVar.hn();
        }
        return null;
    }

    public static boolean hnj(String str) {
        if (hqh == null) {
            hqh = Boolean.valueOf(com.bytedance.sdk.openadsdk.as.sk.hnj("express_backup_type", 0) == 1);
        }
        return hqh.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || Cdo.hn(str) || (TextUtils.equals(str, "open_ad") && com.bytedance.sdk.openadsdk.component.dse.hnj.dnm()));
    }
}
