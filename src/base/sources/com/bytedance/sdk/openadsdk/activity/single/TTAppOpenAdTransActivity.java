package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTAppOpenAdTransActivity extends TTAppOpenAdActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.aq || !sq.qor((Activity) this)) {
            return;
        }
        getWindow().getDecorView().setPadding(0, (int) sq.hnj(), 0, 0);
    }
}
