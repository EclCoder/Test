package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    private com.mbridge.msdk.mbbanner.common.communication.b A;
    private AdSession B;
    private AdEvents C;
    private float F;
    private float G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.listener.c f31258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected CampaignEx f31260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final MBBannerView f31261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f31262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBBannerWebView f31263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f31264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f31265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f31271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f31272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final String f31273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f31274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f31275r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    com.mbridge.msdk.click.a f31277t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<CampaignEx> f31278u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View.OnTouchListener f31280w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f31282y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f31276s = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f31279v = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f31281x = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long f31283z = MBInterstitialActivity.WEB_LOAD_TIME;
    private final Handler D = new e(Looper.getMainLooper());
    private final com.mbridge.msdk.foundation.same.task.a E = new f();
    private final View.OnClickListener H = new g();
    private com.mbridge.msdk.mbbanner.common.listener.a I = new h();
    private com.mbridge.msdk.mbsignalcommon.listener.b J = new c();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f31285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f31286b;

        b(Context context, CampaignEx campaignEx) {
            this.f31285a = context;
            this.f31286b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f31285a)).b(this.f31286b.getId());
            } catch (Exception e10) {
                q0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends com.mbridge.msdk.mbsignalcommon.listener.b {
        c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            d.this.f31268k = true;
            com.mbridge.msdk.mbbanner.common.communication.a.a(webView);
            d.this.f31270m = true;
            CampaignEx campaignEx = d.this.f31260c;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.p();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
            bVar.c(i10 + " WebView receive error: " + i10 + "  message : " + str);
            bVar.b(d.this.f31275r);
            d.this.a(bVar);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            d.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                if (d.this.B != null) {
                    d dVar = d.this;
                    dVar.C = AdEvents.createAdEvents(dVar.B);
                    if (d.this.C != null) {
                        d.this.C.loaded();
                        d.this.C.impressionOccurred();
                    }
                }
            } catch (Throwable th2) {
                q0.a("BannerShowManager", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.f31272o) {
                dVar.f31276s = 1;
                d.this.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements com.mbridge.msdk.mbbanner.common.listener.a {
        h() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void close() {
            d.this.f31276s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void readyStatus(int i10) {
            if (i10 != 1) {
                d.this.g();
            } else {
                d.this.p();
                d.this.a("", 1);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void toggleCloseBtn(int i10) {
            if (i10 == 2) {
                d.this.e();
            } else {
                d.this.n();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void triggerCloseBtn(String str) {
            d.this.f31276s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10) {
            d dVar = d.this;
            if (dVar.f31258a != null) {
                dVar.f31271n = z10;
                if (z10) {
                    d.this.f31258a.a();
                } else {
                    d.this.f31258a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10, String str) {
            try {
                if (d.this.f31258a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f31258a.c();
                        d.this.f31258a.onLeaveApp();
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.f31260c));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    d.this.a(campaignWithBackData, z10, str);
                }
            } catch (Exception e10) {
                q0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f31263f != null) {
                    String str = d.this.f31279v == 2 ? "false" : "true";
                    d.this.f31263f.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j implements View.OnTouchListener {
        j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            d.this.F = motionEvent.getRawX();
            d.this.G = motionEvent.getRawY();
            q0.b("BannerShowManager", d.this.F + "  " + d.this.G);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.F, d.this.G), d.this.f31260c), false, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l implements com.mbridge.msdk.foundation.same.image.c {
        l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880039);
            bVar.b(d.this.f31275r);
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (d.this.f31262e != null) {
                d.this.f31262e.setImageBitmap(bitmap);
            }
            d.this.f31268k = true;
            d.this.o();
            d.this.n();
            d.this.m();
            d dVar = d.this;
            if (dVar.f31272o) {
                return;
            }
            dVar.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.p();
        }
    }

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.listener.c cVar, String str, String str2, boolean z10, com.mbridge.msdk.setting.l lVar) {
        this.f31259b = z10;
        this.f31261d = mBBannerView;
        this.f31273p = str2;
        this.f31274q = str;
        this.f31258a = new com.mbridge.msdk.mbbanner.common.listener.e(cVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        MBBannerView mBBannerView;
        if (this.f31268k && !this.f31269l && this.f31258a != null) {
            this.f31269l = true;
            this.D.removeCallbacks(this.E);
            CampaignEx campaignEx = this.f31260c;
            if (campaignEx != null && !campaignEx.isCallbacked()) {
                this.f31260c.setCallbacked(true);
                this.f31258a.a(this.f31278u);
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f31260c.getMaitve(), this.f31260c.getMaitve_src());
            }
        }
        if (this.f31268k && this.f31266i && this.f31267j && this.f31269l && this.f31260c != null && !d()) {
            boolean zA = a();
            if (!zA && (mBBannerView = this.f31261d) != null) {
                mBBannerView.postDelayed(new m(), 1000L);
            }
            if (this.f31270m && zA) {
                q0.b("BannerShowManager", "onBannerWebViewShow && transInfoToMraid");
                int[] iArr = new int[2];
                this.f31261d.getLocationInWindow(iArr);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f31263f, iArr[0], iArr[1]);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f31263f, iArr[0], iArr[1], this.f31261d.getWidth(), this.f31261d.getHeight());
                this.f31270m = false;
                this.f31281x = 1;
                if (!TextUtils.isEmpty(this.f31260c.getImageUrl())) {
                    com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f31260c.getImageUrl());
                }
                l();
            }
            q0.b("BannerShowManager", "showSuccessed:" + this.f31260c.getId());
            CampaignEx campaignEx2 = this.f31260c;
            if (!zA) {
                campaignEx2.setReport(false);
                return;
            }
            ImageView imageView = this.f31262e;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<CampaignEx> list = this.f31278u;
                if (list != null && list.size() > 0) {
                    campaignEx2 = this.f31278u.get(0);
                    boolean z10 = false;
                    int i10 = 0;
                    for (int i11 = 0; i11 < this.f31278u.size(); i11++) {
                        if (!this.f31278u.get(i11).isHasMBTplMark() && (i11 == 0 || !this.f31278u.get(i11).isReport())) {
                            a(this.f31278u.get(i11), com.mbridge.msdk.foundation.controller.c.n().d(), this.f31273p);
                            this.f31278u.get(i11).setReport(true);
                            com.mbridge.msdk.foundation.same.buffer.b.a(this.f31273p, this.f31278u.get(i11), "banner");
                            i10 = i11;
                            z10 = true;
                        }
                    }
                    if (z10) {
                        b(this.f31278u.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), this.f31273p);
                        c(this.f31278u.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), this.f31273p);
                    }
                }
            } else {
                CampaignEx campaignEx3 = this.f31260c;
                if (campaignEx3 != null) {
                    b(campaignEx3);
                    this.f31260c.setReport(true);
                    this.f31281x = 2;
                    com.mbridge.msdk.foundation.same.buffer.b.a(this.f31273p, this.f31260c, "banner");
                }
            }
            this.f31272o = true;
            if (campaignEx2 == null || this.f31258a == null || e1.a(this.f31261d, campaignEx2.getImpReportType())) {
                return;
            }
            this.f31258a.a(this.f31260c);
            try {
                CampaignEx campaignEx4 = this.f31260c;
                if (campaignEx4 != null && campaignEx4.isActiveOm()) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    MBBannerWebView mBBannerWebView = this.f31263f;
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(contextD, mBBannerWebView, mBBannerWebView.getUrl(), this.f31260c);
                    this.B = adSessionA;
                    if (adSessionA != null) {
                        try {
                            adSessionA.registerAdView(this.f31263f);
                            ImageView imageView2 = this.f31264g;
                            if (imageView2 != null) {
                                this.B.addFriendlyObstruction(imageView2, FriendlyObstructionPurpose.CLOSE_AD, null);
                            }
                            ImageView imageView3 = this.f31262e;
                            if (imageView3 != null) {
                                this.B.addFriendlyObstruction(imageView3, FriendlyObstructionPurpose.OTHER, null);
                            }
                            this.B.start();
                        } catch (Exception e10) {
                            q0.a("OMSDK", e10.getMessage());
                        }
                    } else {
                        CampaignEx campaignEx5 = this.f31260c;
                        if (campaignEx5 != null) {
                            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx5.getRequestId(), this.f31260c.getRequestIdNotice(), this.f31260c.getId(), this.f31273p, "fetch OM failed, context null");
                        }
                    }
                }
            } catch (Exception unused) {
                CampaignEx campaignEx6 = this.f31260c;
                if (campaignEx6 != null) {
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx6.getRequestId(), this.f31260c.getRequestIdNotice(), this.f31260c.getId(), this.f31273p, "fetch OM failed, context null");
                }
            }
            this.D.sendEmptyMessageDelayed(1, 1000L);
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f31273p, this.f31260c.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f31265h == null) {
                    this.f31265h = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f31265h.getVisibility() != 0) {
                    this.f31265h.setVisibility(0);
                }
                v0.a(this.f31265h, bitmapDrawableA, this.f31261d.getResources().getDisplayMetrics());
                if (this.f31265h.getParent() == null) {
                    this.f31261d.addView(this.f31265h, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.B;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f31265h, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        }
    }

    private boolean q() {
        String strA = a(this.f31260c);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.f31261d != null) {
            if (this.f31263f == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                    this.f31263f = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f31263f.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f31273p, this.f31278u, this.I));
                } catch (Throwable unused) {
                    a(com.mbridge.msdk.foundation.error.a.a(880029), 1);
                    return false;
                }
            }
            ImageView imageView = this.f31262e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f31263f.getVisibility() != 0) {
                this.f31263f.setVisibility(0);
            }
            if (this.f31263f.getParent() == null) {
                this.f31261d.addView(this.f31263f);
                a(this.f31260c.isMraid());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 296);
            if (TextUtils.isEmpty(this.f31260c.getBidToken())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f31273p, this.f31260c.getLocalRequestId());
            cVarA.a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
            b1.a(this.f31263f, cVarA.t(), this.f31260c.getLocalAllowTrackClick());
            if (this.f31260c.isMraid()) {
                m();
            }
            n();
            com.mbridge.msdk.mbbanner.common.communication.b bVar = new com.mbridge.msdk.mbbanner.common.communication.b(this.f31261d.getContext(), this.f31274q, this.f31273p);
            this.A = bVar;
            bVar.a(this.f31278u);
            this.A.a(this.I);
            this.A.a(this.f31282y);
            this.f31263f.setWebViewListener(this.J);
            this.f31263f.setObject(this.A);
            this.f31263f.loadUrl(strA);
            MBBannerWebView mBBannerWebView2 = this.f31263f;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new i(), 1000L);
            }
        } else {
            a(com.mbridge.msdk.foundation.error.a.a(880046), 2);
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880046);
            bVar2.b(this.f31275r);
            a(bVar2);
        }
        return true;
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    private synchronized boolean d() {
        boolean zIsReport;
        zIsReport = this.f31260c.isReport();
        if (!zIsReport) {
            this.f31260c.setReport(true);
        }
        return zIsReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView;
        if (this.f31259b && (imageView = this.f31264g) != null && imageView.getVisibility() == 0) {
            this.f31264g.setVisibility(8);
            this.f31264g.setOnClickListener(null);
            if (this.f31261d == null || this.f31264g.getParent() == null) {
                return;
            }
            this.f31261d.removeView(this.f31264g);
        }
    }

    private void f() {
        if (this.f31259b && this.f31264g == null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f31264g = imageView;
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_banner_close", "drawable"));
            this.f31264g.setVisibility(8);
            this.f31264g.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f31261d == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880046);
            bVar.b(this.f31275r);
            a(bVar);
            return;
        }
        MBBannerWebView mBBannerWebView = this.f31263f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f31261d.removeView(this.f31263f);
        }
        if (this.f31262e == null) {
            this.f31262e = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f31280w = new j();
            this.f31262e.setOnClickListener(new k());
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 296);
        if (TextUtils.isEmpty(this.f31260c.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f31273p, this.f31260c.getLocalRequestId()).a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
        b1.a(this.f31262e, this.f31260c.getLocalRequestId(), this.f31260c.getLocalAllowTrackClick(), this.f31280w);
        String imageUrl = this.f31260c.getImageUrl();
        if (!TextUtils.isEmpty(imageUrl)) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(imageUrl, new l());
            return;
        }
        com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880047);
        bVar2.b(this.f31275r);
        a(bVar2);
    }

    private void i() {
        AdSession adSession = this.B;
        if (adSession != null) {
            adSession.finish();
            this.B = null;
            q0.a("omsdk", " adSession.finish() ");
        }
    }

    private void j() {
        try {
            CampaignEx campaignEx = this.f31260c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f31273p, campaignEx.getLocalRequestId());
                cVarA.g(this.f31281x);
                cVarA.b(true);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000152", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    private void k() {
        try {
            CampaignEx campaignEx = this.f31260c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f31273p, campaignEx.getLocalRequestId());
                cVarA.g(this.f31281x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("close_click_type", Integer.valueOf(this.f31276s));
                eVar.a(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(this.f31260c.getCreativeId()));
                com.mbridge.msdk.mbbanner.common.report.a.a("2000069", cVarA, eVar);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    private void l() {
        try {
            CampaignEx campaignEx = this.f31260c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f31273p, campaignEx.getLocalRequestId());
                cVarA.g(this.f31281x);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000133", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f31261d == null) {
            return;
        }
        CampaignEx campaignEx = this.f31260c;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
            mBAdChoice.setCampaign(this.f31260c);
            mBAdChoice.setFeedbackDialogEventListener(new a());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 6.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f31261d.addView(mBAdChoice, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ImageView imageView;
        if (!this.f31259b || (imageView = this.f31264g) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f31264g.setVisibility(0);
            this.f31264g.setOnClickListener(this.H);
        }
        if (this.f31264g.getParent() != null || this.f31261d == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f31261d.addView(this.f31264g, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f31262e != null) {
            MBBannerWebView mBBannerWebView = this.f31263f;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (this.f31262e.getVisibility() != 0) {
                this.f31262e.setVisibility(0);
            }
            this.f31281x = 2;
            if (this.f31261d != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f31262e.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f31262e.getParent() == null) {
                    this.f31261d.addView(this.f31262e, layoutParams);
                }
                a(true);
            }
        }
    }

    public void h() {
        i();
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f31260c, this.f31273p);
        if (this.f31258a != null) {
            this.f31258a = null;
        }
        MBBannerWebView mBBannerWebView = this.f31263f;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.J != null) {
            this.J = null;
        }
        ImageView imageView = this.f31264g;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f31262e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f31261d;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f31263f;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.b bVar = this.A;
        if (bVar != null) {
            bVar.a();
        }
        if (this.I != null) {
            this.I = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f31273p);
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f31273p);
    }

    public void c(boolean z10) {
        this.f31259b = z10;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    public void b(CampaignUnit campaignUnit) {
        CampaignEx campaignExA = a(campaignUnit);
        this.f31260c = campaignExA;
        if (campaignExA == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880043);
            bVar.b(this.f31275r);
            a(bVar);
            return;
        }
        if (!com.mbridge.msdk.foundation.tools.h.a(campaignExA, (Context) null, this.f31261d, campaignExA.getImpReportType())) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880044);
            bVar2.b(this.f31275r);
            a(bVar2);
            return;
        }
        this.D.removeCallbacks(this.E);
        f();
        this.f31268k = false;
        this.f31269l = false;
        this.f31272o = false;
        if (!TextUtils.isEmpty(this.f31260c.getBannerHtml()) || !TextUtils.isEmpty(this.f31260c.getBannerUrl())) {
            com.mbridge.msdk.mbbanner.common.report.a.a(this.f31273p, this.f31260c);
        }
        this.D.postDelayed(this.E, MBInterstitialActivity.WEB_LOAD_TIME);
        if (q()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f31260c.getBannerHtml()) || !TextUtils.isEmpty(this.f31260c.getBannerUrl())) {
            a(com.mbridge.msdk.foundation.error.a.a(880048), 2);
        }
        g();
    }

    public void d(boolean z10) {
        this.f31267j = z10;
        p();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.foundation.feedback.a {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f31263f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f31263f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f31263f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0409d implements com.mbridge.msdk.foundation.feedback.a {
        C0409d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            d.this.f31261d.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f31263f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            d.this.f31261d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f31263f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            d.this.f31261d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f31263f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void a(boolean z10, int i10) {
        this.f31282y = i10;
        if (i10 != 0) {
            this.f31259b = z10;
            return;
        }
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f31273p);
        if (lVarE != null) {
            this.f31259b = lVarE.g() == 1;
        }
    }

    public int c() {
        return this.f31281x;
    }

    private CampaignEx a(CampaignUnit campaignUnit) {
        if (campaignUnit == null) {
            return null;
        }
        ArrayList<CampaignEx> ads = campaignUnit.getAds();
        this.f31278u = ads;
        if (ads == null || ads.size() <= 0) {
            return null;
        }
        return this.f31278u.get(0);
    }

    private String a(CampaignEx campaignEx) {
        String bannerUrl = "";
        if (campaignEx != null) {
            try {
                bannerUrl = campaignEx.getBannerUrl();
                if (TextUtils.isEmpty(bannerUrl)) {
                    bannerUrl = campaignEx.getBannerHtml();
                    File file = new File(bannerUrl);
                    if (file.exists() && file.isFile() && file.canRead()) {
                        return "file:////" + bannerUrl;
                    }
                }
                return bannerUrl;
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage());
            }
        }
        return bannerUrl;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends com.mbridge.msdk.foundation.same.task.a {
        f() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880045);
            bVar.b(d.this.f31260c.getLocalRequestId());
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        k();
        MBBannerWebView mBBannerWebView = this.f31263f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f31261d.removeView(this.f31263f);
        }
        ImageView imageView = this.f31262e;
        if (imageView != null && imageView.getParent() != null) {
            this.f31262e.setVisibility(8);
            this.f31261d.removeView(this.f31262e);
        }
        ImageView imageView2 = this.f31264g;
        if (imageView2 != null && imageView2.getParent() != null) {
            this.f31261d.removeView(this.f31264g);
            this.f31264g.setVisibility(8);
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f31273p);
        ImageView imageView3 = this.f31265h;
        if (imageView3 != null && imageView3.getParent() != null) {
            this.f31261d.removeView(this.f31265h);
            this.f31265h.setVisibility(8);
        }
        BannerUtils.inserCloseId(this.f31273p, this.f31278u);
        j();
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f31258a;
        if (cVar != null) {
            cVar.b();
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        if (this.f31260c == null || d()) {
            return;
        }
        this.D.removeCallbacks(this.E);
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f31258a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    private boolean a() {
        if (this.f31261d == null) {
            return false;
        }
        CampaignEx campaignEx = this.f31260c;
        return (e1.a(this.f31261d, campaignEx != null ? campaignEx.getImpReportType() : 0) || this.f31271n) ? false : true;
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new b(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f28480m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public void a(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        com.mbridge.msdk.mbbanner.common.communication.a.a((WebView) this.f31263f, i10, i11);
    }

    private void a(boolean z10) {
        if (this.f31261d != null) {
            View viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f31273p);
            if (com.mbridge.msdk.foundation.feedback.b.b().a() && z10 && viewA != null) {
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
                viewA.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f30437e, com.mbridge.msdk.foundation.feedback.b.f30436d);
                }
                layoutParams.addRule(12);
                viewA.setLayoutParams(layoutParams);
                this.f31261d.addView(viewA);
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f31273p, new C0409d());
            this.f31260c.setCampaignUnitId(this.f31273p);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f31273p, this.f31260c);
        }
    }

    public void b(boolean z10) {
        this.f31266i = z10;
        p();
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f31273p);
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f31273p);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f31273p);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f28481n);
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    public void a(String str) {
        this.f31275r = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        try {
            CampaignEx campaignEx = this.f31260c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f31273p, campaignEx.getLocalRequestId());
                cVarA.g(this.f31281x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", Integer.valueOf(i10));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                eVar.a("reason", str);
                cVarA.d(TextUtils.isEmpty(this.f31260c.getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000068", cVarA, eVar);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }
}
