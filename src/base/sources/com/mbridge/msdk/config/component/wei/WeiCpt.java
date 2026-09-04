package com.mbridge.msdk.config.component.wei;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class WeiCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ComponentWebView f29180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f29181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f29182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    com.mbridge.msdk.config.component.wei.monitor.b f29183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    com.mbridge.msdk.config.component.wei.monitor.a f29184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    WebMessagePort f29185r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f29175h = "1100001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f29176i = "1100002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f29177j = "1100003";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final String f29178k = "1100004";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f29179l = "SenderPortKey_";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    HashMap<String, WebMessagePort> f29186s = new HashMap<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ConcurrentLinkedQueue<com.mbridge.msdk.config.component.wei.model.a> f29187t = new ConcurrentLinkedQueue<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b extends WebMessagePort.WebMessageCallback {
        b() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WeiCpt.this.a(webMessage);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebMessagePort f29190a;

        c(WebMessagePort webMessagePort) {
            this.f29190a = webMessagePort;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29190a.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(String str) {
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected synchronized void b(Map<String, Object> map) {
        try {
            this.f28523f = "905001";
            com.mbridge.msdk.config.component.wei.model.a aVar = new com.mbridge.msdk.config.component.wei.model.a(map);
            this.f29187t.add(aVar);
            ViewGroup viewGroupE = e();
            if (viewGroupE == null) {
                return;
            }
            if (TextUtils.isEmpty(aVar.h())) {
                this.f29180m = (ComponentWebView) com.mbridge.msdk.config.dynamic.utils.d.a(viewGroupE, ComponentWebView.class);
            } else {
                View viewFindViewWithTag = viewGroupE.findViewWithTag(aVar.h());
                if (viewFindViewWithTag instanceof WebView) {
                    this.f29180m = (ComponentWebView) viewFindViewWithTag;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        if (this.f29180m != null) {
            while (!this.f29187t.isEmpty()) {
                final com.mbridge.msdk.config.component.wei.model.a aVarPoll = this.f29187t.poll();
                if (aVarPoll != null) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.wei.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f29192a.a(aVarPoll);
                        }
                    });
                }
            }
        }
        a("905007", (HashMap<String, Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (!TextUtils.isEmpty(aVar.b())) {
            if (com.mbridge.msdk.config.component.common.util.c.c("320").equals(aVar.b())) {
                c(aVar);
                b(aVar);
            } else if (com.mbridge.msdk.config.component.common.util.c.c("322").equals(aVar.b())) {
                this.f29180m.reload();
            } else if (com.mbridge.msdk.config.component.common.util.c.c("319").equals(aVar.b())) {
                if (this.f29180m.getVisibility() != 0) {
                    this.f29180m.setVisibility(0);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.c("325").equals(aVar.b())) {
                this.f29180m.setVisibility(8);
            } else if (com.mbridge.msdk.config.component.common.util.c.c("321").equals(aVar.b())) {
                String strA = com.mbridge.msdk.config.dynamic.baseview.webview.util.a.a(aVar.c());
                if (!TextUtils.isEmpty(strA)) {
                    d(strA);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.c("307").equals(aVar.b())) {
                if (this.f29180m.getParent() != null && (this.f29180m.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f29180m.getParent()).removeView(this.f29180m);
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.c("323").equals(aVar.b())) {
                if (this.f29180m.canGoForward()) {
                    this.f29180m.goForward();
                }
            } else if (com.mbridge.msdk.config.component.common.util.c.c("324").equals(aVar.b()) && this.f29180m.canGoBack()) {
                this.f29180m.goBack();
            }
        }
        if (aVar.e() == null || aVar.e().isEmpty()) {
            return;
        }
        a(this.f29180m, aVar.e());
    }

    private void c(com.mbridge.msdk.config.component.wei.model.a aVar) {
        this.f29184q = new com.mbridge.msdk.config.component.wei.monitor.a();
        this.f29183p = new com.mbridge.msdk.config.component.wei.monitor.b(aVar.a());
        this.f29180m.setWebViewEventListener(new a());
        if (aVar.i()) {
            this.f29183p.a(this.f29180m);
        }
    }

    public void d(String str) {
        try {
            ComponentWebView componentWebView = this.f29180m;
            if (componentWebView == null || componentWebView.isDestroyed()) {
                return;
            }
            this.f29180m.evaluateJavascript(str, new ValueCallback() { // from class: com.mbridge.msdk.config.component.wei.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    WeiCpt.c((String) obj);
                }
            });
        } catch (Throwable th2) {
            q0.b("WeiCpt", th2.getMessage());
        }
    }

    private void b(com.mbridge.msdk.config.component.wei.model.a aVar) {
        if (TextUtils.isEmpty(aVar.g()) && TextUtils.isEmpty(aVar.d())) {
            if (this.f29180m.hasXmlUrl()) {
                this.f29180m.loadXMLUrl();
                return;
            } else {
                a("905004", "1100001", "Input parameter error");
                return;
            }
        }
        if (!TextUtils.isEmpty(aVar.g())) {
            String strF = aVar.f();
            if (TextUtils.isEmpty(strF)) {
                this.f29180m.loadUrl(aVar.g());
                return;
            } else {
                this.f29180m.loadUrl(strF);
                return;
            }
        }
        if (TextUtils.isEmpty(aVar.d())) {
            return;
        }
        this.f29180m.loadDataWithBaseURL("", aVar.d(), "text/html", C.UTF8_NAME, null);
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        String strValueOf;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = this.f28518a.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
                String str = "";
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("116"));
                    Object obj3 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("125"));
                    String strValueOf2 = obj2 instanceof String ? String.valueOf(obj2) : "";
                    strValueOf = obj3 instanceof String ? String.valueOf(obj3) : "";
                    str = strValueOf2;
                } else {
                    strValueOf = "";
                }
                Object obj4 = map.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
                if (obj4 instanceof Map) {
                    Object obj5 = ((Map) obj4).get(com.mbridge.msdk.config.component.common.util.c.c("116"));
                    Object obj6 = ((Map) obj4).get(com.mbridge.msdk.config.component.common.util.c.c("125"));
                    if (obj5 instanceof String) {
                        String str2 = (String) obj5;
                        if (!TextUtils.isEmpty(str2)) {
                            return str2.equals(str);
                        }
                    }
                    if (obj6 instanceof String) {
                        String str3 = (String) obj6;
                        return !TextUtils.isEmpty(str3) && str3.hashCode() == strValueOf.hashCode();
                    }
                }
            } catch (Throwable th2) {
                q0.b("WeiCpt", th2.getMessage(), th2);
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements com.mbridge.msdk.config.dynamic.baseview.webview.listener.a {
        a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageFinished(WebView webView, String str) {
            WeiCpt.this.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f29181n || weiCpt.f29182o) {
                return;
            }
            weiCpt.f29182o = true;
            weiCpt.a(weiCpt.a("905003", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WeiCpt.this.f29184q.b(webView);
            WeiCpt.this.f29184q.a(webView);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905002", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            WeiCpt weiCpt = WeiCpt.this;
            if (weiCpt.f29182o || weiCpt.f29181n) {
                return;
            }
            weiCpt.f29181n = true;
            weiCpt.a("905004", String.valueOf(i10), str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onRenderProcessGone(WebView webView) {
            WeiCpt.this.a("905005", "1100003", "WebView did crash");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND), "redirect");
            HashMap map2 = new HashMap();
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("url"), str);
            map.put(com.mbridge.msdk.config.component.common.util.c.c(DataSchemeDataSource.SCHEME_DATA), map2);
            HashMap map3 = new HashMap();
            map3.put(com.mbridge.msdk.config.component.common.util.c.c("js_interaction"), map);
            WeiCpt weiCpt = WeiCpt.this;
            weiCpt.a(weiCpt.a("905006", (Map<String, Object>) map3));
            return false;
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onProgressChanged(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.webview.listener.a
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WebView webView) {
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        this.f29185r = webMessagePortArrCreateWebMessageChannel[0];
        webView.postWebMessage(new WebMessage("port_ready", new WebMessagePort[]{webMessagePortArrCreateWebMessageChannel[1]}), Uri.EMPTY);
        this.f29185r.setWebMessageCallback(new b());
    }

    public void a(WebMessage webMessage) {
        if (webMessage == null) {
            return;
        }
        String data = webMessage.getData();
        if (TextUtils.isEmpty(data)) {
            return;
        }
        try {
            Map<String, Object> mapA = new e().a(data);
            String strValueOf = String.valueOf(mapA.get(com.mbridge.msdk.config.component.common.util.c.c("action")));
            String str = "SenderPortKey_" + System.currentTimeMillis() + "_" + strValueOf;
            WebMessagePort[] ports = webMessage.getPorts();
            if (ports != null && ports.length > 0) {
                this.f29186s.put(str, ports[0]);
            }
            Map<String, Object> map = new HashMap<>();
            map.put("webview", this.f29180m);
            map.put("superview", this.f29180m.getParent());
            HashMap map2 = new HashMap();
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("action"), strValueOf);
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("reply_name"), str);
            Object obj = mapA.get(com.mbridge.msdk.config.component.common.util.c.c(DataSchemeDataSource.SCHEME_DATA));
            String strC = com.mbridge.msdk.config.component.common.util.c.c(DataSchemeDataSource.SCHEME_DATA);
            if (obj == null) {
                obj = "";
            }
            map2.put(strC, obj);
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("type"), "mv");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("js_interaction"), map2);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("click_x"), String.valueOf(this.f29180m.getxInScreen()));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("click_y"), String.valueOf(this.f29180m.getyInScreen()));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("click_time"), String.valueOf(this.f29180m.getClickTimeStamp()));
            a(a("905006", map));
        } catch (Throwable th2) {
            q0.b(XTkUEXuiK.IznoOMrYos, th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b A[SYNTHETIC] */
    public void a(WebView webView, List<Map<String, Object>> list) {
        WebMessage webMessage;
        WebMessagePort webMessagePort;
        WebMessagePort webMessagePort2;
        for (Map<String, Object> map : list) {
            try {
                String strValueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c(StatisticData.ERROR_CODE_NOT_FOUND)));
                Map<String, Object> mapA = com.mbridge.msdk.config.component.common.util.c.a(map);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                if (mapA.containsKey(com.mbridge.msdk.config.component.common.util.c.c("128"))) {
                    try {
                        jSONObject2 = new JSONObject((Map) mapA.get(com.mbridge.msdk.config.component.common.util.c.c("128")));
                    } catch (Exception e10) {
                        q0.b("WeiCpt", e10.getMessage(), e10);
                    }
                    jSONObject.put(com.mbridge.msdk.config.component.common.util.c.c("action"), strValueOf);
                    jSONObject.put(com.mbridge.msdk.config.component.common.util.c.c(DataSchemeDataSource.SCHEME_DATA), jSONObject2);
                    webMessage = new WebMessage(jSONObject.toString());
                    if (!this.f29186s.containsKey(strValueOf) && (webMessagePort2 = this.f29186s.get(strValueOf)) != null) {
                        webMessagePort2.postMessage(webMessage);
                        this.f29186s.remove(strValueOf);
                        this.f29180m.postDelayed(new c(webMessagePort2), 3000L);
                        return;
                    } else {
                        webMessagePort = this.f29185r;
                        if (webMessagePort != null) {
                            webMessagePort.postMessage(webMessage);
                        } else {
                            webView.postWebMessage(webMessage, Uri.EMPTY);
                        }
                    }
                } else {
                    jSONObject.put(com.mbridge.msdk.config.component.common.util.c.c("action"), strValueOf);
                    jSONObject.put(com.mbridge.msdk.config.component.common.util.c.c(DataSchemeDataSource.SCHEME_DATA), jSONObject2);
                    webMessage = new WebMessage(jSONObject.toString());
                    if (!this.f29186s.containsKey(strValueOf)) {
                    }
                    webMessagePort = this.f29185r;
                    if (webMessagePort != null) {
                        webMessagePort.postMessage(webMessage);
                    } else {
                        webView.postWebMessage(webMessage, Uri.EMPTY);
                    }
                }
            } catch (Throwable th2) {
                q0.b("WeiCpt", th2.getMessage(), th2);
            }
        }
    }
}
