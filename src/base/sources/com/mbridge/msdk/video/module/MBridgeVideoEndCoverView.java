package com.mbridge.msdk.video.module;

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
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.impl.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f34553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f34554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f34555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f34556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f34557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f34558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f34559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f34560t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.notifyListener.a(104, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f34553m = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f34555o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f34556p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f34557q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f34558r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f34559s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th2) {
            q0.b("MBridgeVideoEndCoverView", th2.getMessage());
            return false;
        }
    }

    private void e() {
        ImageView imageView;
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f34555o) != null) {
                b1.a(imageView, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
                com.mbridge.msdk.foundation.same.image.b.a(this.f34432a.getApplicationContext()).a(this.f34433b.getIconUrl(), new j(this.f34555o, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
            }
            TextView textView = this.f34557q;
            if (textView != null) {
                textView.setText(this.f34433b.getAppName());
            }
            TextView textView2 = this.f34559s;
            if (textView2 != null) {
                b1.a(textView2, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
                this.f34559s.setText(this.f34433b.getAdCall());
            }
            TextView textView3 = this.f34558r;
            if (textView3 != null) {
                textView3.setText(this.f34433b.getAppDesc());
            }
        }
    }

    private void f() {
        View view = this.f34554n;
        if (view == null) {
            init(this.f34432a);
            preLoadData(this.f34560t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f34554n.getParent()).removeView(this.f34554n);
        }
        addView(this.f34554n);
        a(this.f34554n);
        d();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        this.f34556p.setOnClickListener(new a());
        this.f34555o.setOnClickListener(new b());
        this.f34559s.setOnClickListener(new c());
    }

    protected void g() {
        JSONException e10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e11;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f30486h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34437f));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f30487i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34438g));
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f30491m, 0);
                    try {
                        this.f34435d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f30489k, this.f34435d);
                    jSONObject2.put(com.mbridge.msdk.foundation.same.a.f30490l, v0.d(getContext()));
                } catch (JSONException e13) {
                    e11 = e13;
                    q0.b("MBridgeVideoEndCoverView", e11.getMessage());
                }
            } catch (JSONException e14) {
                jSONObject2 = jSONObject3;
                e11 = e14;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f30488j, jSONObject2);
            } catch (JSONException e15) {
                e10 = e15;
                e10.printStackTrace();
            }
        } catch (JSONException e16) {
            e10 = e16;
            jSONObject = null;
        }
        this.notifyListener.a(105, jSONObject);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoend_cover");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f34434c.inflate(iFindLayout, (ViewGroup) null);
            this.f34554n = viewInflate;
            if (viewInflate != null) {
                this.f34436e = a(viewInflate);
                addView(this.f34554n, -1, -1);
                d();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f34437f = motionEvent.getRawX();
        this.f34438g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f34435d = configuration.orientation;
        removeView(this.f34554n);
        f();
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f34560t = bVar;
        try {
            if (this.f34433b == null || !this.f34436e) {
                return;
            }
            e();
        } catch (Throwable th2) {
            q0.a("MBridgeVideoEndCoverView", th2.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34553m = "MBridgeVideoEndCoverView";
    }
}
