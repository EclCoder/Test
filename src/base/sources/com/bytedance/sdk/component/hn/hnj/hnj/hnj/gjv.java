package com.bytedance.sdk.component.hn.hnj.hnj.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dnm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends dnm {
    public dkl aq;
    public hnj ojm;

    public gjv(dnm.hnj hnjVar) {
        super(hnjVar);
        dkl dklVar = new dkl();
        this.aq = dklVar;
        this.ojm = new hnj(dklVar.hn());
    }

    @Override // com.bytedance.sdk.component.hn.hnj.dnm
    public com.bytedance.sdk.component.hn.hnj.gjv hnj() {
        return this.aq;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.dnm
    public com.bytedance.sdk.component.hn.hnj.hn hnj(bug bugVar) {
        bugVar.hnj(this);
        if (bugVar.gjv() == null || bugVar.gjv().hnj() == null || TextUtils.isEmpty(bugVar.gjv().hnj().toString())) {
            return null;
        }
        if (hnj.hnj == null || !hnj.hnj.hn() || !this.ojm.sk() || "setting".equals(bugVar.aq())) {
            hn hnVar = new hn(bugVar, this.aq);
            this.aq.qor().add(hnVar);
            return hnVar;
        }
        hn hnVar2 = new hn(bugVar, this.ojm);
        this.ojm.qor().add(hnVar2);
        return hnVar2;
    }
}
