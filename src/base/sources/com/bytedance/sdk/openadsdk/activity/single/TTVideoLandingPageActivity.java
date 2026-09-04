package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.sk.dnm;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.tgn;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.fc;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.jbd;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.gjv.bug;
import com.bytedance.sdk.openadsdk.gjv.orl;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.wu;
import com.bytedance.sdk.openadsdk.utils.xn;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.dnm.gjv {
    protected ua aq;
    protected TextView as;
    protected FrameLayout bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    protected String f13098cm;
    protected String dkl;
    protected int dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    protected com.bytedance.sdk.openadsdk.core.widget.hnj f22do;
    protected String dse;
    protected com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj dzo;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected long f13099fc;
    protected TextView gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected ImageView f13102hn;
    protected com.bytedance.sdk.component.ojm.dkl hnj;
    protected com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor hqh;
    protected orl jbd;
    protected as jip;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private int f13103ka;
    protected com.bytedance.sdk.openadsdk.core.mjg.hn.dkl mjg;
    protected int orp;
    protected String pty;
    protected ImageView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected Context f13105sk;
    protected com.bytedance.sdk.openadsdk.xn.qor.hnj sq;
    protected TextView tgn;
    protected TextView tu;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    protected Button f13108vf;
    protected RelativeLayout wu;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private ILoader f13110xo;
    protected fc xyo;
    private int zt;
    protected int orl = -1;
    protected int uua = 0;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected int f13104oj = 0;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected int f13109xn = 0;
    protected int apu = 0;
    protected String eum = "ダウンロード";
    protected boolean nyv = false;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    protected boolean f13101gm = false;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    protected boolean f13107ul = true;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    protected boolean f13106ua = false;
    protected String fvt = null;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    protected AtomicBoolean f13100ff = new AtomicBoolean(true);
    protected JSONArray xad = null;
    private final AtomicInteger lu = new AtomicInteger(0);
    private final AtomicInteger rmr = new AtomicInteger(0);
    private final AtomicInteger eta = new AtomicInteger(0);
    int pnz = -1;
    protected com.bytedance.sdk.openadsdk.core.qor.hnj pv = null;
    private final c.b izk = new c.b() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.11
        @Override // x6.c.b
        public void hnj(boolean z10) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.nyv = z10;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z10) {
                sq.hnj((View) TTVideoLandingPageActivity.this.hnj, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.bug.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.f13109xn;
                marginLayoutParams.height = tTVideoLandingPageActivity2.apu;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.f13104oj;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.uua;
                tTVideoLandingPageActivity2.bug.setLayoutParams(marginLayoutParams);
                return;
            }
            sq.hnj((View) TTVideoLandingPageActivity.this.hnj, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.bug.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.f13104oj = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.uua = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.f13109xn = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.apu = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.bug.setLayoutParams(marginLayoutParams2);
        }
    };
    private final tgn.hnj mkl = new tgn.hnj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.tgn.hnj
        public void hnj(Context context, Intent intent, boolean z10, final int i10) {
            com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    hnj(i10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hnj(int i10) {
            com.bytedance.sdk.component.ojm.dkl dklVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.orp == 0 && i10 != 0 && (dklVar = tTVideoLandingPageActivity.hnj) != null && (str = tTVideoLandingPageActivity.fvt) != null) {
                dklVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar2 = TTVideoLandingPageActivity.this.mjg;
            if (dklVar2 != null && dklVar2.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.f13101gm && tTVideoLandingPageActivity2.orp != i10) {
                    tTVideoLandingPageActivity2.mjg.getNativeVideoController().qor(i10);
                }
            }
            TTVideoLandingPageActivity.this.orp = i10;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj extends AsyncTask<Void, Void, Drawable> {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final WeakReference<x6.a> f13114hn;
        private final Bitmap hnj;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap bitmapHnj = com.bytedance.sdk.component.adexpress.gjv.hnj.hnj(oj.hnj(), this.hnj, 25);
                if (bitmapHnj == null) {
                    return null;
                }
                return new BitmapDrawable(oj.hnj().getResources(), bitmapHnj);
            } catch (Throwable th2) {
                apu.qor("TTVideoLandingPage", th2.getMessage());
                return null;
            }
        }

        private hnj(Bitmap bitmap, x6.a aVar) {
            this.hnj = bitmap;
            this.f13114hn = new WeakReference<>(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<x6.a> weakReference;
            if (drawable == null || (weakReference = this.f13114hn) == null || weakReference.get() == null) {
                return;
            }
            this.f13114hn.get().hnj(drawable);
        }
    }

    private boolean apu() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
        if (dklVar == null || dklVar.getNativeVideoController() == null) {
            return true;
        }
        return this.mjg.getNativeVideoController().orl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean eum() {
        return !TextUtils.isEmpty(this.fvt) && this.fvt.contains("__luban_sdk");
    }

    private void fc() {
        as asVar = this.jip;
        if (asVar == null || asVar.rg() != 4) {
            return;
        }
        this.xyo.setVisibility(0);
        Button button = (Button) findViewById(jip.krm);
        this.f13108vf = button;
        if (button != null) {
            hnj(gjv());
            this.f13108vf.setOnClickListener(this.pv);
            this.f13108vf.setOnTouchListener(this.pv);
        }
    }

    private void jip() {
        ua uaVar = new ua(this);
        this.aq = uaVar;
        uaVar.hn(this.hnj).qor(this.dkl).gjv(this.dse).hn(this.dnm).hnj(this.jip).hnj(this.jip.af()).hnj(this.hnj).hn("landingpage_split_screen").sk(this.jip.nl());
    }

    private void oj() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
        if (dklVar == null || dklVar.getNativeVideoController() == null || apu()) {
            return;
        }
        this.mjg.mjg();
    }

    private void uua() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar;
        if (this.nyv && (dklVar = this.mjg) != null && dklVar.getNativeVideoController() != null) {
            this.mjg.getNativeVideoController().sk(null, null);
            this.nyv = false;
        } else if (!eum() || this.f13100ff.getAndSet(true)) {
            super.onBackPressed();
        } else {
            wu();
            hnj(0);
        }
    }

    private void wu() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.aq.hnj("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void xn() {
        if (this.mjg == null || apu()) {
            return;
        }
        this.mjg.mjg();
    }

    protected abstract boolean aq();

    public void bug() {
        if (this.jip == null) {
            return;
        }
        this.hqh = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(this, this.pty);
        com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.qor.hnj(this, this.jip, this.pty, this.dnm);
        this.pv = hnjVar;
        hnjVar.hnj(false);
        this.pv.qor(true);
        this.tgn.setOnClickListener(this.pv);
        this.tgn.setOnTouchListener(this.pv);
        this.pv.hnj(this.hqh);
    }

    protected void dnm() {
        String strMw;
        as asVar = this.jip;
        if (asVar == null || asVar.rg() != 4) {
            return;
        }
        sq.hnj((View) this.wu, 0);
        if (!TextUtils.isEmpty(this.jip.kby())) {
            strMw = this.jip.kby();
        } else if (TextUtils.isEmpty(this.jip.br())) {
            strMw = !TextUtils.isEmpty(this.jip.mw()) ? this.jip.mw() : "";
        } else {
            strMw = this.jip.br();
        }
        if (this.jip.mn() != null && this.jip.mn().hnj() != null) {
            sq.hnj((View) this.f22do, 0);
            sq.hnj((View) this.as, 4);
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.jip.mn(), this.f22do, this.jip);
        } else if (!TextUtils.isEmpty(strMw)) {
            sq.hnj((View) this.f22do, 4);
            sq.hnj((View) this.as, 0);
            this.as.setText(strMw.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.jip.cq())) {
            this.tgn.setText(this.jip.cq());
        }
        if (!TextUtils.isEmpty(strMw)) {
            this.tu.setText(strMw);
        }
        sq.hnj((View) this.tu, 0);
        sq.hnj((View) this.tgn, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean hnj() {
        return true;
    }

    protected void mjg() {
        try {
            tgn.hnj(this.mkl);
        } catch (Exception unused) {
        }
    }

    protected long ojm() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
        if (dklVar == null || dklVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.mjg.getNativeVideoController().ojm();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        uua();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String strKby;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.fc.sk()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(C.DEFAULT_MUXED_BUFFER_SIZE);
        } catch (Throwable unused) {
        }
        try {
            oj.hn(this);
        } catch (Throwable unused2) {
        }
        this.orp = com.bytedance.sdk.component.utils.oj.qor(getApplicationContext());
        try {
            setContentView(qor());
            this.f13105sk = this;
            Intent intent = getIntent();
            this.f13106ua = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.f13099fc = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            as asVarHnj = hqh.hnj().hnj(hqh.hnj(intent));
            this.jip = asVarHnj;
            if (asVarHnj != null) {
                this.orl = asVarHnj.qri();
                this.dkl = this.jip.sp();
                this.dse = this.jip.ldn();
                strKby = this.jip.kby();
                this.f13098cm = this.jip.rx();
                this.fvt = this.jip.dnm();
                this.dnm = this.jip.orl();
                this.pty = this.jip.bug();
            } else {
                strKby = null;
            }
            String strHnj = strKby;
            if (this.jip == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.f13098cm)) {
                this.f13110xo = com.bytedance.sdk.openadsdk.dse.hn.hnj().hn();
                int iHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.f13110xo, this.f13098cm);
                this.zt = iHnj;
                this.f13103ka = iHnj > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.sq = com.bytedance.sdk.openadsdk.xn.qor.hnj.hnj(new JSONObject(stringExtra));
                } catch (Exception unused3) {
                }
                com.bytedance.sdk.openadsdk.xn.qor.hnj hnjVar = this.sq;
                if (hnjVar != null) {
                    this.f13099fc = hnjVar.dse;
                }
            }
            if (bundle != null) {
                this.jip = hqh.hnj().hnj(bundle.getInt("meta_index", -1));
                long j10 = bundle.getLong("video_play_position");
                if (j10 > 0) {
                    this.f13099fc = j10;
                }
            }
            sk();
            bug();
            jip();
            hnj(4);
            if (this.hnj != null) {
                com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(this.f13105sk).hnj(true).hn(false).hnj(this.hnj.getWebView());
                orl orlVarHn = new orl(this.jip, this.hnj.getWebView(), new bug() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.gjv.bug
                    public void hnj(int i10) {
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(TTVideoLandingPageActivity.this.zt, TTVideoLandingPageActivity.this.eta.get(), TTVideoLandingPageActivity.this.rmr.get(), TTVideoLandingPageActivity.this.lu.get() - TTVideoLandingPageActivity.this.rmr.get(), TTVideoLandingPageActivity.this.jip, "landingpage_split_screen", i10);
                    }
                }, this.f13103ka).hn(true);
                this.jbd = orlVarHn;
                this.dzo = orlVarHn.hnj;
                orlVarHn.hnj("landingpage_split_screen");
            }
            com.bytedance.sdk.component.ojm.dkl dklVar = this.hnj;
            if (dklVar != null) {
                dklVar.setLandingPage(true);
                this.hnj.setTag("landingpage_split_screen");
                this.hnj.setMaterialMeta(this.jip.pf());
                this.hnj.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.sk(this.f13105sk, this.aq, this.dkl, this.jbd, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.f13098cm)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.lu.incrementAndGet();
                            WebResourceResponseModel webResourceResponseModelHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(TTVideoLandingPageActivity.this.f13110xo, TTVideoLandingPageActivity.this.f13098cm, str);
                            if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.rmr.incrementAndGet();
                                return webResourceResponseModelHnj.getWebResourceResponse();
                            }
                            if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.eta.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th2) {
                            apu.hnj("TTVideoLandingPage", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.ojm.dkl dklVar2 = this.hnj;
                dklVar2.setUserAgentString(xn.hnj(dklVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.ojm.dkl dklVar3 = this.hnj;
            if (dklVar3 != null) {
                dklVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.jip, "landingpage_split_screen", this.f13103ka);
            wu.hnj(this.hnj, this.fvt);
            this.hnj.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(this.aq, this.jbd) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                }
            });
            this.hnj.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor qorVar = tTVideoLandingPageActivity.hqh;
                    if (qorVar != null) {
                        qorVar.hnj(tTVideoLandingPageActivity.jip);
                    }
                }
            });
            TextView textView = this.gjv;
            if (textView != null) {
                if (TextUtils.isEmpty(strHnj)) {
                    strHnj = com.bytedance.sdk.component.utils.wu.hnj(this, "tt_web_title_default");
                }
                textView.setText(strHnj);
            }
            orl();
            dkl();
            fc();
            com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(SystemClock.elapsedRealtime() - jElapsedRealtime, this.jip, "landingpage_split_screen", this.f13110xo, this.f13098cm);
        } catch (Throwable unused4) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        mjg();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.jip.mjg(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.ojm.dkl dklVar = this.hnj;
        if (dklVar != null) {
            jbd.hnj(dklVar.getWebView());
        }
        this.hnj = null;
        ua uaVar = this.aq;
        if (uaVar != null) {
            uaVar.bug();
        }
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar2 = this.mjg;
        if (dklVar2 != null && dklVar2.getNativeVideoController() != null) {
            this.mjg.getNativeVideoController().sk();
        }
        this.mjg = null;
        this.jip = null;
        orl orlVar = this.jbd;
        if (orlVar != null) {
            orlVar.gjv(true);
        }
        if (!TextUtils.isEmpty(this.f13098cm)) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(this.rmr.get(), this.lu.get(), this.jip);
        }
        com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.f13110xo);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        xn();
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
        if (dklVar == null || dklVar.getNativeVideoController() == null) {
            return;
        }
        hnj(this.mjg.getNativeVideoController());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.f13107ul) {
            oj();
        }
        this.f13107ul = false;
        ua uaVar = this.aq;
        if (uaVar != null) {
            uaVar.dnm();
        }
        orl orlVar = this.jbd;
        if (orlVar != null) {
            orlVar.dse();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iHnj = this.jip != null ? hqh.hnj().hnj(this.jip) : -1;
        this.pnz = iHnj;
        bundle.putInt("meta_index", iHnj);
        bundle.putLong("video_play_position", this.f13099fc);
        bundle.putBoolean("is_complete", this.f13101gm);
        long jDkl = this.f13099fc;
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
        if (dklVar != null && dklVar.getNativeVideoController() != null) {
            jDkl = this.mjg.getNativeVideoController().dkl();
        }
        bundle.putLong("video_play_position", jDkl);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.pnz >= 0) {
            hqh.hnj().qor(this.pnz);
            this.pnz = -1;
        }
        com.bytedance.sdk.openadsdk.utils.gjv.hnj(this, this.jip);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        orl orlVar = this.jbd;
        if (orlVar != null) {
            orlVar.aq();
        }
    }

    protected void orl() {
        tgn.hnj(this.mkl, this.f13105sk);
    }

    protected abstract View qor();

    protected int ta() {
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
        if (dklVar == null || dklVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.mjg.getNativeVideoController().ta();
    }

    protected void dkl() {
        if (aq()) {
            try {
                com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = new com.bytedance.sdk.openadsdk.core.mjg.hn.dkl(this.f13105sk, this.jip, true, null);
                this.mjg = dklVar;
                if (dklVar.getNativeVideoController() != null) {
                    this.mjg.getNativeVideoController().hnj(false);
                }
                if (this.f13101gm) {
                    this.bug.setVisibility(0);
                    this.bug.removeAllViews();
                    this.bug.addView(this.mjg);
                    this.mjg.hn(true);
                } else {
                    if (!this.f13106ua) {
                        this.f13099fc = 0L;
                    }
                    if (this.sq != null && this.mjg.getNativeVideoController() != null) {
                        this.mjg.getNativeVideoController().qor(this.sq.dse);
                        this.mjg.getNativeVideoController().gjv(this.sq.f14813sk);
                        this.mjg.hnj(oj.gjv().qor(String.valueOf(this.jip.atw())), "landingPageInit");
                    }
                    if (this.mjg.hnj(this.f13099fc, this.f13107ul, this.f13101gm)) {
                        this.bug.setVisibility(0);
                        this.bug.removeAllViews();
                        this.bug.addView(this.mjg);
                    }
                    if (this.mjg.getNativeVideoController() != null) {
                        this.mjg.getNativeVideoController().hnj(false);
                        this.mjg.getNativeVideoController().hnj(this.izk);
                    }
                }
                String strHnj = this.jip.lx().get(0).hnj();
                com.bytedance.sdk.openadsdk.ta.gjv.hnj().hnj(strHnj).hnj(this.jip.lx().get(0).hn()).hn(this.jip.lx().get(0).qor()).sk(sq.sk(oj.hnj())).gjv(sq.qor(oj.hnj())).qor(2).hnj(new com.bytedance.sdk.openadsdk.ta.hn(this.jip, strHnj, new com.bytedance.sdk.component.sk.jip() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.sk.jip
                    public void hnj(int i10, String str, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.sk.jip
                    public void hnj(dnm dnmVar) {
                        try {
                            Object objHn = dnmVar.hn();
                            if (objHn instanceof Bitmap) {
                                new hnj((Bitmap) objHn, TTVideoLandingPageActivity.this.mjg.getNativeVideoController().bug()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.mjg.findViewById(520093726).setOnTouchListener(null);
                this.mjg.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e10) {
                apu.qor("TTVideoLandingPage", e10.getMessage());
                if (this.mjg == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e10);
                }
            }
            if (this.orp == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.wu.hnj(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    protected String gjv() {
        as asVar = this.jip;
        if (asVar != null && !TextUtils.isEmpty(asVar.cq())) {
            this.eum = this.jip.cq();
        }
        return this.eum;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void hn() {
        uua();
    }

    protected void sk() {
        this.xyo = (fc) findViewById(jip.mkl);
        this.hnj = (com.bytedance.sdk.component.ojm.dkl) findViewById(jip.pv);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.f13102hn = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObjectHnj;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.hnj != null) {
                        com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj hnjVar = tTVideoLandingPageActivity.dzo;
                        if (hnjVar != null) {
                            hnjVar.hnj();
                        }
                        if (TTVideoLandingPageActivity.this.hnj.ojm()) {
                            TTVideoLandingPageActivity.this.hnj.ta();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.eum()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = TTVideoLandingPageActivity.this.mjg;
                        if (dklVar == null || dklVar.getNativeVideoController() == null) {
                            jSONObjectHnj = null;
                        } else {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectHnj = orp.hnj(tTVideoLandingPageActivity2.jip, tTVideoLandingPageActivity2.mjg.getNativeVideoController().dse(), TTVideoLandingPageActivity.this.mjg.getNativeVideoController().dnm());
                        }
                        JSONObject jSONObject = jSONObjectHnj;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(tTVideoLandingPageActivity3.jip, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.ojm(), TTVideoLandingPageActivity.this.ta(), jSONObject, (com.bytedance.sdk.openadsdk.gjv.dse) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar = this.mjg;
        if (dklVar != null) {
            dklVar.setIsAutoPlay(this.f13106ua);
        }
        ImageView imageView2 = (ImageView) findViewById(jip.jbd);
        this.qor = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObjectHnj;
                    com.bytedance.sdk.openadsdk.core.mjg.hn.dkl dklVar2 = TTVideoLandingPageActivity.this.mjg;
                    if (dklVar2 != null) {
                        if (dklVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectHnj = orp.hnj(tTVideoLandingPageActivity.jip, tTVideoLandingPageActivity.mjg.getNativeVideoController().dse(), TTVideoLandingPageActivity.this.mjg.getNativeVideoController().dnm());
                        } else {
                            jSONObjectHnj = null;
                        }
                        JSONObject jSONObject = jSONObjectHnj;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(tTVideoLandingPageActivity2.jip, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.ojm(), TTVideoLandingPageActivity.this.ta(), jSONObject, (com.bytedance.sdk.openadsdk.gjv.dse) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.gjv = (TextView) findViewById(jip.f14656dl);
        this.bug = (FrameLayout) findViewById(jip.sq);
        this.wu = (RelativeLayout) findViewById(jip.f14658ff);
        this.as = (TextView) findViewById(jip.f14654cm);
        this.tu = (TextView) findViewById(jip.dzo);
        this.tgn = (TextView) findViewById(jip.pnz);
        this.f22do = (com.bytedance.sdk.openadsdk.core.widget.hnj) findViewById(jip.xad);
        dnm();
    }

    private void hnj(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f13108vf) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.f13108vf == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.f13108vf.setText(str);
            }
        });
    }

    private void hnj(c cVar) {
        this.f13101gm = this.f13101gm || cVar.orl();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.f13101gm));
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(cVar.dkl()));
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(cVar.ojm() + cVar.dse()));
        com.bytedance.sdk.openadsdk.xn.gjv.hnj.hnj("sp_multi_native_video_data", "key_video_duration", Long.valueOf(cVar.ojm()));
    }

    private void hnj(final int i10) {
        if (this.qor == null || !eum()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                sq.hnj((View) TTVideoLandingPageActivity.this.qor, i10);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dnm.gjv
    public void hnj(boolean z10, JSONArray jSONArray) {
        if (!z10 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.xad = jSONArray;
    }
}
