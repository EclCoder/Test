package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bytedance.sdk.component.utils.apu;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends qor {
    private String dkl;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14475hn;
    private String hnj;
    private long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f14476sk;

    public void hn(long j10) {
        this.qor = j10;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void qor(String str) {
        this.dkl = str;
    }

    public void hn(String str) {
        this.f14476sk = str;
    }

    public void hnj(long j10) {
        this.f14475hn = j10;
    }

    public void hnj(int i10) {
        this.gjv = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.sk.hn.qor
    public void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.hnj);
            jSONObject.put("preload_size", this.f14475hn);
            jSONObject.put("load_time", this.qor);
            jSONObject.put("error_code", this.gjv);
            jSONObject.put("error_message", this.f14476sk);
            jSONObject.put("error_message_server", this.dkl);
        } catch (Throwable th2) {
            apu.qor("LoadVideoErrorModel", th2.getMessage());
        }
    }
}
