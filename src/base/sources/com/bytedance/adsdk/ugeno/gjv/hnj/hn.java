package com.bytedance.adsdk.ugeno.gjv.hnj;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements qor {
    private List<gjv> hnj = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.gjv.hnj.qor
    public void hnj(gjv gjvVar) {
        this.hnj.add(gjvVar);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.hnj.qor
    public void hnj(String str) {
        if (this.hnj.isEmpty()) {
            return;
        }
        Iterator<gjv> it = this.hnj.iterator();
        while (it.hasNext()) {
            it.next().hnj(str);
        }
    }
}
