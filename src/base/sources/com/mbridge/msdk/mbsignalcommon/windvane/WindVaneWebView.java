package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class WindVaneWebView extends BaseWebView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected j f31684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f31685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f31686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f31687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f31688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f31689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f31690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f31691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f31692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignEx f31693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f31694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f31695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f31696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f31697q;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f31695o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f31695o = false;
        this.f31696p = 0.0f;
        this.f31697q = 0.0f;
    }

    public void clearWebView() {
        if (this.f31695o) {
            return;
        }
        loadUrl("about:blank");
    }

    public CampaignEx getCampaignEx() {
        return this.f31693m;
    }

    public String getCampaignId() {
        return this.f31689i;
    }

    public Object getJsObject(String str) {
        e eVar = this.f31686f;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f31692l;
    }

    public Object getMraidObject() {
        return this.f31688h;
    }

    public Object getObject() {
        return this.f31687g;
    }

    public String getRid() {
        return this.f31691k;
    }

    public b getSignalCommunication() {
        return this.f31685e;
    }

    public c getWebViewListener() {
        return this.f31690j;
    }

    public boolean isDestoryed() {
        return this.f31695o;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f31696p = motionEvent.getRawX();
                    this.f31697q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f31696p;
                    float y10 = motionEvent.getY() - this.f31697q;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y10 >= 0.0f || (-1.0f) * y10 <= 48) && (y10 <= 0.0f || y10 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        e eVar = this.f31686f;
        if (eVar == null) {
            return;
        }
        eVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f31695o) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", Integer.valueOf(this.f31694n));
                if (this.f31693m != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000135", this.f31693m, eVar);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f31687g = null;
            int iB = v0.b(getContext());
            if (iB == 0) {
                this.f31695o = true;
                destroy();
            } else {
                new Handler().postDelayed(new a(), iB * 1000);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        e eVar = this.f31686f;
        if (eVar != null) {
            eVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        e eVar = this.f31686f;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f31693m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f31689i = str;
    }

    public void setLocalRequestId(String str) {
        this.f31692l = str;
    }

    public void setMraidObject(Object obj) {
        this.f31688h = obj;
    }

    public void setObject(Object obj) {
        this.f31687g = obj;
    }

    public void setRid(String str) {
        this.f31691k = str;
    }

    public void setSignalCommunication(b bVar) {
        this.f31685e = bVar;
        bVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f31694n = i10;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f31684d = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.f31690j = cVar;
        j jVar = this.f31684d;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    protected void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f31684d == null) {
            this.f31684d = new j(this);
        }
        setWebViewChromeClient(this.f31684d);
        k kVar = new k();
        this.mWebViewClient = kVar;
        setWebViewClient(kVar);
        if (this.f31685e == null) {
            b hVar = new h(this.f31584a);
            this.f31685e = hVar;
            setSignalCommunication(hVar);
        }
        this.f31686f = new e(this.f31584a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31695o = false;
        this.f31696p = 0.0f;
        this.f31697q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f31695o = false;
        this.f31696p = 0.0f;
        this.f31697q = 0.0f;
    }
}
