package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.vf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bug;
import com.bytedance.sdk.openadsdk.common.fc;
import com.bytedance.sdk.openadsdk.common.orl;
import com.bytedance.sdk.openadsdk.common.ta;
import com.bytedance.sdk.openadsdk.common.uua;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.utils.apu;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.mjg;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.wu;
import com.bytedance.sdk.openadsdk.utils.xn;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {
    private as apu;
    private TextView aq;
    private fc bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private orl f13059cm;
    private com.bytedance.sdk.component.ojm.dkl dkl;
    private Context dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private String f19do;
    private ImageView dse;
    private boolean dzo;
    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private String f13060fc;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private ImageView f13061ff;
    private com.bytedance.sdk.openadsdk.core.widget.hnj.sk fvt;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private mjg f13062gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    uua f13063hn;
    com.bytedance.sdk.openadsdk.gjv.orl hnj;
    private int hqh;
    private ImageView jbd;
    private String jip;
    private com.bytedance.sdk.openadsdk.core.dkl.dkl mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private int f13064oj;
    private Button orl;
    private boolean orp;
    private bug pty;
    TTAdDislikeToast qor;
    private ILoader tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.sk f13066ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj f13067ul;
    private ua uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private int f13068vf;
    private String wu;
    private ImageView xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private String f13069xn;
    private final AtomicBoolean as = new AtomicBoolean(true);
    private final AtomicInteger tgn = new AtomicInteger(0);
    private final AtomicInteger xyo = new AtomicInteger(0);
    private final AtomicInteger nyv = new AtomicInteger(0);
    final AtomicBoolean gjv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final AtomicBoolean f13065sk = new AtomicBoolean(false);
    private boolean sq = false;
    private long pnz = 0;
    private String pv = "ダウンロード";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.gjv.orl> hnj;

        public hn(com.bytedance.sdk.openadsdk.gjv.orl orlVar) {
            this.hnj = new WeakReference<>(orlVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
            com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.hnj.get();
            if (orlVar != null) {
                orlVar.hn(i11);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj implements com.bytedance.sdk.openadsdk.gjv.bug {
        private final WeakReference<TTLandingPageActivity> gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final as f13075hn;
        private final int hnj;
        private final String qor;

        public hnj(int i10, as asVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.hnj = i10;
            this.f13075hn = asVar;
            this.qor = str;
            this.gjv = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.gjv.bug
        public void hnj(int i10) {
            TTLandingPageActivity tTLandingPageActivity = this.gjv.get();
            if (tTLandingPageActivity != null) {
                com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(this.hnj, tTLandingPageActivity.xyo.get(), tTLandingPageActivity.nyv.get(), tTLandingPageActivity.tgn.get() - tTLandingPageActivity.nyv.get(), this.f13075hn, this.qor, i10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class qor implements View.OnTouchListener {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final WeakReference<com.bytedance.sdk.openadsdk.common.sk> f13076hn;
        private final WeakReference<com.bytedance.sdk.openadsdk.gjv.orl> hnj;

        public qor(com.bytedance.sdk.openadsdk.gjv.orl orlVar, com.bytedance.sdk.openadsdk.common.sk skVar) {
            this.hnj = new WeakReference<>(orlVar);
            this.f13076hn = new WeakReference<>(skVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.hnj.get();
            if (orlVar != null) {
                orlVar.hnj(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.sk skVar = this.f13076hn.get();
            if (skVar == null) {
                return false;
            }
            skVar.hnj(motionEvent);
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean hnj() {
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ta();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        sk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.fc.sk()) {
            finish();
            return;
        }
        try {
            oj.hn(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        as asVarHnj = hqh.hnj().hnj(hqh.hnj(getIntent()));
        this.apu = asVarHnj;
        if (asVarHnj != null) {
            this.orp = asVarHnj.mjg();
            this.apu.qb(0);
            if (com.bytedance.sdk.openadsdk.as.sk.hnj("lp_cache_enable", false)) {
                apu.hnj(this.apu);
            }
        }
        com.bytedance.sdk.openadsdk.mjg.hn.hnj(this);
        this.wu = "";
        hnj(4);
        as asVar = this.apu;
        if (asVar != null) {
            this.f13060fc = asVar.sp();
            this.jip = this.apu.ldn();
            this.f19do = this.apu.rx();
            this.wu = this.apu.dnm();
            this.f13064oj = this.apu.orl();
            this.f13069xn = this.apu.bug();
        }
        try {
            setContentView(hnj(this.wu));
            if (this.apu == null) {
                finish();
                return;
            }
            if (com.bytedance.sdk.openadsdk.as.sk.hnj("lp_cache_enable", false)) {
                gjv();
            }
            aq();
            if (!TextUtils.isEmpty(this.f19do)) {
                this.tu = com.bytedance.sdk.openadsdk.dse.hn.hnj().hn();
                int iHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.tu, this.f19do);
                this.f13068vf = iHnj;
                this.hqh = iHnj > 0 ? 2 : 0;
            }
            this.dnm = this;
            if (this.dkl != null) {
                com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(this).hnj(false).hn(false).hnj(this.dkl.getWebView());
            }
            if (this.dzo) {
                this.f13059cm.hnj(true);
            }
            com.bytedance.sdk.component.ojm.dkl dklVar = this.dkl;
            if (dklVar != null && dklVar.getWebView() != null) {
                com.bytedance.sdk.openadsdk.gjv.orl orlVarHn = new com.bytedance.sdk.openadsdk.gjv.orl(this.apu, this.dkl.getWebView(), new hnj(this.f13068vf, this.apu, "landingpage", this), this.hqh).hn(true);
                this.hnj = orlVarHn;
                this.f13067ul = orlVarHn.hnj;
                this.f13066ua = orp.hnj(this.apu, this.dkl, this.dnm, this.f13069xn);
                this.hnj.sk(this.sq);
                this.apu.xn(this.sq);
            }
            ojm();
            com.bytedance.sdk.component.ojm.dkl dklVar2 = this.dkl;
            if (dklVar2 != null) {
                dklVar2.setLandingPage(true);
                this.dkl.setTag("landingpage");
                this.dkl.setMaterialMeta(this.apu.pf());
            }
            com.bytedance.sdk.openadsdk.core.widget.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.widget.hnj.sk(this.dnm, this.uua, this.f13060fc, this.f13066ua, this.hnj, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.mjg != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.mjg.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.pty != null) {
                        TTLandingPageActivity.this.pty.hn();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.f19do)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.tgn.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(TTLandingPageActivity.this.tu, TTLandingPageActivity.this.f19do, str);
                        if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.nyv.incrementAndGet();
                            return webResourceResponseModelHnj.getWebResourceResponse();
                        }
                        if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getMsg() == 2) {
                            TTLandingPageActivity.this.xyo.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.apu.hnj("TTAD.LandingPageAct", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.fvt = skVar;
            skVar.hnj(this.apu);
            this.fvt.hnj("landingpage");
            com.bytedance.sdk.component.ojm.dkl dklVar3 = this.dkl;
            if (dklVar3 != null) {
                dklVar3.setWebViewClient(this.fvt);
                com.bytedance.sdk.component.ojm.dkl dklVar4 = this.dkl;
                if (dklVar4 != null) {
                    dklVar4.setUserAgentString(xn.hnj(dklVar4.getWebView(), BuildConfig.VERSION_CODE));
                }
                com.bytedance.sdk.component.ojm.dkl dklVar5 = this.dkl;
                if (dklVar5 != null) {
                    dklVar5.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.apu, "landingpage", this.hqh);
            if (this.dkl != null) {
                if (com.bytedance.sdk.openadsdk.as.sk.hnj("lp_cache_enable", false) && this.sq) {
                    com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.hnj;
                    if (orlVar != null) {
                        orlVar.qor(this.wu);
                        this.hnj.gjv(this.wu);
                        this.hnj.hnj(this.wu, 0L);
                    }
                    bug bugVar = this.pty;
                    if (bugVar != null) {
                        bugVar.hn();
                    }
                } else {
                    wu.hnj(this.dkl, this.wu);
                }
                this.dkl.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(this.uua, this.hnj, this.f13066ua) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.11
                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i10) {
                        super.onProgressChanged(webView, i10);
                        if (TTLandingPageActivity.this.pty != null) {
                            TTLandingPageActivity.this.pty.hnj(i10);
                        }
                        if (TTLandingPageActivity.this.mjg != null && !TTLandingPageActivity.this.isFinishing()) {
                            if (i10 == 100 && TTLandingPageActivity.this.mjg.isShown()) {
                                TTLandingPageActivity.this.mjg.setVisibility(8);
                            } else {
                                TTLandingPageActivity.this.mjg.setProgress(i10);
                            }
                        }
                        if (!TTLandingPageActivity.this.dzo || TTLandingPageActivity.this.f13059cm == null) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - TTLandingPageActivity.this.pnz >= 200 || i10 == 100) {
                            TTLandingPageActivity.this.f13059cm.hnj(webView, TTLandingPageActivity.this.f13067ul);
                            TTLandingPageActivity.this.pnz = jCurrentTimeMillis;
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.dzo) {
                            TTLandingPageActivity.this.f13059cm.hnj(str);
                            TTLandingPageActivity.this.f13059cm.hn(webView.getUrl());
                        } else if (TTLandingPageActivity.this.aq != null) {
                            TextView textView = TTLandingPageActivity.this.aq;
                            if (TextUtils.isEmpty(str)) {
                                str = com.bytedance.sdk.component.utils.wu.hnj(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }
                });
                if (this.dkl.getWebView() != null) {
                    this.dkl.getWebView().setOnScrollChangeListener(new hn(this.hnj));
                    this.dkl.getWebView().setOnTouchListener(new qor(this.hnj, this.f13066ua) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.12
                        private float gjv;
                        private float qor;

                        /* JADX INFO: renamed from: sk, reason: collision with root package name */
                        private long f13071sk;

                        /* JADX INFO: renamed from: hn, reason: collision with root package name */
                        private final int f13070hn = oj.hn();
                        private float dkl = 0.0f;
                        private float dse = 0.0f;

                        @Override // com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.qor, android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (!TTLandingPageActivity.this.dzo) {
                                return super.onTouch(view, motionEvent);
                            }
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    this.qor = motionEvent.getRawX();
                                    this.gjv = motionEvent.getRawY();
                                    this.f13071sk = System.currentTimeMillis();
                                } else if (actionMasked == 2) {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - this.qor) < this.f13070hn) {
                                        Math.abs(rawY - this.gjv);
                                    }
                                    this.dkl += Math.abs(motionEvent.getX() - this.qor);
                                    this.dse += Math.abs(motionEvent.getY() - this.gjv);
                                    System.currentTimeMillis();
                                    if (rawY - this.gjv > this.f13070hn) {
                                        TTLandingPageActivity.this.f13059cm.hnj();
                                    }
                                    if (rawY - this.gjv < (-this.f13070hn)) {
                                        TTLandingPageActivity.this.f13059cm.hn();
                                    }
                                }
                            } catch (Throwable th2) {
                                Log.e("TTAD.LandingPageAct", "TouchRecordTool onTouch error", th2);
                            }
                            return super.onTouch(view, motionEvent);
                        }
                    });
                }
                this.dkl.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.13
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                        if (TTLandingPageActivity.this.eum != null) {
                            TTLandingPageActivity.this.eum.hnj(TTLandingPageActivity.this.apu);
                        }
                    }
                });
            }
            sk();
            mjg mjgVarHnj = com.bytedance.sdk.openadsdk.utils.ojm.hnj(this, new com.bytedance.sdk.openadsdk.utils.ojm.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.14
                @Override // com.bytedance.sdk.openadsdk.utils.ojm.hnj
                public View hnj() {
                    return TTLandingPageActivity.this.dse;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ojm.hnj
                public void hn() {
                }
            });
            this.f13062gm = mjgVarHnj;
            mjgVarHnj.hnj(0L);
            com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(SystemClock.elapsedRealtime() - jElapsedRealtime, this.apu, "landingpage", this.tu, this.f19do);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        com.bytedance.sdk.component.ojm.dkl dklVar;
        com.bytedance.sdk.component.ojm.dkl dklVar2;
        super.onDestroy();
        if (com.bytedance.sdk.openadsdk.as.sk.hnj("lp_cache_enable", false)) {
            as asVar = this.apu;
            if (asVar != null) {
                asVar.qb(0);
            }
            com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.hnj;
            if (orlVar != null && (dklVar2 = this.dkl) != null) {
                orlVar.hnj(dklVar2);
            }
            if (this.dkl == null || TextUtils.isEmpty(this.wu)) {
                com.bytedance.sdk.component.ojm.dkl dklVar3 = this.dkl;
                if (dklVar3 != null) {
                    vf.hnj(dklVar3);
                }
            } else {
                Bundle bundle = new Bundle();
                if (this.dkl.getWebView() != null) {
                    this.dkl.getWebView().saveState(bundle);
                }
                apu.hnj(System.identityHashCode(this.apu) + "_" + this.wu, this.dkl, bundle);
            }
            this.dkl = null;
        } else {
            com.bytedance.sdk.openadsdk.gjv.orl orlVar2 = this.hnj;
            if (orlVar2 != null && (dklVar = this.dkl) != null) {
                orlVar2.hnj(dklVar);
            }
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!com.bytedance.sdk.openadsdk.as.sk.hnj("lp_cache_enable", false)) {
            com.bytedance.sdk.component.ojm.dkl dklVar4 = this.dkl;
            if (dklVar4 != null) {
                vf.hnj(dklVar4);
            }
            this.dkl = null;
        }
        ua uaVar = this.uua;
        if (uaVar != null) {
            uaVar.bug();
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar3 = this.hnj;
        if (orlVar3 != null) {
            orlVar3.gjv(true);
        }
        if (!TextUtils.isEmpty(this.f19do)) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(this.nyv.get(), this.tgn.get(), this.apu);
        }
        com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.tu);
        mjg mjgVar = this.f13062gm;
        if (mjgVar != null) {
            mjgVar.qor();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        mjg mjgVar = this.f13062gm;
        if (mjgVar != null) {
            mjgVar.hn();
        }
        as asVar = this.apu;
        if (asVar != null) {
            asVar.dse(SystemClock.elapsedRealtime());
            this.apu.qb(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        as asVar = this.apu;
        if (asVar != null) {
            asVar.qb(1);
        }
        ua uaVar = this.uua;
        if (uaVar != null) {
            uaVar.dnm();
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.hnj;
        if (orlVar != null) {
            orlVar.dse();
        }
        mjg mjgVar = this.f13062gm;
        if (mjgVar != null) {
            mjgVar.hnj();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.gjv.hnj(this, this.apu);
        as asVar = this.apu;
        if (asVar != null) {
            asVar.qb(1);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        as asVar = this.apu;
        if (asVar != null) {
            asVar.qb(0);
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.hnj;
        if (orlVar != null) {
            orlVar.aq();
        }
    }

    private void aq() {
        com.bytedance.sdk.component.ojm.dkl dklVar = (com.bytedance.sdk.component.ojm.dkl) findViewById(jip.pv);
        this.dkl = dklVar;
        orp.hnj(this.apu, dklVar);
        this.bug = (fc) findViewById(jip.mkl);
        fc fcVar = (fc) findViewById(jip.f14673qb);
        bug bugVar = (bug) findViewById(520093721);
        this.pty = bugVar;
        if (bugVar != null) {
            bugVar.hnj(this.apu);
            this.pty.hnj();
        }
        if (fcVar != null) {
            fcVar.setVisibility(0);
        }
        if (this.dzo) {
            this.jbd = (ImageView) findViewById(jip.znr);
        } else {
            this.jbd = (ImageView) findViewById(520093720);
        }
        ImageView imageView = this.jbd;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.dkl != null) {
                        if (TTLandingPageActivity.this.f13067ul != null) {
                            TTLandingPageActivity.this.f13067ul.hnj();
                        }
                        if (!TTLandingPageActivity.this.dkl.ojm()) {
                            if (TTLandingPageActivity.this.dzo) {
                                return;
                            }
                            TTLandingPageActivity.this.finish();
                            return;
                        }
                        TTLandingPageActivity.this.dkl.ta();
                        if (TTLandingPageActivity.this.dzo) {
                            WebView webView = TTLandingPageActivity.this.dkl.getWebView();
                            if (TTLandingPageActivity.this.f13059cm == null || webView == null) {
                                return;
                            }
                            TTLandingPageActivity.this.f13059cm.hnj(webView, TTLandingPageActivity.this.f13067ul);
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(jip.rq);
        this.f13061ff = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.dkl == null || !TTLandingPageActivity.this.dkl.dnm()) {
                        return;
                    }
                    TTLandingPageActivity.this.dkl.bug();
                    if (TTLandingPageActivity.this.dzo) {
                        WebView webView = TTLandingPageActivity.this.dkl.getWebView();
                        if (TTLandingPageActivity.this.f13059cm == null || webView == null) {
                            return;
                        }
                        TTLandingPageActivity.this.f13059cm.hnj(webView, TTLandingPageActivity.this.f13067ul);
                    }
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.dse = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.aq = (TextView) findViewById(jip.f14656dl);
        com.bytedance.sdk.openadsdk.core.dkl.dkl dklVar2 = (com.bytedance.sdk.openadsdk.core.dkl.dkl) findViewById(jip.dy);
        this.mjg = dklVar2;
        if (dklVar2 != null) {
            dklVar2.setVisibility(0);
        }
        this.xad = (ImageView) findViewById(520093740);
        if (this.dzo) {
            final com.bytedance.sdk.openadsdk.common.apu apuVar = new com.bytedance.sdk.openadsdk.common.apu(this, false);
            ImageView imageView4 = this.xad;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        apuVar.setOnMenuItemClickListener(new com.bytedance.sdk.openadsdk.common.apu.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7.1
                            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
                            public void gjv() {
                                TTLandingPageActivity.this.qor();
                                apuVar.hnj();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
                            public void hn() {
                                ClipboardManager clipboardManager;
                                if (TTLandingPageActivity.this.dkl != null) {
                                    String url = TTLandingPageActivity.this.dkl.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                apuVar.hnj();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
                            public void hnj() {
                                com.bytedance.sdk.component.ojm.dkl dklVar3 = TTLandingPageActivity.this.dkl;
                                if (dklVar3 == null || dklVar3.getUrl() == null) {
                                    return;
                                }
                                if (TTLandingPageActivity.this.mjg != null) {
                                    TTLandingPageActivity.this.mjg.setVisibility(0);
                                    TTLandingPageActivity.this.mjg.setProgress(0);
                                }
                                dklVar3.dse();
                                String url = dklVar3.getUrl();
                                if (url != null) {
                                    dklVar3.a_(url);
                                }
                                apuVar.hnj();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.apu.hnj
                            public void qor() {
                                if (TTLandingPageActivity.this.dkl != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTLandingPageActivity.this.dkl.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        com.bytedance.sdk.component.utils.hn.hnj(TTLandingPageActivity.this, intent, null);
                                    }
                                    apuVar.hnj();
                                }
                            }
                        });
                        apuVar.hnj(view);
                    }
                });
            }
        }
        View viewFindViewById = findViewById(jip.f14689vh);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.qor();
                }
            });
        }
    }

    private void bug() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.uua.hnj("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private String dkl() {
        as asVar = this.apu;
        if (asVar != null && !TextUtils.isEmpty(asVar.cq())) {
            this.pv = this.apu.cq();
        }
        return this.pv;
    }

    private boolean dnm() {
        return !TextUtils.isEmpty(this.wu) && this.wu.contains("__luban_sdk");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fc() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.qor) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void gjv() {
        if (TextUtils.isEmpty(this.wu)) {
            return;
        }
        com.bytedance.sdk.openadsdk.oj.qor.hnj(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.15
            @Override // com.bytedance.sdk.openadsdk.oj.gjv
            public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                hnjVar.hn("lp_reuse");
                hnjVar.gjv(TTLandingPageActivity.this.f13069xn);
                hnjVar.hnj(BuildConfig.VERSION_NAME);
                return hnjVar;
            }
        });
        if (!this.sq) {
            this.sq = false;
            com.bytedance.sdk.openadsdk.jip.gjv.hnj(false);
            com.bytedance.sdk.openadsdk.oj.qor.qor(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.17
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("lp_reuse");
                    hnjVar.gjv(TTLandingPageActivity.this.f13069xn);
                    hnjVar.hnj(BuildConfig.VERSION_NAME);
                    return hnjVar;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.hnj;
            if (orlVar != null) {
                orlVar.sk(true);
                this.apu.xn(true);
            }
            com.bytedance.sdk.openadsdk.oj.qor.hn(new com.bytedance.sdk.openadsdk.oj.gjv() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.16
                @Override // com.bytedance.sdk.openadsdk.oj.gjv
                public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                    com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                    hnjVar.hn("lp_reuse");
                    hnjVar.gjv(TTLandingPageActivity.this.f13069xn);
                    hnjVar.hnj(BuildConfig.VERSION_NAME);
                    return hnjVar;
                }
            });
            com.bytedance.sdk.openadsdk.jip.gjv.hnj(true);
        }
    }

    private void hn(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.orl) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                if (TTLandingPageActivity.this.orl == null || TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTLandingPageActivity.this.orl.setText(str);
            }
        });
    }

    private void mjg() {
        TTAdDislikeToast tTAdDislikeToast = this.qor;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private void ojm() {
        ua uaVar = new ua(this);
        this.uua = uaVar;
        uaVar.hn(this.dkl).qor(this.f13060fc).gjv(this.jip).hnj(this.apu).hn(this.f13064oj).hnj(this.apu.af()).sk(this.apu.nl()).hnj(this.dkl).hn("landingpage");
    }

    private void orl() {
        try {
            if (this.f13063hn == null) {
                uua uuaVar = new uua(this.dnm, this.apu);
                this.f13063hn = uuaVar;
                uuaVar.setDislikeSource("landing_page");
                this.f13063hn.setCallback(new uua.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.10
                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hn(View view) {
                        TTLandingPageActivity.this.gjv.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hnj(View view) {
                        TTLandingPageActivity.this.gjv.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.uua.hnj
                    public void hnj(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.f13065sk.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.f13065sk.set(true);
                        TTLandingPageActivity.this.fc();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.f13063hn);
            if (this.qor == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.dnm);
                this.qor = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th2);
        }
    }

    private void sk() {
        as asVar = this.apu;
        if (asVar == null || asVar.rg() != 4) {
            return;
        }
        fc fcVar = this.bug;
        if (fcVar != null) {
            fcVar.setVisibility(0);
        }
        Button button = (Button) findViewById(jip.krm);
        this.orl = button;
        if (button != null) {
            hn(dkl());
            if (this.eum == null) {
                this.eum = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this, TextUtils.isEmpty(this.f13069xn) ? orp.hn(this.f13064oj) : this.f13069xn);
            }
            com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.qor.hnj(this, this.apu, this.f13069xn, this.f13064oj);
            hnjVar.hnj(false);
            this.orl.setOnClickListener(hnjVar);
            this.orl.setOnTouchListener(hnjVar);
            hnjVar.qor(true);
            hnjVar.hnj(this.eum);
        }
    }

    private void ta() {
        if (dnm() && !this.as.getAndSet(true)) {
            bug();
            hnj(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.qor("TTAD.LandingPageAct", "onBackPressed: ", th2.getMessage());
            }
        }
    }

    protected void qor() {
        if (isFinishing()) {
            return;
        }
        if (this.f13065sk.get()) {
            mjg();
            return;
        }
        if (this.f13063hn == null) {
            orl();
        }
        uua uuaVar = this.f13063hn;
        if (uuaVar != null) {
            uuaVar.hnj();
        }
    }

    private View hnj(String str) {
        Bundle bundleHnj;
        com.bytedance.sdk.component.ojm.dkl dklVar;
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(this);
        if (Build.VERSION.SDK_INT >= 35) {
            qorVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(this);
        skVar.setOrientation(1);
        qorVar.addView(skVar, new FrameLayout.LayoutParams(-1, -1));
        boolean zNyv = oj.gjv().nyv();
        this.dzo = zNyv;
        as asVar = this.apu;
        if (asVar != null && zNyv) {
            this.f13059cm = new orl(this, asVar, this.f13069xn, false);
        }
        View fcVar = new fc(this, new fc.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.18
            @Override // com.bytedance.sdk.openadsdk.common.fc.hnj
            public View hnj(Context context) {
                return (TTLandingPageActivity.this.apu == null || !TTLandingPageActivity.this.dzo) ? new ta(context) : TTLandingPageActivity.this.f13059cm.gjv();
            }
        });
        fcVar.setId(jip.f14673qb);
        skVar.addView(fcVar, new LinearLayout.LayoutParams(-1, this.dzo ? -2 : sq.hn(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        skVar.addView(qorVar2, layoutParams);
        if (!com.bytedance.sdk.openadsdk.as.sk.hnj("lp_cache_enable", false) || TextUtils.isEmpty(str)) {
            bundleHnj = null;
            dklVar = null;
        } else {
            String str2 = System.identityHashCode(this.apu) + "_" + str;
            dklVar = apu.hnj(this, str2);
            bundleHnj = apu.hnj(str2);
        }
        if (dklVar == null) {
            dklVar = new com.bytedance.sdk.component.ojm.dkl(this, com.bytedance.sdk.component.ojm.dkl.qor.LANDING_PAGE);
        } else {
            if (bundleHnj != null && dklVar.getWebView() != null) {
                dklVar.getWebView().restoreState(bundleHnj);
            }
            this.sq = true;
        }
        dklVar.setId(jip.pv);
        qorVar2.addView(dklVar, new FrameLayout.LayoutParams(-1, -1));
        fc fcVar2 = new fc(this, new fc.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.fc.hnj
            public View hnj(Context context) {
                return new com.bytedance.sdk.openadsdk.common.aq(context);
            }
        });
        fcVar2.setId(jip.mkl);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        qorVar2.addView(fcVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.dkl dklVar2 = new com.bytedance.sdk.openadsdk.core.dkl.dkl(this, null, R.style.Widget.ProgressBar.Horizontal);
        dklVar2.setId(jip.dy);
        dklVar2.setProgress(1);
        dklVar2.setVisibility(8);
        dklVar2.setProgressDrawable(dnm.hnj(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, sq.hn(this, 3.0f));
        layoutParams3.gravity = 49;
        qorVar2.addView(dklVar2, layoutParams3);
        bug bugVar = new bug(this);
        bugVar.setOnlyLoading(this.orp);
        bugVar.setId(520093721);
        qorVar.addView(bugVar, new FrameLayout.LayoutParams(-1, -1));
        return qorVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void hn() {
        ta();
    }

    private void hnj(final int i10) {
        if (this.dse == null || !dnm()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.9
            @Override // java.lang.Runnable
            public void run() {
                sq.hnj((View) TTLandingPageActivity.this.dse, i10);
            }
        });
    }
}
