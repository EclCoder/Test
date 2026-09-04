package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.listener.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {
    public f ctaClickCallBack;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f34444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f34445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f34446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f34447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f34448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f34449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f34450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f34451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ObjectAnimator f34452u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends com.mbridge.msdk.widget.a {
        b() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            MBridgeClickCTAView.this.getClass();
            MBridgeClickCTAView.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends com.mbridge.msdk.widget.a {
        c() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            MBridgeClickCTAView.this.getClass();
            MBridgeClickCTAView.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends com.mbridge.msdk.video.module.listener.impl.e {
        e(ImageView imageView, CampaignEx campaignEx, String str) {
            super(imageView, campaignEx, str);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.e, com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            super.onFailedLoad(str, str2);
            MBridgeClickCTAView.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
    }

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        JSONObject jSONObject;
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = this.f34433b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "cta_click", this.f34433b.getCampaignUnitId(), this.f34433b.isBidCampaign(), this.f34433b.getRequestId(), this.f34433b.getRequestIdNotice(), this.f34433b.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f30488j, a(0));
            } catch (JSONException e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (JSONException e12) {
            e = e12;
            jSONObject = null;
        }
        this.f34433b.setTriggerClickSource(1);
        this.f34433b.setClickTempSource(1);
        this.notifyListener.a(105, jSONObject);
    }

    private void f() {
        int iFindLayout = findLayout("mbridge_reward_clickable_cta");
        if (i0.a(iFindLayout)) {
            this.f34434c.inflate(iFindLayout, this);
            this.f34436e = h();
            d();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ImageView imageView = this.f34445n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        this.f34444m = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f34445n = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f34446o = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.f34444m, this.f34445n, this.f34446o, textView);
    }

    private void i() {
        setWrapContent();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        if (this.f34436e) {
            CampaignEx campaignEx = this.f34433b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                b1.a(this, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
                setOnClickListener(new b());
            }
            CampaignEx campaignEx2 = this.f34433b;
            if (campaignEx2 != null) {
                b1.a(this.ctaTv, campaignEx2.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
            }
            this.ctaTv.setOnClickListener(new c());
            ImageView imageView = this.f34445n;
            if (imageView != null) {
                imageView.setOnClickListener(new d());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f34452u;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f34452u;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f34449r = motionEvent.getRawX();
        this.f34450s = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f34451t = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                a(this, this.f34433b);
            } else {
                f();
            }
            if (this.f34436e) {
                if (com.mbridge.msdk.util.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.f34433b.getAdCall());
                if (TextUtils.isEmpty(this.f34433b.getIconUrl())) {
                    g();
                } else {
                    com.mbridge.msdk.foundation.same.image.b.a(this.f34432a.getApplicationContext()).a(this.f34433b.getIconUrl(), new e(this.f34445n, this.f34433b, this.f34448q));
                }
                if (this.f34446o != null && !TextUtils.isEmpty(this.f34433b.getAppName())) {
                    this.f34446o.setText(this.f34433b.getAppName());
                }
                if (this.f34447p == null || TextUtils.isEmpty(this.f34433b.getAppDesc())) {
                    return;
                }
                this.f34447p.setText(this.f34433b.getAppDesc());
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f34452u = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f34448q = str;
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(ViewGroup viewGroup, CampaignEx campaignEx) {
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().a(viewGroup, campaignEx), new a(viewGroup));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f34453a;

        a(ViewGroup viewGroup) {
            this.f34453a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                this.f34453a.addView(aVar.b());
                MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                mBridgeClickCTAView.f34436e = mBridgeClickCTAView.h();
                MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                mBridgeClickCTAView2.f34447p = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                MBridgeClickCTAView.this.d();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            q0.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public void setCtaClickCallBack(f fVar) {
    }
}
