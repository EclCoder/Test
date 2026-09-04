package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.core.ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends com.bytedance.sdk.openadsdk.core.widget.hnj.sk {
    private static final byte[] bug = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private boolean dnm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.as f14080hn;
    public ArrayList<Integer> hnj;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.hn.orl f14081ta;

    public ta(Context context, ua uaVar, com.bytedance.sdk.openadsdk.core.model.as asVar, com.bytedance.sdk.openadsdk.gjv.orl orlVar, com.bytedance.sdk.component.adexpress.hn.orl orlVar2) {
        super(context, uaVar, asVar.sp(), orlVar, false);
        this.dnm = false;
        this.hnj = new ArrayList<>();
        this.f14080hn = asVar;
        this.f14081ta = orlVar2;
        this.dnm = com.bytedance.sdk.openadsdk.as.sk.hnj("inject_data_normal_open", 0) == 1;
    }

    private WebResourceResponse gjv(String str, com.bytedance.sdk.component.adexpress.gjv.ojm.hnj hnjVar) {
        InputStream inputStreamHn;
        if (TextUtils.isEmpty(str) || (inputStreamHn = mjg.hn(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(hnjVar.hnj(), C.UTF8_NAME, inputStreamHn);
        hnj(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.hnj.hn.hnj hn(String str, com.bytedance.sdk.component.adexpress.gjv.ojm.hnj hnjVar) {
        gm.hnj hnjVarDkl;
        JSONArray jSONArrayHn;
        gm gmVarVk = this.f14080hn.vk();
        if (gmVarVk == null || (hnjVarDkl = gmVarVk.dkl()) == null || (jSONArrayHn = hnjVarDkl.hn()) == null || jSONArrayHn.length() <= 0) {
            return null;
        }
        return hnj(jSONArrayHn, str, hnjVar);
    }

    private com.bytedance.sdk.component.adexpress.hnj.hn.hnj qor(String str, com.bytedance.sdk.component.adexpress.gjv.ojm.hnj hnjVar) {
        gm.hnj hnjVarDkl;
        JSONArray jSONArrayQor;
        gm gmVarVk = this.f14080hn.vk();
        if (gmVarVk == null || (hnjVarDkl = gmVarVk.dkl()) == null || (jSONArrayQor = hnjVarDkl.qor()) == null || jSONArrayQor.length() <= 0) {
            return null;
        }
        return hnj(jSONArrayQor, str, hnjVar);
    }

    private WebResourceResponse sk() {
        InputStream inputStreamOpenRawResource;
        int iOjm = com.bytedance.sdk.openadsdk.core.ta.hn().ojm();
        if (iOjm == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.oj.hnj().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(iOjm, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                inputStreamOpenRawResource = (charSequence == null || !charSequence.toString().endsWith(".xml")) ? resources.openRawResource(iOjm) : new ByteArrayInputStream(bug);
            } catch (Resources.NotFoundException e10) {
                com.bytedance.sdk.component.utils.apu.qor("ExpressClient", e10.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(com.bytedance.sdk.component.adexpress.gjv.ojm.hnj.IMAGE.hnj(), C.UTF8_NAME, inputStreamOpenRawResource);
        }
        return null;
    }

    public int hnj() {
        ArrayList<Integer> arrayList = this.hnj;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Integer num = arrayList.get(i10);
            i10++;
            Integer num2 = num;
            if (num2.intValue() == 3 || num2.intValue() == 2 || num2.intValue() == -1) {
                return num2.intValue();
            }
        }
        return TextUtils.isEmpty(gjv()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.dse = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.aq = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.hn.orl orlVar = this.f14081ta;
        if (orlVar != null && orlVar.as() && this.dnm) {
            this.f14081ta.qor();
            com.bytedance.sdk.component.utils.mjg.hnj(webView, "javascript:window.SDK_INJECT_DATA=" + this.f14081ta.qor());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj("ExpressClient", "shouldInterceptRequest error1", th2);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVarHnj = hnj(webView, str);
            str2 = str;
            try {
                hnj(jCurrentTimeMillis, System.currentTimeMillis(), str2, (hnjVarHnj == null || hnjVarHnj.hnj() == null) ? 2 : 1);
                if (hnjVarHnj != null && hnjVarHnj.hn() != 5) {
                    hnjVarHnj.hn();
                    this.hnj.add(Integer.valueOf(hnjVarHnj.hn()));
                }
                if (hnjVarHnj != null && hnjVarHnj.hnj() != null) {
                    return hnjVarHnj.hnj();
                }
            } catch (Throwable th2) {
                th = th2;
                com.bytedance.sdk.component.utils.apu.hnj("ExpressClient", "shouldInterceptRequest error2", th);
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = str;
        }
        return super.shouldInterceptRequest(webView, str2);
    }

    private String gjv() {
        com.bytedance.sdk.openadsdk.core.model.as asVar = this.f14080hn;
        if (asVar == null) {
            return null;
        }
        if (asVar.zd() != null) {
            return this.f14080hn.zd().dnm();
        }
        if (this.f14080hn.vk() != null) {
            return "v3";
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnj(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.oj ojVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equals("local://pag_open_icon_id") && !str.equals(com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj)) {
            com.bytedance.sdk.openadsdk.core.model.as.hnj hnjVarZd = this.f14080hn.zd();
            if (hnjVarZd != null && !TextUtils.isEmpty(str) && str.equals(hnjVarZd.hn())) {
                com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVar = new com.bytedance.sdk.component.adexpress.hnj.hn.hnj();
                hnjVar.hnj(5);
                WebResourceResponse webResourceResponseSk = sk(str);
                hnjVar.hnj(webResourceResponseSk);
                com.bytedance.sdk.openadsdk.core.sk.hnj.hnj().hnj(webResourceResponseSk != null);
                return hnjVar;
            }
            com.bytedance.sdk.component.adexpress.gjv.ojm.hnj hnjVarHnj = com.bytedance.sdk.component.adexpress.gjv.ojm.hnj(str);
            if (mjg.hn(this.f14080hn)) {
                com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVarHnj2 = hnj(str, hnjVarHnj);
                if (hnjVarHnj2 != null) {
                    return hnjVarHnj2;
                }
                com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVarHn = hn(str, hnjVarHnj);
                if (hnjVarHn != null) {
                    Log.d("ExpressClient", "interceptTemplate: Hit fetch file cache url=".concat(str));
                    return hnjVarHn;
                }
                com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVarQor = qor(str, hnjVarHnj);
                if (hnjVarQor != null) {
                    return hnjVarQor;
                }
            }
            if (hnjVarHnj != com.bytedance.sdk.component.adexpress.gjv.ojm.hnj.IMAGE) {
                for (com.bytedance.sdk.openadsdk.core.model.oj ojVar2 : this.f14080hn.lx()) {
                    if (!TextUtils.isEmpty(ojVar2.hnj()) && !TextUtils.isEmpty(str)) {
                        String strHnj = ojVar2.hnj();
                        if (strHnj.startsWith("https")) {
                            strHnj = strHnj.replaceFirst("https", "http");
                        }
                        if ((str.startsWith("https") ? str.replaceFirst("https", "http") : str).equals(strHnj)) {
                            ojVar = ojVar2;
                            break;
                        }
                    }
                }
            }
            if (hnjVarHnj != com.bytedance.sdk.component.adexpress.gjv.ojm.hnj.IMAGE && ojVar == null) {
                return com.bytedance.sdk.component.adexpress.hnj.hn.hn.hnj(str, hnjVarHnj, "", gjv());
            }
            com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVar2 = new com.bytedance.sdk.component.adexpress.hnj.hn.hnj();
            hnjVar2.hnj(5);
            hnjVar2.hnj(hnj(str, com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(this.f14080hn, str)));
            return hnjVar2;
        }
        com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVar3 = new com.bytedance.sdk.component.adexpress.hnj.hn.hnj();
        hnjVar3.hnj(5);
        hnjVar3.hnj(sk());
        return hnjVar3;
    }

    private WebResourceResponse sk(String str) {
        InputStream inputStreamHnj;
        if (TextUtils.isEmpty(str) || (inputStreamHnj = com.bytedance.sdk.openadsdk.core.sk.hnj.hnj().hnj(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", C.UTF8_NAME, inputStreamHnj);
        hnj(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnj(String str, com.bytedance.sdk.component.adexpress.gjv.ojm.hnj hnjVar) {
        gm.hnj hnjVarDkl;
        JSONArray jSONArrayHnj;
        gm gmVarVk = this.f14080hn.vk();
        if (gmVarVk != null && (hnjVarDkl = gmVarVk.dkl()) != null && (jSONArrayHnj = hnjVarDkl.hnj()) != null && jSONArrayHnj.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayHnj.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.bug.gjv.hnj(jSONArrayHnj.optString(i10), com.bytedance.sdk.openadsdk.core.settings.dnm.hn().apu()), str) && hnjVar == com.bytedance.sdk.component.adexpress.gjv.ojm.hnj.IMAGE) {
                    com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVar2 = new com.bytedance.sdk.component.adexpress.hnj.hn.hnj();
                    hnjVar2.hnj(5);
                    hnjVar2.hnj(hnj(str, com.bytedance.sdk.component.utils.sk.hnj(str)));
                    return hnjVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnj(JSONArray jSONArray, String str, com.bytedance.sdk.component.adexpress.gjv.ojm.hnj hnjVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.bug.gjv.hnj(jSONArray.optString(i10), com.bytedance.sdk.openadsdk.core.settings.dnm.hn().apu()), str)) {
                    com.bytedance.sdk.component.adexpress.hnj.hn.hnj hnjVar2 = new com.bytedance.sdk.component.adexpress.hnj.hn.hnj();
                    hnjVar2.hnj(5);
                    hnjVar2.hnj(gjv(str, hnjVar));
                    return hnjVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse hnj(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamHnj = com.bytedance.sdk.openadsdk.ta.gjv.hnj(str, str2);
            if (inputStreamHnj == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(com.bytedance.sdk.component.adexpress.gjv.ojm.hnj.IMAGE.hnj(), "utf-8", inputStreamHnj);
            try {
                hnj(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th2) {
                th = th2;
                webResourceResponse = webResourceResponse2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        com.bytedance.sdk.component.utils.apu.hnj("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    private void hnj(long j10, long j11, String str, int i10) {
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.dkl;
        if (orlVar == null || orlVar.hn() == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.gjv.ojm.hnj hnjVarHnj = com.bytedance.sdk.component.adexpress.gjv.ojm.hnj(str);
        if (hnjVarHnj == com.bytedance.sdk.component.adexpress.gjv.ojm.hnj.HTML) {
            this.dkl.hn().hnj(str, j10, j11, i10);
        } else if (hnjVarHnj == com.bytedance.sdk.component.adexpress.gjv.ojm.hnj.JS) {
            this.dkl.hn().hn(str, j10, j11, i10);
        }
    }

    private void hnj(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(map);
    }
}
