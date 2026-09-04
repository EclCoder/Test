package com.mbridge.msdk.out;

import android.content.Context;
import com.mbridge.msdk.out.strategy.base.BidAdHandler;
import com.mbridge.msdk.out.strategy.component.BidComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.reward.BidRewardVideoStrategy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBBidRewardVideoHandler extends BidAdHandler {
    private static final String TAG = "MBBidRewardVideoHandler";

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    protected void initStrategy(String str, String str2) {
        this.legacyBidVideoAdStrategy = new BidRewardVideoStrategy(str2, str);
        this.componentBidVideoAdStrategy = new BidComponentStrategy(str2, str, 94);
    }

    public MBBidRewardVideoHandler(String str, String str2) {
        super(str, str2);
    }
}
