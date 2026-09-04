package com.bytedance.adsdk.hn.hnj.hn;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug extends dse<com.bytedance.adsdk.hn.dse.qor> {
    private final com.bytedance.adsdk.hn.dse.qor gjv;

    public bug(List<com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.dse.qor>> list) {
        super(list);
        this.gjv = new com.bytedance.adsdk.hn.dse.qor();
    }

    @Override // com.bytedance.adsdk.hn.hnj.hn.hnj
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.hn.dse.qor hnj(com.bytedance.adsdk.hn.dse.hnj<com.bytedance.adsdk.hn.dse.qor> hnjVar, float f10) {
        com.bytedance.adsdk.hn.dse.qor qorVar;
        com.bytedance.adsdk.hn.dse.qor qorVar2 = hnjVar.hnj;
        if (qorVar2 == null || (qorVar = hnjVar.f11946hn) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.hn.dse.qor qorVar3 = qorVar2;
        com.bytedance.adsdk.hn.dse.qor qorVar4 = qorVar;
        if (this.qor == null) {
            this.gjv.hnj(com.bytedance.adsdk.hn.dkl.sk.hnj(qorVar3.hnj(), qorVar4.hnj(), f10), com.bytedance.adsdk.hn.dkl.sk.hnj(qorVar3.hn(), qorVar4.hn(), f10));
            return this.gjv;
        }
        hnjVar.dse.getClass();
        gjv();
        aq();
        throw null;
    }
}
