package com.mbridge.msdk.out;

import com.mbridge.msdk.util.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class NativeAdvancedAdWithCodeListener implements NativeAdvancedAdListener {
    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        onLoadFailedWithCode(mBridgeIds, a.a(6000, str), str);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str);
}
