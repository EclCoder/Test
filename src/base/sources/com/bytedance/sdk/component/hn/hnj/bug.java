package com.bytedance.sdk.component.hn.hnj;

import com.google.api.client.http.HttpMethods;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class bug {
    private long gjv = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public com.bytedance.sdk.component.qor.hnj.hnj f12850hn = new com.bytedance.sdk.component.qor.hnj.hnj();
    public dnm hnj;
    private List<String> qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        String aq;
        orl dkl;
        int dse;
        String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        Map<String, List<String>> f12851hn;
        com.bytedance.sdk.component.hn.hnj.hnj hnj;
        private List<String> ojm;
        dse qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        Object f12852sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private long f12853ta;

        public hnj() {
            this.f12853ta = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.f12851hn = new HashMap();
        }

        public hnj hn(String str) {
            return hnj(dse.qor(str));
        }

        public hnj hnj(com.bytedance.sdk.component.hn.hnj.hnj hnjVar) {
            this.hnj = hnjVar;
            return this;
        }

        public hnj hn(String str, String str2) {
            if (!this.f12851hn.containsKey(str)) {
                this.f12851hn.put(str, new ArrayList());
            }
            this.f12851hn.get(str).add(str2);
            return this;
        }

        public hnj hnj(String str) {
            this.aq = str;
            return this;
        }

        hnj(bug bugVar) {
            this.f12853ta = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.qor = bugVar.gjv();
            this.gjv = bugVar.sk();
            this.f12851hn = bugVar.dkl();
            this.f12852sk = bugVar.qor();
            this.dkl = bugVar.ta();
            this.hnj = bugVar.dse();
            this.dse = bugVar.ojm();
            this.aq = bugVar.aq();
            this.ojm = bugVar.hnj();
            this.f12853ta = bugVar.hn();
        }

        public hnj hnj(int i10) {
            this.dse = i10;
            return this;
        }

        public hnj hnj(Object obj) {
            this.f12852sk = obj;
            return this;
        }

        public bug hn() {
            return new bug() { // from class: com.bytedance.sdk.component.hn.hnj.bug.hnj.1
                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public String aq() {
                    return hnj.this.aq;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public Map dkl() {
                    return hnj.this.f12851hn;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public com.bytedance.sdk.component.hn.hnj.hnj dse() {
                    return hnj.this.hnj;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public dse gjv() {
                    return hnj.this.qor;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public long hn() {
                    return hnj.this.f12853ta;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public List<String> hnj() {
                    return hnj.this.ojm;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public int ojm() {
                    return hnj.this.dse;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public Object qor() {
                    return hnj.this.f12852sk;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public String sk() {
                    return hnj.this.gjv;
                }

                @Override // com.bytedance.sdk.component.hn.hnj.bug
                public orl ta() {
                    return hnj.this.dkl;
                }

                public String toString() {
                    return "";
                }
            };
        }

        public hnj hnj(dse dseVar) {
            this.qor = dseVar;
            return this;
        }

        public hnj hnj(String str, String str2) {
            return hn(str, str2);
        }

        public hnj hnj() {
            return hnj(HttpMethods.GET, (orl) null);
        }

        private hnj hnj(String str, orl orlVar) {
            this.gjv = str;
            this.dkl = orlVar;
            return this;
        }

        public hnj hnj(orl orlVar) {
            return hnj(HttpMethods.POST, orlVar);
        }

        public hnj hnj(List<String> list) {
            this.ojm = list;
            return this;
        }

        public hnj hnj(long j10) {
            this.f12853ta = j10;
            return this;
        }
    }

    public abstract String aq();

    public abstract Map<String, List<String>> dkl();

    public hnj dnm() {
        return new hnj(this);
    }

    public abstract com.bytedance.sdk.component.hn.hnj.hnj dse();

    public abstract dse gjv();

    public long hn() {
        return this.gjv;
    }

    public List<String> hnj() {
        return this.qor;
    }

    public abstract int ojm();

    public abstract Object qor();

    public abstract String sk();

    public orl ta() {
        return null;
    }

    public void hnj(dnm dnmVar) {
        this.hnj = dnmVar;
    }
}
