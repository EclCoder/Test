package com.bytedance.sdk.component.hn.hnj.hnj.hnj;

import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.mjg;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements com.bytedance.sdk.component.hn.hnj.aq.hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    bug f12879hn;
    List<com.bytedance.sdk.component.hn.hnj.aq> hnj;
    int qor = 0;

    qor(List<com.bytedance.sdk.component.hn.hnj.aq> list, bug bugVar) {
        this.hnj = list;
        this.f12879hn = bugVar;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.aq.hnj
    public bug hnj() {
        return this.f12879hn;
    }

    @Override // com.bytedance.sdk.component.hn.hnj.aq.hnj
    public mjg hnj(bug bugVar) {
        this.f12879hn = bugVar;
        int i10 = this.qor + 1;
        this.qor = i10;
        if (i10 >= this.hnj.size()) {
            return null;
        }
        return this.hnj.get(this.qor).hnj(this);
    }
}
