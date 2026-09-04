package com.bytedance.sdk.component.hnj;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class orl {
    private final Map<String, Object> hnj = new ConcurrentHashMap();

    private orl() {
    }

    public static orl hnj() {
        return new orl();
    }

    public String hn() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.hnj.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public orl hnj(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.hnj.put(str, obj);
        }
        return this;
    }
}
