package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.orp;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug {
    private boolean dkl;
    private long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f13386hn;
    private final hnj hnj;
    private long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13387sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(int i10);
    }

    public bug(hnj hnjVar) {
        this.f13387sk = true;
        this.hnj = hnjVar;
        int iHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("reward_callback_fallback", 0);
        if (iHnj != 0) {
            this.f13387sk = false;
            if (iHnj == 2) {
                this.dkl = true;
            }
        }
    }

    public static void hnj(as asVar, boolean z10, final int i10) {
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, orp.hnj(asVar), z10 ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.jip.hn.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.bug.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
            public JSONObject hnj() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i10);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void gjv() {
        if (this.hnj != null) {
            long jElapsedRealtime = (this.gjv + (this.qor > 0 ? SystemClock.elapsedRealtime() - this.qor : 0L)) / 1000;
            if (this.f13387sk) {
                return;
            }
            if (this.dkl) {
                this.hnj.hnj(jElapsedRealtime < this.f13386hn ? 4 : 1);
            } else if (jElapsedRealtime >= this.f13386hn) {
                this.hnj.hnj(1);
            }
        }
    }

    public void hn() {
        if (this.f13387sk) {
            return;
        }
        this.qor = SystemClock.elapsedRealtime();
    }

    public void qor() {
        this.f13387sk = true;
    }

    public void hnj(long j10) {
        if (j10 <= this.f13386hn) {
            return;
        }
        this.f13386hn = j10;
    }

    public void hnj() {
        if (!this.f13387sk && this.qor > 0) {
            this.gjv += SystemClock.elapsedRealtime() - this.qor;
            this.qor = 0L;
        }
    }
}
