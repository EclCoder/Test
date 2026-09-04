package com.bytedance.sdk.openadsdk.ta;

import com.bytedance.sdk.component.sk.ojm;
import com.bytedance.sdk.component.sk.xn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements xn {
    private static int hnj;
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14620hn = 0;
    private long qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f14621sk;

    public sk() {
        hnj++;
        this.f14621sk = "image_request_" + hnj;
    }

    @Override // com.bytedance.sdk.component.sk.xn
    public void hn(String str, ojm ojmVar) {
        this.qor += System.currentTimeMillis() - this.f14620hn;
        qor(str, ojmVar);
    }

    @Override // com.bytedance.sdk.component.sk.xn
    public void hnj(String str, ojm ojmVar) {
        if (!this.gjv) {
            ojmVar.hnj();
            ojmVar.hn();
            ojmVar.qor();
            this.gjv = true;
        }
        this.f14620hn = System.currentTimeMillis();
        qor(str, ojmVar);
    }

    private String qor(String str, ojm ojmVar) {
        return str;
    }
}
