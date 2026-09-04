package com.mbridge.msdk.splash.manager;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32702b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f32703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBSplashView f32704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f32707e;

        a(c cVar, MBSplashView mBSplashView, CampaignEx campaignEx, String str, long j10) {
            this.f32703a = cVar;
            this.f32704b = mBSplashView;
            this.f32705c = campaignEx;
            this.f32706d = str;
            this.f32707e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            c cVar = this.f32703a;
            if (cVar != null) {
                cVar.a(i10);
            }
            if (i10 == 1) {
                g.this.f32701a = true;
                this.f32704b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32705c, this.f32706d, "", this.f32707e, 1);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f32706d, this.f32705c);
                return;
            }
            g.this.f32701a = false;
            this.f32704b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "readyState 2", this.f32706d, this.f32705c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32705c, this.f32706d, "readyState 2", this.f32707e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c cVar = this.f32703a;
            if (cVar != null) {
                cVar.a();
            }
            g.this.f32702b = true;
            if (!this.f32705c.isHasMBTplMark()) {
                this.f32704b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f32706d, this.f32705c);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32705c, this.f32706d, "", this.f32707e, 1);
            }
            com.mbridge.msdk.splash.signal.c.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            c cVar = this.f32703a;
            if (cVar != null) {
                cVar.onError(str);
            }
            g.this.b();
            this.f32704b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error code:" + i10 + str, this.f32706d, this.f32705c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32705c, this.f32706d, "error code:" + i10 + str, this.f32707e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            c cVar = this.f32703a;
            if (cVar != null) {
                cVar.onError(sslError.toString());
            }
            g.this.b();
            this.f32704b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error url:" + sslError.getUrl(), this.f32706d, this.f32705c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32705c, this.f32706d, "error url:" + sslError.getUrl(), this.f32707e, 3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f32709a = new g(null);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a();

        void a(int i10);

        void onError(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f32712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f32713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f32714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f32715f;

        public void a(String str) {
            this.f32713d = str;
        }

        public void b(String str) {
            this.f32710a = str;
        }

        public String c() {
            return this.f32713d;
        }

        public String d() {
            return this.f32710a;
        }

        public String e() {
            return this.f32711b;
        }

        public boolean f() {
            return this.f32714e;
        }

        public CampaignEx a() {
            return this.f32712c;
        }

        public int b() {
            return this.f32715f;
        }

        public void c(String str) {
            this.f32711b = str;
        }

        public void a(CampaignEx campaignEx) {
            this.f32712c = campaignEx;
        }

        public void a(boolean z10) {
            this.f32714e = z10;
        }

        public void a(int i10) {
            this.f32715f = i10;
        }
    }

    /* synthetic */ g(a aVar) {
        this();
    }

    private g() {
        this.f32701a = false;
        this.f32702b = false;
    }

    public static g a() {
        return b.f32709a;
    }

    public void b() {
        this.f32701a = false;
        this.f32702b = false;
    }

    public void a(MBSplashView mBSplashView, d dVar, c cVar) {
        String requestId;
        if (mBSplashView == null || dVar == null) {
            return;
        }
        String strE = dVar.e();
        String strD = dVar.d();
        CampaignEx campaignExA = dVar.a();
        String strC = dVar.c();
        boolean zF = dVar.f();
        int iB = dVar.b();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.b bVar = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), strD, strE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignExA);
        bVar.a(arrayList);
        bVar.a(zF ? 1 : 0);
        bVar.b(iB);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        if (TextUtils.isEmpty(campaignExA.getRequestId())) {
            requestId = campaignExA.getRequestIdNotice();
        } else {
            requestId = campaignExA.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        q0.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.f32701a || this.f32702b)) {
            mBSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.a(1);
                return;
            }
            return;
        }
        b();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.report.a.b(strE, campaignExA);
        long jCurrentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, mBSplashView, campaignExA, strE, jCurrentTimeMillis));
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(strC);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignExA, strE, "webview had destory", jCurrentTimeMillis, 3);
        }
    }
}
