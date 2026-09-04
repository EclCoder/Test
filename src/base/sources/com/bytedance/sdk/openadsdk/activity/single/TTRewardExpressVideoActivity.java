package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout gm() {
        return this.f13046hn.f33do.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hnj(long j10, long j11) {
        int iQlh = this.f13046hn.f13456hn.qlh();
        boolean z10 = this.f13046hn.f33do.ojm() && iQlh >= 0;
        int i10 = (int) (j10 / 1000);
        qor(j10, j11);
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.f13046hn.f33do;
        if (ojmVar != null && ojmVar.hnj() != null) {
            this.f13046hn.f33do.hnj().setTime(String.valueOf(this.f13048sk), i10, 0, false);
            this.f13046hn.f33do.hnj().hnj(j10, j11);
        }
        int i11 = this.f13048sk;
        if (i11 > 0) {
            if (!z10) {
                this.f13046hn.f13454gm.hnj(String.valueOf(i11), null);
                return;
            }
            if (i10 < iQlh) {
                this.f13046hn.f13454gm.hnj(String.valueOf(i11), null);
                return;
            }
            if (this.f13046hn.f13456hn.qb() == 5 || this.f13046hn.f13456hn.qb() == 33) {
                this.f13046hn.f13454gm.hnj(String.valueOf(this.f13048sk), null);
                return;
            }
            this.f13046hn.hnj(true);
            this.f13046hn.f13454gm.hnj(String.valueOf(this.f13048sk), TTAdDislikeToast.getSkipText());
            this.f13046hn.f13454gm.sk(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> orp() {
        return this.f13046hn.ojm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean tgn() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean xyo() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void oj() {
    }
}
