package com.mbridge.msdk.interstitial.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBInterstitialActivity extends MBBaseActivity implements com.mbridge.msdk.mbsignalcommon.mraid.b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f31112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WindVaneWebView f31113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageView f31114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.interstitial.controller.a.d f31115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31116m;
    public ProgressBar mProgressBar;
    public String mUnitid;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.d f31117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f31118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f31119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f31120q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.click.a f31124u;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31110g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31111h = false;
    public boolean mIsMBPage = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f31121r = new f();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Runnable f31122s = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Runnable f31123t = new k();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(MBInterstitialActivity.this.f31113j, MBInterstitialActivity.this.f31113j.getLeft(), MBInterstitialActivity.this.f31113j.getTop(), MBInterstitialActivity.this.f31113j.getWidth(), MBInterstitialActivity.this.f31113j.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.f31113j, MBInterstitialActivity.this.f31113j.getLeft(), MBInterstitialActivity.this.f31113j.getTop(), MBInterstitialActivity.this.f31113j.getWidth(), MBInterstitialActivity.this.f31113j.getHeight());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(MBInterstitialActivity.this)).b(MBInterstitialActivity.this.f31112i.getId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBInterstitialActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f31111h) {
                return;
            }
            MBInterstitialActivity.this.f31110g = true;
            if (MBInterstitialActivity.this.f31115l != null) {
                MBInterstitialActivity.this.f31115l.a("load page timeout");
                if (MBInterstitialActivity.this.f31113j != null) {
                    MBInterstitialActivity.this.f31113j.setVisibility(8);
                    MBInterstitialActivity.this.f31113j.setWebViewListener(null);
                    MBInterstitialActivity.this.f31113j.release();
                }
                MBInterstitialActivity.this.hideLoading();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
            if (mBInterstitialActivity.mIsMBPage) {
                return;
            }
            if (mBInterstitialActivity.f31112i != null && MBInterstitialActivity.this.f31112i.isMraid()) {
                MBInterstitialActivity.this.m();
            }
            com.mbridge.msdk.interstitial.cache.a.a().a(MBInterstitialActivity.this.f31112i, MBInterstitialActivity.this.mUnitid);
            if (MBInterstitialActivity.this.f31110g) {
                return;
            }
            MBInterstitialActivity.this.f31111h = true;
            MBInterstitialActivity.this.hideLoading();
            MBInterstitialActivity.this.showWebView();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l implements com.mbridge.msdk.mbsignalcommon.mraid.d.b {
        l() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
        public void a(double d10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.f31113j, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MBInterstitialActivity.this.f31113j != null && MBInterstitialActivity.this.f31112i != null) {
                    MBInterstitialActivity.this.f31113j.setVisibility(0);
                    if (MBInterstitialActivity.this.f31112i.isMraid()) {
                        MBInterstitialActivity.this.k();
                    }
                    MBInterstitialActivity.this.j();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f31113j != null) {
                MBInterstitialActivity.this.f31113j.setVisibility(8);
            }
        }
    }

    private void l() {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getApplicationContext());
        CampaignEx campaignEx = this.f31112i;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f31112i.getRequestIdNotice(), this.f31112i.getId(), this.mUnitid, com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f31112i.getId()), this.f31112i.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f31112i.getId());
            this.f31119p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        List<String> pv_urls;
        try {
            com.mbridge.msdk.foundation.controller.c.n().a(this);
            if (!TextUtils.isEmpty(this.f31112i.getImpressionURL())) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx = this.f31112i;
                com.mbridge.msdk.click.a.a(contextD, campaignEx, this.mUnitid, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f28480m);
            }
            if (!TextUtils.isEmpty(this.f31112i.getOnlyImpressionURL())) {
                Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx2 = this.f31112i;
                com.mbridge.msdk.click.a.a(contextD2, campaignEx2, this.mUnitid, campaignEx2.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f28481n);
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.mUnitid, this.f31112i, com.vungle.ads.internal.f.PLACEMENT_TYPE_INTERSTITIAL);
            e eVar = new e();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(eVar);
            } else {
                eVar.run();
            }
            CampaignEx campaignEx3 = this.f31112i;
            if (campaignEx3 == null || (pv_urls = campaignEx3.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31112i, this.mUnitid, it.next(), false, true);
            }
        } catch (Throwable th2) {
            q0.a("MBInterstitialActivity", th2.getMessage());
        }
    }

    private void n() {
        CampaignEx campaignEx;
        this.f31114k.setOnClickListener(new h());
        if (this.f31113j == null || (campaignEx = this.f31112i) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(campaignEx);
        aVar.a(this.f31112i.getAppName());
        this.f31113j.setCampaignId(this.f31112i.getId());
        this.f31113j.setDownloadListener(aVar);
    }

    public void clickTracking() {
        try {
            if (this.f31112i != null && !a1.a(this.mUnitid)) {
                onIntersClick();
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getApplicationContext(), this.mUnitid);
                this.f31124u = aVar;
                aVar.a(new c());
                this.f31124u.a(this.f31112i);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (!this.f31119p) {
            l();
        }
        if (this.f31120q) {
            return;
        }
        reportPlayableClosed();
    }

    public com.mbridge.msdk.setting.l getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.mUnitid);
            return lVarE == null ? com.mbridge.msdk.setting.l.h(this.mUnitid) : lVarE;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f31112i;
    }

    public void goneWebView() {
        try {
            runOnUiThread(new n());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new b());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void initView() {
        this.f31113j = (WindVaneWebView) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.f31114k = (ImageView) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            int iA = i0.a(getApplicationContext(), "mbridge_interstitial_activity", TtmlNode.TAG_LAYOUT);
            try {
                if (!i0.a(iA)) {
                    g();
                    f();
                    com.mbridge.msdk.interstitial.controller.a.d dVar = this.f31115l;
                    if (dVar != null) {
                        dVar.a("not found resource");
                    }
                    finish();
                    return;
                }
                setContentView(iA);
                initView();
                e();
                com.mbridge.msdk.foundation.controller.c.n().a(this);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new g());
                this.f31112i.setCampaignUnitId(this.mUnitid);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this.f31112i);
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        e.printStackTrace();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            com.mbridge.msdk.interstitial.controller.a.d dVar = this.f31115l;
            if (dVar != null) {
                dVar.b();
            }
            com.mbridge.msdk.click.a aVar = this.f31124u;
            if (aVar != null) {
                aVar.a(false);
                this.f31124u.a((NativeListener.NativeTrackingListener) null);
                this.f31124u.c();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar2 = this.f31117n;
            if (dVar2 != null) {
                dVar2.d();
            }
            if (!this.f31119p) {
                l();
            }
            if (com.mbridge.msdk.interstitial.controller.a.f31079r != null && !TextUtils.isEmpty(this.mUnitid)) {
                com.mbridge.msdk.interstitial.controller.a.f31079r.remove(this.mUnitid);
            }
            this.f31115l = null;
            com.mbridge.msdk.foundation.feedback.b.b().d(this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void onIntersClick() {
        try {
            com.mbridge.msdk.interstitial.controller.a.d dVar = this.f31115l;
            if (dVar != null) {
                dVar.a();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.f31112i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f31113j, "false");
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.f31112i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f31113j, "true");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f31112i.setClickURL(str);
            a(str);
        }
        this.f31112i.setClickTempSource(2);
        this.f31112i.setClickType(2);
        this.f31112i.setTriggerClickSource(2);
        clickTracking();
    }

    public void reportPlayableClosed() {
        if (this.f31112i != null) {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f31112i.getId(), this.f31112i.getRequestId(), this.f31112i.getRequestIdNotice(), this.mUnitid, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
            nVar.b(this.f31112i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.mUnitid);
            this.f31120q = true;
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        int iA = v0.a(this, 10.0f);
        if (i11 <= 0) {
            i11 = iA;
        }
        if (i12 <= 0) {
            i12 = iA;
        }
        if (i13 <= 0) {
            i13 = iA;
        }
        if (i14 <= 0) {
            i14 = iA;
        }
        if (this.f31114k != null) {
            int iA2 = v0.a(this, 25.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(11);
            layoutParams.setMargins(i11, i13, i12, i14);
            this.f31114k.setLayoutParams(layoutParams);
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void showWebView() {
        runOnUiThread(new m());
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        if (z10) {
            this.f31114k.setImageDrawable(new ColorDrawable(0));
        } else {
            this.f31114k.setImageResource(i0.a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    private void e() {
        g();
        n();
        f();
        h();
    }

    private void f() {
        try {
            if (com.mbridge.msdk.interstitial.controller.a.f31079r == null || TextUtils.isEmpty(this.mUnitid) || !com.mbridge.msdk.interstitial.controller.a.f31079r.containsKey(this.mUnitid)) {
                return;
            }
            this.f31115l = com.mbridge.msdk.interstitial.controller.a.f31079r.get(this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void g() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.f31112i = (CampaignEx) intent.getSerializableExtra(INTENT_CAMAPIGN);
        }
        CampaignEx campaignEx = this.f31112i;
        if (campaignEx != null && campaignEx.isMraid()) {
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(this);
            this.f31117n = dVar;
            dVar.c();
            this.f31117n.a(new l());
        }
        CampaignEx campaignEx2 = this.f31112i;
        if (campaignEx2 != null) {
            com.mbridge.msdk.click.c.a(this, campaignEx2.getMaitve(), this.f31112i.getMaitve_src());
        }
    }

    private void h() {
        try {
            CampaignEx campaignEx = this.f31112i;
            if (campaignEx == null || (TextUtils.isEmpty(campaignEx.getHtmlUrl()) && !this.f31112i.isMraid())) {
                com.mbridge.msdk.interstitial.controller.a.d dVar = this.f31115l;
                if (dVar != null) {
                    dVar.a("htmlurl is null");
                    return;
                }
                return;
            }
            q0.c("MBInterstitialActivity", "url:" + this.f31112i.getHtmlUrl());
            goneWebView();
            this.f31113j.setWebViewListener(new i());
            String htmlUrl = this.f31112i.getHtmlUrl();
            if (this.f31112i.isMraid()) {
                File file = new File(this.f31112i.getMraid());
                if (file.exists() && file.isFile() && file.canRead()) {
                    htmlUrl = "file:////" + this.f31112i.getMraid();
                }
            }
            this.f31118o = System.currentTimeMillis();
            this.f31113j.loadUrl(htmlUrl);
            this.f31121r.postDelayed(this.f31122s, WEB_LOAD_TIME);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String str;
        CampaignEx campaignEx = this.f31112i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        if (i10 == 0) {
            str = AdError.UNDEFINED_DOMAIN;
        } else if (i10 != 1) {
            str = i10 != 2 ? "UNDEFINED" : "landscape";
        } else {
            str = "portrait";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        float fN = m0.n(this);
        float fM = m0.m(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f10 = displayMetrics.widthPixels;
        float f11 = displayMetrics.heightPixels;
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", "default");
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f31113j, fN, fM);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f31113j, f10, f11);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f31113j, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f31113j, this.f31117n.a());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f31113j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CampaignEx campaignEx = this.f31112i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        this.f31113j.post(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.n(this.f31112i.getRequestId());
            nVar.o(this.f31112i.getRequestIdNotice());
            nVar.b(this.f31112i.getId());
            nVar.b(this.f31112i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.d(nVar, getApplicationContext(), this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        CampaignEx campaignEx = this.f31112i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
        nVar.n(this.f31112i.getRequestId());
        nVar.o(this.f31112i.getRequestIdNotice());
        nVar.b(this.f31112i.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.f31118o));
        nVar.g("");
        nVar.m(str);
        nVar.a(CampaignEx.CLICKMODE_ON);
        nVar.b(this.f31112i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.mUnitid, this.f31112i);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements com.mbridge.msdk.foundation.feedback.a {
        g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            MBInterstitialActivity.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f31113j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f31113j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f31113j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    private void a(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getApplicationContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements NativeListener.NativeTrackingListener {
        c() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.hideLoading();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            MBInterstitialActivity.this.hideLoading();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.showLoading();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends Handler {
        f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i extends com.mbridge.msdk.mbsignalcommon.listener.b {
        i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            try {
                if (MBInterstitialActivity.this.f31116m) {
                    return;
                }
                MBInterstitialActivity.this.a(1, "");
                MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
                if (mBInterstitialActivity.f31122s != null && mBInterstitialActivity.f31121r != null) {
                    MBInterstitialActivity.this.f31121r.removeCallbacks(MBInterstitialActivity.this.f31122s);
                }
                if (MBInterstitialActivity.this.f31115l != null) {
                    MBInterstitialActivity.this.f31115l.c();
                }
                MBInterstitialActivity mBInterstitialActivity2 = MBInterstitialActivity.this;
                if (!mBInterstitialActivity2.mIsMBPage) {
                    mBInterstitialActivity2.f31121r.postDelayed(MBInterstitialActivity.this.f31123t, 2000L);
                }
                MBInterstitialActivity.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
                if (MBInterstitialActivity.this.f31115l != null) {
                    MBInterstitialActivity.this.f31115l.a("load page failed");
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            try {
                MBInterstitialActivity.this.f31116m = true;
                if (MBInterstitialActivity.this.f31115l != null) {
                    MBInterstitialActivity.this.f31115l.a(str);
                }
                MBInterstitialActivity.this.a(3, str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            MBInterstitialActivity.this.f31116m = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onProgressChanged(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }
}
