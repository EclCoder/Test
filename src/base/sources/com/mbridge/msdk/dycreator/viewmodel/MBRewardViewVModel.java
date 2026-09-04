package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.viewdata.a;
import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBRewardViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f30050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f30051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f30052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f30053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f30054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DyOption f30055f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f30055f = dyOption;
        EventBus.getDefault().register(this);
    }

    private void a(Object obj) {
        c cVar = this.f30051b;
        if (cVar != null) {
            cVar.a(obj);
        }
    }

    private void b(Object obj) {
        d dVar = this.f30050a;
        if (dVar != null) {
            dVar.a(obj);
        }
    }

    private void c(Object obj) {
        f fVar = this.f30052c;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    private void d(Object obj) {
        h hVar = this.f30053d;
        if (hVar != null) {
            hVar.a(obj);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f30051b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f30050a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f30054e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f30052c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        a aVar = new a(this.f30055f);
        b(aVar);
        a(aVar);
        c(aVar);
        d(aVar);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f30053d = hVar;
        }
    }

    private void a(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f30054e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }
}
