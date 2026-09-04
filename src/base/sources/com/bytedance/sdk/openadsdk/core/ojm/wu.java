package com.bytedance.sdk.openadsdk.core.ojm;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class wu implements com.bytedance.sdk.openadsdk.core.bug.dse.qor {
    private String dkl;
    private long hnj = 0;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14082hn = 0;
    private int qor = 0;
    private String gjv = null;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f14083sk = null;
    private final AtomicBoolean dse = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
    public void hn(String str) {
        this.f14083sk = str;
        this.f14082hn = SystemClock.elapsedRealtime();
        this.dse.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
    public void hnj(String str) {
        this.dkl = str;
        this.hnj = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.dse.qor
    public void hnj(int i10, String str, String str2) {
        this.qor = i10;
        this.gjv = str;
        this.f14083sk = str2;
        this.f14082hn = SystemClock.elapsedRealtime();
        this.dse.set(false);
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, String str) {
        if (this.dse.get()) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, false, str, "success", this.f14082hn - this.hnj, this.f14083sk, this.dkl, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, false, str, "fail", this.f14082hn - this.hnj, this.f14083sk, this.dkl, this.qor, this.gjv);
        }
    }
}
