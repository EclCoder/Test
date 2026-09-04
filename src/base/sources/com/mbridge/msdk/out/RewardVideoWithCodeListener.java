package com.mbridge.msdk.out;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.mbridge.msdk.util.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class RewardVideoWithCodeListener implements RewardVideoListener {
    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, a.b(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, str), str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str);

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        onVideoLoadFailWithCode(mBridgeIds, a.a(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, str), str);
    }

    public abstract void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str);
}
