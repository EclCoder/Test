package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.signal.impl.k;
import java.util.List;
import org.json.JSONObject;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBridgeBTWebView extends MBridgeBTWebViewDiff {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f34140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f34141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f34142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f34143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f34144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f34145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f34146v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f34147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private WebView f34148x;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTWebView.this.f34148x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f34016n);
                    jSONObject.put("id", MBridgeBTWebView.this.f34021d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f34148x, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f34148x, "onClicked", MBridgeBTWebView.this.f34021d);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeBTWebView.this.close();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WindVaneWebView windVaneWebView = MBridgeBTWebView.this.webView;
                if (windVaneWebView != null) {
                    windVaneWebView.clearWebView();
                    MBridgeBTWebView.this.webView.release();
                }
                MBridgeBTWebView.this.f34140p = null;
                MBridgeBTWebView.this.f34141q = null;
                MBridgeBTWebView.this.f34142r = null;
                if (MBridgeBTWebView.this.f34148x != null) {
                    MBridgeBTWebView.this.f34148x = null;
                }
            } catch (Throwable th2) {
                q0.a(BTBaseView.TAG, th2.getMessage());
            }
        }
    }

    public MBridgeBTWebView(Context context) {
        super(context);
        this.f34143s = false;
        this.f34145u = false;
    }

    private void setIntentFilter(com.mbridge.msdk.mbsignalcommon.base.c cVar) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setFilter(cVar);
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f34016n);
                jSONObject2.put("id", this.f34021d);
                jSONObject2.put("eventName", str);
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                f.a().a((WebView) this.webView, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "broadcast", this.f34021d);
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        WebView webView = this.f34148x;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f34021d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    public List<CampaignEx> getCampaigns() {
        return this.f34147w;
    }

    public String getFilePath() {
        return this.f34141q;
    }

    public String getFileURL() {
        return this.f34140p;
    }

    public String getHtml() {
        return this.f34142r;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f34019b;
    }

    public com.mbridge.msdk.videocommon.setting.c getRewardUnitSetting() {
        return this.f34146v;
    }

    public WindVaneWebView getWebView() {
        return this.webView;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.webView = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.webView.setVisibility(0);
        k kVar = new k(null, this.f34019b, this.f34147w);
        this.jsCommon = kVar;
        kVar.setUnitId(this.f34020c);
        if (com.mbridge.msdk.util.b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        this.webView.setObject(this.jsCommon);
        this.webView.setMraidObject(this);
        this.webView.setWebViewListener(new a());
        addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new b());
        try {
            ImageView imageView = new ImageView(getContext());
            this.f34144t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f34144t.setLayoutParams(layoutParams);
            this.f34144t.setVisibility(this.f34143s ? 4 : 8);
            CampaignEx campaignEx = this.f34019b;
            if (campaignEx != null && campaignEx.isMraid()) {
                this.f34144t.setVisibility(4);
            }
            this.f34144t.setOnClickListener(new c());
            addView(this.f34144t);
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void onBackPressed() {
        if (this.webView != null) {
            com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "onSystemBackPressed", this.f34021d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", "landscape");
                } else {
                    jSONObject.put("orientation", "portrait");
                }
                jSONObject.put("instanceId", this.f34021d);
                f.a().a((WebView) this.webView, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.f34145u) {
            return;
        }
        this.f34145u = true;
        try {
            if (this.webView != null) {
                com.mbridge.msdk.video.bt.component.d.c().a((WebView) this.webView, "onSystemDestory", this.f34021d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new d(), 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        try {
            String clickURL = this.f34019b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f34019b.setClickURL(str);
                reportOpen(str);
            }
            this.f34019b.setClickTempSource(2);
            this.f34019b.setClickType(2);
            this.f34019b.setTriggerClickSource(2);
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), this.f34020c);
            aVar.a(this);
            aVar.a(this.f34019b);
            this.f34019b.setClickURL(clickURL);
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f34140p)) {
            this.webView.loadUrl(this.f34140p);
        } else if (!TextUtils.isEmpty(this.f34141q)) {
            this.webView.loadUrl(this.f34141q);
        } else {
            if (TextUtils.isEmpty(this.f34142r)) {
                return;
            }
            this.webView.loadDataWithBaseURL("", this.f34142r, "text/html", C.UTF8_NAME, null);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff
    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f34020c, str, this.f34019b.isBidCampaign());
            }
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f34147w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f34148x = webView;
    }

    public void setFilePath(String str) {
        this.f34141q = str;
    }

    public void setFileURL(String str) {
        this.f34140p = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zContains = str.contains("play.google.com");
        setWebviewClickable(!zContains);
        if (zContains) {
            setIntentFilter(new com.mbridge.msdk.mbsignalcommon.base.c());
        }
    }

    public void setHtml(String str) {
        this.f34142r = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        this.f34146v = cVar;
    }

    public void setTempTypeForMetrics(int i10) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setTempTypeForMetrics(i10);
        }
    }

    public void setWebViewLocalRequestId(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setLocalRequestId(str);
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z10) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z10);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null || !windVaneWebView.canGoBack()) {
            return false;
        }
        this.webView.goBack();
        return true;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null || !windVaneWebView.canGoForward()) {
            return false;
        }
        this.webView.goForward();
        return true;
    }

    public void webviewLoad(int i10) {
        if (this.jsCommon == null) {
            this.jsCommon = new k(null, this.f34019b, this.f34147w);
        }
        CampaignEx campaignEx = this.f34019b;
        if (campaignEx != null) {
            this.jsCommon.c(campaignEx);
        } else {
            List<CampaignEx> list = this.f34147w;
            if (list != null && list.size() > 0) {
                this.jsCommon.a(this.f34147w);
                if (this.f34147w.size() == 1) {
                    this.jsCommon.c(this.f34147w.get(0));
                }
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.f34146v;
        if (cVar != null) {
            this.jsCommon.setRewardUnitSetting(cVar);
        }
        this.jsCommon.setUnitId(this.f34020c);
        this.jsCommon.c(this.f34021d);
        if (com.mbridge.msdk.util.b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        if (i10 == 1) {
            this.jsCommon.r();
        }
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.jsCommon);
        }
        CampaignEx campaignEx2 = this.f34019b;
        if (campaignEx2 != null && campaignEx2.isMraid()) {
            this.f34144t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView == null) {
            return false;
        }
        windVaneWebView.reload();
        return true;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            this.f34144t.setVisibility(z10 ? 4 : 0);
        } catch (Throwable th2) {
            q0.b(qnwOeeQSSWa.OIlb, th2.getMessage());
        }
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34143s = false;
        this.f34145u = false;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a extends com.mbridge.msdk.mbsignalcommon.listener.a {
        a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj) {
            super.a(obj);
            try {
                k kVar = MBridgeBTWebView.this.jsCommon;
                String strEncodeToString = "";
                String strC = kVar != null ? kVar.c() : "";
                if (TextUtils.isEmpty(strC)) {
                    q0.a("RVWindVaneWebView", "getEndScreenInfo failed");
                } else {
                    strEncodeToString = Base64.encodeToString(strC.getBytes(), 2);
                    q0.a("RVWindVaneWebView", "getEndScreenInfo success");
                }
                f.a().b(obj, strEncodeToString);
            } catch (Throwable th2) {
                q0.a("RVWindVaneWebView", th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (MBridgeBTWebView.this.f34148x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f34021d);
                    jSONObject.put("code", BTBaseView.f34016n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f34021d);
                    jSONObject2.put("result", 1);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f34148x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f34148x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
            f.a().a(MBridgeBTWebView.this.webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            if (MBridgeBTWebView.this.f34148x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f34021d);
                    jSONObject.put("code", BTBaseView.f34016n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f34021d);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f34148x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f34148x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (MBridgeBTWebView.this.f34148x != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", MBridgeBTWebView.this.f34021d);
                    jSONObject.put("code", BTBaseView.f34016n);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", MBridgeBTWebView.this.f34021d);
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", sslError.toString());
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    f.a().a(MBridgeBTWebView.this.f34148x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTWebView.this.f34148x, e10.getMessage());
                    q0.a("RVWindVaneWebView", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
        }
    }
}
