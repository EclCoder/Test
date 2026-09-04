package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f34158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34159d;

    public c(com.mbridge.msdk.video.bt.module.listener.b bVar, String str) {
        this.f34158c = bVar;
        this.f34159d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f34158c != null) {
            q0.a("H5ShowRewardListener", "onAdShow");
            this.f34158c.a(this.f34159d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        if (this.f34158c != null) {
            q0.a("H5ShowRewardListener", "onVideoComplete");
            this.f34158c.a(this.f34159d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        if (this.f34158c != null) {
            q0.a("H5ShowRewardListener", "onAdClose");
            this.f34158c.a(this.f34159d, z10, cVar2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        if (this.f34158c != null) {
            q0.a("H5ShowRewardListener", "onShowFail");
            this.f34158c.a(this.f34159d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        if (this.f34158c != null) {
            q0.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f34158c.b(this.f34159d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        if (this.f34158c != null) {
            q0.a("H5ShowRewardListener", "onEndcardShow");
            this.f34158c.c(this.f34159d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        if (this.f34158c != null) {
            q0.a("H5ShowRewardListener", "onAutoLoad");
            this.f34158c.a(this.f34159d, i10, str, str2);
        }
    }
}
