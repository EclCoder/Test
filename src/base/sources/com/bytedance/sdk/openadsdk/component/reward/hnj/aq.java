package com.bytedance.sdk.openadsdk.component.reward.hnj;

import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static int f13430hn = 1;
    public static int hnj = 0;
    public static int qor = 2;
    private final boolean gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private ojm f13431sk;

    public aq(hnj hnjVar, as asVar) {
        this.gjv = asVar.za();
        this.f13431sk = hqh.dkl(asVar) ? new dse(hnjVar) : new ojm(hnjVar);
    }

    public void aq() {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.sk();
        }
    }

    public void dkl() {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.ojm();
        }
    }

    public boolean dnm() {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            return ojmVar.fc();
        }
        return false;
    }

    public void dse() {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.hnj();
        }
    }

    public boolean gjv() {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            return ojmVar.ta();
        }
        return false;
    }

    public boolean hn() {
        return false;
    }

    public com.bytedance.sdk.openadsdk.wu.aq hnj() {
        return null;
    }

    public void ojm() {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.mjg();
        }
    }

    public com.bytedance.sdk.openadsdk.orl.sk qor() {
        return null;
    }

    public void sk() {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.gjv();
        }
    }

    public void ta() {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.qor();
        }
    }

    public void hn(int i10) {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.hnj(i10);
        }
    }

    public void hnj(int i10) {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.hnj(i10);
        }
    }

    public void qor(int i10) {
        ojm ojmVar;
        if (i10 == qor || (ojmVar = this.f13431sk) == null) {
            return;
        }
        ojmVar.dkl();
    }

    public boolean gjv(int i10) {
        ojm ojmVar;
        if (i10 != f13430hn || (ojmVar = this.f13431sk) == null) {
            return false;
        }
        return ojmVar.orl();
    }

    public void hn(boolean z10) {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.qor(z10);
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.qor.sk skVar) {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.hnj(skVar);
        }
    }

    public void hnj(boolean z10) {
        ojm ojmVar = this.f13431sk;
        if (ojmVar != null) {
            ojmVar.hn(z10);
        }
    }
}
