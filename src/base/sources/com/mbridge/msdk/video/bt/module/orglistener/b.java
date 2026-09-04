package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f34156a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f34157b = null;

    public void a() {
        this.f34157b = Boolean.TRUE;
    }

    public void b() {
        this.f34156a = Boolean.TRUE;
    }

    public Boolean c() {
        return this.f34157b;
    }

    public Boolean d() {
        return this.f34156a;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        q0.a("ShowRewardListener", "onAdShow");
        this.f34156a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        q0.a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        q0.a("ShowRewardListener", "onAdClose:isCompleteView:" + z10 + ",reward:" + cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        q0.a("ShowRewardListener", "onShowFail:" + str);
        this.f34157b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        q0.a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        q0.a("ShowRewardListener", "onAdCloseWithIVReward: " + z10 + "  " + i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        q0.a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        q0.a("ShowRewardListener", "onAutoLoad: " + str2);
    }
}
