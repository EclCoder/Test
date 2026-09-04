package com.bytedance.sdk.openadsdk.component.reward.hn;

import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    public static hn hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        as asVar = hnjVar.f13456hn;
        if (dse.hnj(asVar) && !qor.hnj(asVar)) {
            return new dse(hnjVar);
        }
        if (gjv.hnj(asVar)) {
            return new gjv(hnjVar);
        }
        return qor.hnj(asVar) ? new qor(hnjVar) : new sk(hnjVar);
    }
}
