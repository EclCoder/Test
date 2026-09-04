package com.bytedance.sdk.component.dse.hn;

import android.text.TextUtils;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor {
    int dkl;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<String> f12834hn;
    protected dnm qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    String f12835sk;
    protected String gjv = null;
    protected final Map<String, String> dse = new HashMap();
    protected String aq = null;
    private String hnj = null;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private long f12836ta = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
    protected boolean ojm = false;

    public qor(dnm dnmVar) {
        this.qor = dnmVar;
        try {
            gjv(UUID.randomUUID().toString());
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void gjv(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.dse.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void hn(String str) {
        this.f12835sk = str;
    }

    public void hnj(List<String> list) {
        this.f12834hn = list;
    }

    public String qor() {
        return this.hnj;
    }

    public String sk() {
        return this.aq;
    }

    public void hn(String str, String str2) {
        this.dse.put(str, str2);
    }

    public void hnj(long j10, TimeUnit timeUnit) {
        this.f12836ta = timeUnit.toMillis(j10);
    }

    public void qor(String str) {
        this.aq = str;
    }

    public void gjv(String str) {
        this.gjv = str;
    }

    public void hn() {
        dnm dnmVar;
        if (this.gjv == null || (dnmVar = this.qor) == null) {
            return;
        }
        com.bytedance.sdk.component.hn.hnj.gjv gjvVarHnj = dnmVar.hnj();
        synchronized (gjvVarHnj) {
            try {
                for (com.bytedance.sdk.component.hn.hnj.hn hnVar : gjvVarHnj.qor()) {
                    if (this.gjv.equals(hnVar.hnj().qor())) {
                        hnVar.qor();
                    }
                }
                for (com.bytedance.sdk.component.hn.hnj.hn hnVar2 : gjvVarHnj.gjv()) {
                    if (this.gjv.equals(hnVar2.hnj().qor())) {
                        hnVar2.qor();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void hnj(bug.hnj hnjVar) {
        if (com.bytedance.sdk.component.dse.hnj.dkl()) {
            List<String> list = this.f12834hn;
            if (list != null && !list.isEmpty()) {
                hnjVar.hnj(this.f12834hn);
            }
            hnjVar.hnj(this.f12836ta);
        }
    }

    public String gjv() {
        return this.gjv;
    }

    protected void hnj(String str) {
        this.hnj = str;
    }

    public void hnj(int i10) {
        this.dkl = i10;
    }

    protected void hn(bug.hnj hnjVar) {
        if (hnjVar != null && this.dse.size() > 0) {
            for (Map.Entry<String, String> entry : this.dse.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    hnjVar.hn(key, value);
                }
            }
        }
    }
}
