package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.bug;
import com.bytedance.adsdk.ugeno.dse.aq;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class qor extends com.bytedance.adsdk.ugeno.hn.hnj<com.bytedance.adsdk.ugeno.dkl.hn> {
    private boolean dlk;
    private JSONArray hw;
    private String iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private float f12385lf;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private float f12386mn;
    private boolean mw;
    private String pwt;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.hn.qor f12387qi;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    private int f12388rg;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private int f12389sg;
    private float tq;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private boolean f12390vk;
    private float wxi;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    private float f12391xe;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private float f12392yo;

    public qor(Context context) {
        super(context);
        this.dlk = true;
        this.f12390vk = true;
        this.f12385lf = 0.0f;
        this.f12392yo = 2000.0f;
        this.pwt = "normal";
        this.mw = true;
        this.f12389sg = Color.parseColor("#666666");
        this.f12388rg = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        JSONArray jSONArray = this.hw;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).dse((int) this.f12386mn).aq((int) this.tq).ojm((int) this.f12391xe).qor(this.mw).sk(this.f12388rg).dkl(this.f12389sg).qor(this.pwt).gjv(this.dlk).sk(this.wxi).hnj(this.f12390vk).gjv((int) this.f12392yo).qor(this.mw);
        for (int i10 = 0; i10 < this.hw.length(); i10++) {
            bug bugVar = new bug(this.f12280hn);
            bugVar.hnj(this.jle);
            com.bytedance.adsdk.ugeno.hn.qor<View> qorVarHn = bugVar.hn(this.f12387qi.nyv(), (com.bytedance.adsdk.ugeno.hn.qor<View>) null);
            bugVar.hn(this.hw.optJSONObject(i10));
            ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).hnj(qorVarHn);
        }
        if (this.f12390vk) {
            ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).qor();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public View hnj() {
        com.bytedance.adsdk.ugeno.dkl.hn hnVar = new com.bytedance.adsdk.ugeno.dkl.hn(this.f12280hn);
        this.f12293sk = hnVar;
        hnVar.hnj((gjv) this);
        return this.f12293sk;
    }

    public void hnj(com.bytedance.adsdk.ugeno.dkl.qor qorVar) {
        T t10 = this.f12293sk;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.dkl.hn) t10).setOnPageChangeListener(qorVar);
        }
    }

    public void hnj(int i10) {
        T t10 = this.f12293sk;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.dkl.hn) t10).orl(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        this.f12387qi = qorVar;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "delayStart":
                this.f12385lf = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case "indicatorColor":
                this.f12389sg = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case "nextMargin":
                this.f12391xe = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "effect":
                this.pwt = str2;
                break;
            case "direction":
                this.iwu = str2;
                break;
            case "indicator":
                this.mw = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, true);
                break;
            case "previousMargin":
                this.tq = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "loop":
                this.dlk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, true);
                break;
            case "speed":
                this.f12392yo = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 500.0f);
                break;
            case "pageCount":
                this.wxi = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1.0f);
                break;
            case "pageMargin":
                this.f12386mn = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.f12388rg = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case "autoplay":
                this.f12390vk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, true);
                break;
            case "dataList":
                this.hw = com.bytedance.adsdk.ugeno.dse.hn.hnj(str2, (JSONArray) null);
                break;
        }
    }
}
