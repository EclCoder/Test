package com.bytedance.adsdk.hn.qor.hnj;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class mjg<V, O> implements orl<V, O> {
    final List<com.bytedance.adsdk.hn.dse.hnj<V>> hnj;

    mjg(List<com.bytedance.adsdk.hn.dse.hnj<V>> list) {
        this.hnj = list;
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public boolean hn() {
        return this.hnj.isEmpty() || (this.hnj.size() == 1 && this.hnj.get(0).sk());
    }

    @Override // com.bytedance.adsdk.hn.qor.hnj.orl
    public List<com.bytedance.adsdk.hn.dse.hnj<V>> qor() {
        return this.hnj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.hnj.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.hnj.toArray()));
        }
        return sb2.toString();
    }
}
