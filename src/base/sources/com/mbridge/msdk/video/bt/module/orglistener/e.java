package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e extends MBTempContainer.k.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f34169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f34170c;

    public e(com.mbridge.msdk.foundation.same.report.metrics.c cVar, h hVar) {
        this.f34169b = hVar;
        this.f34170c = cVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k.a, com.mbridge.msdk.video.bt.module.MBTempContainer.k
    public void onError(String str) {
        super.onError(str);
        h hVar = this.f34169b;
        if (hVar != null) {
            hVar.a(this.f34170c, str);
        }
    }
}
