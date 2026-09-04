package com.bytedance.sdk.openadsdk.qor;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.as;
import com.bytedance.sdk.openadsdk.core.oj;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static volatile hn hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final as<com.bytedance.sdk.openadsdk.gjv.hnj> f14590hn = oj.qor();

    private hn() {
    }

    public static hn hnj() {
        if (hnj == null) {
            synchronized (hn.class) {
                try {
                    if (hnj == null) {
                        hnj = new hn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public void hnj(String str, List<FilterWord> list, String str2) {
        hnj(str, list, null, null, str2);
    }

    public void hnj(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.f14590hn.hnj(str, list, jSONObject, str2, str3);
    }
}
