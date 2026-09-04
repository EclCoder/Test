package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bykv.vk.openvk.hnj.hnj.hnj.qor.b;
import com.bytedance.sdk.component.utils.apu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg extends qor {
    private final int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14470hn;
    private long hnj;
    private final int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f14471sk;

    public mjg(b bVar) {
        this.qor = bVar.b();
        this.gjv = bVar.a();
        this.f14471sk = bVar.d();
    }

    public void hn(long j10) {
        this.f14470hn = j10;
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
            jSONObject.put("total_duration", this.f14470hn);
            jSONObject.put("error_code", this.qor);
            jSONObject.put("extra_error_code", this.gjv);
            jSONObject.put("error_message", this.f14471sk);
        } catch (Throwable th2) {
            apu.qor("PlayErrorModel", th2.getMessage());
        }
    }
}
