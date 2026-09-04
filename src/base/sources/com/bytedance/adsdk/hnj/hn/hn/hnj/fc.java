package com.bytedance.adsdk.hnj.hn.hn.hnj;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc implements com.bytedance.adsdk.hnj.hn.hn.hnj {
    private Number hnj;

    public fc(String str) {
        if (str.indexOf(46) < 0) {
            try {
                this.hnj = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.hnj = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.hnj = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.hnj = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public String hn() {
        return this.hnj.toString();
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        return this.hnj;
    }

    public String toString() {
        return hn();
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public com.bytedance.adsdk.hnj.hn.gjv.sk hnj() {
        return com.bytedance.adsdk.hnj.hn.gjv.dkl.NUMBER;
    }
}
