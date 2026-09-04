package com.bytedance.sdk.openadsdk.oj;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.ta;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class sk implements gjv {
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14584hn;
    private gjv hnj;
    private int qor;

    public sk(gjv gjvVar, int i10, int i11, int i12) {
        this.hnj = gjvVar;
        this.f14584hn = i10;
        this.qor = i11;
        this.gjv = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.oj.gjv
    public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
        com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVarHnj = this.hnj.hnj();
        hnjVarHnj.hnj(BuildConfig.VERSION_NAME);
        hnjVarHnj.hnj(this.f14584hn);
        hnjVarHnj.hn(this.qor);
        hnjVarHnj.qor(this.gjv);
        hnjVarHnj.dkl(ta.hn().dse());
        hnjVarHnj.gjv(fc.gjv());
        return hnjVarHnj;
    }
}
