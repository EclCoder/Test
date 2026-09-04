package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bytedance.sdk.component.utils.apu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final long f14472hn;
    private final String hnj;

    public ojm(String str, long j10) {
        this.hnj = str;
        this.f14472hn = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.sk.hn.qor
    public void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.hnj);
            jSONObject.put("preload_size", this.f14472hn);
        } catch (Throwable th2) {
            apu.qor("LoadVideoCancelModel", th2.getMessage());
        }
    }
}
