package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Activity f35011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebView f35012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f35013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f35014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CampaignEx f35015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f35016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.a.InterfaceC0478a f35017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f35018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f35019p;

    public b(Activity activity) {
        this.f35011h = activity;
    }

    public void a(k kVar) {
        this.f35005b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f35012i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f35004a == null) {
            this.f35004a = new i(webView);
        }
        return this.f35004a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f35014k;
        if (mBridgeContainerView == null || (activity = this.f35011h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f35009f == null) {
            this.f35009f = new o(activity, mBridgeContainerView);
        }
        return this.f35009f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f35011h == null || this.f35016m == null) {
            return super.getJSBTModule();
        }
        if (this.f35010g == null) {
            this.f35010g = new j(this.f35011h, this.f35016m);
        }
        return this.f35010g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f35011h;
        if (activity == null || (campaignEx = this.f35015l) == null) {
            return super.getJSCommon();
        }
        if (this.f35005b == null) {
            this.f35005b = new k(activity, campaignEx);
        }
        if (this.f35015l.getDynamicTempCode() == 5 && (list = this.f35019p) != null) {
            d dVar = this.f35005b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f35005b.setActivity(this.f35011h);
        this.f35005b.setUnitId(this.f35018o);
        this.f35005b.a(this.f35017n);
        return this.f35005b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f35014k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f35008e == null) {
            this.f35008e = new m(mBridgeContainerView);
        }
        return this.f35008e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f35012i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f35007d == null) {
            this.f35007d = new n(webView);
        }
        return this.f35007d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f35013j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f35006c == null) {
            this.f35006c = new q(mBridgeVideoView);
        }
        return this.f35006c;
    }

    public void a(List<CampaignEx> list) {
        this.f35019p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f35011h = activity;
        this.f35016m = mBridgeBTContainer;
        this.f35012i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a) {
        this.f35011h = activity;
        this.f35012i = webView;
        this.f35013j = mBridgeVideoView;
        this.f35014k = mBridgeContainerView;
        this.f35015l = campaignEx;
        this.f35017n = interfaceC0478a;
        this.f35018o = mBridgeVideoView.getUnitId();
    }
}
