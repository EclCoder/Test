package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bytedance.sdk.component.utils.apu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends qor {
    public int gjv = 0;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public long f14466hn;
    public long hnj;
    public int qor;

    public void hn(long j10) {
        this.f14466hn = j10;
    }

    public void hnj(long j10) {
        this.hnj = j10;
    }

    public void hn(int i10) {
        this.gjv = i10;
    }

    public void hnj(int i10) {
        this.qor = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.sk.hn.qor
    public void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.hnj);
            jSONObject.put("buffers_time", this.f14466hn);
            jSONObject.put("break_reason", this.qor);
            jSONObject.put("video_backup", this.gjv);
        } catch (Throwable th2) {
            apu.qor("FeedBreakModel", th2.getMessage());
        }
    }
}
