package com.bytedance.sdk.openadsdk.component.reward.hn;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.component.reward.hnj.bug;
import com.bytedance.sdk.openadsdk.component.reward.hnj.fc;
import com.bytedance.sdk.openadsdk.component.reward.hnj.jip;
import com.bytedance.sdk.openadsdk.component.reward.view.dnm;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    protected final bug aq;
    protected final dnm dkl;
    protected final jip dse;
    protected int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected as f13412hn;
    protected com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj;
    protected com.bytedance.sdk.openadsdk.core.mjg.gjv.hn ojm;
    protected int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected final fc f13413sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected xyo f13414ta;

    public hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.hnj = hnjVar;
        this.f13412hn = hnjVar.f13456hn;
        this.qor = hnjVar.eta;
        this.gjv = hnjVar.zt;
        this.f13413sk = hnjVar.eum;
        this.dkl = hnjVar.f13464ua;
        this.dse = hnjVar.nyv;
        this.aq = hnjVar.f13454gm;
    }

    public boolean hn() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        boolean z10 = hnjVar.f13463th == null;
        boolean zDse = hnjVar.eum.dse();
        boolean z11 = apu.qor(this.hnj.f13456hn) || !as.sk(this.hnj.f13456hn);
        if (z10 && zDse && z11) {
            return false;
        }
        boolean zHn = apu.hn(this.hnj.f13456hn);
        boolean z12 = this.hnj.jip.get();
        if (zHn && z12) {
            FrameLayout frameLayoutDkl = this.hnj.f13464ua.dkl();
            frameLayoutDkl.setVisibility(4);
            frameLayoutDkl.setVisibility(0);
            return false;
        }
        boolean z13 = this.hnj.ojm.get();
        boolean z14 = this.hnj.f13462ta.get();
        if (z13 || z14) {
            return false;
        }
        return this.hnj.eum.ojm() || this.hnj.eum.pty();
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar, xyo xyoVar) {
        this.ojm = hnVar;
        this.f13414ta = xyoVar;
    }

    protected void qor() {
        if (hqh.hn(this.hnj.f13456hn) && DeviceUtils.dse() == 0) {
            this.hnj.dzo = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
        hnjVar.f13454gm.hn(hnjVar.dzo);
    }

    public boolean hnj() {
        return this.hnj.f13456hn.qs() || this.hnj.f13456hn.qri() == 15 || this.hnj.f13456hn.qri() == 5 || this.hnj.f13456hn.qri() == 50;
    }

    public void hnj(boolean z10) {
        if (this.hnj.ojm.get()) {
            return;
        }
        as asVar = this.f13412hn;
        if (asVar != null && asVar.ouk()) {
            this.aq.qor(false);
            this.aq.hnj(true);
            this.hnj.f13464ua.hn(8);
            this.hnj.f13464ua.gjv(8);
            return;
        }
        if (!z10) {
            this.aq.qor(false);
            this.aq.hnj(false);
            this.aq.gjv(false);
            this.hnj.f13464ua.dkl(8);
        } else {
            this.aq.hnj(this.hnj.f13456hn.ij());
            if (hnj()) {
                this.aq.qor(true);
            }
            if (!hnj() && (!(this instanceof dse) || !this.hnj.f13456hn.dkl())) {
                this.aq.sk();
                this.hnj.f13464ua.dkl(0);
            } else {
                this.aq.gjv(true);
            }
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.hnj;
            if (hnjVar.rmr != com.bytedance.sdk.openadsdk.component.reward.view.qor.hnj) {
                hnjVar.f13464ua.hn(8);
                this.hnj.f13464ua.gjv(8);
                return;
            } else {
                hnjVar.f13464ua.hn(0);
                this.hnj.f13464ua.qor(0);
                this.hnj.f13464ua.gjv(0);
                return;
            }
        }
        this.hnj.f13464ua.hn(4);
        this.hnj.f13464ua.qor(8);
        this.hnj.f13464ua.gjv(8);
    }
}
