package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0423a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f31664a = new a();
    }

    public static a a() {
        return C0423a.f31664a;
    }

    public void b(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void c(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void a(WebView webView) {
        a(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public void a(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        String string = jSONObject.toString();
        try {
            string = URLEncoder.encode(string, C.UTF8_NAME);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        a(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", string));
    }

    public void b(WebView webView, float f10, float f11, float f12, float f13) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public void c(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", str));
    }

    public void b(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", str));
    }

    public void a(WebView webView, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, C.UTF8_NAME);
            str = URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public void a(WebView webView, double d10) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", Double.valueOf(d10)));
    }

    public void a(WebView webView, float f10, float f11) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11)));
    }

    public void a(WebView webView, float f10, float f11, float f12, float f13) {
        a(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    private void a(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
