package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBridgeClickMiniCardView f34665b;

    public g(MBridgeClickMiniCardView mBridgeClickMiniCardView, com.mbridge.msdk.video.module.listener.a aVar) {
        super(aVar);
        this.f34665b = mBridgeClickMiniCardView;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.i, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        boolean z10 = false;
        switch (i10) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f34665b;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f34665b;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                }
                break;
            case 101:
            case 102:
                z10 = true;
                break;
            case 103:
                i10 = 107;
                break;
        }
        if (z10) {
            return;
        }
        super.a(i10, obj);
    }
}
