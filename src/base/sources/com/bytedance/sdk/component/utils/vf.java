package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class vf {
    private static final HashMap<String, hnj> hnj = new HashMap<>();

    public static WebView hn(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.ojm.dkl.qor qorVar) {
        return hnj(context, attributeSet, i10, qorVar, true);
    }

    public static com.bytedance.sdk.component.ojm.dkl hnj(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.ojm.dkl.qor qorVar) {
        WebView webViewHnj = hnj(context, attributeSet, i10, qorVar, false);
        if (webViewHnj == null) {
            return null;
        }
        com.bytedance.sdk.component.ojm.dkl dklVar = new com.bytedance.sdk.component.ojm.dkl(context, true, qorVar);
        dklVar.setWebView(webViewHnj);
        dklVar.sk();
        return dklVar;
    }

    public static void hn(com.bytedance.sdk.component.ojm.dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        try {
            dklVar.removeAllViews();
            dklVar.dse();
            dklVar.setWebChromeClient(null);
            dklVar.setWebViewClient(null);
            dklVar.setDownloadListener(null);
            dklVar.setJavaScriptEnabled(true);
            dklVar.setCacheMode(-1);
            dklVar.setSupportZoom(false);
            dklVar.setUseWideViewPort(true);
            dklVar.setJavaScriptCanOpenWindowsAutomatically(true);
            dklVar.setDomStorageEnabled(true);
            dklVar.setBuiltInZoomControls(false);
            dklVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            dklVar.setLoadWithOverviewMode(false);
            dklVar.setDefaultTextEncodingName(C.UTF8_NAME);
            dklVar.setDefaultFontSize(16);
            WebView webView = dklVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.ojm.sk) {
                ((com.bytedance.sdk.component.ojm.sk) webView).hnj();
            }
        } catch (Throwable unused) {
        }
    }

    private static WebView hnj(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.ojm.dkl.qor qorVar, boolean z10) {
        WebView webViewHn;
        hnj hnjVar;
        if (qorVar == null || attributeSet != null || i10 != 0 || (hnjVar = hnj.get(qorVar.orl)) == null) {
            webViewHn = null;
        } else {
            webViewHn = hnjVar.hn();
            if (webViewHn != null) {
                if (webViewHn instanceof com.bytedance.sdk.component.ojm.sk) {
                    ((com.bytedance.sdk.component.ojm.sk) webViewHn).setRecycler(false);
                }
                hnj(qorVar, false);
            }
        }
        if (webViewHn != null || !z10) {
            return webViewHn;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        hnj(qorVar, true);
        return i10 != 0 ? new com.bytedance.sdk.component.ojm.sk(context, attributeSet, i10) : new com.bytedance.sdk.component.ojm.sk(context, attributeSet);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj {
        private final String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public final int f13006hn;
        public final HashSet<String> hnj = new HashSet<>();
        private final ArrayList<WebView> qor = new ArrayList<>();

        public hnj(String str, JSONObject jSONObject) {
            this.gjv = str;
            this.f13006hn = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.hnj.add(strOptString);
                    }
                }
            }
        }

        public WebView hn() {
            if (this.qor.isEmpty()) {
                return null;
            }
            return this.qor.remove(0);
        }

        public boolean hnj(WebView webView) {
            if (webView != null && this.qor.size() < this.f13006hn && !this.qor.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.ojm.sk) {
                        ((com.bytedance.sdk.component.ojm.sk) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.qor.add(webView);
                    return true;
                }
            }
            return false;
        }

        public int qor() {
            return this.qor.size();
        }

        public HashSet<String> hnj() {
            return this.hnj;
        }
    }

    private static void hnj(final com.bytedance.sdk.component.ojm.dkl.qor qorVar, final boolean z10) {
        as.hnj("webview_allocate", new as.hnj() { // from class: com.bytedance.sdk.component.utils.vf.1
            @Override // com.bytedance.sdk.component.utils.as.hnj
            public JSONObject hnj() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put("scene", qorVar.orl);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hnj(com.bytedance.sdk.component.ojm.dkl dklVar) {
        WebView webView;
        if (dklVar == null || (webView = dklVar.getWebView()) == null) {
            return;
        }
        hnj hnjVar = hnj.get(dklVar.getScene().orl);
        if (hnjVar != null && hnjVar.hnj(webView)) {
            hn(dklVar);
        } else {
            hnj(webView);
        }
    }

    public static boolean hn(com.bytedance.sdk.component.ojm.dkl.qor qorVar) {
        return (qorVar == null || hnj.get(qorVar.orl) == null) ? false : true;
    }

    private static void hnj(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static void hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    hnj hnjVar = new hnj(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = hnjVar.hnj().iterator();
                    while (it.hasNext()) {
                        hnj.put(it.next(), hnjVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static int hnj(com.bytedance.sdk.component.ojm.dkl.qor qorVar) {
        hnj hnjVar;
        if (qorVar == null || (hnjVar = hnj.get(qorVar.orl)) == null) {
            return 0;
        }
        return hnjVar.qor();
    }
}
