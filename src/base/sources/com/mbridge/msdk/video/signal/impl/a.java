package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f35029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.setting.c f35030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f35031l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f35020a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f35021b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f35022c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f35023d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f35024e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f35025f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f35026g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f35027h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f35028i = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.mbridge.msdk.video.signal.a.InterfaceC0478a f35032m = new C0479a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f35033n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f35034o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdSession f35035p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MediaEvents f35036q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdEvents f35037r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static class C0479a implements com.mbridge.msdk.video.signal.a.InterfaceC0478a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0478a
        public void a(boolean z10) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0478a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0478a
        public void a(int i10, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0478a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f35021b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f35022c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f35024e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f35027h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f35023d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f35033n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f35028i;
    }

    public AdEvents j() {
        return this.f35037r;
    }

    public AdSession k() {
        return this.f35035p;
    }

    public int l() {
        if (this.f35022c == 0 && this.f35021b) {
            this.f35022c = 1;
        }
        return this.f35022c;
    }

    public int m() {
        if (this.f35023d == 0 && this.f35021b) {
            this.f35023d = 1;
        }
        return this.f35023d;
    }

    public int n() {
        if (this.f35024e == 0 && this.f35021b) {
            this.f35024e = 1;
        }
        return this.f35024e;
    }

    public MediaEvents o() {
        return this.f35036q;
    }

    public boolean p() {
        return this.f35021b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f35031l;
        if (aVar != null) {
            aVar.a(false);
            this.f35031l.a((NativeListener.NativeTrackingListener) null);
            this.f35031l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.f35037r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.f35035p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f35030k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        q0.a("DefaultJSCommon", "setUnitId:" + str);
        this.f35029j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f35036q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f35026g = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static class b implements com.mbridge.msdk.video.signal.a.InterfaceC0478a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f35038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.a.InterfaceC0478a f35039b;

        public b(com.mbridge.msdk.video.signal.d dVar, com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a) {
            this.f35038a = dVar;
            this.f35039b = interfaceC0478a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0478a
        public void a(boolean z10) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f35038a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0478a
        public void onInitSuccess() {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            return interfaceC0478a != null && interfaceC0478a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f35038a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0478a
        public void a(int i10, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0478a
        public void a() {
            com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a = this.f35039b;
            if (interfaceC0478a != null) {
                interfaceC0478a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f35026g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", "init");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        q0.a(IAoPeRfJn.hFNapHvBfzvGuz, "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f35020a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f35020a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.f35027h);
        return this.f35027h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(com.mbridge.msdk.video.signal.a.InterfaceC0478a interfaceC0478a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0478a);
        this.f35032m = interfaceC0478a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f35028i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }
}
