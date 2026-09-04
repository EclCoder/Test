package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f31722a = new f();

    private f() {
    }

    public static f a() {
        return f31722a;
    }

    public void b(Object obj, String str) {
        String str2;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                str2 = String.format("javascript:window.WindVane.onSuccess(%s,'');", aVar.f31705g);
            } else {
                str2 = String.format("javascript:window.WindVane.onSuccess(%s,'%s');", aVar.f31705g, i.a(str));
            }
            WindVaneWebView windVaneWebView = aVar.f31700b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f31700b.loadUrl(str2);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str, String str2) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str3 = TextUtils.isEmpty(str2) ? String.format("javascript:window.WindVane.fireEvent('%s', '');", str) : String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, i.a(str2));
            WindVaneWebView windVaneWebView = aVar.f31700b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f31700b.loadUrl(str3);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(WebView webView, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
        } else {
            str3 = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, i.a(str2));
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                webView.loadUrl(str3);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", aVar.f31705g);
            } else {
                str = i.a(str);
            }
            String str2 = String.format("javascript:window.WindVane.onFailure(%s,'%s');", aVar.f31705g, str);
            WindVaneWebView windVaneWebView = aVar.f31700b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                aVar.f31700b.loadUrl(str2);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f31600j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f31600j, "");
        } catch (Throwable unused2) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.f31600j, "");
        }
    }
}
