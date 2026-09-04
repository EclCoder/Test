package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f32599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MBSplashView f32600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f32601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f32602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f32604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f32605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f32606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f32607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected MBridgeIds f32608k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f32614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f32615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected Context f32616s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f32618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f32619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdSession f32620w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f32598a = "SplashShowManager";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f32609l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f32610m = "点击跳过|";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f32611n = "点击跳过|";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f32612o = "秒";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f32613p = "秒后自动关闭";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f32617t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View.OnClickListener f32621x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f32622y = new HandlerC0449b(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f32623z = true;
    protected j A = new e();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f32603f) {
                b.this.b(1);
                b.this.d(-1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class HandlerC0449b extends Handler {
        HandlerC0449b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00db  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MBSplashView mBSplashView;
            MBSplashWebview splashWebview;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                if (!b.this.f32615r) {
                    b.this.i();
                }
                b bVar = b.this;
                if (bVar.f32609l <= 0) {
                    bVar.b(2);
                    return;
                }
                if (com.mbridge.msdk.foundation.feedback.b.f30438f) {
                    b.this.f();
                } else {
                    b bVar2 = b.this;
                    if (bVar2.f32614q) {
                        b.this.f();
                    } else {
                        int i11 = bVar2.f32609l - 1;
                        bVar2.f32609l = i11;
                        bVar2.d(i11);
                        b bVar3 = b.this;
                        if (!bVar3.f32617t) {
                            bVar3.g();
                        }
                    }
                }
                b.this.f32622y.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            if (i10 != 2 || b.this.f32599b == null || !b.this.f32599b.isActiveOm() || (mBSplashView = b.this.f32600c) == null || (splashWebview = mBSplashView.getSplashWebview()) == null) {
                return;
            }
            try {
                b.this.f32620w = splashWebview.getAdSession();
                if (b.this.f32620w != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(b.this.f32620w);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                }
                q0.a("OMSDK", "adSession.impressionOccurred()");
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                if (b.this.f32599b != null) {
                    String requestId = b.this.f32599b.getRequestId();
                    String requestIdNotice = b.this.f32599b.getRequestIdNotice();
                    String id2 = b.this.f32599b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, b.this.f32606i, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements j {
        e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f32600c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f32600c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(campaign, b.this.f32600c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32629a;

        f(int i10) {
            this.f32629a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f32629a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f32631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f32632b;

        g(Context context, CampaignEx campaignEx) {
            this.f32631a = context;
            this.f32632b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f32631a)).b(this.f32632b.getId());
            } catch (Exception unused) {
                q0.b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements com.mbridge.msdk.foundation.feedback.a {
        h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            b.this.f();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            b.this.g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            b.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class i implements com.mbridge.msdk.splash.middle.a {
        private i() {
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(CampaignEx campaignEx) {
            b.this.b(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void close() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void toggleCloseBtn(int i10) {
            MBSplashView mBSplashView = b.this.f32600c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.b(1);
        }

        /* synthetic */ i(b bVar, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10) {
            q0.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.f32609l = i10;
            bVar.f32622y.removeMessages(1);
            b.this.f32622y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10) {
            if (z10) {
                b.this.f32622y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10, String str) {
            try {
                if (b.this.f32601d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f32601d.a(bVar.f32608k);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f32599b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    b.this.b(campaignWithBackData, true, str);
                }
            } catch (Exception e10) {
                q0.b("SplashShowManager", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f32622y.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.f32609l = i11;
                bVar.f32622y.removeMessages(1);
                b.this.f32622y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f32606i = str2;
        this.f32607j = str;
        this.f32608k = new MBridgeIds(str, str2);
        this.f32616s = context;
        if (this.f32604g == null) {
            TextView textView = new TextView(context);
            this.f32604g = textView;
            textView.setGravity(1);
            this.f32604g.setTextIsSelectable(false);
            this.f32604g.setPadding(v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f32604g.getLayoutParams();
            this.f32604g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v0.a(context, 100.0f), v0.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        MBSplashView mBSplashView;
        try {
            if (this.f32599b == null) {
                return;
            }
            this.f32615r = true;
            if (this.f32601d != null && (mBSplashView = this.f32600c) != null) {
                if (mBSplashView.getContext() != null && (this.f32600c.getContext() instanceof Activity) && ((Activity) this.f32600c.getContext()).isFinishing()) {
                    q0.a("SplashShowManager", "Activity is finishing");
                }
                if (this.f32600c.isShown()) {
                    this.f32601d.b(this.f32608k);
                } else {
                    this.f32601d.a(this.f32608k, "SplashView or container is not visibility");
                }
            }
            if (!this.f32599b.isReport()) {
                MBSplashView mBSplashView2 = this.f32600c;
                if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                    a(this.f32599b);
                } else {
                    b(this.f32599b);
                }
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32599b, this.f32606i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void j() {
        String str;
        if (this.f32603f) {
            str = this.f32611n + this.f32609l + this.f32612o;
        } else {
            str = this.f32609l + this.f32613p;
        }
        this.f32604g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f32600c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f32600c.getSplashNativeView();
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(splashWebview2, this.f32599b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f32599b);
        if (lVarA.a()) {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        } else if (this.f32623z) {
            this.f32623z = false;
            this.f32600c.postDelayed(new c(), 200L);
            return;
        } else {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
            if (this.f32599b.getLocalCheckShow() == 1) {
                a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f32599b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f32600c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), splashWebview, splashWebview.getUrl(), this.f32599b);
                this.f32620w = adSessionA;
                if (adSessionA != null) {
                    splashWebview.setAdSession(adSessionA);
                    this.f32620w.registerAdView(splashWebview);
                    this.f32620w.start();
                }
                q0.a("OMSDK", "adSession.start()");
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = this.f32599b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = this.f32599b.getRequestIdNotice();
                    String id2 = this.f32599b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, this.f32606i, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        com.mbridge.msdk.splash.manager.d.b(this.f32606i);
        this.f32622y.removeMessages(1);
        this.f32622y.sendEmptyMessageDelayed(1, 1000L);
        this.f32622y.sendEmptyMessageDelayed(2, 1000L);
        b();
        if (!this.f32599b.isMraid()) {
            a();
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32599b.getMaitve(), this.f32599b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f32606i, this.f32599b.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f32618u == null) {
                    this.f32618u = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f32618u.getVisibility() != 0) {
                    this.f32618u.setVisibility(0);
                }
                v0.a(this.f32618u, bitmapDrawableA, this.f32600c.getResources().getDisplayMetrics());
                if (this.f32618u.getParent() == null) {
                    this.f32600c.addView(this.f32618u, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f32620w;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f32618u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public void g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f32617t = true;
        if (this.f32600c != null && this.f32609l > 0 && (handler = this.f32622y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f32600c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f32600c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f32599b;
            if (campaignEx != null ? com.mbridge.msdk.foundation.tools.h.b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f32622y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (com.mbridge.msdk.foundation.feedback.b.f30438f || (mBSplashView = this.f32600c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f32600c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.c.a(splashWebview2, "onSystemPause", "");
    }

    public void h() {
        if (this.f32601d != null) {
            this.f32601d = null;
        }
        if (this.f32619v != null) {
            this.f32619v = null;
        }
        if (this.f32621x != null) {
            this.f32621x = null;
        }
        MBSplashView mBSplashView = this.f32600c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f32606i);
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            int identifier = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip", "string", strI);
            int identifier2 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", "string", strI);
            int identifier3 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", "string", strI);
            this.f32611n = contextD.getResources().getString(identifier);
            String string = contextD.getResources().getString(identifier2);
            this.f32613p = string;
            this.f32610m = string;
            this.f32612o = contextD.getResources().getString(identifier3);
            this.f32604g.setBackgroundResource(contextD.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f32604g.setTextColor(contextD.getResources().getColor(contextD.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", TtmlNode.ATTR_TTS_COLOR, strI)));
        }
    }

    public void c(int i10) {
        this.f32609l = i10;
    }

    public String d() {
        CampaignEx campaignEx = this.f32599b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f32599b.getRequestId();
    }

    public void f() {
        Handler handler;
        this.f32617t = false;
        if (this.f32600c != null && this.f32609l > 0 && (handler = this.f32622y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f32600c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f32600c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.c.a(splashWebview, "onSystemPause", "");
        }
    }

    public String c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f32599b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32606i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f32606i, campaignEx, "splash");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32606i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32606i);
    }

    public void a(com.mbridge.msdk.splash.middle.d dVar) {
        this.f32601d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10) {
        MBSplashView mBSplashView = this.f32600c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (this.f32600c.getSplashSignalCommunicationImpl() != null) {
                this.f32600c.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            this.f32609l = i10;
            return;
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f32601d;
        if (dVar != null) {
            dVar.a(this.f32608k, i10 * 1000);
        }
        if (this.f32605h == null) {
            j();
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f32621x);
        }
        this.f32605h = viewGroup;
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
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        a(this.f32603f);
        this.f32599b = campaignEx;
        this.f32600c = mBSplashView;
        com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        if (splashSignalCommunicationImpl == null) {
            splashSignalCommunicationImpl = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), this.f32607j, this.f32606i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            splashSignalCommunicationImpl.a(arrayList);
        }
        splashSignalCommunicationImpl.b(this.f32609l);
        splashSignalCommunicationImpl.a(this.f32603f ? 1 : 0);
        if (this.f32619v == null) {
            this.f32619v = new i(this, null);
        }
        splashSignalCommunicationImpl.a(this.f32619v);
        mBSplashView.setSplashSignalCommunicationImpl(splashSignalCommunicationImpl);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f32605h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f32604g.setVisibility(8);
            }
            j();
            a(this.f32604g);
            mBSplashView.setCloseView(this.f32604g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f32605h);
            mBSplashView.setCloseView(this.f32605h);
        }
        b1.a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f32599b.getLocalRequestId(), this.f32599b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f32623z = true;
        k();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements com.mbridge.msdk.foundation.feedback.a {
        d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f32600c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f32600c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f32600c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    protected void b(int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f32600c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f32622y != null && (campaignEx = this.f32599b) != null && campaignEx.isActiveOm()) {
            this.f32622y.postDelayed(new f(i10), 1500L);
        } else {
            a(i10);
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
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f32599b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() != 1 || (mBSplashView = this.f32600c) == null || mBSplashView.getSplashWebview() == null || this.f32600c.isDynamicView() || !this.f32599b.isMraid() || (context = this.f32600c.getContext()) == null) {
            return;
        }
        try {
            int iA = i0.a(context, "mbridge_splash_notice", "drawable");
            int iA2 = v0.a(context, 35.0f);
            int iA3 = v0.a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iA3, iA3, iA3, iA3);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iA);
            v0.a(3, imageView, this.f32599b, context, true, new h());
            this.f32600c.addView(imageView);
        } catch (Throwable th2) {
            q0.b("SplashShowManager", th2.getMessage());
        }
    }

    private void a() {
        RelativeLayout.LayoutParams layoutParams;
        CampaignEx campaignEx = this.f32599b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f32606i);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f32606i, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f32606i, this.f32599b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            MBSplashView mBSplashView = this.f32600c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f32606i, new d());
                FeedBackButton feedBackButtonA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f32606i);
                if (feedBackButtonA != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f30437e, com.mbridge.msdk.foundation.feedback.b.f30436d);
                    }
                    layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    MBSplashView mBSplashView2 = this.f32600c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32606i);
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32606i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f32606i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f32606i, campaignEx, "splash");
    }

    private void a(String str) {
        com.mbridge.msdk.splash.middle.d dVar = this.f32601d;
        if (dVar != null) {
            dVar.a(this.f32608k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f32600c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f32600c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f32600c.getParent()).removeView(this.f32600c);
    }

    public void a(boolean z10) {
        this.f32603f = z10;
        if (z10) {
            this.f32610m = this.f32611n;
        } else {
            this.f32610m = this.f32613p;
        }
    }

    protected void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f32602e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32606i);
            this.f32602e = aVar;
            aVar.a(this.A);
        }
        campaignEx.setCampaignUnitId(this.f32606i);
        this.f32602e.a(campaignEx);
        if (!this.f32599b.isReportClick()) {
            this.f32599b.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f32601d;
        if (dVar != null) {
            dVar.a(this.f32608k);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f32606i, str);
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f32621x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.middle.d dVar = this.f32601d;
            if (dVar != null) {
                dVar.a(this.f32608k, i10);
                this.f32601d = null;
                com.mbridge.msdk.splash.report.a.a(this.f32606i, this.f32599b);
            }
            ImageView imageView = this.f32618u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f32600c) != null) {
                mBSplashView.removeView(this.f32618u);
                this.f32618u.setVisibility(8);
            }
            this.f32615r = false;
            com.mbridge.msdk.splash.report.a.a(this.f32606i, i10, this.f32599b);
            Handler handler = this.f32622y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e10) {
            q0.b("SplashShowManager", e10.getMessage());
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f28480m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
