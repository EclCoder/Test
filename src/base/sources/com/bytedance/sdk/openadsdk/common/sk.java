package com.bytedance.sdk.openadsdk.common;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.ua;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk implements xyo.hnj {
    private String apu;
    private float aq;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private long f13312fc;
    private final com.bytedance.sdk.component.ojm.dkl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final boolean f13313hn;
    private final as hnj;
    private boolean jip;
    private boolean mjg;
    private int ojm;
    private int orl;
    private WebView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private gjv f13315sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private long f13316ta;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private int f13317xn;
    private String dkl = "landingpage";
    private final Handler dse = new xyo(com.bytedance.sdk.openadsdk.core.fc.hn().getLooper(), this);
    private final AtomicBoolean dnm = new AtomicBoolean(false);
    private Pattern bug = null;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private long f13314oj = -1;
    private final List<Integer> uua = new ArrayList();

    public sk(as asVar, com.bytedance.sdk.component.ojm.dkl dklVar, String str, boolean z10) {
        this.hnj = asVar;
        this.gjv = dklVar;
        this.f13313hn = z10;
        hn();
    }

    private void aq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.f13314oj);
            jSONObject.put("loading_show_timestamp", this.f13312fc);
            WebView webView = this.qor;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.hnj, this.dkl, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dkl() {
        return dse() > 0 && !this.dnm.get();
    }

    private int dse() {
        try {
            return this.qor.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private void gjv() {
        Handler handler = this.dse;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void hn() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.gjv;
        if (dklVar != null) {
            this.qor = dklVar.getWebView();
            View arbitrageLoadingView = this.gjv.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof gjv) {
                this.f13315sk = (gjv) arbitrageLoadingView;
            }
        }
        this.ojm = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().tu();
        this.aq = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().tgn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sk() {
        this.mjg = false;
        if (this.dnm.getAndSet(true)) {
            return;
        }
        this.f13316ta = SystemClock.elapsedRealtime();
        this.f13312fc = System.currentTimeMillis();
        aq();
        if (this.f13315sk == null) {
            return;
        }
        WebView webView = this.qor;
        if (webView != null) {
            this.apu = webView.getUrl();
        }
        this.f13315sk.setVisibility(0);
        this.f13315sk.hnj(this.hnj);
        this.f13315sk.hnj();
        this.f13315sk.setAlpha(this.aq);
        this.f13315sk.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.sk.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        gjv();
        qor();
    }

    public void qor(WebView webView, String str, boolean z10) {
        this.uua.clear();
        this.jip = z10;
        if (z10) {
            this.mjg = true;
        }
        this.f13317xn = dse();
    }

    public void hnj(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dkl = str;
    }

    public void hnj(WebView webView, String str, boolean z10) {
        if (z10 && dkl()) {
            hnj();
        }
    }

    private void qor() {
        Handler handler = this.dse;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.ojm);
        }
    }

    public void hnj(WebView webView, String str) {
        as asVar = this.hnj;
        if (asVar == null || !com.bytedance.sdk.component.ojm.hn.hnj(asVar.tu().qor(), str)) {
            return;
        }
        this.orl++;
        com.bytedance.sdk.component.utils.ojm.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sk.1
            @Override // java.lang.Runnable
            public void run() {
                if (sk.this.dkl()) {
                    sk.this.hnj();
                }
            }
        });
    }

    public void hn(WebView webView, String str, boolean z10) {
        if (!z10 || this.f13315sk == null) {
            return;
        }
        hnj(1);
    }

    public void hnj(WebView webView, int i10) {
        gjv gjvVar = this.f13315sk;
        if (gjvVar != null) {
            gjvVar.hnj(i10);
        }
        if (this.jip) {
            if (hnj(i10, 30)) {
                hnj(30, webView);
            }
            if (hnj(i10, 50)) {
                hnj(50, webView);
            }
            if (hnj(i10, 70)) {
                hnj(70, webView);
            }
        }
        if (this.f13315sk == null || i10 != 100) {
            return;
        }
        hnj(1);
    }

    public void hnj() {
        if (ua.dkl()) {
            sk();
        } else {
            com.bytedance.sdk.component.utils.ojm.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sk.2
                @Override // java.lang.Runnable
                public void run() {
                    sk.this.sk();
                }
            });
        }
    }

    private void hnj(final int i10) {
        WebView webView = this.qor;
        if (webView != null && i10 == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.apu)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.ojm.hn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sk.4
            @Override // java.lang.Runnable
            public void run() {
                if (sk.this.f13315sk != null) {
                    sk.this.dnm.set(false);
                    sk.this.f13315sk.hnj(sk.this.hnj, sk.this.dkl, i10, sk.this.apu, sk.this.f13316ta, sk.this.mjg, sk.this.orl, sk.this.f13312fc);
                    sk.this.orl = 0;
                }
            }
        });
        gjv();
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        if (message.what == 1) {
            hnj(0);
        }
    }

    public void hnj(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f13314oj = SystemClock.elapsedRealtime();
        }
    }

    private boolean hnj(int i10, int i11) {
        if (i10 < i11 || this.uua.contains(Integer.valueOf(i11)) || this.f13317xn < 2) {
            return false;
        }
        this.uua.add(Integer.valueOf(i11));
        return true;
    }

    private void hnj(int i10, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i10);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.hnj, this.dkl, jSONObject);
    }
}
