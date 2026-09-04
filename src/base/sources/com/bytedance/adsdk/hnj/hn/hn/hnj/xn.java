package com.bytedance.adsdk.hnj.hn.hn.hnj;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn implements com.bytedance.adsdk.hnj.hn.hn.hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.adsdk.hnj.hn.hn.hnj f12157hn;
    private com.bytedance.adsdk.hnj.hn.hn.hnj hnj;
    private com.bytedance.adsdk.hnj.hn.hn.hnj qor;

    @Override // com.bytedance.adsdk.hnj.hn.hn.hn
    public void hn(com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar) {
        this.f12157hn = hnjVar;
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        Object objHnj = this.hnj.hnj(map);
        if (objHnj == null) {
            return null;
        }
        return ((Boolean) objHnj).booleanValue() ? this.f12157hn.hnj(map) : this.qor.hnj(map);
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hn
    public void qor(com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar) {
        this.qor = hnjVar;
    }

    public String toString() {
        return hn();
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public String hn() {
        return this.hnj.hn() + "?" + this.f12157hn.hn() + ":" + this.qor.hn();
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public com.bytedance.adsdk.hnj.hn.gjv.sk hnj() {
        return com.bytedance.adsdk.hnj.hn.gjv.dkl.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hn
    public void hnj(com.bytedance.adsdk.hnj.hn.hn.hnj hnjVar) {
        this.hnj = hnjVar;
    }
}
