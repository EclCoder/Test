package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f35004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d f35005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected j f35006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected g f35007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected f f35008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected i f35009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected c f35010g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f35004a == null) {
            this.f35004a = new com.mbridge.msdk.video.signal.impl.b();
        }
        return this.f35004a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f35009f == null) {
            this.f35009f = new com.mbridge.msdk.video.signal.impl.g();
        }
        return this.f35009f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f35010g == null) {
            this.f35010g = new com.mbridge.msdk.video.signal.impl.c();
        }
        return this.f35010g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f35005b == null) {
            this.f35005b = new com.mbridge.msdk.video.signal.impl.d();
        }
        return this.f35005b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f35008e == null) {
            this.f35008e = new e();
        }
        return this.f35008e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f35007d == null) {
            this.f35007d = new com.mbridge.msdk.video.signal.impl.f();
        }
        return this.f35007d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f35006c == null) {
            this.f35006c = new h();
        }
        return this.f35006c;
    }
}
