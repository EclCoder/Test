package com.mbridge.msdk.dycreator.viewdata;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.mbridge.msdk.dycreator.viewdata.base.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f30043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f30044b;

    public a(DyOption dyOption) {
        this.f30043a = dyOption;
        this.f30044b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f30044b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f30043a;
    }
}
