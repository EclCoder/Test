package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b6.b;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.jbd;
import com.bytedance.sdk.openadsdk.core.ua;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu implements Handler.Callback {
    private com.bytedance.sdk.openadsdk.core.widget.uua apu;
    FrameLayout aq;
    private com.bytedance.sdk.component.ojm.dkl as;
    c.InterfaceC0870c bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.hnj.sk f13855cm;
    RelativeLayout dkl;
    ObjectAnimator dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private FrameLayout f40do;
    final as dse;
    private LinearLayout.LayoutParams dy;
    private String dzo;
    private int eta;
    private TextView eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private Handler f13856fc;
    private com.bytedance.sdk.openadsdk.core.widget.uua fr;
    private int fvt;
    FrameLayout gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private String f13858gm;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.aq f13859gn;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    FrameLayout f13860hn;
    ImageView hnj;
    private long hqh;
    private com.bytedance.sdk.openadsdk.core.ojm.apu izk;
    private boolean jbd;
    private View jip;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.gjv f13862ka;
    com.bytedance.sdk.openadsdk.core.qor.hn mjg;
    private FrameLayout mkl;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private TextView f13863oj;
    ObjectAnimator ojm;
    com.bytedance.sdk.openadsdk.core.qor.hnj orl;
    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor orp;
    private ILoader pnz;
    private final Activity pty;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private AtomicBoolean f13864qb;
    TextView qor;
    private int rmr;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    View f13865sk;
    private com.bytedance.sdk.openadsdk.gjv.orl sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    ValueAnimator f13866ta;
    private View tgn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private ValueAnimator f13867th;
    private hn tll;
    private com.bytedance.sdk.openadsdk.common.bug tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private final View f13868ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.mjg.gjv.hn f13869ul;
    private View uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private View f13870vf;
    private ua wu;
    private boolean xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private TextView f13871xn;
    private ImageView xyo;
    private final boolean znr;
    private com.bytedance.sdk.openadsdk.common.sk zt;
    private final AtomicBoolean nyv = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private final AtomicBoolean f13857ff = new AtomicBoolean(false);
    private volatile int pv = 0;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private volatile int f13872xo = 0;
    private volatile int lu = 0;
    private float lhi = -1.0f;
    private final AtomicBoolean idl = new AtomicBoolean(false);
    private long hkr = -1;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    private final AtomicBoolean f13861jo = new AtomicBoolean(false);
    private long fzb = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn implements com.bytedance.sdk.openadsdk.gjv.bug {
        private final WeakReference<apu> gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final as f13877hn;
        private final int hnj;
        private final String qor;

        public hn(int i10, as asVar, String str, apu apuVar) {
            this.hnj = i10;
            this.f13877hn = asVar;
            this.qor = str;
            this.gjv = new WeakReference<>(apuVar);
        }

        @Override // com.bytedance.sdk.openadsdk.gjv.bug
        public void hnj(int i10) {
            apu apuVar = this.gjv.get();
            if (apuVar != null) {
                com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(this.hnj, apuVar.lu, apuVar.f13872xo, apuVar.pv - apuVar.f13872xo, this.f13877hn, this.qor, i10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements com.bytedance.sdk.component.sk.aq {
        @Override // com.bytedance.sdk.component.sk.aq
        public Bitmap hnj(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.gjv.hnj.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), bitmap, 25);
        }
    }

    public apu(Activity activity, final as asVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar, View view) {
        this.pty = activity;
        this.dse = asVar;
        this.f13858gm = str;
        this.f13869ul = hnVar;
        this.f13868ua = view;
        this.fvt = orp.hnj(str);
        if (asVar != null) {
            this.dzo = asVar.rx();
        }
        this.znr = asVar.dzo() && sk(asVar);
        if (!TextUtils.isEmpty(this.dzo)) {
            this.pnz = com.bytedance.sdk.openadsdk.dse.hn.hnj().hn();
            int iHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.pnz, this.dzo);
            this.rmr = iHnj;
            this.eta = iHnj > 0 ? 2 : 0;
        }
        boolean zGjv = gjv(asVar);
        boolean zDse = dse(asVar);
        boolean zHn = hn(asVar);
        if (zHn) {
            this.f13858gm = "landingpage_split_screen";
        } else if (zGjv) {
            this.f13858gm = "landingpage_direct";
        } else if (zDse) {
            this.f13858gm = "aggregate_page";
        } else if (qor(asVar)) {
            this.f13858gm = "landingpage_split_ceiling";
        }
        this.orl = new com.bytedance.sdk.openadsdk.core.qor.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), asVar, this.f13858gm, orp.hnj(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.orl.hnj(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.orl.hn(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.qor.hn hnVar2 = new com.bytedance.sdk.openadsdk.core.qor.hn(activity, asVar, this.f13858gm, orp.hnj(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.apu.1
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn
            public boolean hnj(bug bugVar, Map<String, Object> map2) {
                if (apu.ta(asVar) && apu.this.f13855cm != null) {
                    apu.this.f13855cm.hnj(bugVar);
                    apu.this.f13855cm.hnj(map2);
                    if (apu.ojm(apu.this.dse) || apu.this.xad) {
                        return true;
                    }
                }
                return super.hnj(bugVar, map2);
            }
        };
        this.mjg = hnVar2;
        hnVar2.hnj(map);
        this.mjg.hn(viewFindViewById);
        this.aq = frameLayout;
        if (zHn || zGjv || zDse) {
            try {
                this.f13856fc = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e10) {
                Log.e("LandingPageModel", "LandingPageModel: ", e10);
                return;
            }
        }
        if (asVar.dzo()) {
            return;
        }
        if (zGjv || zDse) {
            Handler handler = this.f13856fc;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    static /* synthetic */ int bug(apu apuVar) {
        int i10 = apuVar.pv;
        apuVar.pv = i10 + 1;
        return i10;
    }

    static /* synthetic */ int fc(apu apuVar) {
        int i10 = apuVar.lu;
        apuVar.lu = i10 + 1;
        return i10;
    }

    static /* synthetic */ int mjg(apu apuVar) {
        int i10 = apuVar.f13872xo;
        apuVar.f13872xo = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qor(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long jGjv;
        as asVar;
        as asVar2;
        int i10 = message.what;
        if (i10 == 100) {
            int i11 = message.arg1;
            if (!gjv(this.dse) || (asVar2 = this.dse) == null || asVar2.m31do() == null) {
                jGjv = (!dse(this.dse) || (asVar = this.dse) == null || asVar.m31do() == null) ? 20L : this.dse.m31do().gjv();
            } else {
                jGjv = this.dse.m31do().hn();
            }
            c.InterfaceC0870c interfaceC0870c = this.bug;
            if (interfaceC0870c != null) {
                interfaceC0870c.hnj(((long) i11) * 1000, jGjv * 1000);
            }
            long j10 = i11;
            if (j10 >= jGjv) {
                c.InterfaceC0870c interfaceC0870c2 = this.bug;
                if (interfaceC0870c2 != null) {
                    interfaceC0870c2.hnj(jGjv * 1000, 100);
                }
            } else if (j10 < jGjv && this.f13856fc != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i11 + 1;
                this.f13856fc.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (i10 == 101) {
            ta();
        }
        return true;
    }

    private void apu() {
        com.bytedance.sdk.component.ojm.dkl dklVar = this.as;
        if (dklVar == null || dklVar.getWebView() == null) {
            return;
        }
        this.pv = this.as.hnj;
        this.f13872xo = this.as.f12913hn;
        this.lu = this.as.qor;
        if (this.as.hn()) {
            this.f13869ul.fr();
            this.hqh = System.currentTimeMillis();
        }
        if (this.as.gjv()) {
            orl();
        }
        if (this.as.qor()) {
            orl();
            int iHnj = orp.hnj(this.as.getWebView());
            hn hnVar = this.tll;
            if (hnVar != null) {
                hnVar.hnj(iHnj != 1 ? 0 : 1);
            }
        }
    }

    public static boolean aq(as asVar) {
        return gjv(asVar) && !dnm(asVar);
    }

    private void bug() {
        ua uaVar = new ua(this.pty);
        this.wu = uaVar;
        uaVar.hnj(this.f13869ul);
        this.wu.hn(this.as).hnj(com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(this.dse)).qor(this.dse.sp()).gjv(this.dse.ldn()).hnj(this.dse).hn(dse(this.dse) ? this.fvt : -1).hnj(this.dse.af()).hn(this.f13858gm).sk(this.dse.nl()).hnj(this.as).hnj(new com.bytedance.sdk.openadsdk.core.widget.sk() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.sk
            public void hnj() {
                if (apu.dse(apu.this.dse) && (apu.this.pty instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hn)) {
                    ((com.bytedance.sdk.openadsdk.core.mjg.gjv.hn) apu.this.pty).ul();
                } else if (apu.this.f13855cm != null) {
                    apu.this.f13855cm.qor();
                }
            }
        });
    }

    public static boolean dkl(as asVar) {
        tgn tgnVarJlw;
        return (asVar == null || (tgnVarJlw = asVar.jlw()) == null || tgnVarJlw.hnj() != 2) ? false : true;
    }

    private void dnm() {
        apu apuVar;
        com.bytedance.sdk.component.ojm.dkl dklVar = this.as;
        if (dklVar == null || dklVar.getWebView() == null) {
            apuVar = this;
        } else {
            com.bytedance.sdk.openadsdk.core.widget.hnj.qor.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj()).hnj(false).hn(false).hnj(this.as.getWebView());
            com.bytedance.sdk.component.ojm.dkl dklVar2 = this.as;
            if (dklVar2 != null && dklVar2.getWebView() != null) {
                this.tll = new hn(this.rmr, this.dse, this.f13858gm, this);
                if (this.as.k_() && (this.as.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.hnj.sk)) {
                    com.bytedance.sdk.openadsdk.gjv.orl orlVarHn = ((com.bytedance.sdk.openadsdk.core.widget.hnj.sk) this.as.getWebViewClient()).hn();
                    this.sq = orlVarHn;
                    if (orlVarHn != null) {
                        orlVarHn.hnj(this.tll);
                        this.sq.hn(true);
                    }
                } else {
                    this.sq = new com.bytedance.sdk.openadsdk.gjv.orl(this.dse, this.as.getWebView(), this.tll, this.eta).hn(true);
                }
                this.sq.hnj(this.f13858gm);
                com.bytedance.sdk.openadsdk.common.sk skVarHnj = orp.hnj(this.dse, this.as, this.pty, this.f13858gm);
                this.zt = skVarHnj;
                if (skVarHnj != null) {
                    skVarHnj.hnj(this.f13858gm);
                }
                orp.hnj(this.dse, this.as);
            }
            bug();
            if (this.as.k_()) {
                apu();
            }
            this.as.setLandingPage(true);
            this.as.setTag(this.f13858gm);
            this.as.setMaterialMeta(this.dse.pf());
            apuVar = this;
            com.bytedance.sdk.openadsdk.core.widget.hnj.sk skVar = new com.bytedance.sdk.openadsdk.core.widget.hnj.sk(com.bytedance.sdk.openadsdk.core.oj.hnj(), this.wu, this.dse.sp(), this.zt, this.sq, true) { // from class: com.bytedance.sdk.openadsdk.core.model.apu.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    apu.this.orl();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    apu.this.f13869ul.fr();
                    apu.this.hqh = System.currentTimeMillis();
                    if (!apu.hn(apu.this.dse) || apu.this.f13856fc == null || as.sk(apu.this.dse)) {
                        return;
                    }
                    apu.this.f13856fc.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str, String str2) {
                    super.onReceivedError(webView, i10, str, str2);
                    String strGjv = com.bytedance.sdk.openadsdk.core.widget.hnj.sk.gjv(str2);
                    boolean z10 = false;
                    if (this.dkl != null) {
                        this.dkl.hnj(webView, i10, str, str2, com.bytedance.sdk.openadsdk.core.widget.hnj.sk.gjv(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z11 = strGjv != null && strGjv.startsWith("image");
                    if (strGjv != null && strGjv.startsWith("mp4")) {
                        z10 = true;
                    }
                    if (z11 || z10 || apu.this.nyv.get()) {
                        return;
                    }
                    apu.this.fc();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        apu.this.fc();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(apu.this.dzo)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        apu.bug(apu.this);
                        WebResourceResponseModel webResourceResponseModelHnj = com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(apu.this.pnz, apu.this.dzo, str);
                        if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getWebResourceResponse() != null) {
                            apu.mjg(apu.this);
                            return webResourceResponseModelHnj.getWebResourceResponse();
                        }
                        if (webResourceResponseModelHnj != null && webResourceResponseModelHnj.getMsg() == 2) {
                            apu.fc(apu.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.apu.hnj("LandingPageModel", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.sk, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!apu.qor(apu.this.dse) || orp.hnj(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(apu.this.pty, (Class<?>) TTCeilingLandingPageActivity.class);
                    apu.this.dse.sk(str);
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.hqh.hnj().hnj(apu.this.dse));
                    com.bytedance.sdk.component.utils.hn.hnj(this.gjv, intent, null);
                    return true;
                }
            };
            apuVar.f13855cm = skVar;
            apuVar.as.setWebViewClient(skVar);
            apuVar.f13855cm.hnj(apuVar.dse);
            apuVar.f13855cm.hnj(apuVar.f13858gm);
            apuVar.f13855cm.hnj(apuVar.f13869ul);
            apuVar.as.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.hnj.gjv(apuVar.wu, apuVar.sq, apuVar.zt) { // from class: com.bytedance.sdk.openadsdk.core.model.apu.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.gjv, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (apu.this.pty != null && !apu.this.pty.isFinishing() && i10 == 100) {
                        apu.this.orl();
                    }
                    if (apu.this.tu != null) {
                        apu.this.tu.hnj(i10);
                    }
                }
            });
            if (apuVar.orp == null) {
                apuVar.orp = com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), apuVar.f13858gm);
            }
            apuVar.as.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                    if (apu.this.orp != null) {
                        apu.this.orp.hnj(apu.this.dse);
                    }
                }
            });
            com.bytedance.sdk.component.ojm.dkl dklVar3 = apuVar.as;
            dklVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xn.hnj(dklVar3.getWebView(), BuildConfig.VERSION_CODE));
            apuVar.as.setMixedContentMode(0);
            apuVar.as.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    if (apu.this.sq != null) {
                        apu.this.sq.hn(i11);
                    }
                }
            });
            apuVar.as.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (apu.this.ojm()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            apu.this.lhi = motionEvent.getY();
                        } else if (action == 1) {
                            if (sq.hnj(apu.this.lhi, motionEvent.getY(), apu.this.pty)) {
                                apu.this.hn(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (apu.this.znr && motionEvent.getAction() == 1 && apu.this.f13869ul != null) {
                        apu.this.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                apu.this.f13869ul.izk();
                            }
                        });
                    }
                    if ((!apu.this.xad || apu.ta(apu.this.dse)) && !apu.dse(apu.this.dse)) {
                        apu.this.mjg.onTouch(view, motionEvent);
                    }
                    if ((!apu.this.xad || apu.ta(apu.this.dse)) && !apu.dse(apu.this.dse) && motionEvent.getAction() == 1 && apu.this.mjg.dkl()) {
                        apu.this.as.getWebView().performClick();
                        apu.this.xad = true;
                    }
                    if (apu.this.sq != null) {
                        apu.this.sq.hnj(motionEvent);
                    }
                    if (apu.this.zt == null) {
                        return false;
                    }
                    apu.this.zt.hnj(motionEvent);
                    return false;
                }
            });
            apuVar.as.getWebView().setOnClickListener(apuVar.mjg);
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(apuVar.dse, apuVar.f13858gm, apuVar.eta);
            if (!apuVar.as.k_()) {
                com.bytedance.sdk.component.utils.apu.hnj("LandingPageModel", "loadUrlWithRefer url  = " + apuVar.dse.xe());
                com.bytedance.sdk.openadsdk.utils.wu.hnj(apuVar.as, apuVar.dse.xe());
            }
            apuVar.jbd = true;
        }
        com.bytedance.sdk.component.ojm.dkl dklVar4 = apuVar.as;
        if (dklVar4 == null || apuVar.tu == null || dklVar4.qor()) {
            return;
        }
        apuVar.tu.hnj();
    }

    public static boolean dse(as asVar) {
        return asVar != null && asVar.qb() == 33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fc() {
        LinearLayout.LayoutParams layoutParams;
        if (this.nyv.get()) {
            return;
        }
        jip();
        this.f13857ff.set(true);
        hnj(-1);
        this.f13869ul.bug();
        com.bytedance.sdk.openadsdk.common.bug bugVar = this.tu;
        if (bugVar != null) {
            bugVar.hn();
        }
        if (dse(this.dse)) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), this.dse, this.f13858gm, "show_agg_backup");
            View view = this.uua;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.uua.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.uua.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.dkl;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.jip.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.jip.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.jip.setLayoutParams(layoutParams3);
        if (this.dse.mn() != null && !TextUtils.isEmpty(this.dse.mn().hnj())) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.dse.mn().hnj(), this.dse.mn().hn(), this.dse.mn().qor(), this.apu, this.dse);
        }
        this.f13863oj.setText(this.dse.mw());
        this.f13871xn.setText(this.dse.br());
        if (this.eum != null) {
            hn();
            this.eum.setClickable(true);
            this.eum.setOnClickListener(this.orl);
            this.eum.setOnTouchListener(this.orl);
        }
        if (!qor(this.dse) || (layoutParams = this.dy) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            gjv(8);
        } else {
            gjv(0);
        }
    }

    private void jip() {
        if ((gjv(this.dse) || dse(this.dse)) && (this.pty instanceof com.bytedance.sdk.openadsdk.core.mjg.gjv.hn)) {
            this.f13869ul.fr();
            this.f13869ul.uua();
        }
    }

    private void mjg() {
        this.dkl.setVisibility(8);
        if (gjv(this.dse) || dse(this.dse) || !gjv() || qor(this.dse)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.dnm = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.dnm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) apu.this.f40do.getLayoutParams();
                layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                apu.this.hnj((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                apu.this.f40do.setLayoutParams(layoutParams);
            }
        });
        this.dnm.start();
    }

    private void oj() {
        if (gjv()) {
            this.tgn.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.xyo, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.ojm = duration;
            duration.setRepeatMode(2);
            this.ojm.setRepeatCount(-1);
            this.ojm.start();
            this.tgn.setClickable(true);
            this.tgn.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!apu.this.xad) {
                        apu.this.mjg.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    apu.this.f13866ta = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    apu.this.f13866ta.setDuration(200L);
                    apu.this.f13866ta.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) apu.this.f40do.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            apu.this.hnj((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            apu.this.f40do.setLayoutParams(layoutParams);
                        }
                    });
                    if (apu.this.mjg.dkl()) {
                        apu.this.tgn.performClick();
                        apu.this.xad = true;
                    }
                    apu.this.f13866ta.start();
                    apu.this.tgn.setVisibility(8);
                    return true;
                }
            });
            this.tgn.setOnClickListener(this.mjg);
        }
        if (!xn()) {
            this.aq.setVisibility(8);
            this.f13860hn.setVisibility(0);
            this.hnj.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.hnj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    apu apuVar = apu.this;
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(apuVar.dse, apuVar.f13858gm);
                }
            });
            as asVar = this.dse;
            if (asVar != null && asVar.lx() != null && this.dse.lx().size() > 0 && this.dse.lx().get(0) != null && !TextUtils.isEmpty(this.dse.lx().get(0).hnj())) {
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.dse.lx().get(0), this.hnj, this.dse, new com.bytedance.sdk.component.sk.jip() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.7
                    @Override // com.bytedance.sdk.component.sk.jip
                    public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
                        if (apu.this.f13856fc != null) {
                            apu.this.f13856fc.removeMessages(101);
                        }
                    }

                    @Override // com.bytedance.sdk.component.sk.jip
                    public void hnj(int i10, String str, Throwable th2) {
                        if (apu.this.f13856fc != null) {
                            apu.this.f13856fc.removeMessages(101);
                        }
                        apu.this.ta();
                    }
                });
            }
        }
        try {
            String strHnj = this.dse.lx().get(0).hnj();
            com.bytedance.sdk.openadsdk.ta.gjv.hnj().hnj(strHnj).hnj(this.dse.lx().get(0).hn()).hn(this.dse.lx().get(0).qor()).sk(sq.sk(com.bytedance.sdk.openadsdk.core.oj.hnj())).gjv(sq.qor(com.bytedance.sdk.openadsdk.core.oj.hnj())).qor(1).hnj(new hnj()).hnj(new com.bytedance.sdk.openadsdk.ta.hn(this.dse, strHnj, new com.bytedance.sdk.component.sk.jip() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.8
                @Override // com.bytedance.sdk.component.sk.jip
                public void hnj(int i10, String str, Throwable th2) {
                }

                @Override // com.bytedance.sdk.component.sk.jip
                public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
                    Drawable bitmapDrawable;
                    try {
                        Object objHn = dnmVar.hn();
                        if (objHn != null && dnmVar.qor() != null) {
                            if (objHn instanceof Bitmap) {
                                bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.oj.hnj().getResources(), (Bitmap) objHn);
                            } else if (objHn instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && b6.a.a(objHn)) {
                                    b.a(objHn).start();
                                }
                                bitmapDrawable = (Drawable) objHn;
                            } else {
                                bitmapDrawable = null;
                            }
                            if (!apu.this.xn()) {
                                apu.this.f13860hn.setBackground(bitmapDrawable);
                                return;
                            }
                            apu.this.gjv.setBackground(bitmapDrawable);
                            View viewJip = apu.this.f13869ul.jip();
                            if (viewJip == null || !(viewJip.getParent() instanceof View)) {
                                return;
                            }
                            ((View) viewJip.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    public static boolean ojm(as asVar) {
        return (asVar == null || asVar.uql() == 1 || !ta(asVar)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void orl() {
        this.nyv.get();
        this.f13857ff.get();
        if (this.nyv.get() || this.f13857ff.get()) {
            return;
        }
        this.nyv.set(true);
        hnj(0);
        long jElapsedRealtime = this.hkr == -1 ? 0L : SystemClock.elapsedRealtime() - this.hkr;
        if (qor(this.dse)) {
            com.bytedance.sdk.openadsdk.gjv.qor.qor(this.dse, this.f13858gm, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.dse, this.f13858gm, System.currentTimeMillis() - this.hqh, true);
        mjg();
    }

    public static boolean sk(as asVar) {
        tgn tgnVarJlw;
        return asVar != null && asVar.rg() == 3 && !hqh.hn(asVar) && (asVar.m34if() == 0.0f || asVar.m34if() == 100.0f) && (tgnVarJlw = asVar.jlw()) != null && tgnVarJlw.hnj() == 1;
    }

    public static boolean ta(as asVar) {
        if (asVar != null) {
            return asVar.qb() == 19 || asVar.qb() == 20;
        }
        return false;
    }

    private void uua() {
        com.bytedance.sdk.openadsdk.common.dnm loadingStyle;
        com.bytedance.sdk.openadsdk.common.bug bugVar = this.tu;
        if (bugVar != null && (loadingStyle = bugVar.getLoadingStyle()) != null) {
            this.fr = loadingStyle.hn();
            this.f13859gn = loadingStyle.qor();
        }
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = this.f13862ka;
        if (gjvVar != null) {
            gjvVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (apu.this.f13862ka.getTag() != null) {
                        if (apu.this.f13862ka.getTag().equals(1)) {
                            apu.this.hn(3);
                        } else if (apu.this.f13862ka.getTag().equals(2)) {
                            apu.this.hn(4);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean xn() {
        return as.sk(this.dse);
    }

    public boolean gjv() {
        return this.dse.qri() == 15 || this.dse.qri() == 16;
    }

    public void aq() {
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.sq;
        if (orlVar != null) {
            orlVar.aq();
        }
    }

    public void dse() {
        ua uaVar = this.wu;
        if (uaVar != null) {
            uaVar.dnm();
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.sq;
        if (orlVar != null) {
            orlVar.dse();
        }
    }

    protected void hn() {
        as asVar = this.dse;
        if (asVar == null || TextUtils.isEmpty(asVar.cq())) {
            return;
        }
        this.eum.setText(this.dse.cq());
    }

    public void qor() {
        if (xn()) {
            try {
                String strJ = this.dse.pwt().J();
                com.bytedance.sdk.openadsdk.ta.gjv.hnj().hnj(strJ).hnj(this.dse.pwt().D()).hn(this.dse.pwt().p()).sk(sq.sk(com.bytedance.sdk.openadsdk.core.oj.hnj())).gjv(sq.qor(com.bytedance.sdk.openadsdk.core.oj.hnj())).qor(2).hnj(new hnj()).hnj(new com.bytedance.sdk.openadsdk.ta.hn(this.dse, strJ, new com.bytedance.sdk.component.sk.jip() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.4
                    @Override // com.bytedance.sdk.component.sk.jip
                    public void hnj(int i10, String str, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.sk.jip
                    public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
                        try {
                            Object objHn = dnmVar.hn();
                            if (objHn != null && dnmVar.qor() != null) {
                                BitmapDrawable bitmapDrawable = objHn instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.oj.hnj().getResources(), (Bitmap) objHn) : null;
                                View viewJip = apu.this.f13869ul.jip();
                                if (bitmapDrawable == null || viewJip == null || !(viewJip.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewJip.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.apu.qor("LandingPageModel", th2.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean gjv(as asVar) {
        if (asVar == null) {
            return false;
        }
        if (dnm(asVar)) {
            return true;
        }
        return asVar.rg() == 3 && (asVar.qb() == 5 || sk(asVar)) && !hqh.hn(asVar) && (asVar.m34if() == 0.0f || asVar.m34if() == 100.0f);
    }

    public void dkl() {
        com.bytedance.sdk.component.ojm.dkl dklVar;
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.sq;
        if (orlVar != null && (dklVar = this.as) != null) {
            orlVar.hnj(dklVar);
        }
        Handler handler = this.f13856fc;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.f13867th;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f13867th.cancel();
        }
        ValueAnimator valueAnimator2 = this.f13866ta;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.f13866ta.cancel();
        }
        ObjectAnimator objectAnimator = this.dnm;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.dnm.cancel();
        }
        com.bytedance.sdk.openadsdk.common.bug bugVar = this.tu;
        if (bugVar != null) {
            bugVar.hn();
        }
        ObjectAnimator objectAnimator2 = this.ojm;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.ojm.dkl dklVar2 = this.as;
        if (dklVar2 != null) {
            jbd.hnj(dklVar2.getWebView());
        }
        this.as = null;
        ua uaVar = this.wu;
        if (uaVar != null) {
            uaVar.bug();
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar2 = this.sq;
        if (orlVar2 != null) {
            orlVar2.gjv(true);
        }
        if (!TextUtils.isEmpty(this.dzo) && this.jbd) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(this.f13872xo, this.pv, this.dse);
        }
        com.bytedance.sdk.openadsdk.dse.hn.hnj().hnj(this.pnz);
    }

    public boolean ojm() {
        AtomicBoolean atomicBoolean;
        return (!qor(this.dse) || (atomicBoolean = this.f13864qb) == null || atomicBoolean.get()) ? false : true;
    }

    public void ta() {
        if ("landingpage_split_screen".equals(this.f13858gm) && com.bytedance.sdk.openadsdk.as.sk.hnj("default_split_style", false) && this.f13861jo.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.10
                @Override // java.lang.Runnable
                public void run() {
                    apu.this.f13867th = ValueAnimator.ofFloat(1.0f, 0.0f);
                    apu.this.f13867th.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (apu.this.f13870vf != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) apu.this.f13870vf.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                apu.this.f13870vf.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    apu.this.f13867th.setDuration(500L);
                    apu.this.f13867th.start();
                    if (apu.this.tgn != null) {
                        apu.this.tgn.setVisibility(8);
                    }
                }
            });
        }
    }

    public static boolean hn(as asVar) {
        return asVar != null && asVar.rg() == 3 && asVar.qb() == 6 && !hqh.hn(asVar) && asVar.zf() == 1 && (asVar.m34if() == 0.0f || asVar.m34if() == 100.0f);
    }

    public void sk() {
        FrameLayout frameLayout = this.f40do;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.f13870vf;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv(int i10) {
        sq.hnj((View) this.fr, i10);
        sq.hnj((View) this.f13859gn, i10);
        if (this.f13857ff.get()) {
            sq.hnj((View) this.f13863oj, i10);
            sq.hnj((View) this.f13871xn, i10);
            sq.hnj((View) this.apu, i10);
            sq.hnj((View) this.eum, 0);
        }
    }

    public void hnj(c.InterfaceC0870c interfaceC0870c) {
        this.bug = interfaceC0870c;
    }

    public void hn(int i10) {
        com.bytedance.sdk.openadsdk.core.ojm.apu apuVar = this.izk;
        if (apuVar != null) {
            apuVar.sk(i10);
        }
    }

    public void hnj() {
        long jHnj;
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.ojm.dkl dklVar = (com.bytedance.sdk.component.ojm.dkl) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.wu);
        this.as = dklVar;
        if (dklVar != null && !as.hnj(this.dse)) {
            if (!this.as.k_()) {
                this.as.sk();
            }
        } else {
            sq.hnj((View) this.as, 8);
        }
        this.f40do = (FrameLayout) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.eum);
        this.tu = (com.bytedance.sdk.openadsdk.common.bug) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.tgn);
        this.tgn = this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.as);
        this.xyo = (ImageView) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f51do);
        this.f13870vf = this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14685ua);
        this.f13860hn = (FrameLayout) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14693xn);
        this.hnj = (ImageView) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.apu);
        this.dkl = (RelativeLayout) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.tu);
        this.qor = (TextView) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14655da);
        this.gjv = (FrameLayout) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.bug);
        View viewFindViewById = this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.xyo);
        this.jip = viewFindViewById;
        if (viewFindViewById == null) {
            this.jip = this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.orp);
        }
        this.uua = this.pty.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14688vf);
        this.f13863oj = (TextView) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.nyv);
        this.f13871xn = (TextView) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.pty);
        this.apu = (com.bytedance.sdk.openadsdk.core.widget.uua) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.hqh);
        this.eum = (TextView) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14659gm);
        if (this.qor != null && this.dse.m31do() != null) {
            this.qor.setText(this.dse.m31do().sk());
        }
        this.f13865sk = this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14686ul);
        this.f13862ka = (com.bytedance.sdk.openadsdk.core.dkl.gjv) this.f13868ua.findViewById(com.bytedance.sdk.openadsdk.utils.jip.zgl);
        if ((gjv(this.dse) || hn(this.dse) || dse(this.dse) || qor(this.dse)) && this.dse.m31do() != null) {
            View view2 = this.f13865sk;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (dse(this.dse)) {
                jHnj = this.dse.m31do().qor();
            } else {
                jHnj = this.dse.m31do().hnj();
            }
            com.bytedance.sdk.openadsdk.core.fc.qor().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.11
                @Override // java.lang.Runnable
                public void run() {
                    if (apu.this.nyv.get()) {
                        return;
                    }
                    apu apuVar = apu.this;
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(apuVar.dse, apuVar.f13858gm, System.currentTimeMillis() - apu.this.hqh, false);
                    apu.this.fc();
                }
            }, jHnj * 1000);
        }
        dnm();
        if (hn(this.dse)) {
            oj();
            if (!gjv()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f40do.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.f40do.setLayoutParams(layoutParams);
            }
        }
        if ((gjv(this.dse) || dse(this.dse)) && (view = this.f13870vf) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.bug bugVar = this.tu;
        if (bugVar != null) {
            bugVar.hnj(this.dse);
        }
        if (qor(this.dse)) {
            uua();
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj.hnj(SystemClock.elapsedRealtime() - jElapsedRealtime, this.dse, this.f13858gm, this.pnz, this.dzo);
    }

    public static boolean qor(as asVar) {
        return asVar != null && asVar.rg() == 3 && asVar.fr() == 38 && asVar.zf() == 1;
    }

    public static boolean orl(as asVar) {
        if (asVar != null) {
            return sk(asVar) || dkl(asVar);
        }
        return false;
    }

    public static boolean bug(as asVar) {
        return asVar != null && asVar.qb() == 8 && asVar.gn() == 1;
    }

    public static boolean dnm(as asVar) {
        return asVar != null && asVar.qb() == 19;
    }

    public static boolean hnj(as asVar) {
        if (asVar == null || dnm(asVar) || dkl(asVar) || sk(asVar)) {
            return false;
        }
        return gjv(asVar) || hn(asVar) || dse(asVar);
    }

    public void hnj(int i10) {
        com.bytedance.sdk.openadsdk.core.mjg.gjv.hn hnVar = this.f13869ul;
        if (hnVar != null) {
            hnVar.sk();
        }
    }

    public void hnj(float f10) {
        try {
            this.f13869ul.fc();
        } catch (Throwable unused) {
        }
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.ojm.apu apuVar, FrameLayout frameLayout) {
        this.izk = apuVar;
        this.mkl = frameLayout;
    }

    public void hnj(final int i10, com.bytedance.sdk.component.adexpress.hn.mjg mjgVar) {
        float f10;
        int iDkl;
        if ((i10 != 3 && !qor(i10)) || this.mkl == null || mjgVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f13864qb;
        if (atomicBoolean != null) {
            if (i10 == 1) {
                return;
            }
            if (i10 == 5 && atomicBoolean.get()) {
                return;
            }
        }
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13870vf.getLayoutParams();
        this.dy = (LinearLayout.LayoutParams) this.f40do.getLayoutParams();
        final float f11 = layoutParams.weight;
        xn xnVarTgn = this.dse.tgn();
        if (qor(i10)) {
            if (xnVarTgn != null) {
                iDkl = xnVarTgn.sk();
                f10 = iDkl;
            } else {
                f10 = 30.0f;
            }
        } else if (xnVarTgn != null) {
            iDkl = xnVarTgn.dkl();
            f10 = iDkl;
        } else {
            f10 = 70.0f;
        }
        final float f12 = f10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mkl.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        final int i11 = layoutParams3.height;
        final int i12 = layoutParams3.width;
        final int i13 = layoutParams3.leftMargin;
        final int i14 = layoutParams3.topMargin;
        final int iHn = sq.hn(this.pty, (float) mjgVar.dse());
        final int iHn2 = sq.hn(this.pty, (float) mjgVar.aq());
        final int iHn3 = sq.hn(this.pty, (float) mjgVar.sk());
        final int iHn4 = sq.hn(this.pty, (float) mjgVar.dkl());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13866ta = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f13866ta.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.apu.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LinearLayout.LayoutParams layoutParams4 = layoutParams;
                float f13 = f11;
                layoutParams4.weight = f13 + ((f12 - f13) * fFloatValue);
                apu.this.dy.weight = 100.0f - layoutParams.weight;
                if (apu.this.f13870vf != null) {
                    apu.this.f13870vf.setLayoutParams(layoutParams);
                }
                if (apu.this.f40do != null) {
                    apu.this.f40do.setLayoutParams(apu.this.dy);
                }
                if (apu.this.dy.weight < 30.0f) {
                    apu.this.gjv(8);
                } else {
                    apu.this.gjv(0);
                }
                FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                int i15 = i12;
                layoutParams5.width = i15 + ((int) ((iHn - i15) * fFloatValue));
                int i16 = i11;
                layoutParams5.height = i16 + ((int) ((iHn2 - i16) * fFloatValue));
                int i17 = i13;
                layoutParams5.leftMargin = i17 + ((int) ((iHn3 - i17) * fFloatValue));
                int i18 = i14;
                layoutParams5.topMargin = i18 + ((int) ((iHn4 - i18) * fFloatValue));
                if (apu.this.mkl != null) {
                    apu.this.mkl.setLayoutParams(layoutParams3);
                }
                apu.this.hnj(0.0f);
                if (fFloatValue == 1.0f) {
                    if (apu.this.f13862ka != null) {
                        sq.hnj((View) apu.this.f13862ka, 0);
                        if (apu.this.qor(i10)) {
                            apu.this.f13862ka.setImageDrawable(com.bytedance.sdk.component.utils.wu.qor(apu.this.pty, "tt_ad_zoom_down"));
                            apu.this.f13862ka.setTag(1);
                        } else {
                            apu.this.f13862ka.setImageDrawable(com.bytedance.sdk.component.utils.wu.qor(apu.this.pty, "tt_ad_zoom_up"));
                            apu.this.f13862ka.setTag(2);
                        }
                    }
                    if (apu.this.f13864qb == null) {
                        apu.this.f13864qb = new AtomicBoolean();
                    }
                    apu.this.f13864qb.set(apu.this.qor(i10));
                }
            }
        });
        com.bytedance.sdk.openadsdk.gjv.qor.gjv(this.dse, this.f13858gm, i10);
        this.f13866ta.start();
        if (this.idl.compareAndSet(false, true)) {
            this.hkr = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.gjv.orl orlVar = this.sq;
        if (orlVar != null) {
            orlVar.hnj(true, SystemClock.elapsedRealtime());
        }
        sq.hnj((View) this.f13862ka, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hnj(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.fzb < 100) {
            return false;
        }
        this.fzb = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
