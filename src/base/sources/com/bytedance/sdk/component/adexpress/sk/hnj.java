package com.bytedance.sdk.component.adexpress.sk;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hn.aq;
import com.bytedance.sdk.component.adexpress.hn.dnm;
import com.bytedance.sdk.component.adexpress.hn.dse;
import com.bytedance.sdk.component.adexpress.hn.orl;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.ojm.dkl;
import com.bytedance.sdk.component.utils.mjg;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj implements dnm, com.bytedance.sdk.component.adexpress.hn.gjv<dkl>, com.bytedance.sdk.component.adexpress.hnj, com.bytedance.sdk.component.adexpress.theme.hnj {
    private String aq;
    private orl bug;
    private aq dnm;
    private Context dse;
    protected dkl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected boolean f12731hn;
    protected JSONObject hnj;
    private int mjg;
    private String ojm;
    private boolean orl;
    protected boolean qor;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private volatile dse f12733ta;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected int f12732sk = 8;
    protected AtomicBoolean dkl = new AtomicBoolean(false);

    public hnj(Context context, orl orlVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f12731hn = false;
        this.dse = context;
        this.bug = orlVar;
        this.aq = orlVar.gjv();
        themeStatusBroadcastReceiver.hnj(this);
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            bug();
            return;
        }
        dkl dklVarOrl = orl();
        this.gjv = dklVarOrl;
        if (dklVarOrl != null) {
            this.f12731hn = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        } else {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.gjv.hnj() != null) {
                this.gjv = new dkl(com.bytedance.sdk.component.adexpress.gjv.hnj(), dkl.qor.ADS);
            }
        }
    }

    private void bug() {
        if (this.dse == null && com.bytedance.sdk.component.adexpress.gjv.hnj() != null) {
            this.dse = com.bytedance.sdk.component.adexpress.gjv.hnj();
        }
        if (this.dse != null) {
            dkl dklVarOrl = orl();
            this.gjv = dklVarOrl;
            if (dklVarOrl == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.gjv = new dkl(new MutableContextWrapper(this.dse.getApplicationContext()), this.bug.as() ? dkl.qor.ADS_V3 : dkl.qor.ADS);
            } else {
                this.f12731hn = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private void mjg() {
        if (this.bug.as()) {
            sk.hnj().hn(this.gjv);
        } else {
            sk.hnj().qor(this.gjv);
        }
    }

    private dkl orl() {
        return this.bug.as() ? sk.hnj().hnj(this.dse, this.aq) : sk.hnj().hn(this.dse, this.aq);
    }

    public void aq() {
        ojm();
        Activity activityHnj = com.bytedance.sdk.component.utils.hn.hnj(this.gjv);
        if (activityHnj != null) {
            this.mjg = hn(activityHnj);
        }
    }

    public void dkl() {
        if (hnj() == null) {
            return;
        }
        try {
            hnj().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public orl dnm() {
        return this.bug;
    }

    public abstract void dse();

    public void gjv() {
        if (this.dkl.get()) {
            return;
        }
        this.dkl.set(true);
        dse();
        if (this.gjv.getParent() != null) {
            ((ViewGroup) this.gjv.getParent()).removeView(this.gjv);
        }
        if (this.qor) {
            mjg();
        } else {
            sk.hnj().gjv(this.gjv);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public dkl sk() {
        return hnj();
    }

    public abstract void hnj(int i10);

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    public int qor() {
        return 0;
    }

    private int hn(Activity activity) {
        return activity.hashCode();
    }

    public void hnj(String str) {
        this.ojm = str;
    }

    public dkl hnj() {
        return this.gjv;
    }

    public void hnj(aq aqVar) {
        this.dnm = aqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.gjv
    public void hnj(dse dseVar) {
        String str;
        this.f12733ta = dseVar;
        if (hnj() != null && hnj().getWebView() != null) {
            if (TextUtils.isEmpty(this.ojm)) {
                this.f12733ta.hnj(102, "url is empty");
                return;
            }
            if (!this.bug.as()) {
                if (!com.bytedance.sdk.component.adexpress.hnj.hn.hn.hnj(this.hnj)) {
                    dse dseVar2 = this.f12733ta;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.hnj == null);
                    dseVar2.hnj(103, sb2.toString());
                    return;
                }
            } else if (qor() == 9 && !com.bytedance.sdk.component.adexpress.hnj.hn.hn.hn(this.hnj)) {
                dse dseVar3 = this.f12733ta;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.hnj == null);
                dseVar3.hnj(103, sb3.toString());
                return;
            }
            this.bug.sk().hnj(this.f12731hn);
            if (this.f12731hn) {
                try {
                    int iTu = this.bug.tu();
                    if (this.bug.as() && iTu == 1) {
                        this.bug.qor();
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.bug.qor() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.gjv.uua();
                    this.bug.sk();
                    mjg.hnj(this.gjv.getWebView(), str);
                    return;
                } catch (Exception e10) {
                    sk.hnj().gjv(this.gjv);
                    this.f12733ta.hnj(102, "load exception is " + e10.getMessage());
                    return;
                }
            }
            dkl dklVarHnj = hnj();
            dklVarHnj.uua();
            this.bug.sk();
            dklVarHnj.a_(this.ojm);
            return;
        }
        dse dseVar4 = this.f12733ta;
        StringBuilder sb4 = new StringBuilder("SSWebview null is ");
        sb4.append(hnj() == null);
        sb4.append(" or Webview is null");
        dseVar4.hnj(102, sb4.toString());
    }

    protected void ojm() {
    }

    protected void ta() {
    }

    public void hnj(boolean z10) {
        this.orl = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.dnm
    public void hnj(final com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        if (mjgVar == null) {
            if (this.f12733ta != null) {
                this.f12733ta.hnj(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zHn = mjgVar.hn();
        final float fQor = (float) mjgVar.qor();
        final float fGjv = (float) mjgVar.gjv();
        if (qor() == 0 && (fQor <= 0.0f || fGjv <= 0.0f)) {
            if (this.f12733ta != null) {
                this.f12733ta.hnj(105, "width is " + fQor + "height is " + fGjv);
                return;
            }
            return;
        }
        this.qor = zHn;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            hnj(mjgVar, fQor, fGjv);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.sk.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj.this.hnj(mjgVar, fQor, fGjv);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(com.bytedance.sdk.component.adexpress.hn.mjg mjgVar, float f10, float f11) {
        mjgVar.ta();
        boolean z10 = this.qor;
        if (z10 && !this.orl) {
            hnj(f10, f11);
            hnj(this.f12732sk);
            if (this.f12733ta != null) {
                this.f12733ta.hnj(hnj(), mjgVar);
                return;
            }
            return;
        }
        if (!z10) {
            sk.hnj().gjv(this.gjv);
        }
        hnj(mjgVar.ta(), mjgVar.ojm());
    }

    @Override // com.bytedance.sdk.component.adexpress.hn.dnm
    public void hnj(View view, int i10, com.bytedance.sdk.component.adexpress.qor qorVar) {
        aq aqVar = this.dnm;
        if (aqVar != null) {
            aqVar.hnj(view, i10, qorVar);
        }
    }

    private void hnj(float f10, float f11) {
        this.bug.sk().sk();
        if (qor() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hnj().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            hnj().setLayoutParams(layoutParams);
            return;
        }
        int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dse, f10);
        int iHnj2 = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dse, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) hnj().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iHnj, iHnj2);
        }
        layoutParams2.width = iHnj;
        layoutParams2.height = iHnj2;
        hnj().setLayoutParams(layoutParams2);
    }

    private void hnj(int i10, String str) {
        if (this.f12733ta != null) {
            this.f12733ta.hnj(i10, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hnj
    public void hnj(Activity activity) {
        if (this.mjg == 0 || activity == null || activity.hashCode() != this.mjg) {
            return;
        }
        gjv();
        ta();
    }

    public void hnj(JSONObject jSONObject) {
        this.hnj = jSONObject;
    }
}
