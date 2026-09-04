package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg {
    private jip dkl;
    private com.bytedance.sdk.openadsdk.common.hnj.InterfaceC0202hnj dse;
    private final com.bytedance.sdk.openadsdk.common.hnj.hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f13304hn;
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj;
    private final Runnable qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13305sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private final com.bytedance.sdk.openadsdk.common.hnj.hn gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final String f13306hn;
        private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj;
        private final Runnable qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private boolean f13307sk = false;
        private jip dkl = null;
        private com.bytedance.sdk.openadsdk.common.hnj.InterfaceC0202hnj dse = null;

        public hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar, String str, Runnable runnable, com.bytedance.sdk.openadsdk.common.hnj.hn hnVar) {
            this.hnj = hnjVar;
            this.f13306hn = str;
            this.qor = runnable;
            this.gjv = hnVar;
        }

        public hnj hnj(boolean z10) {
            this.f13307sk = z10;
            return this;
        }

        public hnj hnj(jip jipVar) {
            this.dkl = jipVar;
            return this;
        }

        public hnj hnj(com.bytedance.sdk.openadsdk.common.hnj.InterfaceC0202hnj interfaceC0202hnj) {
            this.dse = interfaceC0202hnj;
            return this;
        }

        public mjg hnj() {
            if (this.hnj != null) {
                if (this.qor != null) {
                    if (this.gjv != null) {
                        return new mjg(this);
                    }
                    throw new IllegalArgumentException("SkipResultHandler cannot be null");
                }
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            throw new IllegalArgumentException("RewardFullContext cannot be null");
        }
    }

    public jip dkl() {
        return this.dkl;
    }

    public com.bytedance.sdk.openadsdk.common.hnj.InterfaceC0202hnj dse() {
        return this.dse;
    }

    public com.bytedance.sdk.openadsdk.common.hnj.hn gjv() {
        return this.gjv;
    }

    public String hn() {
        return this.f13304hn;
    }

    public com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnj() {
        return this.hnj;
    }

    public Runnable qor() {
        return this.qor;
    }

    public boolean sk() {
        return this.f13305sk;
    }

    private mjg(hnj hnjVar) {
        this.hnj = hnjVar.hnj;
        this.f13304hn = hnjVar.f13306hn;
        this.qor = hnjVar.qor;
        this.gjv = hnjVar.gjv;
        this.f13305sk = hnjVar.f13307sk;
        this.dkl = hnjVar.dkl;
        this.dse = hnjVar.dse;
    }
}
