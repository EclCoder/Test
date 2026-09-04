package com.bytedance.adsdk.ugeno.gjv;

import android.content.Context;
import f8.Ygx.FuoITeVPeXAj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hnj implements aq {
    @Override // com.bytedance.adsdk.ugeno.gjv.aq
    public List<dse> hnj() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dse("slide") { // from class: com.bytedance.adsdk.ugeno.gjv.hnj.1
            @Override // com.bytedance.adsdk.ugeno.gjv.dse
            public com.bytedance.adsdk.ugeno.gjv.gjv.qor hnj(Context context) {
                return new com.bytedance.adsdk.ugeno.gjv.gjv.sk(context);
            }
        });
        arrayList.add(new dse("tap") { // from class: com.bytedance.adsdk.ugeno.gjv.hnj.2
            @Override // com.bytedance.adsdk.ugeno.gjv.dse
            public com.bytedance.adsdk.ugeno.gjv.gjv.qor hnj(Context context) {
                return new com.bytedance.adsdk.ugeno.gjv.gjv.ojm(context);
            }
        });
        arrayList.add(new dse(FuoITeVPeXAj.HJmXBKMyzPTeZ) { // from class: com.bytedance.adsdk.ugeno.gjv.hnj.3
            @Override // com.bytedance.adsdk.ugeno.gjv.dse
            public com.bytedance.adsdk.ugeno.gjv.gjv.qor hnj(Context context) {
                return new com.bytedance.adsdk.ugeno.gjv.gjv.ta(context);
            }
        });
        arrayList.add(new dse("touchStart") { // from class: com.bytedance.adsdk.ugeno.gjv.hnj.4
            @Override // com.bytedance.adsdk.ugeno.gjv.dse
            public com.bytedance.adsdk.ugeno.gjv.gjv.qor hnj(Context context) {
                return new com.bytedance.adsdk.ugeno.gjv.gjv.bug(context);
            }
        });
        arrayList.add(new dse("touchEnd") { // from class: com.bytedance.adsdk.ugeno.gjv.hnj.5
            @Override // com.bytedance.adsdk.ugeno.gjv.dse
            public com.bytedance.adsdk.ugeno.gjv.gjv.qor hnj(Context context) {
                return new com.bytedance.adsdk.ugeno.gjv.gjv.dnm(context);
            }
        });
        arrayList.add(new dse("animateState") { // from class: com.bytedance.adsdk.ugeno.gjv.hnj.6
            @Override // com.bytedance.adsdk.ugeno.gjv.dse
            public com.bytedance.adsdk.ugeno.gjv.gjv.qor hnj(Context context) {
                return new com.bytedance.adsdk.ugeno.gjv.gjv.hn(context);
            }
        });
        return arrayList;
    }
}
