package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.strategy.base.NonBidAdHandler;
import com.mbridge.msdk.out.strategy.component.ComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.interstitial.NewInterstitialStrategy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBNewInterstitialHandler extends NonBidAdHandler {
    public MBNewInterstitialHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    protected void initStrategy(String str, String str2) {
        this.legacyVideoAdStrategy = new NewInterstitialStrategy(str2, str);
        this.componentAdStrategy = new ComponentStrategy(str2, str, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
    }

    public MBNewInterstitialHandler(String str, String str2) {
        super(str, str2);
    }
}
