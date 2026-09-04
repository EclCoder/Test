package com.mbridge.msdk.reward.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends c {
    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.reward.request.c
    public void a(List<Frame> list) {
    }

    public abstract void b(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    @Override // com.mbridge.msdk.reward.request.c
    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit);
    }

    @Override // com.mbridge.msdk.reward.request.c
    public void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        b(i10, str, cVar);
    }
}
