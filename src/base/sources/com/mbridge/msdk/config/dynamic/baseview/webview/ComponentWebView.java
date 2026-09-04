package com.mbridge.msdk.config.dynamic.baseview.webview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.webview.client.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ComponentWebView extends WebView implements com.mbridge.msdk.config.dynamic.baseview.inter.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f29423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.client.a f29424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private XMLView f29426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f29427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f29428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f29429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29430i;

    public ComponentWebView(Context context) {
        super(context);
        this.f29422a = "ComponentWebView";
        this.f29429h = -1L;
        a();
    }

    private void b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f29425d) {
            return;
        }
        try {
            this.f29425d = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th2) {
            q0.b("ComponentWebView", th2.getMessage());
        }
    }

    public long getClickTimeStamp() {
        return this.f29429h;
    }

    public float getxInScreen() {
        return this.f29427f;
    }

    public float getyInScreen() {
        return this.f29428g;
    }

    public boolean hasXmlUrl() {
        return !TextUtils.isEmpty(this.f29430i);
    }

    public boolean isDestroyed() {
        return this.f29425d;
    }

    public void loadXMLUrl() {
        if (TextUtils.isEmpty(this.f29430i)) {
            return;
        }
        loadUrl(this.f29430i);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29426e = d.a((View) this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0) {
                this.f29427f = motionEvent.getRawX();
                this.f29428g = motionEvent.getRawY();
                this.f29429h = System.currentTimeMillis();
            }
        } catch (Exception e10) {
            q0.b("ComponentWebView", "处理触摸事件异常: " + e10.getMessage());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.webview.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29431a.a(view);
            }
        });
    }

    public void setWebViewEventListener(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        b bVar = this.f29423b;
        if (bVar != null) {
            bVar.a(aVar);
        }
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar2 = this.f29424c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get(DataSchemeDataSource.SCHEME_DATA);
            if (obj instanceof String) {
                setXmlUrl(String.valueOf(obj));
            }
        } catch (Exception e10) {
            q0.b("ComponentWebView", "setXmlData异常: " + e10.getMessage());
        }
    }

    public void setXmlUrl(String str) {
        this.f29430i = str;
    }

    private void a() {
        b();
        b bVar = new b();
        this.f29423b = bVar;
        setWebViewClient(bVar);
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar = new com.mbridge.msdk.config.dynamic.baseview.webview.client.a();
        this.f29424c = aVar;
        setWebChromeClient(aVar);
    }

    public ComponentWebView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f29422a = "ComponentWebView";
        this.f29429h = -1L;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.f29426e;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.f29426e, view.getTag(), null);
    }

    public ComponentWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29422a = "ComponentWebView";
        this.f29429h = -1L;
        a();
    }

    public ComponentWebView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f29422a = "ComponentWebView";
        this.f29429h = -1L;
        a();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
    }
}
