package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.impl.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeBTNativeECDiff extends BTBaseView {
    public View ctaView;

    public MBridgeBTNativeECDiff(Context context) {
        super(context);
    }

    public boolean checkChinaProgressBarStatus() {
        return false;
    }

    public MBridgeBTNativeECDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
    }

    public void setChinaCTAData(CampaignEx campaignEx) {
    }

    public void doChinaJumpClick(Context context, k kVar) {
    }
}
