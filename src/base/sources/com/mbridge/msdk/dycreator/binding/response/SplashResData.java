package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SplashResData extends BaseRespData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f29905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f29906b;

    public a getBaseViewData() {
        return this.f29905a;
    }

    public EAction geteAction() {
        return this.f29906b;
    }

    public void setBaseViewData(a aVar) {
        this.f29905a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f29906b = eAction;
    }
}
