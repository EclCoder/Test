package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.bug;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.gjv.dkl;
import com.bytedance.adsdk.ugeno.gjv.ojm;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.adsdk.ugeno.hn.hnj<com.bytedance.adsdk.ugeno.dkl.hn> implements com.bytedance.adsdk.ugeno.dkl.qor {
    private boolean bqc;
    private int br;
    private boolean cq;
    private int cvc;
    private boolean dlk;
    private boolean ett;
    private float hw;
    private int iwu;
    private int kby;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private float f12254lf;
    private float lx;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f12255mn;
    private String mw;
    private String pwt;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private boolean f12256qi;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    private float f12257rg;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private float f12258sg;

    /* JADX INFO: renamed from: sh, reason: collision with root package name */
    private JSONArray f12259sh;

    /* JADX INFO: renamed from: sl, reason: collision with root package name */
    private float f12260sl;

    /* JADX INFO: renamed from: sp, reason: collision with root package name */
    private boolean f12261sp;

    /* JADX INFO: renamed from: tb, reason: collision with root package name */
    private float f12262tb;
    private int tq;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private boolean f12263vk;
    private float wxi;

    /* JADX INFO: renamed from: xd, reason: collision with root package name */
    private float f12264xd;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    private String f12265xe;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private float f12266yo;

    public hn(Context context) {
        super(context);
        this.iwu = 0;
        this.dlk = true;
        this.f12263vk = true;
        this.f12254lf = 500.0f;
        this.f12266yo = 2000.0f;
        this.pwt = "slide";
        this.mw = "dot";
        this.f12258sg = 8.0f;
        this.f12257rg = 8.0f;
        this.wxi = 50.0f;
        this.hw = 90.0f;
        this.f12256qi = false;
        this.f12255mn = Color.parseColor("#666666");
        this.tq = Color.parseColor("#ffffff");
        this.f12265xe = "row";
        this.lx = 1.0f;
        this.f12260sl = 0.0f;
        this.f12264xd = 0.0f;
        this.f12262tb = 0.0f;
        this.kby = 0;
        this.br = 0;
        this.cq = true;
        this.bqc = false;
        this.f12261sp = true;
        float fHnj = aq.hnj(this.f12280hn, 8.0f);
        this.f12258sg = fHnj;
        this.f12257rg = fHnj;
    }

    private void aq(int i10) {
        ojm ojmVar = this.bgg;
        if (ojmVar == null) {
            return;
        }
        ojmVar.hnj("SwiperView://slide", Integer.valueOf(this.cvc), Integer.valueOf(i10), Integer.valueOf(!this.ett ? 1 : 0));
    }

    private void dse(int i10) {
        if (this.bgg == null) {
            return;
        }
        if (this.cvc == 0 && i10 == izk() - 1) {
            this.bgg.hnj("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.cvc == izk() - 1 && i10 == 0) {
            this.bgg.hnj("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    private int izk() {
        if (this.kby == 1) {
            List<com.bytedance.adsdk.ugeno.hn.qor<View>> list = ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.f12259sh;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private void ka() {
        for (int i10 = 0; i10 < ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.size(); i10++) {
            com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.get(i10);
            if (qorVar != null) {
                bug bugVar = new bug(this.f12280hn);
                hnj(bugVar);
                bugVar.hnj(this.jle);
                ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).hnj(bugVar.hnj(qorVar.nyv(), this.gjv, (JSONObject) null));
            }
        }
    }

    private void zt() {
        List<com.bytedance.adsdk.ugeno.hn.qor<View>> list = ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.hn.qor<View> qorVar = ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.get(0);
        if (this.f12259sh == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f12259sh.length(); i10++) {
            bug bugVar = new bug(this.f12280hn);
            hnj(bugVar);
            bugVar.hnj(this.jle);
            try {
                JSONObject jSONObjectOptJSONObject = this.f12259sh.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.gjv.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.gjv.put("$item", jSONObjectOptJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).hnj(bugVar.hnj(qorVar.nyv(), this.gjv, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void gjv() {
        ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).orl(((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).getCurrentItem() - 1);
    }

    public void qor() {
        ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).orl(((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).getCurrentItem() + 1);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).qor((int) this.f12254lf).sk(this.bqc).hnj(this.mw).hnj(this.f12258sg).hn(this.f12257rg).qor(this.wxi).gjv(this.hw).hn(this.f12265xe).hnj(this.iwu).hn().gjv(this.dlk).hnj(this.f12263vk).hn((int) this.f12254lf).gjv((int) this.f12266yo).hn(this.cq).qor(this.f12256qi).dkl(this.f12255mn).sk(this.tq).aq((int) this.f12264xd).ojm((int) this.f12262tb).dse((int) this.f12260sl).sk(this.lx).qor(this.pwt).orl(this.br);
        ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).setOnPageChangeListener(this);
        if (this.kby == 1) {
            ka();
        } else {
            zt();
        }
        ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).qor();
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public View hnj() {
        com.bytedance.adsdk.ugeno.dkl.hn hnVar = new com.bytedance.adsdk.ugeno.dkl.hn(this.f12280hn);
        this.f12293sk = hnVar;
        hnVar.hnj((gjv) this);
        return this.f12293sk;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        if (qorVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.add(qorVar);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, ViewGroup.LayoutParams layoutParams) {
        if (qorVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.hn.hnj) this).hnj.add(qorVar);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        super.hnj(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "startIndex":
                this.br = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0);
                break;
            case "indicatorColor":
                this.f12255mn = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2, this.f12255mn);
                break;
            case "indicatorStyle":
                this.mw = str2;
                break;
            case "indicatorWidth":
                this.f12258sg = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 8.0f));
                break;
            case "indicatorHeight":
                this.f12257rg = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 8.0f));
                break;
            case "nextMargin":
                this.f12262tb = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "driveMode":
                this.kby = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0);
                break;
            case "effect":
                this.pwt = str2;
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.iwu = 1;
                    break;
                } else {
                    this.iwu = 0;
                    break;
                }
                break;
            case "disableOnInteraction":
                this.bqc = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, false);
                break;
            case "indicator":
                this.f12256qi = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, false);
                break;
            case "indicatorX":
                this.wxi = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 50.0f);
                break;
            case "indicatorY":
                this.hw = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 90.0f);
                break;
            case "previousMargin":
                this.f12264xd = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "loop":
                this.dlk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, true);
                break;
            case "delay":
                this.f12266yo = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 2000.0f);
                break;
            case "speed":
                this.f12254lf = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 500.0f);
                break;
            case "indicatorDirection":
                this.f12265xe = str2;
                break;
            case "allowTouchMove":
                this.cq = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, true);
                break;
            case "pageCount":
                this.lx = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1.0f);
                break;
            case "pageMargin":
                this.f12260sl = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.tq = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2, this.tq);
                break;
            case "autoplay":
                this.f12263vk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, true);
                break;
            case "dataList":
                this.f12259sh = com.bytedance.adsdk.ugeno.dse.hn.hnj(str2, (JSONArray) null);
                break;
        }
    }

    public void hnj(int i10) {
        if (((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).getCurrentItem() != i10) {
            ((com.bytedance.adsdk.ugeno.dkl.hn) this.f12293sk).orl(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dkl.qor
    public void hnj(boolean z10, int i10, float f10, int i11) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z10 + "; position=" + i10 + "; positionOffset=" + f10 + "; positionOffsetPixels=" + i11);
        hnj(z10, i10, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.dkl.qor
    public void hnj(boolean z10, int i10, int i11, boolean z11, boolean z12) {
        if (this.cvc != i10) {
            dse(i10);
            aq(i10);
            this.cvc = i10;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z10 + "; position=" + i10 + "; loopPosition=" + i11 + "; isFirst=" + z11 + "; isLast=" + z12);
    }

    @Override // com.bytedance.adsdk.ugeno.dkl.qor
    public void hnj(boolean z10, int i10) {
        if (i10 == 0) {
            if (!z10) {
                this.f12261sp = true;
            }
            this.ett = false;
        } else if (i10 == 1) {
            this.ett = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z10 + "; state=" + i10);
    }

    private void hnj(boolean z10, int i10, float f10) {
        if (this.bgg != null && !z10 && i10 == izk() - 1 && f10 == 0.0f && this.f12261sp) {
            this.bgg.hnj("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.f12261sp = false;
        }
    }

    private void hnj(bug bugVar) {
        if (this.bqc) {
            bugVar.hnj(new com.bytedance.adsdk.ugeno.core.sk() { // from class: com.bytedance.adsdk.ugeno.hn.1
                @Override // com.bytedance.adsdk.ugeno.core.sk
                public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, List<dkl.hnj> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.hn.qor) hn.this).f12293sk != null) {
                        ((com.bytedance.adsdk.ugeno.dkl.hn) ((com.bytedance.adsdk.ugeno.hn.qor) hn.this).f12293sk).dkl();
                    }
                }
            });
        }
    }
}
