package com.bytedance.sdk.openadsdk.core.bug.dkl;

import com.bytedance.adsdk.ugeno.core.oj;
import com.bytedance.sdk.component.adexpress.hn.orl;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends orl {
    private float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private oj f13599hn;
    private JSONObject hnj;
    private float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13600sk;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bug.dkl.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0207hnj extends orl.hnj {
        private float gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private oj f13601hn;
        private JSONObject hnj;
        private float qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private boolean f13602sk;

        public C0207hnj dkl(boolean z10) {
            this.f13602sk = z10;
            return this;
        }

        public C0207hnj hn(float f10) {
            this.gjv = f10;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.hn.orl.hnj
        /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
        public hnj hnj() {
            return new hnj(this);
        }

        public C0207hnj hnj(JSONObject jSONObject) {
            this.hnj = jSONObject;
            return this;
        }

        public C0207hnj hnj(oj ojVar) {
            this.f13601hn = ojVar;
            return this;
        }

        public C0207hnj hnj(float f10) {
            this.qor = f10;
            return this;
        }
    }

    public hnj(C0207hnj c0207hnj) {
        super(c0207hnj);
        this.hnj = c0207hnj.hnj;
        this.f13599hn = c0207hnj.f13601hn;
        this.qor = c0207hnj.qor;
        this.gjv = c0207hnj.gjv;
        this.f13600sk = c0207hnj.f13602sk;
    }

    public oj gm() {
        return this.f13599hn;
    }

    public float hqh() {
        return this.qor;
    }

    public float nyv() {
        return this.gjv;
    }

    public JSONObject pty() {
        return this.hnj;
    }

    public boolean ul() {
        return this.f13600sk;
    }
}
