package com.bytedance.sdk.openadsdk.core.bug.dkl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.oj;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.xn;
import com.bytedance.sdk.openadsdk.utils.orp;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    private final String hnj = "UGenV3OpenLinks";

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f13584hn = "landingStyle";
    private final String qor = "url";
    private final String gjv = "fallbackUrl";

    public void hnj(Context context, boolean z10, as asVar, String str, Map<String, String> map, com.bytedance.sdk.openadsdk.core.widget.sk skVar) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            if (hnj(Integer.parseInt(map.get("landingStyle")), map.get("url"), map.get("fallbackUrl"))) {
                xn.hnj(context, z10, hnj(map), asVar, str, orp.hnj(str), null, skVar);
            }
        } catch (Throwable th2) {
            apu.qor("UGenV3OpenLinks", th2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[RETURN] */
    private boolean hnj(int i10, String str, String str2) {
        if (i10 == 1) {
            if (!oj.hnj(str)) {
                return false;
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                if (!oj.hnj(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !oj.hnj(str2)) {
            return false;
        }
        return true;
    }

    private JSONObject hnj(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
