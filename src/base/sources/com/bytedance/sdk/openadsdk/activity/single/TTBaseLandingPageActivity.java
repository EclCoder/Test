package com.bytedance.sdk.openadsdk.activity.single;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f13044hn;
    private long hnj;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        long j10 = this.hnj;
        if (j10 > 0) {
            com.bytedance.sdk.openadsdk.utils.sk.hnj(j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f13044hn > 0) {
            this.hnj += SystemClock.elapsedRealtime() - this.f13044hn;
            this.f13044hn = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.sk.qor()) {
            this.f13044hn = SystemClock.elapsedRealtime();
        }
    }
}
