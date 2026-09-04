package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import android.os.SystemClock;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.utils.apu;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import w6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends qor {
    private int gjv = 0;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14458hn;
    private final c hnj;
    private long qor;

    public dkl(c cVar) {
        this.hnj = cVar;
    }

    public void hn(long j10) {
        this.qor = j10;
    }

    public void hnj(long j10) {
        this.f14458hn = j10;
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
            jSONObject.put("total_duration", this.f14458hn);
            jSONObject.put("buffers_time", this.qor);
            jSONObject.put("video_backup", this.gjv);
        } catch (Throwable th2) {
            apu.qor("FeedOverModel", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.sk.hn.qor
    public void hnj(hnj hnjVar) {
        super.hnj(hnjVar);
        JSONObject jSONObjectGjv = hnjVar.gjv();
        if (com.bytedance.sdk.openadsdk.as.sk.hnj("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.hnj.sk(), this.hnj.uua());
        if (file.exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                jSONObjectGjv.put("level", a.b(file.getAbsolutePath()));
                jSONObjectGjv.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
            } catch (JSONException unused) {
            }
        }
    }
}
