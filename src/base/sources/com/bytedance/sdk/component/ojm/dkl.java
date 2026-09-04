package com.bytedance.sdk.component.ojm;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.Cdo;
import com.bytedance.sdk.component.utils.vf;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends FrameLayout {

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private static gjv f12909ff;
    private boolean apu;
    private float aq;
    private boolean as;
    private long bug;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private long f12910cm;
    private JSONObject dkl;
    private long dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f15do;
    private boolean dse;
    private boolean eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private View f12911fc;
    private AtomicBoolean fvt;
    private com.bytedance.sdk.component.ojm.hn.hnj gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private Cdo f12912gm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public int f12913hn;
    public int hnj;
    private float hqh;
    private sk jbd;
    private com.bytedance.sdk.component.ojm.hnj.InterfaceC0193hnj jip;
    private volatile WebView mjg;
    private int nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private List<String> f12914oj;
    private float ojm;
    private boolean orl;
    private AtomicBoolean orp;
    private hn pty;
    public int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f12915sk;
    private AtomicBoolean sq;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private long f12916ta;
    private qor tgn;
    private WebViewClient tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private Context f12917ua;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private AttributeSet f12918ul;
    private com.bytedance.sdk.component.ojm.hnj uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private float f12919vf;
    private boolean wu;
    private long xad;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private com.bytedance.sdk.component.ojm.gjv f12920xn;
    private float xyo;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface gjv {
        WebView hnj(Context context, AttributeSet attributeSet, int i10, qor qorVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.ojm.dkl.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum qor {
        ADS(b.JSON_KEY_ADS),
        ADS_V3("ads_v3"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT("ua"),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String orl;

        qor(String str) {
            this.orl = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface sk {
    }

    public dkl(Context context, qor qorVar) {
        this(hnj(context), false, qorVar);
    }

    private void apu() {
        try {
            WebSettings settings = this.mjg.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void eum() {
        if (this.f12912gm == null) {
            this.sq.set(false);
            this.f12912gm = new Cdo(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.ojm.dkl.1
        };
        this.sq.set(true);
    }

    private static Context hnj(Context context) {
        return context;
    }

    private static void qor(Context context) {
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(gjv gjvVar) {
        f12909ff = gjvVar;
    }

    private void xn() {
        if (this.mjg == null) {
            return;
        }
        try {
            this.mjg.removeJavascriptInterface("searchBoxJavaBridge_");
            this.mjg.removeJavascriptInterface("accessibility");
            this.mjg.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.mjg.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void aq() {
        try {
            this.mjg.reload();
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.mjg.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bug() {
        try {
            this.mjg.goForward();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mjg == null) {
            return;
        }
        try {
            this.mjg.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void dkl() {
        if (this.mjg != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.mjg.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.mjg, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public boolean dnm() {
        if (this.mjg == null) {
            return false;
        }
        try {
            return this.mjg.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void dse() {
        try {
            this.mjg.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void fc() {
        if (this.mjg == null) {
            return;
        }
        try {
            this.mjg.onPause();
        } catch (Throwable unused) {
        }
    }

    public View getArbitrageLoadingView() {
        return this.f12911fc;
    }

    public int getContentHeight() {
        if (this.mjg == null) {
            return 0;
        }
        try {
            return this.mjg.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.xad;
    }

    public long getLandingPageClickEnd() {
        return this.f12910cm;
    }

    public com.bytedance.sdk.component.ojm.hn.hnj getMaterialMeta() {
        return this.gjv;
    }

    public String getOriginalUrl() {
        String url;
        if (this.mjg == null) {
            return null;
        }
        try {
            String originalUrl = this.mjg.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.mjg.getUrl()) == null || !url.startsWith(com.vungle.ads.internal.model.b.FILE_SCHEME)) ? originalUrl : url;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.mjg == null) {
            return 0;
        }
        try {
            return this.mjg.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public qor getScene() {
        return this.tgn;
    }

    public String getUrl() {
        if (this.mjg == null) {
            return null;
        }
        try {
            return this.mjg.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.mjg == null) {
            return "";
        }
        try {
            return this.mjg.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.mjg;
    }

    public WebViewClient getWebViewClient() {
        return this.tu;
    }

    public boolean gjv() {
        return this.as;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean hn() {
        return this.eum;
    }

    public void jip() {
        if (this.mjg == null) {
            return;
        }
        qor qorVar = this.tgn;
        if (qorVar != qor.ADS && qorVar != qor.ADS_V3) {
            vf.hnj(this);
        } else {
            try {
                this.mjg.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public boolean k_() {
        return this.apu;
    }

    public void mjg() {
        try {
            this.mjg.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void oj() {
        try {
            this.mjg.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public boolean ojm() {
        if (this.mjg == null) {
            return false;
        }
        try {
            return this.mjg.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.fvt.set(true);
        if (!this.orp.get() || this.sq.get()) {
            return;
        }
        eum();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.fvt.set(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentHnj;
        try {
            hnj(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.orl && (viewParentHnj = hnj(this)) != null) {
                viewParentHnj.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void orl() {
        if (this.mjg != null) {
            this.mjg.onResume();
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.mjg.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.mjg.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.mjg.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.mjg.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.mjg.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.mjg.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.nyv = i10;
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.mjg.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.f12919vf = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.mjg.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.mjg.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.mjg.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.mjg.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.mjg.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.orl = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.mjg.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.mjg.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.dse = z10;
    }

    public void setLandingPageClickBegin(long j10) {
        this.xad = j10;
    }

    public void setLandingPageClickEnd(long j10) {
        this.f12910cm = j10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.mjg.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.mjg.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.mjg.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z10) {
        this.apu = z10;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.ojm.hn.hnj hnjVar) {
        this.gjv = hnjVar;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.mjg.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.mjg.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(hn hnVar) {
        this.pty = hnVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.mjg.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z10) {
        this.f15do = z10;
    }

    public void setPreFinish(boolean z10) {
        this.wu = z10;
    }

    public void setPreProgressHundred(boolean z10) {
        this.as = z10;
    }

    public void setPreStart(boolean z10) {
        this.eum = z10;
    }

    public void setRecycler(boolean z10) {
        if (this.mjg == null || !(this.mjg instanceof com.bytedance.sdk.component.ojm.sk)) {
            return;
        }
        ((com.bytedance.sdk.component.ojm.sk) this.mjg).setRecycler(z10);
    }

    public void setShakeValue(float f10) {
        this.xyo = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.mjg.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f12915sk = str;
        com.bytedance.sdk.component.ojm.hnj hnjVar = this.uua;
        if (hnjVar != null) {
            hnjVar.hnj(str);
        }
        com.bytedance.sdk.component.ojm.gjv gjvVar = this.f12920xn;
        if (gjvVar != null) {
            gjvVar.hnj(str);
        }
    }

    public void setTouchStateListener(sk skVar) {
        this.jbd = skVar;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.mjg.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.mjg.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.mjg.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.mjg.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.mjg = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof sk) {
                setTouchStateListener((sk) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new hnj();
            }
            this.tu = webViewClient;
            this.mjg.setWebViewClient(new dse(this.jip, webViewClient, this.f12914oj));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.hqh = f10;
    }

    public void sk() {
        try {
            if (this.mjg == null) {
                this.mjg = hnj(this.f12918ul, 0);
            }
            dkl();
            hn(hnj(this.f12917ua));
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void ta() {
        try {
            this.mjg.goBack();
        } catch (Throwable unused) {
        }
    }

    public void uua() {
        try {
            this.mjg.clearView();
        } catch (Throwable unused) {
        }
    }

    public dkl(Context context, boolean z10, qor qorVar) {
        super(hnj(context));
        this.aq = 0.0f;
        this.ojm = 0.0f;
        this.f12916ta = 0L;
        this.dnm = 0L;
        this.bug = 0L;
        this.orl = false;
        this.xyo = 20.0f;
        this.hqh = 50.0f;
        this.fvt = new AtomicBoolean();
        this.orp = new AtomicBoolean();
        this.sq = new AtomicBoolean();
        this.f12917ua = context;
        this.tgn = qorVar;
        if (z10) {
            return;
        }
        try {
            this.mjg = hnj((AttributeSet) null, 0);
            dkl();
        } catch (Throwable unused) {
        }
        hn(hnj(context));
    }

    private void hn(Context context) {
        qor(context);
        apu();
        xn();
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.mjg.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.f12915sk;
    }

    public void hnj(boolean z10, int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (z10 && this.mjg != null && (this.mjg instanceof com.bytedance.sdk.component.ojm.sk)) {
            this.uua = new com.bytedance.sdk.component.ojm.hnj(this.f12917ua, i10, i11, list, i12);
            this.f12914oj = list2;
            if (!TextUtils.isEmpty(this.f12915sk)) {
                this.uua.hnj(this.f12915sk);
            }
            ((com.bytedance.sdk.component.ojm.sk) this.mjg).setTouchListenerProxy(this.uua);
            this.jip = this.uua.hnj();
        }
    }

    public boolean qor() {
        return this.wu;
    }

    private static boolean qor(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean hn(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void hnj(int i10, long j10) {
        if (this.mjg == null || !(this.mjg instanceof com.bytedance.sdk.component.ojm.sk)) {
            return;
        }
        this.f12920xn = new com.bytedance.sdk.component.ojm.gjv(this.f12917ua, this.uua, i10, j10, this);
        if (!TextUtils.isEmpty(this.f12915sk)) {
            this.f12920xn.hnj(this.f12915sk);
        }
        ((com.bytedance.sdk.component.ojm.sk) this.mjg).setTouchListenerProxy(this.f12920xn);
    }

    public void hnj(boolean z10, View view) {
        if (z10) {
            this.f12911fc = view;
            view.setVisibility(8);
            View view2 = this.f12911fc;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.f12911fc, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView hnj(AttributeSet attributeSet, int i10) {
        gjv gjvVar = f12909ff;
        if (gjvVar != null) {
            return gjvVar.hnj(getContext(), attributeSet, i10, this.tgn);
        }
        if (attributeSet == null) {
            return new WebView(hnj(this.f12917ua));
        }
        return new WebView(hnj(this.f12917ua), attributeSet);
    }

    public void hnj(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.mjg.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void hnj(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.mjg.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void hnj(boolean z10) {
        try {
            this.mjg.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ViewParent hnj(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (hn(view2) || qor(view2)) ? parent : hnj(view2);
    }

    public void hnj(Object obj, String str) {
        try {
            this.mjg.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void hnj(MotionEvent motionEvent) {
        if (!this.dse || this.gjv == null) {
            return;
        }
        if ((this.f12915sk == null && this.dkl == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.aq = motionEvent.getRawX();
                this.ojm = motionEvent.getRawY();
                this.f12916ta = System.currentTimeMillis();
                this.dkl = new JSONObject();
                if (this.mjg != null) {
                    this.xad = this.f12916ta;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.dkl.put("start_x", String.valueOf(this.aq));
                this.dkl.put("start_y", String.valueOf(this.ojm));
                this.dkl.put("offset_x", String.valueOf(motionEvent.getRawX() - this.aq));
                this.dkl.put("offset_y", String.valueOf(motionEvent.getRawY() - this.ojm));
                this.dkl.put("url", String.valueOf(getUrl()));
                this.dkl.put("tag", "");
                this.dnm = System.currentTimeMillis();
                if (this.mjg != null) {
                    this.f12910cm = this.dnm;
                }
                this.dkl.put("down_time", this.f12916ta);
                this.dkl.put("up_time", this.dnm);
                if (com.bytedance.sdk.component.ojm.hnj.hnj.hnj().hn() != null) {
                    long j10 = this.bug;
                    long j11 = this.f12916ta;
                    if (j10 != j11) {
                        this.bug = j11;
                        com.bytedance.sdk.component.ojm.hnj.hnj.hnj().hn().hnj(this.gjv, this.f12915sk, "in_web_click", this.dkl, this.dnm - this.f12916ta);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
