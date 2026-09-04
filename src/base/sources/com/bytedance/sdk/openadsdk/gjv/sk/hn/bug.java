package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bytedance.sdk.component.utils.apu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug extends qor {
    private long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14457hn;
    private String hnj;
    private long qor;

    public void hn(long j10) {
        this.qor = j10;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void qor(long j10) {
        this.gjv = j10;
    }

    public void hnj(long j10) {
        this.f14457hn = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.sk.hn.qor
    public void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.hnj);
            jSONObject.put("preload_size", this.f14457hn);
            jSONObject.put("load_time", this.qor);
            jSONObject.put("local_cache", this.gjv);
        } catch (Throwable th2) {
            apu.qor("LoadVideoSuccessModel", th2.getMessage());
        }
    }
}
