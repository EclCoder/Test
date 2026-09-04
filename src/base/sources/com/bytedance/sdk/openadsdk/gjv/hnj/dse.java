package com.bytedance.sdk.openadsdk.gjv.hnj;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.core.settings.dnm;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements com.bytedance.sdk.component.dkl.hnj.sk {
    private final String hnj = "[7913]";

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public boolean aq() {
        return true;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public long bug() {
        long jHnj = com.bytedance.sdk.openadsdk.as.sk.hnj("log_queue_timeout", 40000);
        if (jHnj < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL || jHnj > 120000) {
            return 40000L;
        }
        return jHnj;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public int dkl() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public com.bytedance.sdk.component.dkl.hnj.dkl dnm() {
        return null;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public boolean dse() {
        return false;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public int fc() {
        return com.bytedance.sdk.openadsdk.as.sk.hnj("batch_log_config", "once_max", 10);
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public Executor gjv() {
        return ua.gjv();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public boolean hn() {
        return false;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnj(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public boolean mjg() {
        return com.bytedance.sdk.openadsdk.as.sk.hnj("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public String ojm() {
        return orp.gjv();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public boolean orl() {
        return com.bytedance.sdk.openadsdk.as.sk.hnj("batch_log_config", "enable", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public boolean qor() {
        return true;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public Executor sk() {
        return ua.aq();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public com.bytedance.sdk.component.dkl.hnj.sk.qor ta() {
        if (com.bytedance.sdk.openadsdk.core.ta.hn.hnj().sk()) {
            return null;
        }
        return new qor();
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public String hn(String str) {
        return com.bytedance.sdk.component.gjv.hnj.hnj(str, com.bytedance.sdk.openadsdk.core.hnj.hnj());
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public boolean hnj() {
        return false;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public int qor(String str) {
        ta taVarXw = dnm.hn().xw();
        if (taVarXw == null) {
            return 3;
        }
        return taVarXw.hnj(str);
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public boolean hnj(Context context) {
        return oj.hnj(context);
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public String hnj(String str) {
        return com.bytedance.sdk.component.gjv.hnj.hn(str, com.bytedance.sdk.openadsdk.core.hnj.hnj());
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public void hnj(boolean z10, int i10, long j10, com.bytedance.sdk.component.dkl.hnj.dkl.gjv gjvVar) {
        Runnable runnableHnj;
        if (gjvVar == null) {
            return;
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.jip.gjv.hnj("track_link_result", false, new ojm(true, gjvVar));
            return;
        }
        ta taVarXw = dnm.hn().xw();
        if (taVarXw == null || gjvVar.gjv() >= taVarXw.hnj(gjvVar.dkl())) {
            com.bytedance.sdk.openadsdk.jip.gjv.hnj("track_link_result", false, new ojm(false, gjvVar));
        } else {
            if (!taVarXw.hnj() || (runnableHnj = gjvVar.hnj(orl.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()), null)) == null) {
                return;
            }
            ua.hnj().schedule(runnableHnj, taVarXw.hn(gjvVar.dkl()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.sk
    public HandlerThread hnj(String str, int i10) {
        return com.bytedance.sdk.component.utils.aq.hnj(str, i10);
    }
}
