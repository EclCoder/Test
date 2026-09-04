package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.splash.view.nativeview.MBNoRecycledCrashImageView;
import com.mbridge.msdk.splash.view.nativeview.MBSplashClickView;
import com.mbridge.msdk.widget.FeedBackButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BaseMBSplashNativeView extends RelativeLayout {
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private boolean F;
    private boolean G;
    protected boolean H;
    protected boolean I;
    protected boolean J;
    protected String K;
    private String L;
    protected MBSplashView M;
    protected CampaignEx N;
    protected MBShakeView O;
    private String P;
    private String Q;
    private String R;
    protected com.mbridge.msdk.shake.b S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBNoRecycledCrashImageView f32806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBNoRecycledCrashImageView f32807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f32808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f32809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f32810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected TextView f32811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f32812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MBNoRecycledCrashImageView f32813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f32814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNoRecycledCrashImageView f32815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f32816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f32817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected RelativeLayout f32818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected TextView f32819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected TextView f32820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected TextView f32821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected TextView f32822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected MBSplashClickView f32823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f32824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f32825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f32826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f32828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f32829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f32830y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f32831z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.foundation.same.image.c {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaseMBSplashNativeView.this.f32813h.setVisibility(4);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            Bitmap bitmapA;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (BaseMBSplashNativeView.this.f32813h == null || (bitmapA = p0.a(bitmap, 1, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 40.0f))) == null || bitmapA.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f32813h.setImageBitmap(bitmapA);
                        return;
                    } catch (Throwable th2) {
                        q0.b("MBSplashNativeView", th2.getMessage());
                        BaseMBSplashNativeView.this.f32813h.setImageBitmap(bitmap);
                        return;
                    }
                    q0.b("MBSplashNativeView", th.getMessage());
                } catch (Throwable th3) {
                    q0.b("MBSplashNativeView", th3.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            if (baseMBSplashNativeView.H) {
                if (baseMBSplashNativeView.M.getSplashSignalCommunicationImpl() != null && BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a() != null) {
                    BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a().close();
                }
                BaseMBSplashNativeView.this.f32811f.setVisibility(4);
                BaseMBSplashNativeView.this.f32811f.setEnabled(false);
            }
        }
    }

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.I = false;
        this.J = false;
    }

    private void i() {
        if (this.f32827v == 1) {
            this.f32823r.setVisibility(8);
        } else if (this.f32829x == 1) {
            this.f32823r.setVisibility(8);
        } else {
            this.f32823r.initView(this.N.getAdCall());
        }
    }

    private void j() {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.N.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.N.getBidToken(), eVar, this.N, this.K);
        if (this.f32826u == 1) {
            b1.a(this, cVarA.t(), this.N.getLocalAllowTrackClick());
            setOnClickListener(new d());
        } else {
            b1.a(this.f32823r, cVarA.t(), this.N.getLocalAllowTrackClick());
            this.f32823r.setOnClickListener(new e());
        }
        this.f32811f.setOnClickListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownStatus(boolean z10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        this.M.getSplashSignalCommunicationImpl().a().a(z10 ? 2 : 1, this.f32825t);
    }

    protected void b() {
    }

    protected void e() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f32829x != 1 || this.O == null || this.S == null) {
                return;
            }
            com.mbridge.msdk.shake.a.a().a(this.S);
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.D = motionEvent.getRawX();
        this.E = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.S != null) {
                com.mbridge.msdk.shake.a.a().b(this.S);
                this.S = null;
            }
            com.mbridge.msdk.foundation.feedback.b.b().d(this.K);
            detachAllViewsFromParent();
        } catch (Exception e10) {
            q0.b("MBSplashNativeView", e10.getMessage());
        }
    }

    public void setIsPause(boolean z10) {
        this.I = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        try {
            RelativeLayout relativeLayout = this.f32808c;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i14 = this.C;
            layoutParams.leftMargin = i10 + i14;
            layoutParams.rightMargin = i11 + i14;
            layoutParams.topMargin = i12 + i14;
            layoutParams.bottomMargin = i14 + i13;
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    public void updateCountDown(int i10) {
        String str;
        if (this.f32811f != null) {
            this.f32825t = i10;
            if (this.H) {
                str = this.Q + " " + i10 + this.P;
            } else {
                str = i10 + this.P + " " + this.R;
            }
            this.f32811f.setText(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements com.mbridge.msdk.foundation.feedback.a {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements com.mbridge.msdk.foundation.feedback.a {
        g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    private void c() {
        try {
            this.F = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
        a();
        g();
        h();
        e();
        i();
        j();
        b();
        updateCountDown(this.f32824s);
    }

    private void d() {
        try {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.A == 1 ? i0.a(getContext().getApplicationContext(), "mbridge_splash_portrait", TtmlNode.TAG_LAYOUT) : i0.a(getContext().getApplicationContext(), "mbridge_splash_landscape", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            addView(viewInflate);
            this.f32806a = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image_bg", "id"));
            this.f32807b = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image", "id"));
            this.f32808c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_topcontroller", "id"));
            this.f32809d = (ImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_link", "id"));
            this.f32810e = (FeedBackButton) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_feedback", "id"));
            this.f32811f = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_skip", "id"));
            this.f32812g = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_landscape_foreground", "id"));
            this.f32813h = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_icon", "id"));
            this.f32814i = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_title", "id"));
            this.f32815j = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_foregroundimage", "id"));
            this.f32816k = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adrect", "id"));
            this.f32818m = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_layout_appinfo", "id"));
            this.f32819n = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_appinfo", "id"));
            this.f32820o = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_privacy", "id"));
            this.f32821p = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_permission", "id"));
            this.f32822q = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_app_desc", "id"));
            this.f32823r = (MBSplashClickView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_click", "id"));
            this.f32817l = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adcircle", "id"));
            int iA = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip", "string");
            int iA2 = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_not", "string");
            int iA3 = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_s", "string");
            this.Q = getContext().getResources().getString(iA);
            this.R = getContext().getResources().getString(iA2);
            this.P = getContext().getResources().getString(iA3);
            this.C = v0.a(getContext(), 9.0f);
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.N.getIconUrl())) {
            this.f32813h.setVisibility(4);
        } else {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.N.getIconUrl(), new b());
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.N.getImageUrl())) {
            this.f32807b.setVisibility(4);
        } else {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.N.getImageUrl(), new a());
        }
    }

    private void h() {
        Drawable drawable;
        v0.a(3, this.f32809d, this.N, getContext(), true, new c());
        try {
            drawable = getResources().getDrawable(i0.a(getContext().getApplicationContext(), "mbridge_splash_m_circle", "drawable"));
            try {
                drawable.setBounds(0, 0, v0.a(getContext(), 10.0f), v0.a(getContext(), 10.0f));
            } catch (Throwable th2) {
                th = th2;
                q0.b("MBSplashNativeView", th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            drawable = null;
        }
        if (this.A == 1 && this.G) {
            if (this.B != 0 && drawable != null) {
                this.f32817l.setCompoundDrawables(drawable, null, null, null);
            }
            this.f32817l.setText(this.F ? "广告" : "AD");
            this.f32816k.setVisibility(4);
            return;
        }
        if (this.B != 0 && drawable != null) {
            this.f32816k.setCompoundDrawables(drawable, null, null, null);
        }
        this.f32816k.setText(this.F ? "广告" : "AD");
        this.f32817l.setVisibility(4);
    }

    protected void a(int i10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        try {
            this.M.getSplashSignalCommunicationImpl().a().a(com.mbridge.msdk.splash.common.util.a.a(com.mbridge.msdk.splash.common.util.a.a(i10, this.D, this.E), this.N));
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
            this.M.getSplashSignalCommunicationImpl().a().a(this.N);
        }
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = false;
        this.J = false;
    }

    public BaseMBSplashNativeView(Context context, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar) {
        super(context);
        this.I = false;
        this.J = false;
        if (cVar != null) {
            this.K = cVar.l();
            this.L = cVar.h();
            this.N = cVar.b();
            this.M = mBSplashView;
            this.f32824s = cVar.d();
            this.f32827v = cVar.c();
            this.f32826u = cVar.f();
            this.f32828w = cVar.a();
            this.f32829x = cVar.i();
            this.f32830y = cVar.j();
            this.f32831z = cVar.k();
            this.A = cVar.g();
            this.H = cVar.m();
            this.B = cVar.e();
            d();
            c();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a() {
        CampaignEx campaignEx = this.N;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.K);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, new g());
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.f32810e);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
            return;
        }
        FeedBackButton feedBackButton = this.f32810e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.foundation.same.image.c {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        BaseMBSplashNativeView.this.G = true;
                        BaseMBSplashNativeView.this.f32812g.setVisibility(4);
                        BaseMBSplashNativeView.this.f32807b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f32807b.setImageBitmap(bitmap);
                    } else if (BaseMBSplashNativeView.this.A == 1) {
                        BaseMBSplashNativeView.this.f32812g.setVisibility(0);
                        try {
                            Bitmap bitmapA = p0.a(bitmap, 1, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f));
                            if (bitmapA != null && !bitmapA.isRecycled()) {
                                BaseMBSplashNativeView.this.f32815j.setScaleType(ImageView.ScaleType.FIT_XY);
                                BaseMBSplashNativeView.this.f32815j.setImageBitmap(bitmapA);
                            }
                        } catch (Throwable th2) {
                            try {
                                q0.b("MBSplashNativeView", th2.getMessage());
                                BaseMBSplashNativeView.this.f32815j.setImageBitmap(bitmap);
                            } catch (Throwable th3) {
                                q0.b("MBSplashNativeView", th3.getMessage());
                            }
                        }
                        BaseMBSplashNativeView.this.f32814i.setText(BaseMBSplashNativeView.this.N.getAppName());
                        BaseMBSplashNativeView.this.f();
                        try {
                            try {
                                Bitmap bitmapA2 = p0.a(bitmap);
                                if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                                    BaseMBSplashNativeView.this.f32807b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    BaseMBSplashNativeView.this.f32807b.setImageBitmap(bitmapA2);
                                }
                            } catch (Throwable th4) {
                                q0.b("MBSplashNativeView", th4.getMessage());
                            }
                        } catch (Throwable unused) {
                            BaseMBSplashNativeView.this.f32807b.setImageBitmap(bitmap);
                        }
                    } else {
                        BaseMBSplashNativeView.this.f32812g.setVisibility(4);
                        BaseMBSplashNativeView.this.f32807b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f32807b.setImageBitmap(bitmap);
                    }
                    try {
                        Bitmap bitmapA3 = p0.a(bitmap);
                        if (bitmapA3 == null || bitmapA3.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f32806a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        BaseMBSplashNativeView.this.f32806a.setImageBitmap(bitmapA3);
                        return;
                    } catch (Throwable unused2) {
                        BaseMBSplashNativeView.this.f32807b.setImageBitmap(bitmap);
                        return;
                    }
                    q0.b("MBSplashNativeView", th.getMessage());
                } catch (Throwable th5) {
                    q0.b("MBSplashNativeView", th5.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
