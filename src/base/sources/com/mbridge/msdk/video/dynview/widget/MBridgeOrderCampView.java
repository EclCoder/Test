package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.video.bt.module.orglistener.f;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeOrderCampView f34331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<CampaignEx> f34332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f34335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f34336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f34337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FeedBackButton f34338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f34339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f34340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.c f34341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.b f34342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f34343y;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.video.dynview.listener.c {
        a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void a(CampaignEx campaignEx, int i10) {
            if (campaignEx != null) {
                try {
                    MBridgeOrderCampView.this.setCampaign(campaignEx);
                    campaignEx.setClickTempSource(2);
                    campaignEx.setTriggerClickSource(2);
                    MBridgeOrderCampView.this.a(campaignEx, 0, i10);
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void close() {
            MBridgeOrderCampView.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements com.mbridge.msdk.foundation.feedback.a {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34348a;

        d(String str) {
            this.f34348a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.click.c.e(((MBridgeBaseView) MBridgeOrderCampView.this).f34432a, this.f34348a);
        }
    }

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f34340v = false;
        this.f34341w = new a();
        this.f34343y = false;
    }

    private void f() {
        if (this.f34339u == null) {
            return;
        }
        g gVarF = h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarF == null) {
            this.f34339u.setVisibility(8);
            return;
        }
        String strC = gVarF.c();
        if (TextUtils.isEmpty(strC)) {
            this.f34339u.setVisibility(8);
        }
        this.f34339u.setOnClickListener(new d(strC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f34433b);
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    public void createView(ViewGroup viewGroup) {
        if (this.f34332n == null) {
            com.mbridge.msdk.video.dynview.listener.b bVar = this.f34342x;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("order_view_callback", this.f34341w);
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34332n), new b(viewGroup), map);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f34331m = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        JSONException e10;
        JSONObject jSONObject;
        super.onAttachedToWindow();
        if (this.f34332n == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f34332n.size(); i10++) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("camp_position", i10);
                } catch (JSONException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                }
            } catch (JSONException e12) {
                e10 = e12;
                jSONObject = null;
            }
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(110, jSONObject);
            }
        }
    }

    public void setCampOrderViewBuildCallback(com.mbridge.msdk.video.dynview.listener.b bVar) {
        this.f34342x = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f34332n = list;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f34333o = i10;
        this.f34334p = i11;
        this.f34335q = i12;
        this.f34336r = i13;
        setViewStatus();
    }

    public void setRewarded(boolean z10) {
        this.f34343y = z10;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f34331m;
        if (mBridgeOrderCampView == null || !this.f34343y) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f34340v, "mbridge_native_order_camp_controller"));
        this.f34338t = (FeedBackButton) this.f34331m.findViewById(filterFindViewId(this.f34340v, "mbridge_native_order_camp_feed_btn"));
        this.f34339u = (ImageView) this.f34331m.findViewById(filterFindViewId(this.f34340v, "mbridge_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f34333o, this.f34335q, this.f34334p, this.f34336r);
        }
        if (this.f34338t != null) {
            try {
                e();
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        if (this.f34339u != null) {
            try {
                f();
            } catch (Exception e11) {
                q0.b(MBridgeBaseView.TAG, e11.getMessage());
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f34331m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f34331m.startAnimation(translateAnimation);
    }

    private void e() {
        List<CampaignEx> list = this.f34332n;
        if (list == null || list.get(0) == null) {
            FeedBackButton feedBackButton = this.f34338t;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f34337s = this.f34332n.get(0).getCampaignUnitId();
        this.f34433b = this.f34332n.get(0);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f34337s + "_2", this.f34433b);
        if (this.f34338t == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            this.f34338t.setVisibility(8);
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f34337s + "_2", new c());
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f34337s + "_2", this.f34338t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, int i11) {
        JSONException jSONException;
        JSONObject jSONObject;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                String str2 = str;
                j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "order_view_click" + str2, campaignEx.getCampaignUnitId(), campaignEx.isBidCampaign(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str2);
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f30488j, a(i10));
                jSONObject.put("camp_position", i11);
            } catch (JSONException e11) {
                jSONException = e11;
                jSONException.printStackTrace();
            }
        } catch (JSONException e12) {
            jSONException = e12;
            jSONObject = null;
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(105, jSONObject);
        }
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34340v = false;
        this.f34341w = new a();
        this.f34343y = false;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.video.dynview.listener.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f34345a;

        b(ViewGroup viewGroup) {
            this.f34345a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                try {
                    MBridgeOrderCampView.this.f34331m.addView(aVar.b());
                    MBridgeOrderCampView.this.f34340v = aVar.c();
                    this.f34345a.removeAllViews();
                    this.f34345a.addView(MBridgeOrderCampView.this.f34331m);
                    f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f34332n, ((CampaignEx) MBridgeOrderCampView.this.f34332n.get(0)).getCampaignUnitId());
                    MBridgeOrderCampView.this.setViewStatus();
                    if (MBridgeOrderCampView.this.f34342x != null) {
                        MBridgeOrderCampView.this.f34342x.a();
                    }
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            try {
                f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f34332n, ((CampaignEx) MBridgeOrderCampView.this.f34332n.get(0)).getCampaignUnitId(), aVar.h());
                if (MBridgeOrderCampView.this.f34342x != null) {
                    MBridgeOrderCampView.this.f34342x.b();
                }
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
    }
}
