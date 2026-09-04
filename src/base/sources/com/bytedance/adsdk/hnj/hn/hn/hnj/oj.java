package com.bytedance.adsdk.hnj.hn.hn.hnj;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj extends uua {
    private static final ThreadLocal<StringBuilder> gjv = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.hnj.hn.hn.hnj.oj.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public oj() {
        super(com.bytedance.adsdk.hnj.hn.gjv.qor.PLUS);
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        Object objHnj;
        Object objHnj2 = this.hnj.hnj(map);
        if (objHnj2 == null || (objHnj = this.f12156hn.hnj(map)) == null) {
            return null;
        }
        if (!(objHnj2 instanceof String) && !(objHnj instanceof String)) {
            return com.bytedance.adsdk.hnj.hn.sk.hnj.aq.hnj((Number) objHnj2, (Number) objHnj);
        }
        StringBuilder sb2 = gjv.get();
        sb2.append(objHnj2);
        sb2.append(objHnj);
        String string = sb2.toString();
        sb2.setLength(0);
        return string;
    }
}
