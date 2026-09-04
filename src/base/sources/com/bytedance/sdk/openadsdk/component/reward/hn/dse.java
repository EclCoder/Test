package com.bytedance.sdk.openadsdk.component.reward.hn;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.component.reward.view.aq;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.oj;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.orp;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends hn {

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.reward.view.dkl f13410fc;
    private String jip;
    private ViewGroup mjg;
    private final int orl;

    public dse(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        super(hnjVar);
        this.jip = "fullscreen_interstitial_ad";
        this.orl = this.f13412hn.qri();
    }

    private void hn(as asVar) {
        if (asVar == null || this.f13410fc == null) {
            return;
        }
        hqh();
        hnj((ImageView) this.f13410fc);
    }

    private void hnj(ImageView imageView) {
        List<oj> listLx;
        oj ojVar;
        as asVar = this.f13412hn;
        if (asVar == null || (listLx = asVar.lx()) == null || listLx.size() <= 0 || (ojVar = listLx.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ta.gjv.hnj(listLx.get(0)).qor(1).hnj(com.bytedance.sdk.openadsdk.ta.qor.hnj(this.f13412hn, ojVar.hnj(), imageView));
    }

    private void hqh() {
        oj ojVar;
        List<oj> listLx = this.f13412hn.lx();
        if (listLx == null || listLx.size() <= 0 || (ojVar = listLx.get(0)) == null) {
            return;
        }
        try {
            int iHn = ojVar.hn();
            int iQor = ojVar.qor();
            if (iHn != 0 && iQor != 0) {
                this.f13410fc.setRatio(iHn / iQor);
                return;
            }
            int i10 = this.orl;
            if (i10 == 33) {
                this.f13410fc.setRatio(1.0f);
            } else if (i10 == 3) {
                this.f13410fc.setRatio(1.91f);
            } else {
                this.f13410fc.setRatio(0.56f);
            }
        } catch (Exception e10) {
            apu.qor("TTAD.RFTI", e10.getMessage());
        }
    }

    private boolean nyv() {
        as asVar = this.f13412hn;
        return asVar != null && asVar.th() == 2;
    }

    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qor(as asVar) {
        if (asVar.rg() == 4) {
            return new com.bytedance.sdk.openadsdk.eum.hnj.hnj.hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), this.jip);
        }
        return null;
    }

    private void vf() {
        if (this.mjg == null) {
            return;
        }
        hnj((View) this.f13410fc);
    }

    private void xyo() {
        FrameLayout frameLayout = new FrameLayout(this.hnj.orp);
        this.mjg = frameLayout;
        frameLayout.setId(jip.dms);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.mjg.setLayoutParams(layoutParams);
        View viewDnm = this.hnj.f13464ua.dnm();
        if (viewDnm != null) {
            layoutParams.bottomMargin = viewDnm.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.dkl dklVar = new com.bytedance.sdk.openadsdk.component.reward.view.dkl(this.hnj.orp);
        this.f13410fc = dklVar;
        dklVar.setId(jip.f14697zd);
        FrameLayout.LayoutParams layoutParams2 = this.hnj.f13456hn.zf() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        this.f13410fc.setLayoutParams(layoutParams2);
        this.mjg.addView(this.f13410fc);
        vf();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void dkl() {
        if (com.bytedance.sdk.openadsdk.core.model.apu.hn(this.f13412hn)) {
            this.dkl.hn(8);
        }
        this.aq.qor(false);
        this.aq.gjv(false);
        if (this.f13412hn.th() == 2) {
            this.aq.hnj(false);
            this.dkl.dkl(8);
            return;
        }
        this.aq.hnj(this.f13412hn.ij());
        if (this.hnj.fr) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            int iSq = (int) (hnjVar.eum.sq() * 1000.0d);
            hnjVar.aq = iSq;
            messageObtain.arg1 = iSq;
            this.hnj.f13453ff.sendMessage(messageObtain);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public boolean gjv() {
        return nyv();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public boolean sk() {
        return nyv();
    }

    protected void hnj(View view) {
        if (view == null || this.hnj.orp == null || this.f13412hn == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.qor.hn hnjVar = this.dnm;
        if (hnjVar == null) {
            Activity activity = this.hnj.orp;
            as asVar = this.f13412hn;
            String str = this.jip;
            hnjVar = new com.bytedance.sdk.openadsdk.core.qor.hnj(activity, asVar, str, orp.hnj(str));
            hnjVar.hnj(qor(this.f13412hn));
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            hnjVar.hnj(map);
        }
        Activity activity2 = this.hnj.orp;
        if (activity2 != null) {
            hnjVar.hnj(activity2);
        }
        view.setOnTouchListener(hnjVar);
        view.setOnClickListener(hnjVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void hnj(FrameLayout frameLayout) {
        try {
            xyo();
            hn(this.f13412hn);
            frameLayout.addView(this.mjg);
        } catch (Exception e10) {
            Log.e("TTAD.RFTI", "bindAd: ", e10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void hnj(aq aqVar) {
        if (com.bytedance.sdk.openadsdk.core.model.apu.hn(this.f13412hn)) {
            gjv.hnj(aqVar, this.f13412hn);
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            hnjVar.f13455gn.hnj((long) (hnjVar.eum.sq() * 1000.0d));
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.apu.gjv(this.f13412hn) && !com.bytedance.sdk.openadsdk.core.model.apu.dse(this.f13412hn)) {
                super.hnj(aqVar);
                return;
            }
            gjv.hn(aqVar, this.f13412hn);
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.hnj;
            if (hnjVar2.dy) {
                return;
            }
            hnjVar2.f13455gn.hnj((long) (hnjVar2.eum.sq() * 1000.0d));
        }
    }

    public static boolean hnj(as asVar) {
        return !as.sk(asVar) && asVar.m34if() == 100.0f;
    }
}
