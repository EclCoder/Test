package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MBridgeVideoView f34657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MBridgeContainerView f34658o;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f34657n = mBridgeVideoView;
        this.f34658o = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f34668a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f34668a) {
            if (i10 == 8) {
                MBridgeContainerView mBridgeContainerView = this.f34658o;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f34657n;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f34657n;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.alertWebViewShowed();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f34657n;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            } else if (i10 == 107) {
                this.f34658o.showVideoClickView(-1);
                this.f34657n.setCover(false);
                this.f34657n.setMiniEndCardState(false);
                this.f34657n.videoOperate(1);
            } else if (i10 == 112) {
                this.f34657n.setCover(true);
                this.f34657n.setMiniEndCardState(true);
                this.f34657n.videoOperate(2);
            } else if (i10 == 115) {
                this.f34658o.resizeMiniCard(this.f34657n.getBorderViewWidth(), this.f34657n.getBorderViewHeight(), this.f34657n.getBorderViewRadius());
            }
        }
        super.a(i10, obj);
    }
}
