package com.bytedance.adsdk.hnj.hn.hn.hnj;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements com.bytedance.adsdk.hnj.hn.hn.hnj {
    private final Object hnj;

    public dse(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.hnj = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.hnj = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.hnj = null;
        }
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public String hn() {
        Object obj = this.hnj;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        return this.hnj;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.hnj + "]";
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public com.bytedance.adsdk.hnj.hn.gjv.sk hnj() {
        return com.bytedance.adsdk.hnj.hn.gjv.dkl.CONSTANT;
    }
}
