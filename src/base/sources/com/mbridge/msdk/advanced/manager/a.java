package com.mbridge.msdk.advanced.manager;

import android.content.Context;
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
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CampaignEx f28122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MBNativeAdvancedView f28123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.advanced.middle.d f28124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f28125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.c f28126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f28127g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f28129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f28130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f28131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected MBridgeIds f28132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28133m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28121a = "NativeAdvancedShowManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28128h = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f28134n = new ViewOnClickListenerC0364a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f28135o = new b(Looper.getMainLooper());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f28136p = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class ViewOnClickListenerC0364a implements View.OnClickListener {
        ViewOnClickListenerC0364a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f28127g) {
                a.this.a(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CampaignEx campaignEx;
            MBNativeAdvancedView mBNativeAdvancedView;
            MBNativeAdvancedWebview advancedNativeWebview;
            super.handleMessage(message);
            if (message.what != 2 || (campaignEx = a.this.f28122b) == null || !campaignEx.isActiveOm() || (mBNativeAdvancedView = a.this.f28123c) == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null) {
                return;
            }
            try {
                AdSession adSession = advancedNativeWebview.getAdSession();
                if (adSession != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                    q0.a("OMSDK", "adSession.impressionOccurred()");
                }
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = a.this.f28122b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = a.this.f28122b.getRequestIdNotice();
                    String id2 = a.this.f28122b.getId();
                    new h(advancedNativeWebview.getContext()).a(requestId, requestIdNotice, id2, a.this.f28130j, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements com.mbridge.msdk.advanced.middle.a {
        c() {
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(CampaignEx campaignEx) {
            a.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void close() {
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void toggleCloseBtn(int i10) {
            a.this.f28128h = i10;
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f28123c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f28123c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.setVisibility(8);
            }
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(int i10) {
            q0.b(a.this.f28121a, "resetCountdown" + i10);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10) {
            a aVar = a.this;
            if (aVar.f28124d != null) {
                aVar.f28133m = z10;
                if (z10) {
                    a aVar2 = a.this;
                    aVar2.f28124d.f(aVar2.f28132l);
                } else {
                    a aVar3 = a.this;
                    aVar3.f28124d.a(aVar3.f28132l);
                }
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10, String str) {
            try {
                if (a.this.f28124d != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.f28124d.b(aVar.f28132l);
                        a aVar2 = a.this;
                        aVar2.f28124d.d(aVar2.f28132l);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(a.this.f28122b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    a.this.a(campaignWithBackData, z10, str);
                }
            } catch (Exception e10) {
                q0.b(a.this.f28121a, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f28143b;

        e(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView) {
            this.f28142a = campaignEx;
            this.f28143b = mBNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f28142a, this.f28143b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f28146b;

        f(Context context, CampaignEx campaignEx) {
            this.f28145a = context;
            this.f28146b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f28145a)).b(this.f28146b.getId());
            } catch (Exception unused) {
                q0.b(a.this.f28121a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.f28130j = str2;
        this.f28131k = str;
        this.f28132l = new MBridgeIds(str, str2);
        if (this.f28129i == null) {
            ImageView imageView = new ImageView(context);
            this.f28129i = imageView;
            imageView.setPadding(v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f));
            d();
        }
    }

    private void d() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f28129i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f28129i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(v0.a(contextD, 29.0f), v0.a(contextD, 16.0f));
        }
        this.f28129i.setLayoutParams(layoutParams);
        this.f28129i.setImageResource(contextD.getResources().getIdentifier("mbridge_native_advanced_close_icon", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
    }

    private void h() {
        if (this.f28122b.isReport()) {
            return;
        }
        a(this.f28122b);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28122b, this.f28130j);
        com.mbridge.msdk.advanced.middle.d dVar = this.f28124d;
        if (dVar != null) {
            dVar.e(this.f28132l);
        }
    }

    private void i() {
        CampaignEx campaignEx;
        MBNativeAdvancedView mBNativeAdvancedView = this.f28123c;
        if (mBNativeAdvancedView == null || (campaignEx = this.f28122b) == null) {
            return;
        }
        mBNativeAdvancedView.setAdChoiceCampaign(campaignEx);
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public String c() {
        CampaignEx campaignEx = this.f28122b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f28122b.getRequestId();
    }

    public void e() {
        MBNativeAdvancedWebview advancedNativeWebview;
        MBNativeAdvancedView mBNativeAdvancedView = this.f28123c;
        if (mBNativeAdvancedView == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) advancedNativeWebview, "onViewDisappeared", "");
    }

    public void f() {
        MBNativeAdvancedWebview advancedNativeWebview;
        if (this.f28123c == null || com.mbridge.msdk.foundation.feedback.b.f30438f || (advancedNativeWebview = this.f28123c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.advanced.signal.a.a(advancedNativeWebview, "onViewAppeared", "");
    }

    public void g() {
        if (this.f28124d != null) {
            this.f28124d = null;
        }
        if (this.f28136p != null) {
            this.f28136p = null;
        }
        if (this.f28134n != null) {
            this.f28134n = null;
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f28123c;
        if (mBNativeAdvancedView != null) {
            MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
            this.f28123c.destroy();
        }
        if (this.f28126f != null) {
            this.f28126f = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f28130j);
    }

    public com.mbridge.msdk.advanced.middle.a b() {
        return this.f28136p;
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f28481n);
            } catch (Throwable th2) {
                q0.b(this.f28121a, th2.getMessage());
            }
        }
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
                q0.b(this.f28121a, th2.getMessage());
            }
        }
    }

    public void a(com.mbridge.msdk.advanced.middle.c cVar) {
        this.f28126f = cVar;
    }

    public void a(com.mbridge.msdk.advanced.middle.d dVar) {
        this.f28124d = dVar;
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f28122b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements com.mbridge.msdk.foundation.feedback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f28140a;

        d(MBNativeAdvancedView mBNativeAdvancedView) {
            this.f28140a = mBNativeAdvancedView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            a.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f28121a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f28140a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f28121a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f28140a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(a.this.f28121a, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f28140a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void a(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, boolean z10) {
        MBNativeAdvancedWebview advancedNativeWebview;
        View viewA;
        RelativeLayout.LayoutParams layoutParams;
        if (mBNativeAdvancedView == null) {
            return;
        }
        this.f28122b = campaignEx;
        this.f28123c = mBNativeAdvancedView;
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f28130j, new d(mBNativeAdvancedView));
        if (campaignEx.isMraid() && com.mbridge.msdk.foundation.feedback.b.b().a() && (viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f28130j)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
            } catch (Exception e10) {
                e10.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f30437e, com.mbridge.msdk.foundation.feedback.b.f30436d);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewA);
            }
            mBNativeAdvancedView.addView(viewA, layoutParams);
        }
        a(this.f28127g);
        com.mbridge.msdk.advanced.signal.b advancedNativeSignalCommunicationImpl = mBNativeAdvancedView.getAdvancedNativeSignalCommunicationImpl();
        campaignEx.setLocalRequestId(campaignEx.getCurrentLocalRid());
        List<CampaignEx> arrayList = new ArrayList<>();
        arrayList.add(campaignEx);
        if (advancedNativeSignalCommunicationImpl == null) {
            advancedNativeSignalCommunicationImpl = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), this.f28131k, this.f28130j);
            advancedNativeSignalCommunicationImpl.a(arrayList);
        }
        advancedNativeSignalCommunicationImpl.a(this.f28127g ? 1 : 0);
        advancedNativeSignalCommunicationImpl.a(this.f28136p);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(advancedNativeSignalCommunicationImpl);
        b1.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (campaignEx.isHasMBTplMark() || !this.f28127g) {
            this.f28129i.setVisibility(8);
        }
        a(this.f28129i);
        mBNativeAdvancedView.setCloseView(this.f28129i);
        if (mBNativeAdvancedView.getVisibility() != 0) {
            mBNativeAdvancedView.setVisibility(0);
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getImpReportType());
        if (this.f28126f == null || !lVarA.a() || this.f28126f.d() == null || this.f28126f.d().getAlpha() < 0.5f || this.f28126f.d().getVisibility() != 0 || this.f28133m) {
            if (z10) {
                mBNativeAdvancedView.postDelayed(new e(campaignEx, mBNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        mBNativeAdvancedView.show();
        com.mbridge.msdk.foundation.controller.c.n().a(mBNativeAdvancedView.getContext());
        campaignEx.setCampaignUnitId(this.f28130j);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f28130j, campaignEx);
        CampaignEx campaignEx2 = this.f28122b;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), advancedNativeWebview, advancedNativeWebview.getUrl(), this.f28122b);
                if (adSessionA != null) {
                    advancedNativeWebview.setAdSession(adSessionA);
                    adSessionA.registerAdView(advancedNativeWebview);
                    adSessionA.start();
                    q0.a("OMSDK", "adSession.start()");
                }
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx3 = this.f28122b;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.f28122b.getRequestIdNotice();
                    String id2 = this.f28122b.getId();
                    new h(com.mbridge.msdk.foundation.controller.c.n().d()).a(requestId, requestIdNotice, id2, this.f28130j, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        h();
        if (campaignEx.isMraid()) {
            i();
        }
        int i10 = this.f28128h;
        if (i10 != -1) {
            mBNativeAdvancedView.changeCloseBtnState(i10);
        }
        com.mbridge.msdk.advanced.manager.d.b(this.f28130j);
        com.mbridge.msdk.advanced.common.c.b(this.f28131k + this.f28130j + campaignEx.getRequestId());
        this.f28135o.sendEmptyMessageDelayed(2, 1000L);
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f28122b.getMaitve(), this.f28122b.getMaitve_src());
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f28130j);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f28130j, campaignEx, "h5_native");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f28130j);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f28130j);
    }

    public void a(boolean z10) {
        this.f28127g = z10;
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f28134n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        com.mbridge.msdk.advanced.middle.d dVar = this.f28124d;
        if (dVar != null) {
            dVar.c(this.f28132l);
            this.f28124d = null;
            com.mbridge.msdk.advanced.report.a.a(this.f28130j, this.f28122b);
        }
        com.mbridge.msdk.advanced.report.a.a(this.f28130j, i10, this.f28122b);
        MBNativeAdvancedView mBNativeAdvancedView = this.f28123c;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.setVisibility(8);
            e();
            MBNativeAdvancedWebview advancedNativeWebview = this.f28123c.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
        }
        Handler handler = this.f28135o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new f(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f28480m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
