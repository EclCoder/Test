package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bykv.vk.openvk.hnj.hnj.hnj.qor.c;
import com.bytedance.sdk.component.utils.apu;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p6.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends qor {
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14456hn;
    private final c hnj;
    private long qor;

    public aq(c cVar) {
        this.hnj = cVar;
    }

    public void hn(long j10) {
        this.qor = j10;
    }

    public void hnj(long j10) {
        this.f14456hn = j10;
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
            jSONObject.put("video_start_duration", this.f14456hn);
            jSONObject.put("video_cache_size", this.qor);
            jSONObject.put("is_auto_play", this.gjv);
        } catch (Throwable th2) {
            apu.qor("FeedPlayModel", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gjv.sk.hn.qor
    public void hnj(hnj hnjVar) throws Throwable {
        if (this.hnj.tgn()) {
            String strSk = this.hnj.sk();
            String strUua = this.hnj.uua();
            File fileA = a.a(strSk, strUua);
            File fileD = a.d(strSk, strUua);
            if (fileD.exists()) {
                fileA = fileD;
            }
            try {
                hnjVar.gjv().put("moov_box_pos", w6.a.a(fileA));
            } catch (JSONException unused) {
            }
        }
    }
}
