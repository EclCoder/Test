package com.mbridge.msdk.newinterstitial.out;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface NewInterstitialListener {
    void onAdClicked(MBridgeIds mBridgeIds);

    void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo);

    void onAdShow(MBridgeIds mBridgeIds);

    void onEndcardShow(MBridgeIds mBridgeIds);

    void onLoadCampaignSuccess(MBridgeIds mBridgeIds);

    void onResourceLoadFail(MBridgeIds mBridgeIds, String str);

    void onResourceLoadSuccess(MBridgeIds mBridgeIds);

    void onShowFail(MBridgeIds mBridgeIds, String str);

    void onVideoComplete(MBridgeIds mBridgeIds);
}
