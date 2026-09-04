package com.bytedance.adsdk.ugeno.gjv;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements qor {
    @Override // com.bytedance.adsdk.ugeno.gjv.qor
    public List<hn> hnj() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new hn("update") { // from class: com.bytedance.adsdk.ugeno.gjv.sk.1
            @Override // com.bytedance.adsdk.ugeno.gjv.hn
            public com.bytedance.adsdk.ugeno.gjv.hn.hnj hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
                return new com.bytedance.adsdk.ugeno.gjv.hn.sk(qorVar, str, hnjVar);
            }
        });
        arrayList.add(new hn("emit") { // from class: com.bytedance.adsdk.ugeno.gjv.sk.2
            @Override // com.bytedance.adsdk.ugeno.gjv.hn
            public com.bytedance.adsdk.ugeno.gjv.hn.hnj hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
                return new com.bytedance.adsdk.ugeno.gjv.hn.hn(qorVar, str, hnjVar);
            }
        });
        arrayList.add(new hn("startAnimate") { // from class: com.bytedance.adsdk.ugeno.gjv.sk.3
            @Override // com.bytedance.adsdk.ugeno.gjv.hn
            public com.bytedance.adsdk.ugeno.gjv.hn.hnj hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, dkl.hnj hnjVar) {
                return new com.bytedance.adsdk.ugeno.gjv.hn.gjv(qorVar, str, hnjVar);
            }
        });
        return arrayList;
    }
}
