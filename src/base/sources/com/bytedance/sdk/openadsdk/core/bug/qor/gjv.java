package com.bytedance.sdk.openadsdk.core.bug.qor;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.hn.dnm;
import com.bytedance.sdk.component.adexpress.hn.mjg;
import com.bytedance.sdk.component.ojm.dkl;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.uua;
import com.bytedance.sdk.openadsdk.core.ojm.fc;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.core.widget.hnj.sk;
import com.bytedance.sdk.openadsdk.utils.jbd;
import com.bytedance.sdk.openadsdk.utils.xn;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements dnm, qor<dkl> {
    private final boolean aq;
    private com.bytedance.sdk.openadsdk.core.bug.qor.hnj dkl;
    private int dse;
    private ua gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private as f13692hn;
    private Context hnj;
    private boolean ojm = false;
    private dkl qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f13693sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private hnj f13694ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void dse();
    }

    public gjv(Context context, as asVar, boolean z10) {
        this.dse = 1;
        this.hnj = context;
        this.f13692hn = asVar;
        this.dse = asVar.zf();
        this.aq = z10;
        if (z10) {
            this.f13693sk = uua.hn(this.f13692hn).hnj(this.dse == 1);
        } else {
            this.f13693sk = uua.qor(this.f13692hn).hnj(this.dse == 1);
        }
    }

    private void aq() {
        ua uaVar = new ua(this.hnj);
        this.gjv = uaVar;
        uaVar.hn(this.qor).hnj(this.f13692hn).qor(this.f13692hn.sp()).gjv(this.f13692hn.ldn()).sk(this.f13692hn.nl()).hnj(com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(0.0f, 0.0f, false, this.f13692hn, null, null)).hnj(this).hnj(this.qor);
    }

    private void dse() {
        gjv gjvVar;
        this.qor.setBackgroundColor(0);
        this.qor.setBackgroundResource(R.color.transparent);
        this.qor.setVisibility(8);
        hnj(this.qor);
        if (this.f13692hn != null) {
            gjvVar = this;
            this.qor.setWebViewClient(new sk(this.hnj, this.gjv, this.f13692hn.sp(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.bug.qor.gjv.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (gjv.this.f13694ta != null) {
                        gjv.this.f13694ta.dse();
                    }
                }
            });
        } else {
            gjvVar = this;
        }
        com.bytedance.sdk.component.adexpress.sk.sk.hnj().hnj(gjvVar.qor, gjvVar.gjv);
        gjvVar.qor.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(gjvVar.gjv));
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.qor.qor
    /* JADX INFO: renamed from: dkl, reason: merged with bridge method [inline-methods] */
    public dkl gjv() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.qor.qor
    public void hn() {
        if (TextUtils.isEmpty(this.f13693sk)) {
            this.qor.setVisibility(8);
        } else {
            this.qor.a_(this.f13693sk);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.dnm
    public void hnj(mjg mjgVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.qor.qor
    public void qor() {
        ua uaVar = this.gjv;
        if (uaVar != null) {
            uaVar.qor();
        }
        this.gjv = null;
        try {
            dkl dklVar = this.qor;
            if (dklVar != null) {
                ViewGroup viewGroup = (ViewGroup) dklVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.qor);
                }
                this.qor.jip();
            }
        } catch (Throwable unused) {
        }
        if (this.f13694ta != null) {
            this.f13694ta = null;
        }
    }

    public ua sk() {
        return this.gjv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.qor.qor
    public void hnj() {
        this.qor = new dkl(this.hnj, dkl.qor.EASY_PLAYABLE);
        dse();
        aq();
        if (this.aq) {
            return;
        }
        jbd.hnj(this.qor, false, this.f13692hn.xf(), false, new jbd.hn() { // from class: com.bytedance.sdk.openadsdk.core.bug.qor.gjv.1
            @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
            public void hn() {
                gjv.this.hnj(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
            public void hnj(View view, boolean z10) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
            public void hnj(boolean z10) {
                gjv.this.hnj(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbd.hn
            public void hnj() {
                gjv.this.hnj(true);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.qor.qor
    public void hnj(com.bytedance.sdk.openadsdk.core.bug.qor.hnj hnjVar) {
        this.dkl = hnjVar;
    }

    private void hnj(dkl dklVar) {
        if (dklVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(this.hnj).hnj(false).hnj(dklVar.getWebView());
            dklVar.setVerticalScrollBarEnabled(false);
            dklVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(dklVar);
            dklVar.mjg();
            dklVar.setUserAgentString(xn.hnj(dklVar.getWebView(), BuildConfig.VERSION_CODE));
            dklVar.setMixedContentMode(0);
            dklVar.setJavaScriptEnabled(true);
            dklVar.setJavaScriptCanOpenWindowsAutomatically(true);
            dklVar.setDomStorageEnabled(true);
            dklVar.setDatabaseEnabled(true);
            dklVar.setAllowFileAccess(false);
            dklVar.setSupportZoom(true);
            dklVar.setBuiltInZoomControls(true);
            dklVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            dklVar.setUseWideViewPort(true);
            dklVar.setCacheMode(-1);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bug.qor.qor
    public void hnj(fc fcVar) {
        ua uaVar = this.gjv;
        if (uaVar != null) {
            uaVar.hnj(fcVar);
        }
    }

    public void hnj(boolean z10) {
        if (z10 == this.ojm) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z10 ? 1 : 0);
        } catch (Exception e10) {
            e10.getMessage();
        }
        this.gjv.hnj("visibleStateChange", jSONObject);
        this.ojm = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.dnm
    public void hnj(View view, int i10, com.bytedance.sdk.component.adexpress.qor qorVar) {
        com.bytedance.sdk.openadsdk.core.bug.qor.hnj hnjVar = this.dkl;
        if (hnjVar != null) {
            hnjVar.hnj(view, i10, qorVar);
        }
    }

    public void hnj(hnj hnjVar) {
        this.f13694ta = hnjVar;
    }
}
