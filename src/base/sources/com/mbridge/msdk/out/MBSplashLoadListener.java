package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface MBSplashLoadListener {
    void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10);

    void onLoadFailed(MBridgeIds mBridgeIds, String str, int i10);

    void onLoadSuccessed(MBridgeIds mBridgeIds, int i10);
}
