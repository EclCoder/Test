package com.mbridge.msdk.splash.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32754d;

    public b(int i10) {
        this.f32754d = i10;
    }

    public abstract void a(CampaignUnit campaignUnit, int i10);

    @Override // com.mbridge.msdk.splash.request.d
    public void a(List<Frame> list) {
    }

    public abstract void b(int i10, String str);

    @Override // com.mbridge.msdk.splash.request.d
    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit, this.f32754d);
    }

    @Override // com.mbridge.msdk.splash.request.d
    public void a(int i10, String str) {
        b(i10, str);
    }
}
