package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {
    private LinearLayout A;
    private Runnable B;
    private Runnable C;
    private RelativeLayout D;
    private com.mbridge.msdk.video.signal.factory.b E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private AlphaAnimation K;
    private int L;
    private int M;
    private int N;
    private int O;
    private Bitmap P;
    private View Q;
    private FeedBackButton R;
    private String S;
    private CampaignUnit T;
    private MBShakeView U;
    private com.mbridge.msdk.shake.b V;
    private MBridgeBaitClickView W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f34512a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f34513b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f34514c0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f34515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewGroup f34516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout f34517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f34518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f34519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f34520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f34521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f34522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f34523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f34524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f34525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f34526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f34527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private LinearLayout f34528z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a extends com.mbridge.msdk.widget.a {
        a() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (MBridgeNativeEndCardView.this.ctaView != null) {
                if (!com.mbridge.msdk.util.b.a()) {
                    MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                } else if (MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                    MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeNativeEndCardView.this.D != null) {
                CampaignEx campaignEx = MBridgeNativeEndCardView.this.f34433b;
                if (campaignEx != null && !campaignEx.isDynamicView() && MBridgeNativeEndCardView.this.f34433b.getAdSpaceT() != 2) {
                    MBridgeNativeEndCardView.this.D.setPadding(MBridgeNativeEndCardView.this.L, MBridgeNativeEndCardView.this.N, MBridgeNativeEndCardView.this.M, MBridgeNativeEndCardView.this.O);
                    MBridgeNativeEndCardView.this.D.startAnimation(MBridgeNativeEndCardView.this.K);
                }
                MBridgeNativeEndCardView.this.D.setVisibility(0);
            }
            if (MBridgeNativeEndCardView.this.Q != null && MBridgeNativeEndCardView.this.Q.getVisibility() != 0 && MBridgeNativeEndCardView.this.G) {
                MBridgeNativeEndCardView.this.Q.setVisibility(0);
            }
            MBridgeNativeEndCardView.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements com.mbridge.msdk.foundation.feedback.a {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeNativeEndCardView.this.I = true;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeNativeEndCardView.this.I = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeNativeEndCardView.this.I = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(5);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class e extends com.mbridge.msdk.shake.b {
        e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // com.mbridge.msdk.shake.b
        public void a() {
            if ((com.mbridge.msdk.util.b.a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.I || !MBridgeNativeEndCardView.this.H) {
                return;
            }
            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
            mBridgeNativeEndCardView.f34437f = 0.0f;
            mBridgeNativeEndCardView.f34438g = 0.0f;
            mBridgeNativeEndCardView.f34433b.setTriggerClickSource(5);
            MBridgeNativeEndCardView.this.c(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.f34433b.setClickType(1);
            MBridgeNativeEndCardView.this.c(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.f34433b.setClickType(1);
            MBridgeNativeEndCardView.this.c(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.G = true;
            if (MBridgeNativeEndCardView.this.Q != null) {
                MBridgeNativeEndCardView.this.Q.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class l implements com.mbridge.msdk.foundation.feedback.a {
        l() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeNativeEndCardView.this.I = true;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeNativeEndCardView.this.I = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeNativeEndCardView.this.I = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f34541a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                if (mBridgeNativeEndCardView.f34439h) {
                    mBridgeNativeEndCardView.f34518p.setBackground(null);
                }
                q0.b("async", "执行异步加载图");
                MBridgeNativeEndCardView.this.f34518p.setImageBitmap(MBridgeNativeEndCardView.this.P);
            }
        }

        m(Bitmap bitmap) {
            this.f34541a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
            mBridgeNativeEndCardView.P = mBridgeNativeEndCardView.blurBitmap(this.f34541a);
            if (MBridgeNativeEndCardView.this.P == null || MBridgeNativeEndCardView.this.P.isRecycled() || MBridgeNativeEndCardView.this.f34518p == null) {
                return;
            }
            MBridgeNativeEndCardView.this.f34518p.post(new a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeNativeEndCardView.this.F) {
                MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(2);
                MBridgeNativeEndCardView.this.c(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeNativeEndCardView.this.f34439h) {
                try {
                    com.mbridge.msdk.video.dynview.moffer.a.a().b();
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
                try {
                    CampaignEx campaignEx = MBridgeNativeEndCardView.this.f34433b;
                    if (campaignEx != null) {
                        String strA = c1.a(campaignEx.getendcard_url(), "ecid");
                        String strA2 = c1.a(MBridgeNativeEndCardView.this.f34433b.getendcard_url(), "mof");
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("type", jyeoXJ.ooovoxAZwcoK);
                        eVar.a("endcard_id", strA);
                        eVar.a("mof", strA2);
                        com.mbridge.msdk.video.module.report.a.a("2000103", MBridgeNativeEndCardView.this.f34433b, eVar);
                    }
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        e11.printStackTrace();
                    }
                }
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a("type", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", MBridgeNativeEndCardView.this.f34433b);
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
            MBridgeNativeEndCardView.this.notifyListener.a(104, KPtaxpyICj.nyim);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class p extends com.mbridge.msdk.widget.a {
        p() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(1);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class q extends com.mbridge.msdk.widget.a {
        q() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (MBridgeNativeEndCardView.this.ctaView != null) {
                if (!com.mbridge.msdk.util.b.a()) {
                    MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                } else if (MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                    MBridgeNativeEndCardView.this.f34433b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                }
            }
        }
    }

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f34512a0 = false;
        this.f34513b0 = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerBackGroundBlurBimap(Bitmap bitmap) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new m(bitmap));
        } catch (Exception e10) {
            q0.a(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript renderScriptCreate = RenderScript.create(this.f34432a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.Q;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx == null || !campaignEx.isDynamicView() || (campaignUnit = this.T) == null || campaignUnit.getAds() == null || this.T.getAds().size() <= 0) {
            return;
        }
        ArrayList<CampaignEx> ads = this.T.getAds();
        int size = ads.size();
        int i10 = 0;
        while (i10 < size) {
            CampaignEx campaignEx2 = ads.get(i10);
            i10++;
            CampaignEx campaignEx3 = campaignEx2;
            if (!TextUtils.isEmpty(campaignEx3.getIconUrl())) {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx3.getIconUrl());
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.f34512a0;
    }

    public void notifyShowListener() {
        this.notifyListener.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B == null) {
            this.B = new i();
        }
        Runnable runnable = this.B;
        if (runnable != null) {
            postDelayed(runnable, this.J * 1000);
            if (!this.H) {
                this.H = true;
            }
            m();
        }
        e();
        g();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.C;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.V != null) {
            com.mbridge.msdk.shake.a.a().b(this.V);
            this.V = null;
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            RelativeLayout relativeLayout = this.D;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            int i10 = configuration.orientation;
            this.f34435d = i10;
            if (i10 == 2) {
                removeView(this.f34515m);
                b(this.f34516n);
            } else {
                removeView(this.f34516n);
                b(this.f34515m);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeNativeEndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.E = bVar;
        try {
            if (this.f34433b == null || !this.f34436e) {
                return;
            }
            h();
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.K;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.B = null;
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void setCloseBtnDelay(int i10) {
        this.J = i10;
    }

    public void setLayout() {
        if (this.f34439h) {
            i();
        } else {
            j();
        }
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            return;
        }
        this.T = campaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null || this.T.getAds().size() <= 5 || (mBShakeView = this.U) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, v0.a(getContext(), 5.0f));
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        q0.b(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.L = i10;
        this.M = i11;
        this.N = i12;
        this.O = i13;
        o();
    }

    public void setOnPause() {
        this.H = false;
    }

    public void setOnResume() {
        this.H = true;
    }

    public void setUnitId(String str) {
        this.S = str;
    }

    private void e() {
        int i10;
        MBridgeBaitClickView mBridgeBaitClickView;
        try {
            CampaignEx campaignEx = this.f34433b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f34433b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f34433b.getEndScreenUrl();
                }
                String strA = c1.a(endScreenUrl, "bait_click");
                try {
                    i10 = Integer.parseInt(strA);
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage());
                    i10 = 1;
                }
                if (TextUtils.isEmpty(strA) || i10 == 0 || (mBridgeBaitClickView = this.W) == null) {
                    return;
                }
                mBridgeBaitClickView.setVisibility(0);
                this.W.init(1342177280, i10);
                if (this.f34433b.getEcTemplateId() == 1302) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(1342177280);
                    gradientDrawable.setStroke(0, -65536);
                    gradientDrawable.setCornerRadius(25.0f);
                    this.W.setBackground(gradientDrawable);
                }
                this.W.startAnimation();
                b1.a(this.W, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
                this.W.setOnClickListener(new f());
            }
        } catch (Throwable th3) {
            q0.b(MBridgeBaseView.TAG, th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.S);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.S + "_2", this.f34433b);
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            FeedBackButton feedBackButton = this.R;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.S + "_2", new c());
        com.mbridge.msdk.foundation.feedback.b.b().d(this.S + "_1");
        if (this.R != null) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.S + "_2", this.R);
        }
    }

    private void g() {
        int i10;
        int i11;
        try {
            CampaignEx campaignEx = this.f34433b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f34433b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f34433b.getEndScreenUrl();
                }
                String strA = c1.a(endScreenUrl, "shake_show");
                String strA2 = c1.a(endScreenUrl, "shake_strength");
                String strA3 = c1.a(endScreenUrl, "shake_time");
                if (!TextUtils.isEmpty(strA) && strA.equals("1") && this.U == null) {
                    MBridgeBaitClickView mBridgeBaitClickView = this.W;
                    if (mBridgeBaitClickView != null) {
                        mBridgeBaitClickView.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.U = mBShakeView;
                    mBShakeView.initView(this.f34433b.getAdCall(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f34512a0, "mbridge_iv_logo"));
                        layoutParams.addRule(14);
                        this.U.setPadding(0, 0, 0, v0.a(getContext(), 20.0f));
                    }
                    this.U.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f34517o;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        this.f34517o.addView(this.U);
                        TextView textView = this.ctaView;
                        if (textView != null) {
                            textView.setVisibility(4);
                        }
                        b1.a(this.U, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
                        this.U.setOnClickListener(new d());
                        int i12 = 10;
                        if (!TextUtils.isEmpty(strA2) && (i11 = Integer.parseInt(strA2)) > 0) {
                            i12 = i11;
                        }
                        int i13 = 5000;
                        if (!TextUtils.isEmpty(strA3) && (i10 = Integer.parseInt(strA3)) > 0) {
                            i13 = i10 * 1000;
                        }
                        this.V = new e(i12, i13);
                        com.mbridge.msdk.shake.a.a().a(this.V);
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void h() {
        com.mbridge.msdk.foundation.same.image.b.a(this.f34432a.getApplicationContext()).a(this.f34433b.getImageUrl(), new k());
        com.mbridge.msdk.foundation.same.image.b.a(this.f34432a.getApplicationContext()).a(this.f34433b.getIconUrl(), new com.mbridge.msdk.video.module.listener.impl.j(this.f34520r, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
        this.f34525w.setText(this.f34433b.getAppName());
        TextView textView = this.ctaView;
        if (textView != null) {
            textView.setText(this.f34433b.getAdCall());
        }
        TextView textView2 = this.f34526x;
        if (textView2 != null) {
            textView2.setText(this.f34433b.getAppDesc());
        }
        TextView textView3 = this.f34527y;
        if (textView3 != null) {
            textView3.setText(this.f34433b.getNumberRating() + ")");
        }
        this.f34528z.removeAllViews();
        double rating = this.f34433b.getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        LinearLayout linearLayout = this.f34528z;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(rating);
        }
        LinearLayout linearLayout2 = this.f34528z;
        if (linearLayout2 instanceof MBridgeLevelLayoutView) {
            ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.f34433b.getNumberRating());
        }
        LinearLayout linearLayout3 = this.f34528z;
        if (linearLayout3 instanceof MBStarLevelLayoutView) {
            ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
        }
        LinearLayout linearLayout4 = this.A;
        if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
            ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.f34433b.getNumberRating());
        }
        if (!TextUtils.isEmpty(this.f34433b.getendcard_url()) && this.f34433b.getendcard_url().contains("alecfc=1")) {
            this.F = true;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.f34521s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            this.f34514c0 = "AD";
        } else {
            this.f34521s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            this.f34514c0 = "广告";
        }
        if (this.f34513b0 == 0) {
            ImageView imageView = this.f34521s;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            ImageView imageView2 = this.f34523u;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView4 = this.f34522t;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.f34522t.setText(this.f34514c0);
            }
        }
        v0.a(2, this.f34524v, this.f34433b, this.f34432a, true, new l());
        if (this.G) {
            return;
        }
        this.Q.setVisibility(8);
    }

    private void i() {
        com.mbridge.msdk.video.dynview.c cVarA = new com.mbridge.msdk.video.dynview.wrapper.c().a(getContext(), this.f34433b, this.f34440i, com.mbridge.msdk.util.b.a() ? "cn_" : "en_");
        this.f34513b0 = cVarA.o();
        com.mbridge.msdk.video.dynview.b.a().a(cVarA, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int iK = k();
        if (i0.a(iK)) {
            this.f34436e = b(iK);
            l();
            CampaignEx campaignEx = this.f34433b;
            if (campaignEx != null) {
                campaignEx.setECTemplateRenderSucc(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001d A[PHI: r3
      0x001d: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:20:0x002b, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    private int k() {
        int i10 = this.f34442k;
        String str = "mbridge_reward_endcard_native_land";
        String str2 = "mbridge_reward_endcard_native_hor";
        if (i10 == 0) {
            str2 = this.f34441j ? "mbridge_reward_endcard_native_half_portrait" : "mbridge_reward_endcard_native_hor";
            if (!isLandscape()) {
                str = str2;
            } else if (this.f34441j) {
                str = "mbridge_reward_endcard_native_half_landscape";
            }
        } else {
            if (i10 != 1) {
                str2 = "";
            } else if (this.f34441j) {
                str2 = "mbridge_reward_endcard_native_half_portrait";
            }
            if (i10 != 2) {
                str = str2;
            } else if (this.f34441j) {
                str = "mbridge_reward_endcard_native_half_landscape";
            }
        }
        return findLayout(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        d();
        if (!this.f34436e) {
            this.notifyListener.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.K = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void m() {
        try {
            CampaignEx campaignEx = this.f34433b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f34433b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f34433b.getEndScreenUrl();
                }
                String strA = c1.a(endScreenUrl, "alac");
                if (!TextUtils.isEmpty(strA) && strA.equals("1") && this.f34433b.getAutoShowStoreMiniCard() != 1) {
                    postDelayed(new g(), 1000L);
                }
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void n() {
        try {
            CampaignEx campaignEx = this.f34433b;
            if (campaignEx == null || campaignEx.getAutoShowStoreMiniCard() == 0 || TextUtils.isEmpty(this.f34433b.getDeepLinkURL())) {
                return;
            }
            long showStoreMiniCardDelayTime = this.f34433b.getShowStoreMiniCardDelayTime();
            if (showStoreMiniCardDelayTime == 0) {
                showStoreMiniCardDelayTime = 1;
            }
            if (this.C == null) {
                this.C = new h();
            }
            postDelayed(this.C, showStoreMiniCardDelayTime * 1000);
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void o() {
        RelativeLayout relativeLayout;
        if (!this.f34436e || (relativeLayout = this.D) == null) {
            return;
        }
        relativeLayout.postDelayed(new b(), 200L);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        if (this.f34436e) {
            b1.a(this.f34517o, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
            this.f34517o.setOnClickListener(new n());
            this.Q.setOnClickListener(new o());
            TextView textView = this.ctaView;
            if (textView != null) {
                b1.a(textView, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
                this.ctaView.setOnClickListener(new p());
            }
            b1.a(this.f34520r, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
            this.f34520r.setOnClickListener(new q());
            b1.a(this.f34519q, this.f34433b.getLocalRequestId(), this.f34433b.getLocalAllowTrackClick());
            this.f34519q.setOnClickListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        JSONException jSONException;
        JSONObject jSONObject;
        CampaignEx campaignEx = this.f34433b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = this.f34433b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "end_card_click", this.f34433b.getCampaignUnitId(), this.f34433b.isBidCampaign(), this.f34433b.getRequestId(), this.f34433b.getRequestIdNotice(), this.f34433b.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f30488j, a(i10));
                if (this.f34433b.getDynamicTempCode() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e11) {
                jSONException = e11;
                jSONException.printStackTrace();
            }
        } catch (JSONException e12) {
            jSONException = e12;
            jSONObject = null;
        }
        this.f34433b.setClickTempSource(2);
        this.notifyListener.a(105, jSONObject);
    }

    private void b(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.E);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            a(view);
            d();
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        boolean z10;
        try {
            this.f34517o = (RelativeLayout) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_native_ec_layout"));
            this.f34519q = (ImageView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_iv_adbanner"));
            this.f34520r = (ImageView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_iv_icon"));
            this.f34521s = (ImageView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_iv_flag"));
            this.f34522t = (TextView) view.findViewById(filterFindViewId(this.f34512a0, QGbBllacZSmHKn.MVvxrTo));
            this.f34523u = (ImageView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_iv_logo"));
            this.f34524v = (ImageView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_iv_link"));
            this.f34525w = (TextView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_tv_apptitle"));
            this.f34528z = (LinearLayout) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_sv_starlevel"));
            this.A = (LinearLayout) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_sv_heat_count_level"));
            this.Q = view.findViewById(filterFindViewId(this.f34512a0, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_tv_cta"));
            this.R = (FeedBackButton) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_native_endcard_feed_btn"));
            this.D = (RelativeLayout) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_native_ec_controller"));
            this.f34518p = (ImageView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_iv_adbanner_bg"));
            this.W = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f34512a0, "mbridge_animation_click_view"));
            this.f34526x = (TextView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_tv_appdesc"));
            if (this.f34439h) {
                ImageView imageView = this.f34519q;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.f34520r;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.f34519q, this.f34520r, this.f34525w, this.f34528z, this.Q, this.ctaView);
            }
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.f34512a0, "mbridge_tv_number"));
            this.f34527y = textView;
            z10 = false;
            try {
                return isNotNULL(this.f34519q, this.f34520r, this.f34525w, this.f34526x, textView, this.f34528z, this.Q, this.ctaView);
            } catch (Throwable th2) {
                th = th2;
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                return z10;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f34512a0 = false;
        this.f34513b0 = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class j implements com.mbridge.msdk.video.dynview.listener.h {
        j() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                MBridgeNativeEndCardView.this.addView(aVar.b());
                MBridgeNativeEndCardView.this.f34512a0 = aVar.c();
                if (MBridgeNativeEndCardView.this.ctaViewCanGet(aVar.b(), MBridgeNativeEndCardView.this.f34512a0)) {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView.f34436e = mBridgeNativeEndCardView.a(aVar.b());
                    MBridgeNativeEndCardView.this.l();
                } else {
                    MBridgeNativeEndCardView.this.f34512a0 = false;
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.f34439h = false;
                    mBridgeNativeEndCardView2.j();
                }
                MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                CampaignEx campaignEx = mBridgeNativeEndCardView3.f34433b;
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(mBridgeNativeEndCardView3.f34512a0);
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            q0.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.h());
        }
    }

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f34434c.inflate(i10, (ViewGroup) null);
            this.f34516n = viewGroup;
            addView(viewGroup);
            return a(this.f34516n);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f34434c.inflate(i10, (ViewGroup) null);
        this.f34515m = viewGroup2;
        addView(viewGroup2);
        return a(this.f34515m);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet, z10, i10, z11, i11, i12);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f34512a0 = false;
        this.f34513b0 = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class k implements com.mbridge.msdk.foundation.same.image.c {
        k() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (MBridgeNativeEndCardView.this.f34519q != null) {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    if (mBridgeNativeEndCardView.f34439h) {
                        mBridgeNativeEndCardView.f34519q.setBackground(null);
                    }
                    MBridgeNativeEndCardView.this.f34519q.setImageBitmap(bitmap);
                }
                MBridgeNativeEndCardView.this.setBannerBackGroundBlurBimap(bitmap);
            } catch (Throwable unused) {
                if (MBridgeNativeEndCardView.this.f34518p != null) {
                    MBridgeNativeEndCardView.this.f34518p.setVisibility(4);
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
