package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void fvt() {
        if (as.sk(this.f13046hn.f13456hn)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.f13046hn.f33do;
        if (ojmVar == null || ojmVar.hnj() == null) {
            return;
        }
        this.f13046hn.f33do.hnj().setTime(MBridgeConstans.ENDCARD_URL_TYPE_PL, 0, 0, false);
        if (this.f13046hn.f33do.ojm()) {
            this.f13046hn.f13454gm.hnj(MBridgeConstans.ENDCARD_URL_TYPE_PL, "X");
            this.f13046hn.f13454gm.sk(true);
            this.f13046hn.f13454gm.qor();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout gm() {
        return this.f13046hn.f33do.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void hnj(long j10, long j11) {
        int i10 = (int) (j10 / 1000);
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar = this.f13046hn.f33do;
        if (ojmVar != null && ojmVar.hnj() != null) {
            this.f13046hn.f33do.hnj().setTime(String.valueOf(this.f13048sk), i10, 0, false);
            this.f13046hn.f33do.hnj().hnj(j10, j11);
        }
        com.bytedance.sdk.openadsdk.component.reward.view.ojm ojmVar2 = this.f13046hn.f33do;
        if ((ojmVar2 == null || !ojmVar2.ojm()) && !this.f13046hn.f13456hn.ouk()) {
            return;
        }
        hnj(i10);
        if (this.f13048sk >= 0) {
            this.f13046hn.f13454gm.gjv(true);
            this.f13046hn.f13454gm.hnj(String.valueOf(this.f13048sk), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> orp() {
        return this.f13046hn.ojm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
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
