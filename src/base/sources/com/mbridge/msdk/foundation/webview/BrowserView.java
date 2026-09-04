package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BrowserView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CampaignEx f30993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f30995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WebView f30996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f30997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ToolBar f30998f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BrowserView.this.f30996d != null) {
                BrowserView.this.f30996d.stopLoading();
            }
            String str = (String) view.getTag();
            boolean z10 = false;
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD)) {
                BrowserView.this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(true);
                if (BrowserView.this.f30996d != null && BrowserView.this.f30996d.canGoBack()) {
                    BrowserView.this.f30996d.goBack();
                }
                View item = BrowserView.this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
                if (BrowserView.this.f30996d != null && BrowserView.this.f30996d.canGoBack()) {
                    z10 = true;
                }
                item.setEnabled(z10);
                return;
            }
            if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD)) {
                BrowserView.this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                if (BrowserView.this.f30996d != null && BrowserView.this.f30996d.canGoForward()) {
                    BrowserView.this.f30996d.goForward();
                }
                View item2 = BrowserView.this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
                if (BrowserView.this.f30996d != null && BrowserView.this.f30996d.canGoForward()) {
                    z10 = true;
                }
                item2.setEnabled(z10);
                return;
            }
            if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH)) {
                if (!TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS) || BrowserView.this.f30995c == null) {
                    return;
                }
                BrowserView.this.f30995c.a();
                return;
            }
            BrowserView.this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(BrowserView.this.f30996d != null && BrowserView.this.f30996d.canGoBack());
            View item3 = BrowserView.this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            if (BrowserView.this.f30996d != null && BrowserView.this.f30996d.canGoForward()) {
                z10 = true;
            }
            item3.setEnabled(z10);
            if (BrowserView.this.f30996d != null) {
                BrowserView.this.f30996d.loadUrl(BrowserView.this.f30994b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            q0.c("BrowserView", "onLoadResource 开始! = " + str);
            if (BrowserView.this.f30995c != null) {
                BrowserView.this.f30995c.a(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (BrowserView.this.f30995c != null) {
                BrowserView.this.f30995c.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("BrowserView", "开始! = " + str);
            BrowserView.this.f30994b = str;
            if (BrowserView.this.f30995c != null) {
                BrowserView.this.f30995c.onPageStarted(webView, str, bitmap);
            }
            BrowserView.this.f30997e.setVisible(true);
            BrowserView.this.f30997e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (BrowserView.this.f30995c != null) {
                BrowserView.this.f30995c.onReceivedError(webView, i10, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                } catch (Throwable th2) {
                    q0.b("BrowserView", th2.getMessage());
                    return true;
                }
            }
            if (BrowserView.this.f30995c != null) {
                BrowserView.this.f30995c.a();
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q0.c("BrowserView", "js大跳! = " + str);
            BrowserView.this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
            BrowserView.this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
            if (BrowserView.this.f30995c != null) {
                return BrowserView.this.f30995c.shouldOverrideUrlLoading(webView, str);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends WebChromeClient {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f30997e.setVisible(false);
            }
        }

        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                BrowserView.this.f30997e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends WebChromeClient {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BrowserView.this.f30997e.setVisible(false);
            }
        }

        d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                BrowserView.this.f30997e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void a();

        void a(WebView webView, String str);

        void onPageFinished(WebView webView, String str);

        void onPageStarted(WebView webView, String str, Bitmap bitmap);

        void onReceivedError(WebView webView, int i10, String str, String str2);

        boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.f30993a = campaignEx;
        init();
    }

    private WebView getWebView() {
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    settings.setSafeBrowsingEnabled(false);
                } catch (Throwable th2) {
                    q0.b("BrowserView", th2.getMessage());
                }
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
                try {
                    settings.setMixedContentMode(0);
                } catch (Exception e10) {
                    q0.b("BrowserView", e10.getMessage());
                }
                settings.setDatabaseEnabled(true);
                String path = getContext().getDir("database", 0).getPath();
                settings.setDatabasePath(path);
                settings.setGeolocationEnabled(true);
                settings.setGeolocationDatabasePath(path);
                try {
                    Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(settings, Boolean.FALSE);
                } catch (Exception e11) {
                    q0.b("BrowserView", e11.getMessage());
                }
            } else {
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
                settings.setMixedContentMode(0);
                settings.setDatabaseEnabled(true);
                String path2 = getContext().getDir("database", 0).getPath();
                settings.setDatabasePath(path2);
                settings.setGeolocationEnabled(true);
                settings.setGeolocationDatabasePath(path2);
                Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(settings, Boolean.FALSE);
            }
        } catch (Throwable th3) {
            q0.b("BrowserView", th3.getMessage());
        }
        webView.setDownloadListener(new com.mbridge.msdk.foundation.same.webview.a(this.f30993a));
        webView.setWebViewClient(new b());
        webView.setWebChromeClient(m0.s() <= 10 ? new c() : new d());
        return webView;
    }

    public void destroy() {
        try {
            WebView webView = this.f30996d;
            if (webView != null) {
                webView.setWebViewClient(null);
                this.f30996d.destroy();
                this.f30996d = null;
                removeAllViews();
            }
        } catch (Throwable th2) {
            q0.b("BrowserView", th2.getMessage());
        }
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        a();
        this.f30997e.initResource(true);
        this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(false);
        this.f30998f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
        this.f30998f.setOnItemClickListener(new a());
    }

    public void loadUrl(String str) {
        WebView webView = this.f30996d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(e eVar) {
        this.f30995c = eVar;
    }

    public void setWebView(WebView webView) {
        this.f30996d = webView;
    }

    private void a() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f30997e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f30996d == null) {
                this.f30996d = getWebView();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f30996d.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            q0.b("BrowserView", "webview is error", th2);
        }
        this.f30998f = new ToolBar(getContext());
        this.f30998f.setLayoutParams(new LinearLayout.LayoutParams(-1, v0.a(getContext(), 40.0f)));
        this.f30998f.setBackgroundColor(-1);
        addView(this.f30997e);
        WebView webView = this.f30996d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f30998f);
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
