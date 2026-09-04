package com.bytedance.adsdk.ugeno.gjv.hnj;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private volatile Map<String, qor> hnj = new HashMap();

    public qor hnj(String str) {
        if (this.hnj.containsKey(str) && this.hnj.get(str) != null) {
            return this.hnj.get(str);
        }
        hn hnVar = new hn();
        this.hnj.put(str, hnVar);
        return hnVar;
    }

    public void hnj(String str, qor qorVar) {
        if (!this.hnj.containsKey(str) || this.hnj.get(str) == null) {
            this.hnj.put(str, qorVar);
        }
    }
}
