package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bytedance.sdk.component.utils.apu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl extends qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public int f14473hn;
    public long hnj;
    public long qor;

    public void hn(long j10) {
        this.qor = j10;
    }

    public void hnj(long j10) {
        this.hnj = j10;
    }

    public void hnj(int i10) {
        this.f14473hn = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.sk.hn.qor
    public void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.hnj);
            jSONObject.put("buffers_count", this.f14473hn);
            jSONObject.put("total_duration", this.qor);
        } catch (Throwable th2) {
            apu.qor("PlayBufferModel", th2.getMessage());
        }
    }
}
