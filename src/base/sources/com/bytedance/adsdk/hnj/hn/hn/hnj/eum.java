package com.bytedance.adsdk.hnj.hn.hn.hnj;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class eum implements com.bytedance.adsdk.hnj.hn.hn.hnj {
    private com.bytedance.adsdk.hnj.hn.gjv.gjv hnj;

    public eum(com.bytedance.adsdk.hnj.hn.gjv.gjv gjvVar) {
        this.hnj = gjvVar;
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public String hn() {
        return this.hnj.hnj();
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return hn();
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public com.bytedance.adsdk.hnj.hn.gjv.sk hnj() {
        return this.hnj;
    }
}
