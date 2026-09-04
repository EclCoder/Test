package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bytedance.sdk.component.utils.apu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14474hn;
    private long hnj;

    public void hn(long j10) {
        this.f14474hn = j10;
    }

    public void hnj(long j10) {
        this.hnj = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.sk.hn.qor
    public void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.hnj);
            jSONObject.put("total_duration", this.f14474hn);
        } catch (Throwable th2) {
            apu.qor("FeedContinueModel", th2.getMessage());
        }
    }
}
