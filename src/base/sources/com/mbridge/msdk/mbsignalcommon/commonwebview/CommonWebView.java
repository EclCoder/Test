package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ToolBar f31615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ToolBar f31616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ProgressBar f31617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f31618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f31619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f31620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f31621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected BaseWebView f31622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View.OnClickListener f31623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f31624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f31625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f31626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f31627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f31628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WebViewClient f31629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f31630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f31631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f31632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f31633u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f31628p + "ms");
            if (CommonWebView.this.f31631s != null) {
                CommonWebView.this.f31632t = false;
                CommonWebView.this.f31631s.a(CommonWebView.this.f31630r);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f31617e.setVisible(true);
            CommonWebView.this.f31617e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    q0.b("CommonWebView", th2.getMessage());
                }
            }
            return true;
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
                CommonWebView.this.f31617e.setVisible(false);
            }
        }

        c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            q0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f31617e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f31622j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f31616d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f31622j.canGoBack()) {
                        CommonWebView.this.f31622j.goBack();
                    }
                    CommonWebView.this.f31616d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f31622j.canGoBack());
                    if (CommonWebView.this.f31623k != null) {
                        CommonWebView.this.f31623k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f31616d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f31622j.canGoForward()) {
                        CommonWebView.this.f31622j.goForward();
                    }
                    CommonWebView.this.f31616d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f31622j.canGoForward());
                    if (CommonWebView.this.f31624l != null) {
                        CommonWebView.this.f31624l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f31616d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f31622j.canGoBack());
                    CommonWebView.this.f31616d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f31622j.canGoForward());
                    CommonWebView.this.f31622j.reload();
                    if (CommonWebView.this.f31625m != null) {
                        CommonWebView.this.f31625m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f31619g != null) {
                        CommonWebView.this.f31619g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f31626n != null) {
                        CommonWebView.this.f31626n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f31622j.getUrl());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends WebViewClient {
        e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f31616d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f31616d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends WebViewClient {
        f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (u0.a.b(str)) {
                u0.a.a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.a(webView, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends WebViewClient {
        g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.f31632t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f31630r = str;
            if (CommonWebView.this.f31632t) {
                return;
            }
            CommonWebView.this.f31632t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f31632t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f31630r = str;
            if (CommonWebView.this.f31632t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f31632t = true;
            CommonWebView.this.c();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface h {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f31633u = new a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f31621i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f31620h.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f31615c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f31616d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f31622j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f31622j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f31615c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f31616d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f31615c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f31618f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f31618f, layoutParams);
        this.f31613a = v0.a(getContext(), 40.0f);
        this.f31614b = v0.a(getContext(), 40.0f);
        this.f31620h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f31621i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f31622j == null) {
                this.f31622j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f31622j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f31622j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f31620h);
            this.f31622j.setWebChromeClient(this.f31621i);
            addWebViewClient(bVar);
        } catch (Throwable th2) {
            q0.b("CommonWebView", "webview is error", th2);
        }
        this.f31618f.addView(this.f31622j);
    }

    public void loadUrl(String str) {
        this.f31622j.loadUrl(str);
        if (this.f31629q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f31623k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f31624l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f31626n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f31625m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f31621i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f31620h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f31615c.getParent()).removeView(this.f31615c);
        this.f31618f.addView(this.f31615c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f31615c.getParent()).removeView(this.f31615c);
        addView(this.f31615c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f31619g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f31628p = i10;
        if (this.f31627o == null) {
            this.f31627o = new Handler(Looper.getMainLooper());
        }
        if (this.f31629q == null) {
            g gVar = new g();
            this.f31629q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f31631s = iVar;
    }

    public void setToolBarTitle(String str, int i10) {
        this.f31615c.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f31615c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f31616d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f31615c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f31617e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f31617e);
        this.f31617e.initResource(true);
    }

    private void b() {
        if (this.f31616d != null) {
            return;
        }
        this.f31616d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f31614b);
        layoutParams.bottomMargin = 0;
        this.f31616d.setLayoutParams(layoutParams);
        this.f31616d.setBackgroundColor(-1);
        this.f31616d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f31616d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f31627o.postDelayed(this.f31633u, this.f31628p);
    }

    public void setToolBarTitle(String str) {
        this.f31615c.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31633u = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f31615c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f31615c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f31613a);
            layoutParams.addRule(10);
            this.f31615c.setLayoutParams(layoutParams);
            this.f31618f.addView(this.f31615c);
            return;
        }
        this.f31615c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f31613a));
        addView(this.f31615c, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f31633u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.setComponent(null);
                            uri2.setSelector(null);
                            uri2.setFlags(268435456);
                            getContext().startActivity(uri2);
                            return true;
                        }
                        try {
                            String stringExtra = uri2.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                Uri uri3 = Uri.parse(str);
                                if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th2) {
                            q0.b("CommonWebView", th2.getMessage());
                        }
                    } catch (Throwable th3) {
                        q0.b("CommonWebView", th3.getMessage());
                    }
                    q0.b("CommonWebView", th.getMessage());
                    return false;
                }
                if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                    q0.b("CommonWebView", "openDeepLink");
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith("http") || str.startsWith("https"));
                }
            }
            return false;
        } catch (Throwable th4) {
            q0.b("CommonWebView", th4.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f31627o.removeCallbacks(this.f31633u);
    }
}
